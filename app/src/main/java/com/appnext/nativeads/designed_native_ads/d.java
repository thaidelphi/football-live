package com.appnext.nativeads.designed_native_ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.appnext.core.Ad;
import com.appnext.core.AppnextAd;
import com.appnext.core.C0400r;
import com.appnext.core.SettingsManager;
import com.appnext.core.p;
import com.appnext.nativeads.NativeAdObject;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {
    private Context aO;
    private List<a> fS;
    private String fT;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a {

        /* renamed from: ba  reason: collision with root package name */
        private String f10071ba;
        private DesignNativeAd fZ;
        private boolean gb = false;
        private boolean ga = false;

        public a(DesignNativeAd designNativeAd) {
            this.f10071ba = designNativeAd.getBannerID();
            this.fZ = designNativeAd;
        }

        public final void aL() {
            this.ga = true;
        }

        public final void aM() {
            this.gb = true;
        }

        public final DesignNativeAd aN() {
            return this.fZ;
        }

        public final boolean aO() {
            return this.ga;
        }

        public final boolean aP() {
            return this.gb;
        }

        public final boolean equals(Object obj) {
            if (obj != null) {
                try {
                    if (obj instanceof a) {
                        if (((a) obj).f10071ba.equals(this.f10071ba)) {
                            return true;
                        }
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("DesignedNativeAdsActionsController$Reports", th);
                }
            }
            return super.equals(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements C0400r.a {
        private DesignNativeAd fZ;
        private NativeAdObject gc;

        public b(DesignNativeAd designNativeAd) {
            this.gc = new NativeAdObject(d.this.aO, d.this.fT);
            this.fZ = designNativeAd;
        }

        @Override // com.appnext.core.C0400r.a
        public final Ad c() {
            return this.gc;
        }

        @Override // com.appnext.core.C0400r.a
        public final /* bridge */ /* synthetic */ AppnextAd d() {
            return this.fZ;
        }

        @Override // com.appnext.core.C0400r.a
        public final SettingsManager e() {
            return c.aK();
        }

        @Override // com.appnext.core.C0400r.a
        public final void report(String str) {
        }
    }

    public d(Context context, List<DesignNativeAd> list, String str) {
        this.aO = context;
        this.fT = str;
        e(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final DesignNativeAd designNativeAd) {
        try {
            new C0400r(this.aO, new b(designNativeAd)).d(designNativeAd);
            designNativeAd.getAdTitle();
            p.ac().a(new Runnable() { // from class: com.appnext.nativeads.designed_native_ads.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    com.appnext.core.adswatched.a.m(d.this.aO).j(designNativeAd.getBannerID(), DesignNativeAdObject.AUID);
                }
            });
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdsActionsController$impression", th);
        }
    }

    private void e(List<DesignNativeAd> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.fS = new ArrayList();
                    for (DesignNativeAd designNativeAd : list) {
                        this.fS.add(new a(designNativeAd));
                    }
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("DesignedNativeAdsActionsController$init", th);
            }
        }
    }

    public final void a(final DesignNativeAd designNativeAd, final int i10) {
        try {
            if (this.fS == null) {
                return;
            }
            int indexOf = this.fS.indexOf(new a(designNativeAd));
            if (indexOf >= 0 && indexOf <= this.fS.size() - 1) {
                final a aVar = this.fS.get(indexOf);
                if ((!Boolean.parseBoolean(c.aK().t("report_vta_instead_of_impresssion")) || indexOf == 0) && !aVar.aP() && i10 >= Integer.parseInt(c.aK().t("min_imp_precentage"))) {
                    int parseInt = Integer.parseInt(c.aK().t("postpone_impression_sec"));
                    if (Boolean.parseBoolean(c.aK().t("repeat_viewable_criteria")) && parseInt > 0) {
                        Handler handler = this.mHandler;
                        if (handler != null) {
                            handler.postDelayed(new Runnable() { // from class: com.appnext.nativeads.designed_native_ads.d.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        int indexOf2 = d.this.fS.indexOf(new a(designNativeAd));
                                        if ((indexOf2 <= 0 || !((a) d.this.fS.get(indexOf2)).aP()) && i10 >= Integer.parseInt(c.aK().t("min_imp_precentage"))) {
                                            d.this.c(aVar.aN());
                                            aVar.aM();
                                        }
                                    } catch (Throwable th) {
                                        com.appnext.base.a.a("DesignedNativeAdsActionsController$impressionIfNecessary", th);
                                    }
                                }
                            }, parseInt * 1000);
                            return;
                        }
                        return;
                    }
                    int indexOf2 = this.fS.indexOf(new a(designNativeAd));
                    if (indexOf2 <= 0 || !this.fS.get(indexOf2).aP()) {
                        aVar.aM();
                        c(aVar.aN());
                    }
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdsActionsController$impressionIfNecessary", th);
        }
    }

    public final void b(final DesignNativeAd designNativeAd, final int i10) {
        try {
            if (this.fS == null) {
                return;
            }
            int indexOf = this.fS.indexOf(new a(designNativeAd));
            if (Boolean.parseBoolean(c.aK().t("report_vta_instead_of_impresssion"))) {
                if ((!Boolean.parseBoolean(c.aK().t("report_vta_instead_of_impresssion")) || indexOf != 0) && indexOf >= 0 && indexOf <= this.fS.size() - 1) {
                    final a aVar = this.fS.get(indexOf);
                    if (!aVar.aO() && i10 >= Integer.parseInt(c.aK().t("min_vta_precentage"))) {
                        int parseInt = Integer.parseInt(c.aK().t("postpone_vta_sec"));
                        if (Boolean.parseBoolean(c.aK().t("repeat_vta_viewable_criteria")) && parseInt > 0) {
                            Handler handler = this.mHandler;
                            if (handler != null) {
                                handler.postDelayed(new Runnable() { // from class: com.appnext.nativeads.designed_native_ads.d.2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        try {
                                            int indexOf2 = d.this.fS.indexOf(new a(designNativeAd));
                                            if ((indexOf2 <= 0 || !((a) d.this.fS.get(indexOf2)).aP()) && i10 >= Integer.parseInt(c.aK().t("min_vta_precentage"))) {
                                                aVar.aL();
                                                d.this.b(aVar.aN());
                                            }
                                        } catch (Throwable th) {
                                            com.appnext.base.a.a("DesignedNativeAdsActionsController$impressionIfNecessary", th);
                                        }
                                    }
                                }, parseInt * 1000);
                                return;
                            }
                            return;
                        }
                        int indexOf2 = this.fS.indexOf(new a(designNativeAd));
                        if (indexOf2 <= 0 || !this.fS.get(indexOf2).aP()) {
                            aVar.aL();
                            b(aVar.aN());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdsActionsController$impressionIfNecessary", th);
        }
    }

    public final void a(DesignNativeAd designNativeAd) {
        try {
            new C0400r(this.aO, new b(designNativeAd)).a(designNativeAd, designNativeAd.getAppURL(), this.fT, null);
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdsActionsController$doClick", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final DesignNativeAd designNativeAd) {
        try {
            C0400r c0400r = new C0400r(this.aO, new b(designNativeAd));
            designNativeAd.getAdTitle();
            designNativeAd.getBannerID();
            c0400r.a(designNativeAd, designNativeAd.getImpressionUrl(), null);
            p.ac().a(new Runnable() { // from class: com.appnext.nativeads.designed_native_ads.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    com.appnext.core.adswatched.a.m(d.this.aO).j(designNativeAd.getBannerID(), DesignNativeAdObject.AUID);
                }
            });
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdsActionsController$vta", th);
        }
    }
}
