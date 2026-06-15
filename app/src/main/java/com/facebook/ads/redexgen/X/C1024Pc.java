package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
/* renamed from: com.facebook.ads.redexgen.X.Pc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1024Pc {
    public static String[] A09 = {"oH4mHz2pmoMiEmc", "FNnwe5pJ48jBDdyzrfy", "6B3Y16y0oyhN5n9w", "0LPEPW7cAqu8cdAaUOAifWzDrdWvA4ed", "b6drlksjVl1B6bfFfedPuk9JlcDFBzJg", "ZVWY1Q73NT7HgNsMpy9iivry", "uYXuyOCWh1KLssimYtHGEnprWxDEnyld", "Kp5WLk0jwa2GMs2962k8TW1mcd7PBbuS"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final R5 A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Must be removed when ExoPlayerImpl V1 is deprecated")
    public C1024Pc(R5 r52, long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.A04 = r52;
        this.A03 = j10;
        this.A01 = j11;
        this.A02 = j12;
        this.A00 = j13;
        this.A07 = z10;
        this.A05 = z11;
        this.A06 = false;
        this.A08 = false;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Disable Assertions for now as the ones related to isFollowedByTransitionToSameStream & isLastInTimelineWindow are not applicable toExoPlayerImpl v1")
    public C1024Pc(R5 r52, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.A04 = r52;
        this.A03 = j10;
        this.A02 = j11;
        this.A01 = j12;
        this.A00 = j13;
        this.A06 = z10;
        this.A07 = z11;
        this.A08 = z12;
        this.A05 = z13;
    }

    public final C1024Pc A00(long j10) {
        if (j10 == this.A03) {
            return this;
        }
        return new C1024Pc(this.A04, j10, this.A02, this.A01, this.A00, this.A06, this.A07, this.A08, this.A05);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A09;
        if (strArr[6].charAt(15) != strArr[4].charAt(15)) {
            String[] strArr2 = A09;
            strArr2[3] = "5qDW46fdkntaa2I2c4parXmNNddUkaHF";
            strArr2[7] = "1ybQXEasfJacqOGwnHGNPOc7Idy6z8MR";
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1024Pc c1024Pc = (C1024Pc) obj;
            if (this.A03 == c1024Pc.A03) {
                int i10 = (this.A02 > c1024Pc.A02 ? 1 : (this.A02 == c1024Pc.A02 ? 0 : -1));
                String[] strArr3 = A09;
                if (strArr3[6].charAt(15) == strArr3[4].charAt(15)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A09;
                strArr4[6] = "IMgb9po9jresJudIxLpuePSWQs5iSLwI";
                strArr4[4] = "1mRX5mnTGstlct0VA6vX9qQm2d1X403J";
                if (i10 == 0 && this.A01 == c1024Pc.A01 && this.A00 == c1024Pc.A00) {
                    boolean z10 = this.A06;
                    String[] strArr5 = A09;
                    if (strArr5[3].charAt(25) == strArr5[7].charAt(25)) {
                        String[] strArr6 = A09;
                        strArr6[3] = "KFji7aL2L9bN6bYws6YHIKeewdZbRutM";
                        strArr6[7] = "5jbbfSHUiwRjxklt5tp9byAywdKGdbz8";
                        if (z10 == c1024Pc.A06 && this.A07 == c1024Pc.A07 && this.A08 == c1024Pc.A08 && this.A05 == c1024Pc.A05 && AbstractC1672gE.A1E(this.A04, c1024Pc.A04)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new RuntimeException();
    }

    public final int hashCode() {
        int result = this.A04.hashCode();
        int result2 = (int) this.A02;
        int result3 = (int) this.A00;
        int result4 = ((((((((((17 * 31) + result) * 31) + ((int) this.A03)) * 31) + result2) * 31) + ((int) this.A01)) * 31) + result3) * 31;
        int result5 = this.A07 ? 1 : 0;
        int result6 = this.A05 ? 1 : 0;
        return ((((((result4 + (this.A06 ? 1 : 0)) * 31) + result5) * 31) + (this.A08 ? 1 : 0)) * 31) + result6;
    }
}
