package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.eb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1572eb implements Comparable<C1572eb> {
    public static byte[] A06;
    public static String[] A07 = {"phrrKcjbiOYiqnEapBza98r6xOqrRUnP", "FU45nAqwB8duGiRvb6rVMShNxWeKer0n", "nhrV7nHIP9QPbCZZhwAYb4T8SnqkxN4d", "lT7YmJTRnSmY0XRj4nVkbgrSL2ljAvNn", "vuCHOYiPPP0EzjKoDmHwar3fLeN8l9Lv", "THELI2ZMiczzSQlZK933cJr2CfESrpRE", "dd35IuunKaEh56BlpI1NLh9NPVjWeKx4", "shuX4Kv9joYFyha4eKbe7oXMa912CzHa"};
    @MetaExoPlayerCustomization
    public static final String A08;
    public final long A00;
    public final long A01;
    public final long A02;
    public final File A03;
    public final String A04;
    public final boolean A05;

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A07[5].charAt(19) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "0hbqpyARGAcAcxbtchgDmyK61H4gcAcJ";
            strArr[7] = "kh67FUqu4gbq3dc33e6GZhtvZ9jcR3Vd";
            copyOfRange[i13] = (byte) ((b10 ^ i12) ^ 40);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A06 = new byte[]{41, 101, 104, 125, 51, 29, 77, 82, 78, 7, 29, 6, 85, 79, 92, 67, 28, 6, 107, 73, 75, 64, 77, 123, 88, 73, 70, 83};
    }

    static {
        A09();
        A08 = C1572eb.class.getSimpleName();
    }

    public C1572eb(String str, long j10, long j11, long j12, File file) {
        this.A04 = str;
        this.A02 = j10;
        this.A01 = j11;
        this.A05 = file != null;
        this.A03 = file;
        this.A00 = j12;
    }

    @Override // java.lang.Comparable
    /* renamed from: A0A */
    public final int compareTo(C1572eb c1572eb) {
        if (!this.A04.equals(c1572eb.A04)) {
            return this.A04.compareTo(c1572eb.A04);
        }
        long j10 = this.A02;
        long j11 = c1572eb.A02;
        String[] strArr = A07;
        if (strArr[2].charAt(1) != strArr[7].charAt(1)) {
            throw new RuntimeException();
        }
        A07[5] = "hgrsxHQvrPjHyowB6kD3yL0eC79mv0lM";
        long j12 = j10 - j11;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }

    public final boolean A0B() {
        return !this.A05;
    }

    public final boolean A0C() {
        return this.A01 == -1;
    }

    @MetaExoPlayerCustomization
    public final String toString() {
        return A08(18, 10, 0) + this.A04 + A08(0, 5, 33) + this.A00 + A08(5, 6, 21) + this.A02 + A08(11, 7, 14) + this.A01 + '}';
    }
}
