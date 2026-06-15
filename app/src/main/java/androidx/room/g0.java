package androidx.room;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueryInterceptorDatabase.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g0 implements v0.g {

    /* renamed from: a  reason: collision with root package name */
    private final v0.g f4183a;

    /* renamed from: b  reason: collision with root package name */
    private final q0.f f4184b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f4185c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(v0.g gVar, q0.f fVar, Executor executor) {
        this.f4183a = gVar;
        this.f4184b = fVar;
        this.f4185c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.f4184b.a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f4184b.a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.f4184b.a("END TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(String str) {
        this.f4184b.a(str, new ArrayList(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(String str, List list) {
        this.f4184b.a(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(String str) {
        this.f4184b.a(str, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(v0.j jVar, j0 j0Var) {
        this.f4184b.a(jVar.a(), j0Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(v0.j jVar, j0 j0Var) {
        this.f4184b.a(jVar.a(), j0Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X() {
        this.f4184b.a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    @Override // v0.g
    public boolean A0() {
        return this.f4183a.A0();
    }

    @Override // v0.g
    public void D() {
        this.f4185c.execute(new Runnable() { // from class: androidx.room.x
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.J();
            }
        });
        this.f4183a.D();
    }

    @Override // v0.g
    public String M() {
        return this.f4183a.M();
    }

    @Override // v0.g
    public Cursor W(final v0.j jVar, CancellationSignal cancellationSignal) {
        final j0 j0Var = new j0();
        jVar.b(j0Var);
        this.f4185c.execute(new Runnable() { // from class: androidx.room.f0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.S(jVar, j0Var);
            }
        });
        return this.f4183a.q(jVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4183a.close();
    }

    @Override // v0.g
    public v0.k f0(String str) {
        return new m0(this.f4183a.f0(str), this.f4184b, str, this.f4185c);
    }

    @Override // v0.g
    public void g() {
        this.f4185c.execute(new Runnable() { // from class: androidx.room.a0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.F();
            }
        });
        this.f4183a.g();
    }

    @Override // v0.g
    public boolean isOpen() {
        return this.f4183a.isOpen();
    }

    @Override // v0.g
    public List<Pair<String, String>> l() {
        return this.f4183a.l();
    }

    @Override // v0.g
    public void m(final String str) throws SQLException {
        this.f4185c.execute(new Runnable() { // from class: androidx.room.b0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.K(str);
            }
        });
        this.f4183a.m(str);
    }

    @Override // v0.g
    public Cursor q(final v0.j jVar) {
        final j0 j0Var = new j0();
        jVar.b(j0Var);
        this.f4185c.execute(new Runnable() { // from class: androidx.room.e0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.R(jVar, j0Var);
            }
        });
        return this.f4183a.q(jVar);
    }

    @Override // v0.g
    public Cursor r0(final String str) {
        this.f4185c.execute(new Runnable() { // from class: androidx.room.c0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.P(str);
            }
        });
        return this.f4183a.r0(str);
    }

    @Override // v0.g
    public void v() {
        this.f4185c.execute(new Runnable() { // from class: androidx.room.z
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.X();
            }
        });
        this.f4183a.v();
    }

    @Override // v0.g
    public void x(final String str, Object[] objArr) throws SQLException {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.f4185c.execute(new Runnable() { // from class: androidx.room.d0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.L(str, arrayList);
            }
        });
        this.f4183a.x(str, arrayList.toArray());
    }

    @Override // v0.g
    public boolean x0() {
        return this.f4183a.x0();
    }

    @Override // v0.g
    public void y() {
        this.f4185c.execute(new Runnable() { // from class: androidx.room.y
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.G();
            }
        });
        this.f4183a.y();
    }
}
