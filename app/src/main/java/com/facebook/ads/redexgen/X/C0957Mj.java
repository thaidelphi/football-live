package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Mj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0957Mj extends AbstractC2037mI {
    public static byte[] A00;
    public static String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{42, 47, 107, 34, 56, 107, 37, 36, 63, 107, 57, 46, 42, 47, 50, 107, 36, 57, 107, 42, 39, 57, 46, 42, 47, 50, 107, 47, 34, 56, 59, 39, 42, 50, 46, 47, 20, 21, 28, 17, 9};
    }

    static {
        A03();
    }

    public C0957Mj(C1900k1 c1900k1, AnonymousClass37 anonymousClass37) {
        super(c1900k1, anonymousClass37);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 12), String.valueOf(System.currentTimeMillis() - j10));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls != null) {
            boolean isEmpty = trackingUrls.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (isEmpty) {
                return;
            }
            for (String str : trackingUrls) {
                new AsyncTaskC0882Jl(this.A0B, extraData).execute(str);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2037mI
    public final void A0P() {
        C2076mv c2076mv = (C2076mv) this.A01;
        if (c2076mv.A0R()) {
            AnonymousClass24 anonymousClass24 = this.A07;
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            A01[4] = "SmlVqZ";
            if (anonymousClass24 != null) {
                this.A07.A0B(c2076mv);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 55));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2037mI
    public final void A0R(AnonymousClass23 anonymousClass23, C06238t c06238t, C06218r c06218r, AnonymousClass38 anonymousClass38) {
        C2076mv c2076mv = (C2076mv) anonymousClass23;
        long currentTimeMillis = System.currentTimeMillis();
        C2033mE c2033mE = new C2033mE(this, anonymousClass38, c2076mv, currentTimeMillis, c06218r);
        A0H().postDelayed(c2033mE, c06238t.A05().A05());
        c2076mv.A0L(this.A0B, new C2032mD(this, c2033mE, currentTimeMillis, c06218r), this.A09, anonymousClass38, C1816ie.A0K());
    }
}
