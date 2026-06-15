package androidx.room;

import androidx.room.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueryInterceptorStatement.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m0 implements v0.k {

    /* renamed from: a  reason: collision with root package name */
    private final v0.k f4211a;

    /* renamed from: b  reason: collision with root package name */
    private final q0.f f4212b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4213c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Object> f4214d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Executor f4215e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(v0.k kVar, q0.f fVar, String str, Executor executor) {
        this.f4211a = kVar;
        this.f4212b = fVar;
        this.f4213c = str;
        this.f4215e = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f4212b.a(this.f4213c, this.f4214d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f4212b.a(this.f4213c, this.f4214d);
    }

    private void k(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.f4214d.size()) {
            for (int size = this.f4214d.size(); size <= i11; size++) {
                this.f4214d.add(null);
            }
        }
        this.f4214d.set(i11, obj);
    }

    @Override // v0.k
    public long a0() {
        this.f4215e.execute(new Runnable() { // from class: androidx.room.k0
            @Override // java.lang.Runnable
            public final void run() {
                m0.this.f();
            }
        });
        return this.f4211a.a0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4211a.close();
    }

    @Override // v0.i
    public void d0(int i10, String str) {
        k(i10, str);
        this.f4211a.d0(i10, str);
    }

    @Override // v0.i
    public void m0(int i10, long j10) {
        k(i10, Long.valueOf(j10));
        this.f4211a.m0(i10, j10);
    }

    @Override // v0.k
    public int n() {
        this.f4215e.execute(new Runnable() { // from class: androidx.room.l0
            @Override // java.lang.Runnable
            public final void run() {
                m0.this.j();
            }
        });
        return this.f4211a.n();
    }

    @Override // v0.i
    public void p(int i10, double d10) {
        k(i10, Double.valueOf(d10));
        this.f4211a.p(i10, d10);
    }

    @Override // v0.i
    public void p0(int i10, byte[] bArr) {
        k(i10, bArr);
        this.f4211a.p0(i10, bArr);
    }

    @Override // v0.i
    public void v0(int i10) {
        k(i10, this.f4214d.toArray());
        this.f4211a.v0(i10);
    }
}
