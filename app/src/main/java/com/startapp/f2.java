package com.startapp;

import android.content.Context;
import java.io.Serializable;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f21927a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f21928b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Serializable f21929c;

    public f2(Context context, String str, Serializable serializable) {
        this.f21927a = context;
        this.f21928b = str;
        this.f21929c = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g2.a(this.f21927a, this.f21928b, this.f21929c);
    }
}
