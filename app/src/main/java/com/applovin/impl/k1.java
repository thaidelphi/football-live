package com.applovin.impl;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f7382a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7383b;

    /* renamed from: c  reason: collision with root package name */
    private String f7384c;

    /* renamed from: d  reason: collision with root package name */
    private String f7385d;

    public k1(Object obj, long j10) {
        this.f7383b = obj;
        this.f7382a = j10;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f7384c = bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null;
            this.f7385d = "AppLovin";
        } else if (obj instanceof u2) {
            u2 u2Var = (u2) obj;
            this.f7384c = u2Var.getFormat().getLabel();
            this.f7385d = u2Var.getNetworkName();
        }
    }

    public Object a() {
        return this.f7383b;
    }

    public long b() {
        return this.f7382a;
    }

    public String c() {
        String str = this.f7384c;
        return str != null ? str : "Unknown";
    }

    public String d() {
        String str = this.f7385d;
        return str != null ? str : "Unknown";
    }
}
