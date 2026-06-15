package com.startapp.sdk.ads.video;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.e3;
import com.startapp.l;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.m4;
import com.startapp.o9;
import com.startapp.q0;
import com.startapp.q9;
import com.startapp.r9;
import com.startapp.sdk.ads.video.VideoUtil;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.i;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.ads.video.vast.b;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.t9;
import com.startapp.w9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends q0 {

    /* renamed from: m  reason: collision with root package name */
    public final long f22785m;

    /* renamed from: n  reason: collision with root package name */
    public volatile CacheKey f22786n;

    /* renamed from: o  reason: collision with root package name */
    public int f22787o;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements b.a {
        public a() {
        }
    }

    /* compiled from: Sta */
    /* renamed from: com.startapp.sdk.ads.video.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0250b implements i.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f22789a;

        public C0250b(boolean z10) {
            this.f22789a = z10;
        }

        @Override // com.startapp.sdk.ads.video.i.b
        public final void a(String str) {
            if (str != null) {
                if (!str.equals("downloadInterrupted")) {
                    b.super.b(this.f22789a);
                    b.this.g().a(str);
                }
                b.this.c(this.f22789a);
                return;
            }
            b.this.c(false);
            b bVar = b.this;
            l.a(bVar.f23002a, bVar.a(), b.this.f23003b, false);
            b.a(b.this, VASTErrorCodes.FileNotFound, (ArrayList) null);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements d.a {
        public c() {
        }

        @Override // com.startapp.sdk.ads.video.d.a
        public final void a(String str) {
            b.this.g().a(str);
        }
    }

    public b(Context context, Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        super(context, ad, adPreferences, adEventListener, placement, true);
        this.f22785m = System.currentTimeMillis();
        this.f22787o = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:4:0x0006, B:28:0x0062, B:30:0x0065, B:33:0x006d, B:35:0x0073, B:37:0x0079, B:41:0x0097, B:42:0x009d, B:44:0x00a3, B:46:0x00ab, B:21:0x0042, B:23:0x0048, B:25:0x0052, B:48:0x00b1, B:6:0x000c, B:8:0x0010, B:9:0x001b, B:11:0x0021, B:13:0x002d, B:15:0x0032, B:17:0x0038), top: B:56:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.startapp.sdk.ads.video.b r6, com.startapp.sdk.ads.video.vast.VASTErrorCodes r7, java.util.ArrayList r8) {
        /*
            r6.getClass()
            r0 = 0
            if (r8 == 0) goto L42
            int r1 = r8.size()     // Catch: java.lang.Throwable -> Lcf
            if (r1 <= 0) goto L42
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r1 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.SAProcessSuccess     // Catch: java.lang.Throwable -> L3d
            if (r7 != r1) goto L32
            java.util.WeakHashMap r1 = com.startapp.o9.f22359a     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            r1.<init>()     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L3d
        L1b:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L31
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3d
            boolean r3 = com.startapp.o9.b(r2)     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L1b
            r1.add(r2)     // Catch: java.lang.Throwable -> L3d
            goto L1b
        L31:
            r8 = r1
        L32:
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L3d
            if (r1 <= 0) goto L5f
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r8 = com.startapp.sdk.ads.video.tracking.VideoTrackingDetails.a(r8)     // Catch: java.lang.Throwable -> L3d
            goto L60
        L3d:
            r8 = move-exception
            com.startapp.l3.a(r8)     // Catch: java.lang.Throwable -> Lcf
            goto L5f
        L42:
            com.startapp.sdk.ads.video.VideoAdDetails r8 = r6.g()     // Catch: java.lang.Throwable -> Lcf
            if (r8 == 0) goto L5f
            com.startapp.sdk.ads.video.VideoAdDetails r8 = r6.g()     // Catch: java.lang.Throwable -> Lcf
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r8 = r8.i()     // Catch: java.lang.Throwable -> Lcf
            if (r8 == 0) goto L5f
            com.startapp.sdk.ads.video.VideoAdDetails r8 = r6.g()     // Catch: java.lang.Throwable -> Lcf
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r8 = r8.i()     // Catch: java.lang.Throwable -> Lcf
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r8 = r8.e()     // Catch: java.lang.Throwable -> Lcf
            goto L60
        L5f:
            r8 = r0
        L60:
            if (r8 == 0) goto Ld3
            int r1 = r8.length     // Catch: java.lang.Throwable -> Lcf
            if (r1 <= 0) goto Ld3
            com.startapp.sdk.ads.video.VideoAdDetails r1 = r6.g()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r2 = ""
            if (r1 == 0) goto L78
            java.lang.String r3 = r1.j()     // Catch: java.lang.Throwable -> Lcf
            if (r3 == 0) goto L78
            java.lang.String r1 = r1.j()     // Catch: java.lang.Throwable -> Lcf
            goto L79
        L78:
            r1 = r2
        L79:
            com.startapp.sdk.ads.video.tracking.VideoTrackingParams r3 = new com.startapp.sdk.ads.video.tracking.VideoTrackingParams     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r4 = "1"
            r5 = 0
            r3.<init>(r5, r5, r2, r4)     // Catch: java.lang.Throwable -> Lcf
            com.startapp.ja r2 = new com.startapp.ja     // Catch: java.lang.Throwable -> Lcf
            r2.<init>(r5, r3, r1, r8)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r8 = "error"
            r2.f22157e = r8     // Catch: java.lang.Throwable -> Lcf
            r2.f22158f = r7     // Catch: java.lang.Throwable -> Lcf
            com.startapp.ia r7 = r2.a()     // Catch: java.lang.Throwable -> Lcf
            android.content.Context r6 = r6.f23002a     // Catch: java.lang.Throwable -> Lcf
            if (r6 != 0) goto L95
            goto Ld3
        L95:
            if (r7 == 0) goto Ld3
            java.util.List<java.lang.String> r7 = r7.f22112a     // Catch: java.lang.Throwable -> Lcf
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lcf
        L9d:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> Lcf
            if (r8 == 0) goto Ld3
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Lcf
            if (r8 == 0) goto L9d
            int r1 = r8.length()     // Catch: java.lang.Throwable -> Lcf
            if (r1 <= 0) goto L9d
            com.startapp.sdk.components.a r1 = com.startapp.sdk.components.a.a(r6)     // Catch: java.lang.Throwable -> Lca
            com.startapp.t4<java.util.concurrent.Executor> r2 = r1.f23249y     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> Lca
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch: java.lang.Throwable -> Lca
            com.startapp.g9 r3 = new com.startapp.g9     // Catch: java.lang.Throwable -> Lca
            com.startapp.t4<com.startapp.h7> r4 = r1.f23232h     // Catch: java.lang.Throwable -> Lca
            com.startapp.t4<com.startapp.b3> r1 = r1.f23237m     // Catch: java.lang.Throwable -> Lca
            r3.<init>(r4, r1, r8, r0)     // Catch: java.lang.Throwable -> Lca
            r2.execute(r3)     // Catch: java.lang.Throwable -> Lca
            goto L9d
        Lca:
            r8 = move-exception
            com.startapp.l3.a(r8)     // Catch: java.lang.Throwable -> Lcf
            goto L9d
        Lcf:
            r6 = move-exception
            com.startapp.l3.a(r6)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.b.a(com.startapp.sdk.ads.video.b, com.startapp.sdk.ads.video.vast.VASTErrorCodes, java.util.ArrayList):void");
    }

    @Override // com.startapp.q0
    public final boolean b(GetAdRequest getAdRequest) {
        VideoUtil.VideoEligibility a10;
        if (super.b(getAdRequest)) {
            Ad.AdType adType = getAdRequest.V0;
            if (!(adType == Ad.AdType.VIDEO || adType == Ad.AdType.REWARDED_VIDEO) || (a10 = VideoUtil.a(this.f23002a)) == VideoUtil.VideoEligibility.ELIGIBLE) {
                return true;
            }
            this.f23007f = a10.a();
            return false;
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.b
    public final GetAdRequest d() {
        GetAdRequest a10 = a((GetAdRequest) new com.startapp.sdk.ads.video.a());
        if (a10 != null) {
            a10.d(this.f23002a);
        }
        return a10;
    }

    public final VideoAdDetails g() {
        return ((VideoEnabledAd) this.f23003b).w();
    }

    public final void d(boolean z10) {
        AdPreferences adPreferences;
        Ad.AdType type = this.f23003b.getType();
        Ad.AdType adType = Ad.AdType.REWARDED_VIDEO;
        if ((type == adType || this.f23003b.getType() == Ad.AdType.VIDEO) && !z10) {
            return;
        }
        AdPreferences adPreferences2 = this.f23004c;
        if (adPreferences2 == null) {
            adPreferences = new AdPreferences();
        } else {
            adPreferences = new AdPreferences(adPreferences2);
        }
        adPreferences.setType((this.f23003b.getType() == adType || this.f23003b.getType() == Ad.AdType.VIDEO) ? Ad.AdType.VIDEO_NO_VAST : Ad.AdType.NON_VIDEO);
        CacheKey a10 = com.startapp.sdk.adsbase.cache.d.f23020h.a(this.f23002a, null, this.f23006e, adPreferences, false, false, 0, null);
        if (z10) {
            this.f22786n = a10;
        }
    }

    @Override // com.startapp.q0, com.startapp.sdk.adsbase.b
    public final void b(boolean z10) {
        if (g() != null) {
            return;
        }
        super.b(z10);
    }

    @Override // com.startapp.q0, com.startapp.sdk.adsbase.b
    public final boolean a(Object obj) {
        VASTErrorCodes vASTErrorCodes;
        e3 e3Var = (e3) obj;
        String str = e3Var != null ? e3Var.f21904c : null;
        if (str != null && str.toLowerCase().contains("json")) {
            VideoConfig G = AdsCommonMetaData.f22889h.G();
            if (G.r()) {
                Set<String> set = this.f22406i.J0;
                if (((set == null || set.size() <= 0) ? null : 1) == null) {
                    d(true);
                }
            }
            try {
                t9 t9Var = (t9) m4.a(t9.class, e3Var.f21903b);
                if (t9Var != null && t9Var.getVastTag() != null) {
                    String S = MetaData.f23158k.S();
                    r9 r9Var = (!t9Var.isRecordHops() || TextUtils.isEmpty(S)) ? null : new r9(this.f23002a, S, t9Var.getPartnerResponse(), t9Var.getPartnerName(), t9Var.isSkipFailed());
                    com.startapp.sdk.ads.video.vast.b bVar = new com.startapp.sdk.ads.video.vast.b(this.f23002a.getResources().getDisplayMetrics(), com.startapp.sdk.components.a.a(this.f23002a).f23225a.a().a());
                    bVar.f22872f = G.f();
                    bVar.f22869c = new a();
                    String vastTag = t9Var.getVastTag();
                    bVar.f22873g.clear();
                    q9 a10 = bVar.a(vastTag, new ArrayList(), r9Var);
                    if (a10 != null) {
                        int i10 = (int) (bVar.f22867a / bVar.f22868b);
                        Iterator it = bVar.f22873g.iterator();
                        com.startapp.sdk.ads.video.vast.a aVar = null;
                        while (it.hasNext()) {
                            com.startapp.sdk.ads.video.vast.a aVar2 = (com.startapp.sdk.ads.video.vast.a) it.next();
                            if (aVar == null || aVar2.a(bVar.f22867a, i10) > aVar.a(bVar.f22867a, i10)) {
                                aVar = aVar2;
                            }
                        }
                        a10.f22435o = aVar;
                        ArrayList arrayList = new ArrayList(a10.f22421a);
                        VASTErrorCodes vASTErrorCodes2 = VASTErrorCodes.SAProcessSuccess;
                        bVar.a(vASTErrorCodes2, arrayList);
                        if (r9Var != null) {
                            r9Var.a(vASTErrorCodes2);
                        }
                    } else if (r9Var != null && (vASTErrorCodes = bVar.f22870d) != null) {
                        r9Var.a(vASTErrorCodes);
                    }
                    if (a10 != null) {
                        ((VideoEnabledAd) this.f23003b).a(a10, G, this.f23003b.getType() != Ad.AdType.REWARDED_VIDEO ? new w9(t9Var.getSkipafter(), t9Var.getSkipmin()) : null);
                        if (t9Var.getTtlSec() != null) {
                            ((VideoEnabledAd) this.f23003b).b(t9Var.getTtlSec());
                        }
                        e3Var.f21903b = t9Var.getAdmTag();
                        e3Var.f21904c = "text/html";
                        return super.a(e3Var);
                    }
                    if (t9Var.getCampaignId() != null) {
                        this.f22405h.add(t9Var.getCampaignId());
                    }
                    this.f22787o++;
                    ((VideoEnabledAd) this.f23003b).v();
                    if (System.currentTimeMillis() - this.f22785m >= G.o()) {
                        return a("VAST retry timeout", (Exception) null, false);
                    }
                    if (this.f22787o > G.e()) {
                        return a("VAST too many excludes", (Exception) null, false);
                    }
                    return b();
                }
                return a("no VAST wrapper in json", (Exception) null, true);
            } catch (Exception e8) {
                return a("VAST json parsing", e8, true);
            }
        }
        String str2 = e3Var != null ? e3Var.f21903b : null;
        if (AdsCommonMetaData.f22889h.G().r()) {
            if (o9.a(str2, "@videoJson@", "@videoJson@") != null) {
                d(false);
            }
        }
        return super.a(obj);
    }

    @Override // com.startapp.sdk.adsbase.b
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            if (g() != null) {
                if (AdsCommonMetaData.f22889h.G().q()) {
                    super.b(z10);
                }
                g().a(this.f23004c.isVideoMuted());
                C0250b c0250b = new C0250b(z10);
                c cVar = new c();
                f a10 = com.startapp.sdk.components.a.a(this.f23002a).K.a();
                a10.f22804c.a().execute(new e(a10, g().j(), c0250b, cVar));
                return;
            }
        }
        c(z10);
    }

    public final boolean a(String str, Exception exc, boolean z10) {
        if (exc != null) {
            l3.a(exc);
        } else if (z10) {
            l3 l3Var = new l3(m3.f22275e);
            l3Var.f22228d = str;
            l3Var.a();
        }
        com.startapp.sdk.adsbase.d b10 = com.startapp.sdk.adsbase.cache.d.f23020h.b(this.f22786n);
        if (b10 instanceof HtmlAd) {
            e3 e3Var = new e3();
            e3Var.f21904c = "text/html";
            e3Var.f21903b = ((HtmlAd) b10).k();
            return super.a(e3Var);
        }
        this.f23003b.setErrorMessage(this.f23007f);
        return false;
    }
}
