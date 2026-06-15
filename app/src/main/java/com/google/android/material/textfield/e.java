package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EndIconDelegate.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    TextInputLayout f14631a;

    /* renamed from: b  reason: collision with root package name */
    Context f14632b;

    /* renamed from: c  reason: collision with root package name */
    CheckableImageButton f14633c;

    /* renamed from: d  reason: collision with root package name */
    final int f14634d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(TextInputLayout textInputLayout, int i10) {
        this.f14631a = textInputLayout;
        this.f14632b = textInputLayout.getContext();
        this.f14633c = textInputLayout.getEndIconView();
        this.f14634d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i10) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return false;
    }
}
