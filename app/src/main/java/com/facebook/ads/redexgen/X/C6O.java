package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Looper;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;
/* renamed from: com.facebook.ads.redexgen.X.6O  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C6O extends RC implements InterfaceC1370bK {
    public long A00;
    public InterfaceC1558eN A01;
    public InterfaceC1801iP<InterfaceExecutorC1651ft> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final PP A07;
    public final ZE A08;
    public final TO A09;
    public final InterfaceC1364bE A0A;
    public final InterfaceC1509dZ A0B;
    public final InterfaceC1536e1 A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iP != com.google.common.base.Supplier<com.google.android.exoplayer2.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C6O(ZE ze, InterfaceC1509dZ interfaceC1509dZ, InterfaceC1364bE interfaceC1364bE, TO to, InterfaceC1536e1 interfaceC1536e1, int i10, InterfaceC1801iP<InterfaceExecutorC1651ft> interfaceC1801iP) {
        this.A07 = (PP) AbstractC1589es.A01(ze.A03);
        this.A08 = ze;
        this.A0B = interfaceC1509dZ;
        this.A0A = interfaceC1364bE;
        this.A09 = to == null ? TO.A00 : to;
        this.A0C = interfaceC1536e1;
        this.A06 = i10;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC1801iP;
    }

    private void A00() {
        final Timeline c6g = new C6G(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C8W(c6g) { // from class: com.facebook.ads.redexgen.X.0y
                @Override // com.facebook.ads.redexgen.X.C8W, com.google.android.exoplayer2.Timeline
                public final C1250Yh A0I(int i10, C1250Yh c1250Yh, boolean z10) {
                    super.A0I(i10, c1250Yh, z10);
                    c1250Yh.A05 = true;
                    return c1250Yh;
                }

                @Override // com.facebook.ads.redexgen.X.C8W, com.google.android.exoplayer2.Timeline
                public final C1248Yf A0L(int i10, C1248Yf c1248Yf, long j10) {
                    super.A0L(i10, c1248Yf, j10);
                    c1248Yf.A0F = true;
                    return c1248Yf;
                }
            };
            c6g = timeline;
        }
        A05(c6g);
    }

    @Override // com.facebook.ads.redexgen.X.RC
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.X.RC
    public final void A0A(InterfaceC1558eN interfaceC1558eN) {
        this.A01 = interfaceC1558eN;
        this.A09.AGC();
        this.A09.AIk((Looper) AbstractC1589es.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1352az
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final R7 A5M(R5 r52, InterfaceC1496dM interfaceC1496dM, long j10) {
        InterfaceExecutorC1651ft interfaceExecutorC1651ft;
        Q7 A58 = this.A0B.A58();
        if (this.A01 != null) {
            A58.A3t(this.A01);
        }
        Uri uri = this.A07.A00;
        InterfaceC1365bF A5N = this.A0A.A5N(RK.A03);
        TO to = this.A09;
        TJ A01 = A01(r52);
        InterfaceC1536e1 interfaceC1536e1 = this.A0C;
        C1360bA A02 = A02(r52);
        String str = this.A07.A04;
        int i10 = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC1651ft = this.A02.get();
        } else {
            interfaceExecutorC1651ft = null;
        }
        return new C05867h(uri, A58, A5N, to, A01, interfaceC1536e1, A02, this, interfaceC1496dM, str, i10, interfaceExecutorC1651ft);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1352az
    public final void ABo() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1370bK
    public final void AF9(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.A00;
        }
        if (!this.A04 && this.A00 == j10 && this.A05 == z10 && this.A03 == z11) {
            return;
        }
        this.A00 = j10;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1352az
    public final void AGs(R7 r72) {
        ((C05867h) r72).A0a();
    }
}
