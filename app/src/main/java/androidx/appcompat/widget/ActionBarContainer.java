package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1233a;

    /* renamed from: b  reason: collision with root package name */
    private View f1234b;

    /* renamed from: c  reason: collision with root package name */
    private View f1235c;

    /* renamed from: d  reason: collision with root package name */
    private View f1236d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f1237e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f1238f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f1239g;

    /* renamed from: h  reason: collision with root package name */
    boolean f1240h;

    /* renamed from: i  reason: collision with root package name */
    boolean f1241i;

    /* renamed from: j  reason: collision with root package name */
    private int f1242j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.a0.u0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f24678a);
        this.f1237e = obtainStyledAttributes.getDrawable(e.j.f24683b);
        this.f1238f = obtainStyledAttributes.getDrawable(e.j.f24693d);
        this.f1242j = obtainStyledAttributes.getDimensionPixelSize(e.j.f24723j, -1);
        boolean z10 = true;
        if (getId() == e.f.H) {
            this.f1240h = true;
            this.f1239g = obtainStyledAttributes.getDrawable(e.j.f24688c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1240h ? this.f1237e != null || this.f1238f != null : this.f1239g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1237e;
        if (drawable != null && drawable.isStateful()) {
            this.f1237e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1238f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1238f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1239g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1239g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1234b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1237e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1238f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1239g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1235c = findViewById(e.f.f24616a);
        this.f1236d = findViewById(e.f.f24621f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1233a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f1234b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i10, (measuredHeight - view.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f1240h) {
            Drawable drawable2 = this.f1239g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z11 = z12;
        } else {
            if (this.f1237e != null) {
                if (this.f1235c.getVisibility() == 0) {
                    this.f1237e.setBounds(this.f1235c.getLeft(), this.f1235c.getTop(), this.f1235c.getRight(), this.f1235c.getBottom());
                } else {
                    View view2 = this.f1236d;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f1237e.setBounds(this.f1236d.getLeft(), this.f1236d.getTop(), this.f1236d.getRight(), this.f1236d.getBottom());
                    } else {
                        this.f1237e.setBounds(0, 0, 0, 0);
                    }
                }
                z12 = true;
            }
            this.f1241i = z13;
            if (z13 && (drawable = this.f1238f) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z11 = z12;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int a10;
        int i12;
        if (this.f1235c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f1242j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i10, i11);
        if (this.f1235c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f1234b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!b(this.f1235c)) {
            a10 = a(this.f1235c);
        } else {
            a10 = !b(this.f1236d) ? a(this.f1236d) : 0;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a10 + a(this.f1234b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1237e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1237e);
        }
        this.f1237e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1235c;
            if (view != null) {
                this.f1237e.setBounds(view.getLeft(), this.f1235c.getTop(), this.f1235c.getRight(), this.f1235c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1240h ? this.f1237e != null || this.f1238f != null : this.f1239g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1239g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1239g);
        }
        this.f1239g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1240h && (drawable2 = this.f1239g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1240h ? !(this.f1237e != null || this.f1238f != null) : this.f1239g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1238f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1238f);
        }
        this.f1238f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1241i && (drawable2 = this.f1238f) != null) {
                drawable2.setBounds(this.f1234b.getLeft(), this.f1234b.getTop(), this.f1234b.getRight(), this.f1234b.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1240h ? this.f1237e != null || this.f1238f != null : this.f1239g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(s0 s0Var) {
        View view = this.f1234b;
        if (view != null) {
            removeView(view);
        }
        this.f1234b = s0Var;
        if (s0Var != null) {
            addView(s0Var);
            ViewGroup.LayoutParams layoutParams = s0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            s0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f1233a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1237e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1238f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1239g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1237e && !this.f1240h) || (drawable == this.f1238f && this.f1241i) || ((drawable == this.f1239g && this.f1240h) || super.verifyDrawable(drawable));
    }
}
