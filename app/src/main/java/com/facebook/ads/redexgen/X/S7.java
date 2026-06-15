package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class S7 implements YK {
    public static String[] A05 = {"vfQptEavCBaQ4shb4qTQ2Im4Va5BuDnO", "JiQZW7nhM5jecL1Ppc", "hnwXp9bv64zC75tT", "dWpaD8T4ZQJ5Q0FNk1Z", "lRetC72ZWUiGcWxiU67VotPfpeJyuSHi", "OzCNbEqBWRgV3Rv1ObtqMLQClM1AAi", "9ecBBYmeQ8JsEZV55k", "KMfWSLnEN9JR6reOC5HqOSDCR3KuqNUo"};
    public final int A00;
    public final /* synthetic */ S6 A04;
    public final C1647fp A03 = new C1647fp(new byte[5]);
    public final SparseArray<YT> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    @Override // com.facebook.ads.redexgen.X.YK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A50(com.facebook.ads.redexgen.X.C1648fq r13) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.S7.A50(com.facebook.ads.redexgen.X.fq):void");
    }

    public S7(S6 s62, int i10) {
        this.A04 = s62;
        this.A00 = i10;
    }

    private YP A00(C1648fq c1648fq, int i10) {
        int positionOfNextDescriptor = c1648fq.A09();
        int i11 = positionOfNextDescriptor + i10;
        int descriptorLength = -1;
        String str = null;
        List<TsPayloadReader.DvbSubtitleInfo> dvbSubtitleInfos = null;
        while (c1648fq.A09() < i11) {
            int descriptorsStartPosition = c1648fq.A0I();
            int descriptorTag = c1648fq.A09() + c1648fq.A0I();
            if (descriptorTag > i11) {
                break;
            }
            if (descriptorsStartPosition == 5) {
                long A0Q = c1648fq.A0Q();
                if (A0Q == 1094921523) {
                    descriptorLength = 129;
                } else if (A0Q == 1161904947) {
                    descriptorLength = 135;
                } else if (A0Q == 1094921524) {
                    descriptorLength = 172;
                } else if (A0Q == 1212503619) {
                    descriptorLength = 36;
                }
            } else if (descriptorsStartPosition == 106) {
                descriptorLength = 129;
            } else if (descriptorsStartPosition == 122) {
                descriptorLength = 135;
            } else if (descriptorsStartPosition == 127) {
                if (c1648fq.A0I() == 21) {
                    descriptorLength = 172;
                }
            } else if (descriptorsStartPosition == 123) {
                descriptorLength = 138;
            } else if (descriptorsStartPosition == 10) {
                str = c1648fq.A0W(3).trim();
            } else if (descriptorsStartPosition == 89) {
                descriptorLength = 89;
                dvbSubtitleInfos = new ArrayList<>();
                while (c1648fq.A09() < descriptorTag) {
                    String language = c1648fq.A0W(3).trim();
                    int streamType = c1648fq.A0I();
                    byte[] bArr = new byte[4];
                    c1648fq.A0k(bArr, 0, 4);
                    dvbSubtitleInfos.add(new YO(language, streamType, bArr));
                }
            } else if (descriptorsStartPosition == 111) {
                descriptorLength = 257;
            }
            c1648fq.A0g(descriptorTag - c1648fq.A09());
        }
        c1648fq.A0f(i11);
        return new YP(descriptorLength, str, dvbSubtitleInfos, Arrays.copyOfRange(c1648fq.A0l(), positionOfNextDescriptor, i11));
    }

    @Override // com.facebook.ads.redexgen.X.YK
    public final void AA3(C1662g4 c1662g4, UL ul, YS ys) {
    }
}
