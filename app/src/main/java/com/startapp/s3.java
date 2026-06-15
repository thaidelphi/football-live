package com.startapp;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class s3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l3 f22493a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22494b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f22495c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r3 f22496d;

    public s3(r3 r3Var, l3 l3Var, int i10, long j10) {
        this.f22496d = r3Var;
        this.f22493a = l3Var;
        this.f22494b = i10;
        this.f22495c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f22496d.a(this.f22494b, this.f22495c, this.f22493a);
        } catch (Throwable unused) {
        }
    }
}
