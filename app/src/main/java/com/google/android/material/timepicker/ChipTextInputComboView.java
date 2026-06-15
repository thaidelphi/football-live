package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;
import com.google.android.material.textfield.TextInputLayout;
import d5.f;
import d5.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    private final Chip f14684a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f14685b;

    /* renamed from: c  reason: collision with root package name */
    private final EditText f14686c;

    /* renamed from: d  reason: collision with root package name */
    private TextWatcher f14687d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f14688e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class b extends l {
        private b() {
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f14684a.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f14684a.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f14686c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f14684a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f14684a.setChecked(z10);
        this.f14686c.setVisibility(z10 ? 0 : 4);
        this.f14684a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            o.h(this.f14686c);
            if (TextUtils.isEmpty(this.f14686c.getText())) {
                return;
            }
            EditText editText = this.f14686c;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f14684a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f14684a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f14684a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(h.f24071g, (ViewGroup) this, false);
        this.f14684a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(h.f24072h, (ViewGroup) this, false);
        this.f14685b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f14686c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f14687d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f14688e = (TextView) findViewById(f.f24048m);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
