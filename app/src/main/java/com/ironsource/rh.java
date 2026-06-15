package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.b9;
import i8.o;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class rh {

    /* renamed from: a  reason: collision with root package name */
    private final String f19965a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19966b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19967c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19968d;

    /* renamed from: e  reason: collision with root package name */
    private final Drawable f19969e;

    /* renamed from: f  reason: collision with root package name */
    private final WebView f19970f;

    /* renamed from: g  reason: collision with root package name */
    private final View f19971g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ii f19972a;

        /* renamed from: b  reason: collision with root package name */
        private final b3 f19973b;

        public a(ii imageLoader, b3 adViewManagement) {
            kotlin.jvm.internal.n.f(imageLoader, "imageLoader");
            kotlin.jvm.internal.n.f(adViewManagement, "adViewManagement");
            this.f19972a = imageLoader;
            this.f19973b = adViewManagement;
        }

        private final i8.o<WebView> a(String str) {
            Object b10;
            if (str == null) {
                return null;
            }
            vh a10 = this.f19973b.a(str);
            WebView presentingView = a10 != null ? a10.getPresentingView() : null;
            if (presentingView == null) {
                o.a aVar = i8.o.f26626b;
                b10 = i8.o.b(i8.p.a(new Exception("missing adview for id: '" + str + '\'')));
            } else {
                o.a aVar2 = i8.o.f26626b;
                b10 = i8.o.b(presentingView);
            }
            return i8.o.a(b10);
        }

        private final i8.o<Drawable> b(String str) {
            if (str == null) {
                return null;
            }
            return i8.o.a(this.f19972a.a(str));
        }

        public final b a(Context activityContext, JSONObject json) {
            String str;
            String str2;
            String str3;
            String str4;
            String b10;
            String b11;
            String b12;
            String b13;
            kotlin.jvm.internal.n.f(activityContext, "activityContext");
            kotlin.jvm.internal.n.f(json, "json");
            JSONObject optJSONObject = json.optJSONObject(b9.h.D0);
            if (optJSONObject != null) {
                b13 = sh.b(optJSONObject, b9.h.K0);
                str = b13;
            } else {
                str = null;
            }
            JSONObject optJSONObject2 = json.optJSONObject(b9.h.F0);
            if (optJSONObject2 != null) {
                b12 = sh.b(optJSONObject2, b9.h.K0);
                str2 = b12;
            } else {
                str2 = null;
            }
            JSONObject optJSONObject3 = json.optJSONObject(b9.h.E0);
            if (optJSONObject3 != null) {
                b11 = sh.b(optJSONObject3, b9.h.K0);
                str3 = b11;
            } else {
                str3 = null;
            }
            JSONObject optJSONObject4 = json.optJSONObject(b9.h.G0);
            if (optJSONObject4 != null) {
                b10 = sh.b(optJSONObject4, b9.h.K0);
                str4 = b10;
            } else {
                str4 = null;
            }
            JSONObject optJSONObject5 = json.optJSONObject(b9.h.H0);
            String b14 = optJSONObject5 != null ? sh.b(optJSONObject5, "url") : null;
            JSONObject optJSONObject6 = json.optJSONObject(b9.h.I0);
            String b15 = optJSONObject6 != null ? sh.b(optJSONObject6, "adViewId") : null;
            JSONObject optJSONObject7 = json.optJSONObject(b9.h.J0);
            return new b(new b.a(str, str2, str3, str4, b(b14), a(b15), up.f21068a.a(activityContext, optJSONObject7 != null ? sh.b(optJSONObject7, "url") : null, this.f19972a)));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final a f19974a;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final String f19975a;

            /* renamed from: b  reason: collision with root package name */
            private final String f19976b;

            /* renamed from: c  reason: collision with root package name */
            private final String f19977c;

            /* renamed from: d  reason: collision with root package name */
            private final String f19978d;

            /* renamed from: e  reason: collision with root package name */
            private final i8.o<Drawable> f19979e;

            /* renamed from: f  reason: collision with root package name */
            private final i8.o<WebView> f19980f;

            /* renamed from: g  reason: collision with root package name */
            private final View f19981g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, String str2, String str3, String str4, i8.o<? extends Drawable> oVar, i8.o<? extends WebView> oVar2, View privacyIcon) {
                kotlin.jvm.internal.n.f(privacyIcon, "privacyIcon");
                this.f19975a = str;
                this.f19976b = str2;
                this.f19977c = str3;
                this.f19978d = str4;
                this.f19979e = oVar;
                this.f19980f = oVar2;
                this.f19981g = privacyIcon;
            }

            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, i8.o oVar, i8.o oVar2, View view, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f19975a;
                }
                if ((i10 & 2) != 0) {
                    str2 = aVar.f19976b;
                }
                String str5 = str2;
                if ((i10 & 4) != 0) {
                    str3 = aVar.f19977c;
                }
                String str6 = str3;
                if ((i10 & 8) != 0) {
                    str4 = aVar.f19978d;
                }
                String str7 = str4;
                i8.o<Drawable> oVar3 = oVar;
                if ((i10 & 16) != 0) {
                    oVar3 = aVar.f19979e;
                }
                i8.o oVar4 = oVar3;
                i8.o<WebView> oVar5 = oVar2;
                if ((i10 & 32) != 0) {
                    oVar5 = aVar.f19980f;
                }
                i8.o oVar6 = oVar5;
                if ((i10 & 64) != 0) {
                    view = aVar.f19981g;
                }
                return aVar.a(str, str5, str6, str7, oVar4, oVar6, view);
            }

            public final a a(String str, String str2, String str3, String str4, i8.o<? extends Drawable> oVar, i8.o<? extends WebView> oVar2, View privacyIcon) {
                kotlin.jvm.internal.n.f(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, oVar, oVar2, privacyIcon);
            }

            public final String a() {
                return this.f19975a;
            }

            public final String b() {
                return this.f19976b;
            }

            public final String c() {
                return this.f19977c;
            }

            public final String d() {
                return this.f19978d;
            }

            public final i8.o<Drawable> e() {
                return this.f19979e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return kotlin.jvm.internal.n.a(this.f19975a, aVar.f19975a) && kotlin.jvm.internal.n.a(this.f19976b, aVar.f19976b) && kotlin.jvm.internal.n.a(this.f19977c, aVar.f19977c) && kotlin.jvm.internal.n.a(this.f19978d, aVar.f19978d) && kotlin.jvm.internal.n.a(this.f19979e, aVar.f19979e) && kotlin.jvm.internal.n.a(this.f19980f, aVar.f19980f) && kotlin.jvm.internal.n.a(this.f19981g, aVar.f19981g);
                }
                return false;
            }

            public final i8.o<WebView> f() {
                return this.f19980f;
            }

            public final View g() {
                return this.f19981g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final rh h() {
                Drawable drawable;
                String str = this.f19975a;
                String str2 = this.f19976b;
                String str3 = this.f19977c;
                String str4 = this.f19978d;
                i8.o<Drawable> oVar = this.f19979e;
                if (oVar != null) {
                    Object i10 = oVar.i();
                    if (i8.o.f(i10)) {
                        i10 = null;
                    }
                    drawable = (Drawable) i10;
                } else {
                    drawable = null;
                }
                i8.o<WebView> oVar2 = this.f19980f;
                if (oVar2 != null) {
                    Object i11 = oVar2.i();
                    r5 = i8.o.f(i11) ? null : i11;
                }
                return new rh(str, str2, str3, str4, drawable, r5, this.f19981g);
            }

            public int hashCode() {
                String str = this.f19975a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f19976b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f19977c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f19978d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                i8.o<Drawable> oVar = this.f19979e;
                int e8 = (hashCode4 + (oVar == null ? 0 : i8.o.e(oVar.i()))) * 31;
                i8.o<WebView> oVar2 = this.f19980f;
                return ((e8 + (oVar2 != null ? i8.o.e(oVar2.i()) : 0)) * 31) + this.f19981g.hashCode();
            }

            public final String i() {
                return this.f19976b;
            }

            public final String j() {
                return this.f19977c;
            }

            public final String k() {
                return this.f19978d;
            }

            public final i8.o<Drawable> l() {
                return this.f19979e;
            }

            public final i8.o<WebView> m() {
                return this.f19980f;
            }

            public final View n() {
                return this.f19981g;
            }

            public final String o() {
                return this.f19975a;
            }

            public String toString() {
                return "Data(title=" + this.f19975a + ", advertiser=" + this.f19976b + ", body=" + this.f19977c + ", cta=" + this.f19978d + ", icon=" + this.f19979e + ", media=" + this.f19980f + ", privacyIcon=" + this.f19981g + ')';
            }
        }

        public b(a data) {
            kotlin.jvm.internal.n.f(data, "data");
            this.f19974a = data;
        }

        private static final void a(JSONObject jSONObject, String str) {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", i8.o.g(obj));
            Throwable d10 = i8.o.d(obj);
            if (d10 != null) {
                String message = d10.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            i8.w wVar = i8.w.f26638a;
            jSONObject.put(str, jSONObject2);
        }

        public final a a() {
            return this.f19974a;
        }

        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            if (this.f19974a.o() != null) {
                a(jSONObject, b9.h.D0);
            }
            if (this.f19974a.i() != null) {
                a(jSONObject, b9.h.F0);
            }
            if (this.f19974a.j() != null) {
                a(jSONObject, b9.h.E0);
            }
            if (this.f19974a.k() != null) {
                a(jSONObject, b9.h.G0);
            }
            i8.o<Drawable> l10 = this.f19974a.l();
            if (l10 != null) {
                a(jSONObject, b9.h.H0, l10.i());
            }
            i8.o<WebView> m7 = this.f19974a.m();
            if (m7 != null) {
                a(jSONObject, b9.h.I0, m7.i());
            }
            return jSONObject;
        }
    }

    public rh(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        kotlin.jvm.internal.n.f(privacyIcon, "privacyIcon");
        this.f19965a = str;
        this.f19966b = str2;
        this.f19967c = str3;
        this.f19968d = str4;
        this.f19969e = drawable;
        this.f19970f = webView;
        this.f19971g = privacyIcon;
    }

    public static /* synthetic */ rh a(rh rhVar, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rhVar.f19965a;
        }
        if ((i10 & 2) != 0) {
            str2 = rhVar.f19966b;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = rhVar.f19967c;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = rhVar.f19968d;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            drawable = rhVar.f19969e;
        }
        Drawable drawable2 = drawable;
        if ((i10 & 32) != 0) {
            webView = rhVar.f19970f;
        }
        WebView webView2 = webView;
        if ((i10 & 64) != 0) {
            view = rhVar.f19971g;
        }
        return rhVar.a(str, str5, str6, str7, drawable2, webView2, view);
    }

    public final rh a(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        kotlin.jvm.internal.n.f(privacyIcon, "privacyIcon");
        return new rh(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    public final String a() {
        return this.f19965a;
    }

    public final String b() {
        return this.f19966b;
    }

    public final String c() {
        return this.f19967c;
    }

    public final String d() {
        return this.f19968d;
    }

    public final Drawable e() {
        return this.f19969e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rh) {
            rh rhVar = (rh) obj;
            return kotlin.jvm.internal.n.a(this.f19965a, rhVar.f19965a) && kotlin.jvm.internal.n.a(this.f19966b, rhVar.f19966b) && kotlin.jvm.internal.n.a(this.f19967c, rhVar.f19967c) && kotlin.jvm.internal.n.a(this.f19968d, rhVar.f19968d) && kotlin.jvm.internal.n.a(this.f19969e, rhVar.f19969e) && kotlin.jvm.internal.n.a(this.f19970f, rhVar.f19970f) && kotlin.jvm.internal.n.a(this.f19971g, rhVar.f19971g);
        }
        return false;
    }

    public final WebView f() {
        return this.f19970f;
    }

    public final View g() {
        return this.f19971g;
    }

    public final String h() {
        return this.f19966b;
    }

    public int hashCode() {
        String str = this.f19965a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19966b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19967c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19968d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.f19969e;
        int hashCode5 = (hashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f19970f;
        return ((hashCode5 + (webView != null ? webView.hashCode() : 0)) * 31) + this.f19971g.hashCode();
    }

    public final String i() {
        return this.f19967c;
    }

    public final String j() {
        return this.f19968d;
    }

    public final Drawable k() {
        return this.f19969e;
    }

    public final WebView l() {
        return this.f19970f;
    }

    public final View m() {
        return this.f19971g;
    }

    public final String n() {
        return this.f19965a;
    }

    public String toString() {
        return "ISNNativeAdData(title=" + this.f19965a + ", advertiser=" + this.f19966b + ", body=" + this.f19967c + ", cta=" + this.f19968d + ", icon=" + this.f19969e + ", mediaView=" + this.f19970f + ", privacyIcon=" + this.f19971g + ')';
    }
}
