package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.o2;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.t2;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxAdPlacer implements t2.a {

    /* renamed from: a  reason: collision with root package name */
    private AppLovinSdkUtils.Size f9924a;

    /* renamed from: b  reason: collision with root package name */
    private MaxNativeAdViewBinder f9925b;

    /* renamed from: c  reason: collision with root package name */
    private final o2 f9926c;

    /* renamed from: d  reason: collision with root package name */
    private final t2 f9927d;

    /* renamed from: e  reason: collision with root package name */
    private Listener f9928e;
    protected final n logger;
    protected final j sdk;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i10);

        void onAdRemoved(int i10);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10, Collection collection) {
        if (n.a()) {
            n nVar = this.logger;
            nVar.a("MaxAdPlacer", "Clearing trailing ads after position " + i10);
        }
        this.f9926c.a(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f9926c.a();
        this.f9927d.a();
    }

    public void clearAds() {
        a(this.f9926c.b(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.a
            @Override // java.lang.Runnable
            public final void run() {
                MaxAdPlacer.this.b();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i10) {
        final Collection<Integer> e8 = this.f9926c.e(i10);
        if (!e8.isEmpty()) {
            a(e8, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.c
                @Override // java.lang.Runnable
                public final void run() {
                    MaxAdPlacer.this.a(i10, e8);
                }
            });
        }
        return e8;
    }

    public void destroy() {
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f9927d.c();
    }

    public long getAdItemId(int i10) {
        if (isFilledPosition(i10)) {
            return -System.identityHashCode(this.f9926c.a(i10));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i10, int i11) {
        if (isFilledPosition(i10)) {
            AppLovinSdkUtils.Size size = this.f9924a;
            boolean z10 = size != AppLovinSdkUtils.Size.ZERO;
            int min = Math.min(z10 ? size.getWidth() : 360, i11);
            x2 x2Var = (x2) this.f9926c.a(i10);
            if ("small_template_1".equalsIgnoreCase(x2Var.v0())) {
                return new AppLovinSdkUtils.Size(min, z10 ? this.f9924a.getHeight() : 120);
            } else if (MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(x2Var.v0())) {
                return new AppLovinSdkUtils.Size(min, (int) (min / (z10 ? this.f9924a.getWidth() / this.f9924a.getHeight() : 1.2d)));
            } else if (z10) {
                return this.f9924a;
            } else {
                if (x2Var.s0() != null) {
                    View mainView = x2Var.s0().getMainView();
                    return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
                }
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i10) {
        return this.f9926c.b(i10);
    }

    public int getAdjustedPosition(int i10) {
        return this.f9926c.c(i10);
    }

    public int getOriginalPosition(int i10) {
        return this.f9926c.d(i10);
    }

    public void insertItem(int i10) {
        if (n.a()) {
            n nVar = this.logger;
            nVar.a("MaxAdPlacer", "Inserting item at position: " + i10);
        }
        this.f9926c.f(i10);
    }

    public boolean isAdPosition(int i10) {
        return this.f9926c.g(i10);
    }

    public boolean isFilledPosition(int i10) {
        return this.f9926c.h(i10);
    }

    public void loadAds() {
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.f9927d.e();
    }

    public void moveItem(int i10, int i11) {
        this.f9926c.b(i10, i11);
    }

    @Override // com.applovin.impl.t2.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f9928e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.t2.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f9928e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.t2.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (n.a()) {
            n nVar = this.logger;
            nVar.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.t2.a
    public void onNativeAdLoaded() {
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(final int i10) {
        List emptyList;
        if (isFilledPosition(i10)) {
            emptyList = Collections.singletonList(Integer.valueOf(i10));
        } else {
            emptyList = Collections.emptyList();
        }
        a(emptyList, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.b
            @Override // java.lang.Runnable
            public final void run() {
                MaxAdPlacer.this.a(i10);
            }
        });
    }

    public void renderAd(int i10, ViewGroup viewGroup) {
        MaxAd a10 = this.f9926c.a(i10);
        if (a10 == null) {
            if (n.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i10);
                return;
            }
            return;
        }
        MaxNativeAdView s02 = ((x2) a10).s0();
        if (s02 != null) {
            if (n.a()) {
                this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i10);
            }
        } else if (this.f9925b != null) {
            s02 = new MaxNativeAdView(this.f9925b, viewGroup.getContext());
            if (this.f9927d.a(s02, a10)) {
                if (n.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i10);
                }
            } else if (n.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10);
            }
        } else if (n.a()) {
            this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
            return;
        } else {
            return;
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (s02.getParent() != null) {
            ((ViewGroup) s02.getParent()).removeView(s02);
        }
        viewGroup.addView(s02, -1, -1);
    }

    public void setAdSize(int i10, int i11) {
        this.f9924a = new AppLovinSdkUtils.Size(i10, i11);
    }

    public void setListener(Listener listener) {
        this.f9928e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f9925b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i10, int i11) {
        this.f9926c.c(i10, i11);
        if (i10 == -1 || i11 == -1) {
            return;
        }
        a();
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f9924a = AppLovinSdkUtils.Size.ZERO;
        j a10 = appLovinSdk.a();
        this.sdk = a10;
        n I = a10.I();
        this.logger = I;
        this.f9926c = new o2(maxAdPlacerSettings);
        this.f9927d = new t2(maxAdPlacerSettings, context, this);
        if (n.a()) {
            I.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        if (n.a()) {
            n nVar = this.logger;
            nVar.a("MaxAdPlacer", "Removing item at position: " + i10);
        }
        this.f9926c.i(i10);
    }

    private void a() {
        int c10;
        while (this.f9927d.d() && (c10 = this.f9926c.c()) != -1) {
            if (n.a()) {
                n nVar = this.logger;
                nVar.a("MaxAdPlacer", "Placing ad at position: " + c10);
            }
            this.f9926c.a(this.f9927d.b(), c10);
            Listener listener = this.f9928e;
            if (listener != null) {
                listener.onAdLoaded(c10);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f9927d.a(this.f9926c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (n.a()) {
            n nVar = this.logger;
            nVar.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f9928e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f9928e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
