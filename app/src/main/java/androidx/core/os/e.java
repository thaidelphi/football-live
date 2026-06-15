package androidx.core.os;

import android.os.Build;
import android.os.CancellationSignal;
/* compiled from: CancellationSignal.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2671a;

    /* renamed from: b  reason: collision with root package name */
    private b f2672b;

    /* renamed from: c  reason: collision with root package name */
    private Object f2673c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2674d;

    /* compiled from: CancellationSignal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* compiled from: CancellationSignal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a();
    }

    private void d() {
        while (this.f2674d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f2671a) {
                return;
            }
            this.f2671a = true;
            this.f2674d = true;
            b bVar = this.f2672b;
            Object obj = this.f2673c;
            if (bVar != null) {
                try {
                    bVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f2674d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                a.a(obj);
            }
            synchronized (this) {
                this.f2674d = false;
                notifyAll();
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f2671a;
        }
        return z10;
    }

    public void c(b bVar) {
        synchronized (this) {
            d();
            if (this.f2672b == bVar) {
                return;
            }
            this.f2672b = bVar;
            if (this.f2671a && bVar != null) {
                bVar.a();
            }
        }
    }
}
