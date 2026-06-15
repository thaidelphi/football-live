package com.applovin.impl;

import com.applovin.impl.e7;
import com.applovin.impl.u5;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class d6 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final i7 f6812g;

    /* renamed from: h  reason: collision with root package name */
    private final AppLovinAdLoadListener f6813h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d6(i7 i7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskRenderVastAd", jVar);
        this.f6813h = appLovinAdLoadListener;
        this.f6812g = i7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "Rendering VAST ad...");
        }
        int size = this.f6812g.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        n7 n7Var = null;
        r7 r7Var = null;
        h7 h7Var = null;
        g7 g7Var = null;
        String str2 = "";
        for (f8 f8Var : this.f6812g.a()) {
            f8 b10 = f8Var.b(q7.b(f8Var) ? "Wrapper" : "InLine");
            if (b10 != null) {
                f8 b11 = b10.b("AdSystem");
                if (b11 != null) {
                    n7Var = n7.a(b11, n7Var, this.f9827a);
                }
                str = q7.a(b10, "AdTitle", str);
                str2 = q7.a(b10, "Description", str2);
                q7.a(b10.a("Impression"), hashSet, this.f6812g, this.f9827a);
                f8 c10 = b10.c("ViewableImpression");
                if (c10 != null) {
                    q7.a(c10.a("Viewable"), hashSet, this.f6812g, this.f9827a);
                }
                f8 b12 = b10.b("AdVerifications");
                if (b12 != null) {
                    g7Var = g7.a(b12, g7Var, this.f6812g, this.f9827a);
                }
                q7.a(b10.a("Error"), hashSet2, this.f6812g, this.f9827a);
                f8 c11 = b10.c("Creatives");
                if (c11 != null) {
                    for (f8 f8Var2 : c11.b()) {
                        f8 c12 = f8Var2.c("Linear");
                        if (c12 != null) {
                            r7Var = r7.a(c12, r7Var, this.f6812g, this.f9827a);
                        } else {
                            f8 b13 = f8Var2.b("CompanionAds");
                            if (b13 != null) {
                                f8 b14 = b13.b("Companion");
                                if (b14 != null) {
                                    h7Var = h7.a(b14, h7Var, this.f6812g, this.f9827a);
                                }
                            } else if (com.applovin.impl.sdk.n.a()) {
                                this.f9829c.b(this.f9828b, "Received and will skip rendering for an unidentified creative: " + f8Var2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.b(this.f9828b, "Did not find wrapper or inline response for node: " + f8Var);
            }
        }
        e7 a10 = new e7.b().a(this.f9827a).a(this.f6812g.b()).b(this.f6812g.e()).a(this.f6812g.c()).b(str).a(str2).a(n7Var).a(r7Var).a(h7Var).a(g7Var).b(hashSet).a(g7Var).a(hashSet2).a();
        j7 c13 = q7.c(a10);
        if (c13 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Finished rendering VAST ad: " + a10);
            }
            a10.getAdEventTracker().e();
            this.f9827a.i0().a((z4) new e5(a10, this.f9827a, this.f6813h), u5.b.CACHING);
            return;
        }
        q7.a(this.f6812g, this.f6813h, c13, -6, this.f9827a);
    }
}
