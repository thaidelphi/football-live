package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class g {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static g f15855b = new g();

    /* renamed from: a  reason: collision with root package name */
    private Context f15856a;

    private g() {
    }

    public static g b() {
        return f15855b;
    }

    public Context a() {
        return this.f15856a;
    }

    public void a(Context context) {
        this.f15856a = context != null ? context.getApplicationContext() : null;
    }
}
