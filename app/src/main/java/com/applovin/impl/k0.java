package com.applovin.impl;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k0 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final String f7379g;

    /* renamed from: h  reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f7380h;

    public k0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
        super("CommunicatorRequestTask", jVar, str);
        this.f7379g = str;
        this.f7380h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9827a.i0().a(new a(this.f7380h, this.f9827a, d()));
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends e6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z10) {
            super(aVar, jVar, z10);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f9827a.q().a(k0.this.f7379g, k0.this.f7380h.f(), i10, jSONObject, null, true);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f9827a.q().a(k0.this.f7379g, k0.this.f7380h.f(), i10, jSONObject, str2, false);
        }
    }
}
