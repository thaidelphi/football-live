package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.7U  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C7U {
    public static byte[] A01;
    public SharedPreferences A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 44, 62, 45, 58, 60, 33, 59, 33, 38, 47, 1, 44, 80, 69, 69, 67, 88, 83, 68, 69, 88, 94, 95, 120, 85, 93, 95, 93, 86, 91, 106, 109, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 31, 29, 26, 115, 118, 114, 118, 107, 94, 123, 75, 109, 126, 124, 116, 118, 113, 120};
    }

    public C7U(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(33, 21, 4), anonymousClass85), 0);
    }

    public final C7T A02() {
        SharedPreferences sharedPreferences = this.A00;
        String A00 = A00(0, 13, 55);
        if (sharedPreferences.contains(A00)) {
            return new C7T(this.A00.getString(A00, A00(0, 0, 75)), this.A00.getBoolean(A00(54, 15, 96), false), C7S.A08, this.A00.getLong(A00(26, 7, 65), -1L));
        }
        return C7T.A00();
    }

    public final String A03() {
        return this.A00.getString(A00(13, 13, 78), A00(0, 0, 75));
    }

    public final void A04(C7T c7t) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(0, 13, 55), c7t.A03());
        edit.putBoolean(A00(54, 15, 96), c7t.A04());
        edit.putLong(A00(26, 7, 65), c7t.A01());
        edit.apply();
    }

    public final void A05(String str) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(13, 13, 78), str);
        edit.apply();
    }
}
