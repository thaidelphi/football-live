package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.8I  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class C8I {
    public static byte[] A01;
    public final C8E A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{85, 93, 87, 74, 87, 72, 54, 80, 68, 89, 91, 54, 84, 35, 60, 49, 38, 49, 84, 95, 4, 8, 79, 94, 73, 77, 88, 73, 44, 88, 77, 78, 64, 73, 44, 6, 16, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, 17, 22, 17, 98, 34, 52, 61, 52, 50, 37, 81};
    }

    public abstract String A06();

    public abstract C8C[] A0A();

    public C8I(C8E c8e) {
        this.A00 = c8e;
    }

    private String A00() {
        C8C[] A0A = A0A();
        if (A0A.length < 1) {
            return null;
        }
        String result = A01(0, 0, 12);
        for (int i10 = 0; i10 < A0A.length - 1; i10++) {
            result = result + A0A[i10].A02() + A01(20, 2, 43);
        }
        return result + A0A[A0A.length - 1].A02();
    }

    public static String A02(String str, C8C[] c8cArr) {
        StringBuilder sb = new StringBuilder(A01(56, 7, 114));
        for (int i10 = 0; i10 < c8cArr.length - 1; i10++) {
            sb.append(c8cArr[i10].A01);
            sb.append(A01(20, 2, 43));
        }
        sb.append(c8cArr[c8cArr.length - 1].A01);
        sb.append(A01(6, 6, 21));
        sb.append(str);
        return sb.toString();
    }

    public static String A03(String str, C8C[] c8cArr, C8C c8c) {
        return A02(str, c8cArr) + A01(12, 7, 119) + c8c.A01 + A01(2, 4, 116);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 15) + A06() + A01(0, 2, 118) + A00() + A01(19, 1, 117));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 65) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
