package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Sd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1100Sd {
    public static byte[] A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(SQLiteDatabase sQLiteDatabase, int i10, String str) throws C1097Sa {
        try {
            if (AbstractC1672gE.A19(sQLiteDatabase, A01(159, 17, 77))) {
                Cursor query = sQLiteDatabase.query(A01(159, 17, 77), new String[]{A01(244, 7, 101)}, A01(183, 32, 116), A05(i10, str), null, null, null);
                if (query.getCount() == 0) {
                    if (query != null) {
                        query.close();
                    }
                    return -1;
                }
                query.moveToNext();
                int i11 = query.getInt(0);
                if (query != null) {
                    query.close();
                }
                return i11;
            }
            return -1;
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{98, 115, 100, 96, 117, 100, 1, 117, 96, 99, 109, 100, 1, 104, 103, 1, 111, 110, 117, 1, 100, 121, 104, 114, 117, 114, 1, 100, 89, 78, 113, 77, 64, 88, 68, 83, 119, 68, 83, 82, 72, 78, 79, 82, 1, 9, 71, 68, 64, 85, 84, 83, 68, 1, 104, 111, 117, 100, 102, 100, 115, 1, 111, 110, 117, 1, 111, 116, 109, 109, 13, 72, 79, 82, 85, 64, 79, 66, 68, 126, 84, 72, 69, 1, 117, 100, 121, 117, 1, 111, 110, 117, 1, 111, 116, 109, 109, 13, 87, 68, 83, 82, 72, 78, 79, 1, 104, 111, 117, 100, 102, 100, 115, 1, 111, 110, 117, 1, 111, 116, 109, 109, 13, 113, 115, 104, 108, 96, 115, 120, 1, 106, 100, 120, 1, 9, 71, 68, 64, 85, 84, 83, 68, 13, 1, 72, 79, 82, 85, 64, 79, 66, 68, 126, 84, 72, 69, 8, 8, 45, 16, 7, 56, 4, 9, 17, 13, 26, 62, 13, 26, 27, 1, 7, 6, 27, 15, 12, 8, 29, 28, 27, 12, 55, 52, 48, 37, 36, 35, 52, 113, 108, 113, 110, 113, 16, 31, 21, 113, 56, 63, 34, 37, 48, 63, 50, 52, 14, 36, 56, 53, 113, 108, 113, 110, 12, 4, 4, 12, 69, 14, 19, 4, 69, 15, 10, 31, 10, 9, 10, 24, 14, 44, 43, 54, 49, 36, 43, 38, 32, 26, 48, 44, 33, 54, 37, 50, 51, 41, 47, 46};
    }

    static {
        A02();
        PS.A03(A01(215, 17, 78));
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, int i10, String str) throws C1097Sa {
        String A01 = A01(159, 17, 77);
        try {
            if (!AbstractC1672gE.A19(sQLiteDatabase, A01)) {
                return;
            }
            sQLiteDatabase.delete(A01, A01(183, 32, 116), A05(i10, str));
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    public static void A04(SQLiteDatabase sQLiteDatabase, int i10, String str, int i11) throws C1097Sa {
        try {
            sQLiteDatabase.execSQL(A01(0, 159, 4));
            ContentValues contentValues = new ContentValues();
            contentValues.put(A01(176, 7, 76), Integer.valueOf(i10));
            contentValues.put(A01(232, 12, 96), str);
            contentValues.put(A01(244, 7, 101), Integer.valueOf(i11));
            sQLiteDatabase.replaceOrThrow(A01(159, 17, 77), null, contentValues);
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    public static String[] A05(int i10, String str) {
        return new String[]{Integer.toString(i10), str};
    }
}
