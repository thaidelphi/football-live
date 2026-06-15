package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* compiled from: AppCompatCheckedTextView.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h extends CheckedTextView implements androidx.core.widget.l, androidx.core.view.y {

    /* renamed from: a  reason: collision with root package name */
    private final i f1581a;

    /* renamed from: b  reason: collision with root package name */
    private final e f1582b;

    /* renamed from: c  reason: collision with root package name */
    private final b0 f1583c;

    /* renamed from: d  reason: collision with root package name */
    private n f1584d;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f24558s);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1584d == null) {
            this.f1584d = new n(this);
        }
        return this.f1584d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        b0 b0Var = this.f1583c;
        if (b0Var != null) {
            b0Var.b();
        }
        e eVar = this.f1582b;
        if (eVar != null) {
            eVar.b();
        }
        i iVar = this.f1581a;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.p(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1582b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1582b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        i iVar = this.f1581a;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        i iVar = this.f1581a;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1582b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1582b;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        i iVar = this.f1581a;
        if (iVar != null) {
            iVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1582b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1582b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        i iVar = this.f1581a;
        if (iVar != null) {
            iVar.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        i iVar = this.f1581a;
        if (iVar != null) {
            iVar.g(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f1583c;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    public h(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        u0.a(this, getContext());
        b0 b0Var = new b0(this);
        this.f1583c = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        e eVar = new e(this);
        this.f1582b = eVar;
        eVar.e(attributeSet, i10);
        i iVar = new i(this);
        this.f1581a = iVar;
        iVar.d(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(f.a.b(getContext(), i10));
    }
}
