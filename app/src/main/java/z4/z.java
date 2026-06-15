package z4;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: FileDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class z extends g {

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f33698e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f33699f;

    /* renamed from: g  reason: collision with root package name */
    private long f33700g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f33701h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileDataSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* compiled from: FileDataSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends m {
        public b(Throwable th, int i10) {
            super(th, i10);
        }

        public b(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public z() {
        super(false);
    }

    private static RandomAccessFile s(Uri uri) throws b {
        int i10 = 2006;
        try {
            return new RandomAccessFile((String) a5.a.e(uri.getPath()), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        } catch (FileNotFoundException e8) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e8, (a5.p0.f482a < 21 || !a.b(e8.getCause())) ? 2005 : 2005);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e8, 1004);
        } catch (SecurityException e10) {
            throw new b(e10, 2006);
        } catch (RuntimeException e11) {
            throw new b(e11, 2000);
        }
    }

    @Override // z4.i
    public int b(byte[] bArr, int i10, int i11) throws b {
        if (i11 == 0) {
            return 0;
        }
        if (this.f33700g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) a5.p0.j(this.f33698e)).read(bArr, i10, (int) Math.min(this.f33700g, i11));
            if (read > 0) {
                this.f33700g -= read;
                o(read);
            }
            return read;
        } catch (IOException e8) {
            throw new b(e8, 2000);
        }
    }

    @Override // z4.l
    public void close() throws b {
        this.f33699f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f33698e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e8) {
                throw new b(e8, 2000);
            }
        } finally {
            this.f33698e = null;
            if (this.f33701h) {
                this.f33701h = false;
                p();
            }
        }
    }

    @Override // z4.l
    public long l(p pVar) throws b {
        Uri uri = pVar.f33569a;
        this.f33699f = uri;
        q(pVar);
        RandomAccessFile s10 = s(uri);
        this.f33698e = s10;
        try {
            s10.seek(pVar.f33575g);
            long j10 = pVar.f33576h;
            if (j10 == -1) {
                j10 = this.f33698e.length() - pVar.f33575g;
            }
            this.f33700g = j10;
            if (j10 >= 0) {
                this.f33701h = true;
                r(pVar);
                return this.f33700g;
            }
            throw new b(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (IOException e8) {
            throw new b(e8, 2000);
        }
    }

    @Override // z4.l
    public Uri m() {
        return this.f33699f;
    }
}
