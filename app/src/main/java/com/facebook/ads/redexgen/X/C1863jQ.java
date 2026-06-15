package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.ironsource.j3;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.jQ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1863jQ implements A5 {
    public static byte[] A02;
    public static String[] A03 = {"nSyQhtMfpq2jNqGGNPt5NI90oeOfe1", "vvfyUHTPPgzLU9ZJhsHsRroWK12HyjVH", "qslzdaLavUZ6hWrKlj1Zt3UP1k3mmB4y", "NIvb6IKYOgsNqkR8AWNkoYQGWWwuN", "c4tQ8NQ91n2uUc9nTvHWxfXCnHLpYFgI", "tMmd9elNu7YQkbRY7XCik1QBLE", "7gl4a25pOcE06E3aPI2wtSqogJ", "FAOoLRBR29CEN05oKXcOTgWFdOs"};
    public static final String A04;
    public C1899k0 A00;
    public C1864jR A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{60, 122, 115, 110, 60, 121, 106, 121, 114, 104, 85, 120, 60, 87, 4, 2, 20, 20, 18, 4, 4, 17, 2, 27, 27, 14, 89, 18, 47, 14, 7, 14, 31, 14, 15, 75, 14, 29, 14, 5, 31, 24, 75, 14, 19, 8, 14, 14, 15, 14, 15, 75, 25, 14, 31, 25, 18, 75, 7, 2, 6, 2, 31, 69, 75, 40, 4, 30, 5, 31, 81, 75, 44, 11, 3, 6, 15, 14, 74, 30, 5, 74, 26, 11, 24, 25, 15, 74, 11, 4, 74, 15, 28, 15, 4, 30, 74, 3, 4, 74, 15, 28, 15, 4, 30, 25, 74, 11, 24, 24, 11, 19, 74, 12, 5, 24, 74, 14, 3, 25, 26, 11, 30, 9, 2, 74, 12, 11, 3, 6, 31, 24, 15, 68, 88, Byte.MAX_VALUE, 119, 114, 123, 122, 62, 106, 113, 62, 110, Byte.MAX_VALUE, 108, 109, 123, 62, Byte.MAX_VALUE, 112, 62, 123, 104, 123, 112, 106, 62, 119, 112, 62, 123, 104, 123, 112, 106, 109, 62, 114, 119, 109, 106, 62, 105, 118, 123, 112, 62, 110, 108, 123, 110, Byte.MAX_VALUE, 108, 119, 112, 121, 62, 122, 119, 109, 110, Byte.MAX_VALUE, 106, 125, 118, 62, 110, Byte.MAX_VALUE, 103, 114, 113, Byte.MAX_VALUE, 122, 48, 26, 44, 59, 63, 44, 59, 105, 57, 59, 38, 42, 44, 58, 58, 44, 45, 105, 44, 63, 44, 39, 61, 0, 45, 105, 20, 34, 53, 49, 34, 53, 103, 53, 34, 51, 50, 53, 41, 34, 35, 103, 41, 40, 41, 106, 53, 34, 51, 53, 62, 38, 37, 43, 34, 103, 34, 53, 53, 40, 53, 103, 36, 40, 35, 34, 103, 109, 91, 76, 72, 91, 76, 30, 76, 91, 74, 75, 76, 80, 91, 90, 30, 76, 91, 74, 76, 71, 95, 92, 82, 91, 30, 91, 76, 76, 81, 76, 30, 93, 81, 90, 91, 30, 25, 34, 45, 46, 32, 41, 108, 56, 35, 108, 60, 45, 62, 63, 41, 108, 63, 41, 62, 58, 41, 62, 108, 62, 41, 63, 60, 35, 34, 63, 41, 108, 45, 56, 108, 60, 35, 63, 37, 56, 37, 35, 34, 108, 29, 17, 26, 27, 94, 77, 94, 85, 79, 72, 7, 4, 0, 21, 20, 19, 4, 76, 2, 14, 15, 7, 8, 6, 76, 4, 23, 4, 15, 21, 76, 12, 0, 6, 8, 2, 39, 36, 32, 53, 52, 51, 36, 30, 34, 46, 47, 39, 40, 38, 23, 26, 116, 99, 101, 105, 116, 98, 89, 98, 103, 114, 103, 100, 103, 117, 99, 73, 82, 86, 88, 83, 22, 13, 9, 7, 12, 61, 11, 6, 74, 81, 85, 91, 80, 77};
    }

    static {
        A01();
        A04 = C1863jQ.class.getSimpleName();
    }

    public C1863jQ(C1899k0 c1899k0, C1864jR c1864jR) {
        this.A00 = c1899k0;
        this.A01 = c1864jR;
    }

    private void A02(Set<String> eventsToRetry, Set<String> eventsToDelete) {
        int A0B = this.A01.A0B(AbstractC06439o.A0G(this.A00), eventsToRetry, eventsToDelete);
        if (A0B > 0) {
            this.A00.A08().AAu(A00(j3.a.b.f17900e, 15, 38), AbstractC06048a.A10, new C06058b(A00(28, 44, 75) + A0B));
        }
    }

    @Override // com.facebook.ads.redexgen.X.A5
    public final JSONObject A5B() {
        int A08;
        JSONArray A042;
        int A0F = AbstractC06439o.A0F(this.A00);
        List<JSONObject> A0C = this.A01.A0C(A0F);
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : A0C) {
            try {
                String optString = jSONObject2.optString(A00(420, 5, 29));
                String uuid = UUID.randomUUID().toString();
                jSONObject.put(uuid, optString);
                jSONObject2.put(A00(425, 8, 66), uuid);
            } catch (JSONException e8) {
                if (this.A00.A05().AAD()) {
                    Log.e(A04, A00(134, 72, 62), e8);
                }
            }
        }
        JSONArray jSONArray = new JSONArray((Collection) A0C);
        if (AbstractC06439o.A0P(this.A00) && (A042 = C06068c.A04(this.A00, (A08 = AbstractC06439o.A08(this.A00)))) != null) {
            int eventLimit = A042.length();
            if (eventLimit > 0) {
                jSONArray = C1839j2.A02(this.A00, A042, jSONArray, A0F + A08);
            }
        }
        JSONObject jSONObject3 = null;
        try {
            int eventLimit2 = jSONArray.length();
            if (eventLimit2 > 0) {
                jSONObject3 = new JSONObject();
                int eventLimit3 = jSONObject.length();
                if (eventLimit3 > 0) {
                    jSONObject3.put(A00(433, 6, 30), jSONObject);
                }
                jSONObject3.put(A00(357, 6, 27), jSONArray);
            }
            return jSONObject3;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.A5
    public final boolean AAQ() {
        return this.A01.A0A() > 0;
    }

    @Override // com.facebook.ads.redexgen.X.A5
    public final void ACC() {
        C06068c.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.A5
    public final void ACt(JSONArray jSONArray) {
        int length = jSONArray.length();
        HashSet hashSet = new HashSet(length);
        for (int i10 = 0; i10 < length; i10++) {
            try {
                JSONObject eventJson = jSONArray.getJSONObject(i10);
                String string = eventJson.getString(A00(j3.a.b.f17898c, 2, 94));
                if (C06068c.A0I(string)) {
                    C06068c.A0B(this.A00, string);
                } else {
                    hashSet.add(string);
                }
            } catch (JSONException e8) {
                if (this.A00.A05().AAD()) {
                    String eventId = A04;
                    String A00 = A00(72, 62, 74);
                    if (A03[2].charAt(27) != 'm') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[6] = "wUavWABsdMwqX86gv8aQq4NsYa";
                    strArr[5] = "TgLwFV200Sew2OuM724xEw99Fl";
                    Log.e(eventId, A00, e8);
                } else {
                    continue;
                }
            }
        }
        A02(hashSet, new HashSet());
    }

    @Override // com.facebook.ads.redexgen.X.A5
    public final boolean ACu(JSONArray jSONArray) {
        String A00 = A00(27, 1, 28);
        boolean z10 = true;
        boolean A0P = AbstractC06439o.A0P(this.A00);
        Set<String> eventsToDelete = new HashSet<>();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string = jSONObject.getString(A00(j3.a.b.f17898c, 2, 94));
                if (A00(363, 26, 65).equals(string)) {
                    C06419m.A0U(this.A00).A2w(jSONObject.getString(A00(389, 14, 97)));
                    this.A00.A04().ABl();
                } else {
                    int i11 = jSONObject.getInt(A00(353, 4, 94));
                    if (i11 == 1) {
                        if (this.A00.A05().AAD()) {
                            String str = A00(j3.c.b.f17916g, 25, 105) + string + A00(13, 14, 87);
                        }
                        if (A0P) {
                            C06068c.A0D(string);
                        }
                        eventsToDelete.add(string);
                    } else {
                        String A002 = A00(0, 13, 60);
                        if (i11 >= 1000 && i11 < 2000) {
                            if (this.A00.A05().AAD()) {
                                Log.e(A04, A00(272, 37, 30) + i11 + A002 + string + A00);
                            }
                            if (C06068c.A0I(string)) {
                                C06068c.A0B(this.A00, string);
                            } else {
                                hashSet.add(string);
                            }
                            z10 = false;
                        } else if (i11 >= 2000 && i11 < 3000) {
                            if (this.A00.A05().AAD()) {
                                Log.e(A04, A00(231, 41, 103) + i11 + A002 + string + A00);
                            }
                            eventsToDelete.add(string);
                            if (A0P) {
                                C06068c.A0D(string);
                            }
                        }
                    }
                }
            } catch (JSONException e8) {
                if (this.A00.A05().AAD()) {
                    String eventId = A04;
                    Log.e(eventId, A00(309, 44, 108) + i10 + A00, e8);
                }
                z10 = false;
            }
        }
        A02(hashSet, eventsToDelete);
        return z10;
    }

    @Override // com.facebook.ads.redexgen.X.A5
    public final void AEk() {
        this.A01.A4r();
        C06068c.A07(this.A00);
    }
}
