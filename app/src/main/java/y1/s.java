package y1;

import java.util.HashMap;
import java.util.Map;
/* compiled from: Jobs.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class s {

    /* renamed from: a  reason: collision with root package name */
    private final Map<w1.f, l<?>> f33013a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<w1.f, l<?>> f33014b = new HashMap();

    private Map<w1.f, l<?>> b(boolean z10) {
        return z10 ? this.f33014b : this.f33013a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l<?> a(w1.f fVar, boolean z10) {
        return b(z10).get(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(w1.f fVar, l<?> lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(w1.f fVar, l<?> lVar) {
        Map<w1.f, l<?>> b10 = b(lVar.p());
        if (lVar.equals(b10.get(fVar))) {
            b10.remove(fVar);
        }
    }
}
