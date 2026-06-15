package y5;

import java.io.Serializable;
/* compiled from: ReverseNaturalOrdering.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class m0 extends h0<Comparable<?>> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final m0 f33241a = new m0();

    private m0() {
    }

    @Override // y5.h0
    public <S extends Comparable<?>> h0<S> d() {
        return h0.b();
    }

    @Override // y5.h0, java.util.Comparator
    /* renamed from: e */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        x5.g.i(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
