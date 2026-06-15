package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class Wo implements InterfaceC1103Sg {
    public static byte[] A00;
    public static String[] A01 = {"zYSyEqcvaKV9i5JfBsvNMejzZnWwKZR3", "M8CuSGHxp8ic3JsizurZMVcnnPDQ9pmz", "xLEL8QPiXNMCDPpowBG1Vnyk8ZxoKJUt", "VIbb5MTSuNDmS63TxgLhr1mV0LI6YyHu", "u1XlITDExvj1CYspmNtrg0bpZ8SJM6N7", "33Nt3dJnNLiG", "MI0Hm6FG52L4I0qBYyTGCl5CoD7zBQVp", "2gvDlJ5BR9WkzqxRYaOUWhlyqmMyAQbM"};
    public static final boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[5].length() == 23) {
                throw new RuntimeException();
            }
            A01[5] = "Qj5aQ5xVHIIg7KkhjSRWqKJqCBPzgW";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 121);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-45, -40, -26, -44, -62, -57, -43, -50, -63, -19, -31, -6, -17, -18};
    }

    static {
        A01();
        A02 = A00(8, 6, 7).equals(AbstractC1672gE.A05) && (A00(4, 4, 8).equals(AbstractC1672gE.A06) || A00(0, 4, 25).equals(AbstractC1672gE.A06));
    }
}
