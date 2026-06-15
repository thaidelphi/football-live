package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class R6 {
    public static String[] A06 = {"CAIO5ZQJoGrrOYShD7hb2jiJtmk90Qi", "TVIw8CVNsHI8wTkpJw1XHrztCtft", "hXBhXV1DxyebNKssUcoRgSkElFX8fpm5", "sh", "h0BA7IDzuN7Fql7dlqkH9zMz4fjHlNyu", "S0x90T2j3ZCyjO2U6ODKJCntdTZqcz3L", "hOHnW70bNUwWCTfewRWjhec4kQ4QjIMO", "K0FTOijIvuGKFCgSHX8vkdIGhyuEVDr"};
    public R5 A00;
    public R5 A01;
    public R5 A02;
    public OI<R5> A03 = OI.A03();
    public AbstractC2005lm<R5, Timeline> A04 = AbstractC2005lm.A04();
    public final C1250Yh A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static R5 A00(QQ qq, OI<R5> oi, R5 r52, C1250Yh c1250Yh) {
        Timeline A7W = qq.A7W();
        int A7S = qq.A7S();
        Object A0M = A7W.A0N() ? null : A7W.A0M(A7S);
        int A07 = (qq.AAS() || A7W.A0N()) ? -1 : A7W.A0H(A7S, c1250Yh).A07(AbstractC1672gE.A0O(qq.A7U()) - c1250Yh.A0C());
        for (int i10 = 0; i10 < oi.size(); i10++) {
            R5 r53 = oi.get(i10);
            if (A04(r53, A0M, qq.AAS(), qq.A7O(), qq.A7P(), A07)) {
                return r53;
            }
        }
        if (oi.isEmpty() && r52 != null) {
            boolean A04 = A04(r52, A0M, qq.AAS(), qq.A7O(), qq.A7P(), A07);
            String[] strArr = A06;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "hRaN6qxPXnRTLNonta3GQ8ayDyE0Qqlg";
            strArr2[6] = "hWALmW4eIM2WQjCeUFcaRlEmuoVApryP";
            if (A04) {
                return r52;
            }
        }
        return null;
    }

    public R6(C1250Yh c1250Yh) {
        this.A05 = c1250Yh;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lk != com.google.common.collect.ImmutableMap$Builder<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C2003lk<R5, Timeline> A03 = AbstractC2005lm.A03();
        if (this.A03.isEmpty()) {
            A03(A03, this.A01, timeline);
            if (!AbstractC1013Or.A01(this.A02, this.A01)) {
                A03(A03, this.A02, timeline);
            }
            if (!AbstractC1013Or.A01(this.A00, this.A01) && !AbstractC1013Or.A01(this.A00, this.A02)) {
                A03(A03, this.A00, timeline);
            }
        } else {
            for (int i10 = 0; i10 < this.A03.size(); i10++) {
                A03(A03, this.A03.get(i10), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(A03, this.A00, timeline);
            }
        }
        this.A04 = A03.A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lk != com.google.common.collect.ImmutableMap$Builder<com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.Timeline> */
    private void A03(C2003lk<R5, Timeline> c2003lk, R5 r52, Timeline timeline) {
        if (r52 == null) {
            return;
        }
        if (timeline.A0A(r52.A04) != -1) {
            c2003lk.A05(r52, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(r52);
        if (existingTimeline == null) {
            return;
        }
        c2003lk.A05(r52, existingTimeline);
    }

    public static boolean A04(R5 r52, Object obj, boolean z10, int i10, int i11, int i12) {
        if (r52.A04.equals(obj)) {
            return (z10 && r52.A00 == i10 && r52.A01 == i11) || (!z10 && r52.A00 == -1 && r52.A02 == i12);
        }
        return false;
    }

    public final Timeline A05(R5 r52) {
        return this.A04.get(r52);
    }

    public final R5 A06() {
        return this.A00;
    }

    public final void A07(QQ qq) {
        this.A00 = A00(qq, this.A03, this.A01, this.A05);
        A02(qq.A7W());
    }
}
