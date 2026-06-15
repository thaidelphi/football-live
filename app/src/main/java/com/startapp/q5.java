package com.startapp;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q5 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22414a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f22415b;

    public q5(Context context) {
        Context a10 = f0.a(context);
        this.f22414a = a10 != null ? a10 : context;
        this.f22415b = new ArrayList();
    }

    public final boolean a() {
        return this.f22415b.contains("calendar") && Build.VERSION.SDK_INT >= 14 && y.a(this.f22414a, "android.permission.WRITE_CALENDAR");
    }
}
