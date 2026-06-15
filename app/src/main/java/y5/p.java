package y5;

import java.io.Serializable;
/* compiled from: ImmutableEntry.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class p<K, V> extends e<K, V> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final K f33247a;

    /* renamed from: b  reason: collision with root package name */
    final V f33248b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(K k10, V v10) {
        this.f33247a = k10;
        this.f33248b = v10;
    }

    @Override // y5.e, java.util.Map.Entry
    public final K getKey() {
        return this.f33247a;
    }

    @Override // y5.e, java.util.Map.Entry
    public final V getValue() {
        return this.f33248b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
