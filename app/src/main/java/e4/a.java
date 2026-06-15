package e4;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.k;
import e4.a0;
import e4.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n3.l3;
import o3.q1;
import z4.s0;
/* compiled from: BaseMediaSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a implements t {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<t.c> f24968a = new ArrayList<>(1);

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<t.c> f24969b = new HashSet<>(1);

    /* renamed from: c  reason: collision with root package name */
    private final a0.a f24970c = new a0.a();

    /* renamed from: d  reason: collision with root package name */
    private final k.a f24971d = new k.a();

    /* renamed from: e  reason: collision with root package name */
    private Looper f24972e;

    /* renamed from: f  reason: collision with root package name */
    private l3 f24973f;

    /* renamed from: g  reason: collision with root package name */
    private q1 f24974g;

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean A() {
        return !this.f24969b.isEmpty();
    }

    protected abstract void B(s0 s0Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C(l3 l3Var) {
        this.f24973f = l3Var;
        Iterator<t.c> it = this.f24968a.iterator();
        while (it.hasNext()) {
            it.next().a(this, l3Var);
        }
    }

    protected abstract void D();

    @Override // e4.t
    public final void b(t.c cVar) {
        a5.a.e(this.f24972e);
        boolean isEmpty = this.f24969b.isEmpty();
        this.f24969b.add(cVar);
        if (isEmpty) {
            y();
        }
    }

    @Override // e4.t
    public final void c(t.c cVar) {
        this.f24968a.remove(cVar);
        if (this.f24968a.isEmpty()) {
            this.f24972e = null;
            this.f24973f = null;
            this.f24974g = null;
            this.f24969b.clear();
            D();
            return;
        }
        n(cVar);
    }

    @Override // e4.t
    public final void e(Handler handler, a0 a0Var) {
        a5.a.e(handler);
        a5.a.e(a0Var);
        this.f24970c.g(handler, a0Var);
    }

    @Override // e4.t
    public final void h(Handler handler, com.google.android.exoplayer2.drm.k kVar) {
        a5.a.e(handler);
        a5.a.e(kVar);
        this.f24971d.g(handler, kVar);
    }

    @Override // e4.t
    public final void j(com.google.android.exoplayer2.drm.k kVar) {
        this.f24971d.t(kVar);
    }

    @Override // e4.t
    public /* synthetic */ boolean l() {
        return s.b(this);
    }

    @Override // e4.t
    public final void n(t.c cVar) {
        boolean z10 = !this.f24969b.isEmpty();
        this.f24969b.remove(cVar);
        if (z10 && this.f24969b.isEmpty()) {
            x();
        }
    }

    @Override // e4.t
    public /* synthetic */ l3 o() {
        return s.a(this);
    }

    @Override // e4.t
    public final void p(t.c cVar, s0 s0Var, q1 q1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f24972e;
        a5.a.a(looper == null || looper == myLooper);
        this.f24974g = q1Var;
        l3 l3Var = this.f24973f;
        this.f24968a.add(cVar);
        if (this.f24972e == null) {
            this.f24972e = myLooper;
            this.f24969b.add(cVar);
            B(s0Var);
        } else if (l3Var != null) {
            b(cVar);
            cVar.a(this, l3Var);
        }
    }

    @Override // e4.t
    public final void q(a0 a0Var) {
        this.f24970c.C(a0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k.a r(int i10, t.b bVar) {
        return this.f24971d.u(i10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k.a t(t.b bVar) {
        return this.f24971d.u(0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final a0.a u(int i10, t.b bVar, long j10) {
        return this.f24970c.F(i10, bVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final a0.a v(t.b bVar) {
        return this.f24970c.F(0, bVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final a0.a w(t.b bVar, long j10) {
        a5.a.e(bVar);
        return this.f24970c.F(0, bVar, j10);
    }

    protected void x() {
    }

    protected void y() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q1 z() {
        return (q1) a5.a.h(this.f24974g);
    }
}
