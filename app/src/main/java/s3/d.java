package s3;
/* compiled from: ConstantBitrateSeekMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d implements q {

    /* renamed from: a  reason: collision with root package name */
    private final long f30691a;

    /* renamed from: b  reason: collision with root package name */
    private final long f30692b;

    /* renamed from: c  reason: collision with root package name */
    private final int f30693c;

    /* renamed from: d  reason: collision with root package name */
    private final long f30694d;

    /* renamed from: e  reason: collision with root package name */
    private final int f30695e;

    /* renamed from: f  reason: collision with root package name */
    private final long f30696f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f30697g;

    public d(long j10, long j11, int i10, int i11, boolean z10) {
        this.f30691a = j10;
        this.f30692b = j11;
        this.f30693c = i11 == -1 ? 1 : i11;
        this.f30695e = i10;
        this.f30697g = z10;
        if (j10 == -1) {
            this.f30694d = -1L;
            this.f30696f = -9223372036854775807L;
            return;
        }
        this.f30694d = j10 - j11;
        this.f30696f = f(j10, j11, i10);
    }

    private static long f(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / i10;
    }

    @Override // s3.q
    public boolean c() {
        return this.f30694d != -1 || this.f30697g;
    }

    @Override // s3.q
    public long d() {
        return this.f30696f;
    }

    public long e(long j10) {
        return f(j10, this.f30692b, this.f30695e);
    }
}
