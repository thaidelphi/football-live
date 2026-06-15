package com.facebook.ads.redexgen.X;

import java.io.FileNotFoundException;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Pq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1038Pq implements InterfaceC1536e1 {
    public final int A00;

    public C1038Pq() {
        this(-1);
    }

    public C1038Pq(int i10) {
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1536e1
    public final int A8P(int i10) {
        if (this.A00 == -1) {
            if (i10 == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1536e1
    public final long A8k(C1535e0 c1535e0) {
        IOException iOException = c1535e0.A03;
        if ((iOException instanceof Q6) || (iOException instanceof FileNotFoundException) || (iOException instanceof C5I) || (iOException instanceof C1546eB) || C1512dc.A06(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c1535e0.A00 - 1) * 1000, 5000);
    }
}
