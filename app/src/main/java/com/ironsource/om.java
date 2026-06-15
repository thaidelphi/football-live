package com.ironsource;

import com.ironsource.sdk.controller.f;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class om {

    /* renamed from: d  reason: collision with root package name */
    public static final a f19595d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19596a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19597b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f19598c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final om a(String jsonStr) throws JSONException {
            kotlin.jvm.internal.n.f(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(f.b.f20339c);
            String command = jSONObject.getString(f.b.f20343g);
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            kotlin.jvm.internal.n.e(adId, "adId");
            kotlin.jvm.internal.n.e(command, "command");
            return new om(adId, command, optJSONObject);
        }
    }

    public om(String adId, String command, JSONObject jSONObject) {
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(command, "command");
        this.f19596a = adId;
        this.f19597b = command;
        this.f19598c = jSONObject;
    }

    public static /* synthetic */ om a(om omVar, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = omVar.f19596a;
        }
        if ((i10 & 2) != 0) {
            str2 = omVar.f19597b;
        }
        if ((i10 & 4) != 0) {
            jSONObject = omVar.f19598c;
        }
        return omVar.a(str, str2, jSONObject);
    }

    public static final om a(String str) throws JSONException {
        return f19595d.a(str);
    }

    public final om a(String adId, String command, JSONObject jSONObject) {
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(command, "command");
        return new om(adId, command, jSONObject);
    }

    public final String a() {
        return this.f19596a;
    }

    public final String b() {
        return this.f19597b;
    }

    public final JSONObject c() {
        return this.f19598c;
    }

    public final String d() {
        return this.f19596a;
    }

    public final String e() {
        return this.f19597b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof om) {
            om omVar = (om) obj;
            return kotlin.jvm.internal.n.a(this.f19596a, omVar.f19596a) && kotlin.jvm.internal.n.a(this.f19597b, omVar.f19597b) && kotlin.jvm.internal.n.a(this.f19598c, omVar.f19598c);
        }
        return false;
    }

    public final JSONObject f() {
        return this.f19598c;
    }

    public int hashCode() {
        int hashCode = ((this.f19596a.hashCode() * 31) + this.f19597b.hashCode()) * 31;
        JSONObject jSONObject = this.f19598c;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "MessageToNative(adId=" + this.f19596a + ", command=" + this.f19597b + ", params=" + this.f19598c + ')';
    }
}
