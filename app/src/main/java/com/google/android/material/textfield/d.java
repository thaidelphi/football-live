package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.a0;
import com.google.android.material.internal.l;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class d extends com.google.android.material.textfield.e {

    /* renamed from: r  reason: collision with root package name */
    private static final boolean f14601r;

    /* renamed from: e  reason: collision with root package name */
    private final TextWatcher f14602e;

    /* renamed from: f  reason: collision with root package name */
    private final View.OnFocusChangeListener f14603f;

    /* renamed from: g  reason: collision with root package name */
    private final TextInputLayout.e f14604g;

    /* renamed from: h  reason: collision with root package name */
    private final TextInputLayout.f f14605h;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i  reason: collision with root package name */
    private final TextInputLayout.g f14606i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14607j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14608k;

    /* renamed from: l  reason: collision with root package name */
    private long f14609l;

    /* renamed from: m  reason: collision with root package name */
    private StateListDrawable f14610m;

    /* renamed from: n  reason: collision with root package name */
    private u5.g f14611n;

    /* renamed from: o  reason: collision with root package name */
    private AccessibilityManager f14612o;

    /* renamed from: p  reason: collision with root package name */
    private ValueAnimator f14613p;

    /* renamed from: q  reason: collision with root package name */
    private ValueAnimator f14614q;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends l {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class RunnableC0193a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f14616a;

            RunnableC0193a(AutoCompleteTextView autoCompleteTextView) {
                this.f14616a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f14616a.isPopupShowing();
                d.this.E(isPopupShowing);
                d.this.f14607j = isPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView y10 = d.y(d.this.f14631a.getEditText());
            if (d.this.f14612o.isTouchExplorationEnabled() && d.D(y10) && !d.this.f14633c.hasFocus()) {
                y10.dismissDropDown();
            }
            y10.post(new RunnableC0193a(y10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f14633c.setChecked(dVar.f14608k);
            d.this.f14614q.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f14633c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class View$OnFocusChangeListenerC0194d implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC0194d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            d.this.f14631a.setEndIconActivated(z10);
            if (z10) {
                return;
            }
            d.this.E(false);
            d.this.f14607j = false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class e extends TextInputLayout.e {
        e(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            if (!d.D(d.this.f14631a.getEditText())) {
                cVar.X(Spinner.class.getName());
            }
            if (cVar.K()) {
                cVar.h0(null);
            }
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView y10 = d.y(d.this.f14631a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.f14612o.isEnabled() && !d.D(d.this.f14631a.getEditText())) {
                d.this.H(y10);
                d.this.I();
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class f implements TextInputLayout.f {
        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView y10 = d.y(textInputLayout.getEditText());
            d.this.F(y10);
            d.this.v(y10);
            d.this.G(y10);
            y10.setThreshold(0);
            y10.removeTextChangedListener(d.this.f14602e);
            y10.addTextChangedListener(d.this.f14602e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!d.D(y10) && d.this.f14612o.isTouchExplorationEnabled()) {
                a0.A0(d.this.f14633c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f14604g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class g implements TextInputLayout.g {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f14624a;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f14624a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14624a.removeTextChangedListener(d.this.f14602e);
            }
        }

        g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i10 != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f14603f) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (d.f14601r) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.H((AutoCompleteTextView) d.this.f14631a.getEditText());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class i implements AccessibilityManager.TouchExplorationStateChangeListener {
        i() {
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            if (d.this.f14631a.getEditText() == null || d.D(d.this.f14631a.getEditText())) {
                return;
            }
            a0.A0(d.this.f14633c, z10 ? 2 : 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class j implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f14628a;

        j(AutoCompleteTextView autoCompleteTextView) {
            this.f14628a = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.C()) {
                    d.this.f14607j = false;
                }
                d.this.H(this.f14628a);
                d.this.I();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class k implements AutoCompleteTextView.OnDismissListener {
        k() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.I();
            d.this.E(false);
        }
    }

    static {
        f14601r = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f14602e = new a();
        this.f14603f = new View$OnFocusChangeListenerC0194d();
        this.f14604g = new e(this.f14631a);
        this.f14605h = new f();
        this.f14606i = new g();
        this.f14607j = false;
        this.f14608k = false;
        this.f14609l = Long.MAX_VALUE;
    }

    private u5.g A(float f10, float f11, float f12, int i10) {
        u5.k m7 = u5.k.a().A(f10).E(f10).s(f11).w(f11).m();
        u5.g m10 = u5.g.m(this.f14632b, f12);
        m10.setShapeAppearanceModel(m7);
        m10.Z(0, i10, 0, i10);
        return m10;
    }

    private void B() {
        this.f14614q = z(67, 0.0f, 1.0f);
        ValueAnimator z10 = z(50, 1.0f, 0.0f);
        this.f14613p = z10;
        z10.addListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f14609l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z10) {
        if (this.f14608k != z10) {
            this.f14608k = z10;
            this.f14614q.cancel();
            this.f14613p.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(AutoCompleteTextView autoCompleteTextView) {
        if (f14601r) {
            int boxBackgroundMode = this.f14631a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f14611n);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f14610m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new j(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f14603f);
        if (f14601r) {
            autoCompleteTextView.setOnDismissListener(new k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.f14607j = false;
        }
        if (!this.f14607j) {
            if (f14601r) {
                E(!this.f14608k);
            } else {
                this.f14608k = !this.f14608k;
                this.f14633c.toggle();
            }
            if (this.f14608k) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.f14607j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        this.f14607j = true;
        this.f14609l = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(AutoCompleteTextView autoCompleteTextView) {
        if (D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f14631a.getBoxBackgroundMode();
        u5.g boxBackground = this.f14631a.getBoxBackground();
        int d10 = j5.a.d(autoCompleteTextView, d5.b.f23977g);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            x(autoCompleteTextView, d10, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            w(autoCompleteTextView, d10, iArr, boxBackground);
        }
    }

    private void w(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, u5.g gVar) {
        int boxBackgroundColor = this.f14631a.getBoxBackgroundColor();
        int[] iArr2 = {j5.a.h(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f14601r) {
            a0.u0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        u5.g gVar2 = new u5.g(gVar.D());
        gVar2.X(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int J = a0.J(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int I = a0.I(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        a0.u0(autoCompleteTextView, layerDrawable);
        a0.D0(autoCompleteTextView, J, paddingTop, I, paddingBottom);
    }

    private void x(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, u5.g gVar) {
        LayerDrawable layerDrawable;
        int d10 = j5.a.d(autoCompleteTextView, d5.b.f23981k);
        u5.g gVar2 = new u5.g(gVar.D());
        int h10 = j5.a.h(i10, d10, 0.1f);
        gVar2.X(new ColorStateList(iArr, new int[]{h10, 0}));
        if (f14601r) {
            gVar2.setTint(d10);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h10, d10});
            u5.g gVar3 = new u5.g(gVar.D());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        a0.u0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator z(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(e5.a.f25169a);
        ofFloat.setDuration(i10);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(AutoCompleteTextView autoCompleteTextView) {
        if (!D(autoCompleteTextView) && this.f14631a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            v(autoCompleteTextView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        float dimensionPixelOffset = this.f14632b.getResources().getDimensionPixelOffset(d5.d.N);
        float dimensionPixelOffset2 = this.f14632b.getResources().getDimensionPixelOffset(d5.d.K);
        int dimensionPixelOffset3 = this.f14632b.getResources().getDimensionPixelOffset(d5.d.L);
        u5.g A = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        u5.g A2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f14611n = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f14610m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.f14610m.addState(new int[0], A2);
        int i10 = this.f14634d;
        if (i10 == 0) {
            i10 = f14601r ? d5.e.f24032d : d5.e.f24033e;
        }
        this.f14631a.setEndIconDrawable(i10);
        TextInputLayout textInputLayout = this.f14631a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(d5.i.f24089g));
        this.f14631a.setEndIconOnClickListener(new h());
        this.f14631a.g(this.f14605h);
        this.f14631a.h(this.f14606i);
        B();
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f14632b.getSystemService("accessibility");
        this.f14612o = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityManager.addTouchExplorationStateChangeListener(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean b(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean d() {
        return true;
    }
}
