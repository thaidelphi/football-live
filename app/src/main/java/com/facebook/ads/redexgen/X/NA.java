package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class NA extends AbstractC2097nG {
    public static byte[] A04;
    public static String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final String A06;
    public CL A00;
    public final Uri A01;
    public final C04592h A02;
    public final Map<String, String> A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final List<Intent> A06() {
        List<AnonymousClass20> A052 = A05();
        ArrayList arrayList = new ArrayList();
        if (A052 != null) {
            for (AnonymousClass20 anonymousClass20 : A052) {
                Intent A00 = A00(anonymousClass20);
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{88, 111, 111, 114, 111, 61, 109, 124, 111, 110, 116, 115, 122, 61, 124, 109, 109, 110, 116, 105, 120, 66, 121, 124, 105, 124, 51, 20, 28, 25, 16, 17, 85, 1, 26, 85, 26, 5, 16, 27, 85, 24, 20, 7, 30, 16, 1, 85, 0, 7, 25, 79, 85, 51, 53, 8, 7, 13, 27, 6, 0, 13, 63, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, 63, 61, 42, 55, 49, 48, 112, 26, 23, 31, 18, 5, 10, 0, 22, 11, 13, 0, 74, 13, 10, 16, 1, 10, 16, 74, 5, 7, 16, 13, 11, 10, 74, 50, 45, 33, 51, 34, 51, 51, 48, 42, 55, 38, 28, 39, 34, 55, 34, 79, 64, 69, 79, 71, 115, 95, 67, 89, 94, 79, 73, 25, 21, 6, 31, 17, 0, 78, 91, 91, 16, 17, 0, 21, 29, 24, 7, 75, 29, 16, 73, 81, 7, 125, 98, 119, 124, 119, 118, 77, 118, 119, 119, 98, 126, 123, 124, 121, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 114, 117, 120, 120, 118, 117, 119, Byte.MAX_VALUE, 75, 97, 102, 120, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 97, 102, 120, 82, 67, 80, 81, 75, 76, 69, 56, 63, 36, 57, 46, 20, 34, 47, 81, 86, 77, 80, 71, 125, 87, 80, 78, 60, 59, 32, 61, 42, 16, 58, 61, 35, 16, 56, 42, 45, 16, 41, 46, 35, 35, 45, 46, 44, 36, 23, 6, 15, 89, 24, 9, 0, 28, 30, 3, 1, 28, 24, 86, 1, 7, 17, 6, 23, 24, 29, 23, 31};
    }

    static {
        A07();
        A06 = NA.class.getSimpleName();
    }

    public NA(C1900k1 c1900k1, A7 a72, String str, Uri uri, Map<String, String> extraData, AnonymousClass22 anonymousClass22, boolean z10, C04592h c04592h) {
        super(c1900k1, a72, str, anonymousClass22, z10);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c04592h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r3.startsWith(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.Intent A00(com.facebook.ads.redexgen.X.AnonymousClass20 r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.NA.A00(com.facebook.ads.redexgen.X.20):android.content.Intent");
    }

    private Intent A01(AnonymousClass20 anonymousClass20) {
        Intent intent = new Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(anonymousClass20.A05()) && !TextUtils.isEmpty(anonymousClass20.A04())) {
            intent.setComponent(new ComponentName(anonymousClass20.A05(), anonymousClass20.A04()));
        }
        if (!TextUtils.isEmpty(anonymousClass20.A03())) {
            intent.setData(C5.A00(anonymousClass20.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(231, 9, 11));
        if (!TextUtils.isEmpty(queryParameter)) {
            return C5.A00(queryParameter);
        }
        Uri uri = this.A01;
        String storeUrl = A04(223, 8, 98);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A04(138, 22, 93);
        return C5.A00(String.format(locale, storeUrl2, objArr));
    }

    private EnumC04461u A03() throws C0681Bo {
        C2 c22 = new C2();
        try {
            return C2.A05(c22, ((AbstractC04471v) this).A00, A02(), ((AbstractC04471v) this).A02, this.A03);
        } catch (C0681Bo unused) {
            String str = A04(26, 27, 92) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(240, 22, 102));
            if (queryParameter != null && queryParameter.length() > 0) {
                C2.A0D(c22, ((AbstractC04471v) this).A00, C5.A00(queryParameter), ((AbstractC04471v) this).A02);
            }
            return EnumC04461u.A09;
        }
    }

    private List<AnonymousClass20> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(114, 12, 106));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A04(53, 2, 65);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A04(55, 7, 64);
            JSONArray optJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    AnonymousClass20 A00 = AnonymousClass20.A00(optJSONArray.optJSONObject(i10));
                    if (A00 != null) {
                        arrayList.add(A00);
                    }
                }
            }
        } catch (JSONException e8) {
            C8Z A08 = ((AbstractC04471v) this).A00.A08();
            int i11 = AbstractC06048a.A24;
            C06058b c06058b = new C06058b(e8);
            String appsiteDataString3 = A04(216, 7, 11);
            A08.AAu(appsiteDataString3, i11, c06058b);
            String str = A06;
            String appsiteDataString4 = A04(0, 26, 52);
            Log.w(str, appsiteDataString4, e8);
        }
        return arrayList;
    }

    private boolean A08() {
        List<Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        for (Intent intent : appLaunchIntents) {
            if (C0683Bq.A0D(((AbstractC04471v) this).A00, intent)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A09(C1900k1 c1900k1, String str) {
        return Build.VERSION.SDK_INT >= 30 && str != null && C06419m.A21(c1900k1);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2097nG
    public final EnumC04461u A0D() {
        EnumC04461u enumC04461u = EnumC04461u.A09;
        if (super.A03) {
            enumC04461u = A0G();
        } else {
            this.A03.put(A04(200, 16, 61), String.valueOf(true));
        }
        C1900k1 c1900k1 = ((AbstractC04471v) this).A00;
        if (A05[2].charAt(5) != 'T') {
            throw new RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        if (!D3.A0e(c1900k1, enumC04461u, this.A03)) {
            A0E(this.A03, enumC04461u);
            C04592h.A06(this.A02, ((AbstractC04471v) this).A00);
        } else {
            EnumC04461u actionOutcome = EnumC04461u.A08;
            if (enumC04461u != actionOutcome && this.A00 != null) {
                String str = this.A03.get(A04(126, 12, 5));
                if (A04(276, 9, 93) == str) {
                    this.A00.A0C(str, this.A02, ((AbstractC04471v) this).A02);
                } else {
                    this.A00.A0D(str, this.A02, ((AbstractC04471v) this).A02);
                }
            }
        }
        return enumC04461u;
    }

    public final EnumC04461u A0G() {
        EnumC04461u enumC04461u = EnumC04461u.A09;
        String A042 = A04(160, 15, 59);
        boolean A0F = A0F(this.A01);
        if (!A0F) {
            A0F = A08();
        }
        if (!A0F) {
            try {
                enumC04461u = A03();
                if (enumC04461u != EnumC04461u.A09) {
                    A042 = A04(200, 16, 61);
                } else {
                    A042 = A04(175, 25, 61);
                }
            } catch (Exception unused) {
                enumC04461u = EnumC04461u.A04;
            }
        }
        Map<String, String> map = this.A03;
        String redirectionAction = String.valueOf(true);
        map.put(A042, redirectionAction);
        return enumC04461u;
    }

    public final void A0H(CL cl) {
        this.A00 = cl;
    }
}
