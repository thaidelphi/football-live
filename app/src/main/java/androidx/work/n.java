package androidx.work;

import d9.z1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: ListenableFuture.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n<R> implements b6.a<R> {

    /* renamed from: a  reason: collision with root package name */
    private final z1 f4807a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<R> f4808b;

    /* compiled from: ListenableFuture.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.l<Throwable, i8.w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n<R> f4809a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n<R> nVar) {
            super(1);
            this.f4809a = nVar;
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
            invoke2(th);
            return i8.w.f26638a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th == null) {
                if (!((n) this.f4809a).f4808b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (th instanceof CancellationException) {
                ((n) this.f4809a).f4808b.cancel(true);
            } else {
                androidx.work.impl.utils.futures.c cVar = ((n) this.f4809a).f4808b;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                cVar.p(th);
            }
        }
    }

    public n(z1 job, androidx.work.impl.utils.futures.c<R> underlying) {
        kotlin.jvm.internal.n.f(job, "job");
        kotlin.jvm.internal.n.f(underlying, "underlying");
        this.f4807a = job;
        this.f4808b = underlying;
        job.K(new a(this));
    }

    @Override // b6.a
    public void addListener(Runnable runnable, Executor executor) {
        this.f4808b.addListener(runnable, executor);
    }

    public final void b(R r10) {
        this.f4808b.o(r10);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f4808b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.f4808b.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, TimeUnit timeUnit) {
        return this.f4808b.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f4808b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f4808b.isDone();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ n(d9.z1 r1, androidx.work.impl.utils.futures.c r2, int r3, kotlin.jvm.internal.h r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            androidx.work.impl.utils.futures.c r2 = androidx.work.impl.utils.futures.c.s()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.n.e(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.n.<init>(d9.z1, androidx.work.impl.utils.futures.c, int, kotlin.jvm.internal.h):void");
    }
}
