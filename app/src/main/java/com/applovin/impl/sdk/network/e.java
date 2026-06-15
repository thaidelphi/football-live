package com.applovin.impl.sdk.network;

import com.applovin.impl.l4;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.network.a;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* renamed from: s  reason: collision with root package name */
    private String f9112s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9113t;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends a.C0138a {

        /* renamed from: r  reason: collision with root package name */
        private String f9114r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f9115s;

        public a(j jVar) {
            super(jVar);
            this.f9061h = ((Integer) jVar.a(o4.J2)).intValue();
            this.f9062i = ((Integer) jVar.a(o4.I2)).intValue();
            this.f9063j = ((Integer) jVar.a(o4.S2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: d */
        public a a(String str) {
            this.f9056c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: e */
        public a b(int i10) {
            this.f9063j = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: f */
        public a b(String str) {
            this.f9055b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: g */
        public a c(String str) {
            this.f9054a = str;
            return this;
        }

        public a h(boolean z10) {
            this.f9115s = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: i */
        public a b(boolean z10) {
            this.f9069p = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: d */
        public a b(Map map) {
            this.f9057d = map;
            return this;
        }

        public a e(String str) {
            this.f9114r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: f */
        public a c(int i10) {
            this.f9062i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: g */
        public a a(boolean z10) {
            this.f9067n = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: c */
        public a a(Map map) {
            this.f9058e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: d */
        public a a(int i10) {
            this.f9061h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: b */
        public a a(JSONObject jSONObject) {
            this.f9059f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: b */
        public a a(Object obj) {
            this.f9060g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: b */
        public a a(l4.a aVar) {
            this.f9070q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0138a
        /* renamed from: b */
        public e a() {
            return new e(this);
        }
    }

    protected e(a aVar) {
        super(aVar);
        this.f9112s = aVar.f9114r;
        this.f9113t = aVar.f9115s;
    }

    public static a b(j jVar) {
        return new a(jVar);
    }

    public String s() {
        return this.f9112s;
    }

    public boolean t() {
        return this.f9112s != null;
    }

    public boolean u() {
        return this.f9113t;
    }
}
