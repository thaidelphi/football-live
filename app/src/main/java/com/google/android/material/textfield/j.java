package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.l;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class j extends e {

    /* renamed from: e  reason: collision with root package name */
    private final TextWatcher f14667e;

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout.f f14668f;

    /* renamed from: g  reason: collision with root package name */
    private final TextInputLayout.g f14669g;

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends l {
        a() {
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            j jVar = j.this;
            jVar.f14633c.setChecked(!jVar.g());
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            j jVar = j.this;
            jVar.f14633c.setChecked(!jVar.g());
            editText.removeTextChangedListener(j.this.f14667e);
            editText.addTextChangedListener(j.this.f14667e);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c implements TextInputLayout.g {

        /* compiled from: PasswordToggleEndIconDelegate.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ EditText f14673a;

            a(EditText editText) {
                this.f14673a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14673a.removeTextChangedListener(j.this.f14667e);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = j.this.f14631a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (j.this.g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            j.this.f14631a.U();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f14667e = new a();
        this.f14668f = new b();
        this.f14669g = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText editText = this.f14631a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        TextInputLayout textInputLayout = this.f14631a;
        int i10 = this.f14634d;
        if (i10 == 0) {
            i10 = d5.e.f24029a;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f14631a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(d5.i.f24098p));
        this.f14631a.setEndIconVisible(true);
        this.f14631a.setEndIconCheckable(true);
        this.f14631a.setEndIconOnClickListener(new d());
        this.f14631a.g(this.f14668f);
        this.f14631a.h(this.f14669g);
        EditText editText = this.f14631a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
