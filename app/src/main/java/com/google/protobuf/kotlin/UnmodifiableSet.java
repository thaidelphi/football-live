package com.google.protobuf.kotlin;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.n;
/* compiled from: UnmodifiableCollections.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class UnmodifiableSet<E> extends UnmodifiableCollection<E> implements Set<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableSet(Collection<? extends E> delegate) {
        super(delegate);
        n.f(delegate, "delegate");
    }
}
