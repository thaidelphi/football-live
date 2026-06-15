package com.facebook.ads.redexgen.X;

import java.util.Random;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class Q3 {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ Q4 A03;

    public Q3(Q4 q42, int i10, int i11, int i12) {
        this.A03 = q42;
        this.A00 = i10;
        this.A01 = i11;
        this.A02 = i12;
    }

    public final int A00() {
        Random random = new Random();
        if (random.nextInt(this.A02) == 0) {
            if (this.A01 <= 0) {
                return this.A00;
            }
            int variation = random.nextInt() % this.A01;
            return this.A00 + variation;
        }
        return 0;
    }
}
