package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.u5;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b5 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final List f6704g;

    /* renamed from: h  reason: collision with root package name */
    private final Activity f6705h;

    public b5(List list, Activity activity, com.applovin.impl.sdk.j jVar) {
        super("TaskAutoInitAdapters", jVar, true);
        this.f6704g = list;
        this.f6705h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(d3 d3Var) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Auto-initing adapter: " + d3Var);
        }
        this.f9827a.K().a(d3Var, this.f6705h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f6704g.size() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                StringBuilder sb = new StringBuilder();
                sb.append("Auto-initing ");
                sb.append(this.f6704g.size());
                sb.append(" adapters");
                sb.append(this.f9827a.k0().c() ? " in test mode" : "");
                sb.append("...");
                nVar.a(str, sb.toString());
            }
            if (TextUtils.isEmpty(this.f9827a.N())) {
                this.f9827a.f(AppLovinMediationProvider.MAX);
            } else if (!this.f9827a.y0()) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f9827a.N());
            }
            if (this.f6705h == null) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (final d3 d3Var : this.f6704g) {
                if (d3Var.s()) {
                    this.f9827a.i0().a(new Runnable() { // from class: com.applovin.impl.g9
                        @Override // java.lang.Runnable
                        public final void run() {
                            b5.this.a(d3Var);
                        }
                    }, u5.b.MEDIATION);
                } else {
                    this.f9827a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n I = this.f9827a.I();
                        String str2 = this.f9828b;
                        I.a(str2, "Skipping eager auto-init for adapter " + d3Var);
                    }
                }
            }
        }
    }
}
