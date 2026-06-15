package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class yj extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    private Handler f21550a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(String name) {
        super(name);
        kotlin.jvm.internal.n.f(name, "name");
    }

    public static /* synthetic */ void a(yj yjVar, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        yjVar.a(runnable, j10);
    }

    public final void a() {
        this.f21550a = new Handler(getLooper());
    }

    public final void a(Runnable task) {
        kotlin.jvm.internal.n.f(task, "task");
        a(this, task, 0L, 2, null);
    }

    public final void a(Runnable task, long j10) {
        kotlin.jvm.internal.n.f(task, "task");
        Handler handler = this.f21550a;
        if (handler != null) {
            handler.postDelayed(task, j10);
        }
    }

    public final void b(Runnable task) {
        kotlin.jvm.internal.n.f(task, "task");
        Handler handler = this.f21550a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }
}
