package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.kO  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1923kO implements C3B {
    public static byte[] A03;
    public static String[] A04 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};
    public AnonymousClass72 A00;
    public C1900k1 A01;
    public final NativeAdBase.MediaCacheFlag A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[6].length() == 1) {
                throw new RuntimeException();
            }
            A04[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 88);
            i13++;
        }
    }

    public static void A03() {
        A03 = new byte[]{-26, -39, -20, -31, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    static {
        A03();
    }

    public C1923kO(AnonymousClass72 anonymousClass72, C1900k1 c1900k1, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = anonymousClass72;
        this.A01 = c1900k1;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.C3B
    public final void AD4(C0660Ag c0660Ag) {
        BP.A00(new C1926kR(this, c0660Ag));
    }

    @Override // com.facebook.ads.redexgen.X.C3B
    public final void AED(List<C2076mv> list) {
        C05987t manager = new C05987t(this.A01);
        String firstRequestId = A02(6, 7, 23);
        for (C2076mv c2076mv : list) {
            if (A02(6, 7, 23).equals(firstRequestId)) {
                firstRequestId = c2076mv.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c2076mv.A0E().A0F() != null) {
                    manager.A0b(new C05967r(c2076mv.A0E().A0F().getUrl(), c2076mv.A0E().A0F().getHeight(), c2076mv.A0E().A0F().getWidth(), c2076mv.A0G(), A02(0, 6, 32)));
                }
                if (c2076mv.A0E().A0E() != null) {
                    manager.A0b(new C05967r(c2076mv.A0E().A0E().getUrl(), c2076mv.A0E().A0E().getHeight(), c2076mv.A0E().A0E().getWidth(), c2076mv.A0G(), A02(0, 6, 32)));
                }
                if (!TextUtils.isEmpty(c2076mv.A0E().A0b())) {
                    manager.A0a(new C05947p(c2076mv.A0E().A0b(), c2076mv.A0G(), A02(0, 6, 32), c2076mv.A0E().A0A()));
                }
            }
        }
        manager.A0W(new C1924kP(this, list), new C05917m(firstRequestId, A02(0, 6, 32)));
    }
}
