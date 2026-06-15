package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class Q5 implements InterfaceC1496dM {
    public int A00;
    public int A01;
    public int A02;
    public C1494dK[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public Q5(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public Q5(boolean z10, int i10, int i11) {
        AbstractC1589es.A07(i10 > 0);
        AbstractC1589es.A07(i11 >= 0);
        this.A05 = z10;
        this.A04 = i10;
        this.A01 = i11;
        this.A03 = new C1494dK[i11 + 100];
        if (i11 > 0) {
            this.A06 = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.A03[i12] = new C1494dK(this.A06, i12 * i10);
            }
            return;
        }
        this.A06 = null;
    }

    public final synchronized int A00() {
        return this.A00 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i10) {
        boolean targetBufferSizeReduced = i10 < this.A02;
        this.A02 = i10;
        if (targetBufferSizeReduced) {
            AJY();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1496dM
    public final synchronized C1494dK A3z() {
        C1494dK c1494dK;
        this.A00++;
        if (this.A01 > 0) {
            C1494dK[] c1494dKArr = this.A03;
            int i10 = this.A01 - 1;
            this.A01 = i10;
            c1494dK = (C1494dK) AbstractC1589es.A01(c1494dKArr[i10]);
            this.A03[this.A01] = null;
        } else {
            c1494dK = new C1494dK(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (C1494dK[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return c1494dK;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1496dM
    public final int A88() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1496dM
    public final synchronized void AGl(C1494dK c1494dK) {
        C1494dK[] c1494dKArr = this.A03;
        int i10 = this.A01;
        this.A01 = i10 + 1;
        c1494dKArr[i10] = c1494dK;
        this.A00--;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1496dM
    public final synchronized void AGm(InterfaceC1495dL interfaceC1495dL) {
        while (interfaceC1495dL != null) {
            C1494dK[] c1494dKArr = this.A03;
            int i10 = this.A01;
            this.A01 = i10 + 1;
            c1494dKArr[i10] = interfaceC1495dL.A6k();
            this.A00--;
            interfaceC1495dL = interfaceC1495dL.ABx();
        }
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1496dM
    public final synchronized void AJY() {
        int A05 = AbstractC1672gE.A05(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int max = Math.max(0, A05 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (max >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C1494dK highAllocation = (C1494dK) AbstractC1589es.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C1494dK lowAllocation = (C1494dK) AbstractC1589es.A01(this.A03[highIndex]);
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            max = Math.max(max, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (max >= targetAllocationCount5) {
                return;
            }
        }
        C1494dK[] c1494dKArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c1494dKArr, max, targetAvailableCount, (Object) null);
        this.A01 = max;
    }
}
