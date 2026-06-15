package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum A03 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.Jo  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class EnumC0885Jo {
    public static byte[] A00;
    public static String[] A01 = {"tECI8EX1cuXhUwYvYft6TDcXrBYDxzmb", "U9lWMC", "VeFVBuimOKBZ6IhnkHNGVdQ2rus8nhqD", "5Ss9iINs1N203h8UwVdzTm0B7XXAo0aC", "SEbmC0K2IQ7flaHMYhUIDNtJoPD", "aE6Std6il1HEkTA4be5XQZw6wdO2x4l2", "Oc9eC60MpRTSk1JwhF2h3JFaDWGSLdec", "vmvIsg"};
    public static final /* synthetic */ EnumC0885Jo[] A02;
    public static final EnumC0885Jo A03;
    public static final EnumC0885Jo A04;
    public static final EnumC0885Jo A05;
    public static final EnumC0885Jo A06;
    public static final EnumC0885Jo A07;
    public static final EnumC0885Jo A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{20, 39, 39, 52, 44, 71, 106, 106, 105, 96, 100, 107, 102, 77, 87, 64, 78, 71, 105, 78, 84, 95, 114, 122, 117, 115, 100, 46, 9, 15, 20, 19, 26, 94, 101, 96, 101, 100, 124, 101, 43, Byte.MAX_VALUE, 114, 123, 110, 43, 100, 109, 43, 97, 120, 100, 101, 43, 100, 105, 97, 110, 104, Byte.MAX_VALUE, 43, 96, 110, 114};
    }

    public abstract boolean A05(JSONArray jSONArray, int i10);

    public abstract boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i10);

    public abstract boolean A07(JSONObject jSONObject, String str);

    public abstract boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String A022 = A02(0, 5, 26);
        A03 = new EnumC0885Jo(A022, 0) { // from class: com.facebook.ads.redexgen.X.aa
            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A05(JSONArray jSONArray, int i10) {
                return jSONArray.optJSONArray(i10) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return AbstractC0886Jp.A01(jSONArray.optJSONArray(i10), jSONArray2.optJSONArray(i10));
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC0886Jp.A01(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        final String A023 = A02(5, 7, 74);
        A04 = new EnumC0885Jo(A023, 1) { // from class: com.facebook.ads.redexgen.X.aZ
            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A05(JSONArray jSONArray, int i10) {
                return jSONArray.optBoolean(i10, true) == jSONArray.optBoolean(i10, false);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return jSONArray.optBoolean(i10) == jSONArray2.optBoolean(i10);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        final String A024 = A02(12, 6, 109);
        A05 = new EnumC0885Jo(A024, 2) { // from class: com.facebook.ads.redexgen.X.aQ
            public static String[] A00 = {"1ZkmGDQLr4HHzESqnZwtiaJskrCoCdgr", "ZuXKvCVbKiCO09p9pYqDyLAizJSm2C6Q", "nueEAEfgKP3aoalcvcV3IYW8uca", "ZSO21PM30lkMK5VtmFwCGRnC4HfRl6Ua", "ewMxBq6LlUCdKuikxzCZkjc2M9R", "JDKZd", "VKrSZQCGjlRNXLKdswkZgNPUMacPzyqz", "RC4irD47U"};

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A05(JSONArray jSONArray, int i10) {
                return jSONArray.optInt(i10, 0) == jSONArray.optInt(i10, 1) && jSONArray.optDouble(i10, 0.0d) == jSONArray.optDouble(i10, 1.0d) && ((double) jSONArray.optInt(i10, 0)) != jSONArray.optDouble(i10, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return jSONArray.optDouble(i10) == jSONArray2.optDouble(i10);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A07(JSONObject jSONObject, String str) {
                if (jSONObject.optInt(str, 0) != jSONObject.optInt(str, 1)) {
                    return false;
                }
                double optDouble = jSONObject.optDouble(str, 0.0d);
                if (A00[0].charAt(28) != 'C') {
                    throw new RuntimeException();
                }
                String[] strArr = A00;
                strArr[2] = "ccqqHA83ZTWiIg3HPQbc0aiXb2J";
                strArr[4] = "9RASlEbgrOZWYduHYKXmEPevqLf";
                return optDouble == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        final String A025 = A02(18, 3, 111);
        A06 = new EnumC0885Jo(A025, 3) { // from class: com.facebook.ads.redexgen.X.aO
            public static String[] A00 = {"n7SKlqK", "ov2fNltgQ2EAr85rcAXjQlotsfjsnjuH", "ovWB89LlYvQ4xO5HZfV2GFW4RL9XN4h2", "w8d2diIE5BdvGUn1gxyTHp0hEgENQTV7", "yQnpH44oXSx8ccz3NjdKCULhtA2Hxjvh", "86uwoduXnLYKbsdqFVwkHHSOZ5iH2tHE", "J0bksEA3Nc1mI6xnOvQtusRgBbL88ZUJ", "XzqVLub6oNjkAstpNhW0t4rN94XX0A8D"};

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A05(JSONArray jSONArray, int i10) {
                if (jSONArray.optInt(i10, 0) != jSONArray.optInt(i10, 1) || jSONArray.optDouble(i10, 0.0d) != jSONArray.optDouble(i10, 1.0d)) {
                    return false;
                }
                int optInt = jSONArray.optInt(i10, 0);
                if (A00[4].charAt(31) != 'h') {
                    throw new RuntimeException();
                }
                A00[4] = "ESUjQDK13szqjYK8RJAQddjghxYzdQOh";
                return ((double) optInt) == jSONArray.optDouble(i10, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return jSONArray.optInt(i10) == jSONArray2.optInt(i10);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A07(JSONObject jSONObject, String str) {
                if (jSONObject.optInt(str, 0) != jSONObject.optInt(str, 1) || jSONObject.optDouble(str, 0.0d) != jSONObject.optDouble(str, 1.0d)) {
                    return false;
                }
                int optInt = jSONObject.optInt(str, 0);
                String[] strArr = A00;
                if (strArr[1].charAt(1) != strArr[2].charAt(1)) {
                    throw new RuntimeException();
                }
                A00[0] = "ksANhPg";
                return ((double) optInt) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        final String A026 = A02(21, 6, 95);
        A07 = new EnumC0885Jo(A026, 4) { // from class: com.facebook.ads.redexgen.X.aN
            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A05(JSONArray jSONArray, int i10) {
                return jSONArray.optJSONObject(i10) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return AbstractC0886Jp.A02(jSONArray.optJSONObject(i10), jSONArray2.optJSONObject(i10));
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC0886Jp.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        final String A027 = A02(27, 6, 50);
        A08 = new EnumC0885Jo(A027, 5) { // from class: com.facebook.ads.redexgen.X.aM
            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A05(JSONArray jSONArray, int i10) {
                return jSONArray.optString(i10) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return jSONArray.optString(i10).equals(jSONArray2.optString(i10));
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC0885Jo
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A02 = A04();
    }

    public EnumC0885Jo(String str, int i10) {
    }

    public static EnumC0885Jo A00(JSONArray jSONArray, int i10) {
        EnumC0885Jo[] values;
        for (EnumC0885Jo type : values()) {
            if (A01[0].charAt(25) != 'B') {
                throw new RuntimeException();
            }
            A01[0] = "tSTzibjLEZmnKLeJSBWWFmo8ABKhWaoK";
            if (type.A05(jSONArray, i10)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC0885Jo A01(JSONObject jSONObject, String str) {
        EnumC0885Jo[] values;
        for (EnumC0885Jo type : values()) {
            String[] strArr = A01;
            if (strArr[3].charAt(28) == strArr[6].charAt(28)) {
                throw new RuntimeException();
            }
            A01[0] = "zRruk8gFetbjQnDa2F20MljfYBQnm1P6";
            if (type.A07(jSONObject, str)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static /* synthetic */ EnumC0885Jo[] A04() {
        return new EnumC0885Jo[]{A03, A04, A05, A06, A07, A08};
    }

    public static EnumC0885Jo valueOf(String str) {
        return (EnumC0885Jo) Enum.valueOf(EnumC0885Jo.class, str);
    }

    public static EnumC0885Jo[] values() {
        return (EnumC0885Jo[]) A02.clone();
    }
}
