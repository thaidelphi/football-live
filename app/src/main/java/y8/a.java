package y8;

import j8.e0;
/* compiled from: Progressions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a implements Iterable<Integer> {

    /* renamed from: d  reason: collision with root package name */
    public static final C0394a f33320d = new C0394a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f33321a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33322b;

    /* renamed from: c  reason: collision with root package name */
    private final int f33323c;

    /* compiled from: Progressions.kt */
    /* renamed from: y8.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class C0394a {
        private C0394a() {
        }

        public /* synthetic */ C0394a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f33321a = i10;
            this.f33322b = o8.c.c(i10, i11, i12);
            this.f33323c = i12;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public final int a() {
        return this.f33321a;
    }

    public final int b() {
        return this.f33322b;
    }

    public final int c() {
        return this.f33323c;
    }

    @Override // java.lang.Iterable
    /* renamed from: d */
    public e0 iterator() {
        return new b(this.f33321a, this.f33322b, this.f33323c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f33321a != aVar.f33321a || this.f33322b != aVar.f33322b || this.f33323c != aVar.f33323c) {
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
        return (((this.f33321a * 31) + this.f33322b) * 31) + this.f33323c;
    }

    public boolean isEmpty() {
        if (this.f33323c > 0) {
            if (this.f33321a > this.f33322b) {
                return true;
            }
        } else if (this.f33321a < this.f33322b) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        if (this.f33323c > 0) {
            sb = new StringBuilder();
            sb.append(this.f33321a);
            sb.append("..");
            sb.append(this.f33322b);
            sb.append(" step ");
            i10 = this.f33323c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f33321a);
            sb.append(" downTo ");
            sb.append(this.f33322b);
            sb.append(" step ");
            i10 = -this.f33323c;
        }
        sb.append(i10);
        return sb.toString();
    }
}
