package y5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: MultimapBuilder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class b0<K0, V0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultimapBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends d<K0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f33166a;

        a(Comparator comparator) {
            this.f33166a = comparator;
        }

        @Override // y5.b0.d
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f33166a);
        }
    }

    /* compiled from: MultimapBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class b<V> implements x5.k<List<V>>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final int f33167a;

        b(int i10) {
            this.f33167a = h.b(i10, "expectedValuesPerKey");
        }

        @Override // x5.k
        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f33167a);
        }
    }

    /* compiled from: MultimapBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class c<K0, V0> extends b0<K0, V0> {
        c() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> v<K, V> c();
    }

    /* compiled from: MultimapBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class d<K0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MultimapBuilder.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public class a extends c<K0, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f33168a;

            a(int i10) {
                this.f33168a = i10;
            }

            @Override // y5.b0.c
            public <K extends K0, V> v<K, V> c() {
                return c0.b(d.this.c(), new b(this.f33168a));
            }
        }

        d() {
        }

        public c<K0, Object> a() {
            return b(2);
        }

        public c<K0, Object> b(int i10) {
            h.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    /* synthetic */ b0(a0 a0Var) {
        this();
    }

    public static d<Comparable> a() {
        return b(h0.b());
    }

    public static <K0> d<K0> b(Comparator<K0> comparator) {
        x5.g.i(comparator);
        return new a(comparator);
    }

    private b0() {
    }
}
