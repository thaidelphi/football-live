package d2;

import c2.g;
import c2.n;
import c2.o;
import c2.r;
import java.io.InputStream;
import java.net.URL;
import w1.h;
/* compiled from: UrlLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final n<g, InputStream> f23959a;

    /* compiled from: UrlLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements o<URL, InputStream> {
        @Override // c2.o
        public n<URL, InputStream> b(r rVar) {
            return new e(rVar.d(g.class, InputStream.class));
        }
    }

    public e(n<g, InputStream> nVar) {
        this.f23959a = nVar;
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<InputStream> b(URL url, int i10, int i11, h hVar) {
        return this.f23959a.b(new g(url), i10, i11, hVar);
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(URL url) {
        return true;
    }
}
