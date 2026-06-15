package com.ironsource.sdk.controller;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface f {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final C0233a f20334c = new C0233a(null);

        /* renamed from: a  reason: collision with root package name */
        private final String f20335a;

        /* renamed from: b  reason: collision with root package name */
        private final JSONObject f20336b;

        /* renamed from: com.ironsource.sdk.controller.f$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class C0233a {
            private C0233a() {
            }

            public /* synthetic */ C0233a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final a a(String jsonStr) throws JSONException {
                kotlin.jvm.internal.n.f(jsonStr, "jsonStr");
                JSONObject jSONObject = new JSONObject(jsonStr);
                String id = jSONObject.getString(b.f20338b);
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                kotlin.jvm.internal.n.e(id, "id");
                return new a(id, optJSONObject);
            }
        }

        public a(String msgId, JSONObject jSONObject) {
            kotlin.jvm.internal.n.f(msgId, "msgId");
            this.f20335a = msgId;
            this.f20336b = jSONObject;
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f20335a;
            }
            if ((i10 & 2) != 0) {
                jSONObject = aVar.f20336b;
            }
            return aVar.a(str, jSONObject);
        }

        public static final a a(String str) throws JSONException {
            return f20334c.a(str);
        }

        public final a a(String msgId, JSONObject jSONObject) {
            kotlin.jvm.internal.n.f(msgId, "msgId");
            return new a(msgId, jSONObject);
        }

        public final String a() {
            return this.f20335a;
        }

        public final JSONObject b() {
            return this.f20336b;
        }

        public final String c() {
            return this.f20335a;
        }

        public final JSONObject d() {
            return this.f20336b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.n.a(this.f20335a, aVar.f20335a) && kotlin.jvm.internal.n.a(this.f20336b, aVar.f20336b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f20335a.hashCode() * 31;
            JSONObject jSONObject = this.f20336b;
            return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public String toString() {
            return "CallbackToNative(msgId=" + this.f20335a + ", params=" + this.f20336b + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f20337a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final String f20338b = "msgId";

        /* renamed from: c  reason: collision with root package name */
        public static final String f20339c = "adId";

        /* renamed from: d  reason: collision with root package name */
        public static final String f20340d = "params";

        /* renamed from: e  reason: collision with root package name */
        public static final String f20341e = "success";

        /* renamed from: f  reason: collision with root package name */
        public static final String f20342f = "reason";

        /* renamed from: g  reason: collision with root package name */
        public static final String f20343g = "command";

        private b() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f20344a;

        /* renamed from: b  reason: collision with root package name */
        private final String f20345b;

        /* renamed from: c  reason: collision with root package name */
        private final JSONObject f20346c;

        /* renamed from: d  reason: collision with root package name */
        private String f20347d;

        public c(String adId, String command, JSONObject params) {
            kotlin.jvm.internal.n.f(adId, "adId");
            kotlin.jvm.internal.n.f(command, "command");
            kotlin.jvm.internal.n.f(params, "params");
            this.f20344a = adId;
            this.f20345b = command;
            this.f20346c = params;
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.n.e(uuid, "randomUUID().toString()");
            this.f20347d = uuid;
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.f20344a;
            }
            if ((i10 & 2) != 0) {
                str2 = cVar.f20345b;
            }
            if ((i10 & 4) != 0) {
                jSONObject = cVar.f20346c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        public final c a(String adId, String command, JSONObject params) {
            kotlin.jvm.internal.n.f(adId, "adId");
            kotlin.jvm.internal.n.f(command, "command");
            kotlin.jvm.internal.n.f(params, "params");
            return new c(adId, command, params);
        }

        public final String a() {
            return this.f20344a;
        }

        public final void a(String str) {
            kotlin.jvm.internal.n.f(str, "<set-?>");
            this.f20347d = str;
        }

        public final String b() {
            return this.f20345b;
        }

        public final JSONObject c() {
            return this.f20346c;
        }

        public final String d() {
            return this.f20344a;
        }

        public final String e() {
            return this.f20345b;
        }

        public boolean equals(Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return kotlin.jvm.internal.n.a(this.f20347d, cVar.f20347d) && kotlin.jvm.internal.n.a(this.f20344a, cVar.f20344a) && kotlin.jvm.internal.n.a(this.f20345b, cVar.f20345b) && kotlin.jvm.internal.n.a(this.f20346c.toString(), cVar.f20346c.toString());
        }

        public final String f() {
            return this.f20347d;
        }

        public final JSONObject g() {
            return this.f20346c;
        }

        public final String h() {
            String jSONObject = new JSONObject().put(b.f20338b, this.f20347d).put(b.f20339c, this.f20344a).put("params", this.f20346c).toString();
            kotlin.jvm.internal.n.e(jSONObject, "JSONObject()\n          .…ms)\n          .toString()");
            return jSONObject;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "MessageToController(adId=" + this.f20344a + ", command=" + this.f20345b + ", params=" + this.f20346c + ')';
        }
    }
}
