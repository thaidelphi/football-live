package y5;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NaturalOrdering.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e0 extends h0<Comparable<?>> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final e0 f33203a = new e0();

    private e0() {
    }

    @Override // y5.h0
    public <S extends Comparable<?>> h0<S> d() {
        return m0.f33241a;
    }

    @Override // y5.h0, java.util.Comparator
    /* renamed from: e */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        x5.g.i(comparable);
        x5.g.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
