package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.p;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface v4 {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements v4 {

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f21099a;

        public a() {
            this(null, 1, null);
        }

        public a(JSONObject jSONObject) {
            this.f21099a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i10, kotlin.jvm.internal.h hVar) {
            this((i10 & 1) != 0 ? new JSONObject() : jSONObject);
        }

        @Override // com.ironsource.v4
        public com.ironsource.mediationsdk.demandOnly.p a(String instanceId) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            JSONObject jSONObject = this.f21099a;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            String optString = optJSONObject != null ? optJSONObject.optString("plumbus") : null;
            return optString != null ? new p.a(optString) : new p.b();
        }
    }

    com.ironsource.mediationsdk.demandOnly.p a(String str);
}
