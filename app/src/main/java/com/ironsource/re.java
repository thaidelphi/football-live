package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class re implements ne {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f19940a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final boolean f19942b = false;

        /* renamed from: d  reason: collision with root package name */
        public static final int f19944d = 24;

        /* renamed from: a  reason: collision with root package name */
        public static final a f19941a = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final int f19943c = se.SendEvent.b();

        private a() {
        }

        public final int a() {
            return f19943c;
        }
    }

    public re(JSONObject jSONObject) {
        this.f19940a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.ne
    public long a() {
        return this.f19940a.optInt("timeout", 24) * 1000;
    }

    @Override // com.ironsource.ne
    public se b() {
        return se.f20649b.a(this.f19940a.optInt("strategy", a.f19941a.a()));
    }

    @Override // com.ironsource.tc
    public boolean c() {
        return this.f19940a.optBoolean(com.ironsource.mediationsdk.metadata.a.f18927j, false);
    }
}
