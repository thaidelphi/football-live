package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.mI  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2037mI implements B8 {
    public static byte[] A0D;
    public static String[] A0E = {"mx9sJqsz4sgJcdPgoYbgRIW9VnwzqRx6", "rFbyGWP2Ub8PQhtH", "vlmOFoI5eqS6Nw0ENJhYNh6o4BRmenqE", "", "JTMxf3amnDxIP84vbXSIdB2jgXN5bQ", "LkG9NIMCA2H26FKF", "xLNm9V1ZNmyFYJ5qhdZubuzSePd6Iimu", "7SoM7bEoo8CKfR8pxc6QG8O9JCd0xBEh"};
    public static final Handler A0F;
    public static final AnonymousClass28 A0G = null;
    public static final B9 A0H = null;
    public static final String A0I;
    public AnonymousClass23 A00;
    public AnonymousClass23 A01;
    public C06238t A04;
    public B6 A05;
    public B9 A06;
    public AnonymousClass24 A07;
    public final AnonymousClass37 A08;
    public final A7 A09;
    public final AnonymousClass28 A0A;
    public final C1900k1 A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{-58, -23, -26, -11, -7, -22, -9, -91, -23, -12, -22, -8, -91, -13, -12, -7, -91, -22, -3, -18, -8, -7, -14, 21, 18, 33, 37, 22, 35, -47, 26, 36, -47, 31, 38, 29, 29, -47, -39, 20, 25, 18, 26, 31, -47, 31, 32, 37, -47, 29, 32, 18, 21, 22, 21, -38, -56, -21, -24, -9, -5, -20, -7, -89, -16, -6, -89, -11, -4, -13, -13, -89, -81, -22, -17, -24, -16, -11, -20, -21, -80, -91, -56, -59, -44, -40, -55, -42, -124, -51, -41, -124, -46, -39, -48, -48, -124, -116, -46, -45, -124, -57, -52, -59, -51, -46, -115, 6, 41, 38, 53, 57, 42, 55, -27, 46, 56, -27, 51, 58, 49, 49, -27, 52, 51, -27, 56, 57, 38, 55, 57, 6, 41, -21, 12, -67, 10, 12, 15, 2, -67, -2, 1, -67, 0, -2, 11, 1, 6, 1, -2, 17, 2, 16, -53, -50, -23, -26, -27, -34, -105, -40, -37, -40, -25, -21, -36, -23, -105, -21, -16, -25, -36, -91, 63, 66, -2, 63, 74, 80, 67, 63, 66, 87, -2, 81, 82, 63, 80, 82, 67, 66, 47, 50, 65, -51, -36, -43, 62, 67, 60, 68, 73, 58, 75, 60, 77, 60, 72, 78, -50, -33, -29, -32, -13, -32, -50, -31, -23, -28, -30, -13, -97, -24, -14, -97, -19, -12, -21, -21, 19, 28, 17, 32, 39, 30, 34, 19, 18, 13, 23, 18, 60, 69, 77, 64, 73, 70, 69, 68, 60, 69, 75, -9, 64, 74, -9, 60, 68, 71, 75, 80, 51, 57, 46, 64, 53, 44, 48, 60, 59, 51, 54, 52, 21, 33, 20, 32, 36, 20, 29, 18, 40, 14, 18, 16, 31, 31, 24, 29, 22, -3, 2, 10, -11, 0, -3, -8, -76, 4, 0, -11, -9, -7, 1, -7, 2, 8, -76, -3, 2, -76, 6, -7, 7, 4, 3, 2, 7, -7, 36, 39, 25, 28, 23, 44, 33, 37, 29, 23, 37, 43, 17, 4, 16, 20, 4, 18, 19, -2, 8, 3, 10, 5, -7, -10, 9, -6, -12, 9, -2, 2, -6, 8, 9, -10, 2, 5};
    }

    public abstract void A0P();

    public abstract void A0R(AnonymousClass23 anonymousClass23, C06238t c06238t, C06218r c06218r, AnonymousClass38 anonymousClass38);

    static {
        A08();
        D5.A02();
        A0I = AbstractC2037mI.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC2037mI(C1900k1 c1900k1, AnonymousClass37 anonymousClass37) {
        this.A0B = c1900k1;
        this.A08 = anonymousClass37;
        if (A0H != null) {
            this.A06 = A0H;
        } else {
            this.A06 = new B9(this.A0B);
        }
        this.A06.A0R(this);
        if (A0G != null) {
            this.A0A = A0G;
        } else {
            this.A0A = new AnonymousClass28();
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A09 = c1900k1.A0A();
        this.A0B.A0F().A5U();
    }

    private void A09(C06238t c06238t) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(this.A0B);
        if (c06238t.A0C() != null) {
            sharedPreferences.edit().putString(A07(262, 12, 110), c06238t.A0C()).putLong(A07(342, 16, 54), System.currentTimeMillis()).apply();
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    private void A0A(C06238t c06238t) {
        this.A0B.A0F().AIY(c06238t.A0H());
    }

    private void A0B(C1803iR c1803iR) {
        C06238t placement = c1803iR.A00();
        if (placement == null || placement.A05() == null) {
            String A07 = A07(291, 29, 53);
            C0660Ag error = new C0660Ag(AdErrorType.NO_AD_PLACEMENT, A07);
            this.A0B.A0F().A5W(error.A03().getErrorCode(), A07);
            if (this.A07 != null) {
                this.A07.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C06238t c06238t = this.A04;
        JSONObject A0E2 = c06238t.A0E();
        String A072 = A07(195, 3, 13);
        if (A0E2 == null) {
            C06218r A04 = c06238t.A04();
            if (!A0F(c06238t, A04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A08().AAu(A072, AbstractC06048a.A0a, new C06058b(A07(81, 26, 5), A04.A02()));
                AD4(C0660Ag.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            A0R(this.A00, c06238t, A04, new AnonymousClass38(A04.A04(), c06238t.A05(), this.A08.A0A, c06238t.A05().A0C()));
        } else {
            ArrayList<C06218r> arrayList = new ArrayList();
            C06218r A042 = c06238t.A04();
            do {
                if (arrayList.isEmpty()) {
                    if (A0F(c06238t, A042)) {
                        arrayList.add(A042);
                    } else {
                        return;
                    }
                } else if (A0E(A042)) {
                    arrayList.add(A042);
                }
                A042 = c06238t.A04();
            } while (A042 != null);
            AnonymousClass23 anonymousClass23 = this.A00;
            String[] strArr = A0E;
            if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
                throw new RuntimeException();
            }
            A0E[2] = "ioxWOihgwDfBac41kTr6w1CF9LpRHapv";
            if (anonymousClass23 == null) {
                this.A0B.A08().AAu(A072, AbstractC06048a.A0a, new C06058b(A07(56, 25, 40), ((C06218r) arrayList.get(0)).A02()));
                AD4(C0660Ag.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            boolean z10 = false;
            try {
                if (arrayList.size() > 1 && this.A00 != null && this.A00.AJQ()) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    for (C06218r c06218r : arrayList) {
                        jSONArray.put(c06218r.A04());
                    }
                    jSONObject.put(A07(192, 3, 111), jSONArray);
                    jSONObject.put(A07(198, 12, 124), c06238t.A0E());
                    A0R(this.A00, c06238t, A042, new AnonymousClass38(jSONObject, c06238t.A05(), this.A08.A0A, c06238t.A05().A0C()));
                    z10 = true;
                }
            } catch (Exception unused) {
                z10 = false;
            }
            if (!z10) {
                if (arrayList.isEmpty()) {
                    C0660Ag A01 = C0660Ag.A01(AdErrorType.NO_FILL, A07(0, 0, 103));
                    this.A0B.A0F().A5W(A01.A03().getErrorCode(), A07(133, 22, 62));
                    if (this.A07 != null) {
                        this.A07.A0G(A01);
                        return;
                    }
                    return;
                } else if (this.A00 == null) {
                    this.A0B.A08().AAu(A072, AbstractC06048a.A0a, new C06058b(A07(22, 34, 82), ((C06218r) arrayList.get(0)).A02()));
                    AD4(C0660Ag.A00(AdErrorType.INTERNAL_ERROR));
                    return;
                } else {
                    C06218r c06218r2 = (C06218r) arrayList.get(0);
                    A0R(this.A00, c06238t, c06218r2, new AnonymousClass38(c06218r2.A04(), c06238t.A05(), this.A08.A0A, c06238t.A05().A0C()));
                }
            }
        }
        A09(placement);
        A0A(placement);
    }

    private final void A0C(String str, AdExperienceType adExperienceType) {
        this.A0B.A0F().A5X(str != null);
        this.A03 = System.currentTimeMillis();
        try {
            C0668Aq bidPayload = new C0668Aq(this.A0B, str, this.A08.A0A, this.A08.A09);
            this.A05 = this.A08.A00(this.A0B, bidPayload, adExperienceType);
            if (this.A06 != null) {
                this.A06.A0Q(this.A05);
            }
        } catch (C0661Ah e8) {
            AD4(C0660Ag.A02(e8));
        }
    }

    private void A0D(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 79));
            C2A.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0E(C06218r c06218r) {
        return (c06218r == null || c06218r.A04() == null) ? false : true;
    }

    private boolean A0F(C06238t c06238t, C06218r c06218r) {
        String A07 = A07(0, 0, 103);
        if (c06218r == null) {
            C0660Ag A01 = C0660Ag.A01(AdErrorType.NO_FILL, A07);
            this.A0B.A0F().A5W(A01.A03().getErrorCode(), A07(133, 22, 62));
            if (this.A07 != null) {
                this.A07.A0G(A01);
            }
            return false;
        }
        String A02 = c06218r.A02();
        AnonymousClass23 A00 = this.A0A.A00(this.A0B, c06238t.A05().A0D());
        if (A00 == null) {
            this.A0B.A08().AAu(A07(195, 3, 13), AbstractC06048a.A0a, new C06058b(A07(0, 22, 38), A02));
            AD4(C0660Ag.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        } else if (!this.A08.A01().contains(A00.A8a())) {
            C0660Ag A012 = C0660Ag.A01(AdErrorType.INTERNAL_ERROR, A07);
            this.A0B.A0F().A5W(A012.A03().getErrorCode(), A07(155, 19, 24));
            if (this.A07 != null) {
                AnonymousClass24 anonymousClass24 = this.A07;
                if (A0E[0].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[7] = "XDVsCbJ3K5v8dlUMGtS0uKtjThdAM1fs";
                strArr[6] = "AXbWkB0jI9efrJtSTWvCCcVR8Wd1ee9G";
                anonymousClass24.A0G(A012);
            }
            return false;
        } else {
            this.A00 = A00;
            JSONObject A04 = c06218r.A04();
            if (A04 != null) {
                String optString = A04.optString(A07(332, 10, 64));
                this.A0B.A0F().AIq(optString);
                this.A0B.A0D(optString);
                C1899k0 A002 = AnonymousClass84.A00();
                if (A002 != null) {
                    A002.A0D(optString);
                }
                JSONObject dataObject = A04.optJSONObject(A07(274, 17, 80));
                A0D(dataObject);
                if (this.A05 == null) {
                    String A072 = A07(242, 20, 120);
                    C0660Ag A013 = C0660Ag.A01(AdErrorType.UNKNOWN_ERROR, A072);
                    this.A0B.A0F().A5W(A013.A03().getErrorCode(), A072);
                    if (this.A07 != null) {
                        this.A07.A0G(A013);
                    }
                    return false;
                }
                return true;
            }
            String A073 = A07(212, 18, 32);
            C0660Ag A014 = C0660Ag.A01(AdErrorType.UNKNOWN_ERROR, A073);
            this.A0B.A0F().A5W(A014.A03().getErrorCode(), A073);
            if (this.A07 != null) {
                this.A07.A0G(A014);
            }
            return false;
        }
    }

    public final long A0G() {
        if (this.A04 != null) {
            return this.A04.A03();
        }
        String[] strArr = A0E;
        if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A0E[2] = "cOTrI9DB0oxjTyLR1voyMrEgWVbVphTL";
        return -1L;
    }

    public final Handler A0H() {
        return A0F;
    }

    public C2S A0I() {
        if (this.A01 != null) {
            AnonymousClass23 anonymousClass23 = this.A01;
            if (A0E[2].charAt(15) != 'D') {
                A0E[0] = "oRXWb94touLPnP0lmqQIoCQNN81QkmVq";
                return ((AbstractC2062mh) anonymousClass23).A0I();
            }
            return ((AbstractC2062mh) anonymousClass23).A0I();
        }
        String[] strArr = A0E;
        if (strArr[3].length() != strArr[4].length()) {
            String[] strArr2 = A0E;
            strArr2[7] = "c4mFc8cvcfHQyghvzrB7bYP2aMdrhGND";
            strArr2[6] = "OOjdStzIF6ducmayoMT1WxOsFGdjLtMG";
            return null;
        }
        throw new RuntimeException();
    }

    public final C06248u A0J() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A05();
    }

    public final void A0K() {
        if (!C06419m.A1o(this.A0B)) {
            return;
        }
        AnonymousClass23 anonymousClass23 = this.A01;
        String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "";
        strArr2[4] = "YS2d1pFjROLoYd3yH38ADYRoaACmCS";
        if (anonymousClass23 != null) {
            C0677Bh.A00(this.A0B).A0D(this.A01.A8a().toString(), this.A01.A7E());
        }
        if (this.A06 != null) {
            this.A06.A0R(null);
            this.A06 = null;
        }
        this.A07 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public final void A0L() {
        String A7E;
        this.A0B.A0F().A3H(C0709Cu.A01(this.A03));
        if (this.A01 == null || (A7E = this.A01.A7E()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String A05 = C0709Cu.A05(this.A03);
        String clientToken = A07(320, 12, 89);
        hashMap.put(clientToken, A05);
        new AF(A7E, this.A09).A04(AE.A08, hashMap);
    }

    public final void A0M() {
        AnonymousClass23 anonymousClass23 = this.A01;
        String A07 = A07(195, 3, 13);
        if (anonymousClass23 == null) {
            String A072 = A07(107, 26, 102);
            this.A0B.A08().AAu(A07, AbstractC06048a.A0Q, new C06058b(A072));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0F().A5W(adErrorType.getErrorCode(), A072);
            if (this.A07 != null) {
                AnonymousClass24 anonymousClass24 = this.A07;
                String errorMessage = adErrorType.getDefaultErrorMessage();
                anonymousClass24.A0G(C0660Ag.A01(adErrorType, errorMessage));
            }
            this.A0B.A0F().A5Z();
        } else if (this.A0C) {
            String A073 = A07(174, 18, 127);
            this.A0B.A08().AAu(A07, AbstractC06048a.A0M, new C06058b(A073));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0F().A5W(adErrorType2.getErrorCode(), A073);
            if (this.A07 != null) {
                AnonymousClass24 anonymousClass242 = this.A07;
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                anonymousClass242.A0G(C0660Ag.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0F().A5Y();
        } else {
            if (!TextUtils.isEmpty(this.A01.A7E())) {
                this.A09.ABN(this.A01.A7E());
            }
            this.A0B.A0F().A5a();
            this.A0C = true;
            A0P();
        }
    }

    public final void A0N() {
        A0Y(false);
    }

    public final void A0O() {
        if (this.A02 != null) {
            C2A.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0Q(AnonymousClass23 anonymousClass23) {
        if (anonymousClass23 != null) {
            anonymousClass23.onDestroy();
        }
    }

    public final void A0S(AnonymousClass24 anonymousClass24) {
        this.A07 = anonymousClass24;
    }

    public final void A0T(AnonymousClass38 anonymousClass38) {
        A0V(anonymousClass38.A03().optString(A07(210, 2, 12)));
    }

    public void A0U(String str) {
        A0C(str, null);
    }

    public final void A0V(String str) {
        this.A0B.A0F().A5T();
        if (!TextUtils.isEmpty(str)) {
            new AF(str, this.A09).A04(AE.A04, null);
        }
    }

    public final void A0W(String str) {
        A0U(str);
    }

    public final void A0X(String str, AdExperienceType adExperienceType) {
        A0C(str, adExperienceType);
    }

    public void A0Y(boolean z10) {
        if (!z10 && !this.A0C) {
            return;
        }
        this.A0B.A0F().A5b();
        A0Q(this.A01);
        this.A0C = false;
    }

    public final boolean A0Z() {
        return this.A04 == null || this.A04.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final synchronized void AD4(C0660Ag c0660Ag) {
        A0H().post(new C2038mJ(this, c0660Ag));
    }

    @Override // com.facebook.ads.redexgen.X.B8
    public final synchronized void AFG(C1803iR c1803iR) {
        try {
            A0B(c1803iR);
        } catch (Exception e8) {
            this.A0B.A08().AAu(A07(195, 3, 13), AbstractC06048a.A0T, new C06058b(e8));
        }
    }
}
