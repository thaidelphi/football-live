package com.ironsource;

import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class bb {

    /* renamed from: a  reason: collision with root package name */
    public static final bb f16738a = new bb();

    private bb() {
    }

    private final int a(Context context, int i10) {
        int b10;
        b10 = u8.c.b(i10 / context.getResources().getDisplayMetrics().density);
        return b10;
    }

    public final int a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }

    public final int b(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }
}
