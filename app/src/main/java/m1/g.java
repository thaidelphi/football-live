package m1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: SerialExecutor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private final Executor f27635b;

    /* renamed from: d  reason: collision with root package name */
    private volatile Runnable f27637d;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<a> f27634a = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final Object f27636c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SerialExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final g f27638a;

        /* renamed from: b  reason: collision with root package name */
        final Runnable f27639b;

        a(g gVar, Runnable runnable) {
            this.f27638a = gVar;
            this.f27639b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f27639b.run();
            } finally {
                this.f27638a.b();
            }
        }
    }

    public g(Executor executor) {
        this.f27635b = executor;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f27636c) {
            z10 = !this.f27634a.isEmpty();
        }
        return z10;
    }

    void b() {
        synchronized (this.f27636c) {
            a poll = this.f27634a.poll();
            this.f27637d = poll;
            if (poll != null) {
                this.f27635b.execute(this.f27637d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f27636c) {
            this.f27634a.add(new a(this, runnable));
            if (this.f27637d == null) {
                b();
            }
        }
    }
}
