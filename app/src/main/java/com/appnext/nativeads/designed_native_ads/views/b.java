package com.appnext.nativeads.designed_native_ads.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends FrameLayout {
    private ViewTreeObserver.OnScrollChangedListener fB;
    private a gj;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void f(int i10);
    }

    public b(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVisiblePercent() {
        try {
            if (isViewPartiallyVisible(this)) {
                Rect rect = new Rect();
                getGlobalVisibleRect(rect);
                return (int) (((rect.width() * rect.height()) * 100.0d) / (getWidth() * getHeight()));
            }
            return 0;
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdViewContainerImpl$getVisiblePercent", th);
            return 0;
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
            com.appnext.base.a.a("DesignedNativeAdViewContainerImpl$isViewPartiallyVisible", th);
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        a aVar = this.gj;
        if (aVar != null) {
            aVar.f(getVisiblePercent());
        }
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
            com.appnext.base.a.a("DesignedNativeAdViewContainerImpl$onDetachedFromWindow", th);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a aVar = this.gj;
        if (aVar != null) {
            aVar.f(getVisiblePercent());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            try {
                a aVar = this.gj;
                if (aVar != null) {
                    aVar.f(getVisiblePercent());
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("DesignedNativeAdViewContainerImpl$onVisibilityChanged", th);
            }
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            try {
                a aVar = this.gj;
                if (aVar != null) {
                    aVar.f(getVisiblePercent());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void register(a aVar) {
        this.gj = aVar;
        if (aVar != null) {
            this.gj.f(getVisiblePercent());
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            try {
                a aVar = this.gj;
                if (aVar != null) {
                    aVar.f(getVisiblePercent());
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("DesignedNativeAdViewContainerImpl$setVisibility", th);
            }
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.fB = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.appnext.nativeads.designed_native_ads.views.b.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                if (b.this.gj != null) {
                    b.this.gj.f(b.this.getVisiblePercent());
                }
            }
        };
    }

    public b(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.fB = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.appnext.nativeads.designed_native_ads.views.b.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                if (b.this.gj != null) {
                    b.this.gj.f(b.this.getVisiblePercent());
                }
            }
        };
    }
}
