package x4;

import e4.m0;
import e4.t;
import n3.a3;
import n3.l3;
/* compiled from: TrackSelector.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    private a f32580a;

    /* renamed from: b  reason: collision with root package name */
    private z4.f f32581b;

    /* compiled from: TrackSelector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final z4.f a() {
        return (z4.f) a5.a.h(this.f32581b);
    }

    public void b(a aVar, z4.f fVar) {
        this.f32580a = aVar;
        this.f32581b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        a aVar = this.f32580a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public boolean d() {
        return false;
    }

    public abstract void e(Object obj);

    public abstract c0 f(a3[] a3VarArr, m0 m0Var, t.b bVar, l3 l3Var) throws n3.q;

    public void g(p3.e eVar) {
    }
}
