package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Uq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1159Uq {
    public static String[] A04 = {"xCoJzPgzKUchbaEdVClXZMHQUIC9H0Nk", "cNasmXDH8gcx5", "epkJZWWW7ZVDYS4rbE5Y5CZXzFLDbaU1", "g", "Hir7mIcBYzl3xY2Tt9Szbii0KnRYb6Sf", "MAafMhlkN7cS2", "jUdTAu7yQtwk1kKiO2s7EtU", "kajnQcz6AblfPyvwBg9T4KTMJZaWxt5G"};
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public C1159Uq(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        AbstractC1589es.A08(this.A01 >= 0 && (this.A01 < this.A02 || (this.A01 == this.A02 && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int i10) {
        int bitsRead = this.A01;
        int tempByteOffset = Math.min(i10, 8 - this.A00);
        int i11 = bitsRead + 1;
        int tempByteOffset2 = this.A03[bitsRead];
        int tempByteOffset3 = ((tempByteOffset2 & 255) >> this.A00) & (255 >> (8 - tempByteOffset));
        while (tempByteOffset < i10) {
            int returnValue = this.A03[i11];
            tempByteOffset3 |= (returnValue & 255) << tempByteOffset;
            tempByteOffset += 8;
            i11++;
        }
        int returnValue2 = (-1) >>> (32 - i10);
        int tempByteOffset4 = tempByteOffset3 & returnValue2;
        A03(i10);
        return tempByteOffset4;
    }

    public final void A03(int i10) {
        int i11 = i10 / 8;
        int numBytes = this.A01;
        this.A01 = numBytes + i11;
        int numBytes2 = i11 * 8;
        this.A00 += i10 - numBytes2;
        if (this.A00 > 7) {
            int numBytes3 = this.A01;
            int i12 = numBytes3 + 1;
            if (A04[7].length() != 32) {
                throw new RuntimeException();
            }
            A04[3] = "1uT";
            this.A01 = i12;
            int numBytes4 = this.A00;
            this.A00 = numBytes4 - 8;
        }
        A00();
    }

    public final boolean A04() {
        boolean returnValue = (((this.A03[this.A01] & 255) >> this.A00) & 1) == 1;
        A03(1);
        return returnValue;
    }
}
