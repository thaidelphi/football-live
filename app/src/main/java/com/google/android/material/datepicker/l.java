package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
/* compiled from: PickerFragment.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class l<S> extends Fragment {

    /* renamed from: b0  reason: collision with root package name */
    protected final LinkedHashSet<k<S>> f14222b0 = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean W1(k<S> kVar) {
        return this.f14222b0.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X1() {
        this.f14222b0.clear();
    }
}
