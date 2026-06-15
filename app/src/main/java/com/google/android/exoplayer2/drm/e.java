package com.google.android.exoplayer2.drm;

import a5.p0;
import a5.t;
import a5.x;
import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import n3.m1;
import o3.q1;
import y5.s0;
import z4.i0;
import z4.y;
/* compiled from: DefaultDrmSessionManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e implements l {

    /* renamed from: c  reason: collision with root package name */
    private final UUID f10474c;

    /* renamed from: d  reason: collision with root package name */
    private final p.c f10475d;

    /* renamed from: e  reason: collision with root package name */
    private final s f10476e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, String> f10477f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f10478g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f10479h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f10480i;

    /* renamed from: j  reason: collision with root package name */
    private final g f10481j;

    /* renamed from: k  reason: collision with root package name */
    private final i0 f10482k;

    /* renamed from: l  reason: collision with root package name */
    private final h f10483l;

    /* renamed from: m  reason: collision with root package name */
    private final long f10484m;

    /* renamed from: n  reason: collision with root package name */
    private final List<com.google.android.exoplayer2.drm.d> f10485n;

    /* renamed from: o  reason: collision with root package name */
    private final Set<f> f10486o;

    /* renamed from: p  reason: collision with root package name */
    private final Set<com.google.android.exoplayer2.drm.d> f10487p;

    /* renamed from: q  reason: collision with root package name */
    private int f10488q;

    /* renamed from: r  reason: collision with root package name */
    private p f10489r;

    /* renamed from: s  reason: collision with root package name */
    private com.google.android.exoplayer2.drm.d f10490s;

    /* renamed from: t  reason: collision with root package name */
    private com.google.android.exoplayer2.drm.d f10491t;

    /* renamed from: u  reason: collision with root package name */
    private Looper f10492u;

    /* renamed from: v  reason: collision with root package name */
    private Handler f10493v;

    /* renamed from: w  reason: collision with root package name */
    private int f10494w;

    /* renamed from: x  reason: collision with root package name */
    private byte[] f10495x;

    /* renamed from: y  reason: collision with root package name */
    private q1 f10496y;

    /* renamed from: z  reason: collision with root package name */
    volatile d f10497z;

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: d  reason: collision with root package name */
        private boolean f10501d;

        /* renamed from: f  reason: collision with root package name */
        private boolean f10503f;

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, String> f10498a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        private UUID f10499b = n3.i.f28007d;

        /* renamed from: c  reason: collision with root package name */
        private p.c f10500c = q.f10540d;

        /* renamed from: g  reason: collision with root package name */
        private i0 f10504g = new y();

        /* renamed from: e  reason: collision with root package name */
        private int[] f10502e = new int[0];

        /* renamed from: h  reason: collision with root package name */
        private long f10505h = 300000;

        public e a(s sVar) {
            return new e(this.f10499b, this.f10500c, sVar, this.f10498a, this.f10501d, this.f10502e, this.f10503f, this.f10504g, this.f10505h);
        }

        public b b(boolean z10) {
            this.f10501d = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f10503f = z10;
            return this;
        }

        public b d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                a5.a.a(z10);
            }
            this.f10502e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, p.c cVar) {
            this.f10499b = (UUID) a5.a.e(uuid);
            this.f10500c = (p.c) a5.a.e(cVar);
            return this;
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class c implements p.b {
        private c() {
        }

        @Override // com.google.android.exoplayer2.drm.p.b
        public void a(p pVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) a5.a.e(e.this.f10497z)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDrmSessionManager.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (com.google.android.exoplayer2.drm.d dVar : e.this.f10485n) {
                if (dVar.p(bArr)) {
                    dVar.x(message.what);
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* renamed from: com.google.android.exoplayer2.drm.e$e  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0171e extends Exception {
        private C0171e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements l.b {

        /* renamed from: b  reason: collision with root package name */
        private final k.a f10508b;

        /* renamed from: c  reason: collision with root package name */
        private j f10509c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10510d;

        public f(k.a aVar) {
            this.f10508b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(m1 m1Var) {
            if (e.this.f10488q == 0 || this.f10510d) {
                return;
            }
            e eVar = e.this;
            this.f10509c = eVar.t((Looper) a5.a.e(eVar.f10492u), this.f10508b, m1Var, false);
            e.this.f10486o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            if (this.f10510d) {
                return;
            }
            j jVar = this.f10509c;
            if (jVar != null) {
                jVar.b(this.f10508b);
            }
            e.this.f10486o.remove(this);
            this.f10510d = true;
        }

        public void c(final m1 m1Var) {
            ((Handler) a5.a.e(e.this.f10493v)).post(new Runnable() { // from class: com.google.android.exoplayer2.drm.g
                @Override // java.lang.Runnable
                public final void run() {
                    e.f.this.d(m1Var);
                }
            });
        }

        @Override // com.google.android.exoplayer2.drm.l.b
        public void release() {
            p0.L0((Handler) a5.a.e(e.this.f10493v), new Runnable() { // from class: com.google.android.exoplayer2.drm.f
                @Override // java.lang.Runnable
                public final void run() {
                    e.f.this.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements d.a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<com.google.android.exoplayer2.drm.d> f10512a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private com.google.android.exoplayer2.drm.d f10513b;

        public g() {
        }

        @Override // com.google.android.exoplayer2.drm.d.a
        public void a(Exception exc, boolean z10) {
            this.f10513b = null;
            y5.q l10 = y5.q.l(this.f10512a);
            this.f10512a.clear();
            s0 it = l10.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.drm.d) it.next()).z(exc, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.d.a
        public void b(com.google.android.exoplayer2.drm.d dVar) {
            this.f10512a.add(dVar);
            if (this.f10513b != null) {
                return;
            }
            this.f10513b = dVar;
            dVar.D();
        }

        @Override // com.google.android.exoplayer2.drm.d.a
        public void c() {
            this.f10513b = null;
            y5.q l10 = y5.q.l(this.f10512a);
            this.f10512a.clear();
            s0 it = l10.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.drm.d) it.next()).y();
            }
        }

        public void d(com.google.android.exoplayer2.drm.d dVar) {
            this.f10512a.remove(dVar);
            if (this.f10513b == dVar) {
                this.f10513b = null;
                if (this.f10512a.isEmpty()) {
                    return;
                }
                com.google.android.exoplayer2.drm.d next = this.f10512a.iterator().next();
                this.f10513b = next;
                next.D();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements d.b {
        private h() {
        }

        @Override // com.google.android.exoplayer2.drm.d.b
        public void a(com.google.android.exoplayer2.drm.d dVar, int i10) {
            if (e.this.f10484m != -9223372036854775807L) {
                e.this.f10487p.remove(dVar);
                ((Handler) a5.a.e(e.this.f10493v)).removeCallbacksAndMessages(dVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.d.b
        public void b(final com.google.android.exoplayer2.drm.d dVar, int i10) {
            if (i10 == 1 && e.this.f10488q > 0 && e.this.f10484m != -9223372036854775807L) {
                e.this.f10487p.add(dVar);
                ((Handler) a5.a.e(e.this.f10493v)).postAtTime(new Runnable() { // from class: com.google.android.exoplayer2.drm.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.this.b(null);
                    }
                }, dVar, SystemClock.uptimeMillis() + e.this.f10484m);
            } else if (i10 == 0) {
                e.this.f10485n.remove(dVar);
                if (e.this.f10490s == dVar) {
                    e.this.f10490s = null;
                }
                if (e.this.f10491t == dVar) {
                    e.this.f10491t = null;
                }
                e.this.f10481j.d(dVar);
                if (e.this.f10484m != -9223372036854775807L) {
                    ((Handler) a5.a.e(e.this.f10493v)).removeCallbacksAndMessages(dVar);
                    e.this.f10487p.remove(dVar);
                }
            }
            e.this.C();
        }
    }

    private j A(int i10, boolean z10) {
        p pVar = (p) a5.a.e(this.f10489r);
        if ((pVar.g() == 2 && r3.q.f30369d) || p0.z0(this.f10479h, i10) == -1 || pVar.g() == 1) {
            return null;
        }
        com.google.android.exoplayer2.drm.d dVar = this.f10490s;
        if (dVar == null) {
            com.google.android.exoplayer2.drm.d x10 = x(y5.q.p(), true, null, z10);
            this.f10485n.add(x10);
            this.f10490s = x10;
        } else {
            dVar.a(null);
        }
        return this.f10490s;
    }

    private void B(Looper looper) {
        if (this.f10497z == null) {
            this.f10497z = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f10489r != null && this.f10488q == 0 && this.f10485n.isEmpty() && this.f10486o.isEmpty()) {
            ((p) a5.a.e(this.f10489r)).release();
            this.f10489r = null;
        }
    }

    private void D() {
        s0 it = y5.s.j(this.f10487p).iterator();
        while (it.hasNext()) {
            ((j) it.next()).b(null);
        }
    }

    private void E() {
        s0 it = y5.s.j(this.f10486o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    private void G(j jVar, k.a aVar) {
        jVar.b(aVar);
        if (this.f10484m != -9223372036854775807L) {
            jVar.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j t(Looper looper, k.a aVar, m1 m1Var, boolean z10) {
        List<DrmInitData.SchemeData> list;
        B(looper);
        DrmInitData drmInitData = m1Var.f28188o;
        if (drmInitData == null) {
            return A(x.k(m1Var.f28185l), z10);
        }
        com.google.android.exoplayer2.drm.d dVar = null;
        if (this.f10495x == null) {
            list = y((DrmInitData) a5.a.e(drmInitData), this.f10474c, false);
            if (list.isEmpty()) {
                C0171e c0171e = new C0171e(this.f10474c);
                t.d("DefaultDrmSessionMgr", "DRM error", c0171e);
                if (aVar != null) {
                    aVar.l(c0171e);
                }
                return new o(new j.a(c0171e, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (!this.f10478g) {
            dVar = this.f10491t;
        } else {
            Iterator<com.google.android.exoplayer2.drm.d> it = this.f10485n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.exoplayer2.drm.d next = it.next();
                if (p0.c(next.f10442a, list)) {
                    dVar = next;
                    break;
                }
            }
        }
        if (dVar == null) {
            dVar = x(list, false, aVar, z10);
            if (!this.f10478g) {
                this.f10491t = dVar;
            }
            this.f10485n.add(dVar);
        } else {
            dVar.a(aVar);
        }
        return dVar;
    }

    private static boolean u(j jVar) {
        return jVar.getState() == 1 && (p0.f482a < 19 || (((j.a) a5.a.e(jVar.getError())).getCause() instanceof ResourceBusyException));
    }

    private boolean v(DrmInitData drmInitData) {
        if (this.f10495x != null) {
            return true;
        }
        if (y(drmInitData, this.f10474c, true).isEmpty()) {
            if (drmInitData.f10434d != 1 || !drmInitData.e(0).d(n3.i.f28005b)) {
                return false;
            }
            t.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f10474c);
        }
        String str = drmInitData.f10433c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? p0.f482a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private com.google.android.exoplayer2.drm.d w(List<DrmInitData.SchemeData> list, boolean z10, k.a aVar) {
        a5.a.e(this.f10489r);
        com.google.android.exoplayer2.drm.d dVar = new com.google.android.exoplayer2.drm.d(this.f10474c, this.f10489r, this.f10481j, this.f10483l, list, this.f10494w, this.f10480i | z10, z10, this.f10495x, this.f10477f, this.f10476e, (Looper) a5.a.e(this.f10492u), this.f10482k, (q1) a5.a.e(this.f10496y));
        dVar.a(aVar);
        if (this.f10484m != -9223372036854775807L) {
            dVar.a(null);
        }
        return dVar;
    }

    private com.google.android.exoplayer2.drm.d x(List<DrmInitData.SchemeData> list, boolean z10, k.a aVar, boolean z11) {
        com.google.android.exoplayer2.drm.d w10 = w(list, z10, aVar);
        if (u(w10) && !this.f10487p.isEmpty()) {
            D();
            G(w10, aVar);
            w10 = w(list, z10, aVar);
        }
        if (u(w10) && z11 && !this.f10486o.isEmpty()) {
            E();
            if (!this.f10487p.isEmpty()) {
                D();
            }
            G(w10, aVar);
            return w(list, z10, aVar);
        }
        return w10;
    }

    private static List<DrmInitData.SchemeData> y(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f10434d);
        for (int i10 = 0; i10 < drmInitData.f10434d; i10++) {
            DrmInitData.SchemeData e8 = drmInitData.e(i10);
            if ((e8.d(uuid) || (n3.i.f28006c.equals(uuid) && e8.d(n3.i.f28005b))) && (e8.f10439e != null || z10)) {
                arrayList.add(e8);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        Looper looper2 = this.f10492u;
        if (looper2 == null) {
            this.f10492u = looper;
            this.f10493v = new Handler(looper);
        } else {
            a5.a.f(looper2 == looper);
            a5.a.e(this.f10493v);
        }
    }

    public void F(int i10, byte[] bArr) {
        a5.a.f(this.f10485n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            a5.a.e(bArr);
        }
        this.f10494w = i10;
        this.f10495x = bArr;
    }

    @Override // com.google.android.exoplayer2.drm.l
    public final void a() {
        int i10 = this.f10488q;
        this.f10488q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f10489r == null) {
            p a10 = this.f10475d.a(this.f10474c);
            this.f10489r = a10;
            a10.e(new c());
        } else if (this.f10484m != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f10485n.size(); i11++) {
                this.f10485n.get(i11).a(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.l
    public j b(k.a aVar, m1 m1Var) {
        a5.a.f(this.f10488q > 0);
        a5.a.h(this.f10492u);
        return t(this.f10492u, aVar, m1Var, true);
    }

    @Override // com.google.android.exoplayer2.drm.l
    public l.b c(k.a aVar, m1 m1Var) {
        a5.a.f(this.f10488q > 0);
        a5.a.h(this.f10492u);
        f fVar = new f(aVar);
        fVar.c(m1Var);
        return fVar;
    }

    @Override // com.google.android.exoplayer2.drm.l
    public int d(m1 m1Var) {
        int g10 = ((p) a5.a.e(this.f10489r)).g();
        DrmInitData drmInitData = m1Var.f28188o;
        if (drmInitData == null) {
            if (p0.z0(this.f10479h, x.k(m1Var.f28185l)) != -1) {
                return g10;
            }
            return 0;
        } else if (v(drmInitData)) {
            return g10;
        } else {
            return 1;
        }
    }

    @Override // com.google.android.exoplayer2.drm.l
    public void e(Looper looper, q1 q1Var) {
        z(looper);
        this.f10496y = q1Var;
    }

    @Override // com.google.android.exoplayer2.drm.l
    public final void release() {
        int i10 = this.f10488q - 1;
        this.f10488q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f10484m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f10485n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((com.google.android.exoplayer2.drm.d) arrayList.get(i11)).b(null);
            }
        }
        E();
        C();
    }

    private e(UUID uuid, p.c cVar, s sVar, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, i0 i0Var, long j10) {
        a5.a.e(uuid);
        a5.a.b(!n3.i.f28005b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f10474c = uuid;
        this.f10475d = cVar;
        this.f10476e = sVar;
        this.f10477f = hashMap;
        this.f10478g = z10;
        this.f10479h = iArr;
        this.f10480i = z11;
        this.f10482k = i0Var;
        this.f10481j = new g();
        this.f10483l = new h();
        this.f10494w = 0;
        this.f10485n = new ArrayList();
        this.f10486o = y5.p0.h();
        this.f10487p = y5.p0.h();
        this.f10484m = j10;
    }
}
