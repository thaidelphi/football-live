package b3;

import java.util.Set;
/* compiled from: TransportFactoryImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class p implements z2.g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<z2.b> f5067a;

    /* renamed from: b  reason: collision with root package name */
    private final o f5068b;

    /* renamed from: c  reason: collision with root package name */
    private final s f5069c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Set<z2.b> set, o oVar, s sVar) {
        this.f5067a = set;
        this.f5068b = oVar;
        this.f5069c = sVar;
    }

    @Override // z2.g
    public <T> z2.f<T> a(String str, Class<T> cls, z2.b bVar, z2.e<T, byte[]> eVar) {
        if (this.f5067a.contains(bVar)) {
            return new r(this.f5068b, str, bVar, eVar, this.f5069c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f5067a));
    }
}
