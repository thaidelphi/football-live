package com.iab.omid.library.adcolony.b;

import android.annotation.SuppressLint;
import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static d f15595a = new d();

    /* renamed from: b  reason: collision with root package name */
    private Context f15596b;

    private d() {
    }

    public static d a() {
        return f15595a;
    }

    public void a(Context context) {
        this.f15596b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f15596b;
    }
}
