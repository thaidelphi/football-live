package a2;

import a2.h;
import android.annotation.SuppressLint;
import y1.v;
/* compiled from: LruResourceCache.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends s2.g<w1.f, v<?>> implements h {

    /* renamed from: e  reason: collision with root package name */
    private h.a f216e;

    public g(long j10) {
        super(j10);
    }

    @Override // a2.h
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // a2.h
    public /* bridge */ /* synthetic */ v c(w1.f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    @Override // a2.h
    public void d(h.a aVar) {
        this.f216e = aVar;
    }

    @Override // a2.h
    public /* bridge */ /* synthetic */ v e(w1.f fVar) {
        return (v) super.l(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s2.g
    /* renamed from: n */
    public int i(v<?> vVar) {
        if (vVar == null) {
            return super.i(null);
        }
        return vVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s2.g
    /* renamed from: o */
    public void j(w1.f fVar, v<?> vVar) {
        h.a aVar = this.f216e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.a(vVar);
    }
}
