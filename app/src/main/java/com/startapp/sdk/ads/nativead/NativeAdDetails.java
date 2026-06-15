package com.startapp.sdk.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.startapp.b1;
import com.startapp.b6;
import com.startapp.cb;
import com.startapp.d2;
import com.startapp.j6;
import com.startapp.s7;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NativeAdDetails implements NativeAdInterface {

    /* renamed from: a  reason: collision with root package name */
    public final AdDetails f22662a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f22663b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f22664c;

    /* renamed from: f  reason: collision with root package name */
    public String f22667f;

    /* renamed from: g  reason: collision with root package name */
    public cb f22668g;

    /* renamed from: i  reason: collision with root package name */
    public b6 f22670i;

    /* renamed from: j  reason: collision with root package name */
    public NativeAdDisplayListener f22671j;

    /* renamed from: k  reason: collision with root package name */
    public j6 f22672k;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22665d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22666e = false;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<View> f22669h = new WeakReference<>(null);

    /* renamed from: l  reason: collision with root package name */
    public final a f22673l = new a();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements s7.b {
        public a() {
        }

        @Override // com.startapp.s7.b
        public final void onSent(String str) {
            NativeAdDetails nativeAdDetails = NativeAdDetails.this;
            nativeAdDetails.f22665d = true;
            d2.a("onShow", str, null, nativeAdDetails.f22671j != null);
            NativeAdDisplayListener nativeAdDisplayListener = nativeAdDetails.f22671j;
            if (nativeAdDisplayListener != null) {
                nativeAdDisplayListener.adDisplayed(nativeAdDetails);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements b1.b {

        /* renamed from: a  reason: collision with root package name */
        public int f22675a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Runnable f22676b;

        public b(Runnable runnable) {
            this.f22676b = runnable;
        }

        @Override // com.startapp.b1.b
        public final void a(Bitmap bitmap, int i10) {
            if (i10 == 0) {
                NativeAdDetails.this.f22663b = bitmap;
            } else {
                NativeAdDetails.this.f22664c = bitmap;
            }
            int i11 = this.f22675a + 1;
            this.f22675a = i11;
            if (i11 == 2) {
                this.f22676b.run();
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NativeAdDetails.a(NativeAdDetails.this, view);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NativeAdDetails.a(NativeAdDetails.this, view);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements cb.a {
        public e() {
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22681a;

        static {
            int[] iArr = new int[StartAppNativeAd.CampaignAction.values().length];
            f22681a = iArr;
            try {
                iArr[StartAppNativeAd.CampaignAction.OPEN_MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22681a[StartAppNativeAd.CampaignAction.LAUNCH_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public NativeAdDetails(AdDetails adDetails) {
        this.f22662a = adDetails;
    }

    public static void a(NativeAdDetails nativeAdDetails, View view) {
        nativeAdDetails.getClass();
        Context context = view.getContext();
        int i10 = f.f22681a[nativeAdDetails.getCampaignAction().ordinal()];
        if (i10 == 1) {
            boolean a10 = com.startapp.sdk.adsbase.a.a(context, AdPreferences.Placement.INAPP_NATIVE);
            if (nativeAdDetails.f22662a.B() && !a10) {
                com.startapp.sdk.adsbase.a.a(context, nativeAdDetails.f22662a.h(), nativeAdDetails.f22662a.w(), nativeAdDetails.f22662a.q(), new TrackingParams(nativeAdDetails.f22667f), AdsCommonMetaData.f22889h.z(), AdsCommonMetaData.f22889h.y(), nativeAdDetails.f22662a.C(), nativeAdDetails.f22662a.D(), false, null);
            } else {
                com.startapp.sdk.adsbase.a.a(context, nativeAdDetails.f22662a.h(), nativeAdDetails.f22662a.w(), new TrackingParams(nativeAdDetails.f22667f), nativeAdDetails.f22662a.C() && !a10, false);
            }
        } else if (i10 == 2) {
            com.startapp.sdk.adsbase.a.a(nativeAdDetails.getPackageName(), nativeAdDetails.f22662a.m(), nativeAdDetails.f22662a.h(), context, new TrackingParams(nativeAdDetails.f22667f));
        }
        NativeAdDisplayListener nativeAdDisplayListener = nativeAdDetails.f22671j;
        if (nativeAdDisplayListener != null) {
            nativeAdDisplayListener.adClicked(nativeAdDetails);
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        unregisterView();
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getCallToAction() {
        String f10;
        AdDetails adDetails = this.f22662a;
        return (adDetails == null || (f10 = adDetails.f()) == null) ? "" : f10;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public StartAppNativeAd.CampaignAction getCampaignAction() {
        StartAppNativeAd.CampaignAction campaignAction = StartAppNativeAd.CampaignAction.OPEN_MARKET;
        AdDetails adDetails = this.f22662a;
        return (adDetails == null || !adDetails.A()) ? campaignAction : StartAppNativeAd.CampaignAction.LAUNCH_APP;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getCategory() {
        String g10;
        AdDetails adDetails = this.f22662a;
        return (adDetails == null || (g10 = adDetails.g()) == null) ? "" : g10;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getDescription() {
        String j10;
        AdDetails adDetails = this.f22662a;
        return (adDetails == null || (j10 = adDetails.j()) == null) ? "" : j10;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public Bitmap getImageBitmap() {
        return this.f22663b;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getImageUrl() {
        AdDetails adDetails = this.f22662a;
        if (adDetails != null) {
            return adDetails.k();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getInstalls() {
        String l10;
        AdDetails adDetails = this.f22662a;
        return (adDetails == null || (l10 = adDetails.l()) == null) ? "" : l10;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getPackageName() {
        String q10;
        AdDetails adDetails = this.f22662a;
        return (adDetails == null || (q10 = adDetails.q()) == null) ? "" : q10;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public float getRating() {
        AdDetails adDetails = this.f22662a;
        if (adDetails != null) {
            return adDetails.s();
        }
        return 5.0f;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public Bitmap getSecondaryImageBitmap() {
        return this.f22664c;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getSecondaryImageUrl() {
        AdDetails adDetails = this.f22662a;
        if (adDetails != null) {
            return adDetails.t();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getTitle() {
        String v10;
        AdDetails adDetails = this.f22662a;
        return (adDetails == null || (v10 = adDetails.v()) == null) ? "" : v10;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public boolean isApp() {
        AdDetails adDetails = this.f22662a;
        if (adDetails != null) {
            return adDetails.z();
        }
        return true;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public boolean isBelowMinCPM() {
        AdDetails adDetails = this.f22662a;
        return adDetails != null && adDetails.o();
    }

    public void loadImages(Context context, Runnable runnable) {
        b bVar = new b(runnable);
        new b1(context, getImageUrl(), bVar, 0).a();
        new b1(context, getSecondaryImageUrl(), bVar, 1).a();
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void registerViewForInteraction(View view, List<View> list) {
        registerViewForInteraction(view, list, null);
    }

    public String toString() {
        String description = getDescription();
        if (description != null) {
            description = description.substring(0, Math.min(30, description.length()));
        }
        return "         Title: [" + getTitle() + "]\n         Description: [" + description + "]...\n         Rating: [" + getRating() + "]\n         Installs: [" + getInstalls() + "]\n         Category: [" + getCategory() + "]\n         PackageName: [" + getPackageName() + "]\n         CampaginAction: [" + getCampaignAction() + "]\n";
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void unregisterView() {
        b6 b6Var;
        NotDisplayedReason notDisplayedReason;
        cb cbVar = this.f22668g;
        if (cbVar != null) {
            try {
                s7 s7Var = cbVar.f21857f;
                if (s7Var != null && (notDisplayedReason = cbVar.f21852a) != null) {
                    s7Var.a(notDisplayedReason.toString(), cbVar.f21853b);
                }
                cbVar.f21855d.removeCallbacksAndMessages(null);
            } catch (Throwable unused) {
            }
            this.f22668g = null;
        }
        View view = this.f22669h.get();
        this.f22669h.clear();
        if (view == null || Build.VERSION.SDK_INT < 12 || (b6Var = this.f22670i) == null) {
            return;
        }
        view.removeOnAttachStateChangeListener(b6Var);
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void registerViewForInteraction(View view, List<View> list, NativeAdDisplayListener nativeAdDisplayListener) {
        if (list != null && !list.isEmpty() && this.f22669h.get() == null) {
            d dVar = new d();
            for (View view2 : list) {
                view2.setOnClickListener(dVar);
            }
            this.f22669h = new WeakReference<>(view);
            if (!view.hasWindowFocus() && Build.VERSION.SDK_INT >= 12) {
                if (this.f22670i == null) {
                    this.f22670i = new b6(this);
                }
                view.addOnAttachStateChangeListener(this.f22670i);
            } else {
                a();
            }
        } else {
            registerViewForInteraction(view);
        }
        this.f22671j = nativeAdDisplayListener;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void registerViewForInteraction(View view) {
        this.f22669h = new WeakReference<>(view);
        if (!view.hasWindowFocus() && Build.VERSION.SDK_INT >= 12) {
            if (this.f22670i == null) {
                this.f22670i = new b6(this);
            }
            view.addOnAttachStateChangeListener(this.f22670i);
        } else {
            a();
        }
        this.f22669h.get().setOnClickListener(new c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r2.f21856e.get() != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r12 = this;
            com.startapp.cb r0 = r12.f22668g
            if (r0 != 0) goto Lb9
            boolean r0 = r12.f22665d
            if (r0 == 0) goto La
            goto Lb9
        La:
            java.lang.ref.WeakReference<android.view.View> r0 = r12.f22669h
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L1c
            com.startapp.sdk.ads.nativead.NativeAdDisplayListener r0 = r12.f22671j
            if (r0 == 0) goto L1b
            r0.adNotDisplayed(r12)
        L1b:
            return
        L1c:
            com.startapp.sdk.adsbase.model.AdDetails r1 = r12.f22662a
            r2 = 0
            if (r1 == 0) goto L27
            java.lang.String[] r1 = r1.r()
            r6 = r1
            goto L28
        L27:
            r6 = r2
        L28:
            com.startapp.s7 r1 = new com.startapp.s7
            android.content.Context r4 = r0.getContext()
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r5 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_NATIVE
            com.startapp.sdk.adsbase.commontracking.TrackingParams r7 = new com.startapp.sdk.adsbase.commontracking.TrackingParams
            java.lang.String r3 = r12.f22667f
            r7.<init>(r3)
            com.startapp.sdk.adsbase.model.AdDetails r3 = r12.f22662a
            if (r3 == 0) goto L50
            java.lang.Long r8 = r3.i()
            if (r8 == 0) goto L50
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Long r3 = r3.i()
            long r9 = r3.longValue()
            long r8 = r8.toMillis(r9)
            goto L5c
        L50:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            com.startapp.sdk.adsbase.remoteconfig.MetaData r8 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f23158k
            long r8 = r8.s()
            long r8 = r3.toMillis(r8)
        L5c:
            com.startapp.sdk.ads.nativead.NativeAdDetails$a r11 = r12.f22673l
            r10 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r10, r11)
            android.content.Context r0 = r0.getContext()
            com.startapp.sdk.adsbase.model.AdDetails r3 = r12.f22662a
            if (r3 == 0) goto L6f
            java.lang.String[] r2 = r3.c()
        L6f:
            com.startapp.sdk.adsbase.commontracking.TrackingParams r3 = new com.startapp.sdk.adsbase.commontracking.TrackingParams
            java.lang.String r4 = r12.f22667f
            r3.<init>(r4)
            if (r0 == 0) goto L81
            if (r2 == 0) goto L81
            java.util.List r2 = java.util.Arrays.asList(r2)
            com.startapp.k3.a(r0, r2, r3)
        L81:
            com.startapp.sdk.ads.banner.BannerMetaData r0 = com.startapp.sdk.ads.banner.BannerMetaData.f22541b
            com.startapp.sdk.ads.banner.BannerOptions r0 = r0.a()
            com.startapp.cb r2 = new com.startapp.cb
            java.lang.ref.WeakReference<android.view.View> r3 = r12.f22669h
            r2.<init>(r3, r1, r0)
            r12.f22668g = r2
            com.startapp.sdk.ads.nativead.NativeAdDetails$e r0 = new com.startapp.sdk.ads.nativead.NativeAdDetails$e
            r0.<init>()
            r2.f21854c = r0
            com.startapp.s7 r0 = r2.f21857f
            r1 = 1
            r3 = 0
            if (r0 == 0) goto Lb3
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f22511j
            int r0 = r0.get()
            if (r0 == 0) goto La7
            r0 = r1
            goto La8
        La7:
            r0 = r3
        La8:
            if (r0 != 0) goto Lb3
            java.lang.ref.WeakReference<android.view.View> r0 = r2.f21856e
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto Lb3
            goto Lb4
        Lb3:
            r1 = r3
        Lb4:
            if (r1 == 0) goto Lb9
            r2.run()
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.nativead.NativeAdDetails.a():void");
    }
}
