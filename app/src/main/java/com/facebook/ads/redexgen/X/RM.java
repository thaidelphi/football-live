package com.facebook.ads.redexgen.X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class RM {
    public static String[] A00 = {"JcCiwe", "I1yyjDxSLafUtbPIgH190wjO8EQGjRQP", "NMea3kEfVtg4hKxB7e7ATctPEr", "cY7", "qlIPemaH8SzyKht6jnQdMjFGFN", "4YyAYXPqR8nG3TCHg", "HcI0SKLclevzdljtRNfZmpadUZvS2y3N", "s8dTGHmqq3gUosBKcQEjF12TegLlWnsa"};
    public static final AudioAttributes A01 = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int A00(int i10, int i11) {
        for (int i12 = 8; i12 > 0; i12--) {
            AudioFormat.Builder sampleRate = new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11);
            int channelCount = AbstractC1672gE.A01(i12);
            AudioFormat audioFormat = sampleRate.setChannelMask(channelCount).build();
            if (AudioTrack.isDirectPlaybackSupported(audioFormat, A01)) {
                return i12;
            }
        }
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<java.lang.Integer> */
    public static int[] A01() {
        AbstractC2005lm abstractC2005lm;
        C4T A012 = OI.A01();
        abstractC2005lm = RN.A06;
        AbstractC2173oj A0N = abstractC2005lm.keySet().A0N();
        while (true) {
            boolean hasNext = A0N.hasNext();
            String[] strArr = A00;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A00[7] = "6Zm9tjo0LFpSz1JYBrkkBsAMinRVg5T8";
            if (hasNext) {
                int encoding = ((Integer) A0N.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(encoding).setSampleRate(48000).build(), A01)) {
                    A012.A04(Integer.valueOf(encoding));
                }
            } else {
                A012.A04(2);
                return AbstractC0985Nn.A0C(A012.A05());
            }
        }
    }
}
