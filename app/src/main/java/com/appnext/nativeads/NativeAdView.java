package com.appnext.nativeads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.appnext.base.Appnext;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NativeAdView extends FrameLayout {
    private a adViewActions;
    private PrivacyIcon fA;
    private ViewTreeObserver.OnScrollChangedListener fB;
    private NativeAd fh;
    private NativeAdData fj;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void d(int i10);
    }

    public NativeAdView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i10) {
        if (getWindowVisibility() == 8 || getWindowVisibility() == 4 || this.fh == null) {
            return;
        }
        a aVar = this.adViewActions;
        if (aVar != null) {
            aVar.d(i10);
        }
        if (this.fh.getMediaView() != null) {
            this.fh.getMediaView().d(getVisiblePercent(this.fh.getMediaView()));
        }
    }

    private boolean isViewPartiallyVisible(View view) {
        try {
            if (getParent() == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 19 || view.isAttachedToWindow()) {
                Rect rect = new Rect();
                ((ViewGroup) getParent()).getHitRect(rect);
                return view.getGlobalVisibleRect(rect);
            }
            return false;
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAdView$isViewPartiallyVisible", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:6:0x000b, B:8:0x0012, B:9:0x0015, B:11:0x001d, B:24:0x0063, B:26:0x0084, B:31:0x00a5, B:27:0x008e, B:29:0x0096, B:30:0x009e), top: B:36:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:6:0x000b, B:8:0x0012, B:9:0x0015, B:11:0x001d, B:24:0x0063, B:26:0x0084, B:31:0x00a5, B:27:0x008e, B:29:0x0096, B:30:0x009e), top: B:36:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.appnext.nativeads.NativeAd r5, com.appnext.nativeads.NativeAdData r6, com.appnext.nativeads.NativeAdView.a r7) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.nativeads.NativeAdView.a(com.appnext.nativeads.NativeAd, com.appnext.nativeads.NativeAdData, com.appnext.nativeads.NativeAdView$a):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aH() {
        super.removeView(this.fA);
        this.fh = null;
        this.fj = null;
        this.adViewActions = null;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.fA);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        PrivacyIcon privacyIcon = this.fA;
        if (privacyIcon != view) {
            super.bringChildToFront(privacyIcon);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.fh == null || this.fj == null || this.adViewActions == null) {
            return;
        }
        e(getVisiblePercent(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getVisiblePercent(View view) {
        if (isViewPartiallyVisible(this) && view != null) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            return (int) (((rect.width() * rect.height()) * 100.0d) / (view.getWidth() * view.getHeight()));
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        bringToFront();
        getViewTreeObserver().addOnScrollChangedListener(this.fB);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            getViewTreeObserver().removeOnScrollChangedListener(this.fB);
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAdView$onWindowVisibilityChanged", th);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.fh == null || this.fj == null || this.adViewActions == null) {
            return;
        }
        e(getVisiblePercent(this));
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        try {
            NativeAd nativeAd = this.fh;
            if (nativeAd == null || this.fj == null) {
                return;
            }
            nativeAd.onWindowVisibilityChanged(i10);
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAdView$onWindowVisibilityChanged", th);
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.fA);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view != this.fA) {
            super.removeView(view);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (this.fh == null || this.fj == null) {
            return;
        }
        super.setVisibility(i10);
        e(getVisiblePercent(this));
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.fB = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.appnext.nativeads.NativeAdView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                NativeAdView nativeAdView = NativeAdView.this;
                nativeAdView.e(nativeAdView.getVisiblePercent(nativeAdView));
            }
        };
        Appnext.init(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.fB = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.appnext.nativeads.NativeAdView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                NativeAdView nativeAdView = NativeAdView.this;
                nativeAdView.e(nativeAdView.getVisiblePercent(nativeAdView));
            }
        };
        Appnext.init(context);
    }
}
