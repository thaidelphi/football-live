package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.ix  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1834ix implements AK {
    public static byte[] A01;
    public final C1900k1 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{94, 89, 91, 76, 77, 89, 84, 103, 76, 81, 85, 93, 75, 76, 89, 85, 72, 64, 79, 74, 70, 77, 87, 124, 66, 83, 74, 124, 85, 70, 81, 80, 74, 76, 77, 101, 105, 104, 114, 99, 104, 114, 60, 41, 41, 5, 2, 31, 24, 13, 0, 0, 51, 30, 9, 10, 9, 30, 30, 9, 30, 68, 94, 114, 78, 89, 57, 40, 42, 34, 40, 46, 44, 22, 39, 40, 36, 44};
    }

    public C1834ix(C1900k1 c1900k1) {
        this.A00 = c1900k1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A03(String str, boolean z10, String str2, String str3, String str4, long j10) {
        this.A00.A0F().AB4(str);
        PackageManager packageManager = this.A00.getPackageManager();
        if (packageManager == null) {
            this.A00.A0F().AB9(str);
            return false;
        }
        ContentResolver contentResolver = this.A00.getContentResolver();
        if (contentResolver == null) {
            this.A00.A0F().AB6(str);
            return false;
        } else if (packageManager.resolveContentProvider(str, 0) == null) {
            this.A00.A0F().AB5(str);
            return false;
        } else {
            Uri parse = Uri.parse(A00(35, 10, 10) + str + A00(0, 1, 125) + str2);
            ContentValues values = new ContentValues();
            values.put(A00(17, 18, 47), (Integer) 1);
            values.put(A00(61, 5, 33), Boolean.valueOf(z10));
            values.put(A00(45, 16, 96), str3);
            values.put(A00(66, 12, 69), str4);
            values.put(A00(1, 16, 52), Long.valueOf(j10));
            try {
                contentResolver.insert(parse, values);
                this.A00.A0F().ABB(str);
                return true;
            } catch (UnsupportedOperationException unused) {
                this.A00.A0F().AB8(str);
                return false;
            } catch (Exception unused2) {
                this.A00.A0F().AB7(str);
                return false;
            }
        }
    }

    public final void A04(boolean z10, String str, String str2, String str3, long j10, boolean z11) {
        this.A00.A0F().ABA();
        D8.A06.execute(new C1835iy(this, z10, str, str2, str3, j10, z11));
    }
}
