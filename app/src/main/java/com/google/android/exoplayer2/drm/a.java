package com.google.android.exoplayer2.drm;

import a5.p0;
import a5.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ClearKeyUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return p0.f482a >= 27 ? bArr : p0.m0(c(p0.C(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (p0.f482a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(p0.C(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return p0.m0(sb.toString());
        } catch (JSONException e8) {
            t.d("ClearKeyUtil", "Failed to adjust response data: " + p0.C(bArr), e8);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
