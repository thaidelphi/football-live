package y8;
/* compiled from: PrimitiveRanges.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c extends y8.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f33328e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final c f33329f = new c(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final c a() {
            return c.f33329f;
        }
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // y8.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (a() != cVar.a() || b() != cVar.b()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean f(int i10) {
        return a() <= i10 && i10 <= b();
    }

    public Integer g() {
        return Integer.valueOf(b());
    }

    public Integer h() {
        return Integer.valueOf(a());
    }

    @Override // y8.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // y8.a
    public boolean isEmpty() {
        return a() > b();
    }

    @Override // y8.a
    public String toString() {
        return a() + ".." + b();
    }
}
