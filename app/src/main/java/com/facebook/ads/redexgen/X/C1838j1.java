package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
/* renamed from: com.facebook.ads.redexgen.X.j1  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1838j1 extends BY {
    public static byte[] A01;
    public static String[] A02 = {"Cp4y0jGzgjmlhNOtolFVOVefspLcmrKL", "5GK8sLOcHtszB", "AOLPTOXU9sJ8f7mkW5imzLW9uvMXwnIa", "cYEf6saXY9z3veQOBiLayO", "AetyrNGNYAsiijDpUFLgJdlj31dZpeYf", "GwgqZOf2k60xdBESFLM8urtE7U9bH", "vGNTznilo2MQ1OpS5sYGGd", "eyCkGrJdBkkJqznMzmMtN6FzCpyOGqXF"};
    public final /* synthetic */ AnonymousClass85 A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[4].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A02[5] = "yU9Q3i2imseGifaShK33hUjg5wmSv";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 100);
            i13++;
        }
    }

    public static void A04() {
        A01 = new byte[]{4, 16, 14, -49, 7, 2, 4, 6, 3, 16, 16, 12, -49, 2, 5, 20, -49, -19, -16, -28, -30, -19, 0, -28, -16, -10, -17, -11, -26, -13, -12, -2, 1, -11, -13, -2, -15, -11, 1, 7, 0, 6, -9, 4, 5, -13, -21, -25, -7, -5, -8, -21, -22, -27, -7, -21, -7, -7, -17, -11, -12, -27, -17, -22, 67, 59, 55, 73, 75, 72, 59, 58, 53, 73, 59, 73, 73, 63, 69, 68, 53, 74, 63, 67, 59};
    }

    static {
        A04();
    }

    public C1838j1(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        Map map;
        AtomicInteger atomicInteger;
        SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = this.A00.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 31, 61), this.A00), 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.size() > 1) {
                AI.A06(this.A00, C0880Jj.A00(this.A00), all);
            }
            sharedPreferences.edit().clear().apply();
            sharedPreferences.edit().putString(A01(45, 19, 34), this.A00.A09().A02()).putString(A01(64, 21, 114), C0709Cu.A03(this.A00.A09().A01())).apply();
        } catch (JSONException e8) {
            this.A00.A08().AAu(A01(31, 14, 46), IronSourceConstants.BN_AUCTION_SUCCESS, new C06058b(e8));
            sharedPreferences.edit().clear().apply();
        }
        synchronized (AI.class) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            map = AI.A02;
            for (Map.Entry entry : map.entrySet()) {
                edit.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            edit.apply();
            atomicInteger = AI.A03;
            atomicInteger.set(2);
        }
    }
}
