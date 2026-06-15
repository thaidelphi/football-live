package com.adcolony.sdk;

import com.adcolony.sdk.e0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyZone {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 0;
    @Deprecated
    public static final int NATIVE = 2;

    /* renamed from: a  reason: collision with root package name */
    private String f5737a;

    /* renamed from: b  reason: collision with root package name */
    private String f5738b;

    /* renamed from: c  reason: collision with root package name */
    private int f5739c = 5;

    /* renamed from: d  reason: collision with root package name */
    private int f5740d;

    /* renamed from: e  reason: collision with root package name */
    private int f5741e;

    /* renamed from: f  reason: collision with root package name */
    private int f5742f;

    /* renamed from: g  reason: collision with root package name */
    private int f5743g;

    /* renamed from: h  reason: collision with root package name */
    private int f5744h;

    /* renamed from: i  reason: collision with root package name */
    private int f5745i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5746j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5747k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyZone(String str) {
        this.f5737a = str;
    }

    private int a(int i10) {
        if (!a.d() || a.b().E() || a.b().F()) {
            b();
            return 0;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i10) {
        this.f5745i = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i10) {
        this.f5739c = i10;
    }

    public int getPlayFrequency() {
        return a(this.f5743g);
    }

    public int getRemainingViewsUntilReward() {
        return a(this.f5741e);
    }

    public int getRewardAmount() {
        return a(this.f5744h);
    }

    public String getRewardName() {
        return a(this.f5738b);
    }

    public int getViewsPerReward() {
        return a(this.f5742f);
    }

    public String getZoneID() {
        return a(this.f5737a);
    }

    public int getZoneType() {
        return this.f5740d;
    }

    public boolean isRewarded() {
        return this.f5747k;
    }

    public boolean isValid() {
        return a(this.f5746j);
    }

    private void b() {
        new e0.a().a("The AdColonyZone API is not available while AdColony is disabled.").a(e0.f5980h);
    }

    private boolean a(boolean z10) {
        if (!a.d() || a.b().E() || a.b().F()) {
            b();
            return false;
        }
        return z10;
    }

    private String a(String str) {
        return a(str, "");
    }

    private String a(String str, String str2) {
        if (!a.d() || a.b().E() || a.b().F()) {
            b();
            return str2;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(h0 h0Var) {
        f1 a10 = h0Var.a();
        f1 f10 = c0.f(a10, com.ironsource.t.f20751j);
        this.f5738b = c0.h(f10, "reward_name");
        this.f5744h = c0.d(f10, "reward_amount");
        this.f5742f = c0.d(f10, "views_per_reward");
        this.f5741e = c0.d(f10, "views_until_reward");
        this.f5747k = c0.b(a10, "rewarded");
        this.f5739c = c0.d(a10, "status");
        this.f5740d = c0.d(a10, "type");
        this.f5743g = c0.d(a10, "play_interval");
        this.f5737a = c0.h(a10, "zone_id");
        this.f5746j = this.f5739c != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f5745i;
    }
}
