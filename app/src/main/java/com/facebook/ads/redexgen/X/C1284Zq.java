package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Zq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1284Zq implements InterfaceC0973Nb {
    public static byte[] A06;
    public static String[] A07 = {"WPBdzWamhvSQDIpyY36lLYQCDXRvjCD6", "EA6CYIl0OXqr5k1m7aj18riu2gt7KhHK", "toK0ySp7xUCED0anzJ0jTsPHDrHAJknN", "iPWl5pYUzpZap39t5ED9KC1NkQc9urRA", "F88XwVkn", "O9hJia4JcpHijJZbbCz79SFc7awyK90f", "ytPSpYsrEpraXkxTGBBPR", "GoCkg8n1c9QdB1CWvyGCuKLUg3ikT"};
    public static final C1284Zq A08;
    public static final InterfaceC0972Na<C1284Zq> A09;
    public static final C1285Zr A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String A0E;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;
    @MetaExoPlayerCustomization("Change back to private after AdsMediaSource fully upgraded")
    public final C1285Zr[] A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1284Zq A00(Bundle bundle) {
        C1285Zr[] c1285ZrArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A0B);
        if (parcelableArrayList == null) {
            c1285ZrArr = new C1285Zr[0];
        } else {
            c1285ZrArr = new C1285Zr[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                c1285ZrArr[i10] = C1285Zr.A09.A6V((Bundle) parcelableArrayList.get(i10));
            }
        }
        return new C1284Zq(null, c1285ZrArr, bundle.getLong(A0C, A08.A02), bundle.getLong(A0D, A08.A03), bundle.getInt(A0E, A08.A01));
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{94, 82, 28, 16, 81, 84, 119, 66, 95, 69, 64, 67, 13, 107, 97, 109, 44, 41, 31, 40, 62, 56, 32, 40, 29, 34, 62, 36, 57, 36, 34, 35, 24, 62, 112, 11, 7, 70, 67, 84, 26, 124, 22, 26, 94, 79, 72, 91, 78, 83, 85, 84, 111, 73, 7, 84, 113, 69, 121, 116, 108, 119, 116, 118, 126, 70, 97, 116, 97, 112, 61, 116, 113, 102, 92, 113, 40, 29, 105, 66, 71, 11, 80, 87, 66, 87, 70, 30, 43, 46, 13, 56, 37, 63, 58, 98, 62, 35, 39, 47, 31, 57, 119};
    }

    static {
        A03();
        A08 = new C1284Zq(null, new C1285Zr[0], 0L, -9223372036854775807L, 0);
        A0A = new C1285Zr(0L).A06(0);
        A0B = AbstractC1672gE.A0h(1);
        A0C = AbstractC1672gE.A0h(2);
        A0D = AbstractC1672gE.A0h(3);
        A0E = AbstractC1672gE.A0h(4);
        A09 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Zt
            @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
            public final InterfaceC0973Nb A6V(Bundle bundle) {
                C1284Zq A00;
                A00 = C1284Zq.A00(bundle);
                return A00;
            }
        };
    }

    public C1284Zq(Object obj, C1285Zr[] c1285ZrArr, long j10, long j11, int i10) {
        this.A04 = obj;
        this.A02 = j10;
        this.A03 = j11;
        this.A00 = c1285ZrArr.length + i10;
        this.A05 = c1285ZrArr;
        this.A01 = i10;
    }

    private boolean A04(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = A07(i10).A03;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    public final int A05(long j10, long j11) {
        if (j10 == Long.MIN_VALUE || (j11 != -9223372036854775807L && j10 >= j11)) {
            return -1;
        }
        int index = this.A01;
        while (index < this.A00 && ((A07(index).A03 != Long.MIN_VALUE && A07(index).A03 <= j10) || !A07(index).A08())) {
            index++;
        }
        if (index < this.A00) {
            return index;
        }
        return -1;
    }

    public final int A06(long j10, long j11) {
        int i10 = this.A00 - 1;
        while (i10 >= 0 && A04(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !A07(i10).A07()) {
            return -1;
        }
        return i10;
    }

    public final C1285Zr A07(int i10) {
        if (i10 < this.A01) {
            return A0A;
        }
        return this.A05[i10 - this.A01];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1284Zq c1284Zq = (C1284Zq) obj;
        if (AbstractC1672gE.A1E(this.A04, c1284Zq.A04) && this.A00 == c1284Zq.A00 && this.A02 == c1284Zq.A02 && this.A03 == c1284Zq.A03 && this.A01 == c1284Zq.A01 && Arrays.equals(this.A05, c1284Zq.A05)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result;
        int result2 = this.A00;
        int i10 = result2 * 31;
        if (this.A04 == null) {
            result = 0;
        } else {
            Object obj = this.A04;
            int result3 = A07[0].charAt(28);
            if (result3 != 106) {
                throw new RuntimeException();
            }
            A07[6] = "x90YzFW8ozjOQXEcLhWngXGhW4fRT";
            result = obj.hashCode();
        }
        int result4 = (int) this.A03;
        int result5 = (((((i10 + result) * 31) + ((int) this.A02)) * 31) + result4) * 31;
        int result6 = Arrays.hashCode(this.A05);
        return ((result5 + this.A01) * 31) + result6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A02(55, 22, 117));
        sb.append(this.A04);
        sb.append(A02(14, 21, 45));
        sb.append(this.A02);
        sb.append(A02(2, 12, 80));
        int i10 = 0;
        while (true) {
            int length = this.A05.length;
            String A02 = A02(77, 2, 32);
            if (i10 < length) {
                sb.append(A02(88, 15, 42));
                sb.append(this.A05[i10].A03);
                sb.append(A02(35, 7, 71));
                int i11 = 0;
                while (true) {
                    int length2 = this.A05[i10].A05.length;
                    String A022 = A02(0, 2, 18);
                    if (i11 < length2) {
                        sb.append(A02(79, 9, 67));
                        switch (this.A05[i10].A05[i11]) {
                            case 0:
                                sb.append('_');
                                break;
                            case 1:
                                sb.append('R');
                                break;
                            case 2:
                                sb.append('S');
                                break;
                            case 3:
                                sb.append('P');
                                break;
                            case 4:
                                sb.append('!');
                                break;
                            default:
                                int i12 = A07[7].length();
                                if (i12 != 27) {
                                    A07[0] = "KYlwpvJLKaywXbh6OmFmB21BsoJ5j1iA";
                                    sb.append('?');
                                    break;
                                } else {
                                    throw new RuntimeException();
                                }
                        }
                        sb.append(A02(42, 13, 90));
                        sb.append(this.A05[i10].A06[i11]);
                        sb.append(')');
                        if (i11 < this.A05[i10].A05.length - 1) {
                            sb.append(A022);
                        }
                        i11++;
                    } else {
                        sb.append(A02);
                        if (i10 < this.A05.length - 1) {
                            sb.append(A022);
                        }
                        i10++;
                    }
                }
            } else {
                sb.append(A02);
                return sb.toString();
            }
        }
    }
}
