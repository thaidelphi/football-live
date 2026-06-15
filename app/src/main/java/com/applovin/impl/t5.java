package com.applovin.impl;

import android.app.Activity;
import com.adcolony.sdk.AdColonyAppOptions;
import com.applovin.impl.u5;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t5 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9284g;

    public t5(com.applovin.impl.sdk.j jVar) {
        super("TaskInitializeSdk", jVar, true);
        this.f9284g = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f9284g.K().a(this.f9284g.e().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        d8.f(this.f9284g);
    }

    private void g() {
        if (this.f9284g.K().c()) {
            return;
        }
        Activity m02 = this.f9284g.m0();
        if (m02 != null) {
            this.f9284g.K().a(m02);
        } else {
            this.f9284g.i0().a(new k6(this.f9284g, true, "initializeAdapters", new Runnable() { // from class: com.applovin.impl.je
                @Override // java.lang.Runnable
                public final void run() {
                    t5.this.e();
                }
            }), u5.b.CORE, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    private void h() {
        String str;
        boolean c10 = this.f9284g.g0().c();
        Map m7 = this.f9284g.x().m();
        Map G = this.f9284g.x().G();
        String a10 = c10 ? this.f9284g.x().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (c10) {
            str = m7.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        n2 n2Var = new n2();
        n2Var.a().a("=====AppLovin SDK=====");
        n2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f9284g.a(o4.J3)).a("Ad Review Version", f.b()).a("OM SDK Version", this.f9284g.V().c());
        n2Var.a("===Device Info===").a("OS", d7.d()).a(IronSourceConstants.TYPE_GAID, a10).a("App Set ID", str).a("Model", m7.get(com.ironsource.fe.B)).a("Locale", m7.get("locale")).a("Emulator", m7.get("sim")).a("Tablet", m7.get("is_tablet"));
        n2Var.a("===App Info===").a("Application ID", G.get(b9.h.V)).a("Target SDK", G.get("target_sdk"));
        n2Var.a("===SDK Settings===").a("SDK Key", this.f9284g.a0()).a("Mediation Provider", this.f9284g.N()).a("TG", c7.a(this.f9284g)).a("MD", this.f9284g.a(o4.f8226u)).a("Test Mode On", Boolean.valueOf(this.f9284g.k0().c())).a("Verbose Logging On", Boolean.valueOf(c10));
        n2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(m0.a(a()));
        n2Var.a("===MAX Terms and Privcay Policy Flow===");
        q0 u10 = this.f9284g.u();
        boolean j10 = u10.j();
        n2Var.a("Enabled", Boolean.valueOf(j10));
        if (j10) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f9284g.s().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography d10 = u10.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            n2Var.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? AdColonyAppOptions.GDPR : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
            if (d7.c(this.f9284g)) {
                if (d10 == consentFlowUserGeography2) {
                    str2 = AdColonyAppOptions.GDPR;
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = "None";
                }
                n2Var.a("Debug User Geography", str2);
            }
        }
        n2Var.a("Privacy Policy URI", u10.f()).a("Terms of Service URI", u10.h());
        n2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f9284g.j0().j());
        n2Var.a();
        com.applovin.impl.sdk.n.g("AppLovinSdk", n2Var.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x01b3, code lost:
        if (r12.f9284g.s0() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x023a, code lost:
        if (r12.f9284g.s0() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023d, code lost:
        r2 = com.ironsource.b9.h.f16676t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023e, code lost:
        r10.append(r2);
        r10.append(" in ");
        r10.append(java.lang.System.currentTimeMillis() - r6);
        r10.append("ms");
        r8.a(r9, r10.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0256, code lost:
        return;
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.t5.run():void");
    }
}
