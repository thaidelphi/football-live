package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import d9.e2;
import d9.f1;
import d9.j0;
import d9.o0;
import d9.p0;
import d9.z1;
import java.util.concurrent.ExecutionException;
/* compiled from: CoroutineWorker.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final j0 coroutineContext;
    private final androidx.work.impl.utils.futures.c<ListenableWorker.a> future;
    private final d9.z job;

    /* compiled from: CoroutineWorker.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.getFuture$work_runtime_ktx_release().isCancelled()) {
                z1.a.a(CoroutineWorker.this.getJob$work_runtime_ktx_release(), null, 1, null);
            }
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements t8.p<o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f4563a;

        /* renamed from: b  reason: collision with root package name */
        int f4564b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n<i> f4565c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f4566d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n<i> nVar, CoroutineWorker coroutineWorker, m8.d<? super b> dVar) {
            super(2, dVar);
            this.f4565c = nVar;
            this.f4566d = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            return new b(this.f4565c, this.f4566d, dVar);
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            n nVar;
            c10 = n8.d.c();
            int i10 = this.f4564b;
            if (i10 == 0) {
                i8.p.b(obj);
                n nVar2 = this.f4565c;
                CoroutineWorker coroutineWorker = this.f4566d;
                this.f4563a = nVar2;
                this.f4564b = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == c10) {
                    return c10;
                }
                nVar = nVar2;
                obj = foregroundInfo;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                nVar = (n) this.f4563a;
                i8.p.b(obj);
            }
            nVar.b(obj);
            return i8.w.f26638a;
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements t8.p<o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f4567a;

        c(m8.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            return new c(dVar);
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f4567a;
            try {
                if (i10 == 0) {
                    i8.p.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f4567a = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().o((ListenableWorker.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().p(th);
            }
            return i8.w.f26638a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        d9.z b10;
        kotlin.jvm.internal.n.f(appContext, "appContext");
        kotlin.jvm.internal.n.f(params, "params");
        b10 = e2.b(null, 1, null);
        this.job = b10;
        androidx.work.impl.utils.futures.c<ListenableWorker.a> s10 = androidx.work.impl.utils.futures.c.s();
        kotlin.jvm.internal.n.e(s10, "create()");
        this.future = s10;
        s10.addListener(new a(), getTaskExecutor().c());
        this.coroutineContext = f1.a();
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, m8.d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(m8.d<? super ListenableWorker.a> dVar);

    public j0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(m8.d<? super i> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // androidx.work.ListenableWorker
    public final b6.a<i> getForegroundInfoAsync() {
        d9.z b10;
        b10 = e2.b(null, 1, null);
        o0 a10 = p0.a(getCoroutineContext().plus(b10));
        n nVar = new n(b10, null, 2, null);
        d9.k.d(a10, null, null, new b(nVar, this, null), 3, null);
        return nVar;
    }

    public final androidx.work.impl.utils.futures.c<ListenableWorker.a> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final d9.z getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(i iVar, m8.d<? super i8.w> dVar) {
        Object obj;
        Object c10;
        m8.d b10;
        Object c11;
        b6.a<Void> foregroundAsync = setForegroundAsync(iVar);
        kotlin.jvm.internal.n.e(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                obj = foregroundAsync.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    throw e8;
                }
                throw cause;
            }
        } else {
            b10 = n8.c.b(dVar);
            d9.o oVar = new d9.o(b10, 1);
            oVar.C();
            foregroundAsync.addListener(new o(oVar, foregroundAsync), f.INSTANCE);
            obj = oVar.z();
            c11 = n8.d.c();
            if (obj == c11) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
        }
        c10 = n8.d.c();
        return obj == c10 ? obj : i8.w.f26638a;
    }

    public final Object setProgress(e eVar, m8.d<? super i8.w> dVar) {
        Object obj;
        Object c10;
        m8.d b10;
        Object c11;
        b6.a<Void> progressAsync = setProgressAsync(eVar);
        kotlin.jvm.internal.n.e(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                obj = progressAsync.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    throw e8;
                }
                throw cause;
            }
        } else {
            b10 = n8.c.b(dVar);
            d9.o oVar = new d9.o(b10, 1);
            oVar.C();
            progressAsync.addListener(new o(oVar, progressAsync), f.INSTANCE);
            obj = oVar.z();
            c11 = n8.d.c();
            if (obj == c11) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
        }
        c10 = n8.d.c();
        return obj == c10 ? obj : i8.w.f26638a;
    }

    @Override // androidx.work.ListenableWorker
    public final b6.a<ListenableWorker.a> startWork() {
        d9.k.d(p0.a(getCoroutineContext().plus(this.job)), null, null, new c(null), 3, null);
        return this.future;
    }
}
