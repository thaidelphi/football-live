package z4;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: AssetDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c extends g {

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f33473e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f33474f;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f33475g;

    /* renamed from: h  reason: collision with root package name */
    private long f33476h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f33477i;

    /* compiled from: AssetDataSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends m {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public c(Context context) {
        super(false);
        this.f33473e = context.getAssets();
    }

    @Override // z4.i
    public int b(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f33476h;
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
        int read = ((InputStream) a5.p0.j(this.f33475g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f33476h;
        if (j11 != -1) {
            this.f33476h = j11 - read;
        }
        o(read);
        return read;
    }

    @Override // z4.l
    public void close() throws a {
        this.f33474f = null;
        try {
            try {
                InputStream inputStream = this.f33475g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e8) {
                throw new a(e8, 2000);
            }
        } finally {
            this.f33475g = null;
            if (this.f33477i) {
                this.f33477i = false;
                p();
            }
        }
    }

    @Override // z4.l
    public long l(p pVar) throws a {
        try {
            Uri uri = pVar.f33569a;
            this.f33474f = uri;
            String str = (String) a5.a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            q(pVar);
            InputStream open = this.f33473e.open(str, 1);
            this.f33475g = open;
            if (open.skip(pVar.f33575g) >= pVar.f33575g) {
                long j10 = pVar.f33576h;
                if (j10 != -1) {
                    this.f33476h = j10;
                } else {
                    long available = this.f33475g.available();
                    this.f33476h = available;
                    if (available == 2147483647L) {
                        this.f33476h = -1L;
                    }
                }
                this.f33477i = true;
                r(pVar);
                return this.f33476h;
            }
            throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (a e8) {
            throw e8;
        } catch (IOException e10) {
            throw new a(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // z4.l
    public Uri m() {
        return this.f33474f;
    }
}
