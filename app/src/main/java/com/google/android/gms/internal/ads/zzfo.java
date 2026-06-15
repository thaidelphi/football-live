package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfo extends zzfk {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfo(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws zzfn {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e8) {
                    throw new zzfn(e8, 2000);
                }
            }
            FileInputStream fileInputStream = this.zzd;
            int i12 = zzeh.zza;
            int read = fileInputStream.read(bArr, i10, i11);
            if (read == -1) {
                return -1;
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
    public final long zzb(zzfw zzfwVar) throws zzfn {
        int i10;
        AssetFileDescriptor openAssetFileDescriptor;
        long j10;
        try {
            try {
                Uri normalizeScheme = zzfwVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzi(zzfwVar);
                if ("content".equals(normalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.zzd = fileInputStream;
                    int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i11 != 0 && zzfwVar.zze > length) {
                        throw new zzfn(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(zzfwVar.zze + startOffset) - startOffset;
                    if (skip == zzfwVar.zze) {
                        if (i11 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.zze = -1L;
                                j10 = -1;
                            } else {
                                j10 = size - channel.position();
                                this.zze = j10;
                                if (j10 < 0) {
                                    throw new zzfn(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                }
                            }
                        } else {
                            j10 = length - skip;
                            this.zze = j10;
                            if (j10 < 0) {
                                throw new zzfn(null, AdError.REMOTE_ADS_SERVICE_ERROR);
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
                    throw new zzfn(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                i10 = 2000;
                try {
                    throw new zzfn(new IOException("Could not open file descriptor for: " + String.valueOf(normalizeScheme)), 2000);
                } catch (IOException e8) {
                    e = e8;
                    if (true == (e instanceof FileNotFoundException)) {
                        i10 = 2005;
                    }
                    throw new zzfn(e, i10);
                }
            } catch (IOException e10) {
                e = e10;
                i10 = 2000;
            }
        } catch (zzfn e11) {
            throw e11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzd() throws zzfn {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor = this.zzc;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (IOException e8) {
                    throw new zzfn(e8, 2000);
                }
            } catch (IOException e10) {
                throw new zzfn(e10, 2000);
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
