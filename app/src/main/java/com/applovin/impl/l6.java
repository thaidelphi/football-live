package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l6 extends n6 {

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f7461g;

    /* renamed from: h  reason: collision with root package name */
    private final AppLovinAdRewardListener f7462h;

    public l6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.j jVar) {
        super("TaskValidateAppLovinReward", jVar);
        this.f7461g = bVar;
        this.f7462h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.j6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f7461g.getAdZone().e());
        String clCode = this.f7461g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.j6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.n6
    protected boolean h() {
        return this.f7461g.N0();
    }

    @Override // com.applovin.impl.n6
    protected void a(e4 e4Var) {
        this.f7461g.a(e4Var);
        String b10 = e4Var.b();
        Map<String, String> a10 = e4Var.a();
        if (b10.equals("accepted")) {
            this.f7462h.userRewardVerified(this.f7461g, a10);
        } else if (b10.equals("quota_exceeded")) {
            this.f7462h.userOverQuota(this.f7461g, a10);
        } else if (b10.equals("rejected")) {
            this.f7462h.userRewardRejected(this.f7461g, a10);
        } else {
            this.f7462h.validationRequestFailed(this.f7461g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.j6
    protected void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            this.f7462h.userRewardRejected(this.f7461g, Collections.emptyMap());
            str = "rejected";
        } else {
            this.f7462h.validationRequestFailed(this.f7461g, i10);
            str = "network_timeout";
        }
        this.f7461g.a(e4.a(str));
    }
}
