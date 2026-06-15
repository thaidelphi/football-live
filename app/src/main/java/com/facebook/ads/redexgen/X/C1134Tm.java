package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* renamed from: com.facebook.ads.redexgen.X.Tm  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1134Tm extends W5 {
    public static byte[] A03;
    public static String[] A04 = {"qOeSqRkahsCKoKd6q1ywY7fFzJGDwKbS", "ETtTSiiNgdRhzo8NLQ4T", "rE7f23WF2NzHq0gVHBIQvIC", "Xv2tkftuBlFKChIDk8JsCAQzR9K3fgGt", "EvZoxA7p5B4Ue5aZ4dj8", "ZGkM6JqFML3mz5arrOeQjq7kfOe9szJK", "uCGPqFHd1yQvXTOldBNdcEyyQmlykfil", "UMumL3Hv7yNcb5WxOOYKtn3faJ5RL9EA"};
    public final long A00;
    public final List<C1134Tm> A01;
    public final List<C1133Tl> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 42);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-75, -8, 4, 3, 9, -10, -2, 3, -6, 7, 8, -49, -75, -126, -50, -57, -61, -40, -57, -43, -100, -126};
    }

    static {
        A01();
    }

    public C1134Tm(int i10, long j10) {
        super(i10);
        this.A00 = j10;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C1134Tm A02(int i10) {
        int size = this.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1134Tm c1134Tm = this.A01.get(i11);
            int i12 = ((W5) c1134Tm).A00;
            String[] strArr = A04;
            String str = strArr[4];
            String str2 = strArr[1];
            int i13 = str.length();
            int childrenSize = str2.length();
            if (i13 != childrenSize) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "BuhWgovJkyziR4VphAGpoHp5Dq8CRcmm";
            strArr2[6] = "G2bIuZ4kxyxa0rvNzvuWXzwuRGkQYRBI";
            if (i12 == i10) {
                return c1134Tm;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.C1133Tl A03(int r7) {
        /*
            r6 = this;
            java.util.List<com.facebook.ads.redexgen.X.Tl> r0 = r6.A02
            int r5 = r0.size()
            r4 = 0
        L7:
            if (r4 >= r5) goto L3f
            java.util.List<com.facebook.ads.redexgen.X.Tl> r0 = r6.A02
            java.lang.Object r3 = r0.get(r4)
            com.facebook.ads.redexgen.X.Tl r3 = (com.facebook.ads.redexgen.X.C1133Tl) r3
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1134Tm.A04
            r0 = 0
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 11
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L2b
        L25:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1134Tm.A04
            java.lang.String r1 = "CLZAQizgOyACgOgxgxovY826t3HZM9ND"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "kY7NnAkupyYN8qdWjfD9d65eFmUpTbGp"
            r0 = 6
            r2[r0] = r1
            int r0 = r3.A00
            if (r0 != r7) goto L3c
            return r3
        L3c:
            int r4 = r4 + 1
            goto L7
        L3f:
            r3 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1134Tm.A04
            r0 = 7
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L55
            goto L25
        L55:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1134Tm.A04
            java.lang.String r1 = "BQMuN1X7MvUK3Y53SfbSWEKVElmgJyV1"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "npMRKhYePEVKIb5MPn1LUnFO4WoNwWFr"
            r0 = 3
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1134Tm.A03(int):com.facebook.ads.redexgen.X.Tl");
    }

    public final void A04(C1134Tm c1134Tm) {
        this.A01.add(c1134Tm);
    }

    public final void A05(C1133Tl c1133Tl) {
        this.A02.add(c1133Tl);
    }

    @Override // com.facebook.ads.redexgen.X.W5
    public final String toString() {
        return W5.A04(super.A00) + A00(13, 9, 56) + Arrays.toString(this.A02.toArray()) + A00(0, 13, 107) + Arrays.toString(this.A01.toArray());
    }
}
