package com.ironsource;

import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.t;
import com.ironsource.td;
import com.ironsource.zp;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class el extends kr {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17249a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17249a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(kr sdkConfig) {
        super(sdkConfig);
        kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
    }

    private final boolean d(LevelPlay.AdFormat adFormat, String str) {
        Boolean a10;
        t.d b10;
        Map<String, t.d> a11;
        t.d dVar;
        boolean z10 = adFormat == LevelPlay.AdFormat.REWARDED;
        t tVar = g().a().a().get(adFormat);
        wp wpVar = null;
        wp g10 = (tVar == null || (a11 = tVar.a()) == null || (dVar = a11.get(str)) == null) ? null : dVar.g();
        if (g10 != null) {
            a10 = g10.a();
            if (a10 == null) {
                return z10;
            }
        } else {
            if (tVar != null && (b10 = tVar.b()) != null) {
                wpVar = b10.g();
            }
            if (wpVar == null || (a10 = wpVar.a()) == null) {
                return z10;
            }
        }
        return a10.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r8 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.i7.b a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "adUnitId"
            kotlin.jvm.internal.n.f(r8, r0)
            com.ironsource.sr r0 = r7.g()
            com.ironsource.t8 r0 = r0.a()
            com.ironsource.t6 r0 = r0.c()
            java.util.Map r1 = r0.a()
            java.lang.Object r1 = r1.get(r8)
            com.ironsource.t6$b r1 = (com.ironsource.t6.b) r1
            if (r1 == 0) goto L24
            java.lang.Integer r1 = r1.b()
            if (r1 == 0) goto L24
            goto L2e
        L24:
            com.ironsource.t6$b r1 = r0.b()
            java.lang.Integer r1 = r1.b()
            if (r1 == 0) goto L33
        L2e:
            int r1 = r1.intValue()
            goto L35
        L33:
            r1 = 60
        L35:
            java.util.Map r2 = r0.a()
            java.lang.Object r2 = r2.get(r8)
            com.ironsource.t6$b r2 = (com.ironsource.t6.b) r2
            r3 = 0
            if (r2 == 0) goto L49
            java.lang.Boolean r2 = r2.d()
            if (r2 == 0) goto L49
            goto L53
        L49:
            com.ironsource.t6$b r2 = r0.b()
            java.lang.Boolean r2 = r2.d()
            if (r2 == 0) goto L58
        L53:
            boolean r2 = r2.booleanValue()
            goto L5d
        L58:
            if (r1 <= 0) goto L5c
            r2 = 1
            goto L5d
        L5c:
            r2 = r3
        L5d:
            java.util.Map r4 = r0.a()
            java.lang.Object r8 = r4.get(r8)
            com.ironsource.t6$b r8 = (com.ironsource.t6.b) r8
            if (r8 == 0) goto L70
            java.lang.Boolean r8 = r8.e()
            if (r8 == 0) goto L70
            goto L7a
        L70:
            com.ironsource.t6$b r8 = r0.b()
            java.lang.Boolean r8 = r8.e()
            if (r8 == 0) goto L7f
        L7a:
            boolean r3 = r8.booleanValue()
            goto La6
        L7f:
            com.ironsource.sr r8 = r7.g()
            com.ironsource.t8 r8 = r8.a()
            com.ironsource.z3 r8 = r8.b()
            com.ironsource.x3 r8 = r8.a()
            java.util.Map r8 = r8.a()
            com.unity3d.mediation.LevelPlay$AdFormat r0 = com.unity3d.mediation.LevelPlay.AdFormat.BANNER
            java.lang.Object r8 = r8.get(r0)
            com.ironsource.q r8 = (com.ironsource.q) r8
            if (r8 == 0) goto La2
            java.lang.Boolean r8 = r8.a()
            goto La3
        La2:
            r8 = 0
        La3:
            if (r8 == 0) goto La6
            goto L7a
        La6:
            if (r3 == 0) goto Lab
            com.ironsource.i7$c r8 = com.ironsource.i7.c.TIMED_SHOW
            goto Lad
        Lab:
            com.ironsource.i7$c r8 = com.ironsource.i7.c.TIMED_LOAD
        Lad:
            com.ironsource.i7$b r0 = new com.ironsource.i7$b
            long r3 = (long) r1
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.<init>(r8, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.el.a(java.lang.String):com.ironsource.i7$b");
    }

    public final td.a a(LevelPlay.AdFormat adFormat, String adUnitId) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        return new td.a(d(adFormat, adUnitId) ? td.c.PROGRESSIVE_ON_SHOW : td.c.MANUAL);
    }

    public final u1 a(vl tools) {
        kotlin.jvm.internal.n.f(tools, "tools");
        return new u1(tools, g().a().a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        r2 = j8.y.M(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> a(com.unity3d.mediation.LevelPlay.AdFormat r2) {
        /*
            r1 = this;
            java.lang.String r0 = "adFormat"
            kotlin.jvm.internal.n.f(r2, r0)
            com.ironsource.sr r0 = r1.g()
            com.ironsource.zp r0 = r0.d()
            java.util.Map r0 = r0.a()
            java.lang.Object r2 = r0.get(r2)
            com.ironsource.zp$a r2 = (com.ironsource.zp.a) r2
            if (r2 == 0) goto L2b
            java.util.Map r2 = r2.a()
            if (r2 == 0) goto L2b
            java.util.Set r2 = r2.keySet()
            if (r2 == 0) goto L2b
            java.util.List r2 = j8.o.M(r2)
            if (r2 != 0) goto L2f
        L2b:
            java.util.List r2 = j8.o.d()
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.el.a(com.unity3d.mediation.LevelPlay$AdFormat):java.util.List");
    }

    public final boolean a(String adUnitId, LevelPlay.AdFormat adFormat) {
        Map<String, zp.b> a10;
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        zp.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (a10 = aVar.a()) == null || !a10.containsKey(adUnitId)) ? false : true;
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        t.d b10;
        Long d10;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        t tVar = g().a().a().get(adFormat);
        long longValue = (tVar == null || (b10 = tVar.b()) == null || (d10 = b10.d()) == null) ? 60L : d10.longValue();
        return longValue > 0 ? TimeUnit.MINUTES.toMillis(longValue) : longValue;
    }

    public final Placement b(LevelPlay.AdFormat adFormat, String str) {
        Placement a10;
        InterstitialPlacement a11;
        String str2;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        int i10 = a.f17249a[adFormat.ordinal()];
        if (i10 == 1) {
            yq f10 = d().c().f();
            if (f10 == null || (a10 = f10.a(str)) == null) {
                return null;
            }
            kotlin.jvm.internal.n.e(a10, "getRewardedVideoPlacement(placementName)");
            return new Placement(a10.getPlacementId(), a10.getPlacementName(), a10.isDefault(), a10.getRewardName(), a10.getRewardAmount(), a10.getPlacementAvailabilitySettings());
        } else if (i10 == 2) {
            mj d10 = d().c().d();
            if (d10 == null || (a11 = d10.a(str)) == null) {
                return null;
            }
            kotlin.jvm.internal.n.e(a11, "getInterstitialPlacement(placementName)");
            return new Placement(a11);
        } else if (i10 == 3) {
            u6 c10 = d().c().c();
            if (c10 == null) {
                throw new IllegalStateException("Error getting " + adFormat + " configurations");
            }
            h7 a12 = c10.a(str);
            if (a12 == null) {
                a12 = c10.i();
                str2 = "config.defaultBannerPlacement";
            } else {
                str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
            }
            kotlin.jvm.internal.n.e(a12, str2);
            return new Placement(a12);
        } else if (i10 == 4) {
            rm e8 = d().c().e();
            if (e8 != null && str != null) {
                cn a13 = e8.a(str);
                if (a13 == null) {
                    a13 = e8.e();
                }
                if (a13 != null) {
                    return new Placement(a13);
                }
            }
            throw new IllegalStateException("Error getting " + adFormat + " configurations");
        } else {
            throw new i8.l();
        }
    }

    public final np b(vl tools) {
        kotlin.jvm.internal.n.f(tools, "tools");
        return new np(tools, g().a().a());
    }

    public final iq c(vl tools) {
        kotlin.jvm.internal.n.f(tools, "tools");
        t tVar = g().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new iq(tools, tVar != null ? tVar.a() : null, tVar != null ? tVar.c() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        r4 = j8.y.r(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ironsource.zn> c(com.unity3d.mediation.LevelPlay.AdFormat r4) {
        /*
            r3 = this;
            java.lang.String r0 = "adFormat"
            kotlin.jvm.internal.n.f(r4, r0)
            com.ironsource.sr r0 = r3.g()
            com.ironsource.zp r0 = r0.d()
            java.util.Map r0 = r0.a()
            java.lang.Object r0 = r0.get(r4)
            com.ironsource.zp$a r0 = (com.ironsource.zp.a) r0
            if (r0 == 0) goto L55
            java.util.Map r0 = r0.a()
            if (r0 == 0) goto L55
            java.util.Set r0 = r0.keySet()
            if (r0 == 0) goto L55
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = j8.o.k(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r2 = r3.c(r4, r2)
            r1.add(r2)
            goto L34
        L48:
            java.util.List r4 = j8.o.l(r1)
            if (r4 == 0) goto L55
            java.util.List r4 = j8.o.r(r4)
            if (r4 == 0) goto L55
            goto L59
        L55:
            java.util.List r4 = j8.o.d()
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.el.c(com.unity3d.mediation.LevelPlay$AdFormat):java.util.List");
    }

    public final List<zn> c(LevelPlay.AdFormat adFormat, String adUnitId) {
        List<zn> d10;
        Map<String, zp.b> a10;
        zp.b bVar;
        List<String> a11;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        zp.a aVar = g().d().a().get(adFormat);
        if (aVar == null || (a10 = aVar.a()) == null || (bVar = a10.get(adUnitId)) == null || (a11 = bVar.a()) == null) {
            d10 = j8.q.d();
            return d10;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a11) {
            zn znVar = g().e().a().get(str);
            if (znVar != null) {
                arrayList.add(znVar);
            }
        }
        return arrayList;
    }

    public final List<LevelPlayAdSize> h() {
        int k10;
        List<String> a10 = g().a().c().b().a();
        k10 = j8.r.k(a10, 10);
        ArrayList arrayList = new ArrayList(k10);
        for (String str : a10) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str));
        }
        return arrayList;
    }

    public final float i() {
        return g().a().c().b().c();
    }

    public final boolean j() {
        g1 a10 = d().c().a();
        return a10 != null && a10.a();
    }

    public final boolean k() {
        return g().a().b().d();
    }
}
