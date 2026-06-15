package y8;
/* compiled from: PrimitiveRanges.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f extends d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f33338e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final f f33339f = new f(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public f(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public boolean d(long j10) {
        return a() <= j10 && j10 <= b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (a() != fVar.a() || b() != fVar.b()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (a() ^ (a() >>> 32))) + (b() ^ (b() >>> 32)));
    }

    public boolean isEmpty() {
        return a() > b();
    }

    public String toString() {
        return a() + ".." + b();
    }
}
