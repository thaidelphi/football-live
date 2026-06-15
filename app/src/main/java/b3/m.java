package b3;

import java.util.concurrent.Executor;
/* compiled from: SafeLoggingExecutor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class m implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5065a;

    /* compiled from: SafeLoggingExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f5066a;

        a(Runnable runnable) {
            this.f5066a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5066a.run();
            } catch (Exception e8) {
                f3.a.d("Executor", "Background execution failure.", e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Executor executor) {
        this.f5065a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5065a.execute(new a(runnable));
    }
}
