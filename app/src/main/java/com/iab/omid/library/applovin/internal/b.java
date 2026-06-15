package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b extends d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    private static b f15713d = new b();

    private b() {
    }

    public static b g() {
        return f15713d;
    }

    @Override // com.iab.omid.library.applovin.internal.d
    public void b(boolean z10) {
        for (com.iab.omid.library.applovin.adsession.a aVar : c.c().b()) {
            aVar.getAdSessionStatePublisher().a(z10);
        }
    }

    @Override // com.iab.omid.library.applovin.internal.d
    public boolean d() {
        for (com.iab.omid.library.applovin.adsession.a aVar : c.c().a()) {
            View c10 = aVar.c();
            if (c10 != null && c10.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
