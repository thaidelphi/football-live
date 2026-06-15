package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class bc extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    private Handler f16739a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(String name) {
        super(name);
        kotlin.jvm.internal.n.f(name, "name");
    }

    public final void a() {
        this.f16739a = new Handler(getLooper());
    }

    public final void a(Runnable task) {
        kotlin.jvm.internal.n.f(task, "task");
        Handler handler = this.f16739a;
        if (handler != null) {
            handler.post(task);
        }
    }
}
