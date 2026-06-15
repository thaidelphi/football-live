package z4;

import android.content.Context;
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
/* compiled from: RawResourceDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n0 extends g {

    /* renamed from: e  reason: collision with root package name */
    private final Resources f33561e;

    /* renamed from: f  reason: collision with root package name */
    private final String f33562f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f33563g;

    /* renamed from: h  reason: collision with root package name */
    private AssetFileDescriptor f33564h;

    /* renamed from: i  reason: collision with root package name */
    private InputStream f33565i;

    /* renamed from: j  reason: collision with root package name */
    private long f33566j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f33567k;

    /* compiled from: RawResourceDataSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends m {
        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public n0(Context context) {
        super(false);
        this.f33561e = context.getResources();
        this.f33562f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // z4.i
    public int b(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f33566j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e8) {
                throw new a(null, e8, 2000);
            }
        }
        int read = ((InputStream) a5.p0.j(this.f33565i)).read(bArr, i10, i11);
        if (read == -1) {
            if (this.f33566j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f33566j;
        if (j11 != -1) {
            this.f33566j = j11 - read;
        }
        o(read);
        return read;
    }

    @Override // z4.l
    public void close() throws a {
        this.f33563g = null;
        try {
            try {
                InputStream inputStream = this.f33565i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f33565i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f33564h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f33564h = null;
                        if (this.f33567k) {
                            this.f33567k = false;
                            p();
                        }
                    }
                } catch (IOException e8) {
                    throw new a(null, e8, 2000);
                }
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        } catch (Throwable th) {
            this.f33565i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f33564h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f33564h = null;
                    if (this.f33567k) {
                        this.f33567k = false;
                        p();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new a(null, e11, 2000);
                }
            } finally {
                this.f33564h = null;
                if (this.f33567k) {
                    this.f33567k = false;
                    p();
                }
            }
        }
    }

    @Override // z4.l
    public long l(p pVar) throws a {
        int parseInt;
        String str;
        Uri uri = pVar.f33569a;
        this.f33563g = uri;
        if (!TextUtils.equals("rawresource", uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) a5.a.e(uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String str2 = (String) a5.a.e(uri.getPath());
                if (str2.startsWith("/")) {
                    str2 = str2.substring(1);
                }
                String host = uri.getHost();
                StringBuilder sb = new StringBuilder();
                if (TextUtils.isEmpty(host)) {
                    str = "";
                } else {
                    str = host + ":";
                }
                sb.append(str);
                sb.append(str2);
                parseInt = this.f33561e.getIdentifier(sb.toString(), "raw", this.f33562f);
                if (parseInt == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            } else {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) a5.a.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        }
        q(pVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f33561e.openRawResourceFd(parseInt);
            this.f33564h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f33565i = fileInputStream;
                int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i10 != 0) {
                    try {
                        if (pVar.f33575g > length) {
                            throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    } catch (a e8) {
                        throw e8;
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(pVar.f33575g + startOffset) - startOffset;
                if (skip == pVar.f33575g) {
                    if (i10 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f33566j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f33566j = size;
                            if (size < 0) {
                                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f33566j = j10;
                        if (j10 < 0) {
                            throw new m(AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j11 = pVar.f33576h;
                    if (j11 != -1) {
                        long j12 = this.f33566j;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f33566j = j11;
                    }
                    this.f33567k = true;
                    r(pVar);
                    long j13 = pVar.f33576h;
                    return j13 != -1 ? j13 : this.f33566j;
                }
                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new a("Resource is compressed: " + uri, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new a(null, e11, 2005);
        }
    }

    @Override // z4.l
    public Uri m() {
        return this.f33563g;
    }
}
