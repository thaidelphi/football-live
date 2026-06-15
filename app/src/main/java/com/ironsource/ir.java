package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ir extends ScheduledThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    private final t8.l<Throwable, i8.w> f17853a;

    /* renamed from: b  reason: collision with root package name */
    private final t8.l<String, i8.w> f17854b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a extends kotlin.jvm.internal.o implements t8.l<Throwable, i8.w> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17855a = new a();

        a() {
            super(1);
        }

        public final void a(Throwable th) {
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
            a(th);
            return i8.w.f26638a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b extends kotlin.jvm.internal.o implements t8.l<String, i8.w> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17856a = new b();

        b() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.n.f(it, "it");
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ i8.w invoke(String str) {
            a(str);
            return i8.w.f26638a;
        }
    }

    public ir() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ir(int i10, t8.l<? super Throwable, i8.w> report, t8.l<? super String, i8.w> log) {
        super(i10, new jk());
        kotlin.jvm.internal.n.f(report, "report");
        kotlin.jvm.internal.n.f(log, "log");
        this.f17853a = report;
        this.f17854b = log;
    }

    public /* synthetic */ ir(int i10, t8.l lVar, t8.l lVar2, int i11, kotlin.jvm.internal.h hVar) {
        this((i11 & 1) != 0 ? jr.f17984a : i10, (i11 & 2) != 0 ? a.f17855a : lVar, (i11 & 4) != 0 ? b.f17856a : lVar2);
    }

    private final String a(String str) {
        return ir.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        t8.l<Throwable, i8.w> lVar;
        Throwable e8;
        super.afterExecute(runnable, th);
        if (th != null) {
            this.f17854b.invoke(a(th.toString()));
            this.f17853a.invoke(th);
        } else if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e10) {
                o9.d().a(e10);
                this.f17854b.invoke(a(e10.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e11) {
                e8 = e11;
                o9.d().a(e8);
                this.f17854b.invoke(a(e8.toString()));
                lVar = this.f17853a;
                lVar.invoke(e8);
            } catch (ExecutionException e12) {
                o9.d().a(e12);
                this.f17854b.invoke(a(e12.toString()));
                lVar = this.f17853a;
                e8 = e12.getCause();
                lVar.invoke(e8);
            }
        }
    }
}
