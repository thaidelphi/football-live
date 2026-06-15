package x4;

import android.os.SystemClock;
import e4.k0;
import e4.m0;
import java.util.Arrays;
import java.util.List;
import n3.q3;
import x4.u;
import y5.q;
import z4.i0;
/* compiled from: TrackSelectionUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a0 {
    public static q3 a(u.a aVar, List<? extends v>[] listArr) {
        boolean z10;
        q.a aVar2 = new q.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            m0 f10 = aVar.f(i10);
            List<? extends v> list = listArr[i10];
            for (int i11 = 0; i11 < f10.f25106a; i11++) {
                k0 b10 = f10.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = b10.f25083a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < b10.f25083a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        v vVar = list.get(i14);
                        if (vVar.n().equals(b10) && vVar.l(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new q3.a(b10, z11, iArr, zArr));
            }
        }
        m0 h10 = aVar.h();
        for (int i15 = 0; i15 < h10.f25106a; i15++) {
            k0 b11 = h10.b(i15);
            int[] iArr2 = new int[b11.f25083a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new q3.a(b11, false, iArr2, new boolean[b11.f25083a]));
        }
        return new q3(aVar2.h());
    }

    public static q3 b(u.a aVar, v[] vVarArr) {
        List[] listArr = new List[vVarArr.length];
        for (int i10 = 0; i10 < vVarArr.length; i10++) {
            v vVar = vVarArr[i10];
            listArr[i10] = vVar != null ? y5.q.q(vVar) : y5.q.p();
        }
        return a(aVar, listArr);
    }

    public static i0.a c(s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (sVar.d(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new i0.a(1, 0, length, i10);
    }
}
