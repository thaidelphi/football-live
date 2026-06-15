package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TE implements InterfaceC1213Wv {
    public static String[] A02 = {"a2t7hKlINZLuDHqFYaKIJCn3zbxvPUfQ", "94a1Zn", "G2LSQtUOdoxhw3yWQ5b88lZyXtNm5pHf", "28AZETnBhQYLiv3atlnXlfqyoKufPAYL", "A4QfPXHGL9Vbw1YpM4HcmTEDUw1R", "ldpwbSFR8wjokhW3", "VArigWWU5dYMGcXAaIZ6Dasx6MsC8ix5", "DEiyKpuf8STflGLQJbYr6CV2LmYUMPhK"};
    public final long[] A00;
    public final C1053Qh[] A01;

    public TE(C1053Qh[] c1053QhArr, long[] jArr) {
        this.A01 = c1053QhArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final List<C1053Qh> A7N(long j10) {
        int A0L = AbstractC1672gE.A0L(this.A00, j10, true, false);
        if (A0L == -1 || this.A01[A0L] == C1053Qh.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[A0L]);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final long A7t(int i10) {
        boolean z10 = true;
        AbstractC1589es.A07(i10 >= 0);
        String[] strArr = A02;
        if (strArr[5].length() != strArr[4].length()) {
            String[] strArr2 = A02;
            strArr2[6] = "9ioBXMOLlW8mQ3fTIVT8oSqJ6BOqH8Vr";
            strArr2[7] = "rImW2whSLRJhLvWc0fieWmjFVtuIvTRn";
            if (i10 >= this.A00.length) {
                z10 = false;
            }
            AbstractC1589es.A07(z10);
            long[] jArr = this.A00;
            String[] strArr3 = A02;
            if (strArr3[6].charAt(11) != strArr3[7].charAt(11)) {
                String[] strArr4 = A02;
                strArr4[3] = "B7EXgVCi8Il3EYqtjheKhCzhnCsyDEIA";
                strArr4[0] = "XAUrJtUU1J6gmYL2gcldbU7vIAVfMsyc";
                return jArr[i10];
            }
            return jArr[i10];
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A7u() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A8Q(long j10) {
        int A0K = AbstractC1672gE.A0K(this.A00, j10, false, false);
        int index = this.A00.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
