package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class CA {
    public static byte[] A00;
    public static String[] A01 = {"NoYeCqw0NuwsBVSvR8aiyPnoj7", "APA6ODPEmALJh8xHCjcwQdd6vsoZzjc", "og2YXunKDp8EqsbnYhzdu6qR", "YLuKSEsrRIdzXIjkloLmDmBrtZDR6KFi", "8qSAHAaIpnwwIsCvL7AfoFTJYv1h46H2", "PXVMr", "05SrQOor", "5yYP5"};
    public static final Map<EnumC0662Aj, EnumC0664Al> A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{104, 74, 69, 12, 95, 11, 72, 89, 78, 74, 95, 78, 11, 106, 79, 120, 66, 81, 78, 11, 94, 88, 66, 69, 76, 11, 95, 67, 66, 88, 11, 92, 66, 79, 95, 67, 11, 74, 69, 79, 11, 67, 78, 66, 76, 67, 95, 5, 50, 9, 12, 9, 8, 16, 9, 71, 38, 3, 52, 14, 29, 2, 71, 19, 30, 23, 2, 73};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(EnumC0662Aj.A09, EnumC0664Al.A0D);
        A02.put(EnumC0662Aj.A07, EnumC0664Al.A0F);
        A02.put(EnumC0662Aj.A06, EnumC0664Al.A0E);
    }

    public static AdSize A00(EnumC0662Aj enumC0662Aj) {
        return AdSize.fromWidthAndHeight(enumC0662Aj.A04(), enumC0662Aj.A03());
    }

    public static AdSize A01(EnumC0664Al enumC0664Al) {
        for (Map.Entry<EnumC0662Aj, EnumC0664Al> entry : A02.entrySet()) {
            if (entry.getValue() == enumC0664Al) {
                EnumC0662Aj key = entry.getKey();
                if (A01[3].charAt(31) != 'z') {
                    String[] strArr = A01;
                    strArr[5] = "vUJqh";
                    strArr[7] = "m1G2X";
                    return A00(key);
                }
                throw new RuntimeException();
            }
        }
        return AdSize.BANNER_320_50;
    }

    public static EnumC0662Aj A02(int i10) {
        switch (i10) {
            case 4:
                return EnumC0662Aj.A05;
            case 5:
                return EnumC0662Aj.A06;
            case 6:
                return EnumC0662Aj.A07;
            case 7:
                return EnumC0662Aj.A09;
            case 100:
                return EnumC0662Aj.A08;
            default:
                throw new IllegalArgumentException(A06(48, 20, 117));
        }
    }

    public static EnumC0662Aj A03(int i10, int i11) {
        if (EnumC0662Aj.A08.A03() == i11 && EnumC0662Aj.A08.A04() == i10) {
            return EnumC0662Aj.A08;
        }
        if (EnumC0662Aj.A05.A03() == i11) {
            int A04 = EnumC0662Aj.A05.A04();
            String[] strArr = A01;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[3] = "mZi1y4qoTe3Eq90wST2K5ufjmqQARasa";
            if (A04 == i10) {
                return EnumC0662Aj.A05;
            }
        }
        if (EnumC0662Aj.A06.A03() == i11 && EnumC0662Aj.A06.A04() == i10) {
            return EnumC0662Aj.A06;
        }
        if (EnumC0662Aj.A07.A03() == i11 && EnumC0662Aj.A07.A04() == i10) {
            return EnumC0662Aj.A07;
        }
        if (EnumC0662Aj.A09.A03() == i11) {
            EnumC0662Aj enumC0662Aj = EnumC0662Aj.A09;
            String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[0].length()) {
                throw new RuntimeException();
            }
            A01[3] = "Hv8n5Vk5MDnKIrkb6r8Yx0AFcMxyPOg2";
            if (enumC0662Aj.A04() == i10) {
                return EnumC0662Aj.A09;
            }
        }
        throw new IllegalArgumentException(A06(0, 48, 57));
    }

    public static EnumC0662Aj A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static EnumC0664Al A05(EnumC0662Aj enumC0662Aj) {
        EnumC0664Al adTemplate = A02.get(enumC0662Aj);
        if (adTemplate == null) {
            return EnumC0664Al.A0G;
        }
        return adTemplate;
    }
}
