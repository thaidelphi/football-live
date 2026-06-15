package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Bm  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0680Bm implements WJ {
    public static String[] A07 = {"oxLkf78OV4NmISqR8MY9co8Zkfa1", "w8oDP0kuGdOZ8m3", "3CFRvfRzEWkE4qPDDRiRFF4v8Naoq8", "h3webJp6azVi9BLWO4hNBtTzZTT8Up", "E5AuD2iWjrxVijcXBoDaMI", "d4KLOYWiobWPxCHS", "QQQLcpKn3d", "vvCId3izfqSiOj3zM05VyRbj8h8XddLP"};
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03;
    public final long A04;
    public final Q7 A05;
    public final byte[] A06;

    public C0680Bm(Q7 q72, long j10, long j11) {
        this(q72, j10, j11, false);
    }

    public C0680Bm(Q7 q72, long j10, long j11, boolean z10) {
        this.A05 = q72;
        this.A02 = j10;
        this.A04 = j11;
        this.A03 = new byte[65536];
        this.A06 = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
    }

    private int A00(int i10) {
        int bytesSkipped = Math.min(this.A00, i10);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i10, int i11) {
        if (this.A00 == 0) {
            return 0;
        }
        int min = Math.min(this.A00, i11);
        System.arraycopy(this.A03, 0, bArr, i10, min);
        A05(min);
        return min;
    }

    private int A02(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i10 + i12, i11 - i12);
            if (read == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + read;
        }
        throw new InterruptedIOException();
    }

    private void A03(int i10) {
        if (i10 != -1) {
            this.A02 += i10;
        }
    }

    private void A04(int i10) {
        int i11 = this.A01 + i10;
        int requiredLength = this.A03.length;
        if (i11 > requiredLength) {
            int requiredLength2 = this.A03.length;
            int requiredLength3 = 524288 + i11;
            int newPeekCapacity = AbstractC1672gE.A07(requiredLength2 * 2, 65536 + i11, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i10) {
        this.A00 -= i10;
        this.A01 = 0;
        byte[] bArr = this.A03;
        if (this.A00 < this.A03.length - 524288) {
            bArr = new byte[this.A00 + 65536];
        }
        byte[] newPeekBuffer = this.A03;
        System.arraycopy(newPeekBuffer, i10, bArr, 0, this.A00);
        this.A03 = bArr;
    }

    public final boolean A06(int i10, boolean z10) throws IOException {
        int A00 = A00(i10);
        while (A00 < i10 && A00 != -1) {
            int bytesSkipped = this.A06.length;
            A00 = A02(this.A06, -A00, Math.min(i10, bytesSkipped + A00), A00, z10);
        }
        A03(A00);
        return A00 != -1;
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final void A3x(int i10) throws IOException {
        A3y(i10, false);
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final boolean A3y(int i10, boolean z10) throws IOException {
        A04(i10);
        int i11 = this.A00 - this.A01;
        while (i11 < i10) {
            i11 = A02(this.A03, this.A01, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            int bytesPeeked = this.A01;
            this.A00 = bytesPeeked + i11;
        }
        int bytesPeeked2 = this.A01;
        this.A01 = bytesPeeked2 + i10;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final long A8E() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final long A8Y() {
        return this.A02 + this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final long A8d() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final Uri A9F() {
        return this.A05.A9F();
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final int AG0(byte[] bArr, int i10, int i11) throws IOException {
        int min;
        A04(i11);
        int bytesPeeked = this.A00 - this.A01;
        if (bytesPeeked == 0) {
            min = A02(this.A03, this.A01, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            int i12 = this.A00 + min;
            if (A07[1].length() == 6) {
                throw new RuntimeException();
            }
            A07[7] = "jElW23TMKGwtLnZ4hvW7O5Y18TYLCbj0";
            this.A00 = i12;
        } else {
            min = Math.min(i11, bytesPeeked);
        }
        byte[] bArr2 = this.A03;
        int peekBufferRemainingBytes = this.A01;
        System.arraycopy(bArr2, peekBufferRemainingBytes, bArr, i10, min);
        int i13 = this.A01 + min;
        if (A07[6].length() != 10) {
            this.A01 = i13;
            return min;
        }
        String[] strArr = A07;
        strArr[2] = "v4BF181lgFk01GcYFIYXx8iGSHgolU";
        strArr[0] = "wk2FofBnrpWk9Sth69Nb054wx1fh";
        this.A01 = i13;
        return min;
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final void AG1(byte[] bArr, int i10, int i11) throws IOException {
        AG2(bArr, i10, i11, false);
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final boolean AG2(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!A3y(i11, z10)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final boolean AGZ(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int A01 = A01(bArr, i10, i11);
        while (A01 < i11 && A01 != -1) {
            A01 = A02(bArr, i10, i11, A01, z10);
        }
        A03(A01);
        return A01 != -1;
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final void AHr() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final int AJ6(int i10) throws IOException {
        int bytesSkipped = A00(i10);
        if (bytesSkipped == 0) {
            bytesSkipped = A02(this.A06, 0, Math.min(i10, this.A06.length), 0, true);
        }
        A03(bytesSkipped);
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final void AJ9(int i10) throws IOException {
        A06(i10, false);
    }

    @Override // com.facebook.ads.redexgen.X.WJ, com.facebook.ads.redexgen.X.O9
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int bytesRead = A01(bArr, i10, i11);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i10, i11, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.facebook.ads.redexgen.X.WJ
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        AGZ(bArr, i10, i11, false);
    }
}
