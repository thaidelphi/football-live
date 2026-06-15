package a2;

import a2.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import u1.a;
/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e implements a {

    /* renamed from: b  reason: collision with root package name */
    private final File f210b;

    /* renamed from: c  reason: collision with root package name */
    private final long f211c;

    /* renamed from: e  reason: collision with root package name */
    private u1.a f213e;

    /* renamed from: d  reason: collision with root package name */
    private final c f212d = new c();

    /* renamed from: a  reason: collision with root package name */
    private final j f209a = new j();

    @Deprecated
    protected e(File file, long j10) {
        this.f210b = file;
        this.f211c = j10;
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized u1.a d() throws IOException {
        if (this.f213e == null) {
            this.f213e = u1.a.n0(this.f210b, 1, 1, this.f211c);
        }
        return this.f213e;
    }

    @Override // a2.a
    public void a(w1.f fVar, a.b bVar) {
        u1.a d10;
        String b10 = this.f209a.b(fVar);
        this.f212d.a(b10);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b10 + " for for Key: " + fVar);
            }
            try {
                d10 = d();
            } catch (IOException e8) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e8);
                }
            }
            if (d10.S(b10) != null) {
                return;
            }
            a.c L = d10.L(b10);
            if (L != null) {
                try {
                    if (bVar.a(L.f(0))) {
                        L.e();
                    }
                    L.b();
                    return;
                } catch (Throwable th) {
                    L.b();
                    throw th;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + b10);
        } finally {
            this.f212d.b(b10);
        }
    }

    @Override // a2.a
    public File b(w1.f fVar) {
        String b10 = this.f209a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b10 + " for for Key: " + fVar);
        }
        try {
            a.e S = d().S(b10);
            if (S != null) {
                return S.a(0);
            }
            return null;
        } catch (IOException e8) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e8);
                return null;
            }
            return null;
        }
    }
}
