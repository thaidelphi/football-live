package com.startapp;

import com.startapp.y8;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class w8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y8 f23519a;

    public w8(y8 y8Var) {
        this.f23519a = y8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8 y8Var = this.f23519a;
        y8Var.getClass();
        try {
            y8.b bVar = y8Var.f23625f;
            if (bVar != null) {
                bVar.b();
                y8Var.f23625f = null;
            }
        } catch (Throwable th) {
            if (y8Var.a(4)) {
                l3.a(th);
            }
        }
    }
}
