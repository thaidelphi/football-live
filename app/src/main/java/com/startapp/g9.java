package com.startapp;

import com.ironsource.in;
import com.startapp.sdk.common.SDKException;
import java.util.HashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g9 implements Runnable, h2<Throwable, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final t4<h7> f21988a;

    /* renamed from: b  reason: collision with root package name */
    public final t4<b3> f21989b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21990c;

    /* renamed from: d  reason: collision with root package name */
    public final i2<String, e3, Throwable, Void> f21991d;

    /* renamed from: e  reason: collision with root package name */
    public e3 f21992e;

    /* renamed from: f  reason: collision with root package name */
    public Throwable f21993f;

    public g9(t4 t4Var, t4 t4Var2, String str, k3 k3Var) {
        this.f21988a = t4Var;
        this.f21989b = t4Var2;
        this.f21990c = str;
        this.f21991d = k3Var;
    }

    @Override // com.startapp.h2
    public final Void a(Throwable th) {
        this.f21993f = th;
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b3 a10 = this.f21989b.a();
            String str = this.f21990c;
            h9 h9Var = new h9();
            h9Var.J = this.f21988a.a().a(h9Var);
            String a11 = h9Var.a(str);
            e3 e3Var = null;
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
                try {
                    a(e8);
                } catch (Throwable th) {
                    if (a10.a(32)) {
                        l3.a(th);
                    }
                }
            }
            this.f21992e = e3Var;
            i2<String, e3, Throwable, Void> i2Var = this.f21991d;
            if (i2Var != null) {
                i2Var.a(this.f21990c, e3Var, this.f21993f);
            }
        } catch (Throwable th2) {
            try {
                this.f21993f = th2;
                l3.a(th2);
            } finally {
                i2<String, e3, Throwable, Void> i2Var2 = this.f21991d;
                if (i2Var2 != null) {
                    i2Var2.a(this.f21990c, this.f21992e, this.f21993f);
                }
            }
        }
    }
}
