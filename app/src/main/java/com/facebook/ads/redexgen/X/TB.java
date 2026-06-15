package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TB implements InterfaceC1213Wv {
    public static String[] A01 = {"ppJqPrULb4LekG4I2Ppn2VYPDrgTIjDi", "Up", "YNUP1Tu4NX", "9U7WLokpsYYRGqVKMTbwh28son95n0Iv", "mYvQzbkwQcGYxfwzAk0ENPYKs", "kyOVXftTNjAKzoublqGQ7", "xFtFu0eMM6sFzzbkxb8HfkCTA63H6V", "e7eagt87GkQgQ0LPSoDZmf6JA"};
    public final List<C1053Qh> A00;

    public TB(List<C1053Qh> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final List<C1053Qh> A7N(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final long A7t(int i10) {
        AbstractC1589es.A07(i10 == 0);
        if (A01[1].length() != 11) {
            String[] strArr = A01;
            strArr[7] = "51ri70RHbdsVJ14y1xSYrmoVi";
            strArr[4] = "BDhYjsiO5QNz85nz8Geo8NB7K";
            return 0L;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A7u() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A8Q(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
