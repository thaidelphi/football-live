package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c3 {

    /* renamed from: a  reason: collision with root package name */
    private NetworkSettings f16816a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f16817b;

    /* renamed from: c  reason: collision with root package name */
    private IronSource.AD_UNIT f16818c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16819d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16820e;

    /* renamed from: f  reason: collision with root package name */
    private int f16821f;

    /* renamed from: g  reason: collision with root package name */
    private int f16822g;

    public c3(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f16816a = networkSettings;
        this.f16817b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f16821f = optInt;
        this.f16819d = optInt == 2;
        this.f16820e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f16822g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f16818c = ad_unit;
    }

    public String a() {
        return this.f16816a.getAdSourceNameForEvents();
    }

    public IronSource.AD_UNIT b() {
        return this.f16818c;
    }

    public JSONObject c() {
        return this.f16817b;
    }

    public int d() {
        return this.f16821f;
    }

    public int e() {
        return this.f16822g;
    }

    public String f() {
        return this.f16816a.getProviderName();
    }

    public String g() {
        return this.f16816a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.f16816a;
    }

    public String i() {
        return this.f16816a.getSubProviderId();
    }

    public boolean j() {
        return this.f16819d;
    }

    public boolean k() {
        return this.f16820e;
    }
}
