package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
/* compiled from: DeviceProfileWriter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f3738a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3739b;

    /* renamed from: c  reason: collision with root package name */
    private final h.c f3740c;

    /* renamed from: e  reason: collision with root package name */
    private final File f3742e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3743f;

    /* renamed from: g  reason: collision with root package name */
    private final String f3744g;

    /* renamed from: h  reason: collision with root package name */
    private final String f3745h;

    /* renamed from: j  reason: collision with root package name */
    private d[] f3747j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f3748k;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3746i = false;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f3741d = d();

    public c(AssetManager assetManager, Executor executor, h.c cVar, String str, String str2, String str3, File file) {
        this.f3738a = assetManager;
        this.f3739b = executor;
        this.f3740c = cVar;
        this.f3743f = str;
        this.f3744g = str2;
        this.f3745h = str3;
        this.f3742e = file;
    }

    private c b(d[] dVarArr, byte[] bArr) {
        InputStream h10;
        try {
            h10 = h(this.f3738a, this.f3745h);
        } catch (FileNotFoundException e8) {
            this.f3740c.a(9, e8);
        } catch (IOException e10) {
            this.f3740c.a(7, e10);
        } catch (IllegalStateException e11) {
            this.f3747j = null;
            this.f3740c.a(8, e11);
        }
        if (h10 == null) {
            if (h10 != null) {
                h10.close();
            }
            return null;
        }
        try {
            this.f3747j = m.q(h10, m.o(h10, m.f3776b), bArr, dVarArr);
            h10.close();
            return this;
        } catch (Throwable th) {
            try {
                h10.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.f3746i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 33) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return o.f3791e;
            case 26:
                return o.f3790d;
            case 27:
                return o.f3789c;
            case 28:
            case 29:
            case 30:
                return o.f3788b;
            case 31:
            case 32:
            case 33:
                return o.f3787a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f3744g);
        } catch (FileNotFoundException e8) {
            this.f3740c.a(6, e8);
            return null;
        } catch (IOException e10) {
            this.f3740c.a(7, e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f3740c.a(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e8) {
            String message = e8.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f3740c.b(5, null);
            return null;
        }
    }

    private d[] j(InputStream inputStream) {
        try {
        } catch (IOException e8) {
            this.f3740c.a(7, e8);
        }
        try {
            try {
                d[] w10 = m.w(inputStream, m.o(inputStream, m.f3775a), this.f3743f);
                try {
                    inputStream.close();
                    return w10;
                } catch (IOException e10) {
                    this.f3740c.a(7, e10);
                    return w10;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    this.f3740c.a(7, e11);
                }
                throw th;
            }
        } catch (IOException e12) {
            this.f3740c.a(7, e12);
            inputStream.close();
            return null;
        } catch (IllegalStateException e13) {
            this.f3740c.a(8, e13);
            inputStream.close();
            return null;
        }
    }

    private static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 33) {
            return false;
        }
        if (i10 != 24 && i10 != 25) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(final int i10, final Object obj) {
        this.f3739b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.g(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f3741d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.f3742e.canWrite()) {
            l(4, null);
            return false;
        } else {
            this.f3746i = true;
            return true;
        }
    }

    public c i() {
        c b10;
        c();
        if (this.f3741d == null) {
            return this;
        }
        InputStream f10 = f(this.f3738a);
        if (f10 != null) {
            this.f3747j = j(f10);
        }
        d[] dVarArr = this.f3747j;
        return (dVarArr == null || !k() || (b10 = b(dVarArr, this.f3741d)) == null) ? this : b10;
    }

    public c m() {
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f3747j;
        byte[] bArr = this.f3741d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    m.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e8) {
                this.f3740c.a(7, e8);
            } catch (IllegalStateException e10) {
                this.f3740c.a(8, e10);
            }
            if (!m.B(byteArrayOutputStream, bArr, dVarArr)) {
                this.f3740c.a(5, null);
                this.f3747j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f3748k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f3747j = null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [byte[], androidx.profileinstaller.d[]] */
    public boolean n() {
        byte[] bArr = this.f3748k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f3742e);
                    e.l(byteArrayInputStream, fileOutputStream);
                    l(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e8) {
                l(6, e8);
                return false;
            } catch (IOException e10) {
                l(7, e10);
                return false;
            }
        } finally {
            this.f3748k = null;
            this.f3747j = null;
        }
    }
}
