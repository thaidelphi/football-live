package com.applovin.impl;

import com.applovin.impl.u5;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b6 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final WeakReference f6706g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f6707h;

    protected b6(j4 j4Var, Object obj, String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
        this.f6706g = new WeakReference(j4Var);
        this.f6707h = obj;
    }

    public static void a(long j10, j4 j4Var, Object obj, String str, com.applovin.impl.sdk.j jVar) {
        if (j10 <= 0) {
            return;
        }
        jVar.i0().a(new b6(j4Var, obj, str, jVar), u5.b.TIMEOUT, j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        j4 j4Var = (j4) this.f6706g.get();
        if (j4Var == null || j4Var.c()) {
            return;
        }
        this.f9827a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f9827a.I();
            String str = this.f9828b;
            I.d(str, "Attempting to timeout pending task " + j4Var.b() + " with " + this.f6707h);
        }
        j4Var.a(this.f6707h);
    }
}
