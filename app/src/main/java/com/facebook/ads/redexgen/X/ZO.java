package com.facebook.ads.redexgen.X;

import android.media.MediaFormat;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class ZO implements InterfaceC1701gi, InterfaceC1729hA, QS {
    public static byte[] A04;
    public InterfaceC1701gi A00;
    public InterfaceC1701gi A01;
    public InterfaceC1729hA A02;
    public InterfaceC1729hA A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{100, 102, 119, 85, 106, 103, 102, 108, 69, 113, 98, 110, 102, 78, 102, 119, 98, 103, 98, 119, 98, 79, 106, 112, 119, 102, 109, 102, 113};
    }

    public ZO() {
    }

    public /* synthetic */ ZO(HandlerC0998Oa handlerC0998Oa) {
        this();
    }

    @Override // com.facebook.ads.redexgen.X.QS
    public final void A9Y(int i10, Object obj) {
        switch (i10) {
            case 7:
                this.A01 = (InterfaceC1701gi) obj;
                return;
            case 8:
                this.A02 = (InterfaceC1729hA) obj;
                return;
            case UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS /* 10000 */:
                if (0 == 0) {
                    this.A00 = null;
                    this.A03 = null;
                    return;
                }
                throw new NullPointerException(A00(0, 29, 24));
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1701gi
    public final void AFa(long j10, long j11, ZM zm, MediaFormat mediaFormat) {
        if (this.A00 != null) {
            this.A00.AFa(j10, j11, zm, mediaFormat);
        }
        if (this.A01 != null) {
            this.A01.AFa(j10, j11, zm, mediaFormat);
        }
    }
}
