package com.startapp;

import android.os.Build;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class y3 implements Runnable, Comparable<y3> {

    /* renamed from: a  reason: collision with root package name */
    public final l3 f23560a;

    /* renamed from: b  reason: collision with root package name */
    public final n3 f23561b;

    /* renamed from: c  reason: collision with root package name */
    public final q3 f23562c;

    /* renamed from: d  reason: collision with root package name */
    public final Exception f23563d = new Exception();

    public y3(l3 l3Var, n3 n3Var, q3 q3Var) {
        this.f23560a = l3Var;
        this.f23561b = n3Var;
        this.f23562c = q3Var;
    }

    public abstract int a() throws Exception;

    public final Throwable a(Throwable th) {
        if (Build.VERSION.SDK_INT >= 19) {
            th.addSuppressed(this.f23563d);
        }
        return th;
    }

    @Override // java.lang.Comparable
    public final int compareTo(y3 y3Var) {
        return y3Var.f23561b.f22317c - this.f23561b.f22317c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        try {
            i10 = a();
        } catch (OutOfMemoryError unused) {
            if (this.f23562c != null) {
                this.f23562c.a(this.f23560a, 0);
            }
        } catch (Throwable th) {
            try {
                if (this.f23560a.f22225a != m3.f22276f) {
                    l3.a(a(th));
                }
                q3 q3Var = this.f23562c;
                if (q3Var == null) {
                }
            } finally {
                q3 q3Var2 = this.f23562c;
                if (q3Var2 != null) {
                    q3Var2.a(this.f23560a, 0);
                }
            }
        }
    }
}
