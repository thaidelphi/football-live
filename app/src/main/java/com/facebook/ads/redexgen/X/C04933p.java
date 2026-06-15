package com.facebook.ads.redexgen.X;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* renamed from: com.facebook.ads.redexgen.X.3p  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C04933p<K, V> extends OG<Map.Entry<K, V>> {
    public final transient int A00;
    public final transient int A01;
    public final transient AbstractC2005lm<K, V> A02;
    public final transient Object[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3p != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    public C04933p(AbstractC2005lm<K, V> map, Object[] alternatingKeysAndValues, int keyOffset, int size) {
        this.A02 = map;
        this.A03 = alternatingKeysAndValues;
        this.A00 = keyOffset;
        this.A01 = size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3p != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
    public final int A0I(Object[] dst, int offset) {
        return A0J().A0I(dst, offset);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3p != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
    public final boolean A0K() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3p != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // com.facebook.ads.redexgen.X.OG
    public final OI<Map.Entry<K, V>> A0M() {
        return new OI<Map.Entry<K, V>>() { // from class: com.facebook.ads.redexgen.X.3q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.List
            /* renamed from: A00 */
            public final Map.Entry<K, V> get(int index) {
                int i10;
                Object[] objArr;
                int i11;
                Object[] objArr2;
                int i12;
                i10 = C04933p.this.A01;
                AbstractC1790iD.A00(index, i10);
                objArr = C04933p.this.A03;
                i11 = C04933p.this.A00;
                Object requireNonNull = Objects.requireNonNull(objArr[(index * 2) + i11]);
                objArr2 = C04933p.this.A03;
                i12 = C04933p.this.A00;
                return new AbstractMap.SimpleImmutableEntry(requireNonNull, Objects.requireNonNull(objArr2[(index * 2) + (i12 ^ 1)]));
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
            public final boolean A0K() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                int i10;
                i10 = C04933p.this.A01;
                return i10;
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3p != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: A0N */
    public final AbstractC2173oj<Map.Entry<K, V>> iterator() {
        return A0J().iterator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3p != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC1996ld, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) object;
            Object k10 = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.A02.get(k10));
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3p != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01;
    }
}
