package com.ironsource;

import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class xn {

    /* renamed from: a  reason: collision with root package name */
    private final i5 f21414a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f21415b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21416a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final String f21417b = "adm";

        /* renamed from: c  reason: collision with root package name */
        public static final String f21418c = "isOneFlow";

        /* renamed from: d  reason: collision with root package name */
        public static final String f21419d = "isMultipleAdObjects";

        /* renamed from: e  reason: collision with root package name */
        public static final String f21420e = "adsInternalInfo";

        /* renamed from: f  reason: collision with root package name */
        public static final String f21421f = "success";

        /* renamed from: g  reason: collision with root package name */
        public static final String f21422g = "error";

        /* renamed from: h  reason: collision with root package name */
        public static final String f21423h = "data";

        private a() {
        }
    }

    public xn() {
        this(null, false, 3, null);
    }

    public xn(i5 i5Var, boolean z10) {
        this.f21414a = i5Var;
        this.f21415b = z10;
    }

    public /* synthetic */ xn(i5 i5Var, boolean z10, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? null : i5Var, (i10 & 2) != 0 ? false : z10);
    }

    public final HashMap<String, String> a() {
        n5 g10;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("isOneFlow", String.valueOf(this.f21415b));
        hashMap.put("isMultipleAdObjects", com.ironsource.mediationsdk.metadata.a.f18924g);
        List<o0> a10 = mm.f19249r.d().F().a();
        String jSONObject = (a10 != null ? new JSONObject().put("success", true).put("data", a10) : new JSONObject().put("success", false).put(a.f21422g, "Failed to get ad internal info")).toString();
        kotlin.jvm.internal.n.e(jSONObject, "if (jsonAdInternalInfo !…    .toString()\n        }");
        hashMap.put(a.f21420e, jSONObject);
        i5 i5Var = this.f21414a;
        if (i5Var != null && (g10 = i5Var.g()) != null) {
            hashMap.put("adm", g10.a());
            hashMap.putAll(g10.b());
        }
        return hashMap;
    }
}
