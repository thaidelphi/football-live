package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class o8 implements tc {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f19524a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19525a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final boolean f19526b = false;

        /* renamed from: c  reason: collision with root package name */
        public static final String f19527c = "curlError";

        private a() {
        }
    }

    public o8(JSONObject jSONObject) {
        this.f19524a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.tc
    public boolean c() {
        return this.f19524a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.f19524a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.f19524a.optBoolean("reportController", true);
    }
}
