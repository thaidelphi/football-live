package com.google.protobuf.kotlin;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
/* compiled from: UnmodifiableCollections.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class UnmodifiableMapEntries<K, V> extends UnmodifiableCollection<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>> {
    private final Set<Map.Entry<K, V>> delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntries(Set<? extends Map.Entry<? extends K, ? extends V>> delegate) {
        super(delegate);
        n.f(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        final Iterator<Map.Entry<K, V>> it = this.delegate.iterator();
        return (Iterator<Map.Entry<? extends K, ? extends V>>) new Iterator<Map.Entry<? extends K, ? extends V>>(it) { // from class: com.google.protobuf.kotlin.UnmodifiableMapEntries$iterator$1
            private final /* synthetic */ Iterator<Map.Entry<K, V>> $$delegate_0;
            final /* synthetic */ Iterator<Map.Entry<K, V>> $itr;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$itr = it;
                this.$$delegate_0 = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.$$delegate_0.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return new UnmodifiableMapEntry(this.$itr.next());
            }
        };
    }

    public /* bridge */ boolean contains(Map.Entry<? extends Object, ? extends Object> entry) {
        return super.contains((UnmodifiableMapEntries<K, V>) entry);
    }
}
