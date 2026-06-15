package y5;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: Multimaps.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class c0 {

    /* compiled from: Multimaps.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static class a<K, V> extends c<K, V> {

        /* renamed from: f  reason: collision with root package name */
        transient x5.k<? extends List<V>> f33170f;

        a(Map<K, Collection<V>> map, x5.k<? extends List<V>> kVar) {
            super(map);
            this.f33170f = (x5.k) x5.g.i(kVar);
        }

        @Override // y5.f
        Map<K, Collection<V>> c() {
            return q();
        }

        @Override // y5.f
        Set<K> d() {
            return r();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y5.d
        /* renamed from: x */
        public List<V> o() {
            return this.f33170f.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(z<?, ?> zVar, Object obj) {
        if (obj == zVar) {
            return true;
        }
        if (obj instanceof z) {
            return zVar.a().equals(((z) obj).a());
        }
        return false;
    }

    public static <K, V> v<K, V> b(Map<K, Collection<V>> map, x5.k<? extends List<V>> kVar) {
        return new a(map, kVar);
    }
}
