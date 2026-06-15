package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.ey  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1595ey {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T extends InterfaceC0973Nb> OI<T> A01(InterfaceC0972Na<T> interfaceC0972Na, List<Bundle> list) {
        C4T A01 = OI.A01();
        for (int i10 = 0; i10 < list.size(); i10++) {
            A01.A04(interfaceC0972Na.A6V((Bundle) AbstractC1589es.A01(list.get(i10))));
        }
        return A01.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Na != com.google.android.exoplayer2.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.Nb> */
    public static <T extends InterfaceC0973Nb> SparseArray<T> A00(InterfaceC0972Na<T> interfaceC0972Na, SparseArray<Bundle> bundleSparseArray) {
        SparseArray<T> sparseArray = new SparseArray<>(bundleSparseArray.size());
        for (int i10 = 0; i10 < bundleSparseArray.size(); i10++) {
            int i11 = bundleSparseArray.keyAt(i10);
            sparseArray.put(i11, interfaceC0972Na.A6V(bundleSparseArray.valueAt(i10)));
        }
        return sparseArray;
    }

    public static void A02(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) AbstractC1672gE.A0f(C1595ey.class.getClassLoader()));
        }
    }
}
