package com.ironsource;

import android.content.Context;
import com.ironsource.e2;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.ISContainerParams;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.vt;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class l1 extends vl {

    /* renamed from: b  reason: collision with root package name */
    private final ac f18138b;

    /* renamed from: c  reason: collision with root package name */
    private final vt.b f18139c;

    /* renamed from: d  reason: collision with root package name */
    private final wh f18140d;

    public l1() {
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.f18138b = new ac(ad_unit, e2.b.MEDIATION, null, null, 12, null);
        vt.b a10 = vt.a(ad_unit);
        kotlin.jvm.internal.n.e(a10, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.f18139c = a10;
        this.f18140d = mm.f19249r.d().t();
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize b10 = b(fallbackAdSize$mediationsdk_release);
        b10.setAdaptive(true);
        b10.containerParams = new ISContainerParams(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        return b10;
    }

    public static /* synthetic */ String a(l1 l1Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return l1Var.a(str, str2);
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        return kotlin.jvm.internal.n.a(levelPlayAdSize, LevelPlayAdSize.LARGE) ? new ISBannerSize(com.ironsource.mediationsdk.l.f18871b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : kotlin.jvm.internal.n.a(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE) ? new ISBannerSize(com.ironsource.mediationsdk.l.f18872c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : kotlin.jvm.internal.n.a(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD) ? new ISBannerSize(com.ironsource.mediationsdk.l.f18874e, 0, 0) : kotlin.jvm.internal.n.a(levelPlayAdSize, LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize("BANNER", levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    private final Float c() {
        el a10 = this.f18140d.a();
        Float valueOf = a10 != null ? Float.valueOf(a10.i()) : null;
        if (valueOf == null) {
            this.f18138b.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
            return null;
        }
        return valueOf;
    }

    public final int a(int i10) {
        return com.ironsource.mediationsdk.l.a(i10);
    }

    public final String a(String str, String str2) {
        String a10 = this.f18139c.a(str, str2);
        kotlin.jvm.internal.n.e(a10, "logFactory.createLogMessage(message, suffix)");
        return a10;
    }

    public final ISBannerSize b(LevelPlayAdSize size) {
        kotlin.jvm.internal.n.f(size, "size");
        boolean isAdaptive = size.isAdaptive();
        if (isAdaptive) {
            return a(size);
        }
        if (isAdaptive) {
            throw new i8.l();
        }
        return c(size);
    }

    public final Integer b(Context context) {
        int b10;
        kotlin.jvm.internal.n.f(context, "context");
        Float c10 = c();
        if (c10 != null) {
            b10 = u8.c.b(c10.floatValue() * bb.f16738a.a(context));
            return Integer.valueOf(b10);
        }
        return null;
    }

    public final List<LevelPlayAdSize> b() {
        el a10 = this.f18140d.a();
        if (a10 != null) {
            return a10.h();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final boolean d() {
        return mm.f19249r.d().t().c();
    }
}
