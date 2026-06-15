package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class X5 extends SQLiteOpenHelper implements InterfaceC1098Sb {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 5);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{112, 25, 22, 112, 21, 8, 25, 3, 4, 3, 112, 74, 92, 65, 94, 46, 89, 110, 110, 115, 110, 60, 121, 100, 121, Byte.MAX_VALUE, 105, 104, 117, 114, 123, 60, 86, 68, 65, 100, 113, 100, 103, 100, 118, 96, 85, 119, 106, 115, 108, 97, 96, 119, 51, 46, 57, 38, 58, 55, 47, 51, 36, 9, 63, 56, 34, 51, 36, 56, 55, 58, 120, 50, 52, 72, 71, 75, 67, 16, 18, 15, 10, 23, 6, 60, 14, 2, 16, 23, 6, 17, 67, 65, 92, 89, 68, 85, 111, 67, 85, 65, 69, 85, 94, 83, 85, 27, 22, 31, 10};
    }

    public X5(Context context) {
        super(context.getApplicationContext(), A00(50, 21, 83), (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query(A00(75, 13, 102), new String[]{A00(103, 4, 106), A00(71, 4, 35)}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!A00(88, 15, 53).equals(string2)) {
                    String str = A00(11, 5, 11) + string + A00(0, 11, 85) + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (SQLException e8) {
                        String type = A00(32, 18, 0);
                        AbstractC1633fb.A08(type, A00(16, 16, 25) + str, e8);
                    }
                }
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        A02(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
