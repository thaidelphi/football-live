package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Add missing generic type declarations: [K0] */
/* renamed from: com.facebook.ads.redexgen.X.Nz  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0997Nz<K0> extends AbstractC2099nI<K0> {
    public final /* synthetic */ Comparator A00;

    public C0997Nz(final Comparator val$comparator) {
        this.A00 = val$comparator;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2099nI
    public final <K extends K0, V> Map<K, Collection<V>> A04() {
        return new TreeMap(this.A00);
    }
}
