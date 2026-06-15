package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.dj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1519dj {
    public static byte[] A0B;
    @MetaExoPlayerCustomization
    public static final C1519dj A0C;
    public final int A00;
    public final int A01;
    @Deprecated
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Uri A06;
    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final C1524dp A07;
    public final String A08;
    public final Map<String, String> A09;
    public final byte[] A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Replacement of customData Object with fbDataSpecExtension")
    public C1519dj(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, C1524dp c1524dp) {
        boolean z10 = true;
        AbstractC1589es.A07(j10 + j11 >= 0);
        AbstractC1589es.A07(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        AbstractC1589es.A07(z10);
        this.A06 = uri;
        this.A05 = j10;
        this.A01 = i10;
        this.A0A = (bArr == null || bArr.length == 0) ? null : null;
        this.A09 = Collections.unmodifiableMap(new HashMap(map));
        this.A04 = j11;
        this.A02 = j10 + j11;
        this.A03 = j12;
        this.A08 = str;
        this.A00 = i11;
        this.A07 = c1524dp;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{123, -22, -34, -68, -39, -20, -39, -53, -24, -35, -37, -45, -36, -38, -23, 12, 9, 5, 8, -5, -6, -2, -1, -51, 40, 48, 48, 40, -17, 38, 57, 48, -17, 37, 34, 53, 34, 52, 48, 54, 51, 36, 38, -24, -24, -24, -97, -41, -46, -44, -42, -45, -32, -32, -36, -97, -44, -32, -34};
    }

    static {
        A03();
        PS.A03(A02(24, 19, 118));
        A0C = new C1519dj(Uri.parse(A02(43, 16, 38)));
    }

    public C1519dj(Uri uri) {
        this(uri, 0, -1);
    }

    @MetaExoPlayerCustomization
    @Deprecated
    public C1519dj(Uri uri, int i10, int i11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, i10, new C1524dp(A02(0, 0, 74), -1L, false, -1, -1, -1, -1, false, false, i11, -1L, new Cdo(), -1L, false, -1, -1, -1L, -1L, -1, null, -1, null, null, C1523dn.A03, -1, false, null, A02(0, 0, 74), A02(0, 0, 74), null, -1L, -1L));
    }

    @MetaExoPlayerCustomization("creation and passage of FbDataSpecExtension")
    @Deprecated
    public C1519dj(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, str, 0, new C1524dp());
    }

    private final String A00() {
        return A01(this.A01);
    }

    public static String A01(int i10) {
        switch (i10) {
            case 1:
                return A02(12, 3, 74);
            case 2:
                return A02(19, 4, 96);
            case 3:
                return A02(15, 4, 121);
            default:
                throw new IllegalStateException();
        }
    }

    public final C1516dg A04() {
        return new C1516dg(this);
    }

    @MetaExoPlayerCustomization("Replacement of customData Object with fbDataSpecExtension + new copy creation")
    public final C1519dj A05(long j10, long j11) {
        if (j10 == 0 && this.A03 == j11) {
            return this;
        }
        return new C1519dj(this.A06, this.A05, this.A01, this.A0A, this.A09, this.A04 + j10, j11, this.A08, this.A00, new C1524dp(this.A07));
    }

    public final boolean A06(int i10) {
        return (this.A00 & i10) == i10;
    }

    @MetaExoPlayerCustomization("Stringification of fbDataSpecExtension (last two items)")
    public final String toString() {
        StringBuilder append = new StringBuilder().append(A02(3, 9, 45)).append(A00()).append(A02(0, 1, 16)).append(this.A06);
        String A02 = A02(1, 2, 115);
        return append.append(A02).append(this.A04).append(A02).append(this.A03).append(A02).append(this.A08).append(A02).append(this.A00).append(A02).append(this.A07).append(A02).append(this.A07.A0Q).append(A02(23, 1, 37)).toString();
    }
}
