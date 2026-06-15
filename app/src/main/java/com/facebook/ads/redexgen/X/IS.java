package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.ironsource.j3;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class IS {
    public static byte[] A00;
    public static String[] A01 = {"m5Jty9nXe8L2gKLWEWc3vH5rHCR7lq15", "nXqLn2RrfIlx0c2v1RTl0CneHVNjUcek", "yIjJHM1120PmYi1BMLCe9caFimcQ2nFl", "mlpcJRY57Lt3u3e0DOF4Ze17XEKszIMh", "yNEzWcoMu1kvA6ly91E0yJELmkdnUTW9", "LQJ0sSZIBnjE3wRe9pGlPD4TX9Tbmis1", "3e9PCxJTK3pug342JyVCHaGplQMI3S8I", "kyVsWmEjdCkwx1v5lgIpAQohzDFxobhM"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static WebResourceResponse A00(C1900k1 c1900k1, WebResourceRequest webResourceRequest, Uri uri, String str, HashMap<String, String> hashMap) throws IOException {
        String A02 = A02(85, 5, 1);
        InterfaceC1509dZ A0H = J7.A01(c1900k1.A02()).A0H(c1900k1);
        C05987t.A0H(c1900k1, uri.toString());
        try {
            IT it = new IT(c1900k1.A02(), uri, A0H);
            int available = it.available();
            if (available <= 0) {
                A05(c1900k1, 1, new Pair[]{new Pair(A02(61, 9, 46), String.valueOf(available))});
                return null;
            }
            String A03 = A03(webResourceRequest.getRequestHeaders());
            if (A03 == null) {
                c1900k1.A0F().A63();
                A06(hashMap, available);
                return new WebResourceResponse(str, null, 200, A02(44, 2, 122), hashMap, it);
            }
            try {
                IR A012 = A01(A03);
                if (!A012.A03) {
                    A05(c1900k1, 0, new Pair[]{new Pair(A02(94, 5, 77), A012.A02 != null ? A012.A02 : A02(90, 4, 30))});
                    return null;
                }
                int i10 = A012.A01;
                int i11 = A012.A00 == -1 ? available - 1 : A012.A00;
                A06(hashMap, available);
                hashMap.put(A02(31, 13, 93), A02(75, 6, 3) + i10 + A02(1, 1, 92) + i11 + A02(2, 1, 88) + available);
                c1900k1.A0F().A63();
                return new WebResourceResponse(str, null, j3.c.b.f17916g, A02(46, 15, 10), hashMap, it);
            } catch (NumberFormatException e8) {
                A05(c1900k1, 3, new Pair[]{new Pair(A02, e8.toString())});
                return null;
            }
        } catch (IOException e10) {
            A05(c1900k1, 2, new Pair[]{new Pair(A02, e10.toString())});
            return null;
        }
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 26);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-114, -93, -95, 100, -104, -70, -70, -68, -57, -53, -124, -87, -72, -59, -66, -68, -54, -70, -26, -27, -21, -36, -27, -21, -92, -61, -36, -27, -34, -21, -33, -70, -26, -27, -21, -36, -27, -21, -92, -55, -40, -27, -34, -36, -29, -33, 116, -123, -106, -104, -115, -123, -112, 68, 103, -109, -110, -104, -119, -110, -104, -87, -66, -87, -79, -76, -87, -86, -76, -83, -127, -104, -109, -124, -110, Byte.MAX_VALUE, -106, -111, -126, -112, 61, -74, -62, -73, -72, Byte.MIN_VALUE, -115, -115, -118, -115, -90, -83, -92, -92, -39, -56, -43, -50, -52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A05(C1900k1 c1900k1, int i10, Pair<String, String>[] pairArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(81, 4, 57), i10);
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        c1900k1.A0F().A62(jSONObject.toString());
    }

    static {
        A04();
    }

    public static IR A01(String str) {
        if (str == null) {
            IR parseResult = new IR();
            parseResult.A03 = false;
            parseResult.A02 = null;
            return parseResult;
        }
        String[] strArr = A01;
        if (strArr[0].charAt(24) != strArr[1].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "Dtu90aCnfjxtl3iZcl85ZURNtT9G66qF";
        strArr2[6] = "JBE4H6DVGxkCv3KpLfIzSFjkaXJMKyPO";
        String[] split = str.split(A02(3, 1, 13));
        if (split.length >= 2) {
            if (A02(70, 5, 5).equals(split[0].toLowerCase(Locale.US).trim())) {
                if (split[1].trim().split(A02(0, 1, 72)).length != 1) {
                    IR ir = new IR();
                    ir.A03 = false;
                    ir.A02 = str;
                    return ir;
                }
                String[] ranges = split[1].trim().split(A02(1, 1, 92));
                IR ir2 = new IR();
                ir2.A03 = true;
                ir2.A02 = str;
                ir2.A01 = TextUtils.isEmpty(ranges[0]) ? 0 : Integer.parseInt(ranges[0]);
                if (ranges.length > 1) {
                    ir2.A00 = TextUtils.isEmpty(ranges[1]) ? -1 : Integer.parseInt(ranges[1]);
                } else {
                    ir2.A00 = -1;
                }
                return ir2;
            }
        }
        IR ir3 = new IR();
        ir3.A03 = false;
        ir3.A02 = str;
        return ir3;
    }

    public static String A03(Map<String, String> map) {
        for (String str : map.keySet()) {
            Locale locale = Locale.US;
            String[] strArr = A01;
            String header = strArr[0];
            if (header.charAt(24) != strArr[1].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "WwPgvkKaNJbx73tjItPTyID0XOg3nGIt";
            strArr2[6] = "4YitGEy8BigPs3HGnT2LP2sfmluRsQ6B";
            if (A02(94, 5, 77).equals(str.toLowerCase(locale))) {
                return map.get(str);
            }
        }
        return null;
    }

    public static void A06(HashMap<String, String> hashMap, int i10) {
        hashMap.put(A02(4, 13, 61), A02(70, 5, 5));
        hashMap.put(A02(17, 14, 93), String.valueOf(i10));
    }
}
