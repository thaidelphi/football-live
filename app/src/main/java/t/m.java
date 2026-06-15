package t;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RunGroup.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m {

    /* renamed from: h  reason: collision with root package name */
    public static int f30870h;

    /* renamed from: c  reason: collision with root package name */
    p f30873c;

    /* renamed from: d  reason: collision with root package name */
    p f30874d;

    /* renamed from: f  reason: collision with root package name */
    int f30876f;

    /* renamed from: g  reason: collision with root package name */
    int f30877g;

    /* renamed from: a  reason: collision with root package name */
    public int f30871a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30872b = false;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<p> f30875e = new ArrayList<>();

    public m(p pVar, int i10) {
        this.f30873c = null;
        this.f30874d = null;
        this.f30876f = 0;
        int i11 = f30870h;
        this.f30876f = i11;
        f30870h = i11 + 1;
        this.f30873c = pVar;
        this.f30874d = pVar;
        this.f30877g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f30848d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f30855k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f30855k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f30848d != pVar) {
                    j11 = Math.min(j11, c(fVar2, fVar2.f30850f + j10));
                }
            }
        }
        if (fVar == pVar.f30904i) {
            long j12 = j10 - pVar.j();
            return Math.min(Math.min(j11, c(pVar.f30903h, j12)), j12 - pVar.f30903h.f30850f);
        }
        return j11;
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f30848d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f30855k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f30855k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f30848d != pVar) {
                    j11 = Math.max(j11, d(fVar2, fVar2.f30850f + j10));
                }
            }
        }
        if (fVar == pVar.f30903h) {
            long j12 = j10 + pVar.j();
            return Math.max(Math.max(j11, d(pVar.f30904i, j12)), j12 - pVar.f30904i.f30850f);
        }
        return j11;
    }

    public void a(p pVar) {
        this.f30875e.add(pVar);
        this.f30874d = pVar;
    }

    public long b(s.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f30873c;
        if (pVar instanceof c) {
            if (((c) pVar).f30901f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f30535e : fVar.f30537f).f30903h;
        f fVar3 = (i10 == 0 ? fVar.f30535e : fVar.f30537f).f30904i;
        boolean contains = pVar.f30903h.f30856l.contains(fVar2);
        boolean contains2 = this.f30873c.f30904i.f30856l.contains(fVar3);
        long j11 = this.f30873c.j();
        if (contains && contains2) {
            long d10 = d(this.f30873c.f30903h, 0L);
            long c10 = c(this.f30873c.f30904i, 0L);
            long j12 = d10 - j11;
            p pVar2 = this.f30873c;
            int i12 = pVar2.f30904i.f30850f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = pVar2.f30903h.f30850f;
            long j13 = ((-c10) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float o10 = pVar2.f30897b.o(i10);
            float f10 = (float) (o10 > 0.0f ? (((float) j13) / o10) + (((float) j12) / (1.0f - o10)) : 0L);
            long j14 = (f10 * o10) + 0.5f + j11 + (f10 * (1.0f - o10)) + 0.5f;
            p pVar3 = this.f30873c;
            j10 = pVar3.f30903h.f30850f + j14;
            i11 = pVar3.f30904i.f30850f;
        } else if (contains) {
            f fVar4 = this.f30873c.f30903h;
            return Math.max(d(fVar4, fVar4.f30850f), this.f30873c.f30903h.f30850f + j11);
        } else if (contains2) {
            f fVar5 = this.f30873c.f30904i;
            return Math.max(-c(fVar5, fVar5.f30850f), (-this.f30873c.f30904i.f30850f) + j11);
        } else {
            p pVar4 = this.f30873c;
            j10 = pVar4.f30903h.f30850f + pVar4.j();
            i11 = this.f30873c.f30904i.f30850f;
        }
        return j10 - i11;
    }
}
