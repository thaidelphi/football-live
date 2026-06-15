package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
@MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
/* renamed from: com.facebook.ads.redexgen.X.dg  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1516dg {
    public static byte[] A0A;
    public static String[] A0B = {"AbuNVUk0bcUyxMd6bcWnAlPBBDptN", "65X4WAto6ktlqnOUmL8T33iKyPfIn", "77wpsFkpVm2EdG", "m6tzrsCkVN5", "5EVBVlBJFqs", "jWBQ7N4VTzWzkq62I9I3jQAJKEu7cpGN", "pi0wjlJSnc8M3TTRLz2dlsQ0", "vzvSyfQUQYZxDQwq3Lcd7"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public C1524dp A06;
    public String A07;
    public Map<String, String> A08;
    public byte[] A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[2] = "R5NnbCttUUG2QR";
            strArr2[7] = "1us6eI87OiBUVUl4Cb3aJ";
            copyOfRange[i13] = (byte) ((b10 - i12) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-42, -22, -25, -94, -9, -12, -21, -94, -17, -9, -11, -10, -94, -28, -25, -94, -11, -25, -10, -80};
    }

    static {
        A01();
    }

    public C1516dg() {
        this.A01 = 1;
        this.A08 = Collections.emptyMap();
        this.A02 = -1L;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public C1516dg(C1519dj c1519dj) {
        this.A05 = c1519dj.A06;
        this.A04 = c1519dj.A05;
        this.A01 = c1519dj.A01;
        this.A09 = c1519dj.A0A;
        this.A08 = c1519dj.A09;
        this.A03 = c1519dj.A04;
        this.A02 = c1519dj.A03;
        this.A07 = c1519dj.A08;
        this.A00 = c1519dj.A00;
        this.A06 = c1519dj.A07;
    }

    public final C1516dg A02(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1516dg A03(long j10) {
        this.A02 = j10;
        return this;
    }

    public final C1516dg A04(long j10) {
        this.A03 = j10;
        return this;
    }

    public final C1516dg A05(long j10) {
        this.A04 = j10;
        return this;
    }

    public final C1516dg A06(Uri uri) {
        this.A05 = uri;
        return this;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final C1516dg A07(C1524dp c1524dp) {
        this.A06 = c1524dp;
        return this;
    }

    public final C1516dg A08(String str) {
        this.A07 = str;
        return this;
    }

    @MetaExoPlayerCustomization("D50990955; Ensure that fbDataSpecExtension is not null")
    public final C1519dj A09() {
        C1524dp c1524dp;
        AbstractC1589es.A03(this.A05, A00(0, 20, 64));
        Uri uri = this.A05;
        long j10 = this.A04;
        int i10 = this.A01;
        byte[] bArr = this.A09;
        Map<String, String> map = this.A08;
        long j11 = this.A03;
        long j12 = this.A02;
        String str = this.A07;
        int i11 = this.A00;
        if (this.A06 != null) {
            c1524dp = this.A06;
        } else {
            c1524dp = new C1524dp();
        }
        return new C1519dj(uri, j10, i10, bArr, map, j11, j12, str, i11, c1524dp);
    }
}
