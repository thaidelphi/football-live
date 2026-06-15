package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class V9 extends V5 {
    public static byte[] A03;
    public static String[] A04 = {"V82MeCyFK9EUzOcQv3aCHkcB5YGijFM0", "yRWTEy", "XXPNUk1p2fLnq6rVD1k8lFaa1VRn1Yuh", "cNGjD0ozRjs1pNHnGnCLhsBvQfkYvlwl", "KGWkiuPyqvtOX7EuFRSvOvrEFI4aP547", "9CnEkbJJ1mvqN35zkBKUphM32xCtiaaX", "CNkTVaXxwtTEhPjH9BmaKJQvNACCVyBM", "24i3lXOCXpDwGQjkfmGy0ndEt5hgSpnW"};
    public long A00;
    public long[] A01;
    public long[] A02;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        byte[] bArr = {124, 109, 106, 121, 108, 113, 119, 118, 92, 83, 86, 95, 74, 85, 73, 83, 78, 83, 85, 84, 73, 29, 19, 15, 16, 4, 23, 27, 19, 5, 123, 122, 89, 113, 96, 117, 80, 117, 96, 117, 106, 119, 115, 123, 109};
        if (A04[1].length() == 31) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Y9iGrVu1LEiCE4YnE2lzq2bhBIFDqOkp";
        strArr[2] = "BW1TYfDIqaPoIIG9WB4E7s95ePhS2It5";
        A03 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.V5
    public final boolean A0C(C1648fq c1648fq, long j10) {
        if (A00(c1648fq) != 2) {
            return false;
        }
        if (A04(30, 10, 116).equals(A05(c1648fq)) && c1648fq.A07() != 0 && A00(c1648fq) == 8) {
            HashMap<String, Object> A08 = A08(c1648fq);
            Object obj = A08.get(A04(0, 8, 120));
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.A00 = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = A08.get(A04(21, 9, 22));
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get(A04(8, 13, 90));
                Object obj4 = map.get(A04(40, 5, 126));
                if (obj3 instanceof List) {
                    boolean z10 = obj4 instanceof List;
                    String[] strArr = A04;
                    if (strArr[3].charAt(2) != strArr[2].charAt(2)) {
                        A04[1] = "TGROKAxMffc6qRBtmf";
                        if (z10) {
                            List list = (List) obj3;
                            List list2 = (List) obj4;
                            int size = list2.size();
                            this.A02 = new long[size];
                            this.A01 = new long[size];
                            for (int i10 = 0; i10 < size; i10++) {
                                Object obj5 = list.get(i10);
                                Object obj6 = list2.get(i10);
                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                    this.A02 = new long[0];
                                    this.A01 = new long[0];
                                    return false;
                                }
                                this.A02[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                this.A01[i10] = ((Double) obj5).longValue();
                            }
                            return false;
                        }
                        return false;
                    }
                    throw new RuntimeException();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    static {
        A0A();
    }

    public V9() {
        super(new WN());
        this.A00 = -9223372036854775807L;
        this.A02 = new long[0];
        this.A01 = new long[0];
    }

    public static int A00(C1648fq c1648fq) {
        return c1648fq.A0I();
    }

    public static Boolean A01(C1648fq c1648fq) {
        return Boolean.valueOf(c1648fq.A0I() == 1);
    }

    public static Double A02(C1648fq c1648fq) {
        return Double.valueOf(Double.longBitsToDouble(c1648fq.A0P()));
    }

    public static Object A03(C1648fq c1648fq, int i10) {
        switch (i10) {
            case 0:
                return A02(c1648fq);
            case 1:
                return A01(c1648fq);
            case 2:
                return A05(c1648fq);
            case 3:
                return A09(c1648fq);
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                if (A04[1].length() != 31) {
                    String[] strArr = A04;
                    strArr[0] = "FWcNTHb92xG2foGl8xEkp8XRdtuKcwkx";
                    strArr[4] = "TpEVGstNvjQP5kRCNVcSZBXLTNWEPf2a";
                    return null;
                }
                throw new RuntimeException();
            case 8:
                return A08(c1648fq);
            case 10:
                return A06(c1648fq);
            case 11:
                return A07(c1648fq);
        }
    }

    public static String A05(C1648fq c1648fq) {
        int A0M = c1648fq.A0M();
        int A09 = c1648fq.A09();
        c1648fq.A0g(A0M);
        return new String(c1648fq.A0l(), A09, A0M);
    }

    public static ArrayList<Object> A06(C1648fq c1648fq) {
        int A0L = c1648fq.A0L();
        ArrayList<Object> arrayList = new ArrayList<>(A0L);
        for (int i10 = 0; i10 < A0L; i10++) {
            int count = A00(c1648fq);
            Object A032 = A03(c1648fq, count);
            if (A032 != null) {
                arrayList.add(A032);
            }
        }
        return arrayList;
    }

    public static Date A07(C1648fq c1648fq) {
        Date date = new Date((long) A02(c1648fq).doubleValue());
        c1648fq.A0g(2);
        return date;
    }

    public static HashMap<String, Object> A08(C1648fq c1648fq) {
        int A0L = c1648fq.A0L();
        HashMap<String, Object> hashMap = new HashMap<>(A0L);
        for (int i10 = 0; i10 < A0L; i10++) {
            String A05 = A05(c1648fq);
            int count = A00(c1648fq);
            Object A032 = A03(c1648fq, count);
            if (A032 != null) {
                hashMap.put(A05, A032);
            }
        }
        return hashMap;
    }

    public static HashMap<String, Object> A09(C1648fq c1648fq) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String A05 = A05(c1648fq);
            int A00 = A00(c1648fq);
            if (A00 == 9) {
                return hashMap;
            }
            Object A032 = A03(c1648fq, A00);
            if (A032 != null) {
                hashMap.put(A05, A032);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.V5
    public final boolean A0B(C1648fq c1648fq) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }

    public final long[] A0E() {
        return this.A01;
    }

    public final long[] A0F() {
        return this.A02;
    }
}
