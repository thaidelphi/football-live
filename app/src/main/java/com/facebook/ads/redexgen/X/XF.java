package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class XF implements RV {
    public static String[] A0F = {"64Y01eiq9F3wZpA", "1H", "NkQGmALLm5y5O9xtCMyW0C1Q4gk2kTac", "El", "Bo9m1plskAR", "Pv8h82", "6YqkY2q4SFEg1mfIoOUgVxUHLpYvBtpE", "RCtsEl9Sla98gt5KuR9mkh5SSkkB1mOx"};
    public long A03;
    public long A04;
    public SY A09;
    public boolean A0D;
    public boolean A0E;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public RT A07 = RT.A05;
    public RT A08 = RT.A05;
    public RT A05 = RT.A05;
    public RT A06 = RT.A05;
    public ByteBuffer A0A = RV.A00;
    public ShortBuffer A0C = this.A0A.asShortBuffer();
    public ByteBuffer A0B = RV.A00;
    public int A02 = -1;

    public final long A00(long j10) {
        if (this.A04 >= 1024) {
            long A0I = this.A03 - ((SY) AbstractC1589es.A01(this.A09)).A0I();
            if (this.A06.A03 == this.A05.A03) {
                long j11 = this.A04;
                if (A0F[5].length() != 23) {
                    A0F[3] = "4b";
                    long processedInputBytes = AbstractC1672gE.A0U(j10, A0I, j11);
                    return processedInputBytes;
                }
                throw new RuntimeException();
            }
            long processedInputBytes2 = this.A06.A03;
            long j12 = A0I * processedInputBytes2;
            long j13 = this.A04;
            long processedInputBytes3 = this.A05.A03;
            return AbstractC1672gE.A0U(j10, j12, j13 * processedInputBytes3);
        }
        return (long) (this.A01 * j10);
    }

    public final void A01(float f10) {
        if (this.A00 != f10) {
            this.A00 = f10;
            this.A0E = true;
        }
    }

    public final void A02(float f10) {
        if (this.A01 != f10) {
            this.A01 = f10;
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0F[3] = "HH";
            this.A0E = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.RV
    public final RT A4x(RT rt) throws RU {
        int i10;
        if (rt.A02 == 2) {
            if (this.A02 == -1) {
                i10 = rt.A03;
            } else {
                i10 = this.A02;
            }
            this.A07 = rt;
            this.A08 = new RT(i10, rt.A01, 2);
            this.A0E = true;
            return this.A08;
        }
        throw new RU(rt);
    }

    @Override // com.facebook.ads.redexgen.X.RV
    public final ByteBuffer A8T() {
        int A0H;
        SY sy = this.A09;
        if (sy != null && (A0H = sy.A0H()) > 0) {
            if (this.A0A.capacity() < A0H) {
                this.A0A = ByteBuffer.allocateDirect(A0H).order(ByteOrder.nativeOrder());
                this.A0C = this.A0A.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            sy.A0L(this.A0C);
            this.A04 += A0H;
            this.A0A.limit(A0H);
            this.A0B = this.A0A;
        }
        ByteBuffer outputBuffer = this.A0B;
        this.A0B = RV.A00;
        return outputBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.RV
    public final boolean AAA() {
        return this.A08.A03 != -1 && (Math.abs(this.A01 - 1.0f) >= 1.0E-4f || Math.abs(this.A00 - 1.0f) >= 1.0E-4f || this.A08.A03 != this.A07.A03);
    }

    @Override // com.facebook.ads.redexgen.X.RV
    public final boolean AAE() {
        return this.A0D && (this.A09 == null || this.A09.A0H() == 0);
    }

    @Override // com.facebook.ads.redexgen.X.RV
    public final void AGO() {
        if (this.A09 != null) {
            this.A09.A0K();
        }
        this.A0D = true;
    }

    @Override // com.facebook.ads.redexgen.X.RV
    public final void AGP(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.A03 += remaining;
        ((SY) AbstractC1589es.A01(this.A09)).A0M(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.facebook.ads.redexgen.X.RV
    public final void flush() {
        if (AAA()) {
            this.A05 = this.A07;
            this.A06 = this.A08;
            boolean z10 = this.A0E;
            if (A0F[5].length() == 23) {
                throw new RuntimeException();
            }
            A0F[6] = "nABkzj0ONUgYqIiLmATRDflypjLu9m6H";
            if (z10) {
                this.A09 = new SY(this.A05.A03, this.A05.A01, this.A01, this.A00, this.A06.A03);
            } else if (this.A09 != null) {
                this.A09.A0J();
            }
        }
        this.A0B = RV.A00;
        this.A03 = 0L;
        this.A04 = 0L;
        this.A0D = false;
    }
}
