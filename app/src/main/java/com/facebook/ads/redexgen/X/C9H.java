package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.9H  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class C9H extends AbstractC1210Ws<C06228s, AbstractC06208q, TP> implements TQ {
    public static byte[] A01;
    public static String[] A02 = {"6qGto4Mu1KprSvsbmVYTvCLW7PL7nz4j", "XlOTzX0TGzTynhC0hgXPwT10EFz15vPS", "WbkM4S1K", "PsyIw6p1ZmHgZ2mMC7nf60", "rYNf", "r5FFICR2yLzUZPLEKflUDJmwQQtZdVuS", "CmbHiMSlwerjdu1QrBWT5PHBWFMPiv71", "mmyKCIkyofnR0xFe3rEnZHGbDK63jPPG"};
    public final String A00;

    public static String A0L(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A02[4].length() == 7) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "E4AV6ssyudXhlb20fuQmQKl7G2uypsdS";
            strArr[1] = "WTxRsHNPrGrXXkhqew0qtvaYAuLu9qge";
            copyOfRange[i13] = (byte) ((b10 - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        A01 = new byte[]{-86, -61, -70, -51, -59, -70, -72, -55, -70, -71, 117, -71, -70, -72, -60, -71, -70, 117, -70, -57, -57, -60, -57};
    }

    public abstract InterfaceC1213Wv A0g(byte[] bArr, int i10, boolean z10) throws TP;

    static {
        A0M();
    }

    public C9H(String str) {
        super(new C06228s[2], new AbstractC06208q[2]);
        this.A00 = str;
        A0d(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1H] */
    @Override // com.facebook.ads.redexgen.X.AbstractC1210Ws
    /* renamed from: A0H */
    public final C1H A0c() {
        return new AbstractC06208q(this) { // from class: com.facebook.ads.redexgen.X.1H
            public final C9H A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC06208q, com.facebook.ads.redexgen.X.AbstractC1212Wu
            public final void A0B() {
                this.A00.A0h(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1210Ws
    /* renamed from: A0I */
    public final TP A0Y(C06228s c06228s, AbstractC06208q abstractC06208q, boolean z10) {
        try {
            ByteBuffer inputData = (ByteBuffer) AbstractC1589es.A01(c06228s.A02);
            abstractC06208q.A0C(c06228s.A01, A0g(inputData.array(), inputData.limit(), z10), c06228s.A00);
            abstractC06208q.A01(RecyclerView.UNDEFINED_DURATION);
            return null;
        } catch (TP e8) {
            return e8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1210Ws
    /* renamed from: A0J */
    public final TP A0Z(Throwable th) {
        return new TP(A0L(0, 23, 78), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1210Ws
    /* renamed from: A0K */
    public final C06228s A0a() {
        return new C06228s();
    }

    public final void A0h(AbstractC06208q abstractC06208q) {
        super.A0f(abstractC06208q);
    }

    @Override // com.facebook.ads.redexgen.X.TQ
    public final void AIn(long j10) {
    }
}
