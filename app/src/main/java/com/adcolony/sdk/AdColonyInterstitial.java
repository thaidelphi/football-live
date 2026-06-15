package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import com.adcolony.sdk.e0;
import com.adcolony.sdk.z0;
import com.appnext.banners.BannerAdRequest;
import com.ironsource.ug;
import com.ironsource.x8;
import com.unity3d.services.core.di.ServiceProvider;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyInterstitial {
    public static final int ADCOLONY_IAP_ENGAGEMENT_END_CARD = 0;
    public static final int ADCOLONY_IAP_ENGAGEMENT_OVERLAY = 1;

    /* renamed from: a  reason: collision with root package name */
    private AdColonyInterstitialListener f5696a;

    /* renamed from: b  reason: collision with root package name */
    private f f5697b;

    /* renamed from: c  reason: collision with root package name */
    private com.adcolony.sdk.c f5698c;

    /* renamed from: d  reason: collision with root package name */
    private AdColonyAdOptions f5699d;

    /* renamed from: e  reason: collision with root package name */
    private p0 f5700e;

    /* renamed from: f  reason: collision with root package name */
    private int f5701f;

    /* renamed from: g  reason: collision with root package name */
    private String f5702g;

    /* renamed from: h  reason: collision with root package name */
    private String f5703h;

    /* renamed from: i  reason: collision with root package name */
    private final String f5704i;

    /* renamed from: j  reason: collision with root package name */
    private String f5705j;

    /* renamed from: k  reason: collision with root package name */
    private String f5706k;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5708m;

    /* renamed from: n  reason: collision with root package name */
    private String f5709n;

    /* renamed from: o  reason: collision with root package name */
    final z0.b f5710o = new a();

    /* renamed from: l  reason: collision with root package name */
    private g f5707l = g.REQUESTED;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements z0.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5711a;

        a() {
        }

        @Override // com.adcolony.sdk.z0.b
        public boolean a() {
            return this.f5711a;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                if (this.f5711a) {
                    return;
                }
                this.f5711a = true;
                if (com.adcolony.sdk.a.d()) {
                    k b10 = com.adcolony.sdk.a.b();
                    if (b10.I()) {
                        b10.a();
                    }
                    e0.a a10 = new e0.a().a("Ad show failed due to a native timeout (5000 ms). ");
                    a10.a("Interstitial with adSessionId(" + AdColonyInterstitial.this.f5702g + "). ").a("Reloading controller.").a(e0.f5981i);
                }
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ((com.adcolony.sdk.a.a() instanceof AdColonyInterstitialActivity) || AdColonyInterstitial.this.f5696a == null) {
                return;
            }
            AdColonyInterstitial.this.f5696a.onOpened(AdColonyInterstitial.this);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.adcolony.sdk.d f5714a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5715b;

        c(com.adcolony.sdk.d dVar, String str) {
            this.f5714a = dVar;
            this.f5715b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context a10 = com.adcolony.sdk.a.a();
            if (!(a10 instanceof com.adcolony.sdk.b)) {
                if (AdColonyInterstitial.this.f5696a != null) {
                    AdColonyInterstitial.this.f5696a.onClosed(AdColonyInterstitial.this);
                    AdColonyInterstitial.this.setListener(null);
                }
                AdColonyInterstitial.this.o();
                AdColonyInterstitial.this.destroy();
                com.adcolony.sdk.a.b().e(false);
            } else {
                this.f5714a.a(a10, c0.b(), this.f5715b);
            }
            if (AdColonyInterstitial.this.f5698c != null) {
                this.f5714a.a(AdColonyInterstitial.this.f5698c);
                AdColonyInterstitial.this.f5698c = null;
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f5717a;

        d(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f5717a = adColonyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5717a.onRequestNotFilled(AdColony.a(AdColonyInterstitial.this.getZoneID()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f5719a;

        e(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f5719a = adColonyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5719a.onExpiring(AdColonyInterstitial.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum g {
        REQUESTED,
        FILLED,
        NOT_FILLED,
        EXPIRED,
        SHOWN,
        CLOSED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, String str2) {
        this.f5696a = adColonyInterstitialListener;
        this.f5704i = str2;
        this.f5702g = str;
    }

    private boolean k() {
        String e8 = com.adcolony.sdk.a.b().s().e();
        String viewNetworkPassFilter = getViewNetworkPassFilter();
        return viewNetworkPassFilter == null || viewNetworkPassFilter.length() == 0 || viewNetworkPassFilter.equals(e8) || viewNetworkPassFilter.equals(BannerAdRequest.TYPE_ALL) || (viewNetworkPassFilter.equals(androidx.browser.customtabs.b.ONLINE_EXTRAS_KEY) && (e8.equals(x8.f21379b) || e8.equals("cell"))) || (viewNetworkPassFilter.equals("offline") && e8.equals("none"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str) {
    }

    public boolean cancel() {
        if (this.f5698c != null) {
            Context a10 = com.adcolony.sdk.a.a();
            if (a10 == null || (a10 instanceof AdColonyInterstitialActivity)) {
                f1 b10 = c0.b();
                c0.a(b10, ug.f21009x, this.f5698c.a());
                new h0("AdSession.on_request_close", this.f5698c.k(), b10).c();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.adcolony.sdk.c d() {
        return this.f5698c;
    }

    public boolean destroy() {
        com.adcolony.sdk.a.b().c().f().remove(this.f5702g);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str) {
        if (com.adcolony.sdk.a.d()) {
            k b10 = com.adcolony.sdk.a.b();
            com.adcolony.sdk.d c10 = b10.c();
            z0.b(new b());
            AdColonyZone adColonyZone = b10.C().get(this.f5704i);
            if (adColonyZone != null && adColonyZone.isRewarded()) {
                f1 f1Var = new f1();
                c0.b(f1Var, "reward_amount", adColonyZone.getRewardAmount());
                c0.a(f1Var, "reward_name", adColonyZone.getRewardName());
                c0.b(f1Var, "success", true);
                c0.a(f1Var, "zone_id", this.f5704i);
                b10.e(new h0("AdColony.v4vc_reward", 0, f1Var));
            }
            z0.b(new c(c10, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f5701f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return this.f5706k;
    }

    public AdColonyInterstitialListener getListener() {
        return this.f5696a;
    }

    public String getViewNetworkPassFilter() {
        return this.f5709n;
    }

    public String getZoneID() {
        return this.f5704i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.f5708m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.f5700e != null;
    }

    public boolean isExpired() {
        g gVar = this.f5707l;
        return gVar == g.EXPIRED || gVar == g.SHOWN || gVar == g.CLOSED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f5707l == g.FILLED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f5707l == g.REQUESTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f5707l == g.SHOWN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        z0.c(this.f5710o);
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null || !com.adcolony.sdk.a.d() || this.f5710o.a()) {
            return false;
        }
        com.adcolony.sdk.a.b().a(this.f5698c);
        com.adcolony.sdk.a.b().a(this);
        z0.a(new Intent(a10, AdColonyInterstitialActivity.class));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        f fVar;
        synchronized (this) {
            r();
            fVar = this.f5697b;
            if (fVar != null) {
                this.f5697b = null;
            } else {
                fVar = null;
            }
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        s();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f5696a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        z0.b(new e(adColonyInterstitialListener));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        u();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f5696a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        z0.b(new d(adColonyInterstitialListener));
        return true;
    }

    void r() {
        this.f5707l = g.CLOSED;
    }

    void s() {
        this.f5707l = g.EXPIRED;
    }

    public void setListener(AdColonyInterstitialListener adColonyInterstitialListener) {
        this.f5696a = adColonyInterstitialListener;
    }

    public void setViewNetworkPassFilter(String str) {
        this.f5709n = str;
    }

    public boolean show() {
        boolean z10 = false;
        if (com.adcolony.sdk.a.d()) {
            k b10 = com.adcolony.sdk.a.b();
            f1 b11 = c0.b();
            c0.a(b11, "zone_id", this.f5704i);
            c0.b(b11, "type", 0);
            c0.a(b11, ug.f21009x, this.f5702g);
            if (m()) {
                c0.b(b11, "request_fail_reason", 24);
                new e0.a().a("This ad object has already been shown. Please request a new ad ").a("via AdColony.requestInterstitial.").a(e0.f5978f);
            } else if (this.f5707l == g.EXPIRED) {
                c0.b(b11, "request_fail_reason", 17);
                new e0.a().a("This ad object has expired. Please request a new ad via AdColony").a(".requestInterstitial.").a(e0.f5978f);
            } else if (b10.J()) {
                c0.b(b11, "request_fail_reason", 23);
                new e0.a().a("Can not show ad while an interstitial is already active.").a(e0.f5978f);
            } else if (a(b10.C().get(this.f5704i))) {
                c0.b(b11, "request_fail_reason", 11);
            } else if (!k()) {
                c0.b(b11, "request_fail_reason", 9);
                new e0.a().a("Tried to show interstitial ad during unacceptable network conditions.").a(e0.f5978f);
            } else {
                v();
                com.adcolony.sdk.a.b().e(true);
                z0.a(this.f5710o, (long) ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
                z10 = true;
            }
            AdColonyAdOptions adColonyAdOptions = this.f5699d;
            if (adColonyAdOptions != null) {
                c0.b(b11, "pre_popup", adColonyAdOptions.f5655a);
                c0.b(b11, "post_popup", this.f5699d.f5656b);
            }
            AdColonyZone adColonyZone = b10.C().get(this.f5704i);
            if (adColonyZone != null && adColonyZone.isRewarded() && b10.w() == null) {
                new e0.a().a("Rewarded ad: show() called with no reward listener set.").a(e0.f5978f);
            }
            new h0("AdSession.launch_ad_unit", 1, b11).c();
            return z10;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        this.f5707l = g.FILLED;
    }

    void u() {
        this.f5707l = g.NOT_FILLED;
    }

    void v() {
        this.f5707l = g.SHOWN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f5702g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f5705j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        this.f5706k = str;
    }

    boolean a(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            if (adColonyZone.getPlayFrequency() <= 1) {
                return false;
            }
            if (adColonyZone.a() == 0) {
                adColonyZone.b(adColonyZone.getPlayFrequency() - 1);
                return false;
            }
            adColonyZone.b(adColonyZone.a() - 1);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        this.f5705j = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z10) {
        this.f5708m = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f fVar) {
        boolean z10;
        synchronized (this) {
            if (this.f5707l == g.CLOSED) {
                z10 = true;
            } else {
                this.f5697b = fVar;
                z10 = false;
            }
        }
        if (z10) {
            fVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f1 f1Var) {
        if (f1Var.b()) {
            return;
        }
        this.f5700e = new p0(f1Var, this.f5702g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.adcolony.sdk.c cVar) {
        this.f5698c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0 e() {
        return this.f5700e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdColonyAdOptions adColonyAdOptions) {
        this.f5699d = adColonyAdOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10) {
        this.f5701f = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        String str = this.f5703h;
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.f5703h = str;
    }
}
