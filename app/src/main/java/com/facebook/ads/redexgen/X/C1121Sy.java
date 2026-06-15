package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Sy  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1121Sy implements YQ {
    public static byte[] A02;
    public static String[] A03 = {"Lj4gzg03gSASgBOShz1Dc2teR2QzxoDz", "lNMp9Ll7IH0A6UIQ00LiYQlXyx", "zJlRbHqmjFAN0AXrtmPyudqKltBxvxLd", "8Uxs8Vyb8zEOA3b6SzieAq2Yt0YzCRzC", "yE2i2W7Nn3AH4nLocODfhKffgOss6qwA", "R6NQaICtPKEyciL4Nk3y9YULQFwVIf4Z", "qQnIpbnCZo9CNb7F6nWSARAgBLnssXXF", "iGvV0i7PxL9M8NBKd88FkQPDBt"};
    public final int A00;
    public final List<ZM> A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 106);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<ZM> A03(YP yp) {
        String A022;
        int i10;
        if (A05(32)) {
            return this.A01;
        }
        C1648fq c1648fq = new C1648fq(yp.A03);
        List<ZM> list = this.A01;
        while (c1648fq.A07() > 0) {
            int A0I = c1648fq.A0I();
            int A09 = c1648fq.A09() + c1648fq.A0I();
            if (A0I == 134) {
                list = new ArrayList<>();
                int A0I2 = c1648fq.A0I() & 31;
                for (int i11 = 0; i11 < A0I2; i11++) {
                    String A0W = c1648fq.A0W(3);
                    int A0I3 = c1648fq.A0I();
                    boolean z10 = (A0I3 & 128) != 0;
                    if (z10) {
                        A022 = A02(19, 19, 117);
                        i10 = A0I3 & 63;
                    } else {
                        A022 = A02(0, 19, 34);
                        i10 = 1;
                    }
                    int A0I4 = c1648fq.A0I();
                    if (A03[5].charAt(3) != 'Q') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[0] = "7FyVeYA9WrZzHuuwioA3vWBoL8B8RyOM";
                    strArr[6] = "TQkUUF63gNXax52QVNqDenapGylQDbx3";
                    byte b10 = (byte) A0I4;
                    c1648fq.A0g(1);
                    List<byte[]> list2 = null;
                    if (z10) {
                        list2 = AbstractC1597f0.A04((b10 & 64) != 0);
                    }
                    list.add(new P5().A11(A022).A10(A0W).A0Z(i10).A12(list2).A14());
                }
                continue;
            }
            c1648fq.A0f(A09);
        }
        return list;
    }

    public static void A04() {
        A02 = new byte[]{41, 56, 56, 36, 33, 43, 41, 60, 33, 39, 38, 103, 43, 45, 41, 101, 126, 120, 112, 126, 111, 111, 115, 118, 124, 126, 107, 118, 112, 113, 48, 124, 122, 126, 50, 40, 47, 39, 68, 85, 85, 73, 76, 70, 68, 81, 76, 74, 75, 10, 83, 75, 65, 11, 65, 83, 71, 11, 68, 76, 81, 38, 55, 55, 43, 46, 36, 38, 51, 46, 40, 41, 104, 63, 106, 52, 36, 51, 34, 116, 114};
    }

    static {
        A04();
    }

    public C1121Sy() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C1121Sy(int i10) {
        this(i10, C0958Mm.A03(new ZM[0]));
    }

    public C1121Sy(int i10, List<ZM> list) {
        this.A00 = i10;
        this.A01 = list;
    }

    private YL A00(YP yp) {
        return new YL(A03(yp));
    }

    private YV A01(YP yp) {
        return new YV(A03(yp));
    }

    private boolean A05(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.YQ
    public final SparseArray<YT> A5G() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.YQ
    public final YT A5L(int i10, YP yp) {
        switch (i10) {
            case 2:
            case 128:
                return new C1099Sc(new C1118Sv(A01(yp)));
            case 3:
            case 4:
                return new C1099Sc(new C1104Sh(yp.A01));
            case 15:
                boolean A05 = A05(2);
                if (A03[5].charAt(3) != 'Q') {
                    throw new RuntimeException();
                }
                A03[5] = "OJDQ74LnXL8aZxJvrpziuHGD5Nuoyi98";
                if (A05) {
                    return null;
                }
                return new C1099Sc(new C1122Sz(false, yp.A01));
            case 16:
                return new C1099Sc(new C1117Su(A01(yp)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C1099Sc(new C1110Sn(yp.A01));
            case 21:
                return new C1099Sc(new C1114Sr());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C1099Sc(new C1116St(A00(yp), A05(1), A05(8)));
            case 36:
                return new C1099Sc(new C1115Ss(A00(yp)));
            case 89:
                return new C1099Sc(new C1119Sw(yp.A02));
            case 129:
            case 135:
                return new C1099Sc(new T5(yp.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new SU(new C1101Se(A02(61, 20, 45)));
            case 138:
                break;
            case 172:
                return new C1099Sc(new T2(yp.A01));
            case 257:
                return new SU(new C1101Se(A02(38, 23, 79)));
            default:
                return null;
        }
        return new C1099Sc(new C1120Sx(yp.A01));
    }
}
