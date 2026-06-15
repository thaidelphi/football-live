package k0;

import k0.a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: CreationExtras.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d extends a {
    public d() {
        this(null, 1, null);
    }

    public d(a initialExtras) {
        n.f(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    @Override // k0.a
    public <T> T a(a.b<T> key) {
        n.f(key, "key");
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(a.b<T> key, T t10) {
        n.f(key, "key");
        b().put(key, t10);
    }

    public /* synthetic */ d(a aVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? a.C0305a.f27116b : aVar);
    }
}
