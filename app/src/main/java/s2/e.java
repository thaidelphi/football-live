package s2;

import java.util.concurrent.Executor;
/* compiled from: Executors.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f30645a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Executor f30646b = new b();

    /* compiled from: Executors.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            k.u(runnable);
        }
    }

    /* compiled from: Executors.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f30646b;
    }

    public static Executor b() {
        return f30645a;
    }
}
