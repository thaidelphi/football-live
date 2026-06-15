package d2;

import c2.g;
import c2.m;
import c2.n;
import c2.o;
import c2.r;
import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import w1.h;
/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements n<g, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final w1.g<Integer> f23935b = w1.g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a  reason: collision with root package name */
    private final m<g, g> f23936a;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: d2.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0261a implements o<g, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final m<g, g> f23937a = new m<>(500);

        @Override // c2.o
        public n<g, InputStream> b(r rVar) {
            return new a(this.f23937a);
        }
    }

    public a(m<g, g> mVar) {
        this.f23936a = mVar;
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<InputStream> b(g gVar, int i10, int i11, h hVar) {
        m<g, g> mVar = this.f23936a;
        if (mVar != null) {
            g a10 = mVar.a(gVar, 0, 0);
            if (a10 == null) {
                this.f23936a.b(gVar, 0, 0, gVar);
            } else {
                gVar = a10;
            }
        }
        return new n.a<>(gVar, new j(gVar, ((Integer) hVar.c(f23935b)).intValue()));
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(g gVar) {
        return true;
    }
}
