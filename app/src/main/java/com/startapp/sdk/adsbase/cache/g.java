package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.f0;
import com.startapp.i1;
import com.startapp.k1;
import com.startapp.l;
import com.startapp.l3;
import com.startapp.o9;
import com.startapp.sdk.ads.interstitials.OverlayAd;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.offerWall.offerWallHtml.OfferWallAd;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.ads.video.VideoEnabledAd;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.List;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final AdPreferences.Placement f23039a;

    /* renamed from: b  reason: collision with root package name */
    public Context f23040b;

    /* renamed from: c  reason: collision with root package name */
    public ActivityExtra f23041c;

    /* renamed from: d  reason: collision with root package name */
    public AdPreferences f23042d;

    /* renamed from: e  reason: collision with root package name */
    public com.startapp.sdk.adsbase.d f23043e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f23044f;

    /* renamed from: g  reason: collision with root package name */
    public long f23045g;

    /* renamed from: h  reason: collision with root package name */
    public String f23046h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f23047i;

    /* renamed from: j  reason: collision with root package name */
    public k1 f23048j;

    /* renamed from: k  reason: collision with root package name */
    public i1 f23049k;

    /* renamed from: l  reason: collision with root package name */
    public final ConcurrentHashMap f23050l;

    /* renamed from: m  reason: collision with root package name */
    public int f23051m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f23052n;

    /* renamed from: o  reason: collision with root package name */
    public Long f23053o;

    /* renamed from: p  reason: collision with root package name */
    public b f23054p;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f23055a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f23056b = false;

        public a() {
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
        public final void onFailedToReceiveAd(Ad ad) {
            ConcurrentHashMap concurrentHashMap;
            List<StartAppAd> list;
            if (this.f23056b) {
                concurrentHashMap = null;
            } else {
                synchronized (g.this.f23050l) {
                    concurrentHashMap = new ConcurrentHashMap(g.this.f23050l);
                    g gVar = g.this;
                    gVar.f23043e = null;
                    gVar.f23050l.clear();
                }
            }
            if (concurrentHashMap != null) {
                for (AdEventListener adEventListener : concurrentHashMap.keySet()) {
                    if (adEventListener != null) {
                        g.this.getClass();
                        try {
                            list = (List) concurrentHashMap.get(adEventListener);
                        } catch (Throwable th) {
                            l3.a(th);
                            list = null;
                        }
                        if (list != null) {
                            for (StartAppAd startAppAd : list) {
                                if (ad != null) {
                                    startAppAd.setErrorMessage(ad.getErrorMessage());
                                }
                                l.a(g.this.f23040b, adEventListener, startAppAd, true);
                            }
                        }
                    }
                }
            }
            this.f23056b = true;
            g.this.f23049k.e();
            k1 k1Var = g.this.f23048j;
            k1Var.f();
            k1Var.d();
            g.this.f23044f.set(false);
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
        public final void onReceiveAd(Ad ad) {
            List<StartAppAd> list;
            com.startapp.sdk.adsbase.d dVar = g.this.f23043e;
            boolean z10 = dVar != null && dVar.a();
            if (!this.f23055a && !z10) {
                this.f23055a = true;
                synchronized (g.this.f23050l) {
                    for (AdEventListener adEventListener : g.this.f23050l.keySet()) {
                        if (adEventListener != null && (list = (List) g.this.f23050l.get(adEventListener)) != null) {
                            for (StartAppAd startAppAd : list) {
                                startAppAd.setErrorMessage(ad.getErrorMessage());
                                l.b(g.this.f23040b, adEventListener, ad, true);
                            }
                        }
                    }
                    g.this.f23050l.clear();
                }
            }
            g.this.f23048j.e();
            i1 i1Var = g.this.f23049k;
            i1Var.f();
            i1Var.d();
            i1Var.f22083f = 0;
            i1Var.f22084g = false;
            g.this.f23044f.set(false);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
    }

    public g(Context context, AdPreferences.Placement placement, AdPreferences adPreferences) {
        this.f23043e = null;
        this.f23044f = new AtomicBoolean(false);
        this.f23050l = new ConcurrentHashMap();
        this.f23052n = true;
        this.f23039a = placement;
        this.f23042d = adPreferences;
        a(context);
        a();
    }

    public final void a(Context context) {
        if (context instanceof Activity) {
            Context a10 = f0.a(context);
            if (a10 == null) {
                a10 = context;
            }
            this.f23040b = a10;
            this.f23041c = new ActivityExtra((Activity) context);
            return;
        }
        this.f23040b = context;
        this.f23041c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (com.startapp.b0.a(r0, (java.util.List) ((com.startapp.sdk.adsbase.JsonAd) r3).g(), 0, r4, false).size() == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            com.startapp.sdk.adsbase.d r0 = r7.f23043e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.isReady()
            if (r0 == 0) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L76
            android.content.Context r0 = r7.f23040b
            com.startapp.sdk.adsbase.d r3 = r7.f23043e
            com.startapp.sdk.adsbase.Ad r3 = (com.startapp.sdk.adsbase.Ad) r3
            if (r3 == 0) goto L4f
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            boolean r5 = r3 instanceof com.startapp.sdk.adsbase.HtmlAd
            if (r5 == 0) goto L3a
            com.startapp.sdk.adsbase.HtmlAd r3 = (com.startapp.sdk.adsbase.HtmlAd) r3
            java.lang.String r1 = r3.k()
            java.util.ArrayList r1 = com.startapp.b0.a(r1, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Boolean r0 = com.startapp.b0.a(r0, r1, r2, r4, r3)
            boolean r1 = r0.booleanValue()
            goto L50
        L3a:
            boolean r5 = r3 instanceof com.startapp.sdk.adsbase.JsonAd
            if (r5 == 0) goto L4f
            com.startapp.sdk.adsbase.JsonAd r3 = (com.startapp.sdk.adsbase.JsonAd) r3
            java.util.List r3 = r3.g()
            java.util.ArrayList r0 = com.startapp.b0.a(r0, r3, r2, r4, r2)
            int r0 = r0.size()
            if (r0 != 0) goto L4f
            goto L50
        L4f:
            r1 = r2
        L50:
            if (r1 != 0) goto L6c
            com.startapp.sdk.adsbase.d r0 = r7.f23043e
            if (r0 != 0) goto L57
            goto L5b
        L57:
            boolean r2 = r0.c()
        L5b:
            if (r2 == 0) goto L5e
            goto L6c
        L5e:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f23044f
            boolean r0 = r0.get()
            if (r0 != 0) goto L83
            com.startapp.k1 r0 = r7.f23048j
            r0.e()
            goto L83
        L6c:
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r1 = r7
            r1.a(r2, r3, r4, r5, r6)
            goto L83
        L76:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f23044f
            boolean r0 = r0.get()
            if (r0 != 0) goto L83
            com.startapp.i1 r0 = r7.f23049k
            r0.e()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.g.b():void");
    }

    public final void a() {
        this.f23048j = new k1(this);
        this.f23049k = new i1(this);
    }

    public final void a(boolean z10) {
        com.startapp.sdk.adsbase.d overlayAd;
        boolean z11;
        if (z10) {
            Long h10 = AdsCommonMetaData.f22889h.h();
            if (h10 != null && this.f23053o != null && SystemClock.elapsedRealtime() - this.f23053o.longValue() < h10.longValue()) {
                final Context context = this.f23040b;
                final AdPreferences.Placement placement = this.f23039a;
                l.a(this.f23040b, new a(), new Ad(context, placement) { // from class: com.startapp.sdk.adsbase.cache.CachedAd$3
                    @Override // com.startapp.sdk.adsbase.Ad
                    public final void a(AdPreferences adPreferences, AdEventListener adEventListener) {
                    }

                    @Override // com.startapp.sdk.adsbase.Ad
                    public final String getAdId() {
                        return null;
                    }

                    @Override // com.startapp.sdk.adsbase.Ad
                    public final String getBidToken() {
                        return null;
                    }

                    @Override // com.startapp.sdk.adsbase.Ad
                    public final String getErrorMessage() {
                        return "explicit call: nofill [204]";
                    }
                }, true);
                o9.a(this.f23040b, 6, "Failed to load " + this.f23039a.name() + " ad: NO FILL", true);
                z11 = true;
            } else {
                this.f23053o = Long.valueOf(SystemClock.elapsedRealtime());
                z11 = false;
            }
            if (z11) {
                return;
            }
        }
        int ordinal = this.f23039a.ordinal();
        if (ordinal == 0) {
            overlayAd = new OverlayAd(this.f23040b);
        } else if (ordinal == 7) {
            overlayAd = new ReturnAd(this.f23040b);
        } else if (ordinal == 2) {
            boolean z12 = new Random().nextInt(100) < AdsCommonMetaData.f22889h.w();
            boolean isForceOfferWall3D = this.f23042d.isForceOfferWall3D();
            boolean isForceOfferWall2D = true ^ this.f23042d.isForceOfferWall2D();
            WeakHashMap weakHashMap = o9.f22359a;
            if ((z12 || isForceOfferWall3D) && isForceOfferWall2D) {
                overlayAd = new OfferWall3DAd(this.f23040b);
            } else {
                overlayAd = new OfferWallAd(this.f23040b);
            }
        } else if (ordinal == 3) {
            overlayAd = new SplashAd(this.f23040b);
        } else if (ordinal != 4) {
            overlayAd = new OverlayAd(this.f23040b);
        } else {
            WeakHashMap weakHashMap2 = o9.f22359a;
            overlayAd = new VideoEnabledAd(this.f23040b, AdPreferences.Placement.INAPP_OVERLAY);
        }
        this.f23043e = overlayAd;
        overlayAd.setActivityExtra(this.f23041c);
        this.f23042d.setAutoLoadAmount(this.f23051m);
        this.f23043e.load(this.f23042d, new a());
        this.f23045g = System.currentTimeMillis();
    }

    public g(Context context, AdPreferences.Placement placement, AdPreferences adPreferences, boolean z10) {
        this(context, placement, adPreferences);
        this.f23052n = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.startapp.sdk.adsbase.StartAppAd r5, com.startapp.sdk.adsbase.adlisteners.AdEventListener r6, boolean r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r4.f23050l
            monitor-enter(r0)
            com.startapp.sdk.adsbase.d r1 = r4.f23043e     // Catch: java.lang.Throwable -> L75
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L11
            boolean r1 = r1.isReady()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L11
            r1 = r2
            goto L12
        L11:
            r1 = r3
        L12:
            if (r1 == 0) goto L25
            com.startapp.sdk.adsbase.d r1 = r4.f23043e     // Catch: java.lang.Throwable -> L75
            if (r1 != 0) goto L1a
            r1 = r3
            goto L1e
        L1a:
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L75
        L1e:
            if (r1 != 0) goto L25
            if (r7 == 0) goto L23
            goto L25
        L23:
            r7 = r3
            goto L26
        L25:
            r7 = r2
        L26:
            if (r7 == 0) goto L6a
            if (r5 == 0) goto L4e
            if (r6 == 0) goto L4e
            java.util.concurrent.ConcurrentHashMap r7 = r4.f23050l     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L35
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L35
            goto L3a
        L35:
            r7 = move-exception
            com.startapp.l3.a(r7)     // Catch: java.lang.Throwable -> L75
            r7 = 0
        L3a:
            if (r7 != 0) goto L4b
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L75
            r7.<init>()     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.ConcurrentHashMap r1 = r4.f23050l     // Catch: java.lang.Throwable -> L75
            r1.put(r6, r7)     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r6 = move-exception
            com.startapp.l3.a(r6)     // Catch: java.lang.Throwable -> L75
        L4b:
            r7.add(r5)     // Catch: java.lang.Throwable -> L75
        L4e:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f23044f     // Catch: java.lang.Throwable -> L75
            boolean r5 = r5.compareAndSet(r3, r2)     // Catch: java.lang.Throwable -> L75
            if (r5 == 0) goto L73
            com.startapp.k1 r5 = r4.f23048j     // Catch: java.lang.Throwable -> L75
            r5.f()     // Catch: java.lang.Throwable -> L75
            r5.d()     // Catch: java.lang.Throwable -> L75
            com.startapp.i1 r5 = r4.f23049k     // Catch: java.lang.Throwable -> L75
            r5.f()     // Catch: java.lang.Throwable -> L75
            r5.d()     // Catch: java.lang.Throwable -> L75
            r4.a(r8, r9)     // Catch: java.lang.Throwable -> L75
            goto L73
        L6a:
            if (r5 == 0) goto L73
            if (r6 == 0) goto L73
            android.content.Context r7 = r4.f23040b     // Catch: java.lang.Throwable -> L75
            com.startapp.l.b(r7, r6, r5, r2)     // Catch: java.lang.Throwable -> L75
        L73:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            return
        L75:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.g.a(com.startapp.sdk.adsbase.StartAppAd, com.startapp.sdk.adsbase.adlisteners.AdEventListener, boolean, boolean, boolean):void");
    }

    public final void a(boolean z10, boolean z11) {
        com.startapp.sdk.adsbase.d dVar = this.f23043e;
        if (dVar != null) {
            dVar.a(false);
        }
        if (this.f23047i && this.f23046h != null) {
            this.f23047i = false;
            e eVar = new e(this, new a(), z11, z10);
            Context context = this.f23040b;
            com.startapp.sdk.components.a.a(context).A.a().execute(new j(context, eVar, new f(this), this.f23046h));
            return;
        }
        a(z10);
    }
}
