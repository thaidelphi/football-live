package com.facebook.ads.redexgen.X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.j6  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1843j6 implements A6 {
    public static byte[] A0D;
    public static String[] A0E = {"KlcQ4aPMCjTEuj6tlqvSPg02tmhmGUou", "NbdeitWOc1zrv1JDjauqKHmjPPhSGwGe", "R4vSD9xrU3uFkHfeeGcLq0xvgbIcHayT", "rvVAUvGslDbkwSzXQ4gHiQTP5zrG", "ljLEgEfbMYnmdR7mWy3vUvMk8HSCwfcz", "YjYM3cC5SO9DuryblpH9N9a8sNamrwLD", "dglxEHbBnsXp5lOZvNi9PFSn5QE5iyod", "nrMzKM4Ejqm74mRasA"};
    public static final String A0F;
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final ConnectivityManager A04;
    public final C1899k0 A06;
    public final A5 A07;
    public final JR A08;
    public volatile boolean A0C;
    public final Runnable A0A = new C1845j8(this);
    public final Runnable A09 = new C1844j7(this);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0E[2].charAt(25) == '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[3] = "STFGVVXWKW9SjLATYObI8PiLTu9r";
            strArr[7] = "1bj9PcPMGQWJpkILDx";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 77);
            i13++;
        }
    }

    public static void A07() {
        A0D = new byte[]{106, 121, 99, 84, 88, 117, 111, 108, 125, 104, Byte.MAX_VALUE, 116, 117, 114, 123, 60, 121, 106, 121, 114, 104, 60, 52, 64, 125, 102, 96, 117, 113, 108, 106, 107, 37, 114, 109, 108, 105, 96, 37, 97, 108, 118, 117, 100, 113, 102, 109, 108, 107, 98, 37, 96, 115, 96, 107, 113, 118, 43, 73, Byte.MAX_VALUE, 104, 108, Byte.MAX_VALUE, 104, 58, 106, 104, 117, 121, Byte.MAX_VALUE, 105, 105, Byte.MAX_VALUE, 126, 58, 106, 123, 104, 110, 115, 123, 118, 58, 120, 123, 110, 121, 114, 54, 58, 121, 117, 116, 110, 115, 116, 111, 115, 116, 125, 58, 110, 117, 58, 116, Byte.MAX_VALUE, 98, 110, 58, 117, 116, Byte.MAX_VALUE, 52, 89, 111, 120, 124, 111, 120, 42, 120, 111, 121, 122, 101, 100, 121, 111, 42, 99, 121, 42, 111, 103, 122, 126, 115, 36, 0, 54, 33, 37, 54, 33, 115, 33, 54, 39, 38, 33, 61, 54, 55, 115, 50, 115, 61, 60, 61, 126, 32, 38, 48, 48, 54, 32, 32, 53, 38, 63, 115, 32, 39, 50, 39, 38, 32, 115, 48, 60, 55, 54, 115, 60, 53, 115, 70, 112, 103, 99, 112, 103, 53, 98, 116, 102, 53, 96, 123, 116, 119, 121, 112, 53, 97, 122, 53, 101, 103, 122, 118, 112, 102, 102, 53, 116, 121, 121, 53, 112, 99, 112, 123, 97, 102, 57, 53, 97, 103, 108, 124, 123, 114, 53, 116, 114, 116, 124, 123, 59, 57, 1, 3, 26, 26, 3, 4, 13, 74, 14, 3, 25, 26, 11, 30, 9, 2, 74, 14, 31, 15, 74, 30, 5, 74, 6, 11, 9, 1, 74, 5, 12, 74, 9, 5, 4, 4, 15, 9, 30, 3, 28, 3, 30, 19, 68, 74, 95, 95, 78, 70, 91, 95, 93, 81, 80, 80, 91, 93, 74, 87, 72, 87, 74, 71, 32, 37, 48, 37, 3, 16, 3, 8, 18, 21, 59, 42, 50, 39, 36, 42, 47};
    }

    static {
        A07();
        A0F = A6.class.getSimpleName();
    }

    public C1843j6(C1899k0 c1899k0, A5 a52) {
        this.A07 = a52;
        this.A06 = c1899k0;
        this.A04 = (ConnectivityManager) c1899k0.getSystemService(A03(293, 12, 115));
        this.A08 = C0880Jj.A01(c1899k0);
        this.A03 = AbstractC06439o.A0K(c1899k0);
        this.A02 = AbstractC06439o.A0J(c1899k0);
    }

    public static /* synthetic */ int A00(C1843j6 c1843j6) {
        int i10 = c1843j6.A00 + 1;
        c1843j6.A00 = i10;
        return i10;
    }

    private void A05() {
        this.A06.A05().AAD();
        this.A00 = 0;
        this.A01 = 0L;
        if (this.A0B.getQueue().size() == 0) {
            this.A07.ACC();
        }
    }

    private void A06() {
        if (this.A00 >= AbstractC06439o.A09(this.A06)) {
            A05();
            A5r();
            return;
        }
        int i10 = this.A00;
        if (A0E[4].charAt(15) == 'm') {
            String[] strArr = A0E;
            strArr[0] = "48XWu56AgSaDG2v80CTGd4cBK4h9Z0cs";
            strArr[1] = "AYX5vj0PphgSAPbgEesjNh2Dg1h2Tuc1";
            if (i10 == 1) {
                this.A01 = AbstractC06439o.A0I(this.A06);
            } else {
                long j10 = this.A01 * 2;
                String[] strArr2 = A0E;
                if (strArr2[5].charAt(19) == strArr2[6].charAt(19)) {
                    String[] strArr3 = A0E;
                    strArr3[0] = "1ToF3hMm2VA6KDOeCYlfpYX9EZhWZaCs";
                    strArr3[1] = "Z30ky6DQTC9ucfzgiQKOMI68k5hVrHHu";
                    this.A01 = j10;
                }
            }
            A5s();
            return;
        }
        throw new RuntimeException();
    }

    private void A08(long j10) {
        this.A05.postDelayed(this.A09, j10);
    }

    private void A09(JSONObject jSONObject) throws JSONException {
        Map<String, String> shortEvnData = this.A06.A04().A5Q();
        for (Map.Entry<String, String> entry : shortEvnData.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }

    public final void A0B() {
        JSONArray jSONArray;
        try {
            NetworkInfo activeNetwork = this.A04.getActiveNetworkInfo();
            if (activeNetwork == null || !activeNetwork.isConnectedOrConnecting()) {
                if (this.A06.A05().AAD()) {
                    Log.e(A0F, A03(240, 46, 39));
                }
                A08(this.A02);
                return;
            }
            this.A06.A05().AAD();
            JSONObject A5B = this.A07.A5B();
            if (A5B == null) {
                this.A06.A05().AAD();
                A05();
                return;
            }
            boolean AAD = this.A06.A05().AAD();
            String A03 = A03(309, 6, 43);
            if (AAD && A5B.has(A03)) {
                for (int i10 = 0; i10 < A5B.getJSONArray(A03).length(); i10++) {
                    String str = A03(4, 19, 81) + i10 + A03(0, 3, 14) + jSONArray.get(i10);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(286, 7, 102), String.valueOf(this.A00));
            A09(jSONObject);
            A5B.put(A03(305, 4, 9), jSONObject);
            C0876Jf c0876Jf = new C0876Jf();
            c0876Jf.put(A03(315, 7, 6), A5B.toString());
            JQ AG5 = this.A08.AG5(this.A06.A05().A7w(), c0876Jf.A08());
            String A6t = AG5 != null ? AG5.A6t() : null;
            if (!TextUtils.isEmpty(A6t) && AG5 != null) {
                if (AG5.A92() != 200) {
                    if (this.A06.A05().AAD()) {
                        String responseBody = A0F;
                        Log.e(responseBody, A03(138, 48, 30) + AG5.A92() + A03(3, 1, 55));
                    }
                    if (AG5.A92() == 413 && C06419m.A2P(this.A06)) {
                        this.A07.AEk();
                        A05();
                        return;
                    }
                    if (A5B.has(A03)) {
                        this.A07.ACt(A5B.getJSONArray(A03));
                    }
                    A06();
                    return;
                } else if (!this.A07.ACu(new JSONArray(A6t))) {
                    if (this.A06.A05().AAD()) {
                        Log.w(A0F, A03(186, 54, 88));
                    }
                    A06();
                    return;
                } else if (this.A07.AAQ()) {
                    if (this.A06.A05().AAD()) {
                        Log.i(A0F, A03(58, 55, 87));
                    }
                    A06();
                    return;
                } else {
                    A05();
                    return;
                }
            }
            if (this.A06.A05().AAD()) {
                Log.e(A0F, A03(113, 25, 71));
            }
            if (C06419m.A2E(this.A06) && A5B.has(A03)) {
                this.A07.ACt(A5B.getJSONArray(A03));
            }
            A06();
        } catch (Exception e8) {
            C1899k0 c1899k0 = this.A06;
            String[] strArr = A0E;
            if (strArr[0].charAt(26) != strArr[1].charAt(26)) {
                Exception e10 = new RuntimeException();
                throw e10;
            }
            String[] strArr2 = A0E;
            strArr2[5] = "juVm3rSGrTKw83uGBob9EWWg86xlgGIp";
            strArr2[6] = "uyuZsDIDSXItwx867Sl9CxjwWd0LLO11";
            if (c1899k0.A05().AAD()) {
                Log.e(A0F, A03(23, 35, 72), e8);
            }
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.A6
    public final void A5r() {
        if (this.A0C) {
            return;
        }
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.A6
    public final void A5s() {
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A03);
    }
}
