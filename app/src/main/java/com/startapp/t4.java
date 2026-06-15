package com.startapp;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t4<T> {

    /* renamed from: a  reason: collision with root package name */
    public volatile j2<T> f23377a;

    /* renamed from: b  reason: collision with root package name */
    public volatile T f23378b;

    public t4(j2<T> j2Var) {
        this.f23377a = j2Var;
    }

    public final T a() {
        T t10 = this.f23378b;
        if (t10 == null) {
            synchronized (this) {
                t10 = this.f23378b;
                if (t10 == null) {
                    j2<T> j2Var = this.f23377a;
                    this.f23377a = null;
                    if (j2Var != null) {
                        t10 = j2Var.call();
                        if (t10 != null) {
                            this.f23378b = t10;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return t10;
    }
}
