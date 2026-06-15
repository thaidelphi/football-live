package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import com.adcolony.sdk.e0;
import com.adcolony.sdk.o;
import com.adcolony.sdk.z0;
import com.applovin.sdk.AppLovinEventParameters;
import com.ironsource.b9;
import com.ironsource.fe;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColony {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f5620a = z0.h();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f5621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t0 f5622b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdColonySignalsListener f5623c;

        /* renamed from: com.adcolony.sdk.AdColony$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class RunnableC0112a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f5624a;

            RunnableC0112a(String str) {
                this.f5624a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f5624a.isEmpty()) {
                    a.this.f5623c.onSuccess(this.f5624a);
                } else {
                    a.this.f5623c.onFailure();
                }
            }
        }

        a(k kVar, t0 t0Var, AdColonySignalsListener adColonySignalsListener) {
            this.f5621a = kVar;
            this.f5622b = t0Var;
            this.f5623c = adColonySignalsListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = this.f5621a;
            z0.b(new RunnableC0112a(AdColony.b(kVar, this.f5622b, kVar.y())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f5626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5627b;

        b(AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f5626a = adColonyAdViewListener;
            this.f5627b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5626a.onRequestNotFilled(AdColony.a(this.f5627b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Callable<f1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f5628a;

        c(long j10) {
            this.f5628a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b */
        public f1 call() {
            return AdColony.b(this.f5628a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ double f5629a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5630b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5631c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f5632d;

        d(double d10, String str, String str2, String str3) {
            this.f5629a = d10;
            this.f5630b = str;
            this.f5631c = str2;
            this.f5632d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdColony.b();
            f1 b10 = c0.b();
            double d10 = this.f5629a;
            if (d10 >= 0.0d) {
                c0.a(b10, "price", d10);
            }
            String str = this.f5630b;
            if (str != null && str.length() <= 3) {
                c0.a(b10, "currency_code", this.f5630b);
            }
            c0.a(b10, "product_id", this.f5631c);
            c0.a(b10, AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, this.f5632d);
            new h0("AdColony.on_iap_report", 1, b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements z0.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5633a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f5634b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5635c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z0.c f5636d;

        e(AdColonyAdViewListener adColonyAdViewListener, String str, z0.c cVar) {
            this.f5634b = adColonyAdViewListener;
            this.f5635c = str;
            this.f5636d = cVar;
        }

        @Override // com.adcolony.sdk.z0.b
        public boolean a() {
            return this.f5633a;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                if (this.f5633a) {
                    return;
                }
                this.f5633a = true;
                AdColony.a(this.f5634b, this.f5635c);
                if (this.f5636d.a()) {
                    e0.a a10 = new e0.a().a("RequestNotFilled called due to a native timeout. ");
                    e0.a a11 = a10.a("Timeout set to: " + this.f5636d.b() + " ms. ");
                    a11.a("Execution took: " + (System.currentTimeMillis() - this.f5636d.c()) + " ms. ").a("AdView request not yet started.").a(e0.f5981i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z0.b f5637a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5638b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f5639c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AdColonyAdSize f5640d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AdColonyAdOptions f5641e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z0.c f5642f;

        f(z0.b bVar, String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, z0.c cVar) {
            this.f5637a = bVar;
            this.f5638b = str;
            this.f5639c = adColonyAdViewListener;
            this.f5640d = adColonyAdSize;
            this.f5641e = adColonyAdOptions;
            this.f5642f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k b10 = com.adcolony.sdk.a.b();
            if (b10.E() || b10.F()) {
                AdColony.f();
                z0.a(this.f5637a);
            } else if (!AdColony.b() && com.adcolony.sdk.a.c()) {
                z0.a(this.f5637a);
            } else {
                z0.c(this.f5637a);
                if (this.f5637a.a()) {
                    return;
                }
                b10.c().a(this.f5638b, this.f5639c, this.f5640d, this.f5641e, this.f5642f.d());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdColonyAppOptions f5643a;

        g(AdColonyAppOptions adColonyAppOptions) {
            this.f5643a = adColonyAppOptions;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdColony.b();
            f1 b10 = c0.b();
            c0.a(b10, "options", this.f5643a.b());
            new h0("Options.set_options", 1, b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements z0.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f5645b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5646c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z0.c f5647d;

        h(AdColonyInterstitialListener adColonyInterstitialListener, String str, z0.c cVar) {
            this.f5645b = adColonyInterstitialListener;
            this.f5646c = str;
            this.f5647d = cVar;
        }

        @Override // com.adcolony.sdk.z0.b
        public boolean a() {
            return this.f5644a;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                if (this.f5644a) {
                    return;
                }
                this.f5644a = true;
                AdColony.a(this.f5645b, this.f5646c);
                if (this.f5647d.a()) {
                    e0.a a10 = new e0.a().a("RequestNotFilled called due to a native timeout. ");
                    e0.a a11 = a10.a("Timeout set to: " + this.f5647d.b() + " ms. ");
                    a11.a("Execution took: " + (System.currentTimeMillis() - this.f5647d.c()) + " ms. ").a("Interstitial request not yet started.").a(e0.f5981i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z0.b f5648a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5649b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f5650c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AdColonyAdOptions f5651d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z0.c f5652e;

        i(z0.b bVar, String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, z0.c cVar) {
            this.f5648a = bVar;
            this.f5649b = str;
            this.f5650c = adColonyInterstitialListener;
            this.f5651d = adColonyAdOptions;
            this.f5652e = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k b10 = com.adcolony.sdk.a.b();
            if (b10.E() || b10.F()) {
                AdColony.f();
                z0.a(this.f5648a);
            } else if (!AdColony.b() && com.adcolony.sdk.a.c()) {
                z0.a(this.f5648a);
            } else {
                AdColonyZone adColonyZone = b10.C().get(this.f5649b);
                if (adColonyZone == null) {
                    adColonyZone = new AdColonyZone(this.f5649b);
                }
                if (adColonyZone.getZoneType() != 2 && adColonyZone.getZoneType() != 1) {
                    z0.c(this.f5648a);
                    if (this.f5648a.a()) {
                        return;
                    }
                    b10.c().a(this.f5649b, this.f5650c, this.f5651d, this.f5652e.d());
                    return;
                }
                z0.a(this.f5648a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f5653a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5654b;

        j(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
            this.f5653a = adColonyInterstitialListener;
            this.f5654b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5653a.onRequestNotFilled(AdColony.a(this.f5654b));
        }
    }

    public static boolean addCustomMessageListener(AdColonyCustomMessageListener adColonyCustomMessageListener, String str) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.addCustomMessageListener as AdColony ").a("has not yet been configured.").a(e0.f5978f);
            return false;
        } else if (!z0.e(str)) {
            new e0.a().a("Ignoring call to AdColony.addCustomMessageListener.").a(e0.f5978f);
            return false;
        } else {
            com.adcolony.sdk.a.b().m().put(str, adColonyCustomMessageListener);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(k kVar, t0 t0Var, long j10) {
        q n10 = kVar.n();
        ArrayList arrayList = new ArrayList(Arrays.asList(z0.c(kVar.u().b()), z0.a(n10.d())));
        if (j10 > 0) {
            q0 q0Var = new q0();
            if (n10.N()) {
                arrayList.add(n10.b());
            } else {
                q0Var.a(n10.a(j10));
            }
            if (n10.O()) {
                arrayList.add(n10.c());
            } else {
                q0Var.a(n10.b(j10));
            }
            if (kVar.G()) {
                q0Var.a(new c(j10));
            } else {
                arrayList.add(d());
            }
            if (!q0Var.b()) {
                arrayList.addAll(q0Var.a());
            }
        } else {
            arrayList.add(n10.b());
            arrayList.add(n10.c());
            arrayList.add(d());
        }
        arrayList.add(kVar.e());
        f1 a10 = c0.a((f1[]) arrayList.toArray(new f1[0]));
        t0Var.c();
        c0.b(a10, "signals_count", t0Var.b());
        c0.b(a10, "device_audio", e());
        a10.e();
        byte[] bytes = a10.toString().getBytes(com.adcolony.sdk.h.f6025a);
        if (kVar.H()) {
            return a(bytes);
        }
        return Base64.encodeToString(bytes, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        if (f5620a.isShutdown()) {
            f5620a = Executors.newSingleThreadExecutor();
        }
    }

    public static boolean clearCustomMessageListeners() {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.clearCustomMessageListeners as AdColony").a(" has not yet been configured.").a(e0.f5978f);
            return false;
        }
        com.adcolony.sdk.a.b().m().clear();
        return true;
    }

    public static void collectSignals(AdColonySignalsListener adColonySignalsListener) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").a(e0.f5978f);
            adColonySignalsListener.onFailure();
            return;
        }
        k b10 = com.adcolony.sdk.a.b();
        if (a(new a(b10, b10.x(), adColonySignalsListener))) {
            return;
        }
        adColonySignalsListener.onFailure();
    }

    @Deprecated
    public static boolean configure(Activity activity, String str, String... strArr) {
        return a(activity, (AdColonyAppOptions) null, str);
    }

    private static f1 d() {
        return b(-1L);
    }

    public static boolean disable() {
        if (com.adcolony.sdk.a.e()) {
            Context a10 = com.adcolony.sdk.a.a();
            if (a10 != null && (a10 instanceof com.adcolony.sdk.b)) {
                ((Activity) a10).finish();
            }
            k b10 = com.adcolony.sdk.a.b();
            b10.c().b();
            b10.R();
            b10.T();
            b10.b(true);
            return true;
        }
        return false;
    }

    private static boolean e() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return false;
        }
        return z0.b(z0.a(a10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        new e0.a().a("The AdColony API is not available while AdColony is disabled.").a(e0.f5980h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g() {
        f5620a.shutdown();
    }

    public static AdColonyAppOptions getAppOptions() {
        if (com.adcolony.sdk.a.e()) {
            return com.adcolony.sdk.a.b().u();
        }
        return null;
    }

    public static AdColonyCustomMessageListener getCustomMessageListener(String str) {
        if (com.adcolony.sdk.a.e()) {
            return com.adcolony.sdk.a.b().m().get(str);
        }
        return null;
    }

    public static AdColonyRewardListener getRewardListener() {
        if (com.adcolony.sdk.a.e()) {
            return com.adcolony.sdk.a.b().w();
        }
        return null;
    }

    public static String getSDKVersion() {
        return !com.adcolony.sdk.a.e() ? "" : com.adcolony.sdk.a.b().n().I();
    }

    public static AdColonyZone getZone(String str) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.getZone() as AdColony has not yet been ").a("configured.").a(e0.f5978f);
            return null;
        }
        HashMap<String, AdColonyZone> C = com.adcolony.sdk.a.b().C();
        if (C.containsKey(str)) {
            return C.get(str);
        }
        AdColonyZone adColonyZone = new AdColonyZone(str);
        com.adcolony.sdk.a.b().C().put(str, adColonyZone);
        return adColonyZone;
    }

    public static boolean notifyIAPComplete(String str, String str2) {
        return notifyIAPComplete(str, str2, null, 0.0d);
    }

    public static boolean removeCustomMessageListener(String str) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.removeCustomMessageListener as AdColony").a(" has not yet been configured.").a(e0.f5978f);
            return false;
        }
        com.adcolony.sdk.a.b().m().remove(str);
        return true;
    }

    public static boolean removeRewardListener() {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.removeRewardListener() as AdColony has ").a("not yet been configured.").a(e0.f5978f);
            return false;
        }
        com.adcolony.sdk.a.b().a((AdColonyRewardListener) null);
        return true;
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize) {
        return requestAdView(str, adColonyAdViewListener, adColonyAdSize, null);
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener) {
        return requestInterstitial(str, adColonyInterstitialListener, null);
    }

    public static boolean setAppOptions(AdColonyAppOptions adColonyAppOptions) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.setAppOptions() as AdColony has not yet").a(" been configured.").a(e0.f5978f);
            return false;
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        com.adcolony.sdk.a.a(adColonyAppOptions);
        if (com.adcolony.sdk.a.d()) {
            k b10 = com.adcolony.sdk.a.b();
            if (b10.D()) {
                adColonyAppOptions.a(b10.u().a());
            }
        }
        com.adcolony.sdk.a.b().b(adColonyAppOptions);
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 != null) {
            adColonyAppOptions.b(a10);
        }
        return a(new g(adColonyAppOptions));
    }

    public static boolean setRewardListener(AdColonyRewardListener adColonyRewardListener) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.setRewardListener() as AdColony has not").a(" yet been configured.").a(e0.f5978f);
            return false;
        }
        com.adcolony.sdk.a.b().a(adColonyRewardListener);
        return true;
    }

    @Deprecated
    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return a(activity, adColonyAppOptions, str);
    }

    public static boolean notifyIAPComplete(String str, String str2, String str3, double d10) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to notifyIAPComplete as AdColony has not yet been ").a("configured.").a(e0.f5978f);
            return false;
        } else if (z0.e(str) && z0.e(str2)) {
            if (str3 != null && str3.length() > 3) {
                new e0.a().a("You are trying to report an IAP event with a currency String ").a("containing more than 3 characters.").a(e0.f5978f);
            }
            if (a(new d(d10, str3, str, str2))) {
                return true;
            }
            new e0.a().a("Executing AdColony.notifyIAPComplete failed").a(e0.f5981i);
            return false;
        } else {
            new e0.a().a("Ignoring call to notifyIAPComplete as one of the passed Strings ").a("is greater than ").a(128).a(" characters.").a(e0.f5978f);
            return false;
        }
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyAdViewListener == null) {
            new e0.a().a("AdColonyAdViewListener is set to null. ").a("It is required to be non null.").a(e0.f5978f);
        }
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to requestAdView as AdColony has not yet been").a(" configured.").a(e0.f5978f);
            a(adColonyAdViewListener, str);
            return false;
        } else if (adColonyAdSize.getHeight() > 0 && adColonyAdSize.getWidth() > 0) {
            Bundle bundle = new Bundle();
            bundle.putString("zone_id", str);
            if (r0.a(1, bundle)) {
                a(adColonyAdViewListener, str);
                return false;
            }
            z0.c cVar = new z0.c(com.adcolony.sdk.a.b().d());
            e eVar = new e(adColonyAdViewListener, str, cVar);
            z0.a(eVar, cVar.d());
            if (a(new f(eVar, str, adColonyAdViewListener, adColonyAdSize, adColonyAdOptions, cVar))) {
                return true;
            }
            z0.a((z0.b) eVar);
            return false;
        } else {
            new e0.a().a("Ignoring call to requestAdView as you've provided an AdColonyAdSize").a(" object with an invalid width or height.").a(e0.f5978f);
            a(adColonyAdViewListener, str);
            return false;
        }
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyInterstitialListener == null) {
            new e0.a().a("AdColonyInterstitialListener is set to null. ").a("It is required to be non null.").a(e0.f5978f);
        }
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.requestInterstitial as AdColony has not").a(" yet been configured.").a(e0.f5978f);
            a(adColonyInterstitialListener, str);
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("zone_id", str);
        if (r0.a(1, bundle)) {
            a(adColonyInterstitialListener, str);
            return false;
        }
        z0.c cVar = new z0.c(com.adcolony.sdk.a.b().d());
        h hVar = new h(adColonyInterstitialListener, str, cVar);
        z0.a(hVar, cVar.d());
        if (a(new i(hVar, str, adColonyInterstitialListener, adColonyAdOptions, cVar))) {
            return true;
        }
        z0.a((z0.b) hVar);
        return false;
    }

    @Deprecated
    public static boolean configure(Application application, String str, String... strArr) {
        return configure(application, (AdColonyAppOptions) null, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Runnable runnable) {
        return z0.a(f5620a, runnable);
    }

    @Deprecated
    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return a(application, adColonyAppOptions, str);
    }

    private static String a(k kVar, t0 t0Var) {
        return b(kVar, t0Var, -1L);
    }

    public static boolean configure(Activity activity, String str) {
        return a(activity, (AdColonyAppOptions) null, str);
    }

    static String a(byte[] bArr) {
        com.adcolony.sdk.g gVar = new com.adcolony.sdk.g("sa01", "", "{\"origin_store\":\"google\",\"app_id\":\",\"bundle_id\":\",\"os_name\":\"android\",\"zone_ids\":[\"],\"carrier_name\":\",\"screen_width\":,\"screen_height\":,\"device_type\":\"phonetablet\",\"locale_language_code\":\",\"ln\":\",\"locale_country_code\":\",\"locale\":\",\"manufacturer\":\",\"device_brand\":\",\"device_model\":\",\"sdk_type\":\"android_native\",\"sdk_version\":\"4.\",\"network_type\":\"cellwifi\",\"os_version\":\",\"platform\":\"android\",\"app_bundle_name\":\",\"app_bundle_version\":\",\"battery_level\":,\"cell_service_country_code\":\",\"controller_version\":\",\"current_orientation\":,\"cleartext_permitted\":,\"available_stores\":[\"],\"advertiser_id\":\",\"limit_tracking\":false,\"adc_alt_id\":\",\"odt_payload\":{\"config\":{\"Q1\":[\",\\\"session_start\\\"\"],\"Q2\":[\",\\\"configure\\\"\"],\"Q3\":[\"],\"Q4\":[\"],\"Q5\":[\"],\"Q6\":[\"]},\"session\":{},\"events\":{},\"version\":},\"signals_count\":,\"device_audio\":true}", "");
        try {
            byte[] a10 = gVar.a(bArr);
            f1 b10 = c0.b();
            b10.a("a", gVar.b());
            b10.a("b", Base64.encodeToString(a10, 0));
            return b10.toString();
        } catch (UnsupportedEncodingException | JSONException unused) {
            return Base64.encodeToString(bArr, 0);
        }
    }

    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str) {
        return a(activity, adColonyAppOptions, str);
    }

    public static boolean configure(Application application, String str) {
        return configure(application, (AdColonyAppOptions) null, str);
    }

    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str) {
        return a(application, adColonyAppOptions, str);
    }

    @Deprecated
    public static String collectSignals() {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").a(e0.f5978f);
            return "";
        }
        k b10 = com.adcolony.sdk.a.b();
        return a(b10, b10.x());
    }

    @SuppressLint({"ObsoleteSdkInt"})
    private static boolean a(Context context, AdColonyAppOptions adColonyAppOptions, String str) {
        if (r0.a(0, null)) {
            new e0.a().a("Cannot configure AdColony; configuration mechanism requires 5 ").a("seconds between attempts.").a(e0.f5978f);
            return false;
        }
        if (context == null) {
            context = com.adcolony.sdk.a.a();
        }
        if (context == null) {
            new e0.a().a("Ignoring call to AdColony.configure() as the provided Activity or ").a("Application context is null and we do not currently hold a ").a("reference to either for our use.").a(e0.f5978f);
            return false;
        }
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        if (com.adcolony.sdk.a.d() && !c0.b(com.adcolony.sdk.a.b().u().b(), "reconfigurable") && !com.adcolony.sdk.a.b().u().a().equals(str)) {
            new e0.a().a("Ignoring call to AdColony.configure() as the app id does not ").a("match what was used during the initial configuration.").a(e0.f5978f);
            return false;
        } else if (str.equals("")) {
            new e0.a().a("AdColony.configure() called with an empty app id String.").a(e0.f5980h);
            return false;
        } else {
            com.adcolony.sdk.a.f5750c = true;
            adColonyAppOptions.a(str);
            if (Build.VERSION.SDK_INT < 21) {
                new e0.a().a("The minimum API level for the AdColony SDK is ").a(21).a(".").a(e0.f5978f);
                com.adcolony.sdk.a.a(context, adColonyAppOptions, true);
            } else {
                com.adcolony.sdk.a.a(context, adColonyAppOptions, false);
            }
            f1 b10 = c0.b();
            c0.a(b10, "appId", str);
            c0.j(b10, com.adcolony.sdk.a.b().z().f() + "/adc3/AppInfo");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f1 b(long j10) {
        o.b b10;
        f1 b11 = c0.b();
        if (j10 > 0) {
            b10 = o0.c().a(j10);
        } else {
            b10 = o0.c().b();
        }
        if (b10 != null) {
            c0.a(b11, "odt_payload", b10.b());
        }
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        k b10 = com.adcolony.sdk.a.b();
        b10.a(15000L);
        return b10.I();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdColonyZone a(String str) {
        AdColonyZone adColonyZone;
        if (com.adcolony.sdk.a.c()) {
            adColonyZone = com.adcolony.sdk.a.b().C().get(str);
        } else {
            adColonyZone = com.adcolony.sdk.a.d() ? com.adcolony.sdk.a.b().C().get(str) : null;
        }
        if (adColonyZone == null) {
            AdColonyZone adColonyZone2 = new AdColonyZone(str);
            adColonyZone2.c(6);
            return adColonyZone2;
        }
        return adColonyZone;
    }

    static void a(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
        if (adColonyInterstitialListener != null) {
            z0.b(new j(adColonyInterstitialListener, str));
        }
    }

    static void a(AdColonyAdViewListener adColonyAdViewListener, String str) {
        if (adColonyAdViewListener != null) {
            z0.b(new b(adColonyAdViewListener, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, AdColonyAppOptions adColonyAppOptions) {
        k b10 = com.adcolony.sdk.a.b();
        q n10 = b10.n();
        if (adColonyAppOptions == null || context == null) {
            return;
        }
        String d10 = z0.d(context);
        String c10 = z0.c();
        int d11 = z0.d();
        String m7 = n10.m();
        String e8 = b10.s().e();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(JsonStorageKeyNames.SESSION_ID_KEY, "unknown");
        hashMap.put("countryLocale", Locale.getDefault().getDisplayLanguage() + " (" + Locale.getDefault().getDisplayCountry() + ")");
        hashMap.put("countryLocaleShort", com.adcolony.sdk.a.b().n().p());
        hashMap.put("manufacturer", com.adcolony.sdk.a.b().n().C());
        hashMap.put(fe.B, com.adcolony.sdk.a.b().n().F());
        hashMap.put("osVersion", com.adcolony.sdk.a.b().n().H());
        hashMap.put("carrierName", m7);
        hashMap.put("networkType", e8);
        hashMap.put(fe.G, "android");
        hashMap.put("appName", d10);
        hashMap.put(b9.i.W, c10);
        hashMap.put("appBuildNumber", Integer.valueOf(d11));
        hashMap.put("appId", "" + adColonyAppOptions.a());
        hashMap.put("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdkVersion", com.adcolony.sdk.a.b().n().I());
        hashMap.put("controllerVersion", "unknown");
        f1 f1Var = new f1(adColonyAppOptions.getMediationInfo());
        f1 f1Var2 = new f1(adColonyAppOptions.getPluginInfo());
        if (!c0.h(f1Var, "mediation_network").equals("")) {
            hashMap.put("mediationNetwork", c0.h(f1Var, "mediation_network"));
            hashMap.put("mediationNetworkVersion", c0.h(f1Var, "mediation_network_version"));
        }
        if (!c0.h(f1Var2, fe.K).equals("")) {
            hashMap.put(fe.K, c0.h(f1Var2, fe.K));
            hashMap.put("pluginVersion", c0.h(f1Var2, "plugin_version"));
        }
        b10.q().a(hashMap);
    }
}
