package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface v0 {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements v0 {

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f21086a;

        public a(JSONObject applicationConfig) {
            kotlin.jvm.internal.n.f(applicationConfig, "applicationConfig");
            this.f21086a = applicationConfig;
        }

        @Override // com.ironsource.v0
        public JSONObject a() {
            JSONObject optJSONObject = this.f21086a.optJSONObject("controllerConfig");
            return optJSONObject == null ? new JSONObject() : optJSONObject;
        }

        @Override // com.ironsource.v0
        public int b() {
            int optInt = this.f21086a.optInt("debugMode", 0);
            if (this.f21086a.optBoolean(b.f21091e, false)) {
                return 3;
            }
            return optInt;
        }

        @Override // com.ironsource.v0
        public String c() {
            String optString = this.f21086a.optString("controllerUrl");
            return optString == null ? "" : optString;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21087a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final String f21088b = "controllerUrl";

        /* renamed from: c  reason: collision with root package name */
        public static final String f21089c = "controllerConfig";

        /* renamed from: d  reason: collision with root package name */
        public static final String f21090d = "debugMode";

        /* renamed from: e  reason: collision with root package name */
        public static final String f21091e = "adptDebugMode";

        private b() {
        }
    }

    JSONObject a();

    int b();

    String c();
}
