package com.appnext.banners;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.appnext.core.callbacks.OnECPMLoaded;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class BaseBannerView extends ViewGroup {
    protected BaseBannerAdapter bannerAdapter;
    private BannerListener bannerListener;
    private String language;
    ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;

    public BaseBannerView(Context context) {
        super(context);
        this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.appnext.banners.BaseBannerView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                BaseBannerView.this.impression();
                BaseBannerView.this.onScrollChanged();
            }
        };
        if (context != null) {
            parseAttributeSet(null);
            return;
        }
        throw new IllegalArgumentException("The context cannot be null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void impression() {
        try {
            getBannerAdapter().impression();
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$impression", th);
        }
    }

    private boolean isViewPartiallyVisible(View view) {
        try {
            if (getParent() == null) {
                return false;
            }
            Rect rect = new Rect();
            ((ViewGroup) getParent()).getHitRect(rect);
            return view.getLocalVisibleRect(rect);
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$isViewPartiallyVisible", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onScrollChanged() {
        try {
            getBannerAdapter().onScrollChanged(getVisiblePercent(this));
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$onScrollChanged", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r2 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (r2 != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        setBannerSize(com.appnext.banners.BannerSize.MEDIUM_RECTANGLE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        throw new java.lang.IllegalArgumentException("Wrong banner size " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
        setBannerSize(com.appnext.banners.BannerSize.LARGE_BANNER);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseAttributeSet(android.util.AttributeSet r8) {
        /*
            r7 = this;
            boolean r0 = r7.isInEditMode()     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto L7
            return
        L7:
            com.appnext.banners.BaseBannerAdapter r0 = r7.getBannerAdapter()     // Catch: java.lang.Throwable -> Lc8
            r0.init(r7)     // Catch: java.lang.Throwable -> Lc8
            com.appnext.banners.d r0 = com.appnext.banners.d.K()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r1 = "tid"
            java.lang.String r2 = "301"
            r0.h(r1, r2)     // Catch: java.lang.Throwable -> Lc8
            android.view.ViewTreeObserver r0 = r7.getViewTreeObserver()     // Catch: java.lang.Throwable -> Lc8
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r7.onScrollChangedListener     // Catch: java.lang.Throwable -> Lc8
            r0.addOnScrollChangedListener(r1)     // Catch: java.lang.Throwable -> Lc8
            if (r8 != 0) goto L25
            return
        L25:
            android.content.res.Resources r0 = r7.getResources()     // Catch: java.lang.Throwable -> Lc8
            int[] r1 = com.appnext.banners.R.styleable.BannersAttrs     // Catch: java.lang.Throwable -> Lc8
            android.content.res.TypedArray r0 = r0.obtainAttributes(r8, r1)     // Catch: java.lang.Throwable -> Lc8
            int r1 = com.appnext.banners.R.styleable.BannersAttrs_bannerSize     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> Lc8
            if (r1 == 0) goto L96
            r2 = -1
            int r3 = r1.hashCode()     // Catch: java.lang.Throwable -> Lc8
            r4 = -1966536496(0xffffffff8ac908d0, float:-1.9358911E-32)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L62
            r4 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
            if (r3 == r4) goto L58
            r4 = 1951953708(0x7458732c, float:6.859571E31)
            if (r3 == r4) goto L4e
            goto L6b
        L4e:
            java.lang.String r3 = "BANNER"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc8
            if (r3 == 0) goto L6b
            r2 = 0
            goto L6b
        L58:
            java.lang.String r3 = "MEDIUM_RECTANGLE"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc8
            if (r3 == 0) goto L6b
            r2 = r5
            goto L6b
        L62:
            java.lang.String r3 = "LARGE_BANNER"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc8
            if (r3 == 0) goto L6b
            r2 = r6
        L6b:
            if (r2 == 0) goto L91
            if (r2 == r6) goto L8b
            if (r2 != r5) goto L77
            com.appnext.banners.BannerSize r1 = com.appnext.banners.BannerSize.MEDIUM_RECTANGLE     // Catch: java.lang.Throwable -> Lc8
            r7.setBannerSize(r1)     // Catch: java.lang.Throwable -> Lc8
            goto L96
        L77:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lc8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = "Wrong banner size "
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc8
            r0.append(r1)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc8
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lc8
            throw r8     // Catch: java.lang.Throwable -> Lc8
        L8b:
            com.appnext.banners.BannerSize r1 = com.appnext.banners.BannerSize.LARGE_BANNER     // Catch: java.lang.Throwable -> Lc8
            r7.setBannerSize(r1)     // Catch: java.lang.Throwable -> Lc8
            goto L96
        L91:
            com.appnext.banners.BannerSize r1 = com.appnext.banners.BannerSize.BANNER     // Catch: java.lang.Throwable -> Lc8
            r7.setBannerSize(r1)     // Catch: java.lang.Throwable -> Lc8
        L96:
            int r1 = com.appnext.banners.R.styleable.BannersAttrs_placementId     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> Lc8
            if (r1 == 0) goto La1
            r7.setPlacementId(r1)     // Catch: java.lang.Throwable -> Lc8
        La1:
            r0.recycle()     // Catch: java.lang.Throwable -> Lc8
            com.appnext.banners.d r0 = com.appnext.banners.d.K()     // Catch: java.lang.Throwable -> Lc8
            android.content.Context r1 = r7.getContext()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = r7.getPlacementId()     // Catch: java.lang.Throwable -> Lc8
            r3 = 0
            r0.a(r1, r2, r3)     // Catch: java.lang.Throwable -> Lc8
            com.appnext.banners.BaseBannerAdapter r0 = r7.getBannerAdapter()     // Catch: java.lang.Throwable -> Lc8
            com.appnext.banners.BaseBannerView$2 r1 = new com.appnext.banners.BaseBannerView$2     // Catch: java.lang.Throwable -> Lc8
            r1.<init>()     // Catch: java.lang.Throwable -> Lc8
            r0.setBannerListener(r1)     // Catch: java.lang.Throwable -> Lc8
            com.appnext.banners.BaseBannerAdapter r0 = r7.getBannerAdapter()     // Catch: java.lang.Throwable -> Lc8
            r0.parseAttributeSet(r8)     // Catch: java.lang.Throwable -> Lc8
            return
        Lc8:
            r8 = move-exception
            java.lang.String r0 = "BaseBannerView$parseAttributeSet"
            com.appnext.base.a.a(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.BaseBannerView.parseAttributeSet(android.util.AttributeSet):void");
    }

    private void pause() {
        try {
            getBannerAdapter().pause();
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$pause", th);
        }
    }

    private void play() {
        try {
            getBannerAdapter().play();
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$destroy", th);
        }
    }

    public void destroy() {
        getBannerAdapter().destroy();
        this.bannerAdapter = null;
        try {
            getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChangedListener);
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$destroy", th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        impression();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    protected abstract BaseBannerAdapter getBannerAdapter();

    BannerListener getBannerListener() {
        return this.bannerListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void getECPM(BannerAdRequest bannerAdRequest, OnECPMLoaded onECPMLoaded) {
        try {
            getBannerAdapter().getECPM(bannerAdRequest, onECPMLoaded);
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$getECPM", th);
        }
    }

    public String getLanguage() {
        return this.language;
    }

    String getPlacementId() {
        return getBannerAdapter().getPlacementId();
    }

    public int getVisiblePercent(View view) {
        try {
            if (isViewPartiallyVisible(this) && getWindowVisibility() != 8 && getWindowVisibility() != 4) {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                return (int) (((rect.width() * rect.height()) * 100.0d) / (view.getWidth() * view.getHeight()));
            }
            return 0;
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$getVisiblePercent", th);
            return 0;
        }
    }

    public boolean isClickEnabled() {
        try {
            return getBannerAdapter().isClickEnabled();
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$isClickEnabled", th);
            return false;
        }
    }

    public void loadAd(BannerAdRequest bannerAdRequest) {
        getBannerAdapter().loadAd(bannerAdRequest);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            impression();
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$onDraw", th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        try {
            View childAt = getChildAt(0);
            if (childAt == null || childAt.getVisibility() == 8) {
                return;
            }
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = ((i12 - i10) - measuredWidth) / 2;
            int i15 = ((i13 - i11) - measuredHeight) / 2;
            childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$onLayout", th);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        try {
            View childAt = getChildAt(0);
            if (childAt != null && childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                i13 = childAt.getMeasuredWidth();
                i12 = childAt.getMeasuredHeight();
                setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
            }
            if (getBannerAdapter().getBannerSize() != null) {
                Context context = getContext();
                int L = (int) (getBannerAdapter().getBannerSize().L() * context.getResources().getDisplayMetrics().scaledDensity);
                i12 = (int) (getBannerAdapter().getBannerSize().M() * context.getResources().getDisplayMetrics().scaledDensity);
                i13 = L;
            } else {
                i12 = 0;
            }
            setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$onMeasure", th);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        try {
            getBannerAdapter().onWindowVisibilityChanged(i10);
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$onWindowVisibilityChanged", th);
        }
    }

    public void setBannerListener(BannerListener bannerListener) {
        try {
            getBannerAdapter().setBannerListener(bannerListener);
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$setBannerListener", th);
        }
    }

    public void setBannerSize(BannerSize bannerSize) {
        try {
            getBannerAdapter().setBannerSize(bannerSize);
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$setBannerSize", th);
        }
    }

    public void setClickEnabled(boolean z10) {
        try {
            getBannerAdapter().setClickEnabled(z10);
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$setClickEnabled", th);
        }
    }

    public void setLanguage(String str) {
        try {
            this.language = str;
            this.bannerAdapter.setLanguage(str);
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$setLanguage", th);
        }
    }

    public void setParams(String str, String str2) {
        try {
            d.K().i(str, str2);
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$setParams", th);
        }
    }

    public void setPlacementId(String str) {
        try {
            getBannerAdapter().setPlacementId(str);
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerView$setPlacementId", th);
        }
    }

    public BaseBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.appnext.banners.BaseBannerView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                BaseBannerView.this.impression();
                BaseBannerView.this.onScrollChanged();
            }
        };
        parseAttributeSet(attributeSet);
    }

    public BaseBannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.appnext.banners.BaseBannerView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                BaseBannerView.this.impression();
                BaseBannerView.this.onScrollChanged();
            }
        };
        parseAttributeSet(attributeSet);
    }

    public BaseBannerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.appnext.banners.BaseBannerView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                BaseBannerView.this.impression();
                BaseBannerView.this.onScrollChanged();
            }
        };
        parseAttributeSet(attributeSet);
    }
}
