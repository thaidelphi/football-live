package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;
/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: com.facebook.ads.redexgen.X.Ns  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0990Ns<E> extends AbstractC2135nv<E> {
    public final /* synthetic */ Set A00;
    public final /* synthetic */ Set A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0990Ns(final Set val$set1, final Set val$set2) {
        super(null);
        this.A00 = val$set1;
        this.A01 = val$set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: A00 */
    public final AbstractC2173oj<E> iterator() {
        return new On<E>() { // from class: com.facebook.ads.redexgen.X.30
            public final Iterator<? extends E> A00;
            public final Iterator<? extends E> A01;

            {
                this.A00 = C0990Ns.this.A00.iterator();
                this.A01 = C0990Ns.this.A01.iterator();
            }

            @Override // com.facebook.ads.redexgen.X.On
            @CheckForNull
            public final E A02() {
                if (this.A00.hasNext()) {
                    return this.A00.next();
                }
                while (this.A01.hasNext()) {
                    E next = this.A01.next();
                    if (!C0990Ns.this.A00.contains(next)) {
                        return next;
                    }
                }
                E e8 = A01();
                return e8;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object object) {
        return this.A00.contains(object) || this.A01.contains(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty() && this.A01.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int size = this.A00.size();
        for (E e8 : this.A01) {
            if (!this.A00.contains(e8)) {
                size++;
            }
        }
        return size;
    }
}
