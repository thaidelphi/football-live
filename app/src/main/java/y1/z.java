package y1;

import android.util.Log;
import c2.n;
import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;
import y1.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SourceGenerator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class z implements f, f.a {

    /* renamed from: a  reason: collision with root package name */
    private final g<?> f33045a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f33046b;

    /* renamed from: c  reason: collision with root package name */
    private int f33047c;

    /* renamed from: d  reason: collision with root package name */
    private c f33048d;

    /* renamed from: e  reason: collision with root package name */
    private Object f33049e;

    /* renamed from: f  reason: collision with root package name */
    private volatile n.a<?> f33050f;

    /* renamed from: g  reason: collision with root package name */
    private d f33051g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SourceGenerator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements d.a<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n.a f33052a;

        a(n.a aVar) {
            this.f33052a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (z.this.g(this.f33052a)) {
                z.this.i(this.f33052a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (z.this.g(this.f33052a)) {
                z.this.h(this.f33052a, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(g<?> gVar, f.a aVar) {
        this.f33045a = gVar;
        this.f33046b = aVar;
    }

    private void e(Object obj) {
        long b10 = s2.f.b();
        try {
            w1.d<X> p10 = this.f33045a.p(obj);
            e eVar = new e(p10, obj, this.f33045a.k());
            this.f33051g = new d(this.f33050f.f5372a, this.f33045a.o());
            this.f33045a.d().a(this.f33051g, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f33051g + ", data: " + obj + ", encoder: " + p10 + ", duration: " + s2.f.a(b10));
            }
            this.f33050f.f5374c.b();
            this.f33048d = new c(Collections.singletonList(this.f33050f.f5372a), this.f33045a, this);
        } catch (Throwable th) {
            this.f33050f.f5374c.b();
            throw th;
        }
    }

    private boolean f() {
        return this.f33047c < this.f33045a.g().size();
    }

    private void j(n.a<?> aVar) {
        this.f33050f.f5374c.e(this.f33045a.l(), new a(aVar));
    }

    @Override // y1.f.a
    public void a(w1.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, w1.a aVar) {
        this.f33046b.a(fVar, exc, dVar, this.f33050f.f5374c.d());
    }

    @Override // y1.f.a
    public void b(w1.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, w1.a aVar, w1.f fVar2) {
        this.f33046b.b(fVar, obj, dVar, this.f33050f.f5374c.d(), fVar);
    }

    @Override // y1.f.a
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // y1.f
    public void cancel() {
        n.a<?> aVar = this.f33050f;
        if (aVar != null) {
            aVar.f5374c.cancel();
        }
    }

    @Override // y1.f
    public boolean d() {
        Object obj = this.f33049e;
        if (obj != null) {
            this.f33049e = null;
            e(obj);
        }
        c cVar = this.f33048d;
        if (cVar == null || !cVar.d()) {
            this.f33048d = null;
            this.f33050f = null;
            boolean z10 = false;
            while (!z10 && f()) {
                List<n.a<?>> g10 = this.f33045a.g();
                int i10 = this.f33047c;
                this.f33047c = i10 + 1;
                this.f33050f = g10.get(i10);
                if (this.f33050f != null && (this.f33045a.e().c(this.f33050f.f5374c.d()) || this.f33045a.t(this.f33050f.f5374c.a()))) {
                    j(this.f33050f);
                    z10 = true;
                }
            }
            return z10;
        }
        return true;
    }

    boolean g(n.a<?> aVar) {
        n.a<?> aVar2 = this.f33050f;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(n.a<?> aVar, Object obj) {
        j e8 = this.f33045a.e();
        if (obj != null && e8.c(aVar.f5374c.d())) {
            this.f33049e = obj;
            this.f33046b.c();
            return;
        }
        f.a aVar2 = this.f33046b;
        w1.f fVar = aVar.f5372a;
        com.bumptech.glide.load.data.d<?> dVar = aVar.f5374c;
        aVar2.b(fVar, obj, dVar, dVar.d(), this.f33051g);
    }

    void i(n.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f33046b;
        d dVar = this.f33051g;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f5374c;
        aVar2.a(dVar, exc, dVar2, dVar2.d());
    }
}
