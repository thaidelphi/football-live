package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class PR implements InterfaceC1580ej {
    public static byte[] A04;
    public static final String[] A05;
    public String A00;
    public String A01;
    public final SparseArray<C1579ei> A02 = new SparseArray<>();
    public final InterfaceC1098Sb A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{72, -107, -42, -47, -115, -74, -69, -63, -78, -76, -78, -65, -115, -67, -65, -74, -70, -82, -65, -58, -115, -72, -78, -58, -115, -69, -68, -63, -115, -69, -62, -71, -71, -103, -40, -46, -26, -115, -63, -78, -59, -63, -115, -69, -68, -63, -115, -69, -62, -71, -71, -103, -38, -46, -31, -50, -47, -50, -31, -50, -115, -81, -71, -68, -81, -115, -69, -68, -63, -115, -69, -62, -71, -71, -106, 97, 112, 99, 95, 114, 99, 62, 114, 95, 96, 106, 99, 62, -95, -81, -84, -83, 125, -79, -98, -97, -87, -94, 125, -90, -93, 125, -94, -75, -90, -80, -79, -80, 125, -59, -8, -17, -48, -20, -31, -7, -27, -14, -61, -31, -29, -24, -27, -55, -18, -28, -27, -8, -46, -51, -13, -18, -86, -57, -86, -55, -64, -70, -50, -114, -122, -107, -126, -123, -126, -107, -126};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AAh(HashMap<String, C1579ei> hashMap, SparseArray<String> sparseArray) throws IOException {
        PO A02;
        AbstractC1589es.A08(this.A02.size() == 0);
        try {
            if (AbstractC1100Sd.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC1589es.A01(this.A00)) != 1) {
                SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                A04(writableDatabase);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
            Cursor A00 = A00();
            while (A00.moveToNext()) {
                A02 = C1581ek.A02(new DataInputStream(new ByteArrayInputStream(A00.getBlob(2))));
                C1579ei c1579ei = new C1579ei(A00.getInt(0), (String) AbstractC1589es.A01(A00.getString(1)), A02);
                hashMap.put(c1579ei.A02, c1579ei);
                sparseArray.put(c1579ei.A01, c1579ei.A02);
            }
            if (A00 != null) {
                A00.close();
            }
        } catch (SQLiteException e8) {
            hashMap.clear();
            sparseArray.clear();
            throw new C1097Sa(e8);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AJO(HashMap<String, C1579ei> hashMap) throws IOException {
        if (this.A02.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i10 = 0; i10 < this.A02.size(); i10++) {
                C1579ei valueAt = this.A02.valueAt(i10);
                if (valueAt == null) {
                    A05(writableDatabase, this.A02.keyAt(i10));
                } else {
                    A06(writableDatabase, valueAt);
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    static {
        A03();
        A05 = new String[]{A01(128, 2, 90), A01(136, 3, 70), A01(139, 8, 18)};
    }

    public PR(InterfaceC1098Sb interfaceC1098Sb) {
        this.A03 = interfaceC1098Sb;
    }

    private Cursor A00() {
        return this.A03.getReadableDatabase().query((String) AbstractC1589es.A01(this.A01), A05, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(109, 19, 113) + str;
    }

    private void A04(SQLiteDatabase sQLiteDatabase) throws C1097Sa {
        AbstractC1100Sd.A04(sQLiteDatabase, 1, (String) AbstractC1589es.A01(this.A00), 1);
        A07(sQLiteDatabase, (String) AbstractC1589es.A01(this.A01));
        sQLiteDatabase.execSQL(A01(75, 13, 15) + this.A01 + A01(0, 1, 25) + A01(1, 74, 94));
    }

    private void A05(SQLiteDatabase sQLiteDatabase, int i10) {
        sQLiteDatabase.delete((String) AbstractC1589es.A01(this.A01), A01(130, 6, 123), new String[]{Integer.toString(i10)});
    }

    private void A06(SQLiteDatabase sQLiteDatabase, C1579ei c1579ei) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1581ek.A08(c1579ei.A03(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(A01(128, 2, 90), Integer.valueOf(c1579ei.A01));
        contentValues.put(A01(136, 3, 70), c1579ei.A02);
        contentValues.put(A01(139, 8, 18), byteArray);
        sQLiteDatabase.replaceOrThrow((String) AbstractC1589es.A01(this.A01), null, contentValues);
    }

    public static void A07(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(88, 21, 78) + str);
    }

    public static void A08(InterfaceC1098Sb interfaceC1098Sb, String str) throws C1097Sa {
        try {
            String A02 = A02(str);
            SQLiteDatabase writableDatabase = interfaceC1098Sb.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            AbstractC1100Sd.A03(writableDatabase, 1, str);
            A07(writableDatabase, A02);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void A5f() throws C1097Sa {
        A08(this.A03, (String) AbstractC1589es.A01(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final boolean A6I() throws C1097Sa {
        try {
            return AbstractC1100Sd.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC1589es.A01(this.A00)) != -1;
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AA5(long j10) {
        this.A00 = Long.toHexString(j10);
        this.A01 = A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AEn(C1579ei c1579ei, boolean z10) {
        if (z10) {
            this.A02.delete(c1579ei.A01);
        } else {
            this.A02.put(c1579ei.A01, null);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AFS(C1579ei c1579ei) {
        this.A02.put(c1579ei.A01, c1579ei);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AJN(HashMap<String, C1579ei> hashMap) throws IOException {
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            A04(writableDatabase);
            for (C1579ei c1579ei : hashMap.values()) {
                A06(writableDatabase, c1579ei);
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }
}
