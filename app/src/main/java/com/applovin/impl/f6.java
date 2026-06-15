package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f6 extends h6 {

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f6987g;

    public f6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
        super("TaskReportAppLovinReward", jVar);
        this.f6987g = bVar;
    }

    @Override // com.applovin.impl.j6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f6987g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f6987g.W());
        String clCode = this.f6987g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.h6
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Reported reward successfully for ad: " + this.f6987g);
        }
    }

    @Override // com.applovin.impl.j6
    protected String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.h6
    protected e4 h() {
        return this.f6987g.f();
    }

    @Override // com.applovin.impl.h6
    protected void i() {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.b(str, "No reward result was found for ad: " + this.f6987g);
        }
    }

    @Override // com.applovin.impl.j6
    protected void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.b(str, "Failed to report reward for ad: " + this.f6987g + " - error code: " + i10);
        }
        this.f9827a.D().a(y1.f9688r, this.f6987g);
    }
}
