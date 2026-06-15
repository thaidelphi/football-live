package com.startapp;

import com.startapp.hb;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f21984a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f5 f21985b;

    public g5(f5 f5Var, hb.a aVar) {
        this.f21985b = f5Var;
        this.f21984a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21985b.a(this.f21984a);
        synchronized (this.f21985b) {
            this.f21985b.f21943c = null;
        }
    }
}
