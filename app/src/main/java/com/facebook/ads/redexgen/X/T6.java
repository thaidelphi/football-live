package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class T6 implements UK {
    public static String[] A03 = {"HQML1g0LMbENggThfE4z", "g0nBDU", "AihK2ANP4O54ICGFQoFXY7c0nSX1UQZZ", "f9wU0a", "zPgU87VcveHPcZd1g", "YUgNUeUylqcQjSF9z", "qPce5", "stSLTOSAkKkxI7DorJfhfBOz6gnWPUaK"};
    public static final UO A04 = new UO() { // from class: com.facebook.ads.redexgen.X.T7
        @Override // com.facebook.ads.redexgen.X.UO
        public final UK[] A5D() {
            return T6.A00();
        }

        @Override // com.facebook.ads.redexgen.X.UO
        public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
            return UN.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final T5 A01 = new T5();
    public final C1648fq A02 = new C1648fq(2786);

    public static /* synthetic */ UK[] A00() {
        return new UK[]{new T6()};
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AA0(UL ul) {
        this.A01.A5S(ul, new YS(0, 1));
        ul.A6E();
        ul.AID(new C1191Vy(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final int AGT(WJ wj, C1152Ug c1152Ug) throws IOException {
        int read = wj.read(this.A02.A0l(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.A02.A0f(0);
        this.A02.A0e(read);
        if (!this.A00) {
            T5 t52 = this.A01;
            String[] strArr = A03;
            String str = strArr[1];
            String str2 = strArr[3];
            int length = str.length();
            int bytesRead = str2.length();
            if (length != bytesRead) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "yFeVrxGj5O99IEGKJ3GmjMqkjRng4OOE";
            strArr2[2] = "7Kz1f7NnvoPvIWH87FRYLjR72apXWDnJ";
            t52.AFy(0L, 4);
            this.A00 = true;
        }
        this.A01.A50(this.A02);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AIC(long j10, long j11) {
        this.A00 = false;
        this.A01.AIB();
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final boolean AJB(WJ wj) throws IOException {
        C1648fq c1648fq = new C1648fq(10);
        int startPosition = 0;
        while (true) {
            wj.AG1(c1648fq.A0l(), 0, 10);
            c1648fq.A0f(0);
            if (c1648fq.A0K() != 4801587) {
                break;
            }
            c1648fq.A0g(3);
            int A0H = c1648fq.A0H();
            startPosition += A0H + 10;
            wj.A3x(A0H);
        }
        wj.AHr();
        wj.A3x(startPosition);
        int syncBytes = startPosition;
        int i10 = 0;
        while (true) {
            wj.AG1(c1648fq.A0l(), 0, 6);
            c1648fq.A0f(0);
            int headerPosition = c1648fq.A0M();
            if (headerPosition != 2935) {
                i10 = 0;
                wj.AHr();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                wj.A3x(syncBytes);
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                int headerPosition3 = U2.A05(c1648fq.A0l());
                if (headerPosition3 == -1) {
                    return false;
                }
                wj.A3x(headerPosition3 - 6);
            }
        }
    }
}
