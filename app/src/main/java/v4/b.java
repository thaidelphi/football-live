package v4;

import java.util.Collections;
import java.util.List;
import n4.h;
/* compiled from: Tx3gSubtitle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final b f31887b = new b();

    /* renamed from: a  reason: collision with root package name */
    private final List<n4.b> f31888a;

    public b(n4.b bVar) {
        this.f31888a = Collections.singletonList(bVar);
    }

    @Override // n4.h
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // n4.h
    public List<n4.b> b(long j10) {
        return j10 >= 0 ? this.f31888a : Collections.emptyList();
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

    private b() {
        this.f31888a = Collections.emptyList();
    }
}
