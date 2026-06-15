package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.3g  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04843g {
    public static byte[] A01;
    public static String[] A02 = {"pVDJwwImNDAzAU7MVHYB7KJyYkXB8ng6", "xCCCN", "WmAvu667o4AOfXv58a4lhsk2v5Ms6Skb", "l5AJTkPNjTtBLXifXwK6kFeEJ0fMsOcr", "3rlSEGUZnv4yJ13AM8B6pi", "FEUqx4", "USh9ikhtS0UWG5H8nhVral6z3PYi0bQO", "dZN"};
    public static final String[] A03;
    public final InterfaceC04903m A00;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{106, 7, 43, 56, 33, 106, 43, 46, 106, 43, 57, 106, 37, 44, 44, 47, 36, 57, 35, 60, 47, 106, 37, 56, 106, 35, 36, 43, 58, 58, 56, 37, 58, 56, 35, 43, 62, 47, 104, 77, 9, 65, 64, 77, 77, 76, 71, 7, 106, 79, 11, 89, 78, 91, 68, 89, 95, 78, 79, 5, 18, 63, 54, 42, 122, 47, 41, 122, 47, 52, 62, 63, 40, 41, 46, 59, 52, 62, 122, 45, 50, 59, 46, 122, 51, 41, 122, 50, 59, 42, 42, 63, 52, 51, 52, 61, 116, 122, 13, 50, 35, 122, 62, 53, 52, 125, 46, 122, 35, 53, 47, 122, 45, 59, 52, 46, 122, 46, 53, 122, 41, 63, 63, 122, 46, 50, 51, 41, 101, 39, 10, 3, 31, 79, 26, 28, 79, 26, 1, 11, 10, 29, 28, 27, 14, 1, 11, 79, 24, 7, 14, 27, 79, 6, 28, 79, 7, 14, 31, 31, 10, 1, 6, 1, 8, 65, 79, 56, 7, 22, 79, 6, 28, 79, 27, 7, 6, 28, 79, 6, 1, 14, 31, 31, 29, 0, 31, 29, 6, 14, 27, 10, 80, 77, 108, 97, 96, 37, 68, 97, 118, 90, 85, 90, 92, 94, 27, 90, 95, 27, 75, 73, 94, 93, 94, 73, 94, 85, 88, 94, 72, 89, 120, 55, Byte.MAX_VALUE, 126, 115, 114, 55, 118, 115, 55, 120, 103, 99, 126, 120, 121, 100, 31, 62, 113, 35, 52, 33, 62, 35, 37, 113, 48, 53, 113, 62, 33, 37, 56, 62, 63, 34, 77, 122, 111, 112, 109, 107, 63, 94, 123, 73, Byte.MAX_VALUE, Byte.MAX_VALUE, 58, 124, Byte.MAX_VALUE, 109, Byte.MAX_VALUE, 104, 58, 123, 126, 105, 58, 118, 115, 113, Byte.MAX_VALUE, 58, 110, 114, 115, 105, 110, 81, 64, 25, 88, 84, 25, 112, 25, 74, 92, 92, 80, 87, 94, 25, 77, 81, 80, 74, 6, 60, 10, 16, 23, 69, 22, 16, 7, 8, 12, 22, 22, 12, 10, 11, 69, 12, 22, 69, 11, 10, 18, 69, 7, 0, 12, 11, 2, 69, 23, 0, 19, 12, 0, 18, 0, 1, 75, 76, 74, 125, 120, 67, Byte.MAX_VALUE, 116, 115, 117, Byte.MAX_VALUE, 121, 111, 67, 105, 110, 117, 102, 109, 108, 105, 97, 119, 96, 107, 90, 109, 96, 100, 97, 108, 107, 98, 38, 45, 44, 41, 33, 55, 32, 43, 26, 42, 53, 49, 44, 42, 43, 54, 117, 122, 125, 122, 96, 123, 118, 119, 76, 119, 118, 96, 112, 97, 122, 99, 103, 122, 124, 125, 74, 69, 66, 69, 95, 68, 73, 72, 115, 68, 69, 72, 73, 115, 77, 72, 90, 85, 82, 85, 79, 84, 89, 88, 99, 78, 89, 76, 83, 78, 72, 99, 93, 88, 59, 58, 55, 54, 12, 50, 55, 49, 48, 61, 60, 6, 56, 61, 6, 61, 60, 42, 58, 43, 48, 41, 45, 48, 54, 55, 61, 60, 49, 48, 10, 52, 49, 10, 51, 58, 57, 57, 58, 34, 10, 32, 37, 10, 61, 48, 52, 49, 60, 59, 50, 90, 91, 86, 87, 109, 83, 86, 109, 93, 66, 70, 91, 93, 92, 65, 89, 84, 70, 65, 106, 64, 69, 81, 84, 65, 80, 81, 106, 65, 92, 88, 80, 70, 65, 84, 88, 69, 40, 36, 43, 36, 34, 32, 26, 36, 33, 26, 53, 55, 32, 35, 32, 55, 32, 43, 38, 32, 54, 85, 89, 86, 89, 95, 93, 103, 89, 92, 103, 72, 74, 93, 94, 93, 74, 93, 86, 91, 93, 75, 103, 77, 74, 81, 117, 110, 119, 119, 98, 125, 121, 100, 98, 99, 82, 121, 104, 117, 121, 33, 62, 58, 39, 33, 32, 17, 56, 47, 34, 59, 43, 8, 31, 10, 21, 8, 14, 37, 27, 30, 39, 48, 37, 58, 39, 33, 10, 52, 49, 10, 49, 48, 38, 54, 39, 60, 37, 33, 60, 58, 59, 13, 26, 15, 16, 13, 11, 32, 30, 27, 32, 25, 16, 19, 19, 16, 8, 32, 10, 15, 32, 23, 26, 30, 27, 22, 17, 24, 66, 85, 64, 95, 66, 68, 111, 81, 84, 111, 95, 64, 68, 89, 95, 94, 67, 91, 76, 89, 70, 91, 93, 64, 71, 78, 16, 15, 30, 56, 6, 10, 56, 14, 56, 20, 2, 2, 14, 9, 0, 56, 19, 15, 14, 20};
    }

    static {
        A06();
        A03 = new String[]{A02(452, 7, 105), A02(459, 19, 99), A02(478, 25, 111), A02(503, 15, 8), A02(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE, 9, 64), A02(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL, 21, 111), A02(643, 27, 69), A02(670, 17, 10), A02(540, 21, 127), A02(418, 16, 22), A02(434, 18, 6), A02(398, 20, 41), A02(696, 20, 93), A02(352, 14, 38), A02(561, 25, 2)};
    }

    public C04843g(InterfaceC04903m interfaceC04903m) {
        this.A00 = interfaceC04903m;
    }

    private String A00() {
        return A03(A02(478, 25, 111), A02(60, 69, 96));
    }

    private String A01() {
        return A03(A02(643, 27, 69), A02(129, 64, 85));
    }

    private String A03(String str, String str2) {
        String A94 = this.A00.A94(str, str2);
        if (A94 != null) {
            String value = A02(586, 4, 33);
            return A94.equals(value) ? str2 : A94;
        }
        return str2;
    }

    public static List<C04883k> A04(String str) throws JSONException {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(A02(586, 4, 33))) {
            return new ArrayList();
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
            C04883k c04883k = new C04883k(jSONObject.getInt(A02(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, 12, 116)), jSONObject.getString(A02(590, 11, 55)), jSONObject.optString(A02(366, 16, 63)));
            for (C04883k c04883k2 : A04(jSONObject.optString(A02(382, 16, 127)))) {
                c04883k.A06(c04883k2);
            }
            arrayList.add(c04883k);
        }
        return arrayList;
    }

    public static Map<String, String> A05(String str) {
        String[] strArr;
        if (str != null && !str.isEmpty()) {
            if (A02[0].charAt(31) == '2') {
                throw new RuntimeException();
            }
            A02[0] = "A8tiJT5v19tpxSVqHJBkbDhH2RRDdRkC";
            if (!str.equals(A02(350, 2, 45))) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    for (String str2 : A03) {
                        if (!jSONObject.has(str2)) {
                            return null;
                        }
                        hashMap.put(str2, jSONObject.getString(str2));
                    }
                    if (A04(jSONObject.getString(A02(670, 17, 10))).size() == 0) {
                        A08(AbstractC06048a.A28, new C06058b(A02(239, 20, 107)));
                        return null;
                    } else if (A04(jSONObject.getString(A02(503, 15, 8))).size() == 0) {
                        A08(AbstractC06048a.A25, new C06058b(A02(221, 18, 45)));
                        return null;
                    } else {
                        return hashMap;
                    }
                } catch (JSONException e8) {
                    A08(AbstractC06048a.A27, new C06058b(e8));
                    return null;
                }
            }
        }
        return null;
    }

    private final void A07() {
        C1993la A68 = this.A00.A68();
        A68.A00(A02(518, 22, 15), 0L);
        A68.A02();
    }

    public static void A08(int i10, C06058b c06058b) {
        C1899k0 sdkContext = AnonymousClass84.A00();
        if (sdkContext != null) {
            sdkContext.A08().AAu(A02(687, 9, 19), i10, c06058b);
        }
    }

    public final long A09() {
        return this.A00.A8G(A02(518, 22, 15), 0L);
    }

    public final C04883k A0A() {
        C04883k c04883k = new C04883k(A00());
        try {
            for (C04883k hideAdParent : A04(A03(A02(503, 15, 8), A02(0, 0, 48)))) {
                c04883k.A06(hideAdParent);
            }
        } catch (JSONException e8) {
            A07();
            A08(AbstractC06048a.A26, new C06058b(e8));
        }
        return c04883k;
    }

    public final C04883k A0B() {
        C04883k c04883k = new C04883k(A01());
        try {
            for (C04883k reportAdParent : A04(A03(A02(670, 17, 10), A02(0, 0, 48)))) {
                c04883k.A06(reportAdParent);
            }
        } catch (JSONException e8) {
            A07();
            A08(AbstractC06048a.A29, new C06058b(e8));
        }
        return c04883k;
    }

    public final String A0C() {
        return A03(A02(352, 14, 38), A02(0, 0, 48));
    }

    public final String A0D() {
        return A03(A02(398, 20, 41), A02(312, 38, 95));
    }

    public final String A0E() {
        return A03(A02(418, 16, 22), A02(38, 10, 19));
    }

    public final String A0F() {
        return A03(A02(434, 18, 6), A02(48, 12, 17));
    }

    public final String A0G() {
        return A03(A02(459, 19, 99), A02(268, 23, 32));
    }

    public final String A0H() {
        return A03(A02(452, 7, 105), A02(193, 7, 63));
    }

    public final String A0I() {
        return A03(A02(561, 25, 2), A02(0, 0, 48));
    }

    public final String A0J() {
        return A03(A02(540, 21, 127), A02(200, 21, 1));
    }

    public final String A0K() {
        return A03(A02(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL, 21, 111), A02(0, 38, 112));
    }

    public final String A0L() {
        return A03(A02(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE, 9, 64), A02(259, 9, 37));
    }

    public final String A0M() {
        return A03(A02(696, 20, 93), A02(291, 21, 3));
    }

    public final void A0N(String str) {
        String[] strArr;
        Map<String, String> A05 = A05(str);
        if (A05 == null || A05.size() != A03.length) {
            return;
        }
        C1993la A68 = this.A00.A68();
        for (String str2 : A03) {
            A68.A01(str2, A05.get(str2));
        }
        if (A02[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "MCE7RaiUtGHbfQd9DpKX6Z";
        strArr2[5] = "LB7njF";
        A68.A00(A02(518, 22, 15), System.currentTimeMillis());
        A68.A02();
    }

    public final boolean A0O(Context context, boolean z10) {
        return (z10 || C06419m.A2X(context)) && ((A09() > 0L ? 1 : (A09() == 0L ? 0 : -1)) > 0);
    }
}
