package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class YB {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC1157Uo A07;

    public YB(InterfaceC1157Uo interfaceC1157Uo) {
        this.A07 = interfaceC1157Uo;
    }

    public final void A00() {
        this.A05 = false;
        this.A04 = false;
        this.A06 = false;
        this.A00 = -1;
    }

    public final void A01(int i10, long j10) {
        this.A00 = i10;
        this.A06 = false;
        boolean z10 = true;
        this.A05 = i10 == 182 || i10 == 179;
        if (i10 != 182) {
            z10 = false;
        }
        this.A04 = z10;
        this.A01 = 0;
        this.A03 = j10;
    }

    public final void A02(long j10, int flags, boolean z10) {
        if (this.A00 == 182 && z10 && this.A05 && this.A03 != -9223372036854775807L) {
            this.A07.AI0(this.A03, this.A06 ? 1 : 0, (int) (j10 - this.A02), flags, null);
        }
        int size = this.A00;
        if (size != 179) {
            this.A02 = j10;
        }
    }

    public final void A03(byte[] bArr, int i10, int i11) {
        if (this.A04) {
            int i12 = (i10 + 1) - this.A01;
            if (i12 < i11) {
                int headerOffset = bArr[i12];
                this.A06 = ((headerOffset & 192) >> 6) == 0;
                this.A04 = false;
                return;
            }
            this.A01 += i11 - i10;
        }
    }
}
