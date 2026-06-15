package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class O4<K, V> extends AbstractC2162oY<Map.Entry<K, V>, V> {
    public O4(Iterator backingIterator) {
        super(backingIterator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC2162oY
    @ParametricNullness
    /* renamed from: A00 */
    public final V A01(Map.Entry<K, V> entry) {
        return entry.getValue();
    }
}
