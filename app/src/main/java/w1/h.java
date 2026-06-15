package w1;

import java.security.MessageDigest;
/* compiled from: Options.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h implements f {

    /* renamed from: b  reason: collision with root package name */
    private final androidx.collection.a<g<?>, Object> f31970b = new s2.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void f(g<T> gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f31970b.size(); i10++) {
            f(this.f31970b.i(i10), this.f31970b.m(i10), messageDigest);
        }
    }

    public <T> T c(g<T> gVar) {
        return this.f31970b.containsKey(gVar) ? (T) this.f31970b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f31970b.j(hVar.f31970b);
    }

    public <T> h e(g<T> gVar, T t10) {
        this.f31970b.put(gVar, t10);
        return this;
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f31970b.equals(((h) obj).f31970b);
        }
        return false;
    }

    @Override // w1.f
    public int hashCode() {
        return this.f31970b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f31970b + '}';
    }
}
