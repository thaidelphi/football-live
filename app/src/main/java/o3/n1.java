package o3;

import android.util.Base64;
import e4.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import n3.l3;
import o3.c;
import o3.p1;
/* compiled from: DefaultPlaybackSessionManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n1 implements p1 {

    /* renamed from: h  reason: collision with root package name */
    public static final x5.k<String> f29258h = new x5.k() { // from class: o3.m1
        @Override // x5.k
        public final Object get() {
            String k10;
            k10 = n1.k();
            return k10;
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private static final Random f29259i = new Random();

    /* renamed from: a  reason: collision with root package name */
    private final l3.d f29260a;

    /* renamed from: b  reason: collision with root package name */
    private final l3.b f29261b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, a> f29262c;

    /* renamed from: d  reason: collision with root package name */
    private final x5.k<String> f29263d;

    /* renamed from: e  reason: collision with root package name */
    private p1.a f29264e;

    /* renamed from: f  reason: collision with root package name */
    private l3 f29265f;

    /* renamed from: g  reason: collision with root package name */
    private String f29266g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultPlaybackSessionManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f29267a;

        /* renamed from: b  reason: collision with root package name */
        private int f29268b;

        /* renamed from: c  reason: collision with root package name */
        private long f29269c;

        /* renamed from: d  reason: collision with root package name */
        private t.b f29270d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f29271e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f29272f;

        public a(String str, int i10, t.b bVar) {
            this.f29267a = str;
            this.f29268b = i10;
            this.f29269c = bVar == null ? -1L : bVar.f25142d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f29270d = bVar;
        }

        private int l(l3 l3Var, l3 l3Var2, int i10) {
            if (i10 < l3Var.t()) {
                l3Var.r(i10, n1.this.f29260a);
                for (int i11 = n1.this.f29260a.f28160o; i11 <= n1.this.f29260a.f28161p; i11++) {
                    int f10 = l3Var2.f(l3Var.q(i11));
                    if (f10 != -1) {
                        return l3Var2.j(f10, n1.this.f29261b).f28133c;
                    }
                }
                return -1;
            } else if (i10 < l3Var2.t()) {
                return i10;
            } else {
                return -1;
            }
        }

        public boolean i(int i10, t.b bVar) {
            if (bVar == null) {
                return i10 == this.f29268b;
            }
            t.b bVar2 = this.f29270d;
            return bVar2 == null ? !bVar.b() && bVar.f25142d == this.f29269c : bVar.f25142d == bVar2.f25142d && bVar.f25140b == bVar2.f25140b && bVar.f25141c == bVar2.f25141c;
        }

        public boolean j(c.a aVar) {
            t.b bVar = aVar.f29154d;
            if (bVar == null) {
                return this.f29268b != aVar.f29153c;
            }
            long j10 = this.f29269c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f25142d > j10) {
                return true;
            }
            if (this.f29270d == null) {
                return false;
            }
            int f10 = aVar.f29152b.f(bVar.f25139a);
            int f11 = aVar.f29152b.f(this.f29270d.f25139a);
            t.b bVar2 = aVar.f29154d;
            if (bVar2.f25142d < this.f29270d.f25142d || f10 < f11) {
                return false;
            }
            if (f10 > f11) {
                return true;
            }
            if (bVar2.b()) {
                t.b bVar3 = aVar.f29154d;
                int i10 = bVar3.f25140b;
                int i11 = bVar3.f25141c;
                t.b bVar4 = this.f29270d;
                int i12 = bVar4.f25140b;
                if (i10 <= i12) {
                    return i10 == i12 && i11 > bVar4.f25141c;
                }
                return true;
            }
            int i13 = aVar.f29154d.f25143e;
            return i13 == -1 || i13 > this.f29270d.f25140b;
        }

        public void k(int i10, t.b bVar) {
            if (this.f29269c == -1 && i10 == this.f29268b && bVar != null) {
                this.f29269c = bVar.f25142d;
            }
        }

        public boolean m(l3 l3Var, l3 l3Var2) {
            int l10 = l(l3Var, l3Var2, this.f29268b);
            this.f29268b = l10;
            if (l10 == -1) {
                return false;
            }
            t.b bVar = this.f29270d;
            return bVar == null || l3Var2.f(bVar.f25139a) != -1;
        }
    }

    public n1() {
        this(f29258h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k() {
        byte[] bArr = new byte[12];
        f29259i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private a l(int i10, t.b bVar) {
        int i11;
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f29262c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f29269c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (i11 == 0 && ((a) a5.p0.j(aVar)).f29270d != null && aVar2.f29270d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar == null) {
            String str = this.f29263d.get();
            a aVar3 = new a(str, i10, bVar);
            this.f29262c.put(str, aVar3);
            return aVar3;
        }
        return aVar;
    }

    private void m(c.a aVar) {
        if (aVar.f29152b.u()) {
            this.f29266g = null;
            return;
        }
        a aVar2 = this.f29262c.get(this.f29266g);
        a l10 = l(aVar.f29153c, aVar.f29154d);
        this.f29266g = l10.f29267a;
        g(aVar);
        t.b bVar = aVar.f29154d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f29269c == aVar.f29154d.f25142d && aVar2.f29270d != null && aVar2.f29270d.f25140b == aVar.f29154d.f25140b && aVar2.f29270d.f25141c == aVar.f29154d.f25141c) {
            return;
        }
        t.b bVar2 = aVar.f29154d;
        this.f29264e.t0(aVar, l(aVar.f29153c, new t.b(bVar2.f25139a, bVar2.f25142d)).f29267a, l10.f29267a);
    }

    @Override // o3.p1
    public synchronized String a() {
        return this.f29266g;
    }

    @Override // o3.p1
    public synchronized String b(l3 l3Var, t.b bVar) {
        return l(l3Var.l(bVar.f25139a, this.f29261b).f28133c, bVar).f29267a;
    }

    @Override // o3.p1
    public synchronized void c(c.a aVar, int i10) {
        a5.a.e(this.f29264e);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.f29262c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.j(aVar)) {
                it.remove();
                if (next.f29271e) {
                    boolean equals = next.f29267a.equals(this.f29266g);
                    boolean z11 = z10 && equals && next.f29272f;
                    if (equals) {
                        this.f29266g = null;
                    }
                    this.f29264e.w(aVar, next.f29267a, z11);
                }
            }
        }
        m(aVar);
    }

    @Override // o3.p1
    public void d(p1.a aVar) {
        this.f29264e = aVar;
    }

    @Override // o3.p1
    public synchronized void e(c.a aVar) {
        a5.a.e(this.f29264e);
        l3 l3Var = this.f29265f;
        this.f29265f = aVar.f29152b;
        Iterator<a> it = this.f29262c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m(l3Var, this.f29265f) || next.j(aVar)) {
                it.remove();
                if (next.f29271e) {
                    if (next.f29267a.equals(this.f29266g)) {
                        this.f29266g = null;
                    }
                    this.f29264e.w(aVar, next.f29267a, false);
                }
            }
        }
        m(aVar);
    }

    @Override // o3.p1
    public synchronized void f(c.a aVar) {
        p1.a aVar2;
        this.f29266g = null;
        Iterator<a> it = this.f29262c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f29271e && (aVar2 = this.f29264e) != null) {
                aVar2.w(aVar, next.f29267a, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1 A[Catch: all -> 0x0118, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:11:0x0025, B:13:0x0030, B:16:0x003a, B:23:0x004b, B:25:0x0057, B:26:0x005d, B:28:0x0061, B:30:0x0067, B:32:0x0080, B:34:0x00db, B:36:0x00e1, B:38:0x00f7, B:40:0x0103, B:42:0x0109), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    @Override // o3.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void g(o3.c.a r25) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.n1.g(o3.c$a):void");
    }

    public n1(x5.k<String> kVar) {
        this.f29263d = kVar;
        this.f29260a = new l3.d();
        this.f29261b = new l3.b();
        this.f29262c = new HashMap<>();
        this.f29265f = l3.f28128a;
    }
}
