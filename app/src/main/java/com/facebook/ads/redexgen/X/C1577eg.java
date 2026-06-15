package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.InterruptedIOException;
/* renamed from: com.facebook.ads.redexgen.X.eg  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1577eg {
    public static String[] A0A = {"6B", "ySsToJh", "gjMzoL5y", "gT80lVbo5RiDcz", "oA", "n8VZaE361wmLLsjg2P6wYWgdgyasV8np", "VCCtscDKaLvPPTi2grdYO25lcVCozFPY", "35Ux3uQ1Klf8"};
    public long A00;
    public long A01;
    public long A02;
    public final C1519dj A03;
    public final InterfaceC1562eR A04;
    public final C05084e A05;
    public final InterfaceC1576ef A06;
    public final String A07;
    public final byte[] A08;
    public volatile boolean A09;

    public C1577eg(C05084e c05084e, C1519dj c1519dj, byte[] bArr, InterfaceC1576ef interfaceC1576ef) {
        this.A05 = c05084e;
        this.A04 = c05084e.A0E();
        this.A03 = c1519dj;
        this.A08 = bArr == null ? new byte[131072] : bArr;
        this.A06 = interfaceC1576ef;
        this.A07 = c05084e.A0F().A4b(c1519dj);
        this.A02 = c1519dj.A04;
    }

    private long A00() {
        if (this.A01 == -1) {
            return -1L;
        }
        long j10 = this.A01;
        String[] strArr = A0A;
        if (strArr[4].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[5] = "6kjMmuQG1TkfolJ9wIVDKFIuhn9BLl6o";
        strArr2[6] = "Y8rjEIQQi1XOje2kOw1KRI0QX9VHUB9u";
        return j10 - this.A03.A04;
    }

    private long A01(long j10, long j11) throws IOException {
        boolean z10 = j10 + j11 == this.A01 || j11 == -1;
        long j12 = -1;
        boolean z11 = false;
        if (j11 != -1) {
            try {
                j12 = this.A05.AFq(this.A03.A04().A04(j10).A03(j11).A09());
                z11 = true;
            } catch (IOException unused) {
                AbstractC1514de.A00(this.A05);
            }
        }
        if (!z11) {
            A02();
            try {
                j12 = this.A05.AFq(this.A03.A04().A04(j10).A03(-1L).A09());
            } catch (IOException e8) {
                AbstractC1514de.A00(this.A05);
                throw e8;
            }
        }
        int i10 = 0;
        if (z10 && j12 != -1) {
            try {
                A04(j10 + j12);
            } catch (IOException e10) {
                AbstractC1514de.A00(this.A05);
                throw e10;
            }
        }
        int i11 = 0;
        while (i11 != -1) {
            A02();
            i11 = this.A05.read(this.A08, 0, this.A08.length);
            if (i11 != -1) {
                A03(i11);
                i10 += i11;
            }
        }
        if (z10) {
            A04(i10 + j10);
        }
        this.A05.close();
        return i10;
    }

    private void A02() throws InterruptedIOException {
        if (!this.A09) {
            return;
        }
        throw new InterruptedIOException();
    }

    private void A03(long j10) {
        this.A00 += j10;
        if (this.A06 != null) {
            this.A06.AEi(A00(), this.A00, j10);
        }
    }

    private void A04(long j10) {
        if (this.A01 == j10) {
            return;
        }
        this.A01 = j10;
        if (this.A06 != null) {
            this.A06.AEi(A00(), this.A00, 0L);
        }
    }

    public final void A05() throws IOException {
        long nextRequestLength;
        A02();
        this.A00 = this.A04.A71(this.A07, this.A03.A04, this.A03.A03);
        if (this.A03.A03 != -1) {
            this.A01 = this.A03.A04 + this.A03.A03;
        } else {
            long A00 = AbstractC1582el.A00(this.A04.A7I(this.A07));
            if (A00 == -1) {
                A00 = -1;
            }
            this.A01 = A00;
        }
        if (this.A06 != null) {
            this.A06.AEi(A00(), this.A00, 0L);
        }
        while (true) {
            if (this.A01 == -1 || this.A02 < this.A01) {
                A02();
                if (this.A01 == -1) {
                    nextRequestLength = Long.MAX_VALUE;
                } else {
                    long nextRequestLength2 = this.A01;
                    long blockLength = this.A02;
                    nextRequestLength = nextRequestLength2 - blockLength;
                }
                long A72 = this.A04.A72(this.A07, this.A02, nextRequestLength);
                if (A72 > 0) {
                    long blockLength2 = this.A02;
                    this.A02 = blockLength2 + A72;
                } else {
                    long nextRequestLength3 = -A72;
                    if (nextRequestLength3 == Long.MAX_VALUE) {
                        nextRequestLength3 = -1;
                    }
                    long j10 = this.A02;
                    long blockLength3 = this.A02;
                    this.A02 = j10 + A01(blockLength3, nextRequestLength3);
                }
            } else {
                return;
            }
        }
    }

    public final void A06() {
        this.A09 = true;
    }
}
