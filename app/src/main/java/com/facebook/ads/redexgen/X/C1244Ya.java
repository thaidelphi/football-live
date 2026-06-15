package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Ya  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1244Ya {
    public final int A00;
    public final long A01;

    public C1244Ya(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static C1244Ya A00(WJ wj, C1648fq c1648fq) throws IOException {
        wj.AG1(c1648fq.A0l(), 0, 8);
        c1648fq.A0f(0);
        int A0C = c1648fq.A0C();
        long size = c1648fq.A0O();
        return new C1244Ya(A0C, size);
    }
}
