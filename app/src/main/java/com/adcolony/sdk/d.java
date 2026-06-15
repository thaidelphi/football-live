package com.adcolony.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.adcolony.sdk.e0;
import com.ironsource.ug;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Runnable> f5919a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, com.adcolony.sdk.c> f5920b;

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, AdColonyInterstitial> f5921c;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentHashMap<String, AdColonyAdViewListener> f5922d;

    /* renamed from: e  reason: collision with root package name */
    private ConcurrentHashMap<String, AdColonyAdViewListener> f5923e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, AdColonyAdView> f5924f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f5925g = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.e(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f5928a;

            a(h0 h0Var) {
                this.f5928a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) d.this.f5921c.get(c0.h(this.f5928a.a(), ug.f21009x));
                if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
                    return;
                }
                adColonyInterstitial.getListener().onAudioStopped(adColonyInterstitial);
            }
        }

        b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            z0.b(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f5931a;

            a(h0 h0Var) {
                this.f5931a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) d.this.f5921c.get(c0.h(this.f5931a.a(), ug.f21009x));
                if (adColonyInterstitial == null || adColonyInterstitial.getListener() == null) {
                    return;
                }
                adColonyInterstitial.getListener().onAudioStarted(adColonyInterstitial);
            }
        }

        c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            z0.b(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adcolony.sdk.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0114d implements j0 {
        C0114d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.i(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements j0 {
        e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.h(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements j0 {
        f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.g(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements j0 {
        g(d dVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            f1 b10 = c0.b();
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f5936a;

            a(h hVar, h0 h0Var) {
                this.f5936a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                h0 h0Var = this.f5936a;
                h0Var.a(h0Var.a()).c();
            }
        }

        h(d dVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            z0.b(new a(this, h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements j0 {
        i(d dVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            o0.c().a(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j implements Runnable {
        j(d dVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adcolony.sdk.r o10 = com.adcolony.sdk.a.b().o();
            if (o10.a() != null) {
                o10.a().dismiss();
                o10.a((AlertDialog) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f5937a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h0 f5938b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f5939c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f5940d;

        k(Context context, h0 h0Var, AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f5937a = context;
            this.f5938b = h0Var;
            this.f5939c = adColonyAdViewListener;
            this.f5940d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdColonyAdView adColonyAdView;
            try {
                adColonyAdView = new AdColonyAdView(this.f5937a, this.f5938b, this.f5939c);
            } catch (RuntimeException e8) {
                new e0.a().a(e8.toString()).a(e0.f5981i);
                adColonyAdView = null;
            }
            synchronized (d.this.f5925g) {
                if (d.this.f5923e.remove(this.f5940d) == null) {
                    return;
                }
                if (adColonyAdView != null) {
                    d.this.f5924f.put(this.f5940d, adColonyAdView);
                    adColonyAdView.setOmidManager(this.f5939c.b());
                    adColonyAdView.e();
                    this.f5939c.a((p0) null);
                    this.f5939c.onRequestFilled(adColonyAdView);
                    return;
                }
                d.this.a(this.f5939c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class l implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f5943a;

            a(h0 h0Var) {
                this.f5943a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.c(this.f5943a);
            }
        }

        l() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            z0.b(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f5945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitial f5946b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f5947c;

        m(d dVar, h0 h0Var, AdColonyInterstitial adColonyInterstitial, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f5945a = h0Var;
            this.f5946b = adColonyInterstitial;
            this.f5947c = adColonyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 a10 = this.f5945a.a();
            if (this.f5946b.e() == null) {
                this.f5946b.a(c0.f(a10, "iab"));
            }
            this.f5946b.a(c0.h(a10, "ad_id"));
            this.f5946b.c(c0.h(a10, "creative_id"));
            this.f5946b.setViewNetworkPassFilter(c0.h(a10, "view_network_pass_filter"));
            p0 e8 = this.f5946b.e();
            if (e8 != null && e8.d() != 2) {
                try {
                    e8.a();
                } catch (IllegalArgumentException unused) {
                    new e0.a().a("IllegalArgumentException when creating omid session").a(e0.f5981i);
                }
            }
            this.f5947c.onRequestFilled(this.f5946b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f5948a;

        n(d dVar, AdColonyAdViewListener adColonyAdViewListener) {
            this.f5948a = adColonyAdViewListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdColonyAdViewListener adColonyAdViewListener = this.f5948a;
            adColonyAdViewListener.onRequestNotFilled(AdColony.a(adColonyAdViewListener.c()));
            if (com.adcolony.sdk.a.c()) {
                return;
            }
            new e0.a().a("RequestNotFilled called for AdView due to a missing context. ").a(e0.f5981i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5949a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5950b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f5951c;

        o(String str, String str2, long j10) {
            this.f5949a = str;
            this.f5950b = str2;
            this.f5951c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f5919a.remove(this.f5949a);
            AdColonyAdViewListener adColonyAdViewListener = (AdColonyAdViewListener) d.this.f5922d.remove(this.f5949a);
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onRequestNotFilled(AdColony.a(this.f5950b));
                f1 b10 = c0.b();
                c0.a(b10, ug.f21009x, this.f5949a);
                c0.a(b10, "zone_id", this.f5950b);
                c0.b(b10, "type", 1);
                c0.b(b10, "request_fail_reason", 26);
                new h0("AdSession.on_request_failure", 1, b10).c();
                e0.a a10 = new e0.a().a("RequestNotFilled called due to a native timeout. ");
                e0.a a11 = a10.a("Timeout set to: " + com.adcolony.sdk.a.b().d() + " ms. ");
                e0.a a12 = a11.a("AdView request time allowed: " + this.f5951c + " ms. ");
                a12.a("AdView with adSessionId(" + this.f5949a + ") - request failed.").a(e0.f5981i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5953a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5954b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f5955c;

        p(String str, String str2, long j10) {
            this.f5953a = str;
            this.f5954b = str2;
            this.f5955c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f5919a.remove(this.f5953a);
            AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) d.this.f5921c.remove(this.f5953a);
            AdColonyInterstitialListener listener = adColonyInterstitial == null ? null : adColonyInterstitial.getListener();
            if (listener != null) {
                listener.onRequestNotFilled(AdColony.a(this.f5954b));
                f1 b10 = c0.b();
                c0.a(b10, ug.f21009x, this.f5953a);
                c0.a(b10, "zone_id", this.f5954b);
                c0.b(b10, "type", 0);
                c0.b(b10, "request_fail_reason", 26);
                new h0("AdSession.on_request_failure", 1, b10).c();
                e0.a a10 = new e0.a().a("RequestNotFilled called due to a native timeout. ");
                e0.a a11 = a10.a("Timeout set to: " + com.adcolony.sdk.a.b().d() + " ms. ");
                e0.a a12 = a11.a("Interstitial request time allowed: " + this.f5955c + " ms. ");
                a12.a("Interstitial with adSessionId(" + this.f5953a + ") - request failed.").a(e0.f5981i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f5957a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitial f5958b;

        q(d dVar, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyInterstitial adColonyInterstitial) {
            this.f5957a = adColonyInterstitialListener;
            this.f5958b = adColonyInterstitial;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adcolony.sdk.a.b().e(false);
            this.f5957a.onClosed(this.f5958b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b1 f5960b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.adcolony.sdk.c f5961c;

        r(String str, b1 b1Var, com.adcolony.sdk.c cVar) {
            this.f5959a = str;
            this.f5960b = b1Var;
            this.f5961c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdColonyInterstitial adColonyInterstitial = d.this.f().get(this.f5959a);
                AdColonyAdView adColonyAdView = d.this.d().get(this.f5959a);
                p0 e8 = adColonyInterstitial == null ? null : adColonyInterstitial.e();
                if (e8 == null && adColonyAdView != null) {
                    e8 = adColonyAdView.getOmidManager();
                }
                int d10 = e8 == null ? -1 : e8.d();
                if (e8 == null || d10 != 2) {
                    return;
                }
                e8.a(this.f5960b);
                e8.a(this.f5961c);
            } catch (IllegalArgumentException unused) {
                new e0.a().a("IllegalArgumentException when creating omid session").a(e0.f5981i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.adcolony.sdk.c f5963a;

        s(d dVar, com.adcolony.sdk.c cVar) {
            this.f5963a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f5963a.i().size(); i10++) {
                com.adcolony.sdk.a.b(this.f5963a.j().get(i10), this.f5963a.i().get(i10));
            }
            this.f5963a.j().clear();
            this.f5963a.i().clear();
            this.f5963a.removeAllViews();
            com.adcolony.sdk.c cVar = this.f5963a;
            cVar.f5884z = null;
            cVar.f5883y = null;
            for (b1 b1Var : cVar.n().values()) {
                if (!(b1Var instanceof com.adcolony.sdk.e)) {
                    if (b1Var instanceof c1) {
                        com.adcolony.sdk.a.b().a((c1) b1Var);
                    } else {
                        b1Var.l();
                    }
                }
            }
            for (a1 a1Var : this.f5963a.m().values()) {
                a1Var.j();
                a1Var.k();
            }
            this.f5963a.m().clear();
            this.f5963a.l().clear();
            this.f5963a.n().clear();
            this.f5963a.h().clear();
            this.f5963a.e().clear();
            this.f5963a.f().clear();
            this.f5963a.g().clear();
            this.f5963a.f5871m = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class t implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f5965a;

            a(h0 h0Var) {
                this.f5965a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.d(this.f5965a);
            }
        }

        t() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            z0.b(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class u implements j0 {
        u() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.k(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class v implements j0 {
        v() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.j(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class w implements j0 {
        w() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.f(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class x implements j0 {
        x() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.l(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class y implements j0 {
        y() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.b(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class z implements j0 {
        z() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            d.this.a(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), ug.f21009x);
        f1 b10 = c0.b();
        c0.a(b10, ug.f21009x, h10);
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            c0.b(b10, "has_audio", false);
            h0Var.a(b10).c();
            return false;
        }
        boolean b11 = z0.b(z0.a(a10));
        double a11 = z0.a(z0.a(a10));
        c0.b(b10, "has_audio", b11);
        c0.a(b10, "volume", a11);
        h0Var.a(b10).c();
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(h0 h0Var) {
        f1 a10 = h0Var.a();
        String b10 = h0Var.b();
        String h10 = c0.h(a10, "ad_session_id");
        int d10 = c0.d(a10, "view_id");
        com.adcolony.sdk.c cVar = this.f5920b.get(h10);
        if (cVar == null) {
            a(b10, h10);
            return false;
        }
        View view = cVar.e().get(Integer.valueOf(d10));
        if (view == null) {
            a(b10, "" + d10);
            return false;
        }
        cVar.removeView(view);
        cVar.addView(view, view.getLayoutParams());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k(h0 h0Var) {
        f1 a10 = h0Var.a();
        String b10 = h0Var.b();
        String h10 = c0.h(a10, "ad_session_id");
        int d10 = c0.d(a10, "view_id");
        com.adcolony.sdk.c cVar = this.f5920b.get(h10);
        if (cVar == null) {
            a(b10, h10);
            return false;
        }
        View view = cVar.e().get(Integer.valueOf(d10));
        if (view == null) {
            a(b10, "" + d10);
            return false;
        }
        view.bringToFront();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(h0 h0Var) {
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, ug.f21009x);
        AdColonyInterstitial adColonyInterstitial = this.f5921c.get(h10);
        AdColonyAdView adColonyAdView = this.f5924f.get(h10);
        int a11 = c0.a(a10, "orientation", -1);
        boolean z10 = adColonyAdView != null;
        if (adColonyInterstitial == null && !z10) {
            a(h0Var.b(), h10);
            return false;
        }
        c0.a(c0.b(), ug.f21009x, h10);
        if (adColonyInterstitial != null) {
            adColonyInterstitial.a(a11);
            adColonyInterstitial.n();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.f5919a = new ConcurrentHashMap<>();
        this.f5920b = new HashMap<>();
        this.f5921c = new ConcurrentHashMap<>();
        this.f5922d = new ConcurrentHashMap<>();
        this.f5923e = new ConcurrentHashMap<>();
        this.f5924f = Collections.synchronizedMap(new HashMap());
        com.adcolony.sdk.a.a("AdContainer.create", new l());
        com.adcolony.sdk.a.a("AdContainer.destroy", new t());
        com.adcolony.sdk.a.a("AdContainer.move_view_to_index", new u());
        com.adcolony.sdk.a.a("AdContainer.move_view_to_front", new v());
        com.adcolony.sdk.a.a("AdSession.finish_fullscreen_ad", new w());
        com.adcolony.sdk.a.a("AdSession.start_fullscreen_ad", new x());
        com.adcolony.sdk.a.a("AdSession.ad_view_available", new y());
        com.adcolony.sdk.a.a("AdSession.ad_view_unavailable", new z());
        com.adcolony.sdk.a.a("AdSession.expiring", new a());
        com.adcolony.sdk.a.a("AdSession.audio_stopped", new b());
        com.adcolony.sdk.a.a("AdSession.audio_started", new c());
        com.adcolony.sdk.a.a("AdSession.interstitial_available", new C0114d());
        com.adcolony.sdk.a.a("AdSession.interstitial_unavailable", new e());
        com.adcolony.sdk.a.a("AdSession.has_audio", new f());
        com.adcolony.sdk.a.a("WebView.prepare", new g(this));
        com.adcolony.sdk.a.a("AdSession.expanded", new h(this));
        com.adcolony.sdk.a.a("AdColony.odt_event", new i(this));
    }

    boolean i(h0 h0Var) {
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, ug.f21009x);
        AdColonyInterstitial adColonyInterstitial = this.f5921c.get(h10);
        if (adColonyInterstitial == null || adColonyInterstitial.j()) {
            return false;
        }
        AdColonyInterstitialListener listener = adColonyInterstitial.getListener();
        if (listener == null) {
            a(h0Var.b(), h10);
            return false;
        }
        z0.c(this.f5919a.remove(h10));
        if (!com.adcolony.sdk.a.c()) {
            a(adColonyInterstitial);
            return false;
        }
        adColonyInterstitial.t();
        adColonyInterstitial.a(c0.h(a10, "ad_id"));
        adColonyInterstitial.c(c0.h(a10, "creative_id"));
        adColonyInterstitial.d(c0.h(a10, "ad_request_id"));
        z0.b(new m(this, h0Var, adColonyInterstitial, listener));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), "ad_session_id");
        com.adcolony.sdk.c cVar = this.f5920b.get(h10);
        if (cVar == null) {
            a(h0Var.b(), h10);
            return false;
        }
        a(cVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(h0 h0Var) {
        f1 a10 = h0Var.a();
        int d10 = c0.d(a10, "status");
        if (d10 == 5 || d10 == 1 || d10 == 0 || d10 == 6) {
            return false;
        }
        String h10 = c0.h(a10, ug.f21009x);
        AdColonyInterstitial remove = this.f5921c.remove(h10);
        AdColonyInterstitialListener listener = remove == null ? null : remove.getListener();
        if (listener == null) {
            a(h0Var.b(), h10);
            return false;
        }
        z0.b(new q(this, listener, remove));
        remove.o();
        remove.a((com.adcolony.sdk.c) null);
        return true;
    }

    boolean b(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), ug.f21009x);
        AdColonyAdViewListener remove = this.f5922d.remove(h10);
        if (remove == null) {
            a(h0Var.b(), h10);
            return false;
        }
        this.f5923e.put(h10, remove);
        z0.c(this.f5919a.remove(h10));
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            a(remove);
            return false;
        }
        z0.b(new k(a10, h0Var, remove, h10));
        return true;
    }

    boolean c(h0 h0Var) {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return false;
        }
        f1 a11 = h0Var.a();
        String h10 = c0.h(a11, "ad_session_id");
        com.adcolony.sdk.c cVar = new com.adcolony.sdk.c(a10.getApplicationContext(), h10);
        cVar.j(h0Var);
        this.f5920b.put(h10, cVar);
        if (c0.d(a11, "width") == 0) {
            AdColonyInterstitial adColonyInterstitial = this.f5921c.get(h10);
            if (adColonyInterstitial == null) {
                a(h0Var.b(), h10);
                return false;
            }
            adColonyInterstitial.a(cVar);
        } else {
            cVar.c(false);
        }
        f1 b10 = c0.b();
        c0.b(b10, "success", true);
        h0Var.a(b10).c();
        return true;
    }

    boolean e(h0 h0Var) {
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, ug.f21009x);
        if (c0.d(a10, "type") == 0) {
            AdColonyInterstitial remove = this.f5921c.remove(h10);
            if (com.adcolony.sdk.a.c() && remove != null && remove.p()) {
                z0.b(new j(this));
                return true;
            }
            a(h0Var.b(), h10);
            return true;
        }
        return true;
    }

    boolean a(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), ug.f21009x);
        AdColonyAdViewListener remove = this.f5922d.remove(h10);
        if (remove == null) {
            a(h0Var.b(), h10);
            return false;
        }
        z0.c(this.f5919a.remove(h10));
        a(remove);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, AdColonyAdView> d() {
        return this.f5924f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        for (AdColonyInterstitial adColonyInterstitial : this.f5921c.values()) {
            if (adColonyInterstitial != null && adColonyInterstitial.m()) {
                adColonyInterstitial.e("Controller was reloaded and current ad was closed");
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConcurrentHashMap<String, AdColonyAdViewListener> e() {
        return this.f5922d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        HashSet<AdColonyAdViewListener> hashSet = new HashSet();
        synchronized (this.f5925g) {
            for (String str : this.f5923e.keySet()) {
                AdColonyAdViewListener remove = this.f5923e.remove(str);
                if (remove != null) {
                    hashSet.add(remove);
                }
            }
            for (String str2 : this.f5922d.keySet()) {
                AdColonyAdViewListener remove2 = this.f5922d.remove(str2);
                if (remove2 != null) {
                    hashSet.add(remove2);
                }
            }
        }
        for (AdColonyAdViewListener adColonyAdViewListener : hashSet) {
            a(adColonyAdViewListener);
        }
        for (String str3 : this.f5921c.keySet()) {
            AdColonyInterstitial adColonyInterstitial = this.f5921c.get(str3);
            if (adColonyInterstitial != null && adColonyInterstitial.l()) {
                this.f5921c.remove(str3);
                a(adColonyInterstitial);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdColonyAdViewListener adColonyAdViewListener) {
        z0.b(new n(this, adColonyAdViewListener));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConcurrentHashMap<String, AdColonyInterstitial> f() {
        return this.f5921c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<AdColonyInterstitial> g() {
        ArrayList arrayList = new ArrayList();
        for (AdColonyInterstitial adColonyInterstitial : f().values()) {
            if (!adColonyInterstitial.isExpired()) {
                arrayList.add(adColonyInterstitial);
            }
        }
        return arrayList;
    }

    private void a(AdColonyInterstitial adColonyInterstitial) {
        adColonyInterstitial.q();
        if (com.adcolony.sdk.a.c()) {
            return;
        }
        e0.a a10 = new e0.a().a("RequestNotFilled called due to a missing context. ");
        a10.a("Interstitial with adSessionId(" + adColonyInterstitial.b() + ").").a(e0.f5981i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, com.adcolony.sdk.c> c() {
        return this.f5920b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, long j10) {
        f1 f1Var;
        String a10 = z0.a();
        float s10 = com.adcolony.sdk.a.b().n().s();
        f1 b10 = c0.b();
        c0.a(b10, "zone_id", str);
        c0.b(b10, "type", 1);
        c0.b(b10, "width_pixels", (int) (adColonyAdSize.getWidth() * s10));
        c0.b(b10, "height_pixels", (int) (adColonyAdSize.getHeight() * s10));
        c0.b(b10, "width", adColonyAdSize.getWidth());
        c0.b(b10, "height", adColonyAdSize.getHeight());
        c0.a(b10, ug.f21009x, a10);
        if (adColonyAdOptions != null && (f1Var = adColonyAdOptions.f5658d) != null) {
            c0.a(b10, "options", f1Var);
        }
        adColonyAdViewListener.a(str);
        adColonyAdViewListener.a(adColonyAdSize);
        this.f5922d.put(a10, adColonyAdViewListener);
        this.f5919a.put(a10, new o(a10, str, j10));
        new h0("AdSession.on_request", 1, b10).c();
        z0.a(this.f5919a.get(a10), j10);
    }

    boolean h(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), ug.f21009x);
        AdColonyInterstitial remove = this.f5921c.remove(h10);
        if ((remove == null ? null : remove.getListener()) == null) {
            a(h0Var.b(), h10);
            return false;
        }
        z0.c(this.f5919a.remove(h10));
        a(remove);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, long j10) {
        String a10 = z0.a();
        com.adcolony.sdk.k b10 = com.adcolony.sdk.a.b();
        AdColonyInterstitial adColonyInterstitial = new AdColonyInterstitial(a10, adColonyInterstitialListener, str);
        f1 b11 = c0.b();
        c0.a(b11, "zone_id", str);
        c0.b(b11, "fullscreen", true);
        Rect w10 = b10.n().w();
        c0.b(b11, "width", w10.width());
        c0.b(b11, "height", w10.height());
        c0.b(b11, "type", 0);
        c0.a(b11, ug.f21009x, a10);
        if (adColonyAdOptions != null && adColonyAdOptions.f5658d != null) {
            adColonyInterstitial.a(adColonyAdOptions);
            c0.a(b11, "options", adColonyAdOptions.f5658d);
        }
        this.f5921c.put(a10, adColonyInterstitial);
        this.f5919a.put(a10, new p(a10, str, j10));
        new h0("AdSession.on_request", 1, b11).c();
        z0.a(this.f5919a.get(a10), j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, f1 f1Var, String str) {
        h0 h0Var = new h0("AdSession.finish_fullscreen_ad", 0);
        c0.b(f1Var, "status", 1);
        h0Var.b(f1Var);
        new e0.a().a(str).a(e0.f5980h);
        ((com.adcolony.sdk.b) context).a(h0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b1 b1Var, String str, com.adcolony.sdk.c cVar) {
        z0.b(new r(str, b1Var, cVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.adcolony.sdk.c cVar) {
        z0.b(new s(this, cVar));
        AdColonyAdView adColonyAdView = this.f5924f.get(cVar.a());
        if (adColonyAdView == null || adColonyAdView.d()) {
            this.f5920b.remove(cVar.a());
            cVar.f5883y = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        new e0.a().a("Message '").a(str).a("' sent with invalid id: ").a(str2).a(e0.f5980h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyAdView a(String str) {
        AdColonyAdView remove;
        synchronized (this.f5925g) {
            remove = this.f5924f.remove(str);
        }
        return remove;
    }
}
