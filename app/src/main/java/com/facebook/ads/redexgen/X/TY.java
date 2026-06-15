package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TY implements InterfaceC1202Wj {
    public static byte[] A0C;
    public static String[] A0D = {"WF46WHJCw3SZqgir0OhX0e", "Fm6tH6FGx2F2eoHEi3xJmouac8yIuHtD", "QwVzU1PUWaoHSlEIfRInoqEV2ghoZbA4", "wjMneY5bvWAB28JkWtcJxA3MQdDdUQyN", "Z", "sSPeRGAZuf2l2BWEhdFMdqCU2CN9JTIb", "bEqy2Eixis9SHXvU", "iJDRrAM0ll7BlV6JG0oI0qSX1V3YVwgB"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C1201Wi A0A;
    public final AbstractC1205Wm A0B;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0C = new byte[]{21, 52, 123, 52, 60, 60, 123, 43, 58, 60, 62, 123, 56, 58, 53, 123, 57, 62, 123, 61, 52, 46, 53, 63, 117};
    }

    static {
        A08();
    }

    public TY(AbstractC1205Wm abstractC1205Wm, long j10, long j11, long j12, long j13, boolean z10) {
        AbstractC1589es.A07(j10 >= 0 && j11 > j10);
        this.A0B = abstractC1205Wm;
        this.A09 = j10;
        this.A08 = j11;
        if (j12 == j11 - j10 || z10) {
            this.A07 = j13;
            this.A00 = 4;
        } else {
            this.A00 = 0;
        }
        this.A0A = new C1201Wi();
    }

    private long A00(WJ wj) throws IOException {
        if (this.A04 == this.A01) {
            return -1L;
        }
        long A8d = wj.A8d();
        if (this.A0A.A04(wj, this.A01)) {
            this.A0A.A05(wj, false);
            wj.AHr();
            long offset = this.A06 - this.A0A.A05;
            int i10 = this.A0A.A01 + this.A0A.A00;
            if (0 > offset || offset >= 72000) {
                int i11 = (offset > 0L ? 1 : (offset == 0L ? 0 : -1));
                String[] strArr = A0D;
                if (strArr[5].charAt(24) != strArr[2].charAt(24)) {
                    throw new RuntimeException();
                }
                A0D[4] = "i";
                if (i11 < 0) {
                    this.A01 = A8d;
                    this.A02 = this.A0A.A05;
                } else {
                    long currentPosition = wj.A8d();
                    this.A04 = currentPosition + i10;
                    this.A05 = this.A0A.A05;
                }
                if (this.A01 - this.A04 < 100000) {
                    this.A01 = this.A04;
                    return this.A04;
                }
                long currentPosition2 = i10;
                long A8d2 = wj.A8d() - (currentPosition2 * (offset <= 0 ? 2L : 1L));
                long granuleDistance = this.A01;
                long currentPosition3 = this.A02;
                long nextPosition = A8d2 + (((granuleDistance - this.A04) * offset) / (currentPosition3 - this.A05));
                return AbstractC1672gE.A0T(nextPosition, this.A04, this.A01 - 1);
            }
            return -1L;
        } else if (this.A04 != A8d) {
            return this.A04;
        } else {
            throw new IOException(A07(0, 25, 62));
        }
    }

    private final long A01(WJ wj) throws IOException {
        this.A0A.A02();
        if (this.A0A.A03(wj)) {
            this.A0A.A05(wj, false);
            wj.AJ9(this.A0A.A01 + this.A0A.A00);
            long j10 = this.A0A.A05;
            while ((this.A0A.A04 & 4) != 4 && this.A0A.A03(wj) && wj.A8d() < this.A08) {
                C1201Wi c1201Wi = this.A0A;
                if (A0D[6].length() != 16) {
                    throw new RuntimeException();
                }
                A0D[6] = "04w2Ylrvfp1ZeLi2";
                if (!c1201Wi.A05(wj, true) || !UM.A02(wj, this.A0A.A01 + this.A0A.A00)) {
                    return j10;
                }
                j10 = this.A0A.A05;
            }
            return j10;
        }
        throw new EOFException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1202Wj
    /* renamed from: A05 */
    public final TZ A5P() {
        if (this.A07 != 0) {
            return new TZ(this);
        }
        return null;
    }

    private void A09(WJ wj) throws IOException {
        while (true) {
            this.A0A.A03(wj);
            this.A0A.A05(wj, false);
            if (this.A0A.A05 > this.A06) {
                wj.AHr();
                return;
            }
            wj.AJ9(this.A0A.A01 + this.A0A.A00);
            this.A04 = wj.A8d();
            this.A05 = this.A0A.A05;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1202Wj
    public final long AGV(WJ wj) throws IOException {
        switch (this.A00) {
            case 0:
                this.A03 = wj.A8d();
                this.A00 = 1;
                long j10 = this.A08 - 65307;
                if (j10 > this.A03) {
                    return j10;
                }
                long lastPageSearchPosition = A01(wj);
                this.A07 = lastPageSearchPosition;
                this.A00 = 4;
                return this.A03;
            case 1:
                long lastPageSearchPosition2 = A01(wj);
                this.A07 = lastPageSearchPosition2;
                this.A00 = 4;
                return this.A03;
            case 2:
                long A00 = A00(wj);
                if (A00 != -1) {
                    return A00;
                }
                this.A00 = 3;
                A09(wj);
                this.A00 = 4;
                return -(this.A05 + 2);
            case 3:
                A09(wj);
                this.A00 = 4;
                return -(this.A05 + 2);
            case 4:
                return -1L;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1202Wj
    public final void AJH(long j10) {
        this.A06 = AbstractC1672gE.A0T(j10, 0L, this.A07 - 1);
        this.A00 = 2;
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }
}
