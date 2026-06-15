package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nM  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2103nM {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A01(@CheckForNull InterfaceC2098nH<?, ?> multimap, Object object) {
        if (object == multimap) {
            return true;
        }
        if (object instanceof InterfaceC2098nH) {
            return multimap.A47().equals(((InterfaceC2098nH) object).A47());
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iP != com.google.common.base.Supplier<? extends java.util.List<V>> */
    public static <K, V> OB<K, V> A00(final Map<K, Collection<V>> map, final InterfaceC1801iP<? extends List<V>> factory) {
        return new AbstractC04100j<K, V>(map, factory) { // from class: com.facebook.ads.redexgen.X.0Q
            public static final long serialVersionUID = 0;
            public transient InterfaceC1801iP<? extends List<V>> A00;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iP != com.google.common.base.Supplier<? extends java.util.List<V>> */
            {
                this.A00 = (InterfaceC1801iP) AbstractC1790iD.A04(factory);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            @Override // com.facebook.ads.redexgen.X.AbstractC0999Ob
            public final Map<K, Collection<V>> A00() {
                return A0J();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            @Override // com.facebook.ads.redexgen.X.AbstractC0999Ob
            public final Set<K> A02() {
                return A0K();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            @Override // com.facebook.ads.redexgen.X.C4U
            /* renamed from: A0M */
            public final List<V> A0D() {
                return this.A00.get();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
                stream.defaultReadObject();
                this.A00 = (InterfaceC1801iP) Objects.requireNonNull(stream.readObject());
                Map<K, Collection<V>> map2 = (Map) Objects.requireNonNull(stream.readObject());
                A0L(map2);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            private void writeObject(ObjectOutputStream stream) throws IOException {
                stream.defaultWriteObject();
                stream.writeObject(this.A00);
                stream.writeObject(A0I());
            }
        };
    }
}
