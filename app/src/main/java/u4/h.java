package u4;

import a5.p0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: TtmlSubtitle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class h implements n4.h {

    /* renamed from: a  reason: collision with root package name */
    private final d f31445a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f31446b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, g> f31447c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, e> f31448d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f31449e;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f31445a = dVar;
        this.f31448d = map2;
        this.f31449e = map3;
        this.f31447c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f31446b = dVar.j();
    }

    @Override // n4.h
    public int a(long j10) {
        int e8 = p0.e(this.f31446b, j10, false, false);
        if (e8 < this.f31446b.length) {
            return e8;
        }
        return -1;
    }

    @Override // n4.h
    public List<n4.b> b(long j10) {
        return this.f31445a.h(j10, this.f31447c, this.f31448d, this.f31449e);
    }

    @Override // n4.h
    public long c(int i10) {
        return this.f31446b[i10];
    }

    @Override // n4.h
    public int d() {
        return this.f31446b.length;
    }
}
