package i8;
/* compiled from: KotlinVersion.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class e implements Comparable<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f26612e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final e f26613f = f.a();

    /* renamed from: a  reason: collision with root package name */
    private final int f26614a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26615b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26616c;

    /* renamed from: d  reason: collision with root package name */
    private final int f26617d;

    /* compiled from: KotlinVersion.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public e(int i10, int i11, int i12) {
        this.f26614a = i10;
        this.f26615b = i11;
        this.f26616c = i12;
        this.f26617d = b(i10, i11, i12);
    }

    private final int b(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new y8.c(0, 255).f(i10) && new y8.c(0, 255).f(i11) && new y8.c(0, 255).f(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(e other) {
        kotlin.jvm.internal.n.f(other, "other");
        return this.f26617d - other.f26617d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f26617d == eVar.f26617d;
    }

    public int hashCode() {
        return this.f26617d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26614a);
        sb.append('.');
        sb.append(this.f26615b);
        sb.append('.');
        sb.append(this.f26616c);
        return sb.toString();
    }
}
