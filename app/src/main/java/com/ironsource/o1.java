package com.ironsource;

import com.ironsource.e2;
import com.ironsource.i7;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.td;
import com.ironsource.vt;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class o1 extends vl {

    /* renamed from: b */
    private final IronSource.AD_UNIT f19474b;

    /* renamed from: c */
    private final vt.b f19475c;

    /* renamed from: d */
    private final ac f19476d;

    /* renamed from: e */
    private final wh f19477e;

    /* renamed from: f */
    private final long f19478f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f19479a = new a();

        private a() {
        }

        public static final o1 a(IronSource.AD_UNIT adFormat, e2.b level) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            kotlin.jvm.internal.n.f(level, "level");
            return new o1(adFormat, level);
        }
    }

    public o1(IronSource.AD_UNIT adFormat, e2.b level) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(level, "level");
        this.f19477e = mm.f19249r.d().t();
        this.f19478f = TimeUnit.HOURS.toMillis(1L);
        this.f19474b = adFormat;
        this.f19476d = new ac(adFormat, level, null, null, 12, null);
        vt.b a10 = vt.a(adFormat);
        kotlin.jvm.internal.n.e(a10, "createLogFactory(adFormat)");
        this.f19475c = a10;
    }

    public o1(o1 adTools, e2.b level) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(level, "level");
        this.f19477e = mm.f19249r.d().t();
        this.f19478f = TimeUnit.HOURS.toMillis(1L);
        IronSource.AD_UNIT ad_unit = adTools.f19474b;
        this.f19474b = ad_unit;
        this.f19475c = adTools.f19475c;
        this.f19476d = new ac(ad_unit, level, adTools.f19476d.c(), null, 8, null);
    }

    public static /* synthetic */ String a(o1 o1Var, String str, String str2, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return o1Var.a(str, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
    }

    public final ISBannerSize a(LevelPlayAdSize adSize) {
        kotlin.jvm.internal.n.f(adSize, "adSize");
        return new l1().b(adSize);
    }

    public final Placement a(LevelPlay.AdFormat adFormat, String str) {
        el a10;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        if (str == null || (a10 = this.f19477e.a()) == null) {
            return null;
        }
        return a10.b(adFormat, str);
    }

    public final Placement a(String placementName) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        el a10 = this.f19477e.a();
        if (a10 != null) {
            Placement b10 = a10.b(LevelPlay.AdFormat.BANNER, placementName);
            if (b10 != null) {
                return b10;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final String a(String str, String str2) {
        String a10 = this.f19475c.a(str, str2);
        kotlin.jvm.internal.n.e(a10, "logFactory.createLogMessage(message, suffix)");
        return a10;
    }

    public final void a(Map<String, Object> data, ISBannerSize size) {
        kotlin.jvm.internal.n.f(data, "data");
        kotlin.jvm.internal.n.f(size, "size");
        com.ironsource.mediationsdk.l.a(data, size);
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        el a10 = this.f19477e.a();
        return a10 != null ? a10.b(adFormat) : this.f19478f;
    }

    public final i7.b b(String adUnitId) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        el a10 = this.f19477e.a();
        if (a10 != null) {
            return a10.a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final com.ironsource.lifecycle.b b() {
        com.ironsource.lifecycle.b d10 = com.ironsource.lifecycle.b.d();
        kotlin.jvm.internal.n.e(d10, "getInstance()");
        return d10;
    }

    public final td.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        el a10 = this.f19477e.a();
        if (a10 != null) {
            return a10.a(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final String c() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    public final String c(String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    protected final IronSource.AD_UNIT d() {
        return this.f19474b;
    }

    public final Placement d(String placementName) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        el a10 = this.f19477e.a();
        if (a10 != null) {
            Placement b10 = a10.b(LevelPlay.AdFormat.NATIVE_AD, placementName);
            if (b10 != null) {
                return b10;
            }
            throw new IllegalStateException("Error getting sdk configurations");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final ac e() {
        return this.f19476d;
    }

    public final int f() {
        return mm.f19249r.d().k().a(this.f19474b);
    }

    public final boolean g() {
        return mm.f19249r.d().t().c();
    }
}
