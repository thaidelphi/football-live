package com.ironsource.adapters.ironsource;

import com.ironsource.cc;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface IronSourceLoadParameters {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Base implements IronSourceLoadParameters {
        private final JSONObject loadConfig;
        private final String serverData;

        public Base(JSONObject loadConfig, String str) {
            n.f(loadConfig, "loadConfig");
            this.loadConfig = loadConfig;
            this.serverData = str;
        }

        public /* synthetic */ Base(JSONObject jSONObject, String str, int i10, h hVar) {
            this(jSONObject, (i10 & 2) != 0 ? null : str);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadConfig;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(Constants.DEMAND_ONLY, false);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("isOneFlow", String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                String a10 = d.b().a(this.serverData);
                n.e(a10, "getInstance().getAdmFromServerData(serverData)");
                hashMap.put("adm", a10);
                hashMap.putAll(d.b().b(this.serverData));
            }
            return hashMap;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Constants {
        public static final String ADM_KEY = "adm";
        public static final String DEMAND_ONLY = "demandOnly";
        public static final Constants INSTANCE = new Constants();
        public static final String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class WithLog implements IronSourceLoadParameters {
        private final IronSourceLoadParameters loadParameters;

        public WithLog(IronSourceLoadParameters loadParameters) {
            n.f(loadParameters, "loadParameters");
            this.loadParameters = loadParameters;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadParameters.config();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> value = this.loadParameters.value();
            if (!value.isEmpty()) {
                IronLog.ADAPTER_API.verbose("instance extra params:");
                for (String str : value.keySet()) {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose(str + cc.T + value.get(str));
                }
            }
            return value;
        }
    }

    JSONObject config();

    boolean demandOnly();

    HashMap<String, String> value();
}
