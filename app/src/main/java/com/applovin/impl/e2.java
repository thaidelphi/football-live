package com.applovin.impl;

import com.applovin.impl.u5;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class e2 {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6866a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.j jVar) {
        if (f6866a) {
            return;
        }
        jVar.D().a(y1.f9677l0, "no_ads_loaded");
    }

    public static void b(final com.applovin.impl.sdk.j jVar) {
        Long l10 = (Long) jVar.a(j3.C7);
        if (l10.longValue() <= 0) {
            return;
        }
        jVar.i0().a(new k6(jVar, true, "submitIntegrationErrorReport", new Runnable() { // from class: com.applovin.impl.da
            @Override // java.lang.Runnable
            public final void run() {
                e2.a(com.applovin.impl.sdk.j.this);
            }
        }), u5.b.OTHER, TimeUnit.SECONDS.toMillis(l10.longValue()));
    }

    public static void a() {
        f6866a = true;
    }
}
