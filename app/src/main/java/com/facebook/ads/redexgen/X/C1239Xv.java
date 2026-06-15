package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.Xv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1239Xv {
    public static byte[] A04;
    public static String[] A05 = {"hjpknHLaZZjTdZzPCplZgY68kqFKs9mJ", "fo5QOU9KZ1ze1tQ2eGsYwj31w4KFQTsD", "06z", "6Z72OwuEHb40vMQfmYIas25Gx5L8ij", "zgyYojDCJH22MHpnUjUFo8SKgGpe9h", "JcVFSl2tthjhNAn0lu8TGNWCgvyky9P9", "deNP2WXA6WXugCSEshlHSlwQbr3L", "kabWlZRWqkAXFRNcB1wCIj8czJ08"};
    public final int A00;
    public final String A01;
    public final String A02;
    public final Set<String> A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{39, 3, 113};
    }

    static {
        A03();
    }

    public C1239Xv(String str, int i10, String str2, Set<String> classes) {
        this.A00 = i10;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = classes;
    }

    public static C1239Xv A00() {
        Set emptySet = Collections.emptySet();
        String A02 = A02(0, 0, 1);
        return new C1239Xv(A02, 0, A02, emptySet);
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0054 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C1239Xv A01(java.lang.String r6, int r7) {
        /*
            java.lang.String r5 = r6.trim()
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            com.facebook.ads.redexgen.X.AbstractC1589es.A07(r0)
            r2 = 0
            r1 = 1
            r0 = 33
            java.lang.String r0 = A02(r2, r1, r0)
            int r2 = r5.indexOf(r0)
            r0 = -1
            r4 = 0
            if (r2 != r0) goto L5e
            r6 = 0
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1239Xv.A05
            r0 = 5
            r1 = r1[r0]
            r0 = 24
            char r1 = r1.charAt(r0)
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L71
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1239Xv.A05
            java.lang.String r1 = "TPv4WQIeZgDhTbeMgiDwQ4K3MF2s0D1K"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "YOSfeERLZnTaiYt6KgbGqR9k755H0tYs"
            r0 = 0
            r2[r0] = r1
            r0 = 1
            java.lang.String r1 = A02(r6, r3, r0)
        L3f:
            r3 = 1
            r2 = 2
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r0 = A02(r3, r2, r0)
            java.lang.String[] r5 = com.facebook.ads.redexgen.X.AbstractC1672gE.A1O(r5, r0)
            r4 = r5[r4]
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2 = 1
        L53:
            int r0 = r5.length
            if (r2 >= r0) goto L6b
            r0 = r5[r2]
            r3.add(r0)
            int r2 = r2 + 1
            goto L53
        L5e:
            java.lang.String r0 = r5.substring(r2)
            java.lang.String r1 = r0.trim()
            java.lang.String r5 = r5.substring(r4, r2)
            goto L3f
        L6b:
            com.facebook.ads.redexgen.X.Xv r0 = new com.facebook.ads.redexgen.X.Xv
            r0.<init>(r4, r7, r1, r3)
            return r0
        L71:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1239Xv.A01(java.lang.String, int):com.facebook.ads.redexgen.X.Xv");
    }
}
