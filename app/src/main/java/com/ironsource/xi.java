package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class xi {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f21401a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f21402a;

        a(Runnable runnable) {
            this.f21402a = runnable;
        }

        @Override // com.ironsource.hr
        public void a() {
            this.f21402a.run();
        }
    }

    public xi() {
        this(null, 1, null);
    }

    public xi(Handler handler) {
        kotlin.jvm.internal.n.f(handler, "handler");
        this.f21401a = handler;
    }

    public /* synthetic */ xi(Handler handler, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public static /* synthetic */ void a(xi xiVar, hr hrVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        xiVar.a(hrVar, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.ironsource.hr] */
    private final void c(Runnable runnable) {
        a aVar = runnable instanceof hr ? (hr) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.f21401a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    public final Handler a() {
        return this.f21401a;
    }

    public final void a(hr task) {
        kotlin.jvm.internal.n.f(task, "task");
        this.f21401a.removeCallbacks(task);
    }

    public final void a(hr task, long j10) {
        kotlin.jvm.internal.n.f(task, "task");
        this.f21401a.postDelayed(task, j10);
    }

    public final void a(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        c(callback);
    }

    public final void b(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        c(runnable);
    }
}
