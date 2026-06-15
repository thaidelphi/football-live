package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class DL {
    public static byte[] A00;
    public static String[] A01 = {"cuUzkH3QdbH3cJp2RF", "kphHRdIOrc0r15jsPfyG2Jy", "YnKzEWoXtdzuP95TROGjIP", "O6qhnuon9ci7avdCdn", "JszjlqJauoZ2AkEe", "2iwMqZkAQKEhQz1BEXGjAw", "tv2fwm9vcfvUl0RC5d9GYW3eB7CSJdU", "VWHYkG5jfvcYH9oXKfgyVS7MLxk2p9iO"};
    public static final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "jOZxNa7dXP1jVDPJoO";
            strArr2[0] = "z9aGKGtKVlVAFuhw7X";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 48);
            i13++;
        }
    }

    public static void A02() {
        A00 = new byte[]{79, 119, 122, 71, 92, 90, 79, 75, 86, 80, 81, 31, 86, 81, 31, 72, 86, 81, 91, 80, 72, 31, 86, 81, 89, 80, 31, 92, 87, 90, 92, 84, 98, 108, 112, 110, 124, 104, 123, 109, 91, 87, 66, 15, 20, 14, 22, 4, 96, 113, 115, 124, 112, 117, 100, 113, 117, 110, 96, 99};
    }

    static {
        A02();
        A02 = DL.class.getSimpleName();
    }

    public static Map<String, String> A01(C1900k1 c1900k1) {
        Window window;
        HashMap hashMap = new HashMap();
        if (c1900k1 == null) {
            return hashMap;
        }
        try {
            hashMap.put(A00(40, 3, 0), String.valueOf(A04(c1900k1)));
            Activity A0E = c1900k1.A0E();
            if (A0E != null && (window = A0E.getWindow()) != null) {
                int i10 = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                hashMap.put(A00(58, 2, 39), Integer.toString(flags));
                int type = 4194304 & i10;
                String A002 = A00(1, 1, 118);
                String flagDismissKeyguardEnabled = A00(0, 1, 79);
                hashMap.put(A00(48, 5, 39), type > 0 ? A002 : flagDismissKeyguardEnabled);
                int type2 = 524288 & i10;
                if (A01[6].length() == 6) {
                    throw new RuntimeException();
                }
                A01[7] = "5jjmsuOSeLdxH4ITovSaNkR7tPO8fpvx";
                if (type2 <= 0) {
                    A002 = flagDismissKeyguardEnabled;
                }
                hashMap.put(A00(53, 5, 50), A002);
            }
        } catch (Exception e8) {
            Log.e(A02, A00(2, 30, 15), e8);
            C8Z A08 = c1900k1.A08();
            int type3 = AbstractC06048a.A2T;
            A08.AAu(A00(43, 5, 77), type3, new C06058b(e8));
        }
        return hashMap;
    }

    public static boolean A03(C1900k1 c1900k1) {
        return !D4.A04(A01(c1900k1));
    }

    public static boolean A04(C1900k1 c1900k1) {
        KeyguardManager keyguardManager = (KeyguardManager) c1900k1.getSystemService(A00(32, 8, 57));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
