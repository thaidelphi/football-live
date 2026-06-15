package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nH  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public interface InterfaceC2098nH<K, V> {
    Map<K, Collection<V>> A47();

    boolean AGM(@ParametricNullness K key, @ParametricNullness V value);

    void clear();

    int size();

    Collection<V> values();
}
