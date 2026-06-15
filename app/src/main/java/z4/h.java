package z4;

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
/* compiled from: ContentDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h extends g {

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f33501e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f33502f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f33503g;

    /* renamed from: h  reason: collision with root package name */
    private FileInputStream f33504h;

    /* renamed from: i  reason: collision with root package name */
    private long f33505i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f33506j;

    /* compiled from: ContentDataSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends m {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public h(Context context) {
        super(false);
        this.f33501e = context.getContentResolver();
    }

    @Override // z4.i
    public int b(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f33505i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e8) {
                throw new a(e8, 2000);
            }
        }
        int read = ((FileInputStream) a5.p0.j(this.f33504h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f33505i;
        if (j11 != -1) {
            this.f33505i = j11 - read;
        }
        o(read);
        return read;
    }

    @Override // z4.l
    public void close() throws a {
        this.f33502f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f33504h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f33504h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f33503g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f33503g = null;
                        if (this.f33506j) {
                            this.f33506j = false;
                            p();
                        }
                    }
                } catch (IOException e8) {
                    throw new a(e8, 2000);
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } catch (Throwable th) {
            this.f33504h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f33503g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f33503g = null;
                    if (this.f33506j) {
                        this.f33506j = false;
                        p();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new a(e11, 2000);
                }
            } finally {
                this.f33503g = null;
                if (this.f33506j) {
                    this.f33506j = false;
                    p();
                }
            }
        }
    }

    @Override // z4.l
    public long l(p pVar) throws a {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = pVar.f33569a;
            this.f33502f = uri;
            q(pVar);
            if ("content".equals(pVar.f33569a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f33501e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f33501e.openAssetFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            }
            this.f33503g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f33504h = fileInputStream;
                int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i10 != 0 && pVar.f33575g > length) {
                    throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(pVar.f33575g + startOffset) - startOffset;
                if (skip == pVar.f33575g) {
                    if (i10 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f33505i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f33505i = position;
                            if (position < 0) {
                                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f33505i = j10;
                        if (j10 < 0) {
                            throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j11 = pVar.f33576h;
                    if (j11 != -1) {
                        long j12 = this.f33505i;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f33505i = j11;
                    }
                    this.f33506j = true;
                    r(pVar);
                    long j13 = pVar.f33576h;
                    return j13 != -1 ? j13 : this.f33505i;
                }
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (a e8) {
            throw e8;
        } catch (IOException e10) {
            throw new a(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // z4.l
    public Uri m() {
        return this.f33502f;
    }
}
