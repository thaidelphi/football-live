package y1;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: ResourceCacheKey.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class x implements w1.f {

    /* renamed from: j  reason: collision with root package name */
    private static final s2.g<Class<?>, byte[]> f33034j = new s2.g<>(50);

    /* renamed from: b  reason: collision with root package name */
    private final z1.b f33035b;

    /* renamed from: c  reason: collision with root package name */
    private final w1.f f33036c;

    /* renamed from: d  reason: collision with root package name */
    private final w1.f f33037d;

    /* renamed from: e  reason: collision with root package name */
    private final int f33038e;

    /* renamed from: f  reason: collision with root package name */
    private final int f33039f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f33040g;

    /* renamed from: h  reason: collision with root package name */
    private final w1.h f33041h;

    /* renamed from: i  reason: collision with root package name */
    private final w1.l<?> f33042i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(z1.b bVar, w1.f fVar, w1.f fVar2, int i10, int i11, w1.l<?> lVar, Class<?> cls, w1.h hVar) {
        this.f33035b = bVar;
        this.f33036c = fVar;
        this.f33037d = fVar2;
        this.f33038e = i10;
        this.f33039f = i11;
        this.f33042i = lVar;
        this.f33040g = cls;
        this.f33041h = hVar;
    }

    private byte[] c() {
        s2.g<Class<?>, byte[]> gVar = f33034j;
        byte[] g10 = gVar.g(this.f33040g);
        if (g10 == null) {
            byte[] bytes = this.f33040g.getName().getBytes(w1.f.f31964a);
            gVar.k(this.f33040g, bytes);
            return bytes;
        }
        return g10;
    }

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f33035b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f33038e).putInt(this.f33039f).array();
        this.f33037d.b(messageDigest);
        this.f33036c.b(messageDigest);
        messageDigest.update(bArr);
        w1.l<?> lVar = this.f33042i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f33041h.b(messageDigest);
        messageDigest.update(c());
        this.f33035b.put(bArr);
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.f33039f == xVar.f33039f && this.f33038e == xVar.f33038e && s2.k.c(this.f33042i, xVar.f33042i) && this.f33040g.equals(xVar.f33040g) && this.f33036c.equals(xVar.f33036c) && this.f33037d.equals(xVar.f33037d) && this.f33041h.equals(xVar.f33041h);
        }
        return false;
    }

    @Override // w1.f
    public int hashCode() {
        int hashCode = (((((this.f33036c.hashCode() * 31) + this.f33037d.hashCode()) * 31) + this.f33038e) * 31) + this.f33039f;
        w1.l<?> lVar = this.f33042i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f33040g.hashCode()) * 31) + this.f33041h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f33036c + ", signature=" + this.f33037d + ", width=" + this.f33038e + ", height=" + this.f33039f + ", decodedResourceClass=" + this.f33040g + ", transformation='" + this.f33042i + "', options=" + this.f33041h + '}';
    }
}
