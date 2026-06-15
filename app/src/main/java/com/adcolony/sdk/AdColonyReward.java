package com.adcolony.sdk;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyReward {

    /* renamed from: a  reason: collision with root package name */
    private int f5730a;

    /* renamed from: b  reason: collision with root package name */
    private String f5731b;

    /* renamed from: c  reason: collision with root package name */
    private String f5732c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5733d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyReward(h0 h0Var) {
        f1 a10 = h0Var.a();
        this.f5730a = c0.d(a10, "reward_amount");
        this.f5731b = c0.h(a10, "reward_name");
        this.f5733d = c0.b(a10, "success");
        this.f5732c = c0.h(a10, "zone_id");
    }

    public int getRewardAmount() {
        return this.f5730a;
    }

    public String getRewardName() {
        return this.f5731b;
    }

    public String getZoneID() {
        return this.f5732c;
    }

    public boolean success() {
        return this.f5733d;
    }
}
