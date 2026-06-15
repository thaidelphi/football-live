package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.nl;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ol extends bl implements wm {

    /* renamed from: d  reason: collision with root package name */
    private final UUID f19587d;

    /* renamed from: e  reason: collision with root package name */
    private final ml f19588e;

    /* renamed from: f  reason: collision with root package name */
    private tm f19589f;

    /* renamed from: g  reason: collision with root package name */
    private String f19590g;

    /* renamed from: h  reason: collision with root package name */
    private Placement f19591h;

    /* renamed from: i  reason: collision with root package name */
    private ql f19592i;

    /* renamed from: j  reason: collision with root package name */
    private AdapterNativeAdData f19593j;

    /* renamed from: k  reason: collision with root package name */
    private AdapterNativeAdViewBinder f19594k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ol(java.util.UUID r4, com.ironsource.ml r5) {
        /*
            r3 = this;
            java.lang.String r0 = "adId"
            kotlin.jvm.internal.n.f(r4, r0)
            java.lang.String r0 = "nativeAd"
            kotlin.jvm.internal.n.f(r5, r0)
            com.ironsource.o1 r0 = new com.ironsource.o1
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD
            com.ironsource.e2$b r2 = com.ironsource.e2.b.MEDIATION
            r0.<init>(r1, r2)
            r3.<init>(r0)
            r3.f19587d = r4
            r3.f19588e = r5
            java.lang.String r5 = ""
            r3.f19590g = r5
            com.ironsource.o1 r5 = r3.a()
            com.ironsource.ac r5 = r5.e()
            com.ironsource.o r0 = new com.ironsource.o
            java.lang.String r2 = r3.b()
            r0.<init>(r1, r4, r2)
            r5.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.ol.<init>(java.util.UUID, com.ironsource.ml):void");
    }

    public /* synthetic */ ol(UUID uuid, ml mlVar, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? lf.f18190a.a() : uuid, mlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ol this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            tm tmVar = this$0.f19589f;
            if (tmVar == null) {
                kotlin.jvm.internal.n.u("nativeAdController");
                tmVar = null;
            }
            tmVar.j();
            this$0.f19592i = null;
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ol this$0, ql qlVar) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f19592i = qlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ol this$0, LevelPlayAdError levelPlayError) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(levelPlayError, "$levelPlayError");
        ql qlVar = this$0.f19592i;
        if (qlVar != null) {
            qlVar.a(this$0.f19588e, levelPlayError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ol this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        ql qlVar = this$0.f19592i;
        if (qlVar != null) {
            qlVar.b(this$0.f19588e, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ol this$0, String placementName) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(placementName, "$placementName");
        this$0.f19590g = placementName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ol this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        tm tmVar = null;
        if (this$0.c()) {
            IronLog.INTERNAL.warning(o1.a(this$0.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            tm tmVar2 = this$0.f19589f;
            if (tmVar2 == null) {
                kotlin.jvm.internal.n.u("nativeAdController");
            } else {
                tmVar = tmVar2;
            }
            tmVar.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ol this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        ql qlVar = this$0.f19592i;
        if (qlVar != null) {
            qlVar.c(this$0.f19588e, adInfo);
        }
    }

    private final tm e() {
        this.f19591h = a().d(this.f19590g);
        UUID uuid = this.f19587d;
        String b10 = b();
        Placement placement = this.f19591h;
        if (placement == null) {
            kotlin.jvm.internal.n.u("placement");
            placement = null;
        }
        dn dnVar = new dn(uuid, b10, placement);
        a(dnVar);
        return new tm(this, a(), dnVar);
    }

    public final void a(final ql qlVar) {
        a(new Runnable() { // from class: com.ironsource.a00
            @Override // java.lang.Runnable
            public final void run() {
                ol.a(ol.this, qlVar);
            }
        });
    }

    @Override // com.ironsource.wm
    public void b(final LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        qm qmVar = new qm();
        tm tmVar = this.f19589f;
        if (tmVar == null) {
            kotlin.jvm.internal.n.u("nativeAdController");
            tmVar = null;
        }
        tmVar.a(qmVar);
        this.f19593j = qmVar.a();
        this.f19594k = qmVar.b();
        b(new Runnable() { // from class: com.ironsource.c00
            @Override // java.lang.Runnable
            public final void run() {
                ol.b(ol.this, adInfo);
            }
        });
    }

    public final void b(final String placementName) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        a(new Runnable() { // from class: com.ironsource.e00
            @Override // java.lang.Runnable
            public final void run() {
                ol.a(ol.this, placementName);
            }
        });
    }

    @Override // com.ironsource.bl
    public boolean d() {
        this.f19589f = e();
        return true;
    }

    public final void f() {
        a(new Runnable() { // from class: com.ironsource.zz
            @Override // java.lang.Runnable
            public final void run() {
                ol.a(ol.this);
            }
        });
    }

    @Override // com.ironsource.wm
    public void f(final LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.d00
            @Override // java.lang.Runnable
            public final void run() {
                ol.a(ol.this, adInfo);
            }
        });
    }

    public final UUID g() {
        return this.f19587d;
    }

    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.f19593j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.f19593j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.f19593j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final nl.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.f19593j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new nl.a(icon.getDrawable(), icon.getUri());
    }

    public final AdapterNativeAdViewBinder l() {
        return this.f19594k;
    }

    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.f19593j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new Runnable() { // from class: com.ironsource.yz
            @Override // java.lang.Runnable
            public final void run() {
                ol.b(ol.this);
            }
        });
    }

    @Override // com.ironsource.wm
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        String uuid = this.f19587d.toString();
        kotlin.jvm.internal.n.e(uuid, "adId.toString()");
        final LevelPlayAdError levelPlayAdError = new LevelPlayAdError(ironSourceError, uuid, b());
        b(new Runnable() { // from class: com.ironsource.b00
            @Override // java.lang.Runnable
            public final void run() {
                ol.a(ol.this, levelPlayAdError);
            }
        });
    }
}
