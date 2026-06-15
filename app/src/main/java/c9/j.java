package c9;

import c9.a;
import kotlin.jvm.internal.n;
/* compiled from: TimeSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f5618a = new j();

    /* compiled from: TimeSource.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements c9.a {

        /* renamed from: a  reason: collision with root package name */
        private final long f5619a;

        private /* synthetic */ a(long j10) {
            this.f5619a = j10;
        }

        public static final /* synthetic */ a b(long j10) {
            return new a(j10);
        }

        public static long d(long j10) {
            return j10;
        }

        public static long f(long j10) {
            return h.f5616a.b(j10);
        }

        public static boolean g(long j10, Object obj) {
            return (obj instanceof a) && j10 == ((a) obj).l();
        }

        public static int h(long j10) {
            return androidx.privacysandbox.ads.adservices.topics.d.a(j10);
        }

        public static final long i(long j10, long j11) {
            return h.f5616a.a(j10, j11);
        }

        public static long j(long j10, c9.a other) {
            n.f(other, "other");
            if (other instanceof a) {
                return i(j10, ((a) other).l());
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) k(j10)) + " and " + other);
        }

        public static String k(long j10) {
            return "ValueTimeMark(reading=" + j10 + ')';
        }

        @Override // c9.i
        public long a() {
            return f(this.f5619a);
        }

        @Override // java.lang.Comparable
        /* renamed from: c */
        public int compareTo(c9.a aVar) {
            return a.C0111a.a(this, aVar);
        }

        @Override // c9.a
        public long e(c9.a other) {
            n.f(other, "other");
            return j(this.f5619a, other);
        }

        public boolean equals(Object obj) {
            return g(this.f5619a, obj);
        }

        public int hashCode() {
            return h(this.f5619a);
        }

        public final /* synthetic */ long l() {
            return this.f5619a;
        }

        public String toString() {
            return k(this.f5619a);
        }
    }

    private j() {
    }

    public long a() {
        return h.f5616a.c();
    }

    public String toString() {
        return h.f5616a.toString();
    }
}
