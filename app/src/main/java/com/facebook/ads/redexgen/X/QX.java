package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;
import com.unity3d.services.UnityAdsConstants;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class QX implements InterfaceC1480d6 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final InterfaceC1502dS A08;
    public final InterfaceC1596ez A09;
    public final int A0A;

    public QX() {
        this(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, 25000, 25000, 0.75f);
    }

    public QX(int i10, int i11, int i12, float f10) {
        this(null, -1, i10, i11, i12, 1279, 719, f10, 0.75f, 2000L, InterfaceC1596ez.A00);
    }

    public QX(InterfaceC1502dS interfaceC1502dS) {
        this(interfaceC1502dS, -1, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, InterfaceC1596ez.A00);
    }

    public QX(@MetaExoPlayerCustomization("No longer set through factory") InterfaceC1502dS interfaceC1502dS, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i10, @MetaExoPlayerCustomization("Removed from upstream") int i11, int i12, int i13, int i14, int i15, float f10, float f11, long j10, InterfaceC1596ez interfaceC1596ez) {
        this.A08 = interfaceC1502dS;
        this.A0A = i10;
        this.A05 = i11;
        this.A02 = i12;
        this.A06 = i13;
        this.A04 = i14;
        this.A03 = i15;
        this.A00 = f10;
        this.A01 = f11;
        this.A07 = j10;
        this.A09 = interfaceC1596ez;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C04210u A00(C1246Yc c1246Yc, int[] iArr, int i10, InterfaceC1502dS interfaceC1502dS, OI<C1462co> oi) {
        return new C04210u(c1246Yc, iArr, i10, interfaceC1502dS, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, oi, this.A09);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1480d6
    public final QD[] A5R(C1479d5[] c1479d5Arr, InterfaceC1502dS interfaceC1502dS, R5 r52, Timeline timeline) {
        QD A00;
        OI A01 = C04210u.A01(c1479d5Arr);
        QD[] qdArr = new QD[c1479d5Arr.length];
        for (int i10 = 0; i10 < c1479d5Arr.length; i10++) {
            C1479d5 c1479d5 = c1479d5Arr[i10];
            if (c1479d5 != null && c1479d5.A02.length != 0) {
                if (c1479d5.A02.length == 1) {
                    A00 = new C04200t(c1479d5.A01, c1479d5.A02[0], c1479d5.A00);
                } else {
                    A00 = A00(c1479d5.A01, c1479d5.A02, c1479d5.A00, interfaceC1502dS, (OI) A01.get(i10));
                }
                qdArr[i10] = A00;
            }
        }
        return qdArr;
    }
}
