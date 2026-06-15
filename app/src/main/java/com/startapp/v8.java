package com.startapp;

import com.startapp.y8;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y8 f23478a;

    public v8(y8 y8Var) {
        this.f23478a = y8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8 y8Var = this.f23478a;
        y8Var.getClass();
        try {
            if (y8Var.a() != null && y8Var.f23625f == null) {
                y8.b a10 = y8Var.a((Class<?>) null);
                y8Var.f23625f = a10;
                if (a10 != null) {
                    a10.a();
                }
            }
        } catch (Throwable th) {
            if (y8Var.a(1)) {
                l3.a(th);
            }
        }
    }
}
