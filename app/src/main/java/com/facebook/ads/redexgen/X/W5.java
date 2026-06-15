package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class W5 {
    public static byte[] A01;
    public static String[] A02 = {"bvAS8QhIU7qqjqNMCjD9geIBvVoX0Pps", "PGhTsFvHLKznT2fZPwhTMN8QuFwrxLpQ", "N9iEossqYVTzMdjm65ztuAuPEECgk5EO", "XY3ggvLUm8fGZbCvDlHWybnwi0bIrXlg", "lzQX0UbHRchKxyOFx5EOrRh159SzwIfb", "WWHV0rYuZLTZYcSwde", "BW6FotkyWlgx1AZkz7", "8wWVk3PL6rIpIXoIc0zLzjQyxyw5ZOGX"};
    @MetaExoPlayerCustomization("Adding TYPE_xml")
    public static final int A03;
    public final int A00;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[1].charAt(2) == '8') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "FM9oOeknYlLzqm7lR3";
            strArr[5] = "RfrWPDoB2UFGqrI69O";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 20);
            i13++;
        }
    }

    public static void A06() {
        A01 = new byte[]{104, 125, 124, 48};
    }

    static {
        A06();
        A03 = AbstractC1672gE.A0D(A05(0, 4, 4));
    }

    public W5(int i10) {
        this.A00 = i10;
    }

    public static int A02(int i10) {
        return 16777215 & i10;
    }

    public static int A03(int i10) {
        return (i10 >> 24) & 255;
    }

    public static String A04(int i10) {
        return A05(0, 0, 100) + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return A04(this.A00);
    }
}
