package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.core.view.a0;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndicatorViewController.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14635a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f14636b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f14637c;

    /* renamed from: d  reason: collision with root package name */
    private int f14638d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f14639e;

    /* renamed from: f  reason: collision with root package name */
    private Animator f14640f;

    /* renamed from: g  reason: collision with root package name */
    private final float f14641g;

    /* renamed from: h  reason: collision with root package name */
    private int f14642h;

    /* renamed from: i  reason: collision with root package name */
    private int f14643i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f14644j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14645k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f14646l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f14647m;

    /* renamed from: n  reason: collision with root package name */
    private int f14648n;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f14649o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f14650p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f14651q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f14652r;

    /* renamed from: s  reason: collision with root package name */
    private int f14653s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f14654t;

    /* renamed from: u  reason: collision with root package name */
    private Typeface f14655u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f14656a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f14657b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14658c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f14659d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f14656a = i10;
            this.f14657b = textView;
            this.f14658c = i11;
            this.f14659d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.f14642h = this.f14656a;
            g.this.f14640f = null;
            TextView textView = this.f14657b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f14658c == 1 && g.this.f14646l != null) {
                    g.this.f14646l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f14659d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f14659d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f14659d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = g.this.f14636b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public g(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f14635a = context;
        this.f14636b = textInputLayout;
        this.f14641g = context.getResources().getDimensionPixelSize(d5.d.f24010h);
    }

    private void C(int i10, int i11) {
        TextView m7;
        TextView m10;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (m10 = m(i11)) != null) {
            m10.setVisibility(0);
            m10.setAlpha(1.0f);
        }
        if (i10 != 0 && (m7 = m(i10)) != null) {
            m7.setVisibility(4);
            if (i10 == 1) {
                m7.setText((CharSequence) null);
            }
        }
        this.f14642h = i11;
    }

    private void K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void M(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean N(TextView textView, CharSequence charSequence) {
        return a0.U(this.f14636b) && this.f14636b.isEnabled() && !(this.f14643i == this.f14642h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void Q(int i10, int i11, boolean z10) {
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f14640f = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f14651q, this.f14652r, 2, i10, i11);
            i(arrayList, this.f14645k, this.f14646l, 1, i10, i11);
            e5.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            C(i10, i11);
        }
        this.f14636b.r0();
        this.f14636b.w0(z10);
        this.f14636b.E0();
    }

    private boolean g() {
        return (this.f14637c == null || this.f14636b.getEditText() == null) ? false : true;
    }

    private void i(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            list.add(j(textView, i12 == i10));
            if (i12 == i10) {
                list.add(k(textView));
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z10 ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(e5.a.f25169a);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f14641g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(e5.a.f25172d);
        return ofFloat;
    }

    private TextView m(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f14652r;
        }
        return this.f14646l;
    }

    private int u(boolean z10, int i10, int i11) {
        return z10 ? this.f14635a.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean x(int i10) {
        return (i10 != 1 || this.f14646l == null || TextUtils.isEmpty(this.f14644j)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f14651q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f14637c == null) {
            return;
        }
        if (y(i10) && (frameLayout = this.f14639e) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f14637c.removeView(textView);
        }
        int i11 = this.f14638d - 1;
        this.f14638d = i11;
        M(this.f14637c, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(CharSequence charSequence) {
        this.f14647m = charSequence;
        TextView textView = this.f14646l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(boolean z10) {
        if (this.f14645k == z10) {
            return;
        }
        h();
        if (z10) {
            c0 c0Var = new c0(this.f14635a);
            this.f14646l = c0Var;
            c0Var.setId(d5.f.L);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f14646l.setTextAlignment(5);
            }
            Typeface typeface = this.f14655u;
            if (typeface != null) {
                this.f14646l.setTypeface(typeface);
            }
            F(this.f14648n);
            G(this.f14649o);
            D(this.f14647m);
            this.f14646l.setVisibility(4);
            a0.s0(this.f14646l, 1);
            e(this.f14646l, 0);
        } else {
            v();
            B(this.f14646l, 0);
            this.f14646l = null;
            this.f14636b.r0();
            this.f14636b.E0();
        }
        this.f14645k = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(int i10) {
        this.f14648n = i10;
        TextView textView = this.f14646l;
        if (textView != null) {
            this.f14636b.d0(textView, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(ColorStateList colorStateList) {
        this.f14649o = colorStateList;
        TextView textView = this.f14646l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(int i10) {
        this.f14653s = i10;
        TextView textView = this.f14652r;
        if (textView != null) {
            androidx.core.widget.j.n(textView, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(boolean z10) {
        if (this.f14651q == z10) {
            return;
        }
        h();
        if (z10) {
            c0 c0Var = new c0(this.f14635a);
            this.f14652r = c0Var;
            c0Var.setId(d5.f.M);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 17) {
                this.f14652r.setTextAlignment(5);
            }
            Typeface typeface = this.f14655u;
            if (typeface != null) {
                this.f14652r.setTypeface(typeface);
            }
            this.f14652r.setVisibility(4);
            a0.s0(this.f14652r, 1);
            H(this.f14653s);
            J(this.f14654t);
            e(this.f14652r, 1);
            if (i10 >= 17) {
                this.f14652r.setAccessibilityDelegate(new b());
            }
        } else {
            w();
            B(this.f14652r, 1);
            this.f14652r = null;
            this.f14636b.r0();
            this.f14636b.E0();
        }
        this.f14651q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        this.f14654t = colorStateList;
        TextView textView = this.f14652r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(Typeface typeface) {
        if (typeface != this.f14655u) {
            this.f14655u = typeface;
            K(this.f14646l, typeface);
            K(this.f14652r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(CharSequence charSequence) {
        h();
        this.f14644j = charSequence;
        this.f14646l.setText(charSequence);
        int i10 = this.f14642h;
        if (i10 != 1) {
            this.f14643i = 1;
        }
        Q(i10, this.f14643i, N(this.f14646l, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(CharSequence charSequence) {
        h();
        this.f14650p = charSequence;
        this.f14652r.setText(charSequence);
        int i10 = this.f14642h;
        if (i10 != 2) {
            this.f14643i = 2;
        }
        Q(i10, this.f14643i, N(this.f14652r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(TextView textView, int i10) {
        if (this.f14637c == null && this.f14639e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f14635a);
            this.f14637c = linearLayout;
            linearLayout.setOrientation(0);
            this.f14636b.addView(this.f14637c, -1, -2);
            this.f14639e = new FrameLayout(this.f14635a);
            this.f14637c.addView(this.f14639e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f14636b.getEditText() != null) {
                f();
            }
        }
        if (y(i10)) {
            this.f14639e.setVisibility(0);
            this.f14639e.addView(textView);
        } else {
            this.f14637c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f14637c.setVisibility(0);
        this.f14638d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            EditText editText = this.f14636b.getEditText();
            boolean g10 = r5.c.g(this.f14635a);
            LinearLayout linearLayout = this.f14637c;
            int i10 = d5.d.f24022t;
            a0.D0(linearLayout, u(g10, i10, a0.J(editText)), u(g10, d5.d.f24023u, this.f14635a.getResources().getDimensionPixelSize(d5.d.f24021s)), u(g10, i10, a0.I(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f14640f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return x(this.f14643i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence n() {
        return this.f14647m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence o() {
        return this.f14644j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        TextView textView = this.f14646l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList q() {
        TextView textView = this.f14646l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence r() {
        return this.f14650p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View s() {
        return this.f14652r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t() {
        TextView textView = this.f14652r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        this.f14644j = null;
        h();
        if (this.f14642h == 1) {
            if (this.f14651q && !TextUtils.isEmpty(this.f14650p)) {
                this.f14643i = 2;
            } else {
                this.f14643i = 0;
            }
        }
        Q(this.f14642h, this.f14643i, N(this.f14646l, ""));
    }

    void w() {
        h();
        int i10 = this.f14642h;
        if (i10 == 2) {
            this.f14643i = 0;
        }
        Q(i10, this.f14643i, N(this.f14652r, ""));
    }

    boolean y(int i10) {
        return i10 == 0 || i10 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        return this.f14645k;
    }
}
