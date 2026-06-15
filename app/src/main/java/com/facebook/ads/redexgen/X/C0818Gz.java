package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Gz  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0818Gz {
    public static byte[] A08;
    public static String[] A09 = {"wHWy6mJnObE4TdegwzR1XIqaiMp2qzo2", "2kKTv183xGQoCJ4bH8MOQBKEcrYPubr8", "yAnU2m0QEWVpmJNiipOenY", "2CWVvRtjqdC7", "Y1Dj6sRIbzGHXk3FXnyOisKccxY5ExT7", "AAUb4pYdx4XqEM8CotKihUFr9wNvuug2", "KLTFv3N2v474XPM9CBPbC4npqkPjZQN", "uonDorlDhYGoL6YzDZYQroxkAXvFfbHU"};
    public WeakReference<C0810Gr> A00;
    public WeakReference<InterfaceC1612fG> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C1900k1 A03;
    public final C0797Ge A04;
    public final String A05;
    public final String A06;
    public final WeakReference<A7> A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-121, -109, -111, -111, -123, -110, -120, -110, -109, -108, -113, -93, -102, -94, 112, Byte.MAX_VALUE, 120, 107, -93, -78, -85, -85, -94, -87, -100, -96, -84, -95, -94, -86, -71, -78, -78, -87, -80, -93, -79, -87, -73, -73, -91, -85, -87, -15, 0, -7, -7, -16, -9, -22, -1, 4, -5, -16, -18, -24, -4, -56, -55, -72, -62, -67, -127, 114, -122, -124, 118, 117, 83, -118, 102, -124, 118, -125, -31, -30, -49, -32, -30, -45, -46, -80, -25, -61, -31, -45, -32, -14, -13, -32, -13, -28, -39, -42, -48, -81, -55, -35, -84, -105, -94, -85, -101};
        if (A09[5].charAt(6) == '8') {
            throw new RuntimeException();
        }
        A09[3] = "q8I1zS5uUBp9u7UYsB3eM38aYjAC";
        A08 = bArr;
    }

    static {
        A09();
    }

    public C0818Gz(C1900k1 c1900k1, C0810Gr c0810Gr, A7 a72, C0797Ge c0797Ge, String str, String str2) {
        this.A03 = c1900k1;
        this.A00 = new WeakReference<>(c0810Gr);
        this.A07 = new WeakReference<>(a72);
        this.A04 = c0797Ge;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        InterfaceC1612fG uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "rLuDNCDiUJCt8jrcDw8nHa";
        strArr[6] = "w5dFeIXZRXYPRcNf7kYaeIakMq27def";
    }

    private void A05() {
        InterfaceC1612fG uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9a();
    }

    private void A06() {
        InterfaceC1612fG uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AAb();
    }

    private void A07() {
        this.A03.A0F().A5u();
        this.A02 = true;
        InterfaceC1612fG uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AJI();
        if (C06419m.A1s(this.A03)) {
            this.A03.A0B().ACq();
        }
    }

    private void A08() {
        InterfaceC1612fG uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.ADF();
    }

    private void A0A(C0810Gr c0810Gr, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = BJ.A00(this.A03);
        String A01 = A01(57, 5, 77);
        String A012 = A01(0, 0, 53);
        String storageValue = jSONObject.optString(A01, A012);
        String key = jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34));
        String string = A00.getString(A01(14, 4, 0) + key, A012);
        if (string != null) {
            A012 = string;
        }
        c0810Gr.A0g(storageValue, A012);
    }

    private void A0B(C0810Gr c0810Gr, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(98, 5, 42);
        String A012 = A01(0, 0, 53);
        String optString = jSONObject.optString(A01, A012);
        String optString2 = jSONObject.optString(A01(57, 5, 77), A012);
        BJ.A00(this.A03).edit().putString(A01(14, 4, 0) + jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34)), optString).apply();
        c0810Gr.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(EnumC0816Gx enumC0816Gx, String str) throws JSONException {
        switch (C0815Gw.A00[enumC0816Gx.ordinal()]) {
            case 1:
                A0I(new JSONObject(str));
                break;
            case 2:
                A06();
                break;
            case 3:
                A04();
                break;
            case 4:
                A07();
                break;
            case 5:
                A0K(new JSONObject(str));
                break;
            case 6:
                A0L(new JSONObject(str));
                break;
            case 7:
                boolean isDebug = BuildConfigApi.isDebug();
                String[] strArr = A09;
                if (strArr[2].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[7] = "ti0FJd6QzsmsCUgFEJNk2tGDtWFDX3UL";
                strArr2[0] = "2bsL1IjRD3bcdVR1Mvy0yjSySADV0GcP";
                if (isDebug) {
                }
                break;
            case 8:
                A05();
            case 9:
                this.A03.A0F().A66(str);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                A0D(enumC0816Gx, str);
                break;
            case 15:
                A0J(new JSONObject(str));
                break;
            case 16:
                A08();
                break;
            case 17:
                A0M(new JSONObject(str));
                break;
        }
        C0810Gr c0810Gr = this.A00.get();
        if (c0810Gr == null) {
            return;
        }
        switch (C0815Gw.A00[enumC0816Gx.ordinal()]) {
            case 19:
                c0810Gr.A0S();
                return;
            case 20:
                c0810Gr.A0R();
                return;
            case 21:
                A0B(c0810Gr, str);
                return;
            case 22:
                A0A(c0810Gr, str);
                return;
            case 23:
                c0810Gr.A0i(A03(new JSONObject(str)));
                return;
            default:
                return;
        }
    }

    private void A0D(EnumC0816Gx enumC0816Gx, String str) throws JSONException {
        InterfaceC1612fG interfaceC1612fG = this.A01.get();
        if (interfaceC1612fG == null) {
            return;
        }
        switch (C0815Gw.A00[enumC0816Gx.ordinal()]) {
            case 10:
                interfaceC1612fG.ADJ();
                return;
            case 11:
                interfaceC1612fG.AF8();
                return;
            case 12:
                A0G(interfaceC1612fG, str);
                return;
            case 13:
                A0F(interfaceC1612fG, str);
                return;
            case 14:
                A0E(interfaceC1612fG, str);
                return;
            default:
                return;
        }
    }

    private void A0E(InterfaceC1612fG interfaceC1612fG, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 115);
        interfaceC1612fG.AE9(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(InterfaceC1612fG interfaceC1612fG, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 5);
        interfaceC1612fG.AFf(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(InterfaceC1612fG interfaceC1612fG, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 98);
        interfaceC1612fG.AFh(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        InterfaceC1612fG interfaceC1612fG = this.A01.get();
        if (interfaceC1612fG == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 24));
        if (TextUtils.isEmpty(productUrl)) {
            interfaceC1612fG.A9V();
        } else {
            interfaceC1612fG.A9W(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        InterfaceC1612fG uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 24));
    }

    private void A0K(JSONObject jSONObject) {
        A7 a72 = this.A07.get();
        if (a72 == null) {
            return;
        }
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        A09[3] = "hDImTkFK3KoL7AYoPxXIP";
        String key = jSONObject.optString(A01(43, 11, 127));
        if (TextUtils.isEmpty(key)) {
            return;
        }
        AF handler = new AF(this.A06, a72);
        handler.A05(key, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 49), -1);
        if (optInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 56));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0F().AAs(optInt, message);
        String[] strArr = A09;
        String message2 = strArr[2];
        String str = strArr[6];
        int length = message2.length();
        int code = str.length();
        if (length == code) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "NCNoRnun1G3dlwmqoYaN2uZPLfccAkgr";
        strArr2[0] = "12RLbgldZ9TmNXvaOMkOvzOeimlYTJg9";
    }

    private void A0M(JSONObject jSONObject) {
        InterfaceC1612fG interfaceC1612fG = this.A01.get();
        if (interfaceC1612fG == null) {
            return;
        }
        String A01 = A01(92, 6, 88);
        String[] strArr = A09;
        if (strArr[2].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "rydiERFHLfFXOcJD9tadKbqyFej0NUPk";
        strArr2[0] = "tiiagSBkZ4Sc0Tn3kexlzzs5G1JfuHdZ";
        String optString = jSONObject.optString(A01);
        if (optString == null) {
            return;
        }
        interfaceC1612fG.AFw(optString);
    }

    public final void A0N(InterfaceC1612fG interfaceC1612fG) {
        this.A01 = new WeakReference<>(interfaceC1612fG);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        ExecutorC0712Cx.A00(new RunnableC0814Gv(this, str));
    }
}
