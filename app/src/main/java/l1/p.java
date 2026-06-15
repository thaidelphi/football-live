package l1;

import androidx.work.z;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* compiled from: WorkSpec.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p {

    /* renamed from: s  reason: collision with root package name */
    private static final String f27430s = androidx.work.p.f("WorkSpec");

    /* renamed from: t  reason: collision with root package name */
    public static final m.a<List<c>, List<z>> f27431t = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f27432a;

    /* renamed from: b  reason: collision with root package name */
    public z.a f27433b;

    /* renamed from: c  reason: collision with root package name */
    public String f27434c;

    /* renamed from: d  reason: collision with root package name */
    public String f27435d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.e f27436e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.work.e f27437f;

    /* renamed from: g  reason: collision with root package name */
    public long f27438g;

    /* renamed from: h  reason: collision with root package name */
    public long f27439h;

    /* renamed from: i  reason: collision with root package name */
    public long f27440i;

    /* renamed from: j  reason: collision with root package name */
    public androidx.work.c f27441j;

    /* renamed from: k  reason: collision with root package name */
    public int f27442k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.work.a f27443l;

    /* renamed from: m  reason: collision with root package name */
    public long f27444m;

    /* renamed from: n  reason: collision with root package name */
    public long f27445n;

    /* renamed from: o  reason: collision with root package name */
    public long f27446o;

    /* renamed from: p  reason: collision with root package name */
    public long f27447p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f27448q;

    /* renamed from: r  reason: collision with root package name */
    public androidx.work.t f27449r;

    /* compiled from: WorkSpec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements m.a<List<c>, List<z>> {
        a() {
        }

        @Override // m.a
        /* renamed from: a */
        public List<z> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (c cVar : list) {
                arrayList.add(cVar.a());
            }
            return arrayList;
        }
    }

    /* compiled from: WorkSpec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f27450a;

        /* renamed from: b  reason: collision with root package name */
        public z.a f27451b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f27451b != bVar.f27451b) {
                    return false;
                }
                return this.f27450a.equals(bVar.f27450a);
            }
            return false;
        }

        public int hashCode() {
            return (this.f27450a.hashCode() * 31) + this.f27451b.hashCode();
        }
    }

    /* compiled from: WorkSpec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f27452a;

        /* renamed from: b  reason: collision with root package name */
        public z.a f27453b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.work.e f27454c;

        /* renamed from: d  reason: collision with root package name */
        public int f27455d;

        /* renamed from: e  reason: collision with root package name */
        public List<String> f27456e;

        /* renamed from: f  reason: collision with root package name */
        public List<androidx.work.e> f27457f;

        public z a() {
            androidx.work.e eVar;
            List<androidx.work.e> list = this.f27457f;
            if (list != null && !list.isEmpty()) {
                eVar = this.f27457f.get(0);
            } else {
                eVar = androidx.work.e.f4645c;
            }
            return new z(UUID.fromString(this.f27452a), this.f27453b, this.f27454c, this.f27456e, eVar, this.f27455d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f27455d != cVar.f27455d) {
                    return false;
                }
                String str = this.f27452a;
                if (str == null ? cVar.f27452a == null : str.equals(cVar.f27452a)) {
                    if (this.f27453b != cVar.f27453b) {
                        return false;
                    }
                    androidx.work.e eVar = this.f27454c;
                    if (eVar == null ? cVar.f27454c == null : eVar.equals(cVar.f27454c)) {
                        List<String> list = this.f27456e;
                        if (list == null ? cVar.f27456e == null : list.equals(cVar.f27456e)) {
                            List<androidx.work.e> list2 = this.f27457f;
                            List<androidx.work.e> list3 = cVar.f27457f;
                            return list2 != null ? list2.equals(list3) : list3 == null;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f27452a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            z.a aVar = this.f27453b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            androidx.work.e eVar = this.f27454c;
            int hashCode3 = (((hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f27455d) * 31;
            List<String> list = this.f27456e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.e> list2 = this.f27457f;
            return hashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public p(String str, String str2) {
        this.f27433b = z.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f4645c;
        this.f27436e = eVar;
        this.f27437f = eVar;
        this.f27441j = androidx.work.c.f4623i;
        this.f27443l = androidx.work.a.EXPONENTIAL;
        this.f27444m = 30000L;
        this.f27447p = -1L;
        this.f27449r = androidx.work.t.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f27432a = str;
        this.f27434c = str2;
    }

    public long a() {
        long scalb;
        if (c()) {
            if (this.f27443l == androidx.work.a.LINEAR) {
                scalb = this.f27444m * this.f27442k;
            } else {
                scalb = Math.scalb((float) this.f27444m, this.f27442k - 1);
            }
            return this.f27445n + Math.min(18000000L, scalb);
        }
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.f27445n;
            long j11 = j10 == 0 ? currentTimeMillis + this.f27438g : j10;
            long j12 = this.f27440i;
            long j13 = this.f27439h;
            if (j12 != j13) {
                return j11 + j13 + (j10 == 0 ? j12 * (-1) : 0L);
            }
            return j11 + (j10 != 0 ? j13 : 0L);
        }
        long j14 = this.f27445n;
        if (j14 == 0) {
            j14 = System.currentTimeMillis();
        }
        return j14 + this.f27438g;
    }

    public boolean b() {
        return !androidx.work.c.f4623i.equals(this.f27441j);
    }

    public boolean c() {
        return this.f27433b == z.a.ENQUEUED && this.f27442k > 0;
    }

    public boolean d() {
        return this.f27439h != 0;
    }

    public void e(long j10) {
        if (j10 < 900000) {
            androidx.work.p.c().h(f27430s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j10 = 900000;
        }
        f(j10, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f27438g == pVar.f27438g && this.f27439h == pVar.f27439h && this.f27440i == pVar.f27440i && this.f27442k == pVar.f27442k && this.f27444m == pVar.f27444m && this.f27445n == pVar.f27445n && this.f27446o == pVar.f27446o && this.f27447p == pVar.f27447p && this.f27448q == pVar.f27448q && this.f27432a.equals(pVar.f27432a) && this.f27433b == pVar.f27433b && this.f27434c.equals(pVar.f27434c)) {
            String str = this.f27435d;
            if (str == null ? pVar.f27435d == null : str.equals(pVar.f27435d)) {
                return this.f27436e.equals(pVar.f27436e) && this.f27437f.equals(pVar.f27437f) && this.f27441j.equals(pVar.f27441j) && this.f27443l == pVar.f27443l && this.f27449r == pVar.f27449r;
            }
            return false;
        }
        return false;
    }

    public void f(long j10, long j11) {
        if (j10 < 900000) {
            androidx.work.p.c().h(f27430s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j10 = 900000;
        }
        if (j11 < 300000) {
            androidx.work.p.c().h(f27430s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            j11 = 300000;
        }
        if (j11 > j10) {
            androidx.work.p.c().h(f27430s, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j10)), new Throwable[0]);
            j11 = j10;
        }
        this.f27439h = j10;
        this.f27440i = j11;
    }

    public int hashCode() {
        int hashCode = ((((this.f27432a.hashCode() * 31) + this.f27433b.hashCode()) * 31) + this.f27434c.hashCode()) * 31;
        String str = this.f27435d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j10 = this.f27438g;
        long j11 = this.f27439h;
        long j12 = this.f27440i;
        long j13 = this.f27444m;
        long j14 = this.f27445n;
        long j15 = this.f27446o;
        long j16 = this.f27447p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f27436e.hashCode()) * 31) + this.f27437f.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f27441j.hashCode()) * 31) + this.f27442k) * 31) + this.f27443l.hashCode()) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f27448q ? 1 : 0)) * 31) + this.f27449r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f27432a + "}";
    }

    public p(p pVar) {
        this.f27433b = z.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f4645c;
        this.f27436e = eVar;
        this.f27437f = eVar;
        this.f27441j = androidx.work.c.f4623i;
        this.f27443l = androidx.work.a.EXPONENTIAL;
        this.f27444m = 30000L;
        this.f27447p = -1L;
        this.f27449r = androidx.work.t.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f27432a = pVar.f27432a;
        this.f27434c = pVar.f27434c;
        this.f27433b = pVar.f27433b;
        this.f27435d = pVar.f27435d;
        this.f27436e = new androidx.work.e(pVar.f27436e);
        this.f27437f = new androidx.work.e(pVar.f27437f);
        this.f27438g = pVar.f27438g;
        this.f27439h = pVar.f27439h;
        this.f27440i = pVar.f27440i;
        this.f27441j = new androidx.work.c(pVar.f27441j);
        this.f27442k = pVar.f27442k;
        this.f27443l = pVar.f27443l;
        this.f27444m = pVar.f27444m;
        this.f27445n = pVar.f27445n;
        this.f27446o = pVar.f27446o;
        this.f27447p = pVar.f27447p;
        this.f27448q = pVar.f27448q;
        this.f27449r = pVar.f27449r;
    }
}
