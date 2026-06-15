package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.SparseArray;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SV implements UK {
    public static String[] A0B = {"K8f68S9rBefm7hcO9rgtzzhmiKpcntQw", "zUi58", "", "CkekzyRW7v", "r8Mk", "LEa3VFljyVwCAGl8ASDI6ctSJGwLabvi", "BaPMVYNostpFPwoU7P3CV4hjiD1zwl8M", "gsDK"};
    public static final UO A0C = new UO() { // from class: com.facebook.ads.redexgen.X.SW
        @Override // com.facebook.ads.redexgen.X.UO
        public final UK[] A5D() {
            return SV.A01();
        }

        @Override // com.facebook.ads.redexgen.X.UO
        public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
            return UN.A01(this, uri, map);
        }
    };
    public long A00;
    public UL A01;
    public SX A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray<YJ> A07;
    public final YI A08;
    public final C1648fq A09;
    public final C1662g4 A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.UK
    public final int AGT(WJ wj, C1152Ug c1152Ug) throws IOException {
        AbstractC1589es.A02(this.A01);
        long A8E = wj.A8E();
        if ((A8E != -1) && !this.A08.A0E()) {
            int A0B2 = this.A08.A0B(wj, c1152Ug);
            if (A0B[2].length() != 0) {
                throw new RuntimeException();
            }
            A0B[2] = "";
            return A0B2;
        }
        A00(A8E);
        if (this.A02 == null || !this.A02.A0B()) {
            wj.AHr();
            long A8Y = A8E != -1 ? A8E - wj.A8Y() : -1L;
            if ((A8Y == -1 || A8Y >= 4) && wj.AG2(this.A09.A0l(), 0, 4, true)) {
                this.A09.A0f(0);
                int A0C2 = this.A09.A0C();
                if (A0C2 == 441) {
                    return -1;
                }
                if (A0C2 == 442) {
                    wj.AG1(this.A09.A0l(), 0, 10);
                    this.A09.A0f(9);
                    wj.AJ9((this.A09.A0I() & 7) + 14);
                    return 0;
                } else if (A0C2 == 443) {
                    wj.AG1(this.A09.A0l(), 0, 2);
                    this.A09.A0f(0);
                    wj.AJ9(this.A09.A0M() + 6);
                    return 0;
                } else if (((A0C2 & (-256)) >> 8) != 1) {
                    wj.AJ9(1);
                    return 0;
                } else {
                    int i10 = A0C2 & 255;
                    YJ yj = this.A07.get(i10);
                    if (!this.A03) {
                        if (yj == null) {
                            Y7 y72 = null;
                            if (i10 == 189) {
                                y72 = new T5();
                                this.A04 = true;
                                this.A00 = wj.A8d();
                            } else if ((i10 & 224) == 192) {
                                y72 = new C1104Sh();
                                this.A04 = true;
                                this.A00 = wj.A8d();
                            } else if ((i10 & 240) == 224) {
                                y72 = new C1118Sv();
                                this.A05 = true;
                                this.A00 = wj.A8d();
                            }
                            if (y72 != null) {
                                y72.A5S(this.A01, new YS(i10, 256));
                                yj = new YJ(y72, this.A0A);
                                this.A07.put(i10, yj);
                            }
                        }
                        if (wj.A8d() > ((this.A04 && this.A05) ? this.A00 + 8192 : 1048576L)) {
                            this.A03 = true;
                            this.A01.A6E();
                        }
                    }
                    wj.AG1(this.A09.A0l(), 0, 2);
                    this.A09.A0f(0);
                    int A0M = this.A09.A0M() + 6;
                    if (yj == null) {
                        wj.AJ9(A0M);
                        return 0;
                    }
                    this.A09.A0d(A0M);
                    wj.readFully(this.A09.A0l(), 0, A0M);
                    this.A09.A0f(6);
                    yj.A03(this.A09);
                    this.A09.A0e(this.A09.A08());
                    return 0;
                }
            }
            return -1;
        }
        return this.A02.A08(wj, c1152Ug);
    }

    public SV() {
        this(new C1662g4(0L));
    }

    public SV(C1662g4 c1662g4) {
        this.A0A = c1662g4;
        this.A09 = new C1648fq((int) CodedOutputStream.DEFAULT_BUFFER_SIZE);
        this.A07 = new SparseArray<>();
        this.A08 = new YI();
    }

    @RequiresNonNull({"output"})
    private void A00(long j10) {
        if (!this.A06) {
            this.A06 = true;
            if (this.A08.A0C() != -9223372036854775807L) {
                this.A02 = new SX(this.A08.A0D(), this.A08.A0C(), j10);
                this.A01.AID(this.A02.A09());
                return;
            }
            this.A01.AID(new C1191Vy(this.A08.A0C()));
        }
    }

    public static /* synthetic */ UK[] A01() {
        return new UK[]{new SV()};
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AA0(UL ul) {
        this.A01 = ul;
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AIC(long j10, long j11) {
        boolean z10 = false;
        boolean resetTimestampAdjuster = this.A0A.A04() == -9223372036854775807L;
        if (!resetTimestampAdjuster) {
            long A02 = this.A0A.A02();
            if (A02 != -9223372036854775807L && A02 != 0 && A02 != j11) {
                z10 = true;
            }
            resetTimestampAdjuster = z10;
        }
        if (resetTimestampAdjuster) {
            this.A0A.A07(j11);
        }
        if (this.A02 != null) {
            this.A02.A0A(j11);
        }
        for (int i10 = 0; i10 < this.A07.size(); i10++) {
            this.A07.valueAt(i10).A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final boolean AJB(WJ wj) throws IOException {
        byte[] bArr = new byte[14];
        wj.AG1(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        int packStuffingLength = bArr[13] & 7;
        wj.A3x(packStuffingLength);
        wj.AG1(bArr, 0, 3);
        int packStuffingLength2 = bArr[0];
        int i10 = (packStuffingLength2 & 255) << 16;
        int packStuffingLength3 = bArr[1];
        int i11 = i10 | ((packStuffingLength3 & 255) << 8);
        int packStuffingLength4 = bArr[2];
        return 1 == ((packStuffingLength4 & 255) | i11);
    }
}
