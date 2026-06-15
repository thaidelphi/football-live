package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgp extends zzfk {
    private final Context zza;
    private zzfw zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgp(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static int zzk(String str) throws zzgo {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzgo("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzfw zzfwVar) throws zzgo {
        String host;
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = zzfwVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                identifier = zzk(pathSegments.get(0));
            } else {
                int size = pathSegments.size();
                throw new zzgo("rawresource:// URI must have exactly one path element, found " + size);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e8) {
                    throw new zzgo("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e8, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzk(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(host + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new zzgo("Resource not found.", null, 2005);
                }
            }
        } else {
            String scheme = normalizeScheme.getScheme();
            throw new zzgo("Unsupported URI scheme (" + scheme + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzgo("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e10) {
            throw new zzgo(null, e10, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws zzgo {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e8) {
                    throw new zzgo(null, e8, 2000);
                }
            }
            InputStream inputStream = this.zzd;
            int i12 = zzeh.zza;
            int read = inputStream.read(bArr, i10, i11);
            if (read == -1) {
                if (this.zze == -1) {
                    return -1;
                }
                throw new zzgo("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            long j11 = this.zze;
            if (j11 != -1) {
                this.zze = j11 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final long zzb(zzfw zzfwVar) throws zzgo {
        long j10;
        this.zzb = zzfwVar;
        zzi(zzfwVar);
        AssetFileDescriptor zzl = zzl(this.zza, zzfwVar);
        this.zzc = zzl;
        long length = zzl.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i10 != 0) {
            try {
                if (zzfwVar.zze > length) {
                    throw new zzgo(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            } catch (zzgo e8) {
                throw e8;
            } catch (IOException e10) {
                throw new zzgo(null, e10, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long skip = fileInputStream.skip(zzfwVar.zze + startOffset) - startOffset;
        if (skip == zzfwVar.zze) {
            if (i10 == 0) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.zze = -1L;
                    j10 = -1;
                } else {
                    j10 = channel.size() - channel.position();
                    this.zze = j10;
                    if (j10 < 0) {
                        throw new zzgo(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                j10 = length - skip;
                this.zze = j10;
                if (j10 < 0) {
                    throw new zzfs(AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long j11 = zzfwVar.zzf;
            if (j11 != -1) {
                if (j10 != -1) {
                    j11 = Math.min(j10, j11);
                }
                this.zze = j11;
            }
            this.zzf = true;
            zzj(zzfwVar);
            long j12 = zzfwVar.zzf;
            return j12 != -1 ? j12 : this.zze;
        }
        throw new zzgo(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Uri zzc() {
        zzfw zzfwVar = this.zzb;
        if (zzfwVar != null) {
            return zzfwVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzd() throws zzgo {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzd;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor = this.zzc;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (IOException e8) {
                    throw new zzgo(null, e8, 2000);
                }
            } catch (IOException e10) {
                throw new zzgo(null, e10, 2000);
            }
        } finally {
            this.zzc = null;
            if (this.zzf) {
                this.zzf = false;
                zzh();
            }
        }
    }
}
