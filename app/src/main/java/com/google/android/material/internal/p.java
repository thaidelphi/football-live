package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;
/* compiled from: VisibilityAwareImageButton.java */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class p extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    private int f14466a;

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f14466a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f14466a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
