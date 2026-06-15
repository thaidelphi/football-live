package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.l0;
import androidx.core.view.a0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class NavigationMenuItemView extends f implements k.a {
    private static final int[] F = {16842912};
    private androidx.appcompat.view.menu.g A;
    private ColorStateList B;
    private boolean C;
    private Drawable D;
    private final androidx.core.view.a E;

    /* renamed from: v  reason: collision with root package name */
    private int f14353v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f14354w;

    /* renamed from: x  reason: collision with root package name */
    boolean f14355x;

    /* renamed from: y  reason: collision with root package name */
    private final CheckedTextView f14356y;

    /* renamed from: z  reason: collision with root package name */
    private FrameLayout f14357z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            cVar.V(NavigationMenuItemView.this.f14355x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.f14356y.setVisibility(8);
            FrameLayout frameLayout = this.f14357z;
            if (frameLayout != null) {
                l0.a aVar = (l0.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f14357z.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f14356y.setVisibility(0);
        FrameLayout frameLayout2 = this.f14357z;
        if (frameLayout2 != null) {
            l0.a aVar2 = (l0.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f14357z.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(e.a.f24562w, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(F, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private boolean D() {
        return this.A.getTitle() == null && this.A.getIcon() == null && this.A.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f14357z == null) {
                this.f14357z = (FrameLayout) ((ViewStub) findViewById(d5.f.f24039d)).inflate();
            }
            this.f14357z.removeAllViews();
            this.f14357z.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i10) {
        this.A = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            a0.u0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        c1.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.A;
        if (gVar != null && gVar.isCheckable() && this.A.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f14355x != z10) {
            this.f14355x = z10;
            this.E.l(this.f14356y, com.ironsource.mediationsdk.metadata.a.f18931n);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f14356y.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.B);
            }
            int i10 = this.f14353v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f14354w) {
            if (this.D == null) {
                Drawable e8 = androidx.core.content.res.h.e(getResources(), d5.e.f24035g, getContext().getTheme());
                this.D = e8;
                if (e8 != null) {
                    int i11 = this.f14353v;
                    e8.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.D;
        }
        androidx.core.widget.j.i(this.f14356y, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f14356y.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f14353v = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.C = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.A;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f14356y.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f14354w = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.j.n(this.f14356y, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f14356y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f14356y.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(d5.h.f24065a, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(d5.d.f24007e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(d5.f.f24040e);
        this.f14356y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        a0.q0(checkedTextView, aVar);
    }
}
