package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;
/* compiled from: MaxInputValidator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class a implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private int f14726a;

    public a(int i10) {
        this.f14726a = i10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i12, i13, charSequence.subSequence(i10, i11).toString());
            if (Integer.parseInt(sb.toString()) <= this.f14726a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
