package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AB implements InterfaceC1135Tn {
    public static String[] A04 = {"YOTdJJtRJn1uVB3Fvz2vC3TfxD1i1SVb", "pbSCQ6EtrCvuAxXmQLOw6ZGbTposz5cx", "B2nKwY1ESUvXaarAT7BvH", "lePajvUlJikrjw8zfQ45dXGHHAfbDCLz", "ex04D5HE3oFagUGv1K1jCqh", "AJi9tCnq1NHuV7cshgeYkqUDimJzuFt7", "l5ZT4dX7b30GYzt6JPT3HnzMt0Et48nR", "xC"};
    public long A00;
    public final long A01;
    public final C1634fc A03 = new C1634fc();
    public final C1634fc A02 = new C1634fc();

    public AB(long j10, long j11, long j12) {
        this.A00 = j10;
        this.A01 = j12;
        this.A03.A04(0L);
        this.A02.A04(j11);
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    public final void A01(long j10, long j11) {
        if (A02(j10)) {
            return;
        }
        C1634fc c1634fc = this.A03;
        String[] strArr = A04;
        if (strArr[6].charAt(26) == strArr[3].charAt(26)) {
            throw new RuntimeException();
        }
        A04[1] = "C3CyI0GcecYFZSLRHvokZGG0W51ywz6S";
        c1634fc.A04(j10);
        this.A02.A04(j11);
    }

    public final boolean A02(long j10) {
        long lastIndexedTimeUs = this.A03.A03(this.A03.A02() - 1);
        return j10 - lastIndexedTimeUs < 100000;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1135Tn
    public final long A7Z() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        int A0C = AbstractC1672gE.A0C(this.A03, j10, true, true);
        C1154Uk c1154Uk = new C1154Uk(this.A03.A03(A0C), this.A02.A03(A0C));
        int targetIndex = (c1154Uk.A01 > j10 ? 1 : (c1154Uk.A01 == j10 ? 0 : -1));
        if (targetIndex != 0) {
            int targetIndex2 = this.A03.A02();
            if (A0C != targetIndex2 - 1) {
                int targetIndex3 = A0C + 1;
                long A03 = this.A03.A03(targetIndex3);
                int targetIndex4 = A0C + 1;
                C1154Uk nextSeekPoint = new C1154Uk(A03, this.A02.A03(targetIndex4));
                return new C1153Ui(c1154Uk, nextSeekPoint);
            }
        }
        return new C1153Ui(c1154Uk);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1135Tn
    public final long A97(long j10) {
        return this.A03.A03(AbstractC1672gE.A0C(this.A02, j10, true, true));
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return true;
    }
}
