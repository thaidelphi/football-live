package w4;

import a5.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: WebvttSubtitle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class k implements n4.h {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f32365a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f32366b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f32367c;

    public k(List<e> list) {
        this.f32365a = Collections.unmodifiableList(new ArrayList(list));
        this.f32366b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f32366b;
            jArr[i11] = eVar.f32334b;
            jArr[i11 + 1] = eVar.f32335c;
        }
        long[] jArr2 = this.f32366b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f32367c = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f(e eVar, e eVar2) {
        return Long.compare(eVar.f32334b, eVar2.f32334b);
    }

    @Override // n4.h
    public int a(long j10) {
        int e8 = p0.e(this.f32367c, j10, false, false);
        if (e8 < this.f32367c.length) {
            return e8;
        }
        return -1;
    }

    @Override // n4.h
    public List<n4.b> b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f32365a.size(); i10++) {
            long[] jArr = this.f32366b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f32365a.get(i10);
                n4.b bVar = eVar.f32333a;
                if (bVar.f28601e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: w4.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int f10;
                f10 = k.f((e) obj, (e) obj2);
                return f10;
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f32333a.b().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // n4.h
    public long c(int i10) {
        a5.a.a(i10 >= 0);
        a5.a.a(i10 < this.f32367c.length);
        return this.f32367c[i10];
    }

    @Override // n4.h
    public int d() {
        return this.f32367c.length;
    }
}
