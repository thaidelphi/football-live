package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.nC  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2093nC extends BY {
    public static byte[] A02;
    public final /* synthetic */ C2A A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{117, 97, 118, 98, 102, 118, 125, 112, 106, 76, 112, 114, 99, 99, 122, 125, 116};
    }

    public C2093nC(C2A c2a, JSONObject jSONObject) {
        this.A00 = c2a;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        AnonymousClass85 anonymousClass85;
        AnonymousClass85 anonymousClass852;
        CountDownLatch countDownLatch;
        AnonymousClass29 anonymousClass29;
        AnonymousClass29 anonymousClass292;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            anonymousClass29 = this.A00.A02;
            synchronized (anonymousClass29) {
                anonymousClass292 = this.A00.A02;
                anonymousClass292.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e8) {
            anonymousClass852 = this.A00.A03;
            anonymousClass852.A08().AAu(A01(0, 17, 25), AbstractC06048a.A1B, new C06058b(e8));
        } catch (JSONException e10) {
            this.A00.A0M();
            anonymousClass85 = this.A00.A03;
            anonymousClass85.A08().AAu(A01(0, 17, 25), AbstractC06048a.A1A, new C06058b(e10));
        }
    }
}
