package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.adcolony.sdk.e0;
import com.ironsource.b9;
import com.ironsource.ug;
import com.unity3d.services.UnityAdsConstants;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.f(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements j0 {
        b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.a(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements j0 {
        c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.c(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements j0 {
        d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.n(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements j0 {
        e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.j(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements j0 {
        f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.i(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6374a;

        g(x0 x0Var, String str) {
            this.f6374a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 b10 = c0.b();
            c0.a(b10, "type", "open_hook");
            c0.a(b10, "message", this.f6374a);
            new h0("CustomMessage.controller_send", 0, b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements j0 {
        h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.h(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements j0 {
        i() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.m(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j implements j0 {
        j() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.k(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class k implements j0 {
        k() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.o(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class l implements j0 {
        l() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.g(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class m implements j0 {
        m() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.e(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class n implements j0 {
        n() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.d(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class o implements j0 {
        o() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.b(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class p implements j0 {
        p() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.l(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(h0 h0Var) {
        f1 a10 = h0Var.a();
        com.adcolony.sdk.d c10 = com.adcolony.sdk.a.b().c();
        String h10 = c0.h(a10, "ad_session_id");
        AdColonyInterstitial adColonyInterstitial = c10.f().get(h10);
        AdColonyAdView adColonyAdView = c10.d().get(h10);
        if ((adColonyInterstitial == null || adColonyInterstitial.getListener() == null || adColonyInterstitial.d() == null) && (adColonyAdView == null || adColonyAdView.getListener() == null)) {
            return false;
        }
        if (adColonyAdView == null) {
            new h0("AdUnit.make_in_app_purchase", adColonyInterstitial.d().k()).c();
        }
        a(h10);
        b(h10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(h0 h0Var) {
        f1 a10 = h0Var.a();
        String h10 = c0.h(c0.f(a10, "clickOverride"), "url");
        String h11 = c0.h(a10, "ad_session_id");
        com.adcolony.sdk.d c10 = com.adcolony.sdk.a.b().c();
        AdColonyInterstitial adColonyInterstitial = c10.f().get(h11);
        AdColonyAdView adColonyAdView = c10.d().get(h11);
        if (adColonyInterstitial != null) {
            adColonyInterstitial.b(h10);
            return true;
        } else if (adColonyAdView != null) {
            adColonyAdView.setClickOverride(h10);
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(h0 h0Var) {
        int orientation;
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, "ad_session_id");
        int d10 = c0.d(a10, "orientation");
        com.adcolony.sdk.d c10 = com.adcolony.sdk.a.b().c();
        AdColonyAdView adColonyAdView = c10.d().get(h10);
        AdColonyInterstitial adColonyInterstitial = c10.f().get(h10);
        Context a11 = com.adcolony.sdk.a.a();
        if (adColonyAdView != null) {
            adColonyAdView.setOrientation(d10);
        } else if (adColonyInterstitial != null) {
            adColonyInterstitial.a(d10);
        }
        if (adColonyInterstitial == null && adColonyAdView == null) {
            new e0.a().a("Invalid ad session id sent with set orientation properties message: ").a(h10).a(e0.f5981i);
            return false;
        } else if (a11 instanceof com.adcolony.sdk.b) {
            com.adcolony.sdk.b bVar = (com.adcolony.sdk.b) a11;
            if (adColonyAdView == null) {
                orientation = adColonyInterstitial.f();
            } else {
                orientation = adColonyAdView.getOrientation();
            }
            bVar.a(orientation);
            return true;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(h0 h0Var) {
        AdColonyAdView adColonyAdView = com.adcolony.sdk.a.b().c().d().get(c0.h(h0Var.a(), "ad_session_id"));
        if (adColonyAdView == null) {
            return false;
        }
        adColonyAdView.setNoCloseButton(c0.b(h0Var.a(), "use_custom_close"));
        return true;
    }

    boolean g(h0 h0Var) {
        f1 b10 = c0.b();
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, "url");
        String h11 = c0.h(a10, "ad_session_id");
        AdColonyAdView adColonyAdView = com.adcolony.sdk.a.b().c().d().get(h11);
        if (adColonyAdView == null || adColonyAdView.getTrustedDemandSource() || adColonyAdView.c()) {
            if (h10.startsWith("browser")) {
                h10 = h10.replaceFirst("browser", "http");
            }
            if (h10.startsWith("safari")) {
                h10 = h10.replaceFirst("safari", "http");
            }
            d(h10);
            if (z0.a(new Intent("android.intent.action.VIEW", Uri.parse(h10)))) {
                c0.b(b10, "success", true);
                h0Var.a(b10).c();
                c(h11);
                a(h11);
                b(h11);
                return true;
            }
            z0.a("Failed to launch browser.", 0);
            c0.b(b10, "success", false);
            h0Var.a(b10).c();
            return false;
        }
        return false;
    }

    boolean h(h0 h0Var) {
        f1 b10 = c0.b();
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, "product_id");
        String h11 = c0.h(a10, "ad_session_id");
        if (h10.equals("")) {
            h10 = c0.h(a10, "handle");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(h10));
        d(h10);
        if (z0.a(intent)) {
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            c(h11);
            a(h11);
            b(h11);
            return true;
        }
        z0.a("Unable to open.", 0);
        c0.b(b10, "success", false);
        h0Var.a(b10).c();
        return false;
    }

    boolean k(h0 h0Var) {
        f1 a10 = h0Var.a();
        f1 b10 = c0.b();
        String h10 = c0.h(a10, "ad_session_id");
        e1 a11 = c0.a(a10, "recipients");
        String str = "";
        for (int i10 = 0; i10 < a11.b(); i10++) {
            if (i10 != 0) {
                str = str + ";";
            }
            str = str + c0.b(a11, i10);
        }
        if (z0.a(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + str)).putExtra("sms_body", c0.h(a10, b9.h.E0)))) {
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            c(h10);
            a(h10);
            b(h10);
            return true;
        }
        z0.a("Failed to create sms.", 0);
        c0.b(b10, "success", false);
        h0Var.a(b10).c();
        return false;
    }

    boolean l(h0 h0Var) {
        f1 b10 = c0.b();
        f1 a10 = h0Var.a();
        Intent type = new Intent("android.intent.action.SEND").setType("text/plain");
        Intent putExtra = type.putExtra("android.intent.extra.TEXT", c0.h(a10, b9.h.K0) + " " + c0.h(a10, "url"));
        String h10 = c0.h(a10, "ad_session_id");
        if (z0.a(putExtra, true)) {
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            c(h10);
            a(h10);
            b(h10);
            return true;
        }
        z0.a("Unable to create social post.", 0);
        c0.b(b10, "success", false);
        h0Var.a(b10).c();
        return false;
    }

    boolean m(h0 h0Var) {
        f1 b10 = c0.b();
        f1 a10 = h0Var.a();
        Intent intent = new Intent("android.intent.action.DIAL");
        Intent data = intent.setData(Uri.parse("tel:" + c0.h(a10, "phone_number")));
        String h10 = c0.h(a10, "ad_session_id");
        if (z0.a(data)) {
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            c(h10);
            a(h10);
            b(h10);
            return true;
        }
        z0.a("Failed to dial number.", 0);
        c0.b(b10, "success", false);
        h0Var.a(b10).c();
        return false;
    }

    boolean o(h0 h0Var) {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return false;
        }
        int a11 = c0.a(h0Var.a(), "length_ms", (int) UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        f1 b10 = c0.b();
        e1 e8 = z0.e(a10);
        boolean z10 = false;
        for (int i10 = 0; i10 < e8.b(); i10++) {
            if (c0.b(e8, i10).equals("android.permission.VIBRATE")) {
                z10 = true;
            }
        }
        if (!z10) {
            new e0.a().a("No vibrate permission detected.").a(e0.f5978f);
            c0.b(b10, "success", false);
            h0Var.a(b10).c();
            return false;
        } else if (Build.VERSION.SDK_INT >= 11 && z0.a(a10, a11)) {
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            return true;
        } else {
            c0.b(b10, "success", false);
            h0Var.a(b10).c();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        com.adcolony.sdk.a.a("System.open_store", new h());
        com.adcolony.sdk.a.a("System.telephone", new i());
        com.adcolony.sdk.a.a("System.sms", new j());
        com.adcolony.sdk.a.a("System.vibrate", new k());
        com.adcolony.sdk.a.a("System.open_browser", new l());
        com.adcolony.sdk.a.a("System.mail", new m());
        com.adcolony.sdk.a.a("System.launch_app", new n());
        com.adcolony.sdk.a.a("System.create_calendar_event", new o());
        com.adcolony.sdk.a.a("System.social_post", new p());
        com.adcolony.sdk.a.a("System.make_in_app_purchase", new a());
        com.adcolony.sdk.a.a("System.close", new b());
        com.adcolony.sdk.a.a("System.expand", new c());
        com.adcolony.sdk.a.a("System.use_custom_close", new d());
        com.adcolony.sdk.a.a("System.set_orientation_properties", new e());
        com.adcolony.sdk.a.a("System.click_override", new f());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean b(com.adcolony.sdk.h0 r25) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.x0.b(com.adcolony.sdk.h0):boolean");
    }

    boolean c(h0 h0Var) {
        f1 a10 = h0Var.a();
        Context a11 = com.adcolony.sdk.a.a();
        if (a11 != null && com.adcolony.sdk.a.d()) {
            String h10 = c0.h(a10, "ad_session_id");
            com.adcolony.sdk.k b10 = com.adcolony.sdk.a.b();
            AdColonyAdView adColonyAdView = b10.c().d().get(h10);
            if (adColonyAdView != null && ((adColonyAdView.getTrustedDemandSource() || adColonyAdView.c()) && b10.k() != adColonyAdView)) {
                adColonyAdView.setExpandMessage(h0Var);
                adColonyAdView.setExpandedWidth(c0.d(a10, "width"));
                adColonyAdView.setExpandedHeight(c0.d(a10, "height"));
                adColonyAdView.setOrientation(c0.a(a10, "orientation", -1));
                adColonyAdView.setNoCloseButton(c0.b(a10, "use_custom_close"));
                b10.a(adColonyAdView);
                b10.a(adColonyAdView.getContainer());
                Intent intent = new Intent(a11, AdColonyAdViewActivity.class);
                b(h10);
                a(h10);
                z0.a(intent);
                return true;
            }
        }
        return false;
    }

    boolean d(h0 h0Var) {
        f1 b10 = c0.b();
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, "ad_session_id");
        if (c0.b(a10, "deep_link")) {
            return h(h0Var);
        }
        Context a11 = com.adcolony.sdk.a.a();
        if (a11 == null) {
            return false;
        }
        if (z0.a(a11.getPackageManager().getLaunchIntentForPackage(c0.h(a10, "handle")))) {
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            c(h10);
            a(h10);
            b(h10);
            return true;
        }
        z0.a("Failed to launch external application.", 0);
        c0.b(b10, "success", false);
        h0Var.a(b10).c();
        return false;
    }

    boolean e(h0 h0Var) {
        f1 b10 = c0.b();
        f1 a10 = h0Var.a();
        e1 a11 = c0.a(a10, "recipients");
        boolean b11 = c0.b(a10, "html");
        String h10 = c0.h(a10, "subject");
        String h11 = c0.h(a10, b9.h.E0);
        String h12 = c0.h(a10, "ad_session_id");
        String[] strArr = new String[a11.b()];
        for (int i10 = 0; i10 < a11.b(); i10++) {
            strArr[i10] = c0.b(a11, i10);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (!b11) {
            intent.setType("plain/text");
        }
        intent.putExtra("android.intent.extra.SUBJECT", h10).putExtra("android.intent.extra.TEXT", h11).putExtra("android.intent.extra.EMAIL", strArr);
        if (z0.a(intent)) {
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            c(h12);
            a(h12);
            b(h12);
            return true;
        }
        z0.a("Failed to send email.", 0);
        c0.b(b10, "success", false);
        h0Var.a(b10).c();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), "ad_session_id");
        Activity activity = com.adcolony.sdk.a.a() instanceof Activity ? (Activity) com.adcolony.sdk.a.a() : null;
        boolean z10 = activity instanceof AdColonyAdViewActivity;
        if (activity instanceof com.adcolony.sdk.b) {
            if (z10) {
                ((AdColonyAdViewActivity) activity).b();
                return true;
            }
            f1 b10 = c0.b();
            c0.a(b10, ug.f21009x, h10);
            new h0("AdSession.on_request_close", ((com.adcolony.sdk.b) activity).f5807c, b10).c();
            return true;
        }
        return false;
    }

    private void d(String str) {
        if (z0.a(new g(this, str))) {
            return;
        }
        new e0.a().a("Executing ADCSystem.sendOpenCustomMessage failed").a(e0.f5981i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str) {
        com.adcolony.sdk.d c10 = com.adcolony.sdk.a.b().c();
        AdColonyInterstitial adColonyInterstitial = c10.f().get(str);
        if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
            adColonyInterstitial.getListener().onLeftApplication(adColonyInterstitial);
            return;
        }
        AdColonyAdView adColonyAdView = c10.d().get(str);
        AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
        if (adColonyAdView == null || listener == null) {
            return;
        }
        listener.onLeftApplication(adColonyAdView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        com.adcolony.sdk.d c10 = com.adcolony.sdk.a.b().c();
        AdColonyInterstitial adColonyInterstitial = c10.f().get(str);
        if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null && adColonyInterstitial.h()) {
            adColonyInterstitial.getListener().onClicked(adColonyInterstitial);
            return;
        }
        AdColonyAdView adColonyAdView = c10.d().get(str);
        AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
        if (adColonyAdView == null || listener == null || !adColonyAdView.c()) {
            return;
        }
        listener.onClicked(adColonyAdView);
    }

    private boolean b(String str) {
        if (com.adcolony.sdk.a.b().c().d().get(str) == null) {
            return false;
        }
        f1 b10 = c0.b();
        c0.a(b10, "ad_session_id", str);
        new h0("MRAID.on_event", 1, b10).c();
        return true;
    }
}
