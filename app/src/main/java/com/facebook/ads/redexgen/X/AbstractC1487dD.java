package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.dD  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1487dD {
    public static String[] A00 = {"R7kQInlCLC03eI55mV4UoORjPU15l1Rl", "ZzO4Fw17CmbIRnn7JxDv7t45eAY7DmMs", "hevIFy9SEKvPeGhnoQgR8DeAerD6ZdNb", "HjpxQ6yhMQfElXyid35YRscHlnSZG9I7", "rzaEWZkBrGf0g0umjtU3VxjwbtE55ppG", "GvaVOIcymqJKrItS6V1I7uGU5KGap44v", "MShDTByTLQibe2ZQNIrlUAOSqfC4geIC", "mUZ9sbq8ymwYO1NsTw9D4lQs8os5nO51"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Y4 A01(C1482d8 c1482d8, List<? extends InterfaceC1484dA>[] listArr) {
        C4T c4t = new C4T();
        int i10 = 0;
        while (true) {
            boolean z10 = false;
            if (i10 >= c1482d8.A02()) {
                break;
            }
            C1063Qs A07 = c1482d8.A07(i10);
            List<? extends InterfaceC1484dA> list = listArr[i10];
            int i11 = 0;
            while (i11 < A07.A01) {
                C1246Yc A05 = A07.A05(i11);
                boolean z11 = c1482d8.A05(i10, i11, z10) != 0;
                int[] iArr = new int[A05.A01];
                boolean[] zArr = new boolean[A05.A01];
                for (int i12 = 0; i12 < A05.A01; i12++) {
                    iArr[i12] = c1482d8.A04(i10, i11, i12);
                    boolean z12 = false;
                    int i13 = 0;
                    while (true) {
                        if (i13 < list.size()) {
                            InterfaceC1484dA interfaceC1484dA = list.get(i13);
                            if (interfaceC1484dA.A9B().equals(A05) && interfaceC1484dA.A9w(i12) != -1) {
                                z12 = true;
                                break;
                            }
                            i13++;
                        }
                    }
                    zArr[i12] = z12;
                }
                c4t.A04(new Y5(A05, z11, iArr, zArr));
                i11++;
                z10 = false;
            }
            i10++;
        }
        C1063Qs A06 = c1482d8.A06();
        for (int i14 = 0; i14 < A06.A01; i14++) {
            C1246Yc A052 = A06.A05(i14);
            int[] iArr2 = new int[A052.A01];
            Arrays.fill(iArr2, 0);
            c4t.A04(new Y5(A052, false, iArr2, new boolean[A052.A01]));
        }
        return new Y4(c4t.A05());
    }

    public static Y4 A00(C1482d8 c1482d8, InterfaceC1484dA[] interfaceC1484dAArr) {
        List[] listArr = new List[interfaceC1484dAArr.length];
        int i10 = 0;
        while (true) {
            int length = interfaceC1484dAArr.length;
            String[] strArr = A00;
            String str = strArr[4];
            String str2 = strArr[5];
            int i11 = str.charAt(2);
            if (i11 != str2.charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[4] = "LAaHcxAlJ7MPQdTlk2xlyXuEgB8WHW8x";
            strArr2[5] = "XLammvrN6cDBpSJb0F463ht2L3NlIFBq";
            if (i10 < length) {
                InterfaceC1484dA interfaceC1484dA = interfaceC1484dAArr[i10];
                listArr[i10] = interfaceC1484dA != null ? OI.A04(interfaceC1484dA) : C0958Mm.A01();
                i10++;
            } else {
                return A01(c1482d8, listArr);
            }
        }
    }
}
