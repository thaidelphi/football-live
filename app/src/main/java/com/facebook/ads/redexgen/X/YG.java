package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
@MetaExoPlayerCustomization("Making NalUnitTargetBuffer public to be accessible by the Oculus Readers")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class YG {
    public static String[] A05 = {"TOxsDnVT8yfQlmD8ACs70tb97ZogfkCm", "JJzD0PagvkAHQA4rtOaH0jQ3USMVnNG3", "lp51SaSkBAIE2TBYUMm3yiRpJeLcGx01", "shbZEpkAIESJUoTX6rAlyzpmAloGHKDk", "muG0eQGpw4R2LH89KBLvkC3tlXmqficI", "bkaprE3JBlsrgpuZIlPQMt6ENIbfFKZn", "qBW6RwUMxukniQM6xL0KWhqWjAX02wPv", ""};
    public int A00;
    public byte[] A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public YG(int i10, int i11) {
        this.A04 = i10;
        this.A01 = new byte[i11 + 3];
        this.A01[2] = 1;
    }

    public final void A00() {
        this.A03 = false;
        this.A02 = false;
    }

    public final void A01(int i10) {
        AbstractC1589es.A08(!this.A03);
        this.A03 = i10 == this.A04;
        if (this.A03) {
            this.A00 = 3;
            this.A02 = false;
        }
    }

    public final void A02(byte[] bArr, int i10, int i11) {
        if (!this.A03) {
            return;
        }
        int i12 = i11 - i10;
        int length = this.A01.length;
        int readLength = this.A00;
        if (length < readLength + i12) {
            byte[] bArr2 = this.A01;
            int readLength2 = this.A00;
            this.A01 = Arrays.copyOf(bArr2, (readLength2 + i12) * 2);
        }
        byte[] bArr3 = this.A01;
        if (A05[2].charAt(20) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[0] = "q3YrRfYnFpskmVHDrKP5GtAUs1YCtqSj";
        strArr[5] = "MAkTNKypM6k7evBN9wqFHtlPulCbX84o";
        int readLength3 = this.A00;
        System.arraycopy(bArr, i10, bArr3, readLength3, i12);
        int readLength4 = this.A00;
        this.A00 = readLength4 + i12;
    }

    public final boolean A03() {
        return this.A02;
    }

    public final boolean A04(int i10) {
        if (this.A03) {
            this.A00 -= i10;
            this.A03 = false;
            this.A02 = true;
            return true;
        }
        return false;
    }
}
