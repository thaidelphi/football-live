package y8;

import j8.f0;
/* compiled from: Progressions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class d implements Iterable<Long> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f33330d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final long f33331a;

    /* renamed from: b  reason: collision with root package name */
    private final long f33332b;

    /* renamed from: c  reason: collision with root package name */
    private final long f33333c;

    /* compiled from: Progressions.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public d(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 != Long.MIN_VALUE) {
            this.f33331a = j10;
            this.f33332b = o8.c.d(j10, j11, j12);
            this.f33333c = j12;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }

    public final long a() {
        return this.f33331a;
    }

    public final long b() {
        return this.f33332b;
    }

    @Override // java.lang.Iterable
    /* renamed from: c */
    public f0 iterator() {
        return new e(this.f33331a, this.f33332b, this.f33333c);
    }
}
