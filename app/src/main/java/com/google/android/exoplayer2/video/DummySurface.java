package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.HandlerThreadC1682gO;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public static String[] A06 = {"pp0QVEtaMCAKPna3YJt78N0w4zMKyGdK", "79oygYboKir73b3UZTEr", "iW0XQzqmwgd6FOvBAvFbJOtiXtTxpr06", "Pd4yymMvmv58ummKZRY0HcFmILvlFe9Z", "xZXsZmauCpR5UWDcFjQmIkrGW1H4RY1n", "vkBBR8xyhBkspww5icXUHCOg", "mw4EXo3WbErcuntOCMbauI5byqzasizK", "k7SKMo0UCZ4vlpsSSXiadPQJgI2A6OyA"};
    public boolean A00;
    public final boolean A01;
    public final HandlerThreadC1682gO A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 117);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{119, 117, 126, 109, 119, 106, 102, 109, 66, 64, 93, 70, 87, 81, 70, 87, 86, 109, 81, 93, 92, 70, 87, 92, 70, 71, 69, 78, 93, 73, 74, 80, 93, 113, 119, 112, 100, 99, 97, 103, 110, 103, 113, 113, 93, 97, 109, 108, 118, 103, 122, 118, 112, 75, 86, 80, 85, 85, 74, 87, 81, 64, 65, 5, 85, 87, 76, 74, 87, 5, 81, 74, 5, 100, 117, 108, 5, 73, 64, 83, 64, 73, 5, 20, 18, 15, 3, 102, 97, 98, 103, 123, 116, 126, 104, 117, 115, 126, 52, 114, 123, 104, 126, 109, 123, 104, Byte.MAX_VALUE, 52, 108, 104, 52, 114, 115, 125, 114, 69, 106, Byte.MAX_VALUE, 104, 124, 117, 104, 119, 123, 116, 121, Byte.MAX_VALUE, 125, 111, 99, 125, 123, 96, 105};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(Context context) {
        boolean z10;
        synchronized (DummySurface.class) {
            z10 = true;
            if (!A04) {
                A03 = AbstractC1672gE.A02 < 24 ? 0 : A00(context);
                A04 = true;
            }
            if (A03 == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    static {
        A04();
    }

    public DummySurface(HandlerThreadC1682gO handlerThreadC1682gO, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.A02 = handlerThreadC1682gO;
        this.A01 = z10;
    }

    public static int A00(Context context) {
        String eglQueryString;
        if (AbstractC1672gE.A02 >= 26 || !(A02(127, 7, 123).equals(AbstractC1672gE.A05) || A02(85, 6, 34).equals(AbstractC1672gE.A06))) {
            if ((AbstractC1672gE.A02 >= 26 || context.getPackageManager().hasSystemFeature(A02(91, 36, 111))) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(A02(0, 25, 71))) {
                if (eglQueryString.contains(A02(25, 27, 119))) {
                    return 1;
                }
                return 2;
            }
            return 0;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.video.DummySurface A01(android.content.Context r5, boolean r6) {
        /*
            A03()
            r4 = 0
            if (r6 == 0) goto L24
            boolean r3 = A05(r5)
            java.lang.String[] r1 = com.google.android.exoplayer2.video.DummySurface.A06
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 0
            if (r1 == r0) goto L4e
            java.lang.String[] r2 = com.google.android.exoplayer2.video.DummySurface.A06
            java.lang.String r1 = "kT07Bou9oyQQQ1q5147NOW74unBc9AOz"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "m3GLYlGhsoPlaVIPK312zxpp7FIUDalc"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L4b
        L24:
            r0 = 1
        L25:
            com.facebook.ads.redexgen.X.AbstractC1589es.A08(r0)
            com.facebook.ads.redexgen.X.gO r0 = new com.facebook.ads.redexgen.X.gO
            r0.<init>()
            if (r6 == 0) goto L31
            int r4 = com.google.android.exoplayer2.video.DummySurface.A03
        L31:
            com.google.android.exoplayer2.video.DummySurface r3 = r0.A04(r4)
            java.lang.String[] r1 = com.google.android.exoplayer2.video.DummySurface.A06
            r0 = 7
            r1 = r1[r0]
            r0 = 5
            char r1 = r1.charAt(r0)
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L4d
            java.lang.String[] r2 = com.google.android.exoplayer2.video.DummySurface.A06
            java.lang.String r1 = "nGnDXsnVxv5BUIHARnh2Z4r9whZTo5LJ"
            r0 = 4
            r2[r0] = r1
            return r3
        L4b:
            r0 = 0
            goto L25
        L4d:
            return r3
        L4e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DummySurface.A01(android.content.Context, boolean):com.google.android.exoplayer2.video.DummySurface");
    }

    public static void A03() {
        if (AbstractC1672gE.A02 >= 17) {
            return;
        }
        throw new UnsupportedOperationException(A02(52, 33, 80));
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
