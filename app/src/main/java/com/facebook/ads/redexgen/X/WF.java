package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class WF {
    public static String[] A00 = {"SHB3gcLYeYHiz9EHJcwSoXi3t3dJ3Sae", "YsiV64puezA1JMx0OK9DKxP7EyirmbjM", "N4muBHoa4SjHZ7raAuzYL2vq1Yox5zaV", "XrSjTZ3QAJ3ds1", "8", "t", "XY8MO4Cd9EwNU5px6ussSQdlK04iGsJf", "eEhSpmY5oFVMO3yO0x4u4hP5mcUFTVnt"};

    public static WE A00(int i10, long[] jArr, int[] iArr, long j10) {
        int chunkSamplesRemaining = 8192 / i10;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += AbstractC1672gE.A05(i12, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[i11];
        int[] iArr2 = new int[i11];
        int originalSampleIndex = 0;
        long[] timestamps = new long[i11];
        int[] flags = new int[i11];
        int i13 = 0;
        int bufferSampleCount = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int rechunkedSampleCount = iArr[i14];
            long j11 = jArr[i14];
            String[] strArr = A00;
            String str = strArr[0];
            String str2 = strArr[2];
            int charAt = str.charAt(30);
            int maxSampleCount = str2.charAt(30);
            if (charAt != maxSampleCount) {
                throw new RuntimeException();
            }
            A00[3] = "Oz9Z3vr9qLF5H2";
            while (rechunkedSampleCount > 0) {
                int min = Math.min(chunkSamplesRemaining, rechunkedSampleCount);
                jArr2[bufferSampleCount] = j11;
                iArr2[bufferSampleCount] = i10 * min;
                originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                timestamps[bufferSampleCount] = i13 * j10;
                flags[bufferSampleCount] = 1;
                j11 += iArr2[bufferSampleCount];
                i13 += min;
                rechunkedSampleCount -= min;
                bufferSampleCount++;
            }
        }
        return new WE(jArr2, iArr2, originalSampleIndex, timestamps, flags, j10 * i13);
    }
}
