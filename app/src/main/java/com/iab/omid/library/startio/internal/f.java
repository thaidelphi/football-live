package com.iab.omid.library.startio.internal;

import android.annotation.SuppressLint;
import android.content.Context;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static f f15989b = new f();

    /* renamed from: a  reason: collision with root package name */
    private Context f15990a;

    private f() {
    }

    public static f b() {
        return f15989b;
    }

    public Context a() {
        return this.f15990a;
    }

    public void a(Context context) {
        this.f15990a = context != null ? context.getApplicationContext() : null;
    }
}
