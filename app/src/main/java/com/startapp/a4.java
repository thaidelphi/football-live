package com.startapp;

import com.ironsource.in;
import com.startapp.sdk.common.SDKException;
import java.util.HashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a4 extends y3 {

    /* renamed from: e  reason: collision with root package name */
    public final t4<b3> f21755e;

    /* renamed from: f  reason: collision with root package name */
    public final t4<h7> f21756f;

    public a4(t4<b3> t4Var, t4<h7> t4Var2, l3 l3Var, n3 n3Var, q3 q3Var) {
        super(l3Var, n3Var, q3Var);
        this.f21755e = t4Var;
        this.f21756f = t4Var2;
    }

    @Override // com.startapp.y3
    public final int a() throws Exception {
        String str = this.f23560a.f22229e;
        if (str == null) {
            return 3;
        }
        b3 a10 = this.f21755e.a();
        h9 h9Var = new h9();
        h9Var.J = this.f21756f.a().a(h9Var);
        String a11 = h9Var.a(str);
        e3 e3Var = null;
        try {
            HashMap a12 = a10.a();
            long currentTimeMillis = System.currentTimeMillis();
            long a13 = o9.a();
            t4<d6> t4Var = a10.f21790d;
            g6 g6Var = t4Var != null ? new g6(t4Var.a()) : null;
            try {
                e3 a14 = b3.a(a12, a11);
                if (g6Var != null) {
                    g6Var.a(in.f17848a, a11, null);
                }
                a14.f21906e = currentTimeMillis;
                a14.f21907f = a13;
                a14.f21908g = o9.a();
                e3Var = a14;
            } catch (SDKException e8) {
                if (g6Var != null) {
                    g6Var.a(in.f17848a, a11, e8);
                }
            }
        } catch (Throwable th) {
            if (a10.a(1)) {
                l3.a(th);
            }
        }
        return e3Var != null ? 1 : 0;
    }
}
