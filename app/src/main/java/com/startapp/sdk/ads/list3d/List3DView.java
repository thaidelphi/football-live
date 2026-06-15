package com.startapp.sdk.ads.list3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.b2;
import com.startapp.v4;
import com.startapp.w4;
import com.startapp.x4;
import com.startapp.y;
import java.util.LinkedList;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class List3DView extends AdapterView<Adapter> {

    /* renamed from: a  reason: collision with root package name */
    public Adapter f22638a;

    /* renamed from: b  reason: collision with root package name */
    public int f22639b;

    /* renamed from: c  reason: collision with root package name */
    public int f22640c;

    /* renamed from: d  reason: collision with root package name */
    public int f22641d;

    /* renamed from: e  reason: collision with root package name */
    public int f22642e;

    /* renamed from: f  reason: collision with root package name */
    public int f22643f;

    /* renamed from: g  reason: collision with root package name */
    public int f22644g;

    /* renamed from: h  reason: collision with root package name */
    public int f22645h;

    /* renamed from: i  reason: collision with root package name */
    public int f22646i;

    /* renamed from: j  reason: collision with root package name */
    public int f22647j;

    /* renamed from: k  reason: collision with root package name */
    public VelocityTracker f22648k;

    /* renamed from: l  reason: collision with root package name */
    public b2 f22649l;

    /* renamed from: m  reason: collision with root package name */
    public w4 f22650m;

    /* renamed from: n  reason: collision with root package name */
    public final LinkedList<View> f22651n;

    /* renamed from: o  reason: collision with root package name */
    public x4 f22652o;

    /* renamed from: p  reason: collision with root package name */
    public Rect f22653p;

    /* renamed from: q  reason: collision with root package name */
    public Camera f22654q;

    /* renamed from: r  reason: collision with root package name */
    public Matrix f22655r;

    /* renamed from: s  reason: collision with root package name */
    public Paint f22656s;

    /* renamed from: t  reason: collision with root package name */
    public int f22657t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f22658u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f22659v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f22660w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f22661x;

    public List3DView(Context context) {
        super(context, null);
        this.f22639b = 0;
        this.f22651n = new LinkedList<>();
        this.f22657t = RecyclerView.UNDEFINED_DURATION;
        this.f22658u = false;
        this.f22659v = false;
        this.f22660w = false;
        this.f22661x = false;
    }

    public final void a(Canvas canvas, Bitmap bitmap, int i10, int i11, int i12, int i13, float f10, float f11) {
        if (this.f22654q == null) {
            this.f22654q = new Camera();
        }
        this.f22654q.save();
        this.f22654q.translate(0.0f, 0.0f, i13);
        this.f22654q.rotateX(f11);
        float f12 = -i13;
        this.f22654q.translate(0.0f, 0.0f, f12);
        if (this.f22655r == null) {
            this.f22655r = new Matrix();
        }
        this.f22654q.getMatrix(this.f22655r);
        this.f22654q.restore();
        this.f22655r.preTranslate(-i12, f12);
        this.f22655r.postScale(f10, f10);
        this.f22655r.postTranslate(i11 + i12, i10 + i13);
        if (this.f22656s == null) {
            Paint paint = new Paint();
            this.f22656s = paint;
            paint.setAntiAlias(true);
            this.f22656s.setFilterBitmap(true);
        }
        Paint paint2 = this.f22656s;
        double cos = Math.cos((f11 * 3.141592653589793d) / 180.0d);
        int i14 = ((int) (cos * 200.0d)) + 55;
        int pow = (int) (Math.pow(cos, 200.0d) * 70.0d);
        if (i14 > 255) {
            i14 = 255;
        }
        if (pow > 255) {
            pow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i14, i14, i14), Color.rgb(pow, pow, pow)));
        canvas.drawBitmap(bitmap, this.f22655r, this.f22656s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j10);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = getHeight() / 2;
        float f10 = ((top + height) - height2) / height2;
        float cos = (float) (1.0d - ((1.0d - Math.cos(f10)) * 0.15000000596046448d));
        float f11 = (this.f22645h - (f10 * 20.0f)) % 90.0f;
        if (f11 < 0.0f) {
            f11 += 90.0f;
        }
        float f12 = f11;
        if (f12 < 45.0f) {
            a(canvas, drawingCache, top, left, width, height, cos, f12 - 90.0f);
            a(canvas, drawingCache, top, left, width, height, cos, f12);
            return false;
        }
        a(canvas, drawingCache, top, left, width, height, cos, f12);
        a(canvas, drawingCache, top, left, width, height, cos, f12 - 90.0f);
        return false;
    }

    @Override // android.widget.AdapterView
    public final Adapter getAdapter() {
        return this.f22638a;
    }

    @Override // android.widget.AdapterView
    public final View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f22650m);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f22658u || this.f22638a == null) {
            return;
        }
        if (getChildCount() == 0) {
            if (this.f22660w) {
                this.f22643f = getHeight() / 3;
            }
            this.f22647j = -1;
            int i15 = this.f22643f;
            while (i15 + 0 < getHeight() && this.f22647j < this.f22638a.getCount() - 1) {
                int i16 = this.f22647j + 1;
                this.f22647j = i16;
                View view = this.f22638a.getView(i16, this.f22651n.size() != 0 ? this.f22651n.removeFirst() : null, this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-2, -2);
                }
                view.setDrawingCacheEnabled(true);
                addViewInLayout(view, -1, layoutParams, true);
                view.measure(((int) (getWidth() * 0.85f)) | 1073741824, 0);
                i15 += (a(view) * 2) + view.getMeasuredHeight();
            }
        } else {
            int i17 = this.f22643f + this.f22644g;
            View childAt = getChildAt(0);
            int top = i17 - (childAt.getTop() - a(childAt));
            int childCount = getChildCount();
            if (this.f22647j != this.f22638a.getCount() - 1 && childCount > 1) {
                View childAt2 = getChildAt(0);
                while (childAt2 != null) {
                    if (a(childAt2) + childAt2.getBottom() + top >= 0) {
                        break;
                    }
                    removeViewInLayout(childAt2);
                    childCount--;
                    this.f22651n.addLast(childAt2);
                    this.f22646i++;
                    this.f22644g = (a(childAt2) * 2) + childAt2.getMeasuredHeight() + this.f22644g;
                    childAt2 = childCount > 1 ? getChildAt(0) : null;
                }
            }
            if (this.f22646i != 0 && childCount > 1) {
                View childAt3 = getChildAt(childCount - 1);
                while (childAt3 != null && (childAt3.getTop() - a(childAt3)) + top > getHeight()) {
                    removeViewInLayout(childAt3);
                    childCount--;
                    this.f22651n.addLast(childAt3);
                    this.f22647j--;
                    childAt3 = childCount > 1 ? getChildAt(childCount - 1) : null;
                }
            }
            View childAt4 = getChildAt(getChildCount() - 1);
            int bottom = childAt4.getBottom();
            int a10 = a(childAt4);
            while (true) {
                a10 += bottom;
                if (a10 + top >= getHeight() || this.f22647j >= this.f22638a.getCount() - 1) {
                    break;
                }
                int i18 = this.f22647j + 1;
                this.f22647j = i18;
                View view2 = this.f22638a.getView(i18, this.f22651n.size() != 0 ? this.f22651n.removeFirst() : null, this);
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                view2.setDrawingCacheEnabled(true);
                addViewInLayout(view2, -1, layoutParams2, true);
                view2.measure(((int) (getWidth() * 0.85f)) | 1073741824, 0);
                bottom = (a(view2) * 2) + view2.getMeasuredHeight();
            }
            View childAt5 = getChildAt(0);
            int top2 = childAt5.getTop() - a(childAt5);
            while (top2 + top > 0 && (i14 = this.f22646i) > 0) {
                int i19 = i14 - 1;
                this.f22646i = i19;
                View view3 = this.f22638a.getView(i19, this.f22651n.size() != 0 ? this.f22651n.removeFirst() : null, this);
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                view3.setDrawingCacheEnabled(true);
                addViewInLayout(view3, 0, layoutParams3, true);
                view3.measure(((int) (getWidth() * 0.85f)) | 1073741824, 0);
                int a11 = (a(view3) * 2) + view3.getMeasuredHeight();
                top2 -= a11;
                this.f22644g -= a11;
            }
        }
        int i20 = this.f22643f + this.f22644g;
        float width = getWidth() * 0.0f;
        float height = 1.0f / (getHeight() * 0.9f);
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt6 = getChildAt(i21);
            int sin = (int) (Math.sin(height * 6.283185307179586d * i20) * width);
            int measuredWidth = childAt6.getMeasuredWidth();
            int measuredHeight = childAt6.getMeasuredHeight();
            int width2 = ((getWidth() - measuredWidth) / 2) + sin;
            int a12 = a(childAt6);
            int i22 = i20 + a12;
            childAt6.layout(width2, i22, measuredWidth + width2, i22 + measuredHeight);
            i20 += (a12 * 2) + measuredHeight;
        }
        if (this.f22660w && !this.f22661x) {
            this.f22661x = true;
            dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
            postDelayed(new v4(this), 5L);
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r1 <= (r0 + 10)) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.list3d.List3DView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.AdapterView
    public void setAdapter(Adapter adapter) {
        if (y.a() && this.f22659v) {
            y.a(this, 0.0f);
        }
        this.f22638a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(b2 b2Var) {
        b2 b2Var2 = this.f22649l;
        if (b2Var2 != null) {
            float f10 = b2Var2.f21782a;
            float f11 = b2Var2.f21783b;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            b2Var.f21783b = f11;
            b2Var.f21782a = f10;
            b2Var.f21786e = currentAnimationTimeMillis;
        }
        this.f22649l = b2Var;
    }

    public void setFade(boolean z10) {
        this.f22659v = z10;
    }

    public void setHint(boolean z10) {
        this.f22660w = z10;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i10) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.f22658u = true;
    }

    public void setTag(String str) {
    }

    public final void a(int i10) {
        int height;
        int i11 = this.f22642e + i10;
        this.f22643f = i11;
        int height2 = (-(i11 * 270)) / getHeight();
        this.f22645h = height2;
        int i12 = height2 % 90;
        if (i12 < 45) {
            height = (getHeight() * (-(height2 - i12))) / 270;
        } else {
            height = (getHeight() * (-((height2 + 90) - i12))) / 270;
        }
        if (this.f22657t == Integer.MIN_VALUE && this.f22647j == this.f22638a.getCount() - 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (a(childAt) + childAt.getBottom() < getHeight()) {
                this.f22657t = height;
            }
        }
        if (height > 0) {
            height = 0;
        } else {
            int i13 = this.f22657t;
            if (height < i13) {
                height = i13;
            }
        }
        b2 b2Var = this.f22649l;
        float f10 = height;
        b2Var.f21784c = f10;
        b2Var.f21785d = f10;
        requestLayout();
    }

    public static int a(View view) {
        return (int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f);
    }
}
