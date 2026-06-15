package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class U6 {
    public static byte[] A06;
    public static String[] A07 = {"tdwCV", "CsHNQ", "LprjeldzzXrUjUCPTr90gimg9ZxWSalE", "sIWogN0x5RKOvGxiUfuEjzE8WeyVqqEU", "TzNkpNhi6gV5WnrFGvDc3O4IIUyPUNhJ", "3W5nyFVL5dECgpmHHkfZ8EmLFqVP9FZJ", "Pa3HX2rRihBuaWsXSuUsjIC6IF", "l34tEvAUNpO9kM24Tp8EFI3kk3"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List<byte[]> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static U6 A00(C1648fq c1648fq) throws Q6 {
        try {
            c1648fq.A0g(4);
            int A0I = (c1648fq.A0I() & 3) + 1;
            if (A0I != 3) {
                ArrayList arrayList = new ArrayList();
                int A0I2 = c1648fq.A0I() & 31;
                String[] strArr = A07;
                if (strArr[1].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[6] = "dYfFF5wESFNhTGKHVrACzTmqap";
                strArr2[7] = "SP6cNON7mwmmNEsJfMC1ATt8uH";
                for (int i10 = 0; i10 < A0I2; i10++) {
                    arrayList.add(A03(c1648fq));
                }
                int A0I3 = c1648fq.A0I();
                for (int i11 = 0; i11 < A0I3; i11++) {
                    arrayList.add(A03(c1648fq));
                }
                int i12 = -1;
                int i13 = -1;
                float f10 = 1.0f;
                String str = null;
                if (A0I2 > 0) {
                    C1148Uc A09 = AbstractC1149Ud.A09((byte[]) arrayList.get(0), A0I, ((byte[]) arrayList.get(0)).length);
                    i12 = A09.A0A;
                    i13 = A09.A03;
                    f10 = A09.A00;
                    str = AbstractC1597f0.A01(A09.A08, A09.A01, A09.A04);
                }
                return new U6(arrayList, A0I, i12, i13, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw Q6.A01(A01(0, 24, 117), e8);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{120, 79, 79, 82, 79, 29, 77, 92, 79, 78, 84, 83, 90, 29, 124, 107, 126, 29, 94, 82, 83, 91, 84, 90};
    }

    static {
        A02();
    }

    public U6(List<byte[]> initializationData, int i10, int i11, int i12, float f10, String str) {
        this.A05 = initializationData;
        this.A02 = i10;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = f10;
        this.A04 = str;
    }

    public static byte[] A03(C1648fq c1648fq) {
        int A0M = c1648fq.A0M();
        int offset = c1648fq.A09();
        c1648fq.A0g(A0M);
        return AbstractC1597f0.A07(c1648fq.A0l(), offset, A0M);
    }
}
