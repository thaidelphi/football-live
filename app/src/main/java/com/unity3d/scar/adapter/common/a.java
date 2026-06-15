package com.unity3d.scar.adapter.common;
/* compiled from: DispatchGroup.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f23797a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f23798b;

    public a() {
        this.f23797a = 0;
        this.f23797a = 0;
    }

    private void d() {
        Runnable runnable;
        if (this.f23797a > 0 || (runnable = this.f23798b) == null) {
            return;
        }
        runnable.run();
    }

    public synchronized void a() {
        this.f23797a++;
    }

    public synchronized void b() {
        this.f23797a--;
        d();
    }

    public void c(Runnable runnable) {
        this.f23798b = runnable;
        d();
    }
}
