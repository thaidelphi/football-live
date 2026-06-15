package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.StreamKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class PP {
    public static byte[] A09;
    public static String[] A0A = {"Ef", "T2x7qHBiiRx08tB27h2ocen", "GPkZEyGWFB", "pYG1R6Blr7", "", "Y4gD2ypXU161qhMcT4A1S10", "", "BBlHMhJgjsbZEuXotfM"};
    public final Uri A00;
    public final PG A01;
    public final PL A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final List<StreamKey> A06;
    public final List<MediaItem.SubtitleConfiguration> A07;
    @Deprecated
    public final List<MediaItem.Subtitle> A08;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{54, 33, 61, 56, 48, 1, 36, 59, 58, 114, 123, 105, 114, 89, 117, 126, Byte.MAX_VALUE};
        if (A0A[0].length() != 2) {
            throw new RuntimeException();
        }
        String[] strArr = A0A;
        strArr[1] = "E8u4GqKP08v07lE05cNnDlv";
        strArr[5] = "nLVlAWggupA9sKXKoo57uR7";
    }

    static {
        A01();
    }

    public PP(Uri uri, String str, PL pl2, PG pg, List<StreamKey> streamKeys, String str2, List<MediaItem.SubtitleConfiguration> subtitleConfigurations, Object obj) {
        this.A00 = uri;
        this.A05 = str;
        this.A02 = pl2;
        this.A01 = pg;
        this.A06 = streamKeys;
        this.A04 = str2;
        this.A07 = subtitleConfigurations;
        LinkedList linkedList = new LinkedList();
        if (0 < subtitleConfigurations.size()) {
            subtitleConfigurations.get(0);
            throw new NullPointerException(A00(0, 9, 67));
        }
        List<MediaItem.Subtitle> subtitles = new ArrayList<>(linkedList);
        this.A08 = subtitles;
        this.A03 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PP) {
            PP pp = (PP) obj;
            if (this.A00.equals(pp.A00) && AbstractC1672gE.A1E(this.A05, pp.A05) && AbstractC1672gE.A1E(this.A02, pp.A02) && AbstractC1672gE.A1E(null, null)) {
                List<StreamKey> list = this.A06;
                String[] strArr = A0A;
                if (strArr[1].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0A[7] = "hlGnJ2fKBRZAE7ZaxGB";
                if (list.equals(pp.A06) && AbstractC1672gE.A1E(this.A04, pp.A04) && this.A07.equals(pp.A07) && AbstractC1672gE.A1E(this.A03, pp.A03)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int result = this.A00.hashCode();
        int i10 = result * 31;
        int result2 = this.A05 == null ? 0 : this.A05.hashCode();
        int i11 = (i10 + result2) * 31;
        if (this.A02 == null) {
            hashCode = 0;
        } else {
            PL pl2 = this.A02;
            String[] strArr = A0A;
            String str = strArr[4];
            String str2 = strArr[6];
            int result3 = str.length();
            if (result3 != str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "";
            strArr2[6] = "";
            hashCode = pl2.hashCode();
        }
        int result4 = (i11 + hashCode) * 31;
        if (0 == 0) {
            int result5 = (((result4 + 0) * 31) + this.A06.hashCode()) * 31;
            int result6 = this.A04 == null ? 0 : this.A04.hashCode();
            return ((((result5 + result6) * 31) + this.A07.hashCode()) * 31) + (this.A03 != null ? this.A03.hashCode() : 0);
        }
        throw new NullPointerException(A00(9, 8, 13));
    }
}
