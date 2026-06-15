package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "D63737392: Class for performance negative testing")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class Q4 {
    public static byte[] A01;
    public Map<Integer, Q3> A00 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-32, -1, 17, 3, -22, -1, 18, 3, 12, 1, 23, -53, -22, -11, -11, -26, -13, 3, 34, 38, 28, 39, 28, 34, 33, -40, -26, -14, -11, -15, -18, -13, -20, -41, -26, -7, -22};
    }

    public Q4(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int jitter = 0; jitter < jSONArray.length(); jitter++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(jitter);
                        int i10 = jSONObject.getInt(A00(17, 8, 111));
                        int samplingRate = jSONObject.getInt(A00(0, 11, 90));
                        int position = jSONObject.getInt(A00(11, 6, 61));
                        this.A00.put(Integer.valueOf(i10), new Q3(this, samplingRate, position, jSONObject.getInt(A00(25, 12, 65))));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final Q3 A02() {
        if (this.A00.containsKey(0)) {
            return this.A00.get(0);
        }
        return null;
    }
}
