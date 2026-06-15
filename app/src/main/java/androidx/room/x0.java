package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: TransactionExecutor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class x0 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4350a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<Runnable> f4351b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private Runnable f4352c;

    /* compiled from: TransactionExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f4353a;

        a(Runnable runnable) {
            this.f4353a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4353a.run();
            } finally {
                x0.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(Executor executor) {
        this.f4350a = executor;
    }

    synchronized void a() {
        Runnable poll = this.f4351b.poll();
        this.f4352c = poll;
        if (poll != null) {
            this.f4350a.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f4351b.offer(new a(runnable));
        if (this.f4352c == null) {
            a();
        }
    }
}
