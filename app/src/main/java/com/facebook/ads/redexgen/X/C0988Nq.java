package com.facebook.ads.redexgen.X;

import java.util.Set;
import javax.annotation.CheckForNull;
/* renamed from: com.facebook.ads.redexgen.X.Nq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0988Nq<E> extends C1950kp<E> implements Set<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Nq != com.google.common.collect.Sets$FilteredSet<E> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super E> */
    public C0988Nq(Set<E> unfiltered, InterfaceC1791iE<? super E> predicate) {
        super(unfiltered, predicate);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Nq != com.google.common.collect.Sets$FilteredSet<E> */
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object object) {
        return AbstractC2136nx.A09(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Nq != com.google.common.collect.Sets$FilteredSet<E> */
    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC2136nx.A00(this);
    }
}
