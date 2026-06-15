package b3;

import java.util.concurrent.Executor;
/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k implements d3.b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final k f5063a = new k();
    }

    public static k a() {
        return a.f5063a;
    }

    public static Executor b() {
        return (Executor) d3.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h8.a
    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
