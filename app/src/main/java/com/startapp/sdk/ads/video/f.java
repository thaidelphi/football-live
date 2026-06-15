package com.startapp.sdk.ads.video;

import android.content.Context;
import android.util.Base64;
import com.startapp.f2;
import com.startapp.g2;
import com.startapp.l3;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.i;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import com.startapp.t4;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Executor;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public LinkedList<CachedVideoAd> f22802a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f22803b;

    /* renamed from: c  reason: collision with root package name */
    public final t4<Executor> f22804c;

    /* renamed from: d  reason: collision with root package name */
    public final t4<com.startapp.sdk.adsbase.cache.d> f22805d;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements i.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i.b f22806a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CachedVideoAd f22807b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Context f22808c;

        public a(i.b bVar, CachedVideoAd cachedVideoAd, Context context) {
            this.f22806a = bVar;
            this.f22807b = cachedVideoAd;
            this.f22808c = context;
        }

        @Override // com.startapp.sdk.ads.video.i.b
        public final void a(String str) {
            i.b bVar = this.f22806a;
            if (bVar != null) {
                bVar.a(str);
            }
            if (str != null) {
                this.f22807b.a(System.currentTimeMillis());
                this.f22807b.a(str);
                f fVar = f.this;
                Context context = this.f22808c;
                CachedVideoAd cachedVideoAd = this.f22807b;
                fVar.f22802a.remove(cachedVideoAd);
                fVar.a(AdsCommonMetaData.f22889h.G().c() - 1);
                fVar.f22802a.add(cachedVideoAd);
                try {
                    com.startapp.sdk.components.a.a(context).A.a().execute(new f2(context, "CachedAds", fVar.f22802a));
                } catch (Throwable th) {
                    if (g2.a(1)) {
                        l3.a(th);
                    }
                }
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.a f22810a;

        public b(d.a aVar) {
            this.f22810a = aVar;
        }

        @Override // com.startapp.sdk.ads.video.d.a
        public final void a(String str) {
            d.a aVar = this.f22810a;
            if (aVar != null) {
                aVar.a(str);
            }
        }
    }

    public f(Context context, t4<Executor> t4Var, t4<com.startapp.sdk.adsbase.cache.d> t4Var2) {
        this.f22803b = context;
        this.f22804c = t4Var;
        this.f22805d = t4Var2;
    }

    public final boolean a(int i10) {
        ArrayList arrayList;
        boolean z10;
        Iterator<CachedVideoAd> it = this.f22802a.iterator();
        boolean z11 = false;
        while (it.hasNext() && this.f22802a.size() > i10) {
            CachedVideoAd next = it.next();
            com.startapp.sdk.adsbase.cache.d a10 = this.f22805d.a();
            String a11 = next.a();
            synchronized (a10) {
                arrayList = new ArrayList(a10.f23021a.values());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = false;
                    break;
                }
                com.startapp.sdk.adsbase.d dVar = ((com.startapp.sdk.adsbase.cache.g) it2.next()).f23043e;
                if (dVar instanceof VideoEnabledAd) {
                    VideoEnabledAd videoEnabledAd = (VideoEnabledAd) dVar;
                    if (videoEnabledAd.w() != null && videoEnabledAd.w().c() != null && videoEnabledAd.w().c().equals(a11)) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                it.remove();
                if (next.a() != null) {
                    new File(next.a()).delete();
                }
                z11 = true;
            }
        }
        return z11;
    }

    public final void a(Context context, String str, i.b bVar, d.a aVar) {
        String str2;
        if (this.f22802a == null) {
            LinkedList<CachedVideoAd> linkedList = (LinkedList) g2.c(context, "CachedAds");
            this.f22802a = linkedList;
            if (linkedList == null) {
                this.f22802a = new LinkedList<>();
            }
            if (a(AdsCommonMetaData.f22889h.G().c())) {
                try {
                    com.startapp.sdk.components.a.a(context).A.a().execute(new f2(context, "CachedAds", this.f22802a));
                } catch (Throwable th) {
                    if (g2.a(1)) {
                        l3.a(th);
                    }
                }
            }
        }
        try {
            URL url = new URL(str);
            String str3 = url.getHost() + url.getPath().replace("/", "_");
            try {
                String substring = str3.substring(0, str3.lastIndexOf(46));
                str2 = Base64.encodeToString(MessageDigest.getInstance("MD5").digest(substring.getBytes()), 0).replaceAll("[^a-zA-Z0-9]+", "_") + str3.substring(str3.lastIndexOf(46));
            } catch (NoSuchAlgorithmException e8) {
                l3.a(e8);
            }
            new i(context, url, str2, new a(bVar, new CachedVideoAd(str2), context), new b(aVar)).a();
        } catch (MalformedURLException e10) {
            if (bVar != null) {
                bVar.a(null);
            }
            l3.a(e10);
        }
    }
}
