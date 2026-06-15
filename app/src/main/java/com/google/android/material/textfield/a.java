package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends com.google.android.material.textfield.e {

    /* renamed from: e  reason: collision with root package name */
    private final TextWatcher f14583e;

    /* renamed from: f  reason: collision with root package name */
    private final View.OnFocusChangeListener f14584f;

    /* renamed from: g  reason: collision with root package name */
    private final TextInputLayout.f f14585g;

    /* renamed from: h  reason: collision with root package name */
    private final TextInputLayout.g f14586h;

    /* renamed from: i  reason: collision with root package name */
    private AnimatorSet f14587i;

    /* renamed from: j  reason: collision with root package name */
    private ValueAnimator f14588j;

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class C0191a implements TextWatcher {
        C0191a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f14631a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            a aVar = a.this;
            aVar.i(aVar.m());
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c implements TextInputLayout.f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.this.m());
            editText.setOnFocusChangeListener(a.this.f14584f);
            a aVar = a.this;
            aVar.f14633c.setOnFocusChangeListener(aVar.f14584f);
            editText.removeTextChangedListener(a.this.f14583e);
            editText.addTextChangedListener(a.this.f14583e);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d implements TextInputLayout.g {

        /* compiled from: ClearTextEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class RunnableC0192a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ EditText f14593a;

            RunnableC0192a(EditText editText) {
                this.f14593a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14593a.removeTextChangedListener(a.this.f14583e);
                a.this.i(true);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 2) {
                return;
            }
            editText.post(new RunnableC0192a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f14584f) {
                editText.setOnFocusChangeListener(null);
            }
            if (a.this.f14633c.getOnFocusChangeListener() == a.this.f14584f) {
                a.this.f14633c.setOnFocusChangeListener(null);
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f14631a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f14631a.U();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f14631a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f14631a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f14633c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f14633c.setScaleX(floatValue);
            a.this.f14633c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f14583e = new C0191a();
        this.f14584f = new b();
        this.f14585g = new c();
        this.f14586h = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z10) {
        boolean z11 = this.f14631a.K() == z10;
        if (z10 && !this.f14587i.isRunning()) {
            this.f14588j.cancel();
            this.f14587i.start();
            if (z11) {
                this.f14587i.end();
            }
        } else if (z10) {
        } else {
            this.f14587i.cancel();
            this.f14588j.start();
            if (z11) {
                this.f14588j.end();
            }
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(e5.a.f25169a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    private ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(e5.a.f25172d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    private void l() {
        ValueAnimator k10 = k();
        ValueAnimator j10 = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f14587i = animatorSet;
        animatorSet.playTogether(k10, j10);
        this.f14587i.addListener(new f());
        ValueAnimator j11 = j(1.0f, 0.0f);
        this.f14588j = j11;
        j11.addListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        EditText editText = this.f14631a.getEditText();
        return editText != null && (editText.hasFocus() || this.f14633c.hasFocus()) && editText.getText().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        TextInputLayout textInputLayout = this.f14631a;
        int i10 = this.f14634d;
        if (i10 == 0) {
            i10 = d5.e.f24034f;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f14631a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(d5.i.f24087e));
        this.f14631a.setEndIconCheckable(false);
        this.f14631a.setEndIconOnClickListener(new e());
        this.f14631a.g(this.f14585g);
        this.f14631a.h(this.f14586h);
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void c(boolean z10) {
        if (this.f14631a.getSuffixText() == null) {
            return;
        }
        i(z10);
    }
}
