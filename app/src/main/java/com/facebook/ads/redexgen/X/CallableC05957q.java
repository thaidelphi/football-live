package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
/* renamed from: com.facebook.ads.redexgen.X.7q  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class CallableC05957q implements Callable<Boolean> {
    public static byte[] A02;
    public final C05947p A00;
    public final /* synthetic */ C05987t A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -46, -29, -36, -26, -31, -25, -38, -43, -42, -32};
    }

    public CallableC05957q(C05987t c05987t, C05947p c05947p) {
        this.A01 = c05987t;
        this.A00 = c05947p;
    }

    private final Boolean A00() {
        String A01;
        AnonymousClass85 anonymousClass85;
        AnonymousClass85 anonymousClass852;
        C1D A03;
        Map map;
        if (BQ.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                A01 = A01(0, 6, 72);
            } else {
                A01 = A01(6, 5, 72);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            C1J c1j = new C1J(str, creativeType, this.A00.A06, A01, this.A00.A02, this.A00.A05);
            c1j.A04 = this.A00.A03;
            c1j.A02 = this.A00.A01;
            c1j.A05 = this.A00.A04;
            anonymousClass85 = this.A01.A04;
            if (C06017w.A06(anonymousClass85)) {
                map = C05987t.A0F;
                map.put(this.A00.A08, c1j);
            }
            anonymousClass852 = this.A01.A04;
            A03 = C05987t.A03(anonymousClass852.A02());
            return Boolean.valueOf(A03.AHm(c1j) != null);
        } catch (Throwable th) {
            BQ.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (BQ.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            BQ.A00(th, this);
            return null;
        }
    }
}
