package com.google.android.exoplayer2.metadata;

import a5.p0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import n3.f;
import n3.m1;
import n3.n1;
import n3.z2;
import y3.b;
import y3.c;
import y3.d;
import y3.e;
/* compiled from: MetadataRenderer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends f implements Handler.Callback {

    /* renamed from: n  reason: collision with root package name */
    private final c f10550n;

    /* renamed from: o  reason: collision with root package name */
    private final e f10551o;

    /* renamed from: p  reason: collision with root package name */
    private final Handler f10552p;

    /* renamed from: q  reason: collision with root package name */
    private final d f10553q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f10554r;

    /* renamed from: s  reason: collision with root package name */
    private b f10555s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f10556t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f10557u;

    /* renamed from: v  reason: collision with root package name */
    private long f10558v;

    /* renamed from: w  reason: collision with root package name */
    private Metadata f10559w;

    /* renamed from: x  reason: collision with root package name */
    private long f10560x;

    public a(e eVar, Looper looper) {
        this(eVar, looper, c.f33054a);
    }

    private void P(Metadata metadata, List<Metadata.Entry> list) {
        for (int i10 = 0; i10 < metadata.e(); i10++) {
            m1 E = metadata.d(i10).E();
            if (E != null && this.f10550n.a(E)) {
                b b10 = this.f10550n.b(E);
                byte[] bArr = (byte[]) a5.a.e(metadata.d(i10).R());
                this.f10553q.g();
                this.f10553q.q(bArr.length);
                ((ByteBuffer) p0.j(this.f10553q.f30091c)).put(bArr);
                this.f10553q.r();
                Metadata a10 = b10.a(this.f10553q);
                if (a10 != null) {
                    P(a10, list);
                }
            } else {
                list.add(metadata.d(i10));
            }
        }
    }

    private long Q(long j10) {
        a5.a.f(j10 != -9223372036854775807L);
        a5.a.f(this.f10560x != -9223372036854775807L);
        return j10 - this.f10560x;
    }

    private void R(Metadata metadata) {
        Handler handler = this.f10552p;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            S(metadata);
        }
    }

    private void S(Metadata metadata) {
        this.f10551o.g(metadata);
    }

    private boolean T(long j10) {
        boolean z10;
        Metadata metadata = this.f10559w;
        if (metadata == null || (!this.f10554r && metadata.f10549b > Q(j10))) {
            z10 = false;
        } else {
            R(this.f10559w);
            this.f10559w = null;
            z10 = true;
        }
        if (this.f10556t && this.f10559w == null) {
            this.f10557u = true;
        }
        return z10;
    }

    private void U() {
        if (this.f10556t || this.f10559w != null) {
            return;
        }
        this.f10553q.g();
        n1 A = A();
        int M = M(A, this.f10553q, 0);
        if (M != -4) {
            if (M == -5) {
                this.f10558v = ((m1) a5.a.e(A.f28250b)).f28189p;
            }
        } else if (this.f10553q.l()) {
            this.f10556t = true;
        } else {
            d dVar = this.f10553q;
            dVar.f33055i = this.f10558v;
            dVar.r();
            Metadata a10 = ((b) p0.j(this.f10555s)).a(this.f10553q);
            if (a10 != null) {
                ArrayList arrayList = new ArrayList(a10.e());
                P(a10, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f10559w = new Metadata(Q(this.f10553q.f30093e), arrayList);
            }
        }
    }

    @Override // n3.f
    protected void F() {
        this.f10559w = null;
        this.f10555s = null;
        this.f10560x = -9223372036854775807L;
    }

    @Override // n3.f
    protected void H(long j10, boolean z10) {
        this.f10559w = null;
        this.f10556t = false;
        this.f10557u = false;
    }

    @Override // n3.f
    protected void L(m1[] m1VarArr, long j10, long j11) {
        this.f10555s = this.f10550n.b(m1VarArr[0]);
        Metadata metadata = this.f10559w;
        if (metadata != null) {
            this.f10559w = metadata.c((metadata.f10549b + this.f10560x) - j11);
        }
        this.f10560x = j11;
    }

    @Override // n3.a3
    public int a(m1 m1Var) {
        if (this.f10550n.a(m1Var)) {
            return z2.a(m1Var.E == 0 ? 4 : 2);
        }
        return z2.a(0);
    }

    @Override // n3.y2
    public boolean c() {
        return this.f10557u;
    }

    @Override // n3.y2, n3.a3
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            S((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // n3.y2
    public boolean isReady() {
        return true;
    }

    @Override // n3.y2
    public void s(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            U();
            z10 = T(j10);
        }
    }

    public a(e eVar, Looper looper, c cVar) {
        this(eVar, looper, cVar, false);
    }

    public a(e eVar, Looper looper, c cVar, boolean z10) {
        super(5);
        this.f10551o = (e) a5.a.e(eVar);
        this.f10552p = looper == null ? null : p0.u(looper, this);
        this.f10550n = (c) a5.a.e(cVar);
        this.f10554r = z10;
        this.f10553q = new d();
        this.f10560x = -9223372036854775807L;
    }
}
