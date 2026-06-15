package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
/* compiled from: AppCompatCheckBox.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends CheckBox implements androidx.core.widget.m, androidx.core.view.y {

    /* renamed from: a  reason: collision with root package name */
    private final j f1576a;

    /* renamed from: b  reason: collision with root package name */
    private final e f1577b;

    /* renamed from: c  reason: collision with root package name */
    private final b0 f1578c;

    /* renamed from: d  reason: collision with root package name */
    private n f1579d;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f24557r);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1579d == null) {
            this.f1579d = new n(this);
        }
        return this.f1579d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1577b;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1578c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        j jVar = this.f1576a;
        return jVar != null ? jVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1577b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1577b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.m
    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f1576a;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f1576a;
        if (jVar != null) {
            return jVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1577b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1577b;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f1576a;
        if (jVar != null) {
            jVar.f();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1577b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1577b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f1576a;
        if (jVar != null) {
            jVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f1576a;
        if (jVar != null) {
            jVar.h(mode);
        }
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        u0.a(this, getContext());
        j jVar = new j(this);
        this.f1576a = jVar;
        jVar.e(attributeSet, i10);
        e eVar = new e(this);
        this.f1577b = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1578c = b0Var;
        b0Var.m(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(f.a.b(getContext(), i10));
    }
}
