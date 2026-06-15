package com.google.android.material.textfield;

import a1.o;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.h0;
import androidx.core.view.a0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class TextInputLayout extends LinearLayout {
    private static final int R0 = d5.j.f24105g;
    private CharSequence A;
    private ColorStateList A0;
    private final TextView B;
    private int B0;
    private boolean C;
    private int C0;
    private CharSequence D;
    private int D0;
    private boolean E;
    private ColorStateList E0;
    private u5.g F;
    private int F0;
    private u5.g G;
    private int G0;
    private u5.g H;
    private int H0;
    private u5.k I;
    private int I0;
    private boolean J;
    private int J0;
    private final int K;
    private boolean K0;
    private int L;
    final com.google.android.material.internal.b L0;
    private int M;
    private boolean M0;
    private int N;
    private boolean N0;
    private int O;
    private ValueAnimator O0;
    private int P;
    private boolean P0;
    private int Q;
    private boolean Q0;
    private int R;
    private final Rect S;
    private final Rect T;
    private final RectF U;
    private Typeface V;
    private Drawable W;

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f14530a;

    /* renamed from: a0  reason: collision with root package name */
    private int f14531a0;

    /* renamed from: b  reason: collision with root package name */
    private final k f14532b;

    /* renamed from: b0  reason: collision with root package name */
    private final LinkedHashSet<f> f14533b0;

    /* renamed from: c  reason: collision with root package name */
    private final LinearLayout f14534c;

    /* renamed from: c0  reason: collision with root package name */
    private int f14535c0;

    /* renamed from: d  reason: collision with root package name */
    private final FrameLayout f14536d;

    /* renamed from: d0  reason: collision with root package name */
    private final SparseArray<com.google.android.material.textfield.e> f14537d0;

    /* renamed from: e  reason: collision with root package name */
    EditText f14538e;

    /* renamed from: e0  reason: collision with root package name */
    private final CheckableImageButton f14539e0;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f14540f;

    /* renamed from: f0  reason: collision with root package name */
    private final LinkedHashSet<g> f14541f0;

    /* renamed from: g  reason: collision with root package name */
    private int f14542g;

    /* renamed from: g0  reason: collision with root package name */
    private ColorStateList f14543g0;

    /* renamed from: h  reason: collision with root package name */
    private int f14544h;

    /* renamed from: h0  reason: collision with root package name */
    private PorterDuff.Mode f14545h0;

    /* renamed from: i  reason: collision with root package name */
    private int f14546i;

    /* renamed from: i0  reason: collision with root package name */
    private Drawable f14547i0;

    /* renamed from: j  reason: collision with root package name */
    private int f14548j;

    /* renamed from: j0  reason: collision with root package name */
    private int f14549j0;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.material.textfield.g f14550k;

    /* renamed from: k0  reason: collision with root package name */
    private Drawable f14551k0;

    /* renamed from: l  reason: collision with root package name */
    boolean f14552l;

    /* renamed from: l0  reason: collision with root package name */
    private View.OnLongClickListener f14553l0;

    /* renamed from: m  reason: collision with root package name */
    private int f14554m;

    /* renamed from: m0  reason: collision with root package name */
    private View.OnLongClickListener f14555m0;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14556n;

    /* renamed from: n0  reason: collision with root package name */
    private final CheckableImageButton f14557n0;

    /* renamed from: o  reason: collision with root package name */
    private TextView f14558o;

    /* renamed from: p  reason: collision with root package name */
    private int f14559p;

    /* renamed from: q  reason: collision with root package name */
    private int f14560q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f14561r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f14562s;

    /* renamed from: t  reason: collision with root package name */
    private TextView f14563t;

    /* renamed from: u  reason: collision with root package name */
    private ColorStateList f14564u;

    /* renamed from: v  reason: collision with root package name */
    private int f14565v;

    /* renamed from: w  reason: collision with root package name */
    private a1.d f14566w;

    /* renamed from: x  reason: collision with root package name */
    private a1.d f14567x;

    /* renamed from: x0  reason: collision with root package name */
    private ColorStateList f14568x0;

    /* renamed from: y  reason: collision with root package name */
    private ColorStateList f14569y;

    /* renamed from: y0  reason: collision with root package name */
    private PorterDuff.Mode f14570y0;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f14571z;

    /* renamed from: z0  reason: collision with root package name */
    private ColorStateList f14572z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        CharSequence f14573c;

        /* renamed from: d  reason: collision with root package name */
        boolean f14574d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f14575e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f14576f;

        /* renamed from: g  reason: collision with root package name */
        CharSequence f14577g;

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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f14573c) + " hint=" + ((Object) this.f14575e) + " helperText=" + ((Object) this.f14576f) + " placeholderText=" + ((Object) this.f14577g) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f14573c, parcel, i10);
            parcel.writeInt(this.f14574d ? 1 : 0);
            TextUtils.writeToParcel(this.f14575e, parcel, i10);
            TextUtils.writeToParcel(this.f14576f, parcel, i10);
            TextUtils.writeToParcel(this.f14577g, parcel, i10);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14573c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14574d = parcel.readInt() == 1;
            this.f14575e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14576f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14577g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.w0(!textInputLayout.Q0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f14552l) {
                textInputLayout2.m0(editable.length());
            }
            if (TextInputLayout.this.f14562s) {
                TextInputLayout.this.A0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f14539e0.performClick();
            TextInputLayout.this.f14539e0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f14538e.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.L0.d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class e extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        private final TextInputLayout f14582d;

        public e(TextInputLayout textInputLayout) {
            this.f14582d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.c cVar) {
            View s10;
            super.g(view, cVar);
            EditText editText = this.f14582d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f14582d.getHint();
            CharSequence error = this.f14582d.getError();
            CharSequence placeholderText = this.f14582d.getPlaceholderText();
            int counterMaxLength = this.f14582d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f14582d.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !this.f14582d.N();
            boolean z13 = !TextUtils.isEmpty(error);
            boolean z14 = z13 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z11 ? hint.toString() : "";
            this.f14582d.f14532b.v(cVar);
            if (z10) {
                cVar.t0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                cVar.t0(charSequence);
                if (z12 && placeholderText != null) {
                    cVar.t0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                cVar.t0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.h0(charSequence);
                } else {
                    if (z10) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    cVar.t0(charSequence);
                }
                cVar.q0(!z10);
            }
            cVar.j0((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z14) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                cVar.d0(error);
            }
            if (Build.VERSION.SDK_INT < 17 || (s10 = this.f14582d.f14550k.s()) == null) {
                return;
            }
            cVar.i0(s10);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d5.b.G);
    }

    private boolean A() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof com.google.android.material.textfield.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(int i10) {
        if (i10 == 0 && !this.K0) {
            h0();
        } else {
            J();
        }
    }

    private void B() {
        Iterator<f> it = this.f14533b0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void B0(boolean z10, boolean z11) {
        int defaultColor = this.E0.getDefaultColor();
        int colorForState = this.E0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.E0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.Q = colorForState2;
        } else if (z11) {
            this.Q = colorForState;
        } else {
            this.Q = defaultColor;
        }
    }

    private void C(int i10) {
        Iterator<g> it = this.f14541f0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10);
        }
    }

    private void C0() {
        if (this.f14538e == null) {
            return;
        }
        a0.D0(this.B, getContext().getResources().getDimensionPixelSize(d5.d.f24024v), this.f14538e.getPaddingTop(), (K() || L()) ? 0 : a0.I(this.f14538e), this.f14538e.getPaddingBottom());
    }

    private void D(Canvas canvas) {
        u5.g gVar;
        if (this.H == null || (gVar = this.G) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f14538e.isFocused()) {
            Rect bounds = this.H.getBounds();
            Rect bounds2 = this.G.getBounds();
            float x10 = this.L0.x();
            int centerX = bounds2.centerX();
            bounds.left = e5.a.c(centerX, bounds2.left, x10);
            bounds.right = e5.a.c(centerX, bounds2.right, x10);
            this.H.draw(canvas);
        }
    }

    private void D0() {
        int visibility = this.B.getVisibility();
        int i10 = (this.A == null || N()) ? 8 : 0;
        if (visibility != i10) {
            getEndIconDelegate().c(i10 == 0);
        }
        t0();
        this.B.setVisibility(i10);
        q0();
    }

    private void E(Canvas canvas) {
        if (this.C) {
            this.L0.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.O0.cancel();
        }
        if (z10 && this.N0) {
            k(0.0f);
        } else {
            this.L0.d0(0.0f);
        }
        if (A() && ((com.google.android.material.textfield.c) this.F).j0()) {
            x();
        }
        this.K0 = true;
        J();
        this.f14532b.i(true);
        D0();
    }

    private int G(int i10, boolean z10) {
        int compoundPaddingLeft = i10 + this.f14538e.getCompoundPaddingLeft();
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private int H(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f14538e.getCompoundPaddingRight();
        return (getPrefixText() == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private boolean I() {
        return this.f14535c0 != 0;
    }

    private void J() {
        TextView textView = this.f14563t;
        if (textView == null || !this.f14562s) {
            return;
        }
        textView.setText((CharSequence) null);
        o.a(this.f14530a, this.f14567x);
        this.f14563t.setVisibility(4);
    }

    private boolean L() {
        return this.f14557n0.getVisibility() == 0;
    }

    private boolean P() {
        return this.L == 1 && (Build.VERSION.SDK_INT < 16 || this.f14538e.getMinLines() <= 1);
    }

    private void Q() {
        o();
        Z();
        E0();
        j0();
        j();
        if (this.L != 0) {
            v0();
        }
    }

    private void R() {
        if (A()) {
            RectF rectF = this.U;
            this.L0.o(rectF, this.f14538e.getWidth(), this.f14538e.getGravity());
            n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.N);
            ((com.google.android.material.textfield.c) this.F).m0(rectF);
        }
    }

    private void S() {
        if (!A() || this.K0) {
            return;
        }
        x();
        R();
    }

    private static void T(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt, z10);
            }
        }
    }

    private void X() {
        TextView textView = this.f14563t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        if (g0()) {
            a0.u0(this.f14538e, this.F);
        }
    }

    private static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean P = a0.P(checkableImageButton);
        boolean z10 = false;
        boolean z11 = onLongClickListener != null;
        if (P || z11) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(P);
        checkableImageButton.setPressable(P);
        checkableImageButton.setLongClickable(z11);
        a0.A0(checkableImageButton, z10 ? 1 : 2);
    }

    private static void b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private static void c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private boolean e0() {
        return (this.f14557n0.getVisibility() == 0 || ((I() && K()) || this.A != null)) && this.f14534c.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f14532b.getMeasuredWidth() > 0;
    }

    private boolean g0() {
        EditText editText = this.f14538e;
        return (editText == null || this.F == null || editText.getBackground() != null || this.L == 0) ? false : true;
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = this.f14537d0.get(this.f14535c0);
        return eVar != null ? eVar : this.f14537d0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f14557n0.getVisibility() == 0) {
            return this.f14557n0;
        }
        if (I() && K()) {
            return this.f14539e0;
        }
        return null;
    }

    private void h0() {
        if (this.f14563t == null || !this.f14562s || TextUtils.isEmpty(this.f14561r)) {
            return;
        }
        this.f14563t.setText(this.f14561r);
        o.a(this.f14530a, this.f14566w);
        this.f14563t.setVisibility(0);
        this.f14563t.bringToFront();
        if (Build.VERSION.SDK_INT >= 16) {
            announceForAccessibility(this.f14561r);
        }
    }

    private void i() {
        TextView textView = this.f14563t;
        if (textView != null) {
            this.f14530a.addView(textView);
            this.f14563t.setVisibility(0);
        }
    }

    private void i0(boolean z10) {
        if (z10 && getEndIconDrawable() != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
            androidx.core.graphics.drawable.a.n(mutate, this.f14550k.p());
            this.f14539e0.setImageDrawable(mutate);
            return;
        }
        com.google.android.material.textfield.f.a(this, this.f14539e0, this.f14543g0, this.f14545h0);
    }

    private void j() {
        if (this.f14538e == null || this.L != 1) {
            return;
        }
        if (r5.c.h(getContext())) {
            EditText editText = this.f14538e;
            a0.D0(editText, a0.J(editText), getResources().getDimensionPixelSize(d5.d.f24018p), a0.I(this.f14538e), getResources().getDimensionPixelSize(d5.d.f24017o));
        } else if (r5.c.g(getContext())) {
            EditText editText2 = this.f14538e;
            a0.D0(editText2, a0.J(editText2), getResources().getDimensionPixelSize(d5.d.f24016n), a0.I(this.f14538e), getResources().getDimensionPixelSize(d5.d.f24015m));
        }
    }

    private void j0() {
        if (this.L == 1) {
            if (r5.c.h(getContext())) {
                this.M = getResources().getDimensionPixelSize(d5.d.f24020r);
            } else if (r5.c.g(getContext())) {
                this.M = getResources().getDimensionPixelSize(d5.d.f24019q);
            }
        }
    }

    private void k0(Rect rect) {
        u5.g gVar = this.G;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.O, rect.right, i10);
        }
        u5.g gVar2 = this.H;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.P, rect.right, i11);
        }
    }

    private void l() {
        u5.g gVar = this.F;
        if (gVar == null) {
            return;
        }
        u5.k D = gVar.D();
        u5.k kVar = this.I;
        if (D != kVar) {
            this.F.setShapeAppearanceModel(kVar);
            p0();
        }
        if (v()) {
            this.F.c0(this.N, this.Q);
        }
        int p10 = p();
        this.R = p10;
        this.F.X(ColorStateList.valueOf(p10));
        if (this.f14535c0 == 3) {
            this.f14538e.getBackground().invalidateSelf();
        }
        m();
        invalidate();
    }

    private void l0() {
        if (this.f14558o != null) {
            EditText editText = this.f14538e;
            m0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void m() {
        ColorStateList valueOf;
        if (this.G == null || this.H == null) {
            return;
        }
        if (w()) {
            u5.g gVar = this.G;
            if (this.f14538e.isFocused()) {
                valueOf = ColorStateList.valueOf(this.B0);
            } else {
                valueOf = ColorStateList.valueOf(this.Q);
            }
            gVar.X(valueOf);
            this.H.X(ColorStateList.valueOf(this.Q));
        }
        invalidate();
    }

    private void n(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.K;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private static void n0(Context context, TextView textView, int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i12 = d5.i.f24085c;
        } else {
            i12 = d5.i.f24084b;
        }
        textView.setContentDescription(context.getString(i12, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void o() {
        int i10 = this.L;
        if (i10 == 0) {
            this.F = null;
            this.G = null;
            this.H = null;
        } else if (i10 == 1) {
            this.F = new u5.g(this.I);
            this.G = new u5.g();
            this.H = new u5.g();
        } else if (i10 == 2) {
            if (this.C && !(this.F instanceof com.google.android.material.textfield.c)) {
                this.F = new com.google.android.material.textfield.c(this.I);
            } else {
                this.F = new u5.g(this.I);
            }
            this.G = null;
            this.H = null;
        } else {
            throw new IllegalArgumentException(this.L + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f14558o;
        if (textView != null) {
            d0(textView, this.f14556n ? this.f14559p : this.f14560q);
            if (!this.f14556n && (colorStateList2 = this.f14569y) != null) {
                this.f14558o.setTextColor(colorStateList2);
            }
            if (!this.f14556n || (colorStateList = this.f14571z) == null) {
                return;
            }
            this.f14558o.setTextColor(colorStateList);
        }
    }

    private int p() {
        return this.L == 1 ? j5.a.g(j5.a.e(this, d5.b.f23981k, 0), this.R) : this.R;
    }

    private void p0() {
        if (this.f14535c0 == 3 && this.L == 2) {
            ((com.google.android.material.textfield.d) this.f14537d0.get(3)).J((AutoCompleteTextView) this.f14538e);
        }
    }

    private Rect q(Rect rect) {
        if (this.f14538e != null) {
            Rect rect2 = this.T;
            boolean e8 = com.google.android.material.internal.o.e(this);
            rect2.bottom = rect.bottom;
            int i10 = this.L;
            if (i10 == 1) {
                rect2.left = G(rect.left, e8);
                rect2.top = rect.top + this.M;
                rect2.right = H(rect.right, e8);
                return rect2;
            } else if (i10 != 2) {
                rect2.left = G(rect.left, e8);
                rect2.top = getPaddingTop();
                rect2.right = H(rect.right, e8);
                return rect2;
            } else {
                rect2.left = rect.left + this.f14538e.getPaddingLeft();
                rect2.top = rect.top - u();
                rect2.right = rect.right - this.f14538e.getPaddingRight();
                return rect2;
            }
        }
        throw new IllegalStateException();
    }

    private int r(Rect rect, Rect rect2, float f10) {
        if (P()) {
            return (int) (rect2.top + f10);
        }
        return rect.bottom - this.f14538e.getCompoundPaddingBottom();
    }

    private int s(Rect rect, float f10) {
        if (P()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return rect.top + this.f14538e.getCompoundPaddingTop();
    }

    private boolean s0() {
        int max;
        if (this.f14538e != null && this.f14538e.getMeasuredHeight() < (max = Math.max(this.f14534c.getMeasuredHeight(), this.f14532b.getMeasuredHeight()))) {
            this.f14538e.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    private void setEditText(EditText editText) {
        if (this.f14538e == null) {
            if (this.f14535c0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f14538e = editText;
            int i10 = this.f14542g;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f14546i);
            }
            int i11 = this.f14544h;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f14548j);
            }
            Q();
            setTextInputAccessibilityDelegate(new e(this));
            this.L0.j0(this.f14538e.getTypeface());
            this.L0.b0(this.f14538e.getTextSize());
            if (Build.VERSION.SDK_INT >= 21) {
                this.L0.X(this.f14538e.getLetterSpacing());
            }
            int gravity = this.f14538e.getGravity();
            this.L0.S((gravity & (-113)) | 48);
            this.L0.a0(gravity);
            this.f14538e.addTextChangedListener(new a());
            if (this.f14572z0 == null) {
                this.f14572z0 = this.f14538e.getHintTextColors();
            }
            if (this.C) {
                if (TextUtils.isEmpty(this.D)) {
                    CharSequence hint = this.f14538e.getHint();
                    this.f14540f = hint;
                    setHint(hint);
                    this.f14538e.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.f14558o != null) {
                m0(this.f14538e.getText().length());
            }
            r0();
            this.f14550k.f();
            this.f14532b.bringToFront();
            this.f14534c.bringToFront();
            this.f14536d.bringToFront();
            this.f14557n0.bringToFront();
            B();
            C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            x0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        this.L0.h0(charSequence);
        if (this.K0) {
            return;
        }
        R();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f14562s == z10) {
            return;
        }
        if (z10) {
            i();
        } else {
            X();
            this.f14563t = null;
        }
        this.f14562s = z10;
    }

    private Rect t(Rect rect) {
        if (this.f14538e != null) {
            Rect rect2 = this.T;
            float w10 = this.L0.w();
            rect2.left = rect.left + this.f14538e.getCompoundPaddingLeft();
            rect2.top = s(rect, w10);
            rect2.right = rect.right - this.f14538e.getCompoundPaddingRight();
            rect2.bottom = r(rect, rect2, w10);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void t0() {
        this.f14536d.setVisibility((this.f14539e0.getVisibility() != 0 || L()) ? 8 : 0);
        this.f14534c.setVisibility(K() || L() || !((this.A == null || N()) ? true : false) ? 0 : 8);
    }

    private int u() {
        float q10;
        if (this.C) {
            int i10 = this.L;
            if (i10 == 0) {
                q10 = this.L0.q();
            } else if (i10 != 2) {
                return 0;
            } else {
                q10 = this.L0.q() / 2.0f;
            }
            return (int) q10;
        }
        return 0;
    }

    private void u0() {
        this.f14557n0.setVisibility(getErrorIconDrawable() != null && this.f14550k.z() && this.f14550k.l() ? 0 : 8);
        t0();
        C0();
        if (I()) {
            return;
        }
        q0();
    }

    private boolean v() {
        return this.L == 2 && w();
    }

    private void v0() {
        if (this.L != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f14530a.getLayoutParams();
            int u10 = u();
            if (u10 != layoutParams.topMargin) {
                layoutParams.topMargin = u10;
                this.f14530a.requestLayout();
            }
        }
    }

    private boolean w() {
        return this.N > -1 && this.Q != 0;
    }

    private void x() {
        if (A()) {
            ((com.google.android.material.textfield.c) this.F).k0();
        }
    }

    private void x0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f14538e;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f14538e;
        boolean z13 = editText2 != null && editText2.hasFocus();
        boolean l10 = this.f14550k.l();
        ColorStateList colorStateList2 = this.f14572z0;
        if (colorStateList2 != null) {
            this.L0.R(colorStateList2);
            this.L0.Z(this.f14572z0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f14572z0;
            if (colorStateList3 != null) {
                i10 = colorStateList3.getColorForState(new int[]{-16842910}, this.J0);
            } else {
                i10 = this.J0;
            }
            this.L0.R(ColorStateList.valueOf(i10));
            this.L0.Z(ColorStateList.valueOf(i10));
        } else if (l10) {
            this.L0.R(this.f14550k.q());
        } else if (this.f14556n && (textView = this.f14558o) != null) {
            this.L0.R(textView.getTextColors());
        } else if (z13 && (colorStateList = this.A0) != null) {
            this.L0.R(colorStateList);
        }
        if (!z12 && this.M0 && (!isEnabled() || !z13)) {
            if (z11 || !this.K0) {
                F(z10);
            }
        } else if (z11 || this.K0) {
            y(z10);
        }
    }

    private void y(boolean z10) {
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.O0.cancel();
        }
        if (z10 && this.N0) {
            k(1.0f);
        } else {
            this.L0.d0(1.0f);
        }
        this.K0 = false;
        if (A()) {
            R();
        }
        z0();
        this.f14532b.i(false);
        D0();
    }

    private void y0() {
        EditText editText;
        if (this.f14563t == null || (editText = this.f14538e) == null) {
            return;
        }
        this.f14563t.setGravity(editText.getGravity());
        this.f14563t.setPadding(this.f14538e.getCompoundPaddingLeft(), this.f14538e.getCompoundPaddingTop(), this.f14538e.getCompoundPaddingRight(), this.f14538e.getCompoundPaddingBottom());
    }

    private a1.d z() {
        a1.d dVar = new a1.d();
        dVar.W(87L);
        dVar.Y(e5.a.f25169a);
        return dVar;
    }

    private void z0() {
        EditText editText = this.f14538e;
        A0(editText == null ? 0 : editText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.L == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f14538e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f14538e) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.Q = this.J0;
        } else if (this.f14550k.l()) {
            if (this.E0 != null) {
                B0(z11, z10);
            } else {
                this.Q = this.f14550k.p();
            }
        } else if (!this.f14556n || (textView = this.f14558o) == null) {
            if (z11) {
                this.Q = this.D0;
            } else if (z10) {
                this.Q = this.C0;
            } else {
                this.Q = this.B0;
            }
        } else if (this.E0 != null) {
            B0(z11, z10);
        } else {
            this.Q = textView.getCurrentTextColor();
        }
        u0();
        V();
        W();
        U();
        if (getEndIconDelegate().d()) {
            i0(this.f14550k.l());
        }
        if (this.L == 2) {
            int i10 = this.N;
            if (z11 && isEnabled()) {
                this.N = this.P;
            } else {
                this.N = this.O;
            }
            if (this.N != i10) {
                S();
            }
        }
        if (this.L == 1) {
            if (!isEnabled()) {
                this.R = this.G0;
            } else if (z10 && !z11) {
                this.R = this.I0;
            } else if (z11) {
                this.R = this.H0;
            } else {
                this.R = this.F0;
            }
        }
        l();
    }

    public boolean K() {
        return this.f14536d.getVisibility() == 0 && this.f14539e0.getVisibility() == 0;
    }

    public boolean M() {
        return this.f14550k.A();
    }

    final boolean N() {
        return this.K0;
    }

    public boolean O() {
        return this.E;
    }

    public void U() {
        com.google.android.material.textfield.f.c(this, this.f14539e0, this.f14543g0);
    }

    public void V() {
        com.google.android.material.textfield.f.c(this, this.f14557n0, this.f14568x0);
    }

    public void W() {
        this.f14532b.j();
    }

    public void Y(float f10, float f11, float f12, float f13) {
        boolean e8 = com.google.android.material.internal.o.e(this);
        this.J = e8;
        float f14 = e8 ? f11 : f10;
        if (!e8) {
            f10 = f11;
        }
        float f15 = e8 ? f13 : f12;
        if (!e8) {
            f12 = f13;
        }
        u5.g gVar = this.F;
        if (gVar != null && gVar.G() == f14 && this.F.H() == f10 && this.F.s() == f15 && this.F.t() == f12) {
            return;
        }
        this.I = this.I.v().A(f14).E(f10).s(f15).w(f12).m();
        l();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f14530a.addView(view, layoutParams2);
            this.f14530a.setLayoutParams(layoutParams);
            v0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.j.n(r3, r4)     // Catch: java.lang.Exception -> L1a
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1a
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1a
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1a
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1a
        L18:
            r4 = 0
            r0 = r4
        L1a:
            if (r0 == 0) goto L2e
            int r4 = d5.j.f24099a
            androidx.core.widget.j.n(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = d5.c.f23997a
            int r4 = androidx.core.content.a.d(r4, r0)
            r3.setTextColor(r4)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.d0(android.widget.TextView, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f14538e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f14540f != null) {
            boolean z10 = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.f14538e.setHint(this.f14540f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f14538e.setHint(hint);
                this.E = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f14530a.getChildCount());
        for (int i11 = 0; i11 < this.f14530a.getChildCount(); i11++) {
            View childAt = this.f14530a.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f14538e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.Q0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Q0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.P0) {
            return;
        }
        boolean z10 = true;
        this.P0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.L0;
        boolean g02 = bVar != null ? bVar.g0(drawableState) | false : false;
        if (this.f14538e != null) {
            if (!a0.U(this) || !isEnabled()) {
                z10 = false;
            }
            w0(z10);
        }
        r0();
        E0();
        if (g02) {
            invalidate();
        }
        this.P0 = false;
    }

    public void g(f fVar) {
        this.f14533b0.add(fVar);
        if (this.f14538e != null) {
            fVar.a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f14538e;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + u();
        }
        return super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u5.g getBoxBackground() {
        int i10 = this.L;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.F;
    }

    public int getBoxBackgroundColor() {
        return this.R;
    }

    public int getBoxBackgroundMode() {
        return this.L;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.M;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (com.google.android.material.internal.o.e(this)) {
            return this.I.j().a(this.U);
        }
        return this.I.l().a(this.U);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (com.google.android.material.internal.o.e(this)) {
            return this.I.l().a(this.U);
        }
        return this.I.j().a(this.U);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (com.google.android.material.internal.o.e(this)) {
            return this.I.r().a(this.U);
        }
        return this.I.t().a(this.U);
    }

    public float getBoxCornerRadiusTopStart() {
        if (com.google.android.material.internal.o.e(this)) {
            return this.I.t().a(this.U);
        }
        return this.I.r().a(this.U);
    }

    public int getBoxStrokeColor() {
        return this.D0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.E0;
    }

    public int getBoxStrokeWidth() {
        return this.O;
    }

    public int getBoxStrokeWidthFocused() {
        return this.P;
    }

    public int getCounterMaxLength() {
        return this.f14554m;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f14552l && this.f14556n && (textView = this.f14558o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f14569y;
    }

    public ColorStateList getCounterTextColor() {
        return this.f14569y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f14572z0;
    }

    public EditText getEditText() {
        return this.f14538e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f14539e0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f14539e0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f14535c0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f14539e0;
    }

    public CharSequence getError() {
        if (this.f14550k.z()) {
            return this.f14550k.o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f14550k.n();
    }

    public int getErrorCurrentTextColors() {
        return this.f14550k.p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f14557n0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f14550k.p();
    }

    public CharSequence getHelperText() {
        if (this.f14550k.A()) {
            return this.f14550k.r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f14550k.t();
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.L0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.L0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.A0;
    }

    public int getMaxEms() {
        return this.f14544h;
    }

    public int getMaxWidth() {
        return this.f14548j;
    }

    public int getMinEms() {
        return this.f14542g;
    }

    public int getMinWidth() {
        return this.f14546i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f14539e0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f14539e0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f14562s) {
            return this.f14561r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f14565v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f14564u;
    }

    public CharSequence getPrefixText() {
        return this.f14532b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f14532b.b();
    }

    public TextView getPrefixTextView() {
        return this.f14532b.c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f14532b.d();
    }

    public Drawable getStartIconDrawable() {
        return this.f14532b.e();
    }

    public CharSequence getSuffixText() {
        return this.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.B;
    }

    public Typeface getTypeface() {
        return this.V;
    }

    public void h(g gVar) {
        this.f14541f0.add(gVar);
    }

    void k(float f10) {
        if (this.L0.x() == f10) {
            return;
        }
        if (this.O0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O0 = valueAnimator;
            valueAnimator.setInterpolator(e5.a.f25170b);
            this.O0.setDuration(167L);
            this.O0.addUpdateListener(new d());
        }
        this.O0.setFloatValues(this.L0.x(), f10);
        this.O0.start();
    }

    void m0(int i10) {
        boolean z10 = this.f14556n;
        int i11 = this.f14554m;
        if (i11 == -1) {
            this.f14558o.setText(String.valueOf(i10));
            this.f14558o.setContentDescription(null);
            this.f14556n = false;
        } else {
            this.f14556n = i10 > i11;
            n0(getContext(), this.f14558o, i10, this.f14554m, this.f14556n);
            if (z10 != this.f14556n) {
                o0();
            }
            this.f14558o.setText(androidx.core.text.a.c().j(getContext().getString(d5.i.f24086d, Integer.valueOf(i10), Integer.valueOf(this.f14554m))));
        }
        if (this.f14538e == null || z10 == this.f14556n) {
            return;
        }
        w0(false);
        E0();
        r0();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.L0.H(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f14538e;
        if (editText != null) {
            Rect rect = this.S;
            com.google.android.material.internal.c.a(this, editText, rect);
            k0(rect);
            if (this.C) {
                this.L0.b0(this.f14538e.getTextSize());
                int gravity = this.f14538e.getGravity();
                this.L0.S((gravity & (-113)) | 48);
                this.L0.a0(gravity);
                this.L0.O(q(rect));
                this.L0.W(t(rect));
                this.L0.K();
                if (!A() || this.K0) {
                    return;
                }
                R();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean s02 = s0();
        boolean q02 = q0();
        if (s02 || q02) {
            this.f14538e.post(new c());
        }
        y0();
        C0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.f14573c);
        if (savedState.f14574d) {
            this.f14539e0.post(new b());
        }
        setHint(savedState.f14575e);
        setHelperText(savedState.f14576f);
        setPlaceholderText(savedState.f14577g);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = false;
        boolean z11 = i10 == 1;
        boolean z12 = this.J;
        if (z11 != z12) {
            if (z11 && !z12) {
                z10 = true;
            }
            float a10 = this.I.r().a(this.U);
            float a11 = this.I.t().a(this.U);
            float a12 = this.I.j().a(this.U);
            float a13 = this.I.l().a(this.U);
            float f10 = z10 ? a10 : a11;
            if (z10) {
                a10 = a11;
            }
            float f11 = z10 ? a12 : a13;
            if (z10) {
                a12 = a13;
            }
            Y(f10, a10, f11, a12);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f14550k.l()) {
            savedState.f14573c = getError();
        }
        savedState.f14574d = I() && this.f14539e0.isChecked();
        savedState.f14575e = getHint();
        savedState.f14576f = getHelperText();
        savedState.f14577g = getPlaceholderText();
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q0() {
        boolean z10;
        if (this.f14538e == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f14532b.getMeasuredWidth() - this.f14538e.getPaddingLeft();
            if (this.W == null || this.f14531a0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.W = colorDrawable;
                this.f14531a0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a10 = androidx.core.widget.j.a(this.f14538e);
            Drawable drawable = a10[0];
            Drawable drawable2 = this.W;
            if (drawable != drawable2) {
                androidx.core.widget.j.i(this.f14538e, drawable2, a10[1], a10[2], a10[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.W != null) {
                Drawable[] a11 = androidx.core.widget.j.a(this.f14538e);
                androidx.core.widget.j.i(this.f14538e, null, a11[1], a11[2], a11[3]);
                this.W = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.B.getMeasuredWidth() - this.f14538e.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + androidx.core.view.h.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] a12 = androidx.core.widget.j.a(this.f14538e);
            Drawable drawable3 = this.f14547i0;
            if (drawable3 != null && this.f14549j0 != measuredWidth2) {
                this.f14549j0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.j.i(this.f14538e, a12[0], a12[1], this.f14547i0, a12[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f14547i0 = colorDrawable2;
                    this.f14549j0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a12[2];
                Drawable drawable5 = this.f14547i0;
                if (drawable4 != drawable5) {
                    this.f14551k0 = a12[2];
                    androidx.core.widget.j.i(this.f14538e, a12[0], a12[1], drawable5, a12[3]);
                } else {
                    z11 = z10;
                }
            }
        } else if (this.f14547i0 == null) {
            return z10;
        } else {
            Drawable[] a13 = androidx.core.widget.j.a(this.f14538e);
            if (a13[2] == this.f14547i0) {
                androidx.core.widget.j.i(this.f14538e, a13[0], a13[1], this.f14551k0, a13[3]);
            } else {
                z11 = z10;
            }
            this.f14547i0 = null;
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f14538e;
        if (editText == null || this.L != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (h0.a(background)) {
            background = background.mutate();
        }
        if (this.f14550k.l()) {
            background.setColorFilter(androidx.appcompat.widget.k.e(this.f14550k.p(), PorterDuff.Mode.SRC_IN));
        } else if (this.f14556n && (textView = this.f14558o) != null) {
            background.setColorFilter(androidx.appcompat.widget.k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.a.c(background);
            this.f14538e.refreshDrawableState();
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.R != i10) {
            this.R = i10;
            this.F0 = i10;
            this.H0 = i10;
            this.I0 = i10;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.a.d(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.F0 = defaultColor;
        this.R = defaultColor;
        this.G0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.H0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.I0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.L) {
            return;
        }
        this.L = i10;
        if (this.f14538e != null) {
            Q();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.M = i10;
    }

    public void setBoxStrokeColor(int i10) {
        if (this.D0 != i10) {
            this.D0 = i10;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.B0 = colorStateList.getDefaultColor();
            this.J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.C0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.D0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.D0 != colorStateList.getDefaultColor()) {
            this.D0 = colorStateList.getDefaultColor();
        }
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.E0 != colorStateList) {
            this.E0 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.O = i10;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.P = i10;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f14552l != z10) {
            if (z10) {
                c0 c0Var = new c0(getContext());
                this.f14558o = c0Var;
                c0Var.setId(d5.f.K);
                Typeface typeface = this.V;
                if (typeface != null) {
                    this.f14558o.setTypeface(typeface);
                }
                this.f14558o.setMaxLines(1);
                this.f14550k.e(this.f14558o, 2);
                androidx.core.view.h.d((ViewGroup.MarginLayoutParams) this.f14558o.getLayoutParams(), getResources().getDimensionPixelOffset(d5.d.S));
                o0();
                l0();
            } else {
                this.f14550k.B(this.f14558o, 2);
                this.f14558o = null;
            }
            this.f14552l = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f14554m != i10) {
            if (i10 > 0) {
                this.f14554m = i10;
            } else {
                this.f14554m = -1;
            }
            if (this.f14552l) {
                l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f14559p != i10) {
            this.f14559p = i10;
            o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f14571z != colorStateList) {
            this.f14571z = colorStateList;
            o0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f14560q != i10) {
            this.f14560q = i10;
            o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f14569y != colorStateList) {
            this.f14569y = colorStateList;
            o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f14572z0 = colorStateList;
        this.A0 = colorStateList;
        if (this.f14538e != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        T(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f14539e0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f14539e0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setEndIconMode(int i10) {
        int i11 = this.f14535c0;
        if (i11 == i10) {
            return;
        }
        this.f14535c0 = i10;
        C(i11);
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().b(this.L)) {
            getEndIconDelegate().a();
            com.google.android.material.textfield.f.a(this, this.f14539e0, this.f14543g0, this.f14545h0);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.L + " is not supported by the end icon mode " + i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f14539e0, onClickListener, this.f14553l0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f14553l0 = onLongClickListener;
        c0(this.f14539e0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f14543g0 != colorStateList) {
            this.f14543g0 = colorStateList;
            com.google.android.material.textfield.f.a(this, this.f14539e0, colorStateList, this.f14545h0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f14545h0 != mode) {
            this.f14545h0 = mode;
            com.google.android.material.textfield.f.a(this, this.f14539e0, this.f14543g0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (K() != z10) {
            this.f14539e0.setVisibility(z10 ? 0 : 8);
            t0();
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f14550k.z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f14550k.O(charSequence);
        } else {
            this.f14550k.v();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f14550k.D(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f14550k.E(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
        V();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.f14557n0, onClickListener, this.f14555m0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f14555m0 = onLongClickListener;
        c0(this.f14557n0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f14568x0 != colorStateList) {
            this.f14568x0 = colorStateList;
            com.google.android.material.textfield.f.a(this, this.f14557n0, colorStateList, this.f14570y0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f14570y0 != mode) {
            this.f14570y0 = mode;
            com.google.android.material.textfield.f.a(this, this.f14557n0, this.f14568x0, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.f14550k.F(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f14550k.G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.M0 != z10) {
            this.M0 = z10;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!M()) {
            setHelperTextEnabled(true);
        }
        this.f14550k.P(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f14550k.J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f14550k.I(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f14550k.H(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(com.ironsource.mediationsdk.metadata.a.f18931n);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.N0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.C) {
            this.C = z10;
            if (!z10) {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f14538e.getHint())) {
                    this.f14538e.setHint(this.D);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f14538e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f14538e.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.f14538e != null) {
                v0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.L0.P(i10);
        this.A0 = this.L0.p();
        if (this.f14538e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            if (this.f14572z0 == null) {
                this.L0.R(colorStateList);
            }
            this.A0 = colorStateList;
            if (this.f14538e != null) {
                w0(false);
            }
        }
    }

    public void setMaxEms(int i10) {
        this.f14544h = i10;
        EditText editText = this.f14538e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f14548j = i10;
        EditText editText = this.f14538e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f14542g = i10;
        EditText editText = this.f14538e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f14546i = i10;
        EditText editText = this.f14538e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f14535c0 != 1) {
            setEndIconMode(1);
        } else if (z10) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f14543g0 = colorStateList;
        com.google.android.material.textfield.f.a(this, this.f14539e0, colorStateList, this.f14545h0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f14545h0 = mode;
        com.google.android.material.textfield.f.a(this, this.f14539e0, this.f14543g0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f14563t == null) {
            c0 c0Var = new c0(getContext());
            this.f14563t = c0Var;
            c0Var.setId(d5.f.N);
            a0.A0(this.f14563t, 2);
            a1.d z10 = z();
            this.f14566w = z10;
            z10.b0(67L);
            this.f14567x = z();
            setPlaceholderTextAppearance(this.f14565v);
            setPlaceholderTextColor(this.f14564u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f14562s) {
                setPlaceholderTextEnabled(true);
            }
            this.f14561r = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f14565v = i10;
        TextView textView = this.f14563t;
        if (textView != null) {
            androidx.core.widget.j.n(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f14564u != colorStateList) {
            this.f14564u = colorStateList;
            TextView textView = this.f14563t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f14532b.k(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f14532b.l(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f14532b.m(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f14532b.n(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f14532b.q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f14532b.r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f14532b.s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f14532b.t(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f14532b.u(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.B.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i10) {
        androidx.core.widget.j.n(this.B, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f14538e;
        if (editText != null) {
            a0.q0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.V) {
            this.V = typeface;
            this.L0.j0(typeface);
            this.f14550k.L(typeface);
            TextView textView = this.f14558o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w0(boolean z10) {
        x0(z10, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f14539e0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f14539e0.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.f.a(this, this.f14539e0, this.f14543g0, this.f14545h0);
            U();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f14532b.o(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f14532b.p(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f14557n0.setImageDrawable(drawable);
        u0();
        com.google.android.material.textfield.f.a(this, this.f14557n0, this.f14568x0, this.f14570y0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f14539e0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f14539e0.setImageDrawable(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
