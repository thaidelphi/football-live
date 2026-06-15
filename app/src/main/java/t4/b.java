package t4;

import a5.p0;
import java.util.Collections;
import java.util.List;
import n4.h;
/* compiled from: SubripSubtitle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final n4.b[] f31029a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f31030b;

    public b(n4.b[] bVarArr, long[] jArr) {
        this.f31029a = bVarArr;
        this.f31030b = jArr;
    }

    @Override // n4.h
    public int a(long j10) {
        int e8 = p0.e(this.f31030b, j10, false, false);
        if (e8 < this.f31030b.length) {
            return e8;
        }
        return -1;
    }

    @Override // n4.h
    public List<n4.b> b(long j10) {
        int i10 = p0.i(this.f31030b, j10, true, false);
        if (i10 != -1) {
            n4.b[] bVarArr = this.f31029a;
            if (bVarArr[i10] != n4.b.f28595r) {
                return Collections.singletonList(bVarArr[i10]);
            }
        }
        return Collections.emptyList();
    }

    @Override // n4.h
    public long c(int i10) {
        a5.a.a(i10 >= 0);
        a5.a.a(i10 < this.f31030b.length);
        return this.f31030b[i10];
    }

    @Override // n4.h
    public int d() {
        return this.f31030b.length;
    }
}
