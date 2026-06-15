package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.data.manager.ScarManager;
import i8.w;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: LoadScarAd.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LoadScarAd {
    private final ScarManager scarManager;

    public LoadScarAd(ScarManager scarManager) {
        n.f(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    public final Object invoke(String str, String str2, String str3, String str4, String str5, int i10, d<? super w> dVar) {
        Object c10;
        if (n.a(str, "banner")) {
            return w.f26638a;
        }
        Object loadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i10, dVar);
        c10 = n8.d.c();
        return loadAd == c10 ? loadAd : w.f26638a;
    }
}
