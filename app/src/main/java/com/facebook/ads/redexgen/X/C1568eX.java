package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* renamed from: com.facebook.ads.redexgen.X.eX  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1568eX {
    public static byte[] A02;
    public static final String[] A03;
    public String A00;
    public final InterfaceC1098Sb A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-80, -100, -30, -43, -31, -39, -108, -56, -71, -52, -56, -108, -60, -58, -67, -63, -75, -58, -51, -108, -65, -71, -51, -108, -62, -61, -56, -108, -62, -55, -64, -64, -96, -32, -39, -30, -37, -24, -36, -108, -67, -62, -56, -71, -69, -71, -58, -108, -62, -61, -56, -108, -62, -55, -64, -64, -96, -32, -43, -25, -24, -45, -24, -29, -23, -41, -36, -45, -24, -35, -31, -39, -25, -24, -43, -31, -28, -108, -67, -62, -56, -71, -69, -71, -58, -108, -62, -61, -56, -108, -62, -55, -64, -64, -99, 37, 52, 39, 35, 54, 39, 2, 54, 35, 36, 46, 39, 2, -16, -2, -5, -4, -52, 0, -19, -18, -8, -15, -52, -11, -14, -52, -15, 4, -11, -1, 0, -1, -52, -46, 5, -4, -35, -7, -18, 6, -14, -1, -48, -18, -16, -11, -14, -45, -10, -7, -14, -38, -14, 1, -18, -15, -18, 1, -18, -16, -27, -9, -8, -29, -8, -13, -7, -25, -20, -29, -8, -19, -15, -23, -9, -8, -27, -15, -12, 83, 76, 85, 78, 91, 79, -9, -22, -10, -18, 38, 25, 37, 29, -40, -11, -40, -9};
    }

    static {
        A03();
        A03 = new String[]{A01(181, 4, 28), A01(175, 6, 122), A01(155, 20, 23)};
    }

    public C1568eX(InterfaceC1098Sb interfaceC1098Sb) {
        this.A01 = interfaceC1098Sb;
    }

    private Cursor A00() {
        AbstractC1589es.A01(this.A00);
        return this.A01.getReadableDatabase().query(this.A00, A03, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(129, 26, 32) + str;
    }

    public static void A04(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(108, 21, 63) + str);
    }

    public final Map<String, C1567eW> A05() throws C1097Sa {
        try {
            Cursor A00 = A00();
            HashMap hashMap = new HashMap(A00.getCount());
            while (A00.moveToNext()) {
                hashMap.put((String) AbstractC1589es.A01(A00.getString(0)), new C1567eW(A00.getLong(1), A00.getLong(2)));
            }
            if (A00 != null) {
                A00.close();
            }
            return hashMap;
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    public final void A06(long j10) throws C1097Sa {
        try {
            String hexString = Long.toHexString(j10);
            String hexUid = A02(hexString);
            this.A00 = hexUid;
            if (AbstractC1100Sd.A00(this.A01.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                AbstractC1100Sd.A04(writableDatabase, 2, hexString, 1);
                String hexUid2 = this.A00;
                A04(writableDatabase, hexUid2);
                StringBuilder sb = new StringBuilder();
                String hexUid3 = A01(95, 13, 117);
                StringBuilder append = sb.append(hexUid3);
                String hexUid4 = this.A00;
                StringBuilder append2 = append.append(hexUid4);
                String hexUid5 = A01(0, 1, 35);
                StringBuilder append3 = append2.append(hexUid5);
                String hexUid6 = A01(1, 94, 7);
                writableDatabase.execSQL(append3.append(hexUid6).toString());
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    public final void A07(String str) throws C1097Sa {
        AbstractC1589es.A01(this.A00);
        try {
            this.A01.getWritableDatabase().delete(this.A00, A01(185, 8, 75), new String[]{str});
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    public final void A08(String str, long j10, long j11) throws C1097Sa {
        AbstractC1589es.A01(this.A00);
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(A01(181, 4, 28), str);
            contentValues.put(A01(175, 6, 122), Long.valueOf(j10));
            contentValues.put(A01(155, 20, 23), Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.A00, null, contentValues);
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    public final void A09(Set<String> set) throws C1097Sa {
        AbstractC1589es.A01(this.A00);
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (String str : set) {
                writableDatabase.delete(this.A00, A01(185, 8, 75), new String[]{str});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }
}
