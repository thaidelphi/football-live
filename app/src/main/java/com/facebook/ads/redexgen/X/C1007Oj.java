package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Oj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1007Oj implements Comparable<C1007Oj> {
    public static String[] A04 = {"mVATs4mg0NNQFzxuMlo", "WtZmdB0nWrFtQhg3y", "VGkbfyqcu1RhAbF6pu4I8IGmp", "Hr4NzNcUmn", "bCMf0jPpCp", "Y9828wrLR5fDU8", "FTEqajryx", "wr1R2liT4z3qWFN9B"};
    public int A00;
    public long A01;
    public Object A02;
    public final QT A03;

    public C1007Oj(QT qt) {
        this.A03 = qt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C1007Oj c1007Oj) {
        boolean z10 = this.A02 == null;
        Object obj = c1007Oj.A02;
        if (A04[0].length() != 19) {
            throw new RuntimeException();
        }
        A04[0] = "Jgby1driYffcph6Gu5s";
        if (z10 != (obj == null)) {
            return this.A02 != null ? -1 : 1;
        } else if (this.A02 == null) {
            return 0;
        } else {
            int i10 = this.A00 - c1007Oj.A00;
            if (i10 != 0) {
                return i10;
            }
            int comparePeriodIndex = AbstractC1672gE.A08(this.A01, c1007Oj.A01);
            return comparePeriodIndex;
        }
    }

    public final void A01(int i10, long j10, Object obj) {
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = obj;
    }
}
