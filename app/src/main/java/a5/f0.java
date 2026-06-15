package a5;
/* compiled from: Size.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f0 {

    /* renamed from: c  reason: collision with root package name */
    public static final f0 f423c = new f0(-1, -1);

    /* renamed from: a  reason: collision with root package name */
    private final int f424a;

    /* renamed from: b  reason: collision with root package name */
    private final int f425b;

    public f0(int i10, int i11) {
        a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f424a = i10;
        this.f425b = i11;
    }

    public int a() {
        return this.f425b;
    }

    public int b() {
        return this.f424a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return this.f424a == f0Var.f424a && this.f425b == f0Var.f425b;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f425b;
        int i11 = this.f424a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f424a + "x" + this.f425b;
    }
}
