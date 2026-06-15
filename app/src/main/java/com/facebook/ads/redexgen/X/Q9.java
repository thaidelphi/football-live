package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class Q9 {
    public static final R5 A0E = new R5(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final MI A03;
    public final Timeline A04;
    public final R5 A05;
    public final R5 A06;
    public final C1063Qs A07;
    public final C1491dH A08;
    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public Q9(Timeline timeline, long j10, C1063Qs c1063Qs, C1491dH c1491dH) {
        this(timeline, A0E, j10, -9223372036854775807L, 1, false, c1063Qs, c1491dH, A0E, j10, j10, j10, MI.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public Q9(Timeline timeline, R5 r52, long j10, long j11, int i10, boolean z10, C1063Qs c1063Qs, C1491dH c1491dH, R5 r53, long j12, long j13, long j14) {
        this(timeline, r52, j10, j11, i10, z10, c1063Qs, c1491dH, r53, j12, j13, j14, MI.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public Q9(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) R5 r52, long j10, long j11, int i10, boolean z10, C1063Qs c1063Qs, C1491dH c1491dH, R5 r53, long j12, long j13, long j14, MI mi, boolean z11) {
        this.A04 = timeline;
        this.A06 = r52;
        this.A02 = j10;
        this.A01 = j11;
        this.A0C = j10;
        this.A00 = i10;
        this.A0A = z10;
        this.A07 = c1063Qs;
        this.A08 = c1491dH;
        this.A05 = r53;
        this.A0B = j12;
        this.A0D = j13;
        this.A0C = j14;
        this.A03 = mi;
        this.A09 = z11;
    }

    public static void A00(Q9 q92, Q9 q93) {
        q93.A0C = q92.A0C;
        q93.A0B = q92.A0B;
        q93.A0D = q92.A0D;
    }

    public final Q9 A01(int i10) {
        Q9 q92 = new Q9(this.A04, this.A06, this.A02, this.A01, i10, this.A0A, this.A07, this.A08, this.A05, this.A0B, this.A0D, this.A0C, this.A03, this.A09);
        A00(this, q92);
        return q92;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final Q9 A02(int i10, MI mi, boolean z10) {
        Q9 q92 = new Q9(this.A04, this.A06, this.A02, this.A01, i10, this.A0A, this.A07, this.A08, this.A05, this.A0B, this.A0D, this.A0C, mi, z10);
        A00(this, q92);
        return q92;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final Q9 A03(int i10, boolean z10) {
        Q9 q92 = new Q9(this.A04, this.A06, this.A02, this.A01, i10, this.A0A, this.A07, this.A08, this.A05, this.A0B, this.A0D, this.A0C, this.A03, z10);
        A00(this, q92);
        return q92;
    }

    public final Q9 A04(Timeline timeline) {
        Q9 q92 = new Q9(timeline, this.A06, this.A02, this.A01, this.A00, this.A0A, this.A07, this.A08, this.A05, this.A0B, this.A0D, this.A0C, this.A03, this.A09);
        A00(this, q92);
        return q92;
    }

    public final Q9 A05(R5 r52) {
        return new Q9(this.A04, this.A06, this.A02, this.A01, this.A00, this.A0A, this.A07, this.A08, r52, this.A0B, this.A0D, this.A0C, this.A03, this.A09);
    }

    public final Q9 A06(R5 r52, long j10, long j11, long j12) {
        long j13 = j11;
        Timeline timeline = this.A04;
        if (!r52.A00()) {
            j13 = -9223372036854775807L;
        }
        return new Q9(timeline, r52, j10, j13, this.A00, this.A0A, this.A07, this.A08, this.A05, this.A0B, j12, j10);
    }

    public final Q9 A07(C1063Qs c1063Qs, C1491dH c1491dH) {
        Q9 q92 = new Q9(this.A04, this.A06, this.A02, this.A01, this.A00, this.A0A, c1063Qs, c1491dH, this.A05, this.A0B, this.A0D, this.A0C, this.A03, this.A09);
        A00(this, q92);
        return q92;
    }

    public final Q9 A08(boolean z10) {
        Q9 q92 = new Q9(this.A04, this.A06, this.A02, this.A01, this.A00, z10, this.A07, this.A08, this.A05, this.A0B, this.A0D, this.A0C, this.A03, this.A09);
        A00(this, q92);
        return q92;
    }
}
