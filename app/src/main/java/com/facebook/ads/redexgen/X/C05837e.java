package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.7e  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05837e {
    public static InterfaceC05847f A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C05837e.class) {
            if (A00 == null) {
                return;
            }
            C06058b c06058b = new C06058b(A00.AHh());
            c06058b.A05(1);
            C1899k0 A002 = AnonymousClass84.A00();
            if (A002 != null) {
                A002.A08().AAu(A00(0, 9, 49), 3401, c06058b);
            }
            A00.reset();
        }
    }

    public static void A03(final long j10) {
        if (j10 > 0) {
            A00 = new C1909kA();
            new Thread(j10) { // from class: com.facebook.ads.redexgen.X.7g
                public final long A00;

                {
                    this.A00 = j10;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (BQ.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (Throwable th) {
                                BQ.A00(th, this);
                                return;
                            }
                        } catch (InterruptedException unused) {
                        }
                        C05837e.A01();
                    }
                }
            };
        }
    }
}
