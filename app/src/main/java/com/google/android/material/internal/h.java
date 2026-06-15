package com.google.android.material.internal;

import android.widget.Checkable;
import com.google.android.material.internal.h;
/* compiled from: MaterialCheckable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface h<T extends h<T>> extends Checkable {

    /* compiled from: MaterialCheckable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a<C> {
        void a(C c10, boolean z10);
    }

    int getId();

    void setInternalOnCheckedChangeListener(a<T> aVar);
}
