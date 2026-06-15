package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m6 extends n6 {

    /* renamed from: g  reason: collision with root package name */
    private final w2 f7510g;

    public m6(w2 w2Var, com.applovin.impl.sdk.j jVar) {
        super("TaskValidateMaxReward", jVar);
        this.f7510g = w2Var;
    }

    @Override // com.applovin.impl.j6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f7510g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f7510g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f7510g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f7510g.getFormat().getLabel());
        String s02 = this.f7510g.s0();
        if (!StringUtils.isValidString(s02)) {
            s02 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", s02);
        String C = this.f7510g.C();
        if (!StringUtils.isValidString(C)) {
            C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", C);
    }

    @Override // com.applovin.impl.j6
    protected String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.n6
    protected boolean h() {
        return this.f7510g.v0();
    }

    @Override // com.applovin.impl.n6
    protected void a(e4 e4Var) {
        this.f7510g.a(e4Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.j6
    public void a(int i10) {
        super.a(i10);
        String str = (i10 < 400 || i10 >= 500) ? "network_timeout" : "rejected";
        this.f7510g.a(e4.a(str));
        this.f9827a.D().a(y1.Z, this.f7510g, CollectionUtils.hashMap("error_message", str));
    }
}
