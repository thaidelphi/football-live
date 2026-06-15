package com.startapp;

import android.content.Context;
import android.content.Intent;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent[] f22293a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f22294b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f22295c;

    public m9(Intent[] intentArr, Context context, String str) {
        this.f22293a = intentArr;
        this.f22294b = context;
        this.f22295c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22293a[0] = o9.a(this.f22294b, this.f22295c);
        synchronized (this.f22293a) {
            this.f22293a.notifyAll();
        }
    }
}
