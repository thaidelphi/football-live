package com.google.android.exoplayer2.source.dash;

import a5.c0;
import a5.p0;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import e4.d0;
import g4.f;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import n3.h2;
import n3.m1;
import n3.n1;
import s3.s;
import s3.t;
import z4.i;
/* compiled from: PlayerEmsgHandler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final z4.b f10762a;

    /* renamed from: b  reason: collision with root package name */
    private final b f10763b;

    /* renamed from: f  reason: collision with root package name */
    private i4.c f10767f;

    /* renamed from: g  reason: collision with root package name */
    private long f10768g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10769h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10770i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10771j;

    /* renamed from: e  reason: collision with root package name */
    private final TreeMap<Long, Long> f10766e = new TreeMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final Handler f10765d = p0.w(this);

    /* renamed from: c  reason: collision with root package name */
    private final a4.a f10764c = new a4.a();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f10772a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10773b;

        public a(long j10, long j11) {
            this.f10772a = j10;
            this.f10773b = j11;
        }
    }

    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(long j10);

        void b();
    }

    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class c implements t {

        /* renamed from: a  reason: collision with root package name */
        private final d0 f10774a;

        /* renamed from: b  reason: collision with root package name */
        private final n1 f10775b = new n1();

        /* renamed from: c  reason: collision with root package name */
        private final y3.d f10776c = new y3.d();

        /* renamed from: d  reason: collision with root package name */
        private long f10777d = -9223372036854775807L;

        c(z4.b bVar) {
            this.f10774a = d0.l(bVar);
        }

        private y3.d g() {
            this.f10776c.g();
            if (this.f10774a.R(this.f10775b, this.f10776c, 0, false) == -4) {
                this.f10776c.r();
                return this.f10776c;
            }
            return null;
        }

        private void k(long j10, long j11) {
            e.this.f10765d.sendMessage(e.this.f10765d.obtainMessage(1, new a(j10, j11)));
        }

        private void l() {
            while (this.f10774a.J(false)) {
                y3.d g10 = g();
                if (g10 != null) {
                    long j10 = g10.f30093e;
                    Metadata a10 = e.this.f10764c.a(g10);
                    if (a10 != null) {
                        EventMessage eventMessage = (EventMessage) a10.d(0);
                        if (e.h(eventMessage.f10565a, eventMessage.f10566b)) {
                            m(j10, eventMessage);
                        }
                    }
                }
            }
            this.f10774a.s();
        }

        private void m(long j10, EventMessage eventMessage) {
            long f10 = e.f(eventMessage);
            if (f10 == -9223372036854775807L) {
                return;
            }
            k(j10, f10);
        }

        @Override // s3.t
        public void a(m1 m1Var) {
            this.f10774a.a(m1Var);
        }

        @Override // s3.t
        public /* synthetic */ int b(i iVar, int i10, boolean z10) {
            return s.a(this, iVar, i10, z10);
        }

        @Override // s3.t
        public int c(i iVar, int i10, boolean z10, int i11) throws IOException {
            return this.f10774a.b(iVar, i10, z10);
        }

        @Override // s3.t
        public /* synthetic */ void d(c0 c0Var, int i10) {
            s.b(this, c0Var, i10);
        }

        @Override // s3.t
        public void e(long j10, int i10, int i11, int i12, t.a aVar) {
            this.f10774a.e(j10, i10, i11, i12, aVar);
            l();
        }

        @Override // s3.t
        public void f(c0 c0Var, int i10, int i11) {
            this.f10774a.d(c0Var, i10);
        }

        public boolean h(long j10) {
            return e.this.j(j10);
        }

        public void i(f fVar) {
            long j10 = this.f10777d;
            if (j10 == -9223372036854775807L || fVar.f25742h > j10) {
                this.f10777d = fVar.f25742h;
            }
            e.this.m(fVar);
        }

        public boolean j(f fVar) {
            long j10 = this.f10777d;
            return e.this.n(j10 != -9223372036854775807L && j10 < fVar.f25741g);
        }

        public void n() {
            this.f10774a.S();
        }
    }

    public e(i4.c cVar, b bVar, z4.b bVar2) {
        this.f10767f = cVar;
        this.f10763b = bVar;
        this.f10762a = bVar2;
    }

    private Map.Entry<Long, Long> e(long j10) {
        return this.f10766e.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(EventMessage eventMessage) {
        try {
            return p0.J0(p0.C(eventMessage.f10569e));
        } catch (h2 unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = this.f10766e.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f10766e.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f10766e.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.f10769h) {
            this.f10770i = true;
            this.f10769h = false;
            this.f10763b.b();
        }
    }

    private void l() {
        this.f10763b.a(this.f10768g);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f10766e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f10767f.f26526h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f10771j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f10772a, aVar.f10773b);
        return true;
    }

    boolean j(long j10) {
        i4.c cVar = this.f10767f;
        boolean z10 = false;
        if (cVar.f26522d) {
            if (this.f10770i) {
                return true;
            }
            Map.Entry<Long, Long> e8 = e(cVar.f26526h);
            if (e8 != null && e8.getValue().longValue() < j10) {
                this.f10768g = e8.getKey().longValue();
                l();
                z10 = true;
            }
            if (z10) {
                i();
            }
            return z10;
        }
        return false;
    }

    public c k() {
        return new c(this.f10762a);
    }

    void m(f fVar) {
        this.f10769h = true;
    }

    boolean n(boolean z10) {
        if (this.f10767f.f26522d) {
            if (this.f10770i) {
                return true;
            }
            if (z10) {
                i();
                return true;
            }
            return false;
        }
        return false;
    }

    public void o() {
        this.f10771j = true;
        this.f10765d.removeCallbacksAndMessages(null);
    }

    public void q(i4.c cVar) {
        this.f10770i = false;
        this.f10768g = -9223372036854775807L;
        this.f10767f = cVar;
        p();
    }
}
