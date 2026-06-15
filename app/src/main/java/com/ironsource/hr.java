package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class hr implements Runnable {
    public abstract void a() throws Exception;

    public void a(Throwable t10) {
        kotlin.jvm.internal.n.f(t10, "t");
        vt.a(t10);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Throwable th) {
            o9.d().a(th);
            try {
                a(th);
            } catch (Throwable th2) {
                o9.d().a(th2);
            }
        }
    }
}
