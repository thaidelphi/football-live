package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g6 extends h6 {

    /* renamed from: g  reason: collision with root package name */
    private final w2 f7042g;

    public g6(w2 w2Var, com.applovin.impl.sdk.j jVar) {
        super("TaskReportMaxReward", jVar);
        this.f7042g = w2Var;
    }

    @Override // com.applovin.impl.j6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f7042g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f7042g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f7042g.e());
        String s02 = this.f7042g.s0();
        if (!StringUtils.isValidString(s02)) {
            s02 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", s02);
        String C = this.f7042g.C();
        if (!StringUtils.isValidString(C)) {
            C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", C);
    }

    @Override // com.applovin.impl.h6
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Reported reward successfully for mediated ad: " + this.f7042g);
        }
    }

    @Override // com.applovin.impl.j6
    protected String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.h6
    protected e4 h() {
        return this.f7042g.o0();
    }

    @Override // com.applovin.impl.h6
    protected void i() {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.b(str, "No reward result was found for mediated ad: " + this.f7042g);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.j6
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Failed to report reward for mediated ad: " + this.f7042g + " - error code: " + i10);
        }
        this.f9827a.D().a(y1.Y, this.f7042g);
    }
}
