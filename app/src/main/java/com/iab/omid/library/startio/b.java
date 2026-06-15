package com.iab.omid.library.startio;

import android.content.Context;
import com.iab.omid.library.startio.internal.f;
import com.iab.omid.library.startio.internal.h;
import com.iab.omid.library.startio.utils.e;
import com.iab.omid.library.startio.utils.g;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f15959a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.4.7-Startio";
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        h.c().a(context);
        com.iab.omid.library.startio.internal.b.g().a(context);
        com.iab.omid.library.startio.utils.a.a(context);
        com.iab.omid.library.startio.utils.c.a(context);
        e.a(context);
        f.b().a(context);
        com.iab.omid.library.startio.internal.a.a().a(context);
    }

    public void a(boolean z10) {
        this.f15959a = z10;
    }

    public boolean b() {
        return this.f15959a;
    }

    public void c() {
        g.a();
        com.iab.omid.library.startio.internal.a.a().d();
    }
}
