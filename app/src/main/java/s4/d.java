package s4;

import a5.p0;
import java.util.Collections;
import java.util.List;
import n4.h;
/* compiled from: SsaSubtitle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    private final List<List<n4.b>> f30776a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Long> f30777b;

    public d(List<List<n4.b>> list, List<Long> list2) {
        this.f30776a = list;
        this.f30777b = list2;
    }

    @Override // n4.h
    public int a(long j10) {
        int d10 = p0.d(this.f30777b, Long.valueOf(j10), false, false);
        if (d10 < this.f30777b.size()) {
            return d10;
        }
        return -1;
    }

    @Override // n4.h
    public List<n4.b> b(long j10) {
        int g10 = p0.g(this.f30777b, Long.valueOf(j10), true, false);
        if (g10 == -1) {
            return Collections.emptyList();
        }
        return this.f30776a.get(g10);
    }

    @Override // n4.h
    public long c(int i10) {
        a5.a.a(i10 >= 0);
        a5.a.a(i10 < this.f30777b.size());
        return this.f30777b.get(i10).longValue();
    }

    @Override // n4.h
    public int d() {
        return this.f30777b.size();
    }
}
