package com.facebook.ads.redexgen.X;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
/* renamed from: com.facebook.ads.redexgen.X.k3  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1902k3 implements J6 {
    public static byte[] A04;
    public static String[] A05 = {"5xwnqBcSwQdKZIKpCxhEhIB1ehz5rbXz", "SVnny4sMHrVxDT0mCWgznsGyNwA0K29Q", "WSedDxIDZVsWQqxlis9Ww20KqcWIyEnI", "k4ruqDXMLqmQWww9EukWiXBxmglEjOwQ", "qeuUn3ZO1g9cCLbTYKy8rfCeNqsjP", "lwrAvEwGJvKZaAaN19YZU8UxJCWRUSKU", "KAMWqSOuX5oAD", "9nA6fjXGqk7Q6o3drz3rA7fb0omaCvC"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ CallableC05937o A02;
    public final /* synthetic */ C05947p A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
            if (A05[5].charAt(12) == 'F') {
                throw new RuntimeException();
            }
            A05[5] = "k7DX94ZUmS6mjbqg2Uqpnt5MM6ksEeAZ";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A05[5].charAt(12) == 'F') {
            throw new RuntimeException();
        }
        A05[4] = "84A19LE3N5skcLW3UxwckiEcHwoNq";
        A04 = new byte[]{18, 11, 8, 11, 12, 20, 11, -9, -22, -27, -26, -16};
    }

    static {
        A01();
    }

    public C1902k3(CallableC05937o callableC05937o, C05947p c05947p, long j10, long j11) {
        this.A02 = callableC05937o;
        this.A03 = c05947p;
        this.A00 = j10;
        this.A01 = j11;
    }

    @Override // com.facebook.ads.redexgen.X.J6
    public final void ACy(boolean z10) {
        AnonymousClass85 anonymousClass85;
        BlockingQueue blockingQueue;
        AnonymousClass85 anonymousClass852;
        AnonymousClass85 anonymousClass853;
        anonymousClass85 = this.A02.A01.A04;
        if (C06017w.A06(anonymousClass85)) {
            C06007v c06007v = new C06007v(this.A03.A06, this.A03.A07, A00(7, 5, 81), this.A03.A02, this.A03.A08);
            anonymousClass852 = this.A02.A01.A04;
            C06017w.A04(anonymousClass852, c06007v, z10);
            if (!z10) {
                anonymousClass853 = this.A02.A01.A04;
                C06017w.A05(anonymousClass853, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, IronSourceConstants.IS_CALLBACK_AD_DISPLAYED, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            C05987t.A0A().put(c06007v.A04, c06007v);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.J6
    public final void AD6(Throwable th) {
        AnonymousClass85 anonymousClass85;
        BlockingQueue blockingQueue;
        AnonymousClass85 anonymousClass852;
        anonymousClass85 = this.A02.A01.A04;
        if (C06017w.A06(anonymousClass85)) {
            anonymousClass852 = this.A02.A01.A04;
            C06017w.A05(anonymousClass852, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, 2119, th != null ? th.toString() : A00(0, 7, 109), null, Long.valueOf(System.currentTimeMillis() - this.A01), null);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
