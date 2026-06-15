package com.ironsource;

import com.ironsource.b9;
import com.ironsource.eh;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface u3 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f20919a = b.f20935a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a extends u3 {

        /* renamed from: com.ironsource.u3$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class C0238a implements a {

            /* renamed from: b  reason: collision with root package name */
            private final String f20920b;

            /* renamed from: c  reason: collision with root package name */
            private final String f20921c;

            /* renamed from: d  reason: collision with root package name */
            private final eh.e f20922d;

            /* renamed from: e  reason: collision with root package name */
            private final String f20923e;

            /* renamed from: f  reason: collision with root package name */
            private final String f20924f;

            /* renamed from: g  reason: collision with root package name */
            private final C0239a f20925g;

            /* renamed from: h  reason: collision with root package name */
            private final int f20926h;

            /* renamed from: i  reason: collision with root package name */
            private final int f20927i;

            /* renamed from: com.ironsource.u3$a$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class C0239a {

                /* renamed from: a  reason: collision with root package name */
                private final int f20928a;

                /* renamed from: b  reason: collision with root package name */
                private final int f20929b;

                public C0239a(int i10, int i11) {
                    this.f20928a = i10;
                    this.f20929b = i11;
                }

                public static /* synthetic */ C0239a a(C0239a c0239a, int i10, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i10 = c0239a.f20928a;
                    }
                    if ((i12 & 2) != 0) {
                        i11 = c0239a.f20929b;
                    }
                    return c0239a.a(i10, i11);
                }

                public final int a() {
                    return this.f20928a;
                }

                public final C0239a a(int i10, int i11) {
                    return new C0239a(i10, i11);
                }

                public final int b() {
                    return this.f20929b;
                }

                public final int c() {
                    return this.f20928a;
                }

                public final int d() {
                    return this.f20929b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof C0239a) {
                        C0239a c0239a = (C0239a) obj;
                        return this.f20928a == c0239a.f20928a && this.f20929b == c0239a.f20929b;
                    }
                    return false;
                }

                public int hashCode() {
                    return (this.f20928a * 31) + this.f20929b;
                }

                public String toString() {
                    return "Coordinates(x=" + this.f20928a + ", y=" + this.f20929b + ')';
                }
            }

            public C0238a(String successCallback, String failCallback, eh.e productType, String demandSourceName, String url, C0239a coordinates, int i10, int i11) {
                kotlin.jvm.internal.n.f(successCallback, "successCallback");
                kotlin.jvm.internal.n.f(failCallback, "failCallback");
                kotlin.jvm.internal.n.f(productType, "productType");
                kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.f(url, "url");
                kotlin.jvm.internal.n.f(coordinates, "coordinates");
                this.f20920b = successCallback;
                this.f20921c = failCallback;
                this.f20922d = productType;
                this.f20923e = demandSourceName;
                this.f20924f = url;
                this.f20925g = coordinates;
                this.f20926h = i10;
                this.f20927i = i11;
            }

            public final C0238a a(String successCallback, String failCallback, eh.e productType, String demandSourceName, String url, C0239a coordinates, int i10, int i11) {
                kotlin.jvm.internal.n.f(successCallback, "successCallback");
                kotlin.jvm.internal.n.f(failCallback, "failCallback");
                kotlin.jvm.internal.n.f(productType, "productType");
                kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.f(url, "url");
                kotlin.jvm.internal.n.f(coordinates, "coordinates");
                return new C0238a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i10, i11);
            }

            @Override // com.ironsource.u3
            public String a() {
                return this.f20921c;
            }

            @Override // com.ironsource.u3
            public eh.e b() {
                return this.f20922d;
            }

            @Override // com.ironsource.u3
            public String c() {
                return this.f20920b;
            }

            @Override // com.ironsource.u3
            public String d() {
                return this.f20923e;
            }

            public final String e() {
                return this.f20920b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0238a) {
                    C0238a c0238a = (C0238a) obj;
                    return kotlin.jvm.internal.n.a(this.f20920b, c0238a.f20920b) && kotlin.jvm.internal.n.a(this.f20921c, c0238a.f20921c) && this.f20922d == c0238a.f20922d && kotlin.jvm.internal.n.a(this.f20923e, c0238a.f20923e) && kotlin.jvm.internal.n.a(this.f20924f, c0238a.f20924f) && kotlin.jvm.internal.n.a(this.f20925g, c0238a.f20925g) && this.f20926h == c0238a.f20926h && this.f20927i == c0238a.f20927i;
                }
                return false;
            }

            public final String f() {
                return this.f20921c;
            }

            public final eh.e g() {
                return this.f20922d;
            }

            @Override // com.ironsource.u3.a
            public String getUrl() {
                return this.f20924f;
            }

            public final String h() {
                return this.f20923e;
            }

            public int hashCode() {
                return (((((((((((((this.f20920b.hashCode() * 31) + this.f20921c.hashCode()) * 31) + this.f20922d.hashCode()) * 31) + this.f20923e.hashCode()) * 31) + this.f20924f.hashCode()) * 31) + this.f20925g.hashCode()) * 31) + this.f20926h) * 31) + this.f20927i;
            }

            public final String i() {
                return this.f20924f;
            }

            public final C0239a j() {
                return this.f20925g;
            }

            public final int k() {
                return this.f20926h;
            }

            public final int l() {
                return this.f20927i;
            }

            public final int m() {
                return this.f20926h;
            }

            public final C0239a n() {
                return this.f20925g;
            }

            public final int o() {
                return this.f20927i;
            }

            public String toString() {
                return "Click(successCallback=" + this.f20920b + ", failCallback=" + this.f20921c + ", productType=" + this.f20922d + ", demandSourceName=" + this.f20923e + ", url=" + this.f20924f + ", coordinates=" + this.f20925g + ", action=" + this.f20926h + ", metaState=" + this.f20927i + ')';
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class b implements a {

            /* renamed from: b  reason: collision with root package name */
            private final String f20930b;

            /* renamed from: c  reason: collision with root package name */
            private final String f20931c;

            /* renamed from: d  reason: collision with root package name */
            private final eh.e f20932d;

            /* renamed from: e  reason: collision with root package name */
            private final String f20933e;

            /* renamed from: f  reason: collision with root package name */
            private final String f20934f;

            public b(String successCallback, String failCallback, eh.e productType, String demandSourceName, String url) {
                kotlin.jvm.internal.n.f(successCallback, "successCallback");
                kotlin.jvm.internal.n.f(failCallback, "failCallback");
                kotlin.jvm.internal.n.f(productType, "productType");
                kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.f(url, "url");
                this.f20930b = successCallback;
                this.f20931c = failCallback;
                this.f20932d = productType;
                this.f20933e = demandSourceName;
                this.f20934f = url;
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, eh.e eVar, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = bVar.f20930b;
                }
                if ((i10 & 2) != 0) {
                    str2 = bVar.f20931c;
                }
                String str5 = str2;
                if ((i10 & 4) != 0) {
                    eVar = bVar.f20932d;
                }
                eh.e eVar2 = eVar;
                if ((i10 & 8) != 0) {
                    str3 = bVar.f20933e;
                }
                String str6 = str3;
                if ((i10 & 16) != 0) {
                    str4 = bVar.f20934f;
                }
                return bVar.a(str, str5, eVar2, str6, str4);
            }

            public final b a(String successCallback, String failCallback, eh.e productType, String demandSourceName, String url) {
                kotlin.jvm.internal.n.f(successCallback, "successCallback");
                kotlin.jvm.internal.n.f(failCallback, "failCallback");
                kotlin.jvm.internal.n.f(productType, "productType");
                kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.f(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.u3
            public String a() {
                return this.f20931c;
            }

            @Override // com.ironsource.u3
            public eh.e b() {
                return this.f20932d;
            }

            @Override // com.ironsource.u3
            public String c() {
                return this.f20930b;
            }

            @Override // com.ironsource.u3
            public String d() {
                return this.f20933e;
            }

            public final String e() {
                return this.f20930b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return kotlin.jvm.internal.n.a(this.f20930b, bVar.f20930b) && kotlin.jvm.internal.n.a(this.f20931c, bVar.f20931c) && this.f20932d == bVar.f20932d && kotlin.jvm.internal.n.a(this.f20933e, bVar.f20933e) && kotlin.jvm.internal.n.a(this.f20934f, bVar.f20934f);
                }
                return false;
            }

            public final String f() {
                return this.f20931c;
            }

            public final eh.e g() {
                return this.f20932d;
            }

            @Override // com.ironsource.u3.a
            public String getUrl() {
                return this.f20934f;
            }

            public final String h() {
                return this.f20933e;
            }

            public int hashCode() {
                return (((((((this.f20930b.hashCode() * 31) + this.f20931c.hashCode()) * 31) + this.f20932d.hashCode()) * 31) + this.f20933e.hashCode()) * 31) + this.f20934f.hashCode();
            }

            public final String i() {
                return this.f20934f;
            }

            public String toString() {
                return "Impression(successCallback=" + this.f20930b + ", failCallback=" + this.f20931c + ", productType=" + this.f20932d + ", demandSourceName=" + this.f20933e + ", url=" + this.f20934f + ')';
            }
        }

        String getUrl();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f20935a = new b();

        private b() {
        }

        private final a a(JSONObject jSONObject) {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(b9.f.f16606e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(b9.h.f16662m);
            kotlin.jvm.internal.n.e(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            eh.e valueOf = eh.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String optString = jSONObject2.optString("type");
            if (kotlin.jvm.internal.n.a(optString, c9.f16851d)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(c9.f16853f);
                int i10 = jSONObject3.getInt(c9.f16854g);
                int i11 = jSONObject3.getInt(c9.f16855h);
                int optInt = jSONObject2.optInt("action", 0);
                int optInt2 = jSONObject2.optInt(c9.f16857j, 0);
                kotlin.jvm.internal.n.e(successCallback, "successCallback");
                kotlin.jvm.internal.n.e(failCallback, "failCallback");
                kotlin.jvm.internal.n.e(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.e(url, "url");
                return new a.C0238a(successCallback, failCallback, valueOf, demandSourceName, url, new a.C0238a.C0239a(i10, i11), optInt, optInt2);
            } else if (!kotlin.jvm.internal.n.a(optString, "impression")) {
                throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
            } else {
                kotlin.jvm.internal.n.e(successCallback, "successCallback");
                kotlin.jvm.internal.n.e(failCallback, "failCallback");
                kotlin.jvm.internal.n.e(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.n.e(url, "url");
                return new a.b(successCallback, failCallback, valueOf, demandSourceName, url);
            }
        }

        public final u3 a(String jsonString) {
            kotlin.jvm.internal.n.f(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String optString = jSONObject.optString("type", "none");
            if (kotlin.jvm.internal.n.a(optString, c9.f16850c)) {
                return a(jSONObject);
            }
            throw new IllegalArgumentException("unsupported message type: " + optString);
        }
    }

    String a();

    eh.e b();

    String c();

    String d();
}
