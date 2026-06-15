package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.ironsource.in;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i6 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final i7 f7230g;

    /* renamed from: h  reason: collision with root package name */
    private final AppLovinAdLoadListener f7231h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i6(i7 i7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskResolveVastWrapper", jVar);
        this.f7231h = appLovinAdLoadListener;
        this.f7230g = i7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a10 = q7.a(this.f7230g);
        if (StringUtils.isValidString(a10)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.a(str, "Resolving VAST ad with depth " + this.f7230g.d() + " at " + a10);
            }
            try {
                this.f9827a.i0().a(new a(com.applovin.impl.sdk.network.a.a(this.f9827a).b(a10).c(in.f17848a).a(f8.f6992f).a(((Integer) this.f9827a.a(o4.C4)).intValue()).c(((Integer) this.f9827a.a(o4.D4)).intValue()).a(false).a(), this.f9827a));
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9829c.a(this.f9828b, "Unable to resolve VAST wrapper", th);
                }
                a(-1);
                return;
            }
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.b(this.f9828b, "Resolving VAST failed. Could not find resolution URL");
        }
        a(-1);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends e6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, f8 f8Var, int i10) {
            this.f9827a.i0().a(a6.a(f8Var, i6.this.f7230g, i6.this.f7231h, i6.this.f9827a));
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, f8 f8Var) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str3 = this.f9828b;
                nVar.b(str3, "Unable to resolve VAST wrapper. Server returned " + i10);
            }
            i6.this.a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.b(str, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f7231h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
                return;
            }
            return;
        }
        q7.a(this.f7230g, this.f7231h, i10 == -1001 ? j7.TIMED_OUT : j7.GENERAL_WRAPPER_ERROR, i10, this.f9827a);
    }
}
