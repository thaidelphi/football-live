package w4;

import java.util.Collections;
import java.util.List;
/* compiled from: Mp4WebvttSubtitle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b implements n4.h {

    /* renamed from: a  reason: collision with root package name */
    private final List<n4.b> f32311a;

    public b(List<n4.b> list) {
        this.f32311a = Collections.unmodifiableList(list);
    }

    @Override // n4.h
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // n4.h
    public List<n4.b> b(long j10) {
        return j10 >= 0 ? this.f32311a : Collections.emptyList();
    }

    @Override // n4.h
    public long c(int i10) {
        a5.a.a(i10 == 0);
        return 0L;
    }

    @Override // n4.h
    public int d() {
        return 1;
    }
}
