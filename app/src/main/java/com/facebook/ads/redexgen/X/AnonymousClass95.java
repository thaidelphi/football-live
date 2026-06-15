package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.95  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AnonymousClass95 {
    public static HashMap<String, String> A00;
    public static byte[] A01;
    public static String[] A02 = {"iAmMZEnTjRyKTNBZ", "vq5cthhr", "805H8tMQ6F09oxi1Jl38UficVRLMtQ", "JBRmxZg7", "Cn5UKxgX5LOr", "xwoZ6hhdKgqxJaNY", "yguqyABz11m3k", "UOBi89mTAaMo"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].length() != 16) {
                throw new RuntimeException();
            }
            A02[0] = "gDribvuqSsGNU0u3";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 70);
            i13++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-69, -54, -54, -68, -49, -61, -58, -66, -60, -45, -45, -47, -60, -48, -56, 6, 21, 21, 27, 10, 23, 24, -15, 4, -3, -13, -5, -12, -38, -36, -47, -46, -39, -34, -30, 0, 4, 7, -10, 3, 4, 8, -7, 0, -51, -66, -59, -39, -48, -65, -52, -51, -61, -55, -56, -31, -45, -31, -31, -41, -35, -36, -19, -41, -46, -54, -41, -51, -37, -40, -46, -51};
    }

    static {
        A02();
    }

    public static synchronized Map<String, String> A01(AnonymousClass85 anonymousClass85) {
        synchronized (AnonymousClass95.class) {
            if (A00 != null) {
                return new HashMap(A00);
            }
            A00 = new HashMap<>();
            A00.put(A00(22, 6, 105), anonymousClass85.getPackageName());
            A03(anonymousClass85, A00, null);
            return new HashMap(A00);
        }
    }

    public static synchronized void A03(AnonymousClass85 anonymousClass85, Map<String, String> map, String str) {
        synchronized (AnonymousClass95.class) {
            map.put(A00(41, 3, 111), A00(65, 7, 35));
            map.put(A00(44, 11, 52), anonymousClass85.A05().A9J());
            map.put(A00(33, 2, 73), anonymousClass85.A05().A9I());
            map.put(A00(35, 6, 107), C06158l.A04);
            C06158l c06158l = new C06158l(anonymousClass85, str);
            map.put(A00(15, 7, 127), c06158l.A06());
            map.put(A00(8, 7, 61), c06158l.A05());
            map.put(A00(0, 8, 52), String.valueOf(c06158l.A04()));
            map.put(A00(28, 5, 71), c06158l.A0A());
            map.put(A00(55, 10, 72), anonymousClass85.A09().A02());
        }
    }
}
