package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: AutoCloser.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a {

    /* renamed from: e  reason: collision with root package name */
    final long f4152e;

    /* renamed from: f  reason: collision with root package name */
    final Executor f4153f;

    /* renamed from: i  reason: collision with root package name */
    v0.g f4156i;

    /* renamed from: a  reason: collision with root package name */
    private v0.h f4148a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f4149b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    Runnable f4150c = null;

    /* renamed from: d  reason: collision with root package name */
    final Object f4151d = new Object();

    /* renamed from: g  reason: collision with root package name */
    int f4154g = 0;

    /* renamed from: h  reason: collision with root package name */
    long f4155h = SystemClock.uptimeMillis();

    /* renamed from: j  reason: collision with root package name */
    private boolean f4157j = false;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f4158k = new RunnableC0073a();

    /* renamed from: l  reason: collision with root package name */
    final Runnable f4159l = new b();

    /* compiled from: AutoCloser.java */
    /* renamed from: androidx.room.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class RunnableC0073a implements Runnable {
        RunnableC0073a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f4153f.execute(aVar.f4159l);
        }
    }

    /* compiled from: AutoCloser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this.f4151d) {
                long uptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                if (uptimeMillis - aVar.f4155h < aVar.f4152e) {
                    return;
                }
                if (aVar.f4154g != 0) {
                    return;
                }
                Runnable runnable = aVar.f4150c;
                if (runnable != null) {
                    runnable.run();
                    v0.g gVar = a.this.f4156i;
                    if (gVar != null && gVar.isOpen()) {
                        try {
                            a.this.f4156i.close();
                        } catch (IOException e8) {
                            t0.e.a(e8);
                        }
                        a.this.f4156i = null;
                    }
                    return;
                }
                throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j10, TimeUnit timeUnit, Executor executor) {
        this.f4152e = timeUnit.toMillis(j10);
        this.f4153f = executor;
    }

    public void a() throws IOException {
        synchronized (this.f4151d) {
            this.f4157j = true;
            v0.g gVar = this.f4156i;
            if (gVar != null) {
                gVar.close();
            }
            this.f4156i = null;
        }
    }

    public void b() {
        synchronized (this.f4151d) {
            int i10 = this.f4154g;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f4154g = i11;
                if (i11 == 0) {
                    if (this.f4156i == null) {
                        return;
                    }
                    this.f4149b.postDelayed(this.f4158k, this.f4152e);
                }
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
        }
    }

    public <V> V c(m.a<v0.g, V> aVar) {
        try {
            return aVar.apply(e());
        } finally {
            b();
        }
    }

    public v0.g d() {
        v0.g gVar;
        synchronized (this.f4151d) {
            gVar = this.f4156i;
        }
        return gVar;
    }

    public v0.g e() {
        synchronized (this.f4151d) {
            this.f4149b.removeCallbacks(this.f4158k);
            this.f4154g++;
            if (!this.f4157j) {
                v0.g gVar = this.f4156i;
                if (gVar != null && gVar.isOpen()) {
                    return this.f4156i;
                }
                v0.h hVar = this.f4148a;
                if (hVar != null) {
                    v0.g q02 = hVar.q0();
                    this.f4156i = q02;
                    return q02;
                }
                throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public void f(v0.h hVar) {
        if (this.f4148a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.f4148a = hVar;
        }
    }

    public boolean g() {
        return !this.f4157j;
    }

    public void h(Runnable runnable) {
        this.f4150c = runnable;
    }
}
