package com.ironsource;

import android.content.Context;
import com.ironsource.b9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class oc implements mo {

    /* renamed from: a  reason: collision with root package name */
    private boolean f19547a = true;

    /* renamed from: b  reason: collision with root package name */
    private String f19548b = pc.f19710j;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements xe {
        a() {
        }

        @Override // com.ironsource.xe
        public void a(boolean z10) {
            if (z10) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceOS", "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.getDeviceType(applicationContext));
            wj ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
            if (ironSourceAdvId != null) {
                jSONObject.put("advId", ironSourceAdvId.c());
                jSONObject.put("advIdType", ironSourceAdvId.d());
            }
        }
        String n10 = com.ironsource.mediationsdk.p.m().n();
        if (n10 != null) {
            jSONObject.put(b9.i.f16702g, n10);
        }
        return jSONObject;
    }

    @Override // com.ironsource.mo
    public void a() {
    }

    public final void a(String dataSource, JSONObject impressionData) {
        kotlin.jvm.internal.n.f(dataSource, "dataSource");
        kotlin.jvm.internal.n.f(impressionData, "impressionData");
        if (!this.f19547a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject b10 = b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", b10);
            IronLog ironLog = IronLog.API;
            ironLog.info("impressionData: " + jSONObject);
            HttpFunctions.sendPostRequest(this.f19548b, jSONObject.toString(), new a());
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog2 = IronLog.API;
            ironLog2.error("exception " + e8.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.mo
    public void a(List<IronSource.AD_UNIT> list, boolean z10, s8 s8Var) {
        if (s8Var != null) {
            a4 b10 = s8Var.b();
            k4 e8 = b10 != null ? b10.e() : null;
            kotlin.jvm.internal.n.c(e8);
            this.f19547a = e8.l();
            this.f19548b = s8Var.b().e().d();
        }
    }

    @Override // com.ironsource.mo
    public void d(String str) {
    }
}
