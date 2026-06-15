package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: AppCompatTextView.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c0 extends TextView implements androidx.core.view.y, androidx.core.widget.n, androidx.core.widget.b {

    /* renamed from: a  reason: collision with root package name */
    private final e f1518a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f1519b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f1520c;

    /* renamed from: d  reason: collision with root package name */
    private n f1521d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1522e;

    /* renamed from: f  reason: collision with root package name */
    private Future<androidx.core.text.c> f1523f;

    public c0(Context context) {
        this(context, null);
    }

    private void d() {
        Future<androidx.core.text.c> future = this.f1523f;
        if (future != null) {
            try {
                this.f1523f = null;
                androidx.core.widget.j.m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private n getEmojiTextViewHelper() {
        if (this.f1521d == null) {
            this.f1521d = new n(this);
        }
        return this.f1521d;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1518a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f3016o0) {
            return super.getAutoSizeMaxTextSize();
        }
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            return b0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f3016o0) {
            return super.getAutoSizeMinTextSize();
        }
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            return b0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f3016o0) {
            return super.getAutoSizeStepGranularity();
        }
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            return b0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f3016o0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        b0 b0Var = this.f1519b;
        return b0Var != null ? b0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f3016o0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            return b0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.p(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.j.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.j.c(this);
    }

    @Override // androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1518a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1518a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1519b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1519b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT < 28 && (a0Var = this.f1520c) != null) {
            return a0Var.a();
        }
        return super.getTextClassifier();
    }

    public c.a getTextMetricsParamsCompat() {
        return androidx.core.widget.j.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1519b.r(this, onCreateInputConnection, editorInfo);
        return o.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.o(z10, i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        d();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        b0 b0Var = this.f1519b;
        if (b0Var == null || androidx.core.widget.b.f3016o0 || !b0Var.l()) {
            return;
        }
        this.f1519b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (androidx.core.widget.b.f3016o0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (androidx.core.widget.b.f3016o0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (androidx.core.widget.b.f3016o0) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1518a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1518a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            androidx.core.widget.j.j(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            androidx.core.widget.j.k(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.j.l(this, i10);
    }

    public void setPrecomputedText(androidx.core.text.c cVar) {
        androidx.core.widget.j.m(this, cVar);
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1518a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1518a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1519b.w(colorStateList);
        this.f1519b.b();
    }

    @Override // androidx.core.widget.n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1519b.x(mode);
        this.f1519b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT < 28 && (a0Var = this.f1520c) != null) {
            a0Var.b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.c> future) {
        this.f1523f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        androidx.core.widget.j.o(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (androidx.core.widget.b.f3016o0) {
            super.setTextSize(i10, f10);
            return;
        }
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f1522e) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i10 > 0) {
            typeface2 = androidx.core.graphics.e.a(getContext(), typeface, i10);
        }
        this.f1522e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f1522e = false;
        }
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        this.f1522e = false;
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1518a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1519b = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        this.f1520c = new a0(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? f.a.b(context, i10) : null, i11 != 0 ? f.a.b(context, i11) : null, i12 != 0 ? f.a.b(context, i12) : null, i13 != 0 ? f.a.b(context, i13) : null);
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? f.a.b(context, i10) : null, i11 != 0 ? f.a.b(context, i11) : null, i12 != 0 ? f.a.b(context, i12) : null, i13 != 0 ? f.a.b(context, i13) : null);
        b0 b0Var = this.f1519b;
        if (b0Var != null) {
            b0Var.p();
        }
    }
}
