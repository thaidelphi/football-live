package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static g f15726b = new g();

    /* renamed from: a  reason: collision with root package name */
    private Context f15727a;

    private g() {
    }

    public static g b() {
        return f15726b;
    }

    public Context a() {
        return this.f15727a;
    }

    public void a(Context context) {
        this.f15727a = context != null ? context.getApplicationContext() : null;
    }
}
