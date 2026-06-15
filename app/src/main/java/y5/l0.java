package y5;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableSet.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class l0<E> extends s<E> {

    /* renamed from: h  reason: collision with root package name */
    private static final Object[] f33234h;

    /* renamed from: i  reason: collision with root package name */
    static final l0<Object> f33235i;

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f33236c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f33237d;

    /* renamed from: e  reason: collision with root package name */
    final transient Object[] f33238e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f33239f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f33240g;

    static {
        Object[] objArr = new Object[0];
        f33234h = objArr;
        f33235i = new l0<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f33236c = objArr;
        this.f33237d = i10;
        this.f33238e = objArr2;
        this.f33239f = i11;
        this.f33240g = i12;
    }

    @Override // y5.o
    int b(Object[] objArr, int i10) {
        System.arraycopy(this.f33236c, 0, objArr, i10, this.f33240g);
        return i10 + this.f33240g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y5.o
    public Object[] c() {
        return this.f33236c;
    }

    @Override // y5.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f33238e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b10 = n.b(obj);
        while (true) {
            int i10 = b10 & this.f33239f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b10 = i10 + 1;
        }
    }

    @Override // y5.o
    int d() {
        return this.f33240g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y5.o
    public int e() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y5.o
    public boolean f() {
        return false;
    }

    @Override // y5.s, y5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public s0<E> iterator() {
        return a().iterator();
    }

    @Override // y5.s, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f33237d;
    }

    @Override // y5.s
    q<E> l() {
        return q.i(this.f33236c, this.f33240g);
    }

    @Override // y5.s
    boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f33240g;
    }
}
