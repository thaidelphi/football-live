package n3;
/* compiled from: SeekParameters.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d3 {

    /* renamed from: c  reason: collision with root package name */
    public static final d3 f27931c;

    /* renamed from: d  reason: collision with root package name */
    public static final d3 f27932d;

    /* renamed from: e  reason: collision with root package name */
    public static final d3 f27933e;

    /* renamed from: f  reason: collision with root package name */
    public static final d3 f27934f;

    /* renamed from: g  reason: collision with root package name */
    public static final d3 f27935g;

    /* renamed from: a  reason: collision with root package name */
    public final long f27936a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27937b;

    static {
        d3 d3Var = new d3(0L, 0L);
        f27931c = d3Var;
        f27932d = new d3(Long.MAX_VALUE, Long.MAX_VALUE);
        f27933e = new d3(Long.MAX_VALUE, 0L);
        f27934f = new d3(0L, Long.MAX_VALUE);
        f27935g = d3Var;
    }

    public d3(long j10, long j11) {
        a5.a.a(j10 >= 0);
        a5.a.a(j11 >= 0);
        this.f27936a = j10;
        this.f27937b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f27936a;
        if (j13 == 0 && this.f27937b == 0) {
            return j10;
        }
        long U0 = a5.p0.U0(j10, j13, Long.MIN_VALUE);
        long b10 = a5.p0.b(j10, this.f27937b, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = U0 <= j11 && j11 <= b10;
        if (U0 > j12 || j12 > b10) {
            z10 = false;
        }
        return (z11 && z10) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z11 ? j11 : z10 ? j12 : U0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d3.class != obj.getClass()) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.f27936a == d3Var.f27936a && this.f27937b == d3Var.f27937b;
    }

    public int hashCode() {
        return (((int) this.f27936a) * 31) + ((int) this.f27937b);
    }
}
