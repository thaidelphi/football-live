package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;
import java.io.IOException;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Cw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0711Cw implements InterfaceC1241Xx {
    public static String[] A09 = {"7A2DuxexkNzrP7QjhGhrFYYu", "soCGQjvsRcIeT6oOZGXwOMHckv7o7per", "Y6uu4OXCAFS9biuB4W1Qiand94h2DeLJ", "", "HZdE1worCkoUMuRG1QGA3M81OGDro9K1", "TMt2EFIO6gjy0ISbcDhRXYxO1rG8", "1kCmjgzrPTW72y1zBKqQSTNYVdjN", "WOoZRWv9xLTzL9AmYqiIWKlutEy7PHyv"};
    public QQ A00;
    public InterfaceC1624fS A01;
    public C1630fY<R4> A02;
    public boolean A03;
    public final InterfaceC1596ez A08;
    public final C1250Yh A05 = new C1250Yh();
    public final C1248Yf A06 = new C1248Yf();
    public final R6 A07 = new R6(this.A05);
    public final SparseArray<R2> A04 = new SparseArray<>();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (r4 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r5 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r21.A00.A7O() != r11.A00) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r21.A00.A7P() != r11.A01) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (r6 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        r12 = r21.A00.A7U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
        if (r4 != false) goto L16;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"player"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.ads.redexgen.X.R2 A03(com.google.android.exoplayer2.Timeline r22, int r23, com.facebook.ads.redexgen.X.R5 r24) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0711Cw.A03(com.google.android.exoplayer2.Timeline, int, com.facebook.ads.redexgen.X.R5):com.facebook.ads.redexgen.X.R2");
    }

    public C0711Cw(InterfaceC1596ez interfaceC1596ez) {
        this.A08 = (InterfaceC1596ez) AbstractC1589es.A01(interfaceC1596ez);
        this.A02 = new C1630fY<>(AbstractC1672gE.A0d(), interfaceC1596ez, new InterfaceC1628fW() { // from class: com.facebook.ads.redexgen.X.Xd
        });
    }

    private final R2 A00() {
        return A04(this.A07.A06());
    }

    private R2 A01(int i10, R5 r52) {
        AbstractC1589es.A01(this.A00);
        boolean z10 = true;
        if (r52 != null) {
            if (this.A07.A05(r52) == null) {
                z10 = false;
            }
            if (z10) {
                return A04(r52);
            }
            return A03(Timeline.A02, i10, r52);
        }
        Timeline A7W = this.A00.A7W();
        if (i10 >= A7W.A07()) {
            z10 = false;
        }
        if (!z10) {
            A7W = Timeline.A02;
        }
        return A03(A7W, i10, null);
    }

    private R2 A02(Z1 z12) {
        if (z12 instanceof EK) {
            EK ek = (EK) z12;
            if (ek.A05 != null) {
                return A04(new R5(ek.A05));
            }
        }
        return A00();
    }

    private R2 A04(R5 r52) {
        Timeline A05;
        AbstractC1589es.A01(this.A00);
        if (r52 == null) {
            A05 = null;
        } else {
            A05 = this.A07.A05(r52);
        }
        if (r52 == null || A05 == null) {
            int windowIndex = this.A00.A7R();
            Timeline knownTimeline = this.A00.A7W();
            if (!(windowIndex < knownTimeline.A07())) {
                knownTimeline = Timeline.A02;
            }
            return A03(knownTimeline, windowIndex, null);
        }
        return A03(A05, A05.A0J(r52.A04, this.A05).A00, r52);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fV != com.google.android.exoplayer2.util.ListenerSet$Event<com.google.android.exoplayer2.analytics.AnalyticsListener> */
    private final void A05(R2 r22, int i10, InterfaceC1627fV<R4> interfaceC1627fV) {
        this.A04.put(i10, r22);
        this.A02.A0A(i10, interfaceC1627fV);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1241Xx
    public final void ABz() {
        if (!this.A03) {
            final R2 A00 = A00();
            this.A03 = true;
            A05(A00, -1, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.Xm
            });
        }
    }

    @Override // com.facebook.ads.redexgen.X.QJ
    public final void ACo(final C1051Qf c1051Qf) {
        final R2 A00 = A00();
        A05(A00, 27, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.Xe
        });
    }

    @Override // com.facebook.ads.redexgen.X.QJ
    public final void ACp(final List<C1053Qh> list) {
        final R2 A00 = A00();
        A05(A00, 27, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.Xb
        });
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1361bB
    public final void ACz(int i10, R5 r52, final C1347au c1347au) {
        final R2 A01 = A01(i10, r52);
        A05(A01, 1004, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.Xi
        });
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1361bB
    public final void ADp(int i10, R5 r52, final C1344ar c1344ar, final C1347au c1347au) {
        final R2 A01 = A01(i10, r52);
        A05(A01, 1002, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.XQ
        });
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1361bB
    public final void ADr(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) int i10, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) R5 r52, final C1344ar c1344ar, final C1347au c1347au, Object obj, Object obj2) {
        final R2 A01 = A01(i10, r52);
        A05(A01, 1001, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.Xc
        });
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1361bB
    public final void ADu(int i10, R5 r52, final C1344ar c1344ar, final C1347au c1347au, final IOException iOException, final boolean z10) {
        final R2 A01 = A01(i10, r52);
        A05(A01, 1003, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.Xh
        });
    }

    @Override // com.facebook.ads.redexgen.X.QJ
    public final void AEV(final C1264Yv c1264Yv) {
        final R2 A00 = A00();
        A05(A00, 12, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.Xp
        });
    }

    @Override // com.facebook.ads.redexgen.X.QJ
    public final void AEX(final Z1 z12) {
        final R2 A02 = A02(z12);
        A05(A02, 10, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.Xg
        });
    }

    @Override // com.facebook.ads.redexgen.X.QJ
    public final void AEZ(final boolean z10, final int i10) {
        final R2 A00 = A00();
        A05(A00, -1, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.Xo
        });
    }

    @Override // com.facebook.ads.redexgen.X.QJ
    public final void AF3() {
        final R2 A00 = A00();
        A05(A00, -1, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.Xk
        });
    }

    @Override // com.facebook.ads.redexgen.X.QJ
    public final void AFI(Timeline timeline, final int i10) {
        this.A07.A07((QQ) AbstractC1589es.A01(this.A00));
        final R2 A00 = A00();
        A05(A00, 0, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.XS
        });
    }

    @Override // com.facebook.ads.redexgen.X.QJ
    public final void AFM(final Y4 y42) {
        final R2 A00 = A00();
        A05(A00, 2, new InterfaceC1627fV() { // from class: com.facebook.ads.redexgen.X.XT
        });
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1241Xx
    public final void AIl(final QQ qq, Looper looper) {
        boolean z10;
        OI oi;
        if (this.A00 != null) {
            oi = this.A07.A03;
            if (!oi.isEmpty()) {
                z10 = false;
                AbstractC1589es.A08(z10);
                this.A00 = (QQ) AbstractC1589es.A01(qq);
                this.A01 = this.A08.A5F(looper, null);
                this.A02 = this.A02.A07(looper, new InterfaceC1628fW() { // from class: com.facebook.ads.redexgen.X.Xl
                });
            }
        }
        z10 = true;
        AbstractC1589es.A08(z10);
        this.A00 = (QQ) AbstractC1589es.A01(qq);
        this.A01 = this.A08.A5F(looper, null);
        this.A02 = this.A02.A07(looper, new InterfaceC1628fW() { // from class: com.facebook.ads.redexgen.X.Xl
        });
    }
}
