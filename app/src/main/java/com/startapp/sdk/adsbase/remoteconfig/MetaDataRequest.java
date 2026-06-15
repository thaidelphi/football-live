package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import android.os.Build;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.u0;
import com.startapp.v1;
import com.startapp.w6;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class MetaDataRequest extends u0 {

    /* renamed from: u0  reason: collision with root package name */
    public static final Set<String> f23165u0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("ispCarrId", "ispCarrIdName", "isma", "root", "appSessionDuration")));

    /* renamed from: j0  reason: collision with root package name */
    public final e f23166j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f23167k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f23168l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f23169m0;

    /* renamed from: n0  reason: collision with root package name */
    public final float f23170n0;

    /* renamed from: o0  reason: collision with root package name */
    public final RequestReason f23171o0;

    /* renamed from: p0  reason: collision with root package name */
    public final String f23172p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Pair<String, String> f23173q0;

    /* renamed from: r0  reason: collision with root package name */
    public final Integer f23174r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Boolean f23175s0;

    /* renamed from: t0  reason: collision with root package name */
    public final long f23176t0;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum RequestReason {
        LAUNCH(1),
        APP_IDLE(2),
        IN_APP_PURCHASE(3),
        CUSTOM(4),
        PERIODIC(5),
        PAS(6),
        CONSENT(7),
        IMPLICIT_LAUNCH(8),
        EXTRAS(9);
        
        private int index;

        RequestReason(int i10) {
            this.index = i10;
        }
    }

    public MetaDataRequest(Context context, e eVar, RequestReason requestReason) {
        super(2);
        this.f23166j0 = eVar;
        this.f23167k0 = eVar.getInt("totalSessions", 0);
        this.f23168l0 = c();
        this.f23170n0 = eVar.getFloat("inAppPurchaseAmount", 0.0f);
        this.f23169m0 = eVar.getBoolean("payingUser", false);
        this.f23172p0 = MetaData.w().G();
        this.f23171o0 = requestReason;
        this.f23173q0 = SimpleTokenUtils.a();
        this.f23176t0 = SimpleTokenUtils.c();
        v1 a10 = com.startapp.sdk.components.a.a(context).c().a();
        this.f23174r0 = a10.c();
        this.f23175s0 = a10.b();
        b(com.startapp.sdk.components.a.a(context).b().a().a());
    }

    @Override // com.startapp.u0
    public final Set<String> a() {
        return f23165u0;
    }

    public final int c() {
        return (int) ((System.currentTimeMillis() - this.f23166j0.getLong("firstSessionTime", System.currentTimeMillis())) / 86400000);
    }

    @Override // com.startapp.u0
    public final void a(w6 w6Var) throws SDKException {
        super.a(w6Var);
        w6Var.a(com.startapp.a.f21738b, com.startapp.a.a(), true, true);
        w6Var.a("totalSessions", Integer.valueOf(this.f23167k0), true, true);
        w6Var.a("daysSinceFirstSession", Integer.valueOf(this.f23168l0), true, true);
        w6Var.a("profileId", this.f23172p0, false, true);
        boolean z10 = this.f23169m0;
        if (z10) {
            w6Var.a("payingUser", Boolean.valueOf(z10), true, true);
            w6Var.a("paidAmount", Float.valueOf(this.f23170n0), true, true);
        }
        w6Var.a("reason", this.f23171o0, true, true);
        w6Var.a("ct", this.f23174r0, false, true);
        w6Var.a("apc", this.f23175s0, false, true);
        Object obj = StartAppSDKInternal.C;
        w6Var.a("testAdsEnabled", StartAppSDKInternal.c.f22944a.B ? Boolean.TRUE : null, false, true);
        w6Var.a("apkHash", null, false, true);
        w6Var.a("ian", null, false, true);
        Pair<String, String> pair = this.f23173q0;
        w6Var.a(pair.first, pair.second, false, true);
        if (Build.VERSION.SDK_INT >= 9) {
            long j10 = this.f23176t0;
            if (j10 != 0) {
                w6Var.a("firstInstalledAppTS", Long.valueOf(j10), false, true);
            }
        }
    }
}
