package z4;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import z4.j0;
import z4.p;
/* compiled from: ParsingLoadable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m0<T> implements j0.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f33549a;

    /* renamed from: b  reason: collision with root package name */
    public final p f33550b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33551c;

    /* renamed from: d  reason: collision with root package name */
    private final r0 f33552d;

    /* renamed from: e  reason: collision with root package name */
    private final a<? extends T> f33553e;

    /* renamed from: f  reason: collision with root package name */
    private volatile T f33554f;

    /* compiled from: ParsingLoadable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public m0(l lVar, Uri uri, int i10, a<? extends T> aVar) {
        this(lVar, new p.b().i(uri).b(1).a(), i10, aVar);
    }

    @Override // z4.j0.e
    public final void a() throws IOException {
        this.f33552d.r();
        n nVar = new n(this.f33552d, this.f33550b);
        try {
            nVar.b();
            this.f33554f = this.f33553e.a((Uri) a5.a.e(this.f33552d.m()), nVar);
        } finally {
            a5.p0.n(nVar);
        }
    }

    @Override // z4.j0.e
    public final void b() {
    }

    public long c() {
        return this.f33552d.o();
    }

    public Map<String, List<String>> d() {
        return this.f33552d.q();
    }

    public final T e() {
        return this.f33554f;
    }

    public Uri f() {
        return this.f33552d.p();
    }

    public m0(l lVar, p pVar, int i10, a<? extends T> aVar) {
        this.f33552d = new r0(lVar);
        this.f33550b = pVar;
        this.f33551c = i10;
        this.f33553e = aVar;
        this.f33549a = e4.l.a();
    }
}
