package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.ironsource.b9;
import com.startapp.c1;
import com.startapp.j9;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CloseableLayout extends FrameLayout {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f22580o = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f22581a;

    /* renamed from: b  reason: collision with root package name */
    public a f22582b;

    /* renamed from: c  reason: collision with root package name */
    public final BitmapDrawable f22583c;

    /* renamed from: d  reason: collision with root package name */
    public ClosePosition f22584d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22585e;

    /* renamed from: f  reason: collision with root package name */
    public final int f22586f;

    /* renamed from: g  reason: collision with root package name */
    public final int f22587g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22588h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f22589i;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f22590j;

    /* renamed from: k  reason: collision with root package name */
    public final Rect f22591k;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f22592l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f22593m;

    /* renamed from: n  reason: collision with root package name */
    public b f22594n;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void onClose();
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CloseableLayout closeableLayout = CloseableLayout.this;
            int i10 = CloseableLayout.f22580o;
            closeableLayout.a(false);
        }
    }

    public CloseableLayout(Context context) {
        this(context, null, 0);
    }

    public final void a(boolean z10) {
        int[] state = this.f22583c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z10 == (state == iArr)) {
            return;
        }
        BitmapDrawable bitmapDrawable = this.f22583c;
        if (!z10) {
            iArr = FrameLayout.EMPTY_STATE_SET;
        }
        bitmapDrawable.setState(iArr);
        invalidate(this.f22590j);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f22588h) {
            this.f22588h = false;
            this.f22589i.set(0, 0, getWidth(), getHeight());
            ClosePosition closePosition = this.f22584d;
            Rect rect = this.f22589i;
            Rect rect2 = this.f22590j;
            int i10 = this.f22585e;
            Gravity.apply(closePosition.a(), i10, i10, rect, rect2);
            this.f22592l.set(this.f22590j);
            Rect rect3 = this.f22592l;
            int i11 = this.f22587g;
            rect3.inset(i11, i11);
            ClosePosition closePosition2 = this.f22584d;
            Rect rect4 = this.f22592l;
            Rect rect5 = this.f22591k;
            int i12 = this.f22586f;
            Gravity.apply(closePosition2.a(), i12, i12, rect4, rect5);
            this.f22583c.setBounds(this.f22591k);
        }
        if (this.f22583c.isVisible()) {
            this.f22583c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        Rect rect = this.f22590j;
        return x10 >= rect.left - 0 && y10 >= rect.top - 0 && x10 < rect.right + 0 && y10 < rect.bottom + 0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f22588h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int i10 = this.f22581a;
        Rect rect = this.f22590j;
        if (x10 >= rect.left - i10 && y10 >= rect.top - i10 && x10 < rect.right + i10 && y10 < rect.bottom + i10) {
            if (this.f22593m || this.f22583c.isVisible()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    a(true);
                } else if (action == 1) {
                    if (this.f22583c.getState() == FrameLayout.SELECTED_STATE_SET) {
                        if (this.f22594n == null) {
                            this.f22594n = new b();
                        }
                        postDelayed(this.f22594n, ViewConfiguration.getPressedStateDuration());
                        playSoundEffect(0);
                        a aVar = this.f22582b;
                        if (aVar != null) {
                            aVar.onClose();
                        }
                    }
                } else if (action == 3) {
                    a(false);
                }
                return true;
            }
        }
        a(false);
        super.onTouchEvent(motionEvent);
        return false;
    }

    public void setCloseAlwaysInteractable(boolean z10) {
        this.f22593m = z10;
    }

    public void setCloseBoundChanged(boolean z10) {
        this.f22588h = z10;
    }

    public void setCloseBounds(Rect rect) {
        this.f22590j.set(rect);
    }

    public void setClosePosition(ClosePosition closePosition) {
        this.f22584d = closePosition;
        this.f22588h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z10) {
        if (this.f22583c.setVisible(z10, false)) {
            invalidate(this.f22590j);
        }
    }

    public void setOnCloseListener(a aVar) {
        this.f22582b = aVar;
    }

    public CloseableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseableLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22589i = new Rect();
        this.f22590j = new Rect();
        this.f22591k = new Rect();
        this.f22592l = new Rect();
        BitmapDrawable a10 = c1.a(context.getResources());
        this.f22583c = a10;
        this.f22584d = ClosePosition.TOP_RIGHT;
        a10.setState(FrameLayout.EMPTY_STATE_SET);
        a10.setCallback(this);
        this.f22581a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f22585e = j9.a(context, 50);
        this.f22586f = j9.a(context, 30);
        this.f22587g = j9.a(context, 8);
        setWillNotDraw(false);
        this.f22593m = true;
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum ClosePosition {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);
        
        private final int mGravity;

        ClosePosition(int i10) {
            this.mGravity = i10;
        }

        public static ClosePosition a(String str) throws Exception {
            ClosePosition closePosition = TOP_RIGHT;
            if (TextUtils.isEmpty(str)) {
                return closePosition;
            }
            if (str.equals(b9.e.f16597c)) {
                return TOP_LEFT;
            }
            if (str.equals(b9.e.f16596b)) {
                return closePosition;
            }
            if (str.equals("center")) {
                return CENTER;
            }
            if (str.equals(b9.e.f16599e)) {
                return BOTTOM_LEFT;
            }
            if (str.equals(b9.e.f16598d)) {
                return BOTTOM_RIGHT;
            }
            if (str.equals("top-center")) {
                return TOP_CENTER;
            }
            if (str.equals("bottom-center")) {
                return BOTTOM_CENTER;
            }
            throw new IllegalArgumentException(str);
        }

        public final int a() {
            return this.mGravity;
        }
    }
}
