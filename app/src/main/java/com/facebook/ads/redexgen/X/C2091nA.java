package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
/* renamed from: com.facebook.ads.redexgen.X.nA  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2091nA extends BY {
    public static byte[] A02;
    public final /* synthetic */ C2A A00;
    public final /* synthetic */ String A01;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{36, 48, 39, 51, 55, 39, 44, 33, 59, 29, 33, 35, 50, 50, 43, 44, 37};
    }

    public C2091nA(C2A c2a, String str) {
        this.A00 = c2a;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        AnonymousClass85 anonymousClass85;
        AnonymousClass85 anonymousClass852;
        CountDownLatch countDownLatch;
        boolean A0J;
        AnonymousClass29 anonymousClass29;
        AnonymousClass29 anonymousClass292;
        AnonymousClass29 anonymousClass293;
        String A01 = A01(0, 17, 81);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                anonymousClass29 = this.A00.A02;
                ((C04582g) anonymousClass29.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                anonymousClass292 = this.A00.A02;
                anonymousClass292.A07(this.A01);
                anonymousClass293 = this.A00.A02;
                anonymousClass293.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e8) {
            anonymousClass852 = this.A00.A03;
            anonymousClass852.A08().AAu(A01, AbstractC06048a.A1B, new C06058b(e8));
        } catch (JSONException e10) {
            this.A00.A0M();
            anonymousClass85 = this.A00.A03;
            anonymousClass85.A08().AAu(A01, AbstractC06048a.A1A, new C06058b(e10));
        }
    }
}
