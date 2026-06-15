package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import com.startapp.f0;
import com.startapp.i1;
import com.startapp.k1;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.o9;
import com.startapp.q;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.g;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final d f23020h = new d();

    /* renamed from: c  reason: collision with root package name */
    public boolean f23023c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23024d;

    /* renamed from: f  reason: collision with root package name */
    public c f23026f;

    /* renamed from: g  reason: collision with root package name */
    public Context f23027g;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f23021a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap f23022b = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentLinkedQueue f23025e = new ConcurrentLinkedQueue();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23028a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f23029b;

        static {
            int[] iArr = new int[AdPreferences.Placement.values().length];
            f23029b = iArr;
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23029b[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[StartAppAd.AdMode.values().length];
            f23028a = iArr2;
            try {
                iArr2[StartAppAd.AdMode.OFFERWALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23028a[StartAppAd.AdMode.OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23028a[StartAppAd.AdMode.FULLPAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23028a[StartAppAd.AdMode.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23028a[StartAppAd.AdMode.REWARDED_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23028a[StartAppAd.AdMode.AUTOMATIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final StartAppAd f23030a;

        /* renamed from: b  reason: collision with root package name */
        public final AdPreferences.Placement f23031b;

        /* renamed from: c  reason: collision with root package name */
        public final AdPreferences f23032c;

        /* renamed from: d  reason: collision with root package name */
        public final AdEventListener f23033d;

        public b(StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, AdEventListener adEventListener) {
            this.f23030a = startAppAd;
            this.f23031b = placement;
            this.f23032c = adPreferences;
            this.f23033d = adEventListener;
        }
    }

    public final CacheKey a(Context context, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, boolean z10, boolean z11, int i10, AdEventListener adEventListener) {
        g gVar;
        Context a10 = f0.a(context);
        if (a10 == null) {
            a10 = context;
        }
        this.f23027g = a10;
        AdPreferences adPreferences2 = adPreferences == null ? new AdPreferences() : adPreferences;
        boolean z12 = z11 || z10;
        CacheKey cacheKey = new CacheKey(placement, adPreferences2);
        if (this.f23024d && !z12) {
            this.f23025e.add(new b(startAppAd, placement, adPreferences2, adEventListener));
            return cacheKey;
        }
        AdPreferences adPreferences3 = new AdPreferences(adPreferences2);
        synchronized (this.f23021a) {
            g gVar2 = (g) this.f23021a.get(cacheKey);
            if (gVar2 == null) {
                Context context2 = this.f23027g;
                Objects.requireNonNull(placement);
                gVar2 = new g(context2, placement, adPreferences3, placement != AdPreferences.Placement.INAPP_SPLASH);
                if (this.f23026f == null) {
                    this.f23026f = new c(this);
                }
                gVar2.f23054p = this.f23026f;
                if (z12) {
                    gVar2.f23046h = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                    gVar2.f23047i = true;
                    gVar2.f23051m = i10;
                }
                a(cacheKey, gVar2);
            } else {
                gVar2.f23042d = adPreferences3;
            }
            gVar = gVar2;
        }
        gVar.a(startAppAd, adEventListener, false, true, z11);
        return cacheKey;
    }

    public final com.startapp.sdk.adsbase.d b(CacheKey cacheKey) {
        g gVar;
        if (cacheKey == null || (gVar = (g) this.f23021a.get(cacheKey)) == null) {
            return null;
        }
        com.startapp.sdk.adsbase.d dVar = gVar.f23043e;
        if (dVar != null && dVar.isReady()) {
            com.startapp.sdk.adsbase.d dVar2 = gVar.f23043e;
            gVar.f23051m = 0;
            gVar.f23053o = null;
            if (!q.f22400f.booleanValue() && gVar.f23052n && CacheMetaData.d()) {
                gVar.a(null, null, true, true, false);
            } else if (!gVar.f23052n) {
                g.b bVar = gVar.f23054p;
                if (bVar != null) {
                    c cVar = (c) bVar;
                    synchronized (cVar.f23019a.f23021a) {
                        Iterator it = cVar.f23019a.f23021a.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (it.next() == gVar) {
                                it.remove();
                                break;
                            }
                        }
                    }
                }
                k1 k1Var = gVar.f23048j;
                if (k1Var != null) {
                    k1Var.f();
                    k1Var.d();
                }
            }
            return dVar2;
        }
        return null;
    }

    public final com.startapp.sdk.adsbase.d a(CacheKey cacheKey) {
        g gVar = cacheKey != null ? (g) this.f23021a.get(cacheKey) : null;
        if (gVar != null) {
            return gVar.f23043e;
        }
        return null;
    }

    public final void a(boolean z10) {
        for (g gVar : this.f23021a.values()) {
            com.startapp.sdk.adsbase.d dVar = gVar.f23043e;
            if (dVar != null) {
                WeakHashMap weakHashMap = o9.f22359a;
                if ((dVar instanceof ReturnAd) && !z10) {
                    if (!CacheMetaData.f23015a.a().g()) {
                        k1 k1Var = gVar.f23048j;
                        k1Var.f();
                        k1Var.f22122d = false;
                    }
                    i1 i1Var = gVar.f23049k;
                    i1Var.f();
                    i1Var.f22122d = false;
                }
            }
            k1 k1Var2 = gVar.f23048j;
            k1Var2.f();
            k1Var2.f22122d = false;
            i1 i1Var2 = gVar.f23049k;
            i1Var2.f();
            i1Var2.f22122d = false;
        }
    }

    public final void a(CacheKey cacheKey, g gVar) {
        synchronized (this.f23021a) {
            int d10 = CacheMetaData.f23015a.a().d();
            if (d10 != 0 && this.f23021a.size() >= d10) {
                long j10 = Long.MAX_VALUE;
                CacheKey cacheKey2 = null;
                for (CacheKey cacheKey3 : this.f23021a.keySet()) {
                    g gVar2 = (g) this.f23021a.get(cacheKey3);
                    if (gVar2.f23039a == gVar.f23039a) {
                        long j11 = gVar2.f23045g;
                        if (j11 < j10) {
                            cacheKey2 = cacheKey3;
                            j10 = j11;
                        }
                    }
                }
                if (cacheKey2 != null) {
                    this.f23021a.remove(cacheKey2);
                }
            }
            this.f23021a.put(cacheKey, gVar);
            if (Math.random() * 100.0d < CacheMetaData.f23015a.c()) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "Cache Size";
                l3Var.f22229e = String.valueOf(this.f23021a.size());
                l3Var.a();
            }
        }
    }

    public final CacheKey a(Context context, StartAppAd startAppAd, StartAppAd.AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener) {
        AdPreferences.Placement placement;
        switch (a.f23028a[adMode.ordinal()]) {
            case 1:
                WeakHashMap weakHashMap = o9.f22359a;
                placement = AdPreferences.Placement.INAPP_OFFER_WALL;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                placement = AdPreferences.Placement.INAPP_OVERLAY;
                break;
            case 6:
                WeakHashMap weakHashMap2 = o9.f22359a;
                if (new Random().nextInt(100) < AdsCommonMetaData.f22889h.i()) {
                    if ((new Random().nextInt(100) < AdsCommonMetaData.f22889h.j() || adPreferences.isForceFullpage()) && !adPreferences.isForceOverlay()) {
                        placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                        break;
                    } else {
                        placement = AdPreferences.Placement.INAPP_OVERLAY;
                        break;
                    }
                } else {
                    placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                    break;
                }
                break;
            default:
                placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                break;
        }
        AdPreferences.Placement placement2 = placement;
        if (adMode.equals(StartAppAd.AdMode.REWARDED_VIDEO)) {
            adPreferences.setType(Ad.AdType.REWARDED_VIDEO);
        } else if (adMode.equals(StartAppAd.AdMode.VIDEO)) {
            adPreferences.setType(Ad.AdType.VIDEO);
        }
        return a(context, startAppAd, placement2, adPreferences, false, false, 0, adEventListener);
    }

    public static boolean a(AdPreferences.Placement placement) {
        int ordinal = placement.ordinal();
        if (ordinal == 3) {
            Object obj = StartAppSDKInternal.C;
            return (StartAppSDKInternal.c.f22944a.f22931w || AdsCommonMetaData.f22889h.L()) ? false : true;
        } else if (ordinal != 7) {
            return true;
        } else {
            Object obj2 = StartAppSDKInternal.C;
            return StartAppSDKInternal.c.f22944a.f22929u && !AdsCommonMetaData.f22889h.K();
        }
    }
}
