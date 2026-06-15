package y5;

import java.util.Comparator;
/* compiled from: ComparisonChain.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    private static final k f33216a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final k f33217b = new b(-1);

    /* renamed from: c  reason: collision with root package name */
    private static final k f33218c = new b(1);

    /* compiled from: ComparisonChain.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends k {
        a() {
            super(null);
        }

        @Override // y5.k
        public k d(int i10, int i11) {
            return j(a6.b.e(i10, i11));
        }

        @Override // y5.k
        public <T> k e(T t10, T t11, Comparator<T> comparator) {
            return j(comparator.compare(t10, t11));
        }

        @Override // y5.k
        public k f(boolean z10, boolean z11) {
            return j(a6.a.a(z10, z11));
        }

        @Override // y5.k
        public k g(boolean z10, boolean z11) {
            return j(a6.a.a(z11, z10));
        }

        @Override // y5.k
        public int h() {
            return 0;
        }

        k j(int i10) {
            if (i10 < 0) {
                return k.f33217b;
            }
            return i10 > 0 ? k.f33218c : k.f33216a;
        }
    }

    /* compiled from: ComparisonChain.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class b extends k {

        /* renamed from: d  reason: collision with root package name */
        final int f33219d;

        b(int i10) {
            super(null);
            this.f33219d = i10;
        }

        @Override // y5.k
        public k d(int i10, int i11) {
            return this;
        }

        @Override // y5.k
        public <T> k e(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // y5.k
        public k f(boolean z10, boolean z11) {
            return this;
        }

        @Override // y5.k
        public k g(boolean z10, boolean z11) {
            return this;
        }

        @Override // y5.k
        public int h() {
            return this.f33219d;
        }
    }

    /* synthetic */ k(a aVar) {
        this();
    }

    public static k i() {
        return f33216a;
    }

    public abstract k d(int i10, int i11);

    public abstract <T> k e(T t10, T t11, Comparator<T> comparator);

    public abstract k f(boolean z10, boolean z11);

    public abstract k g(boolean z10, boolean z11);

    public abstract int h();

    private k() {
    }
}
