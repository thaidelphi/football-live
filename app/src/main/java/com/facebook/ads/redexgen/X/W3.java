package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class W3 implements Uj {
    public static String[] A02 = {"VNssWCDGJNuPiPW5pxEIhDnP4uUO9dlp", "b658OCw3MChpQVxn7641meas2Ke4aC8R", "5Ugl", "DbhkVU5ro4dRMxdJyKQLBiZGrZaV3A4t", "5zlshhsefEO4CV0muXMQPVsFvSZa", "rO74d0xzdKllKXq43FUGKSzAg", "cyf8Fw3S0JBJmK2TeC1PY", "xbwipv3QNbRzSALR5JTcL7pz3w1Wu"};
    public final long A00;
    public final UU A01;

    public W3(UU uu, long j10) {
        this.A01 = uu;
        this.A00 = j10;
    }

    private C1154Uk A00(long j10, long j11) {
        return new C1154Uk((1000000 * j10) / this.A01.A07, this.A00 + j11);
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        return this.A01.A06();
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        long j11;
        AbstractC1589es.A02(this.A01.A0A);
        long[] jArr = this.A01.A0A.A01;
        long[] jArr2 = this.A01.A0A.A00;
        int A0L = AbstractC1672gE.A0L(jArr, this.A01.A07(j10), true, false);
        long j12 = 0;
        if (A0L == -1) {
            j11 = 0;
        } else {
            j11 = jArr[A0L];
        }
        if (A0L != -1) {
            j12 = jArr2[A0L];
        }
        C1154Uk A00 = A00(j11, j12);
        int i10 = (A00.A01 > j10 ? 1 : (A00.A01 == j10 ? 0 : -1));
        String[] strArr = A02;
        if (strArr[7].length() != strArr[2].length()) {
            String[] strArr2 = A02;
            strArr2[7] = "kqbaKwkaNrSq59fxHMssI8SSMeJ9X";
            strArr2[2] = "7jBi";
            if (i10 == 0 || A0L == jArr.length - 1) {
                return new C1153Ui(A00);
            }
            C1154Uk secondSeekPoint = A00(jArr[A0L + 1], jArr2[A0L + 1]);
            return new C1153Ui(A00, secondSeekPoint);
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return true;
    }
}
