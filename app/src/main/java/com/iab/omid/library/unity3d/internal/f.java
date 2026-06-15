package com.iab.omid.library.unity3d.internal;

import android.annotation.SuppressLint;
import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static f f16117b = new f();

    /* renamed from: a  reason: collision with root package name */
    private Context f16118a;

    private f() {
    }

    public static f b() {
        return f16117b;
    }

    public Context a() {
        return this.f16118a;
    }

    public void a(Context context) {
        this.f16118a = context != null ? context.getApplicationContext() : null;
    }
}
