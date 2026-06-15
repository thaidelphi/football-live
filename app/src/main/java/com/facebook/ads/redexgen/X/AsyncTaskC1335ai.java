package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
/* renamed from: com.facebook.ads.redexgen.X.ai  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AsyncTaskC1335ai extends AsyncTask<AbstractC0874Jd, Void, JQ> implements InterfaceC0871Ja {
    public static byte[] A04;
    public static String[] A05 = {"QrFR9YxtZmjHUVEKV6oKE4DdGtsrpc8H", "TwcoDq13NGDzrd27uf1NctQWIs88CxA5", "DEQUIzHs8EHMaJWbR5cSGVZv3Gss2W35", "Ai8rFQMQjE1asV4GIWZxLQq3VKhMcnMa", "Q3dsJQvnRhhndIZBGw2JIf13CD9aK", "FSoxIZL2zci1XZCD3aOfhtBMx8TI21HW", "XwCxwzkF49MOW0uOTgxgRHHne1dL58CR", "45IZuxFnerodSJSRUIhMDhHmCeiAV"};
    public JS A00;
    public C1331ae A01;
    public Exception A02;
    public Executor A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final JQ A00(AbstractC0874Jd... abstractC0874JdArr) {
        if (BQ.A02(this)) {
            return null;
        }
        String[] strArr = A05;
        if (strArr[5].charAt(28) != strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        A05[6] = "rZqzIjYv4aJ5FL2pEqspRVXwv6AN0NL2";
        try {
            if (abstractC0874JdArr != null) {
                try {
                    if (abstractC0874JdArr.length > 0) {
                        JQ A0J = this.A01.A0J(abstractC0874JdArr[0]);
                        if (this.A01.A0K().A04() && A0J != null) {
                            String.format(Locale.US, A01(108, 21, 5), Integer.valueOf(A0J.A92()), A0J.getUrl(), A0J.A6t());
                        }
                        if (A0J != null) {
                            return A0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 59));
                    }
                } catch (Exception e8) {
                    this.A02 = e8;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 95), e8.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 49));
        } catch (Throwable th) {
            BQ.A00(th, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            if (A05[0].charAt(24) != 'G') {
                throw new RuntimeException();
            }
            A05[0] = "mnFvayeDWU8YlLMMxELrFm0bGTjKFJH1";
            copyOfRange[i13] = (byte) (i14 - 20);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-119, -76, -115, -71, -71, -75, -105, -86, -74, -70, -86, -72, -71, -103, -90, -72, -80, 101, -71, -90, -80, -86, -72, 101, -86, -67, -90, -88, -71, -79, -66, 101, -76, -77, -86, 101, -90, -73, -84, -70, -78, -86, -77, -71, 101, -76, -85, 101, -71, -66, -75, -86, 101, -115, -71, -71, -75, -105, -86, -74, -70, -86, -72, -71, -69, -57, -57, -61, -109, -27, -40, -28, -24, -40, -26, -25, -109, -39, -44, -36, -33, -40, -41, -83, -109, -104, -26, -105, -61, -61, -65, 111, -63, -76, -62, -65, -66, -67, -62, -76, 111, -72, -62, 111, -67, -60, -69, -69, 107, 126, -116, -119, -120, -121, -116, 126, 83, 57, 62, 125, 57, 65, 62, -116, 66, 83, 35, 62, -116};
    }

    static {
        A02();
    }

    public AsyncTaskC1335ai(C1331ae c1331ae, JS js, Executor executor) {
        this.A01 = c1331ae;
        this.A00 = js;
        this.A03 = executor;
    }

    private final void A03(JQ result) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.ACh(result);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    public final void A04(AbstractC0874Jd abstractC0874Jd) {
        super.executeOnExecutor(this.A03, abstractC0874Jd);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ JQ doInBackground(AbstractC0874Jd[] abstractC0874JdArr) {
        if (BQ.A02(this)) {
            return null;
        }
        try {
            return A00(abstractC0874JdArr);
        } catch (Throwable th) {
            BQ.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.AD5(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(JQ jq) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A03(jq);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
