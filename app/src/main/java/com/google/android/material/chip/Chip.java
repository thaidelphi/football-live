package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import com.google.android.material.chip.a;
import com.google.android.material.internal.h;
import com.google.android.material.internal.m;
import com.google.android.material.internal.o;
import d5.i;
import d5.j;
import d5.k;
import java.util.List;
import r5.d;
import r5.f;
import u5.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class Chip extends g implements a.InterfaceC0186a, n, h<Chip> {

    /* renamed from: w  reason: collision with root package name */
    private static final int f14067w = j.f24110l;

    /* renamed from: x  reason: collision with root package name */
    private static final Rect f14068x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f14069y = {16842913};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f14070z = {16842911};

    /* renamed from: e  reason: collision with root package name */
    private com.google.android.material.chip.a f14071e;

    /* renamed from: f  reason: collision with root package name */
    private InsetDrawable f14072f;

    /* renamed from: g  reason: collision with root package name */
    private RippleDrawable f14073g;

    /* renamed from: h  reason: collision with root package name */
    private View.OnClickListener f14074h;

    /* renamed from: i  reason: collision with root package name */
    private h.a<Chip> f14075i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14076j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14077k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f14078l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f14079m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14080n;

    /* renamed from: o  reason: collision with root package name */
    private int f14081o;

    /* renamed from: p  reason: collision with root package name */
    private int f14082p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f14083q;

    /* renamed from: r  reason: collision with root package name */
    private final c f14084r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f14085s;

    /* renamed from: t  reason: collision with root package name */
    private final Rect f14086t;

    /* renamed from: u  reason: collision with root package name */
    private final RectF f14087u;

    /* renamed from: v  reason: collision with root package name */
    private final f f14088v;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends f {
        a() {
        }

        @Override // r5.f
        public void a(int i10) {
        }

        @Override // r5.f
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f14071e.K2() ? Chip.this.f14071e.g1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f14071e != null) {
                Chip.this.f14071e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c extends a0.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // a0.a
        protected int B(float f10, float f11) {
            return (Chip.this.m() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // a0.a
        protected void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m() && Chip.this.r() && Chip.this.f14074h != null) {
                list.add(1);
            }
        }

        @Override // a0.a
        protected boolean J(int i10, int i11, Bundle bundle) {
            if (i11 == 16) {
                if (i10 == 0) {
                    return Chip.this.performClick();
                }
                if (i10 == 1) {
                    return Chip.this.s();
                }
                return false;
            }
            return false;
        }

        @Override // a0.a
        protected void M(androidx.core.view.accessibility.c cVar) {
            cVar.V(Chip.this.q());
            cVar.Y(Chip.this.isClickable());
            cVar.X(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.t0(text);
            } else {
                cVar.b0(text);
            }
        }

        @Override // a0.a
        protected void N(int i10, androidx.core.view.accessibility.c cVar) {
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.b0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = i.f24090h;
                    Object[] objArr = new Object[1];
                    objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                    cVar.b0(context.getString(i11, objArr).trim());
                }
                cVar.T(Chip.this.getCloseIconTouchBoundsInt());
                cVar.b(c.a.f2832i);
                cVar.c0(Chip.this.isEnabled());
                return;
            }
            cVar.b0("");
            cVar.T(Chip.f14068x);
        }

        @Override // a0.a
        protected void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f14079m = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d5.b.f23975e);
    }

    private void A() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f14088v);
        }
    }

    private void B(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f14087u.setEmpty();
        if (m() && this.f14074h != null) {
            this.f14071e.X0(this.f14087u);
        }
        return this.f14087u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f14086t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f14086t;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.h1();
        }
        return null;
    }

    private void i(com.google.android.material.chip.a aVar) {
        aVar.o2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] j() {
        ?? isEnabled = isEnabled();
        int i10 = isEnabled;
        if (this.f14079m) {
            i10 = isEnabled + 1;
        }
        int i11 = i10;
        if (this.f14078l) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f14077k) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f14079m) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f14078l) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f14077k) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    private void l() {
        if (getBackgroundDrawable() == this.f14072f && this.f14071e.getCallback() == null) {
            this.f14071e.setCallback(this.f14072f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        com.google.android.material.chip.a aVar = this.f14071e;
        return (aVar == null || aVar.Q0() == null) ? false : true;
    }

    private void n(Context context, AttributeSet attributeSet, int i10) {
        TypedArray h10 = m.h(context, attributeSet, k.X, i10, f14067w, new int[0]);
        this.f14080n = h10.getBoolean(k.E0, false);
        this.f14082p = (int) Math.ceil(h10.getDimension(k.f24264s0, (float) Math.ceil(o.b(getContext(), 48))));
        h10.recycle();
    }

    private void o() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private void p(int i10, int i11, int i12, int i13) {
        this.f14072f = new InsetDrawable((Drawable) this.f14071e, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f14078l != z10) {
            this.f14078l = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f14077k != z10) {
            this.f14077k = z10;
            refreshDrawableState();
        }
    }

    private void t() {
        if (this.f14072f != null) {
            this.f14072f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            x();
        }
    }

    private void v(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.o2(null);
        }
    }

    private void w() {
        if (m() && r() && this.f14074h != null) {
            a0.q0(this, this.f14084r);
            this.f14085s = true;
            return;
        }
        a0.q0(this, null);
        this.f14085s = false;
    }

    private void x() {
        if (s5.b.f30781a) {
            y();
            return;
        }
        this.f14071e.J2(true);
        a0.u0(this, getBackgroundDrawable());
        z();
        l();
    }

    private void y() {
        this.f14073g = new RippleDrawable(s5.b.a(this.f14071e.e1()), getBackgroundDrawable(), null);
        this.f14071e.J2(false);
        a0.u0(this, this.f14073g);
        z();
    }

    private void z() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f14071e) == null) {
            return;
        }
        int I0 = (int) (aVar.I0() + this.f14071e.i1() + this.f14071e.p0());
        int N0 = (int) (this.f14071e.N0() + this.f14071e.j1() + this.f14071e.l0());
        if (this.f14072f != null) {
            Rect rect = new Rect();
            this.f14072f.getPadding(rect);
            N0 += rect.left;
            I0 += rect.right;
        }
        a0.D0(this, N0, getPaddingTop(), I0, getPaddingBottom());
    }

    @Override // com.google.android.material.chip.a.InterfaceC0186a
    public void a() {
        k(this.f14082p);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f14085s) {
            return this.f14084r.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f14085s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f14084r.w(keyEvent) || this.f14084r.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f14071e;
        if ((aVar == null || !aVar.o1()) ? false : this.f14071e.k2(j())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f14083q)) {
            return this.f14083q;
        }
        if (!q()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).h()) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f14072f;
        return insetDrawable == null ? this.f14071e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.F0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.H0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f14071e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.T0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.U0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f14085s && (this.f14084r.A() == 1 || this.f14084r.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public e5.h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public u5.k getShapeAppearanceModel() {
        return this.f14071e.D();
    }

    public e5.h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.i1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            return aVar.j1();
        }
        return 0.0f;
    }

    public boolean k(int i10) {
        this.f14082p = i10;
        if (!u()) {
            if (this.f14072f != null) {
                t();
            } else {
                x();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.f14071e.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f14071e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f14072f != null) {
                t();
            } else {
                x();
            }
            return false;
        }
        int i11 = max2 > 0 ? max2 / 2 : 0;
        int i12 = max > 0 ? max / 2 : 0;
        if (this.f14072f != null) {
            Rect rect = new Rect();
            this.f14072f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                x();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != i10) {
                setMinHeight(i10);
            }
            if (getMinWidth() != i10) {
                setMinWidth(i10);
            }
        } else {
            setMinHeight(i10);
            setMinWidth(i10);
        }
        p(i11, i12, i11, i12);
        x();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        u5.h.f(this, this.f14071e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f14069y);
        }
        if (q()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f14070z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f14085s) {
            this.f14084r.I(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(q());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            androidx.core.view.accessibility.c.x0(accessibilityNodeInfo).a0(c.C0048c.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f14081o != i10) {
            this.f14081o = i10;
            z();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f14077k
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f14077k
            if (r0 == 0) goto L34
            r5.s()
            r0 = r3
            goto L35
        L34:
            r0 = r2
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean q() {
        com.google.android.material.chip.a aVar = this.f14071e;
        return aVar != null && aVar.n1();
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f14071e;
        return aVar != null && aVar.p1();
    }

    public boolean s() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f14074h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f14085s) {
            this.f14084r.U(1, 1);
        }
        return z10;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f14083q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f14073g) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f14073g) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.w1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.x1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        h.a<Chip> aVar;
        com.google.android.material.chip.a aVar2 = this.f14071e;
        if (aVar2 == null) {
            this.f14076j = z10;
        } else if (aVar2.n1()) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked == z10 || (aVar = this.f14075i) == null) {
                return;
            }
            aVar.a(this, z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.y1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.z1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.A1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.B1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.C1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.E1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.F1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.G1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.H1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f14071e;
        if (aVar2 != aVar) {
            v(aVar2);
            this.f14071e = aVar;
            aVar.z2(false);
            i(this.f14071e);
            k(this.f14082p);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.I1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.J1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.K1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.L1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.M1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.O1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.P1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.S1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.U1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.V1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.W1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.X1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.Y1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.Z1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.b2(drawable);
        }
        w();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.c2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.d2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.e2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.f2(i10);
        }
        w();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.g2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.h2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.i2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.j2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.l2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.m2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.W(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f14071e == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.f14071e;
            if (aVar != null) {
                aVar.p2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f14080n = z10;
        k(this.f14082p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(e5.h hVar) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.q2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.r2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.s2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.t2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.u2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.v2(i10);
        }
    }

    @Override // com.google.android.material.internal.h
    public void setInternalOnCheckedChangeListener(h.a<Chip> aVar) {
        this.f14075i = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f14071e != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i10);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.w2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f14074h = onClickListener;
        w();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.x2(colorStateList);
        }
        if (this.f14071e.l1()) {
            return;
        }
        y();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.y2(i10);
            if (this.f14071e.l1()) {
                return;
            }
            y();
        }
    }

    @Override // u5.n
    public void setShapeAppearanceModel(u5.k kVar) {
        this.f14071e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(e5.h hVar) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.A2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.B2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.K2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f14071e;
        if (aVar2 != null) {
            aVar2.C2(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.D2(dVar);
        }
        A();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.F2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.G2(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.H2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.I2(i10);
        }
    }

    public boolean u() {
        return this.f14080n;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.Chip.f14067w
            android.content.Context r8 = v5.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f14086t = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.f14087u = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.f14088v = r8
            android.content.Context r8 = r7.getContext()
            r7.B(r9)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.a.u0(r8, r9, r10, r4)
            r7.n(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = androidx.core.view.a0.y(r7)
            r6.W(r0)
            int[] r2 = d5.k.X
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L51
            int r10 = d5.k.f24120a0
            android.content.res.ColorStateList r8 = r5.c.a(r8, r9, r10)
            r7.setTextColor(r8)
        L51:
            int r8 = d5.k.J0
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.f14084r = r9
            r7.w()
            if (r8 != 0) goto L69
            r7.o()
        L69:
            boolean r8 = r7.f14076j
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.g1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.a1()
            r7.setEllipsize(r8)
            r7.A()
            com.google.android.material.chip.a r8 = r7.f14071e
            boolean r8 = r8.K2()
            if (r8 != 0) goto L8e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L8e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.z()
            boolean r8 = r7.u()
            if (r8 == 0) goto La2
            int r8 = r7.f14082p
            r7.setMinHeight(r8)
        La2:
            int r8 = androidx.core.view.a0.E(r7)
            r7.f14081o = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.n2(z10);
        }
        w();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.D1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.R1(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.E2(i10);
        }
        A();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f14071e;
        if (aVar != null) {
            aVar.E2(i10);
        }
        A();
    }
}
