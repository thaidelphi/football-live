package com.startapp;

import android.telephony.SignalStrength;
import com.startapp.y8;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y8 f23555a;

    public x8(y8 y8Var) {
        this.f23555a = y8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8.b a10;
        y8 y8Var = this.f23555a;
        y8Var.getClass();
        try {
            if (y8Var.a() == null || (a10 = y8Var.a(SignalStrength.class)) == null) {
                return;
            }
            a10.a();
        } catch (Throwable th) {
            if (y8Var.a(8)) {
                l3.a(th);
            }
        }
    }
}
