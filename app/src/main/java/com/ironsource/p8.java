package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class p8 implements tc {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f19695a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19696a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final boolean f19697b = false;

        private a() {
        }
    }

    public p8(JSONObject jSONObject) {
        this.f19695a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.tc
    public boolean c() {
        return this.f19695a.optBoolean("clickCheck", false);
    }
}
