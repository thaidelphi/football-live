package s3;

import com.ironsource.b9;
/* compiled from: SeekMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface q {

    /* compiled from: SeekMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final r f30720a;

        /* renamed from: b  reason: collision with root package name */
        public final r f30721b;

        public a(r rVar) {
            this(rVar, rVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30720a.equals(aVar.f30720a) && this.f30721b.equals(aVar.f30721b);
        }

        public int hashCode() {
            return (this.f30720a.hashCode() * 31) + this.f30721b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(b9.i.f16696d);
            sb.append(this.f30720a);
            if (this.f30720a.equals(this.f30721b)) {
                str = "";
            } else {
                str = ", " + this.f30721b;
            }
            sb.append(str);
            sb.append(b9.i.f16698e);
            return sb.toString();
        }

        public a(r rVar, r rVar2) {
            this.f30720a = (r) a5.a.e(rVar);
            this.f30721b = (r) a5.a.e(rVar2);
        }
    }

    /* compiled from: SeekMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements q {

        /* renamed from: a  reason: collision with root package name */
        private final long f30722a;

        /* renamed from: b  reason: collision with root package name */
        private final a f30723b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // s3.q
        public boolean c() {
            return false;
        }

        @Override // s3.q
        public long d() {
            return this.f30722a;
        }

        public b(long j10, long j11) {
            this.f30722a = j10;
            this.f30723b = new a(j11 == 0 ? r.f30724c : new r(0L, j11));
        }
    }

    boolean c();

    long d();
}
