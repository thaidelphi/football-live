package z4;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import z4.f;
/* compiled from: BandwidthMeter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface f {

    /* compiled from: BandwidthMeter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {

        /* compiled from: BandwidthMeter.java */
        /* renamed from: z4.f$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class C0397a {

            /* renamed from: a  reason: collision with root package name */
            private final CopyOnWriteArrayList<C0398a> f33489a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* compiled from: BandwidthMeter.java */
            /* renamed from: z4.f$a$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
            public static final class C0398a {

                /* renamed from: a  reason: collision with root package name */
                private final Handler f33490a;

                /* renamed from: b  reason: collision with root package name */
                private final a f33491b;

                /* renamed from: c  reason: collision with root package name */
                private boolean f33492c;

                public C0398a(Handler handler, a aVar) {
                    this.f33490a = handler;
                    this.f33491b = aVar;
                }

                public void d() {
                    this.f33492c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void d(C0398a c0398a, int i10, long j10, long j11) {
                c0398a.f33491b.H(i10, j10, j11);
            }

            public void b(Handler handler, a aVar) {
                a5.a.e(handler);
                a5.a.e(aVar);
                e(aVar);
                this.f33489a.add(new C0398a(handler, aVar));
            }

            public void c(final int i10, final long j10, final long j11) {
                Iterator<C0398a> it = this.f33489a.iterator();
                while (it.hasNext()) {
                    final C0398a next = it.next();
                    if (!next.f33492c) {
                        next.f33490a.post(new Runnable() { // from class: z4.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.a.C0397a.d(f.a.C0397a.C0398a.this, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C0398a> it = this.f33489a.iterator();
                while (it.hasNext()) {
                    C0398a next = it.next();
                    if (next.f33491b == aVar) {
                        next.d();
                        this.f33489a.remove(next);
                    }
                }
            }
        }

        void H(int i10, long j10, long j11);
    }

    long a();

    void b(Handler handler, a aVar);

    s0 d();

    long f();
}
