package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dto.AdCookieData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.8u  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C06248u {
    public static byte[] A0F;
    public static final AdPlacementType A0G;
    public static final String A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public AdPlacementType A0B;
    public boolean A0D;
    public List<AdCookieData> A0C = null;
    public final long A0E = System.currentTimeMillis();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C06248u(Map<String, String> map) {
        char c10;
        this.A01 = -1;
        this.A00 = -1;
        this.A0B = A0G;
        this.A03 = 1;
        this.A0A = 0;
        this.A04 = 0;
        this.A05 = 20;
        this.A08 = 0;
        this.A09 = 1000;
        this.A06 = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        this.A07 = 200;
        this.A02 = 3600;
        this.A0D = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -1561601017:
                    if (key.equals(A01(105, 17, 37))) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -856794442:
                    if (key.equals(A01(199, 26, 14))) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -726276175:
                    if (key.equals(A01(122, 15, 32))) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -634541425:
                    if (key.equals(A01(9, 32, 26))) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -553208868:
                    if (key.equals(A01(0, 9, 14))) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3575610:
                    if (key.equals(A01(137, 4, 34))) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 700812481:
                    if (key.equals(A01(41, 26, 71))) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 858630459:
                    if (key.equals(A01(225, 24, 119))) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 986744879:
                    if (key.equals(A01(141, 27, 79))) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1085444827:
                    if (key.equals(A01(98, 7, 46))) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1183549815:
                    if (key.equals(A01(168, 31, 41))) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1503616961:
                    if (key.equals(A01(67, 16, 88))) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2002133996:
                    if (key.equals(A01(83, 15, 52))) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    this.A0B = AdPlacementType.fromString(entry.getValue());
                    break;
                case 1:
                    this.A03 = Integer.parseInt(entry.getValue());
                    break;
                case 2:
                    this.A0A = Integer.parseInt(entry.getValue());
                    break;
                case 3:
                    this.A04 = Integer.parseInt(entry.getValue());
                    break;
                case 4:
                    this.A05 = Integer.parseInt(entry.getValue());
                    break;
                case 5:
                    this.A02 = Integer.parseInt(entry.getValue());
                    break;
                case 6:
                    this.A0D = Boolean.valueOf(entry.getValue()).booleanValue();
                    break;
                case 7:
                    this.A01 = Integer.parseInt(entry.getValue());
                    break;
                case '\b':
                    this.A00 = Integer.parseInt(entry.getValue());
                    break;
                case '\t':
                    this.A08 = Integer.parseInt(entry.getValue());
                    break;
                case '\n':
                    this.A09 = Integer.parseInt(entry.getValue());
                    break;
                case 11:
                    this.A06 = Integer.parseInt(entry.getValue());
                    break;
                case '\f':
                    try {
                        this.A07 = Integer.parseInt(entry.getValue());
                        break;
                    } catch (NumberFormatException unused) {
                        this.A07 = 200;
                        break;
                    }
            }
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{67, 65, 67, 72, 69, 65, 66, 76, 69, 93, 90, 66, 85, 88, 93, 80, 85, 64, 93, 91, 90, 107, 80, 65, 70, 85, 64, 93, 91, 90, 107, 93, 90, 107, 71, 81, 87, 91, 90, 80, 71, 4, 0, 7, 54, 31, 0, 12, 30, 8, 11, 0, 5, 0, 29, 16, 54, 25, 12, 27, 10, 12, 7, 29, 8, 14, 12, 6, 26, 23, 21, 19, 27, 19, 24, 2, 41, 30, 19, 31, 17, 30, 2, 106, 118, 123, 121, Byte.MAX_VALUE, 119, Byte.MAX_VALUE, 116, 110, 69, 109, 115, 126, 110, 114, 114, 101, 102, 114, 101, 115, 104, 121, 110, 109, 121, 110, 120, 99, 84, Byte.MAX_VALUE, 99, 121, 110, 120, 99, 100, 103, 111, 124, 107, Byte.MAX_VALUE, 123, 107, 125, 122, 81, 122, 103, 99, 107, 97, 123, 122, 120, 117, 124, 105, 23, 8, 5, 4, 14, 62, 21, 8, 12, 4, 62, 17, 14, 13, 13, 8, 15, 6, 62, 8, 15, 21, 4, 19, 23, 0, 13, 113, 110, 98, 112, 102, 101, 110, 107, 110, 115, 126, 88, 100, 111, 98, 100, 108, 88, 110, 105, 110, 115, 110, 102, 107, 88, 99, 98, 107, 102, 126, 86, 73, 69, 87, 65, 66, 73, 76, 73, 84, 89, Byte.MAX_VALUE, 67, 72, 69, 67, 75, Byte.MAX_VALUE, 73, 78, 84, 69, 82, 86, 65, 76, 47, 48, 60, 46, 56, 59, 48, 53, 48, 45, 32, 6, 58, 49, 60, 58, 50, 6, 45, 48, 58, 50, 60, 43};
    }

    static {
        A02();
        A0H = C06248u.class.getSimpleName();
        A0G = AdPlacementType.UNKNOWN;
    }

    public static C06248u A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return new C06248u(hashMap);
    }

    public final int A03() {
        return this.A02 * 1000;
    }

    public final int A04() {
        return this.A03;
    }

    public final int A05() {
        return this.A06;
    }

    public final int A06() {
        return this.A07;
    }

    public final int A07() {
        return this.A08;
    }

    public final int A08() {
        return this.A09;
    }

    public final int A09() {
        return this.A0A;
    }

    public final long A0A() {
        return this.A04 * 1000;
    }

    public final long A0B() {
        return this.A05 * 1000;
    }

    public final long A0C() {
        return this.A0E;
    }

    public final AdPlacementType A0D() {
        return this.A0B;
    }

    public final boolean A0E() {
        return this.A0D;
    }
}
