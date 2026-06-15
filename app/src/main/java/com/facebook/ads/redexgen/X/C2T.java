package com.facebook.ads.redexgen.X;

import com.google.android.gms.common.api.Api;
import com.ironsource.j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.2T  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2T implements Serializable {
    public static byte[] A0B = null;
    public static final long serialVersionUID = 85021702336014823L;
    public C2V A00;
    public C2W A01;
    public C04522a A02;
    public C04552d A03;
    public C04562e A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0B = new byte[]{109, 79, 90, 75, 73, 65, 92, 87, 62, 21, 13, 20, 22, 21, 27, 30, 9, 96, 84, 73, 75, 6, 97, 73, 73, 65, 74, 67, 6, 118, 74, 71, 95, 6, 117, 82, 73, 84, 67, 19, 46, 122, 45, 51, 54, 54, 122, 59, 47, 46, 53, 55, 59, 46, 51, 57, 59, 54, 54, 35, 122, 53, 42, 63, 52, 122, 51, 52, 122, 1, 41, 63, 57, 41, 7, 41, 101, 86, 67, 94, 89, 80, 85, 98, 113, 110, 98, 112, 116, 84, 110, 125, 98, 15, 10, 49, 13, 28, 11, 15, 26, 7, 24, 11, 49, 26, 23, 30, 11, 48, 33, 33, 14, 34, 56, 43, 52, 64, 77, 70, 91, 78, 89, 88, 88, 67, 66, 115, 69, 79, 67, 66, 99, 97, 108, 108, 95, 116, 111, 95, 97, 99, 116, 105, 111, 110, 37, 39, 50, 35, 33, 41, 52, 63, 118, 116, 97, 112, 114, 122, 103, 108, 74, 97, 112, 109, 97, 97, 96, 105, 100, 124, 90, 102, 105, 108, 102, 110, 90, 113, 96, 125, 113, 30, 31, 9, 14, 19, 20, 27, 14, 19, 21, 20, 37, 14, 19, 14, 22, 31, 69, 78, 86, 79, 77, 78, 64, 69, 126, 66, 78, 84, 79, 85, 117, 126, 102, Byte.MAX_VALUE, 125, 126, 112, 117, 78, 114, 126, 100, Byte.MAX_VALUE, 101, 78, 101, 116, 105, 101, 19, 24, 18, 41, 21, 23, 4, 18, 41, 16, 25, 4, 21, 19, 41, 0, 31, 19, 1, 41, 2, 31, 27, 19, 80, 91, 81, 106, 86, 84, 71, 81, 106, 83, 90, 71, 86, 80, 106, 67, 92, 80, 66, 106, 65, 92, 88, 80, 106, 83, 90, 71, 106, 70, 80, 86, 90, 91, 81, 106, 80, 91, 81, 106, 86, 84, 71, 81, 69, 78, 68, Byte.MAX_VALUE, 67, 65, 82, 68, Byte.MAX_VALUE, 73, 77, 65, 71, 69, 83, 61, 57, 58, 63, 4, 56, 52, 54, 54, 58, 53, 63, 32, 52, 41, 43, 25, 33, 41, 41, 33, 42, 35, 25, 54, 42, 39, 63, 25, 53, 50, 41, 52, 35, 25, 50, 35, 62, 50, 99, 97, 106, 97, 118, 109, 103, 91, 112, 97, 124, 112, 109, 96, 108, 98, 109, 113, 123, Byte.MAX_VALUE, 115, 117, 119, 34, 56, 20, 46, 37, 47, 20, 40, 42, 57, 47, 20, 61, 121, 20, 57, 46, 47, 46, 56, 34, 44, 37, 20, 46, 37, 42, 41, 39, 46, 47, 109, 119, 91, 107, 103, 91, 97, 106, 96, 91, 103, 101, 118, 96, 91, 114, 54, 91, 118, 97, 96, 97, 119, 109, 99, 106, 91, 97, 106, 101, 102, 104, 97, 96, 94, 68, 104, 69, 82, 64, 86, 69, 83, 82, 83, 104, 86, 83, 63, 37, 9, 37, 51, 53, 57, 56, 50, 9, 51, 56, 50, 9, 53, 55, 36, 50, 9, 51, 56, 55, 52, 58, 51, 50, 94, 68, 104, 65, 94, 83, 82, 88, 104, 86, 66, 83, 94, 88, 104, 90, 66, 67, 82, 83, 59, 33, 13, 37, 51, 38, 49, 58, 13, 51, 60, 54, 13, 48, 32, 61, 37, 33, 55, 114, 99, 97, 105, 99, 101, 103, 32, 51, 38, 59, 60, 53, 13, 49, 61, 39, 60, 38, 96, 115, 102, 123, 124, 117, 77, 113, 125, 103, 124, 102, 77, 102, 119, 106, 102, 93, 78, 91, 70, 65, 72, 112, 91, 74, 87, 91, 124, 111, 122, 103, 96, 105, 81, 120, 111, 98, 123, 107, 67, 85, 83, 95, 94, 84, 67, 111, 86, 95, 66, 111, 94, 85, 72, 68, 111, 83, 68, 81, 0, 22, 16, 28, 29, 23, 0, 44, 21, 28, 1, 44, 1, 22, 4, 18, 1, 23, 15, 20, 19, 11, 35, 25, 18, 24, 35, 31, 29, 14, 24, 6, 29, 26, 2, 42, 16, 13, 28, 1, 42, 1, 7, 20, 27, 6, 28, 1, 28, 26, 27, 34, 57, 62, 38, 14, 56, 63, 37, 35, 62, 14, 37, 35, 48, 63, 34, 56, 37, 56, 62, 63, 117, 111, 124, 99, 89, 114, 99, 126, 114, 96, 120, 122, 99, 76, 114, 125, 119, 76, Byte.MAX_VALUE, 124, 96, 118, 76, 97, 118, 100, 114, 97, 119, 20, 12, 14, 23, 23, 6, 5, 11, 2, 56, 20, 2, 4, 8, 9, 3, 20, 87, 75, 71, 77, 69, 72, 123, 71, 75, 74, 80, 65, 92, 80, 119, 113, 102, 112, 109, 112, 104, 97, 120, 101, 120, 96, 105, 63, 36, 57, 33, 35, 58, 58, 43, 40, 38, 47, 21, 57, 47, 41, 37, 36, 46, 57, 118, 113, 111, 49, 46, 35, 34, 40, 24, 38, 50, 51, 40, 55, 43, 38, 62, 24, 34, 41, 38, 37, 43, 34, 35, 47, 48, 61, 60, 54, 6, 61, 44, 43, 56, 45, 48, 54, 55, 6, 42, 60, 58, 13, 18, 31, 30, 20, 36, 11, 9, 30, 23, 20, 26, 31, 36, 8, 18, 1, 30, 36, 25, 2, 15, 30, 8, 6, 25, 20, 21, 31, 47, 5, 2, 28, 5, 27, 22, 6, 26};
    }

    public static C2T A00(JSONObject jSONObject) {
        int optInt;
        C2T c2t = new C2T();
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(355, 12, 29));
        c2t.A07(new C2Z().A0X(jSONObject.optString(A01(741, 5, 21))).A0W(jSONObject.optString(A01(733, 8, 29))).A0L(jSONObject.optString(A01(117, 4, 59))).A0V(jSONObject.optString(A01(719, 14, 61))).A0T(jSONObject.optString(A01(569, 12, 23))).A0Q(jSONObject.optString(A01(529, 12, 75))).A0I(jSONObject.optString(A01(109, 8, 72))).A0N(jSONObject.optString(A01(200, 14, 56))).A0H(jSONObject.optString(A01(93, 16, 119))).A0J(jSONObject.optString(A01(146, 8, 95))).A0M(jSONObject.optString(A01(183, 17, 99))).A0S(A03(optJSONObject, A01(558, 11, 54), A01(76, 6, 46))).A0O(A03(optJSONObject, A01(214, 19, 8), A01(8, 9, 99))).A0U(A03(optJSONObject, A01(673, 9, 31), A01(89, 4, 30))).A0K(A03(optJSONObject, A01(154, 13, 12), A01(0, 8, 55))).A0R(A03(optJSONObject, A01(541, 17, 11), A01(82, 7, 30))).A0P(A03(optJSONObject, A01(328, 27, 95), A01(17, 22, 63))).A0Y());
        c2t.A0A(jSONObject.optString(A01(522, 7, 27)));
        c2t.A08(new C04552d(jSONObject.optString(A01(316, 12, 66)), jSONObject.optString(A01(132, 14, 25)), jSONObject.optJSONObject(A01(121, 11, 53)), jSONObject.optString(A02(jSONObject))));
        String A01 = A01(746, 19, 83);
        if (jSONObject.optInt(A01, -1) == -1) {
            optInt = jSONObject.optInt(A01(IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD, 17, 126), -1);
        } else {
            optInt = jSONObject.optInt(A01, -1);
        }
        C2V A0K = new C2V().A0L(jSONObject.optString(A01(832, 9, 105))).A0J(jSONObject.optLong(A01(808, 24, 98), -1L)).A0F(optInt).A0E(jSONObject.optInt(A01(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, 18, 106), Api.BaseClientBuilder.API_PRIORITY_OTHER)).A0D(jSONObject.optInt(A01(581, 20, 41), -1)).A0K(C04672p.A01(jSONObject));
        JSONObject optJSONObject2 = jSONObject.optJSONObject(A01(373, 5, 11));
        if (optJSONObject2 != null) {
            C2V adMediaBuilder = A0K.A0M(optJSONObject2.optString(A01(765, 3, 26)));
            adMediaBuilder.A0I(optJSONObject2.optInt(A01(841, 5, 107))).A0H(optJSONObject2.optInt(A01(367, 6, 28)));
        }
        c2t.A05(A0K);
        c2t.A0E(jSONObject.optBoolean(A01(652, 21, 72)));
        c2t.A09(new C04562e(CV.A04(jSONObject.optJSONArray(A01(301, 15, 57))), jSONObject.optLong(A01(233, 24, 111), 0L), jSONObject.optLong(A01(257, 44, 44), 0L), jSONObject.optBoolean(A01(457, 26, 79)), jSONObject.optBoolean(A01(378, 31, 82), false), jSONObject.optBoolean(A01(j3.a.b.f17904i, 34, 29), false)));
        c2t.A0B(jSONObject.optBoolean(A01(503, 19, 75)));
        return c2t;
    }

    public static String A02(JSONObject jSONObject) {
        String A01 = A01(167, 16, 28);
        String A012 = A01(39, 37, 67);
        String optString = jSONObject.optString(A01, A012);
        if (optString.equals(A012)) {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(355, 12, 29));
            if (optJSONObject != null) {
                A012 = optJSONObject.optString(A01, A012);
            }
            return A012;
        }
        return optString;
    }

    public static String A03(JSONObject jSONObject, String str, String str2) {
        return jSONObject != null ? jSONObject.optString(str, str2) : str2;
    }

    private void A05(C2V c2v) {
        this.A00 = c2v;
    }

    private final void A06(C2W c2w) {
        this.A01 = c2w;
    }

    private final void A07(C04522a c04522a) {
        this.A02 = c04522a;
    }

    private final void A08(C04552d c04552d) {
        this.A03 = c04552d;
    }

    private final void A09(C04562e c04562e) {
        this.A04 = c04562e;
    }

    private final void A0A(String str) {
        this.A05 = str;
    }

    private final void A0B(boolean z10) {
        this.A07 = z10;
    }

    private final void A0C(boolean z10) {
        this.A08 = z10;
    }

    private final void A0D(boolean z10) {
        this.A09 = z10;
    }

    private final void A0E(boolean z10) {
        this.A0A = z10;
    }

    public final C2W A0F() {
        return this.A01;
    }

    public final C04522a A0G() {
        return this.A02;
    }

    public final C04552d A0H() {
        return this.A03;
    }

    public final C04562e A0I() {
        return this.A04;
    }

    public final String A0J() {
        return this.A05;
    }

    public final void A0K(JSONObject jSONObject) {
        A06(this.A00.A0Q());
    }

    public final void A0L(JSONObject jSONObject) {
        this.A00.A0O(jSONObject.optBoolean(A01(768, 22, 94)));
        this.A00.A0N(jSONObject.optBoolean(A01(483, 20, 46), true));
        A06(this.A00.A0Q());
        A0O(jSONObject.optBoolean(A01(443, 14, 46)));
        A0C(jSONObject.optBoolean(A01(619, 13, 101)));
        A0D(jSONObject.optBoolean(A01(632, 20, 108)));
    }

    public final void A0M(JSONObject jSONObject) {
        this.A00.A0N(jSONObject.optBoolean(A01(483, 20, 46), true));
        A06(this.A00.A0Q());
    }

    public final void A0N(JSONObject jSONObject) {
        this.A00.A0G(jSONObject.optInt(A01(790, 18, 64)));
        this.A00.A0N(jSONObject.optBoolean(A01(483, 20, 46), true));
        this.A00.A0P(jSONObject.optBoolean(A01(682, 20, 10), false));
        A06(this.A00.A0Q());
        A0C(jSONObject.optBoolean(A01(619, 13, 101)));
    }

    public final void A0O(boolean z10) {
        this.A06 = z10;
    }

    public final boolean A0P() {
        return this.A06;
    }

    public final boolean A0Q() {
        return this.A07;
    }

    public final boolean A0R() {
        return this.A08;
    }

    public final boolean A0S() {
        return this.A0A;
    }
}
