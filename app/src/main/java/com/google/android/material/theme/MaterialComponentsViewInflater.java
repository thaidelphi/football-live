package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.h;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.v;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import g5.a;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class MaterialComponentsViewInflater extends h {
    @Override // androidx.appcompat.app.h
    protected d c(Context context, AttributeSet attributeSet) {
        return new com.google.android.material.textfield.h(context, attributeSet);
    }

    @Override // androidx.appcompat.app.h
    protected f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.h
    protected g e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.h
    protected v k(Context context, AttributeSet attributeSet) {
        return new q5.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.h
    protected c0 o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
