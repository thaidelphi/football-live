package com.google.android.exoplayer2.drm;

import a5.p0;
import a5.t;
import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.p;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o3.q1;
import r3.u;
import r3.w;
import z4.i0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultDrmSession.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public final List<DrmInitData.SchemeData> f10442a;

    /* renamed from: b  reason: collision with root package name */
    private final p f10443b;

    /* renamed from: c  reason: collision with root package name */
    private final a f10444c;

    /* renamed from: d  reason: collision with root package name */
    private final b f10445d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10446e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f10447f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f10448g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, String> f10449h;

    /* renamed from: i  reason: collision with root package name */
    private final a5.i<k.a> f10450i;

    /* renamed from: j  reason: collision with root package name */
    private final i0 f10451j;

    /* renamed from: k  reason: collision with root package name */
    private final q1 f10452k;

    /* renamed from: l  reason: collision with root package name */
    final s f10453l;

    /* renamed from: m  reason: collision with root package name */
    final UUID f10454m;

    /* renamed from: n  reason: collision with root package name */
    final e f10455n;

    /* renamed from: o  reason: collision with root package name */
    private int f10456o;

    /* renamed from: p  reason: collision with root package name */
    private int f10457p;

    /* renamed from: q  reason: collision with root package name */
    private HandlerThread f10458q;

    /* renamed from: r  reason: collision with root package name */
    private c f10459r;

    /* renamed from: s  reason: collision with root package name */
    private q3.b f10460s;

    /* renamed from: t  reason: collision with root package name */
    private j.a f10461t;

    /* renamed from: u  reason: collision with root package name */
    private byte[] f10462u;

    /* renamed from: v  reason: collision with root package name */
    private byte[] f10463v;

    /* renamed from: w  reason: collision with root package name */
    private p.a f10464w;

    /* renamed from: x  reason: collision with root package name */
    private p.d f10465x;

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(Exception exc, boolean z10);

        void b(d dVar);

        void c();
    }

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(d dVar, int i10);

        void b(d dVar, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10466a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, u uVar) {
            IOException fVar;
            C0170d c0170d = (C0170d) message.obj;
            if (c0170d.f10469b) {
                int i10 = c0170d.f10472e + 1;
                c0170d.f10472e = i10;
                if (i10 > d.this.f10451j.a(3)) {
                    return false;
                }
                e4.l lVar = new e4.l(c0170d.f10468a, uVar.f30376a, uVar.f30377b, uVar.f30378c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c0170d.f10470c, uVar.f30379d);
                e4.p pVar = new e4.p(3);
                if (uVar.getCause() instanceof IOException) {
                    fVar = (IOException) uVar.getCause();
                } else {
                    fVar = new f(uVar.getCause());
                }
                long b10 = d.this.f10451j.b(new i0.c(lVar, pVar, fVar, c0170d.f10472e));
                if (b10 == -9223372036854775807L) {
                    return false;
                }
                synchronized (this) {
                    if (this.f10466a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), b10);
                    return true;
                }
            }
            return false;
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new C0170d(e4.l.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f10466a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Exception] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr;
            C0170d c0170d = (C0170d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    d dVar = d.this;
                    bArr = dVar.f10453l.a(dVar.f10454m, (p.d) c0170d.f10471d);
                } else if (i10 == 1) {
                    d dVar2 = d.this;
                    bArr = dVar2.f10453l.b(dVar2.f10454m, (p.a) c0170d.f10471d);
                } else {
                    throw new RuntimeException();
                }
            } catch (u e8) {
                boolean a10 = a(message, e8);
                bArr = e8;
                if (a10) {
                    return;
                }
            } catch (Exception e10) {
                t.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e10);
                bArr = e10;
            }
            d.this.f10451j.c(c0170d.f10468a);
            synchronized (this) {
                if (!this.f10466a) {
                    d.this.f10455n.obtainMessage(message.what, Pair.create(c0170d.f10471d, bArr)).sendToTarget();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultDrmSession.java */
    /* renamed from: com.google.android.exoplayer2.drm.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0170d {

        /* renamed from: a  reason: collision with root package name */
        public final long f10468a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10469b;

        /* renamed from: c  reason: collision with root package name */
        public final long f10470c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f10471d;

        /* renamed from: e  reason: collision with root package name */
        public int f10472e;

        public C0170d(long j10, boolean z10, long j11, Object obj) {
            this.f10468a = j10;
            this.f10469b = z10;
            this.f10470c = j11;
            this.f10471d = obj;
        }
    }

    /* compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                d.this.A(obj, obj2);
            } else if (i10 != 1) {
            } else {
                d.this.u(obj, obj2);
            }
        }
    }

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public d(UUID uuid, p pVar, a aVar, b bVar, List<DrmInitData.SchemeData> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, s sVar, Looper looper, i0 i0Var, q1 q1Var) {
        if (i10 == 1 || i10 == 3) {
            a5.a.e(bArr);
        }
        this.f10454m = uuid;
        this.f10444c = aVar;
        this.f10445d = bVar;
        this.f10443b = pVar;
        this.f10446e = i10;
        this.f10447f = z10;
        this.f10448g = z11;
        if (bArr != null) {
            this.f10463v = bArr;
            this.f10442a = null;
        } else {
            this.f10442a = Collections.unmodifiableList((List) a5.a.e(list));
        }
        this.f10449h = hashMap;
        this.f10453l = sVar;
        this.f10450i = new a5.i<>();
        this.f10451j = i0Var;
        this.f10452k = q1Var;
        this.f10456o = 2;
        this.f10455n = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(Object obj, Object obj2) {
        if (obj == this.f10465x) {
            if (this.f10456o == 2 || q()) {
                this.f10465x = null;
                if (obj2 instanceof Exception) {
                    this.f10444c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f10443b.f((byte[]) obj2);
                    this.f10444c.c();
                } catch (Exception e8) {
                    this.f10444c.a(e8, true);
                }
            }
        }
    }

    private boolean B() {
        if (q()) {
            return true;
        }
        try {
            byte[] c10 = this.f10443b.c();
            this.f10462u = c10;
            this.f10443b.l(c10, this.f10452k);
            this.f10460s = this.f10443b.h(this.f10462u);
            this.f10456o = 3;
            m(new a5.h() { // from class: com.google.android.exoplayer2.drm.b
                @Override // a5.h
                public final void accept(Object obj) {
                    ((k.a) obj).k(r1);
                }
            });
            a5.a.e(this.f10462u);
            return true;
        } catch (NotProvisionedException unused) {
            this.f10444c.b(this);
            return false;
        } catch (Exception e8) {
            t(e8, 1);
            return false;
        }
    }

    private void C(byte[] bArr, int i10, boolean z10) {
        try {
            this.f10464w = this.f10443b.m(bArr, this.f10442a, i10, this.f10449h);
            ((c) p0.j(this.f10459r)).b(1, a5.a.e(this.f10464w), z10);
        } catch (Exception e8) {
            v(e8, true);
        }
    }

    private boolean E() {
        try {
            this.f10443b.d(this.f10462u, this.f10463v);
            return true;
        } catch (Exception e8) {
            t(e8, 1);
            return false;
        }
    }

    private void m(a5.h<k.a> hVar) {
        for (k.a aVar : this.f10450i.t()) {
            hVar.accept(aVar);
        }
    }

    private void n(boolean z10) {
        if (this.f10448g) {
            return;
        }
        byte[] bArr = (byte[]) p0.j(this.f10462u);
        int i10 = this.f10446e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f10463v == null || E()) {
                    C(bArr, 2, z10);
                }
            } else if (i10 != 3) {
            } else {
                a5.a.e(this.f10463v);
                a5.a.e(this.f10462u);
                C(this.f10463v, 3, z10);
            }
        } else if (this.f10463v == null) {
            C(bArr, 1, z10);
        } else if (this.f10456o == 4 || E()) {
            long o10 = o();
            if (this.f10446e != 0 || o10 > 60) {
                if (o10 <= 0) {
                    t(new r3.t(), 2);
                    return;
                }
                this.f10456o = 4;
                m(new a5.h() { // from class: r3.c
                    @Override // a5.h
                    public final void accept(Object obj) {
                        ((k.a) obj).j();
                    }
                });
                return;
            }
            t.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + o10);
            C(bArr, 2, z10);
        }
    }

    private long o() {
        if (n3.i.f28007d.equals(this.f10454m)) {
            Pair pair = (Pair) a5.a.e(w.b(this));
            return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        }
        return Long.MAX_VALUE;
    }

    private boolean q() {
        int i10 = this.f10456o;
        return i10 == 3 || i10 == 4;
    }

    private void t(final Exception exc, int i10) {
        this.f10461t = new j.a(exc, m.a(exc, i10));
        t.d("DefaultDrmSession", "DRM session error", exc);
        m(new a5.h() { // from class: com.google.android.exoplayer2.drm.c
            @Override // a5.h
            public final void accept(Object obj) {
                ((k.a) obj).l(exc);
            }
        });
        if (this.f10456o != 4) {
            this.f10456o = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(Object obj, Object obj2) {
        if (obj == this.f10464w && q()) {
            this.f10464w = null;
            if (obj2 instanceof Exception) {
                v((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f10446e == 3) {
                    this.f10443b.k((byte[]) p0.j(this.f10463v), bArr);
                    m(new a5.h() { // from class: r3.b
                        @Override // a5.h
                        public final void accept(Object obj3) {
                            ((k.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] k10 = this.f10443b.k(this.f10462u, bArr);
                int i10 = this.f10446e;
                if ((i10 == 2 || (i10 == 0 && this.f10463v != null)) && k10 != null && k10.length != 0) {
                    this.f10463v = k10;
                }
                this.f10456o = 4;
                m(new a5.h() { // from class: r3.a
                    @Override // a5.h
                    public final void accept(Object obj3) {
                        ((k.a) obj3).h();
                    }
                });
            } catch (Exception e8) {
                v(e8, true);
            }
        }
    }

    private void v(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f10444c.b(this);
        } else {
            t(exc, z10 ? 1 : 2);
        }
    }

    private void w() {
        if (this.f10446e == 0 && this.f10456o == 4) {
            p0.j(this.f10462u);
            n(false);
        }
    }

    public void D() {
        this.f10465x = this.f10443b.b();
        ((c) p0.j(this.f10459r)).b(0, a5.a.e(this.f10465x), true);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void a(k.a aVar) {
        if (this.f10457p < 0) {
            t.c("DefaultDrmSession", "Session reference count less than zero: " + this.f10457p);
            this.f10457p = 0;
        }
        if (aVar != null) {
            this.f10450i.a(aVar);
        }
        int i10 = this.f10457p + 1;
        this.f10457p = i10;
        if (i10 == 1) {
            a5.a.f(this.f10456o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f10458q = handlerThread;
            handlerThread.start();
            this.f10459r = new c(this.f10458q.getLooper());
            if (B()) {
                n(true);
            }
        } else if (aVar != null && q() && this.f10450i.b(aVar) == 1) {
            aVar.k(this.f10456o);
        }
        this.f10445d.a(this, this.f10457p);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void b(k.a aVar) {
        int i10 = this.f10457p;
        if (i10 <= 0) {
            t.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f10457p = i11;
        if (i11 == 0) {
            this.f10456o = 0;
            ((e) p0.j(this.f10455n)).removeCallbacksAndMessages(null);
            ((c) p0.j(this.f10459r)).c();
            this.f10459r = null;
            ((HandlerThread) p0.j(this.f10458q)).quit();
            this.f10458q = null;
            this.f10460s = null;
            this.f10461t = null;
            this.f10464w = null;
            this.f10465x = null;
            byte[] bArr = this.f10462u;
            if (bArr != null) {
                this.f10443b.j(bArr);
                this.f10462u = null;
            }
        }
        if (aVar != null) {
            this.f10450i.c(aVar);
            if (this.f10450i.b(aVar) == 0) {
                aVar.m();
            }
        }
        this.f10445d.b(this, this.f10457p);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final UUID c() {
        return this.f10454m;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public boolean d() {
        return this.f10447f;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final q3.b e() {
        return this.f10460s;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public Map<String, String> f() {
        byte[] bArr = this.f10462u;
        if (bArr == null) {
            return null;
        }
        return this.f10443b.a(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public boolean g(String str) {
        return this.f10443b.i((byte[]) a5.a.h(this.f10462u), str);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final j.a getError() {
        if (this.f10456o == 1) {
            return this.f10461t;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final int getState() {
        return this.f10456o;
    }

    public boolean p(byte[] bArr) {
        return Arrays.equals(this.f10462u, bArr);
    }

    public void x(int i10) {
        if (i10 != 2) {
            return;
        }
        w();
    }

    public void y() {
        if (B()) {
            n(true);
        }
    }

    public void z(Exception exc, boolean z10) {
        t(exc, z10 ? 1 : 3);
    }
}
