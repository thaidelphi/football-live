package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.pf;
import java.util.Locale;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class pb implements pf, pf.a {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f19700a = new JSONObject();

    private final JSONObject g() {
        JSONObject optJSONObject = this.f19700a.optJSONObject(qb.f19884a);
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    @Override // com.ironsource.pf.a
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.f19700a;
        }
        this.f19700a = jSONObject;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("setEpConfig: " + this.f19700a);
    }

    @Override // com.ironsource.rb
    public boolean a() {
        return g().optBoolean(sb.f20154f, true);
    }

    @Override // com.ironsource.rb
    public long b() {
        Long h10;
        String optString = g().optString(sb.f20152d);
        kotlin.jvm.internal.n.e(optString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        h10 = b9.n.h(optString);
        if (h10 != null) {
            return h10.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.rb
    public int c() {
        Integer f10;
        String optString = g().optString(sb.f20150b);
        kotlin.jvm.internal.n.e(optString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        f10 = b9.n.f(optString);
        if (f10 != null) {
            return f10.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.pf
    public JSONObject config() {
        return this.f19700a;
    }

    @Override // com.ironsource.rb
    public boolean d() {
        return g().optBoolean(sb.f20153e, true);
    }

    @Override // com.ironsource.rb
    public long e() {
        Long h10;
        String optString = g().optString(sb.f20151c);
        kotlin.jvm.internal.n.e(optString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        h10 = b9.n.h(optString);
        if (h10 != null) {
            return h10.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.rb
    public boolean f() {
        String optString = g().optString(sb.f20149a);
        kotlin.jvm.internal.n.e(optString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = optString.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.n.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return kotlin.jvm.internal.n.a(lowerCase, com.ironsource.mediationsdk.metadata.a.f18924g);
    }
}
