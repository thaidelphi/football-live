package com.startapp;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l3 f23433a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n3 f23434b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q3 f23435c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r3 f23436d;

    public u3(r3 r3Var, l3 l3Var, n3 n3Var) {
        this.f23436d = r3Var;
        this.f23433a = l3Var;
        this.f23434b = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var = this.f23436d;
        l3 l3Var = this.f23433a;
        n3 n3Var = this.f23434b;
        q3 q3Var = this.f23435c;
        y3 a10 = r3Var.f22450f.a(l3Var, n3Var, q3Var);
        if (a10 != null) {
            r3Var.f22447c.execute(a10);
        } else if (q3Var != null) {
            q3Var.a(l3Var, 0);
        }
    }
}
