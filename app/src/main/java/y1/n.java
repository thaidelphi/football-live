package y1;

import java.security.MessageDigest;
import java.util.Map;
/* compiled from: EngineKey.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class n implements w1.f {

    /* renamed from: b  reason: collision with root package name */
    private final Object f32988b;

    /* renamed from: c  reason: collision with root package name */
    private final int f32989c;

    /* renamed from: d  reason: collision with root package name */
    private final int f32990d;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f32991e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f32992f;

    /* renamed from: g  reason: collision with root package name */
    private final w1.f f32993g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<?>, w1.l<?>> f32994h;

    /* renamed from: i  reason: collision with root package name */
    private final w1.h f32995i;

    /* renamed from: j  reason: collision with root package name */
    private int f32996j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Object obj, w1.f fVar, int i10, int i11, Map<Class<?>, w1.l<?>> map, Class<?> cls, Class<?> cls2, w1.h hVar) {
        this.f32988b = s2.j.d(obj);
        this.f32993g = (w1.f) s2.j.e(fVar, "Signature must not be null");
        this.f32989c = i10;
        this.f32990d = i11;
        this.f32994h = (Map) s2.j.d(map);
        this.f32991e = (Class) s2.j.e(cls, "Resource class must not be null");
        this.f32992f = (Class) s2.j.e(cls2, "Transcode class must not be null");
        this.f32995i = (w1.h) s2.j.d(hVar);
    }

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f32988b.equals(nVar.f32988b) && this.f32993g.equals(nVar.f32993g) && this.f32990d == nVar.f32990d && this.f32989c == nVar.f32989c && this.f32994h.equals(nVar.f32994h) && this.f32991e.equals(nVar.f32991e) && this.f32992f.equals(nVar.f32992f) && this.f32995i.equals(nVar.f32995i);
        }
        return false;
    }

    @Override // w1.f
    public int hashCode() {
        if (this.f32996j == 0) {
            int hashCode = this.f32988b.hashCode();
            this.f32996j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f32993g.hashCode();
            this.f32996j = hashCode2;
            int i10 = (hashCode2 * 31) + this.f32989c;
            this.f32996j = i10;
            int i11 = (i10 * 31) + this.f32990d;
            this.f32996j = i11;
            int hashCode3 = (i11 * 31) + this.f32994h.hashCode();
            this.f32996j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f32991e.hashCode();
            this.f32996j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f32992f.hashCode();
            this.f32996j = hashCode5;
            this.f32996j = (hashCode5 * 31) + this.f32995i.hashCode();
        }
        return this.f32996j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f32988b + ", width=" + this.f32989c + ", height=" + this.f32990d + ", resourceClass=" + this.f32991e + ", transcodeClass=" + this.f32992f + ", signature=" + this.f32993g + ", hashCode=" + this.f32996j + ", transformations=" + this.f32994h + ", options=" + this.f32995i + '}';
    }
}
