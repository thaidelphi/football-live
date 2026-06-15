package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f1243i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1244j;

    /* renamed from: k  reason: collision with root package name */
    private View f1245k;

    /* renamed from: l  reason: collision with root package name */
    private View f1246l;

    /* renamed from: m  reason: collision with root package name */
    private View f1247m;

    /* renamed from: n  reason: collision with root package name */
    private LinearLayout f1248n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f1249o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f1250p;

    /* renamed from: q  reason: collision with root package name */
    private int f1251q;

    /* renamed from: r  reason: collision with root package name */
    private int f1252r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1253s;

    /* renamed from: t  reason: collision with root package name */
    private int f1254t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.b f1255a;

        a(i.b bVar) {
            this.f1255a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1255a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f1248n == null) {
            LayoutInflater.from(getContext()).inflate(e.g.f24642a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1248n = linearLayout;
            this.f1249o = (TextView) linearLayout.findViewById(e.f.f24620e);
            this.f1250p = (TextView) this.f1248n.findViewById(e.f.f24619d);
            if (this.f1251q != 0) {
                this.f1249o.setTextAppearance(getContext(), this.f1251q);
            }
            if (this.f1252r != 0) {
                this.f1250p.setTextAppearance(getContext(), this.f1252r);
            }
        }
        this.f1249o.setText(this.f1243i);
        this.f1250p.setText(this.f1244j);
        boolean z10 = !TextUtils.isEmpty(this.f1243i);
        boolean z11 = !TextUtils.isEmpty(this.f1244j);
        int i10 = 0;
        this.f1250p.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1248n;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f1248n.getParent() == null) {
            addView(this.f1248n);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.g0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f1245k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1244j;
    }

    public CharSequence getTitle() {
        return this.f1243i;
    }

    public void h(i.b bVar) {
        View view = this.f1245k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1254t, (ViewGroup) this, false);
            this.f1245k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1245k);
        }
        View findViewById = this.f1245k.findViewById(e.f.f24624i);
        this.f1246l = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        c cVar = this.f1438d;
        if (cVar != null) {
            cVar.y();
        }
        c cVar2 = new c(getContext());
        this.f1438d = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f1438d, this.f1436b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1438d.o(this);
        this.f1437c = actionMenuView;
        androidx.core.view.a0.u0(actionMenuView, null);
        addView(this.f1437c, layoutParams);
    }

    public boolean j() {
        return this.f1253s;
    }

    public void k() {
        removeAllViews();
        this.f1247m = null;
        this.f1437c = null;
        this.f1438d = null;
        View view = this.f1246l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f1438d;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1438d;
        if (cVar != null) {
            cVar.B();
            this.f1438d.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = g1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1245k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1245k.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = androidx.appcompat.widget.a.d(paddingRight, i14, b10);
            paddingRight = androidx.appcompat.widget.a.d(d10 + e(this.f1245k, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f1248n;
        if (linearLayout != null && this.f1247m == null && linearLayout.getVisibility() != 8) {
            i16 += e(this.f1248n, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f1247m;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1437c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) != 0) {
                int size = View.MeasureSpec.getSize(i10);
                int i12 = this.f1439e;
                if (i12 <= 0) {
                    i12 = View.MeasureSpec.getSize(i11);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i13 = i12 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, RecyclerView.UNDEFINED_DURATION);
                View view = this.f1245k;
                if (view != null) {
                    int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1245k.getLayoutParams();
                    paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f1437c;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = c(this.f1437c, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.f1248n;
                if (linearLayout != null && this.f1247m == null) {
                    if (this.f1253s) {
                        this.f1248n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f1248n.getMeasuredWidth();
                        boolean z10 = measuredWidth <= paddingLeft;
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        this.f1248n.setVisibility(z10 ? 0 : 8);
                    } else {
                        paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.f1247m;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i14 = layoutParams.width;
                    int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
                    if (i14 >= 0) {
                        paddingLeft = Math.min(i14, paddingLeft);
                    }
                    int i16 = layoutParams.height;
                    int i17 = i16 == -2 ? Integer.MIN_VALUE : 1073741824;
                    if (i16 >= 0) {
                        i13 = Math.min(i16, i13);
                    }
                    this.f1247m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i17));
                }
                if (this.f1439e <= 0) {
                    int childCount = getChildCount();
                    int i18 = 0;
                    for (int i19 = 0; i19 < childCount; i19++) {
                        int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i18) {
                            i18 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i18);
                    return;
                }
                setMeasuredDimension(size, i12);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1439e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1247m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1247m = view;
        if (view != null && (linearLayout = this.f1248n) != null) {
            removeView(linearLayout);
            this.f1248n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1244j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1243i = charSequence;
        i();
        androidx.core.view.a0.t0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1253s) {
            requestLayout();
        }
        this.f1253s = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f24549j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        z0 v10 = z0.v(context, attributeSet, e.j.f24798y, i10, 0);
        androidx.core.view.a0.u0(this, v10.g(e.j.f24803z));
        this.f1251q = v10.n(e.j.D, 0);
        this.f1252r = v10.n(e.j.C, 0);
        this.f1439e = v10.m(e.j.B, 0);
        this.f1254t = v10.n(e.j.A, e.g.f24645d);
        v10.w();
    }
}
