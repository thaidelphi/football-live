package y1;

import java.security.MessageDigest;
/* compiled from: DataCacheKey.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class d implements w1.f {

    /* renamed from: b  reason: collision with root package name */
    private final w1.f f32848b;

    /* renamed from: c  reason: collision with root package name */
    private final w1.f f32849c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(w1.f fVar, w1.f fVar2) {
        this.f32848b = fVar;
        this.f32849c = fVar2;
    }

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        this.f32848b.b(messageDigest);
        this.f32849c.b(messageDigest);
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f32848b.equals(dVar.f32848b) && this.f32849c.equals(dVar.f32849c);
        }
        return false;
    }

    @Override // w1.f
    public int hashCode() {
        return (this.f32848b.hashCode() * 31) + this.f32849c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f32848b + ", signature=" + this.f32849c + '}';
    }
}
