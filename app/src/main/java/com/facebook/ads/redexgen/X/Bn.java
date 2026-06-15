package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class Bn extends XP {
    public static String[] A07 = {"ETuOwlYjYul9zkA4fGtfF", "aBK55jqhoYPI6tBlBGZYtxPyfwORMvr1", "Tyi8uYfz0kT0njieIfg0GIa5yh3S", "hjKekpZ4HHcVQsarVLOH9n7l26qbTdm5", "qnSO7AN547oeh1mrlvOUF4IGCPV3xu2X", "ilSzySB9shWP2y3EEj0bsnfKUaBWveMD", "sRiZjNrcupZhfbe47sVeyZEscMAwLRsr", "qcRY9ff8fQWXilSHsvES5W6L15S7peac"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public byte[] A06 = AbstractC1672gE.A07;

    @Override // com.facebook.ads.redexgen.X.XP
    public final RT A09(RT rt) throws RU {
        if (rt.A02 == 2) {
            this.A05 = true;
            return (this.A03 == 0 && this.A02 == 0) ? RT.A05 : rt;
        }
        throw new RU(rt);
    }

    @Override // com.facebook.ads.redexgen.X.XP
    public final void A0A() {
        if (this.A05) {
            this.A05 = false;
            this.A06 = new byte[this.A02 * super.A05.A00];
            this.A01 = this.A03 * super.A05.A00;
        }
        this.A00 = 0;
        if (A07[4].charAt(22) == 'l') {
            throw new RuntimeException();
        }
        A07[1] = "NBpmV7a1Qv9CVABZrqH3PQnawFgATwie";
    }

    @Override // com.facebook.ads.redexgen.X.XP
    public final void A0B() {
        if (this.A05) {
            if (this.A00 > 0) {
                this.A04 += this.A00 / super.A05.A00;
            }
            this.A00 = 0;
        }
    }

    public final long A0C() {
        return this.A04;
    }

    public final void A0D() {
        this.A04 = 0L;
    }

    public final void A0E(int i10, int i11) {
        this.A03 = i10;
        this.A02 = i11;
    }

    @Override // com.facebook.ads.redexgen.X.XP, com.facebook.ads.redexgen.X.RV
    public final ByteBuffer A8T() {
        if (super.AAE() && this.A00 > 0) {
            A00(this.A00).put(this.A06, 0, this.A00).flip();
            this.A00 = 0;
        }
        return super.A8T();
    }

    @Override // com.facebook.ads.redexgen.X.XP, com.facebook.ads.redexgen.X.RV
    public final boolean AAE() {
        return super.AAE() && this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.X.RV
    public final void AGP(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int remaining = byteBuffer.limit();
        int i10 = remaining - position;
        if (i10 == 0) {
            return;
        }
        int position2 = this.A01;
        int min = Math.min(i10, position2);
        long j10 = this.A04;
        int position3 = super.A05.A00;
        this.A04 = j10 + (min / position3);
        int position4 = this.A01;
        this.A01 = position4 - min;
        byteBuffer.position(position + min);
        int position5 = this.A01;
        if (position5 > 0) {
            return;
        }
        int endBufferBytesToOutput = i10 - min;
        int limit = this.A00;
        int position6 = this.A06.length;
        int limit2 = (limit + endBufferBytesToOutput) - position6;
        ByteBuffer buffer = A00(limit2);
        int position7 = this.A00;
        int trimBytes = AbstractC1672gE.A07(limit2, 0, position7);
        buffer.put(this.A06, 0, trimBytes);
        int limit3 = AbstractC1672gE.A07(limit2 - trimBytes, 0, endBufferBytesToOutput);
        int position8 = byteBuffer.position();
        byteBuffer.limit(position8 + limit3);
        buffer.put(byteBuffer);
        byteBuffer.limit(remaining);
        int endBufferBytesToOutput2 = endBufferBytesToOutput - limit3;
        int position9 = this.A00;
        this.A00 = position9 - trimBytes;
        byte[] bArr = this.A06;
        byte[] bArr2 = this.A06;
        int position10 = this.A00;
        System.arraycopy(bArr, trimBytes, bArr2, 0, position10);
        byte[] bArr3 = this.A06;
        int position11 = this.A00;
        byteBuffer.get(bArr3, position11, endBufferBytesToOutput2);
        int position12 = this.A00;
        this.A00 = position12 + endBufferBytesToOutput2;
        buffer.flip();
    }
}
