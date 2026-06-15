package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import com.startapp.a0;
import com.startapp.a2;
import com.startapp.a5;
import com.startapp.b0;
import com.startapp.l;
import com.startapp.o9;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.y4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class DiskAdCacheManager {

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class DiskCacheKey implements Serializable {
        private static final long serialVersionUID = 7401552775422045093L;
        protected AdPreferences adPreferences;
        private int numberOfLoadedAd;
        protected AdPreferences.Placement placement;

        public DiskCacheKey(AdPreferences.Placement placement, AdPreferences adPreferences) {
            this.placement = placement;
            this.adPreferences = adPreferences;
        }

        public final int a() {
            return this.numberOfLoadedAd;
        }

        public final void a(int i10) {
            this.numberOfLoadedAd = i10;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class DiskCachedAd implements Serializable {
        private static final long serialVersionUID = -9194311006094821018L;
        private com.startapp.sdk.adsbase.d ad;
        private String html;

        public DiskCachedAd(com.startapp.sdk.adsbase.d dVar) {
            a(dVar);
            c();
        }

        public final com.startapp.sdk.adsbase.d a() {
            return this.ad;
        }

        public final String b() {
            return this.html;
        }

        public final void c() {
            com.startapp.sdk.adsbase.d dVar = this.ad;
            if (dVar == null || !(dVar instanceof HtmlAd)) {
                return;
            }
            this.html = ((HtmlAd) dVar).k();
        }

        public final void a(com.startapp.sdk.adsbase.d dVar) {
            this.ad = dVar;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
    }

    public static void a(Context context, AdEventListener adEventListener) {
        l.a(context, adEventListener, null, true);
    }

    public static void a(Context context, DiskCachedAd diskCachedAd, a aVar, AdEventListener adEventListener) {
        com.startapp.sdk.adsbase.d a10 = diskCachedAd.a();
        a10.setContext(context);
        WeakHashMap weakHashMap = o9.f22359a;
        boolean z10 = true;
        if (a10 instanceof InterstitialAd) {
            InterstitialAd interstitialAd = (InterstitialAd) a10;
            String b10 = diskCachedAd.b();
            if (b10 != null && !b10.equals("")) {
                if (AdsCommonMetaData.f22889h.H()) {
                    ArrayList a11 = b0.a(b10, 0);
                    ArrayList arrayList = new ArrayList();
                    if (b0.a(context, a11, 0, new HashSet(), arrayList).booleanValue()) {
                        com.startapp.sdk.components.a.a(context).f23249y.a().execute(new a0(context, arrayList).f21746c);
                        z10 = false;
                    }
                }
                if (!z10) {
                    a(context, adEventListener);
                    return;
                }
                d.f23020h.f23022b.put(interstitialAd.l(), b10);
                ((f) aVar).f23038a.f23043e = interstitialAd;
                com.startapp.sdk.components.a.a(context).f23226b.a().a(b10, new a2(context, adEventListener, interstitialAd));
                return;
            }
            a(context, adEventListener);
        } else if (a10 instanceof OfferWall3DAd) {
            OfferWall3DAd offerWall3DAd = (OfferWall3DAd) a10;
            List<AdDetails> g10 = offerWall3DAd.g();
            if (g10 == null) {
                a(context, adEventListener);
                return;
            }
            if (AdsCommonMetaData.f22889h.H()) {
                g10 = b0.a(context, (List) g10, 0, new HashSet(), true);
            }
            if (g10.size() > 0) {
                ((f) aVar).f23038a.f23043e = offerWall3DAd;
                a5 a12 = com.startapp.sdk.components.a.a(context).O.a().a(offerWall3DAd.h());
                a12.getClass();
                a12.f21758b = new ArrayList();
                a12.f21759c = "";
                for (AdDetails adDetails : g10) {
                    y4 y4Var = new y4(adDetails);
                    a12.f21758b.add(y4Var);
                    a12.f21757a.a(y4Var.f23564a, a12.f21758b.size() - 1, y4Var.f23572i);
                }
                l.b(context, adEventListener, offerWall3DAd, true);
                return;
            }
            a(context, adEventListener);
        } else {
            a(context, adEventListener);
        }
    }
}
