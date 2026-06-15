package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.view.a0;
import androidx.customview.view.AbsSavedState;
import d5.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u5.h;
import u5.k;
import u5.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class MaterialButton extends f implements Checkable, n {

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f14001q = {16842911};

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f14002r = {16842912};

    /* renamed from: s  reason: collision with root package name */
    private static final int f14003s = j.f24107i;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.material.button.a f14004d;

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashSet<a> f14005e;

    /* renamed from: f  reason: collision with root package name */
    private b f14006f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f14007g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f14008h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f14009i;

    /* renamed from: j  reason: collision with root package name */
    private int f14010j;

    /* renamed from: k  reason: collision with root package name */
    private int f14011k;

    /* renamed from: l  reason: collision with root package name */
    private int f14012l;

    /* renamed from: m  reason: collision with root package name */
    private int f14013m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14014n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f14015o;

    /* renamed from: p  reason: collision with root package name */
    private int f14016p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f14017c;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f14017c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f14017c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d5.b.f23987q);
    }

    private boolean b() {
        int i10 = this.f14016p;
        return i10 == 3 || i10 == 4;
    }

    private boolean c() {
        int i10 = this.f14016p;
        return i10 == 1 || i10 == 2;
    }

    private boolean d() {
        int i10 = this.f14016p;
        return i10 == 16 || i10 == 32;
    }

    private boolean e() {
        return a0.E(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f14004d;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            androidx.core.widget.j.i(this, this.f14009i, null, null, null);
        } else if (b()) {
            androidx.core.widget.j.i(this, null, null, this.f14009i, null);
        } else if (d()) {
            androidx.core.widget.j.i(this, null, this.f14009i, null, null);
        }
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        if (Build.VERSION.SDK_INT < 17) {
            return getGravityTextAlignment();
        }
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment == 6 || textAlignment == 3) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (textAlignment != 4) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_CENTER;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private void h(boolean z10) {
        Drawable drawable = this.f14009i;
        boolean z11 = true;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f14009i = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f14008h);
            PorterDuff.Mode mode = this.f14007g;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f14009i, mode);
            }
            int i10 = this.f14010j;
            if (i10 == 0) {
                i10 = this.f14009i.getIntrinsicWidth();
            }
            int i11 = this.f14010j;
            if (i11 == 0) {
                i11 = this.f14009i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f14009i;
            int i12 = this.f14011k;
            int i13 = this.f14012l;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f14009i.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] a10 = androidx.core.widget.j.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        if ((!c() || drawable3 == this.f14009i) && ((!b() || drawable5 == this.f14009i) && (!d() || drawable4 == this.f14009i))) {
            z11 = false;
        }
        if (z11) {
            g();
        }
    }

    private void i(int i10, int i11) {
        if (this.f14009i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f14011k = 0;
                if (this.f14016p == 16) {
                    this.f14012l = 0;
                    h(false);
                    return;
                }
                int i12 = this.f14010j;
                if (i12 == 0) {
                    i12 = this.f14009i.getIntrinsicHeight();
                }
                int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i12) - this.f14013m) - getPaddingBottom()) / 2;
                if (this.f14012l != textHeight) {
                    this.f14012l = textHeight;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f14012l = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f14016p;
        if (i13 != 1 && i13 != 3 && ((i13 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i13 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
            int i14 = this.f14010j;
            if (i14 == 0) {
                i14 = this.f14009i.getIntrinsicWidth();
            }
            int textWidth = ((((i10 - getTextWidth()) - a0.I(this)) - i14) - this.f14013m) - a0.J(this);
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                textWidth /= 2;
            }
            if (e() != (this.f14016p == 4)) {
                textWidth = -textWidth;
            }
            if (this.f14011k != textWidth) {
                this.f14011k = textWidth;
                h(false);
                return;
            }
            return;
        }
        this.f14011k = 0;
        h(false);
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f14004d;
        return aVar != null && aVar.p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f14004d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f14009i;
    }

    public int getIconGravity() {
        return this.f14016p;
    }

    public int getIconPadding() {
        return this.f14013m;
    }

    public int getIconSize() {
        return this.f14010j;
    }

    public ColorStateList getIconTint() {
        return this.f14008h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f14007g;
    }

    public int getInsetBottom() {
        return this.f14004d.c();
    }

    public int getInsetTop() {
        return this.f14004d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f14004d.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f14004d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f14004d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f14004d.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f, androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        if (f()) {
            return this.f14004d.l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f, androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (f()) {
            return this.f14004d.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f14014n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f14004d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f14001q);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f14002r);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.google.android.material.button.a aVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f14004d) != null) {
            aVar.H(i13 - i11, i12 - i10);
        }
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f14017c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f14017c = this.f14014n;
        return savedState;
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f14009i != null) {
            if (this.f14009i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f14004d.r(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f14004d.s();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f14004d.t(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f14014n != z10) {
            this.f14014n = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f14014n);
            }
            if (this.f14015o) {
                return;
            }
            this.f14015o = true;
            Iterator<a> it = this.f14005e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f14014n);
            }
            this.f14015o = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f14004d.u(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f14004d.f().W(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f14009i != drawable) {
            this.f14009i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f14016p != i10) {
            this.f14016p = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f14013m != i10) {
            this.f14013m = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.f14010j != i10) {
                this.f14010j = i10;
                h(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f14008h != colorStateList) {
            this.f14008h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f14007g != mode) {
            this.f14007g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(f.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f14004d.v(i10);
    }

    public void setInsetTop(int i10) {
        this.f14004d.w(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f14006f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f14006f;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f14004d.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(f.a.a(getContext(), i10));
        }
    }

    @Override // u5.n
    public void setShapeAppearanceModel(k kVar) {
        if (f()) {
            this.f14004d.y(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f14004d.z(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f14004d.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(f.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f14004d.B(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.f, androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f14004d.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.f, androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f14004d.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f14014n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f14003s
            android.content.Context r9 = v5.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f14005e = r9
            r9 = 0
            r8.f14014n = r9
            r8.f14015o = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = d5.k.f24138c2
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r1 = d5.k.f24242p2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f14013m = r1
            int r1 = d5.k.f24266s2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.o.f(r1, r2)
            r8.f14007g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = d5.k.f24258r2
            android.content.res.ColorStateList r1 = r5.c.a(r1, r0, r2)
            r8.f14008h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = d5.k.f24226n2
            android.graphics.drawable.Drawable r1 = r5.c.d(r1, r0, r2)
            r8.f14009i = r1
            int r1 = d5.k.f24234o2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f14016p = r1
            int r1 = d5.k.f24250q2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f14010j = r1
            u5.k$b r10 = u5.k.e(r7, r10, r11, r6)
            u5.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f14004d = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.f14013m
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f14009i
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
