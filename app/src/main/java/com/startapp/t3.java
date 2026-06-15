package com.startapp;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l3 f23373a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n3 f23374b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q3 f23375c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r3 f23376d;

    public t3(r3 r3Var, l3 l3Var, n3 n3Var) {
        this.f23376d = r3Var;
        this.f23373a = l3Var;
        this.f23374b = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        r3 r3Var = this.f23376d;
        l3 l3Var = this.f23373a;
        n3 n3Var = this.f23374b;
        q3 q3Var = this.f23375c;
        r3Var.getClass();
        try {
            i10 = r3Var.f22445a.a(l3Var, n3Var) ? 2 : 3;
            if (q3Var == null) {
                return;
            }
        } catch (Throwable unused) {
            if (q3Var == null) {
                return;
            }
            i10 = 0;
        }
        q3Var.a(l3Var, i10);
    }
}
