package com.startapp.sdk.adsbase.model;

import android.content.Context;
import com.startapp.c0;
import com.startapp.c8;
import com.startapp.d8;
import com.startapp.f;
import com.startapp.o9;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.a;
import com.startapp.u0;
import com.startapp.v1;
import com.startapp.w6;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GetAdRequest extends u0 {
    public Integer A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public Set<String> F0;
    public Set<String> G0;
    public Set<String> H0;
    public Set<String> I0;
    public Set<String> J0;
    public Pair<String, String> K0;
    public boolean L0;
    public final long M0;
    public final int N0;
    public final String O0;
    public String P0;
    public String Q0;
    public boolean R0;
    public Boolean S0;
    public Boolean T0;
    public String U0;
    public Ad.AdType V0;

    /* renamed from: j0  reason: collision with root package name */
    public AdPreferences.Placement f23117j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f23118k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f23119l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f23120m0;

    /* renamed from: n0  reason: collision with root package name */
    public Integer f23121n0;

    /* renamed from: o0  reason: collision with root package name */
    public Long f23122o0;

    /* renamed from: p0  reason: collision with root package name */
    public Boolean f23123p0;

    /* renamed from: q0  reason: collision with root package name */
    public String f23124q0;

    /* renamed from: r0  reason: collision with root package name */
    public SDKAdPreferences.Gender f23125r0;

    /* renamed from: s0  reason: collision with root package name */
    public String f23126s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f23127t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f23128u0;

    /* renamed from: v0  reason: collision with root package name */
    public Boolean f23129v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f23130w0;

    /* renamed from: x0  reason: collision with root package name */
    public Double f23131x0;

    /* renamed from: y0  reason: collision with root package name */
    public String f23132y0;

    /* renamed from: z0  reason: collision with root package name */
    public String f23133z0;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum VideoRequestMode {
        INTERSTITIAL,
        REWARDED
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum VideoRequestType {
        ENABLED,
        DISABLED,
        FORCED,
        FORCED_NONVAST
    }

    public GetAdRequest() {
        super(4);
        this.f23127t0 = 1;
        this.f23128u0 = true;
        this.f23130w0 = AdsCommonMetaData.k().M();
        this.C0 = true;
        this.E0 = 0;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.L0 = true;
        this.V0 = null;
        this.M0 = System.currentTimeMillis() - c8.f21846d.b();
        WeakHashMap weakHashMap = o9.f22359a;
        this.N0 = f.a().b();
        this.O0 = MetaData.w().G();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r3, com.startapp.sdk.adsbase.model.AdPreferences r4, com.startapp.sdk.adsbase.model.AdPreferences.Placement r5, com.startapp.sdk.common.utils.Pair<java.lang.String, java.lang.String> r6) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.model.GetAdRequest.a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences, com.startapp.sdk.adsbase.model.AdPreferences$Placement, com.startapp.sdk.common.utils.Pair):void");
    }

    @Override // com.startapp.u0
    public final boolean b() {
        return true;
    }

    public void d(Context context) {
        d8 a10 = a.a(context).f23235k.a();
        AdPreferences.Placement placement = this.f23117j0;
        this.f23133z0 = placement == null ? null : (String) a10.f21892a.get(new d8.a(placement, -1));
    }

    public final void e(Context context) {
        a a10 = a.a(context);
        v1 a11 = a10.f23233i.a();
        this.f23121n0 = a11.c();
        this.f23122o0 = (a11.d() && a11.f23463b.a().contains("consentTimestamp")) ? Long.valueOf(a11.f23463b.a().getLong("consentTimestamp", 0L)) : null;
        this.f23123p0 = a11.b();
        this.f23124q0 = a10.F.a().getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "");
    }

    @Override // com.startapp.u0
    public void a(w6 w6Var) throws SDKException {
        super.a(w6Var);
        w6Var.a("placement", this.f23117j0.name(), true, true);
        w6Var.a("placementId", this.f23118k0, false, true);
        w6Var.a("testMode", Boolean.toString(this.f23119l0), false, true);
        w6Var.a("gender", this.f23125r0, false, true);
        w6Var.a("keywords", this.f23126s0, false, true);
        w6Var.a("adsNumber", Integer.toString(this.f23127t0), false, true);
        w6Var.a("category", this.F0);
        w6Var.a("categoryExclude", this.G0);
        w6Var.a("packageExclude", this.H0);
        w6Var.a("campaignExclude", this.J0);
        w6Var.a("offset", Integer.toString(this.E0), false, true);
        w6Var.a("ai", this.S0, false, true);
        w6Var.a("as", this.T0, false, true);
        Double d10 = this.f23131x0;
        WeakHashMap weakHashMap = o9.f22359a;
        w6Var.a("minCPM", d10 != null ? String.format(Locale.US, "%.2f", d10) : null, false, true);
        w6Var.a("adTag", this.f23132y0, false, true);
        w6Var.a("previousAdId", this.f23133z0, false, true);
        w6Var.a("twoClicks", Boolean.valueOf(!this.f23130w0), false, true);
        w6Var.a("engInclude", Boolean.toString(this.L0), false, true);
        Object obj = this.V0;
        if (obj == Ad.AdType.INTERSTITIAL || obj == Ad.AdType.RICH_TEXT) {
            w6Var.a("type", obj, false, true);
        }
        w6Var.a("timeSinceSessionStart", Long.valueOf(this.M0), true, true);
        w6Var.a("adsDisplayed", Integer.valueOf(this.N0), true, true);
        w6Var.a("profileId", this.O0, false, true);
        w6Var.a("hardwareAccelerated", Boolean.valueOf(this.f23128u0), false, true);
        w6Var.a("autoLoadAmount", this.A0, false, true);
        w6Var.a("dts", this.f23129v0, false, true);
        if (this.B0) {
            w6Var.a("downloadingMode", "CACHE", false, true);
        }
        w6Var.a("primaryImg", this.P0, false, true);
        w6Var.a("moreImg", this.Q0, false, true);
        w6Var.a("contentAd", Boolean.toString(this.R0), false, true);
        w6Var.a("ct", this.f23121n0, false, true);
        w6Var.a("tsc", this.f23122o0, false, true);
        w6Var.a("apc", this.f23123p0, false, true);
        w6Var.a(AndroidTcfDataSource.TCF_TCSTRING_KEY, this.f23124q0, false, true);
        if (this.f23120m0) {
            w6Var.a("testAdsEnabled", Boolean.TRUE, false, true);
        }
        String a10 = com.startapp.a.a();
        w6Var.a(com.startapp.a.f21738b, a10, true, true);
        String str = com.startapp.a.f21740d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23390b);
        sb.append(this.f23117j0.name());
        String str2 = this.Q;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(this.f23392c);
        sb.append(a10);
        w6Var.a(str, com.startapp.a.a(sb.toString()), true, false);
        w6Var.a("sound", Boolean.valueOf(this.D0), false, true);
        Set set = this.I0;
        if (set != null) {
            w6Var.a("packageInclude", set);
        }
        w6Var.a("defaultMetaData", Boolean.valueOf(this.C0), true, true);
        Pair<String, String> pair = this.K0;
        w6Var.a(pair.first, pair.second, false, true);
        Object obj2 = this.U0;
        if (obj2 != null) {
            w6Var.a("trv", obj2, false, false);
        }
        c0 c0Var = this.f23401g0;
        if (c0Var != null) {
            Integer num = (Integer) c0Var.f21808c.get(this.f23117j0);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue > 0) {
                w6Var.a("adsDisplayed", Integer.valueOf(intValue), false, false);
            }
        }
    }
}
