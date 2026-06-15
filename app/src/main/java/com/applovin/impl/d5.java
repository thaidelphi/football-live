package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.b0;
import com.applovin.impl.c5;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d5 extends c5 {

    /* renamed from: p  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f6807p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6808q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6809r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements b0.a {
        a() {
        }

        @Override // com.applovin.impl.b0.a
        public void a(Uri uri) {
            if (uri != null) {
                d5.this.f6807p.k1();
                d5.this.f6807p.d(uri);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements c5.e {
        b() {
        }

        @Override // com.applovin.impl.c5.e
        public void a(String str) {
            d5.this.f6807p.b(d5.this.d(str));
            d5.this.f6807p.b(true);
            com.applovin.impl.sdk.n nVar = d5.this.f9829c;
            if (com.applovin.impl.sdk.n.a()) {
                d5 d5Var = d5.this;
                com.applovin.impl.sdk.n nVar2 = d5Var.f9829c;
                String str2 = d5Var.f9828b;
                nVar2.a(str2, "Finish caching non-video resources for ad #" + d5.this.f6807p.getAdIdNumber());
            }
            d5 d5Var2 = d5.this;
            com.applovin.impl.sdk.n nVar3 = d5Var2.f9829c;
            String str3 = d5Var2.f9828b;
            nVar3.f(str3, "Ad updated with cachedHTML = " + d5.this.f6807p.e1());
        }
    }

    public d5(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, jVar, appLovinAdLoadListener);
        this.f6807p = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (d7.h(com.applovin.impl.sdk.j.m())) {
            str = d7.c(str);
        }
        return this.f6807p.isOpenMeasurementEnabled() ? this.f9827a.V().a(str) : str;
    }

    private void m() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "Caching HTML resources...");
        }
        this.f6807p.b(d(a(this.f6807p.e1(), this.f6807p.Y(), this.f6807p)));
        this.f6807p.b(true);
        a(this.f6807p);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Finish caching non-video resources for ad #" + this.f6807p.getAdIdNumber());
        }
        com.applovin.impl.sdk.n nVar2 = this.f9829c;
        String str2 = this.f9828b;
        nVar2.f(str2, "Ad updated with cachedHTML = " + this.f6807p.e1());
    }

    private void n() {
        Uri c10;
        if (l() || (c10 = c(this.f6807p.i1())) == null) {
            return;
        }
        this.f6807p.k1();
        this.f6807p.d(c10);
    }

    private a0 o() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "Caching HTML resources...");
        }
        return a(this.f6807p.e1(), this.f6807p.Y(), new b());
    }

    private b0 p() {
        return b(this.f6807p.i1(), new a());
    }

    public void b(boolean z10) {
        this.f6809r = z10;
    }

    public void c(boolean z10) {
        this.f6808q = z10;
    }

    @Override // com.applovin.impl.c5, java.lang.Runnable
    public void run() {
        super.run();
        boolean G0 = this.f6807p.G0();
        boolean z10 = this.f6809r;
        if (!G0 && !z10) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.a(str, "Begin processing for non-streaming ad #" + this.f6807p.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f9827a.a(o4.K0)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (!l0.f()) {
                    arrayList.addAll(e());
                }
                a0 o10 = o();
                if (o10 != null) {
                    arrayList.add(o10);
                }
                b0 p10 = p();
                if (p10 != null) {
                    arrayList.add(p10);
                }
                a(arrayList);
                f();
            } else {
                j();
                m();
                n();
                f();
            }
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9829c;
                String str2 = this.f9828b;
                nVar2.a(str2, "Begin caching for streaming ad #" + this.f6807p.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f9827a.a(o4.K0)).booleanValue()) {
                if (!l0.f()) {
                    a(e());
                }
                ArrayList arrayList2 = new ArrayList();
                if (G0) {
                    if (this.f6808q) {
                        f();
                        a0 o11 = o();
                        if (o11 != null) {
                            arrayList2.add(o11);
                        }
                        b0 p11 = p();
                        if (p11 != null) {
                            arrayList2.add(p11);
                        }
                    } else {
                        a0 o12 = o();
                        if (o12 != null) {
                            a(Arrays.asList(o12));
                        }
                        f();
                        b0 p12 = p();
                        if (p12 != null) {
                            arrayList2.add(p12);
                        }
                    }
                } else {
                    f();
                    a0 o13 = o();
                    if (o13 != null) {
                        arrayList2.add(o13);
                    }
                }
                a(arrayList2);
                f();
            } else {
                j();
                if (G0) {
                    if (this.f6808q) {
                        f();
                    }
                    m();
                    if (!this.f6808q) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        }
        k();
    }
}
