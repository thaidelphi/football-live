package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Mt  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0965Mt extends AbstractC2037mI {
    public static byte[] A03;
    public long A00;
    public View A01;
    public M5 A02;

    static {
        A05();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, 11, 38, 55, 27, 40, 40, 37, 40, -42, 45, 30, 31, 34, 27, -42, 38, 23, 40, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, 27, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, 27, 40};
    }

    public C0965Mt(M5 m52, AnonymousClass37 anonymousClass37) {
        super(m52, anonymousClass37);
        this.A00 = 10000L;
        this.A02 = m52;
    }

    private C2040mL A01(Runnable runnable) {
        return new C2040mL(this, runnable);
    }

    private List<JSONObject> A04(AnonymousClass38 anonymousClass38) {
        ArrayList arrayList = new ArrayList();
        JSONObject A032 = anonymousClass38.A03();
        String A033 = A03(22, 12, 71);
        if (A032.has(A033)) {
            try {
                this.A00 = A032.getJSONObject(A033).optInt(A03(3, 19, 62), UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                JSONArray adsArray = A032.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i10 = 0; i10 < adsArray.length(); i10++) {
                        arrayList.add((JSONObject) adsArray.get(i10));
                    }
                }
            } catch (JSONException unused) {
                String A034 = A03(36, 38, 101);
                this.A02.A0F().A5W(C0660Ag.A01(AdErrorType.UNKNOWN_ERROR, A034).A03().getErrorCode(), A034);
                return arrayList;
            }
        } else {
            arrayList.add(A032);
        }
        return arrayList;
    }

    private void A06(InterfaceC2090n9 interfaceC2090n9, JSONObject jSONObject, C06248u c06248u) {
        this.A0C = false;
        C2039mK c2039mK = new C2039mK(this, interfaceC2090n9, CV.A02(jSONObject, A03(34, 2, 114)));
        A0H().postDelayed(c2039mK, c06248u.A05());
        interfaceC2090n9.AAi(this.A02, this.A09, this.A08.A08, A01(c2039mK), jSONObject, c06248u);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2037mI
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4U();
            this.A07.A0E(this.A01);
            return;
        }
        this.A02.A0F().A4V();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2037mI
    public final void A0R(AnonymousClass23 anonymousClass23, C06238t c06238t, C06218r c06218r, final AnonymousClass38 anonymousClass38) {
        this.A02.A0F().A4O();
        final InterfaceC2090n9 interfaceC2090n9 = (InterfaceC2090n9) anonymousClass23;
        if (interfaceC2090n9.AJQ()) {
            final List<JSONObject> A04 = A04(anonymousClass38);
            A06(interfaceC2090n9, A04.get(0), anonymousClass38.A01());
            if (A04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.39
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0965Mt.this.A0a(interfaceC2090n9, A04, anonymousClass38);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC2090n9, anonymousClass38.A03(), anonymousClass38.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2037mI
    public final void A0U(String str) {
        this.A02.A0F().A4T(str != null);
        super.A0U(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2037mI
    public final void A0Y(boolean z10) {
        super.A0Y(z10);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC2090n9 interfaceC2090n9, List list, AnonymousClass38 anonymousClass38) {
        A06(interfaceC2090n9, (JSONObject) list.get(1), anonymousClass38.A01());
    }
}
