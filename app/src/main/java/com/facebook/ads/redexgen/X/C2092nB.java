package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
/* renamed from: com.facebook.ads.redexgen.X.nB  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2092nB extends BY {
    public static byte[] A02;
    public final /* synthetic */ C2A A00;
    public final /* synthetic */ String A01;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C2092nB(C2A c2a, String str) {
        this.A00 = c2a;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        AnonymousClass85 anonymousClass85;
        AnonymousClass85 anonymousClass852;
        CountDownLatch countDownLatch;
        AnonymousClass29 anonymousClass29;
        AnonymousClass29 anonymousClass292;
        AnonymousClass29 anonymousClass293;
        boolean A0J;
        AnonymousClass29 anonymousClass294;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            anonymousClass29 = this.A00.A02;
            synchronized (anonymousClass29) {
                anonymousClass292 = this.A00.A02;
                Iterator<String> keys = anonymousClass292.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        C2A c2a = this.A00;
                        anonymousClass294 = this.A00.A02;
                        c2a.A0E((C04582g) anonymousClass294.A05().get(next), next, next.equals(this.A01));
                    }
                }
                anonymousClass293 = this.A00.A02;
                anonymousClass293.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e8) {
            anonymousClass852 = this.A00.A03;
            C8Z A08 = anonymousClass852.A08();
            String encryptedId = A01(0, 17, 22);
            A08.AAu(encryptedId, AbstractC06048a.A1B, new C06058b(e8));
        } catch (JSONException e10) {
            this.A00.A0M();
            anonymousClass85 = this.A00.A03;
            C8Z A082 = anonymousClass85.A08();
            String encryptedId2 = A01(0, 17, 22);
            A082.AAu(encryptedId2, AbstractC06048a.A1A, new C06058b(e10));
        }
    }
}
