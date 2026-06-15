package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.z0;
import androidx.core.view.a0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StartCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class k extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final TextInputLayout f14676a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f14677b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f14678c;

    /* renamed from: d  reason: collision with root package name */
    private final CheckableImageButton f14679d;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f14680e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f14681f;

    /* renamed from: g  reason: collision with root package name */
    private View.OnLongClickListener f14682g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14683h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(TextInputLayout textInputLayout, z0 z0Var) {
        super(textInputLayout.getContext());
        this.f14676a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(d5.h.f24067c, (ViewGroup) this, false);
        this.f14679d = checkableImageButton;
        c0 c0Var = new c0(getContext());
        this.f14677b = c0Var;
        g(z0Var);
        f(z0Var);
        addView(checkableImageButton);
        addView(c0Var);
    }

    private void f(z0 z0Var) {
        this.f14677b.setVisibility(8);
        this.f14677b.setId(d5.f.O);
        this.f14677b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        a0.s0(this.f14677b, 1);
        l(z0Var.n(d5.k.f24166f6, 0));
        int i10 = d5.k.f24174g6;
        if (z0Var.s(i10)) {
            m(z0Var.c(i10));
        }
        k(z0Var.p(d5.k.f24158e6));
    }

    private void g(z0 z0Var) {
        if (r5.c.g(getContext())) {
            androidx.core.view.h.c((ViewGroup.MarginLayoutParams) this.f14679d.getLayoutParams(), 0);
        }
        q(null);
        r(null);
        int i10 = d5.k.f24206k6;
        if (z0Var.s(i10)) {
            this.f14680e = r5.c.b(getContext(), z0Var, i10);
        }
        int i11 = d5.k.f24214l6;
        if (z0Var.s(i11)) {
            this.f14681f = o.f(z0Var.k(i11, -1), null);
        }
        int i12 = d5.k.f24198j6;
        if (z0Var.s(i12)) {
            p(z0Var.g(i12));
            int i13 = d5.k.f24190i6;
            if (z0Var.s(i13)) {
                o(z0Var.p(i13));
            }
            n(z0Var.a(d5.k.f24182h6, true));
        }
    }

    private void x() {
        int i10 = (this.f14678c == null || this.f14683h) ? 8 : 0;
        setVisibility(this.f14679d.getVisibility() == 0 || i10 == 0 ? 0 : 8);
        this.f14677b.setVisibility(i10);
        this.f14676a.q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence a() {
        return this.f14678c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f14677b.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextView c() {
        return this.f14677b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence d() {
        return this.f14679d.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable e() {
        return this.f14679d.getDrawable();
    }

    boolean h() {
        return this.f14679d.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(boolean z10) {
        this.f14683h = z10;
        x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        f.c(this.f14676a, this.f14679d, this.f14680e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(CharSequence charSequence) {
        this.f14678c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f14677b.setText(charSequence);
        x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(int i10) {
        androidx.core.widget.j.n(this.f14677b, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(ColorStateList colorStateList) {
        this.f14677b.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean z10) {
        this.f14679d.setCheckable(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(CharSequence charSequence) {
        if (d() != charSequence) {
            this.f14679d.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Drawable drawable) {
        this.f14679d.setImageDrawable(drawable);
        if (drawable != null) {
            f.a(this.f14676a, this.f14679d, this.f14680e, this.f14681f);
            u(true);
            j();
            return;
        }
        u(false);
        q(null);
        r(null);
        o(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(View.OnClickListener onClickListener) {
        f.e(this.f14679d, onClickListener, this.f14682g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(View.OnLongClickListener onLongClickListener) {
        this.f14682g = onLongClickListener;
        f.f(this.f14679d, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(ColorStateList colorStateList) {
        if (this.f14680e != colorStateList) {
            this.f14680e = colorStateList;
            f.a(this.f14676a, this.f14679d, colorStateList, this.f14681f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(PorterDuff.Mode mode) {
        if (this.f14681f != mode) {
            this.f14681f = mode;
            f.a(this.f14676a, this.f14679d, this.f14680e, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(boolean z10) {
        if (h() != z10) {
            this.f14679d.setVisibility(z10 ? 0 : 8);
            w();
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(androidx.core.view.accessibility.c cVar) {
        if (this.f14677b.getVisibility() == 0) {
            cVar.i0(this.f14677b);
            cVar.u0(this.f14677b);
            return;
        }
        cVar.u0(this.f14679d);
    }

    void w() {
        EditText editText = this.f14676a.f14538e;
        if (editText == null) {
            return;
        }
        a0.D0(this.f14677b, h() ? 0 : a0.J(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(d5.d.f24024v), editText.getCompoundPaddingBottom());
    }
}
