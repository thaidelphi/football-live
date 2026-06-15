package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.StreamKey;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.ironsource.j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.8n */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C06178n implements RD {
    public static byte[] A05;
    public static String[] A06 = {"Jqmq4K7tB1gxG7Iw0FV8okMjCBaswkAi", "mef8JBr3Hcq3sRpElAFpZe43WV2TXs9w", "bN1b7Gf3PoFRsQJCeGsl", "gdb6fO9ZgIgG8mbJvImLiEt5CtXJnYC2", "lXlc2rIAvkbpRa0BRQU0heSQwvNyId3B", "hXMG3StQcVJrpui8xT3mDM7hCAg", "o40O5nfJDfxESYNhtB4Qydwq2yTmP4ik", "kxcCwldLHNrCwNefChPDCSGAO9aKxkjj"};
    public static final String A07;
    public static final String[] A08;
    public boolean A00;
    public final InterfaceC1098Sb A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1278Zk A01(Cursor cursor) {
        int i10;
        byte[] blob = cursor.getBlob(14);
        C1302a8 A02 = new C1302a8((String) AbstractC1589es.A01(cursor.getString(0)), Uri.parse((String) AbstractC1589es.A01(cursor.getString(2)))).A01(cursor.getString(1)).A02(A09(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest A052 = A02.A04(blob).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        C1300a6 c1300a6 = new C1300a6();
        c1300a6.A01 = cursor.getLong(13);
        c1300a6.A00 = cursor.getFloat(12);
        int i11 = cursor.getInt(6);
        if (i11 == 4) {
            String[] strArr = A06;
            if (strArr[4].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[1] = "AXklNJvpHFZUkioBcybrObdVZur9PlbK";
            strArr2[7] = "z2bqzLo9H68WlOTcEa2Y7muSAoCikYTa";
            i10 = cursor.getInt(11);
        } else {
            i10 = 0;
        }
        return new C1278Zk(A052, i11, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10, c1300a6);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1278Zk A02(Cursor cursor) {
        DownloadRequest A052 = new C1302a8((String) AbstractC1589es.A01(cursor.getString(0)), Uri.parse((String) AbstractC1589es.A01(cursor.getString(2)))).A01(A05(cursor.getString(1))).A02(A09(cursor.getString(3))).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        C1300a6 c1300a6 = new C1300a6();
        c1300a6.A01 = cursor.getLong(13);
        c1300a6.A00 = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new C1278Zk(A052, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, c1300a6);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 47);
            String[] strArr = A06;
            if (strArr[4].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "8CZbeSODnHgjBTsw9Wu5QxwJLWGymZVt";
            strArr2[3] = "3nFdO4l5q8gTk0WeAd6FUscygdeEUCFJ";
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A05 = new byte[]{103, -60, -27, -14, -24, -60, -74, -33, -28, -74, -66, 95, -96, -101, 87, -117, 124, -113, -117, 87, -121, -119, Byte.MIN_VALUE, -124, 120, -119, -112, 87, -126, 124, -112, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -92, -96, -92, -100, -106, -85, -80, -89, -100, 87, -117, 124, -113, -117, 99, -84, -87, -96, 87, -117, 124, -113, -117, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -86, -85, -87, -100, -104, -92, -106, -94, -100, -80, -86, 87, -117, 124, -113, -117, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -102, -84, -86, -85, -90, -92, -106, -102, -104, -102, -97, -100, -106, -94, -100, -80, 87, -117, 124, -113, -117, 99, -101, -104, -85, -104, 87, 121, -125, -122, 121, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -86, -85, -104, -85, -100, 87, Byte.MIN_VALUE, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -86, -85, -104, -87, -85, -106, -85, -96, -92, -100, -106, -92, -86, 87, Byte.MIN_VALUE, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -84, -89, -101, -104, -85, -100, -106, -85, -96, -92, -100, -106, -92, -86, 87, Byte.MIN_VALUE, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -102, -90, -91, -85, -100, -91, -85, -106, -93, -100, -91, -98, -85, -97, 87, Byte.MIN_VALUE, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -86, -85, -90, -89, -106, -87, -100, -104, -86, -90, -91, 87, Byte.MIN_VALUE, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -99, -104, -96, -93, -84, -87, -100, -106, -87, -100, -104, -86, -90, -91, 87, Byte.MIN_VALUE, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -89, -100, -87, -102, -100, -91, -85, -106, -101, -90, -82, -91, -93, -90, -104, -101, -100, -101, 87, -119, 124, 120, -125, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -103, -80, -85, -100, -86, -106, -101, -90, -82, -91, -93, -90, -104, -101, -100, -101, 87, Byte.MIN_VALUE, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -94, -100, -80, -106, -86, -100, -85, -106, -96, -101, 87, 121, -125, -122, 121, 87, -123, -122, -117, 87, -123, -116, -125, -125, 96, -127, -101, -99, -84, -97, -101, -82, -97, 122, -82, -101, -100, -90, -97, 122, -109, -95, -98, -97, 111, -93, -112, -111, -101, -108, 111, -104, -107, 111, -108, -89, -104, -94, -93, -94, 111, -73, -22, -31, -62, -34, -45, -21, -41, -28, -74, -31, -23, -32, -34, -31, -45, -42, -27, -12, -58, -18, -3, -3, -7, -10, -16, -18, 1, -10, -4, -5, -68, -15, -18, 0, -11, -72, 5, -6, -7, -72, -57, -57, -61, -64, -70, -72, -53, -64, -58, -59, -122, -51, -59, -69, -123, -60, -54, -124, -54, -54, -53, -55, -126, -49, -60, -61, -31, -16, -16, -20, -23, -29, -31, -12, -23, -17, -18, -81, -8, -83, -19, -16, -27, -25, -43, -46, -52, -53, -30, -35, -50, -36, -56, -51, -40, -32, -41, -43, -40, -54, -51, -50, -51, -101, -89, -90, -84, -99, -90, -84, -105, -92, -99, -90, -97, -84, -96, -104, -86, -88, -87, -92, -94, -108, -104, -106, -104, -99, -102, -108, -96, -102, -82, -104, -107, -89, -100, -3, -6, 13, -6, -33, -38, -30, -27, -18, -21, -34, -40, -21, -34, -38, -20, -24, -25, 1, 5, 12, 2, -3, -51, -56, -124, -95, -124, -93, 4, -2, 18, -8, 12, -2, 13, -8, 2, -3, 2, -2, 2, -6, -12, 9, 14, 5, -6, -11, -22, -9, -24, -22, -13, -7, -28, -23, -12, -4, -13, -15, -12, -26, -23, -22, -23, -27, -27, -23, -22, -41, -24, -22, -43, -22, -33, -29, -37, -43, -29, -23, 16, 17, -2, 15, 17, -4, 17, 6, 10, 2, -4, 10, 16, -67, -34, -16, -32, -46, -45, -64, -45, -60, -54, -53, -72, -53, -68, 119, -108, 119, -119, 11, 12, 7, 8, -9, 10, -3, -7, 11, 7, 6, -86, -85, -87, -100, -104, -92, -106, -94, -100, -80, -86, -74, -85, -74, -82, -89, -81, -86, -98, -101, -82, -97, -103, -82, -93, -89, -97, -103, -89, -83, 25, 22, 13, -24, -37, -42, -41, -31, -95, -22, -97, -25, -32, -35, -32, -31, -23, -32};
    }

    static {
        A0B();
        A07 = A07(3, 4);
        A08 = new String[]{A04(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, 2, 106), A04(LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 9, 102), A04(739, 3, 117), A04(709, 11, 8), A04(566, 16, 6), A04(586, 4, 106), A04(684, 5, 48), A04(654, 13, 71), A04(725, 14, 11), A04(552, 14, 9), A04(698, 11, 105), A04(590, 14, 74), A04(634, 18, 86), A04(536, 16, 58), A04(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 10, 106)};
    }

    public C06178n(InterfaceC1098Sb interfaceC1098Sb) {
        this(interfaceC1098Sb, A04(0, 0, 67));
    }

    public C06178n(InterfaceC1098Sb interfaceC1098Sb, String str) {
        this.A03 = str;
        this.A01 = interfaceC1098Sb;
        this.A04 = A04(448, 18, 67) + str;
        this.A02 = new Object();
    }

    private Cursor A00(String str, String[] strArr) throws C1097Sa {
        try {
            String sortOrder = A04(667, 17, 110);
            return this.A01.getReadableDatabase().query(this.A04, A08, str, strArr, null, null, sortOrder);
        } catch (SQLiteException e8) {
            throw new C1097Sa(e8);
        }
    }

    public static String A05(String str) {
        if (A04(582, 4, 5).equals(str)) {
            return A04(468, 20, 94);
        }
        if (A04(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, 3, 106).equals(str)) {
            return A04(IronSourceConstants.SDK_INIT_FAILED, 21, 81);
        }
        if (A04(652, 2, 67).equals(str)) {
            return A04(488, 27, 40);
        }
        return A04(742, 15, 67);
    }

    public static String A06(List<StreamKey> streamKeys) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < streamKeys.size(); i10++) {
            StreamKey streamKey = streamKeys.get(i10);
            StringBuilder stringBuilder = sb.append(streamKey.A01);
            stringBuilder.append('.').append(streamKey.A00).append('.').append(streamKey.A02).append(',');
        }
        if (sb.length() > 0) {
            int length = sb.length();
            String[] strArr = A06;
            if (strArr[0].charAt(10) != strArr[3].charAt(10)) {
                throw new RuntimeException();
            }
            A06[5] = "OBhHwsnIHSm5CTtMxj8nCSc";
            sb.setLength(length - 1);
        }
        return sb.toString();
    }

    public static String A07(int... iArr) {
        if (iArr.length == 0) {
            return A04(413, 1, 59);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A04(684, 5, 48)).append(A04(6, 5, 103));
        int i10 = 0;
        while (true) {
            int length = iArr.length;
            int i11 = A06[2].length();
            if (i11 == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[4] = "2sOMjeNiZo7mfHMBf8EmhmjelhbwcN4x";
            strArr[6] = "07cXHkkLLeQgahpU3qByDqhyHXoJHxGL";
            if (i10 < length) {
                if (i10 > 0) {
                    sb.append(',');
                }
                sb.append(iArr[i10]);
                i10++;
            } else {
                sb.append(')');
                return sb.toString();
            }
        }
    }

    private List<C1278Zk> A08(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!AbstractC1672gE.A19(sQLiteDatabase, this.A04)) {
            return arrayList;
        }
        String A04 = A04(634, 18, 86);
        String A042 = A04(536, 16, 58);
        Cursor query = sQLiteDatabase.query(this.A04, new String[]{A04(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, 2, 106), A04(720, 5, 19), A04(739, 3, 117), A04(709, 11, 8), A04(566, 16, 6), A04(586, 4, 106), A04(684, 5, 48), A04(654, 13, 71), A04(725, 14, 11), A04(552, 14, 9), A04(698, 11, 105), A04(590, 14, 74), A04, A042}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(A02(query));
            } catch (Throwable th) {
                String[] strArr = A06;
                if (strArr[1].charAt(8) != strArr[7].charAt(8)) {
                    throw new RuntimeException();
                }
                A06[5] = "RiUITzzlchERRNucmsrty5lb";
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
        return arrayList;
    }

    public static List<StreamKey> A09(String str) {
        String[] A1O;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : AbstractC1672gE.A1O(str, A04(412, 1, 38))) {
            String[] strArr = A06;
            if (strArr[4].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            A06[5] = "Hcuezu4I7Lq46LB6";
            String[] A1O2 = AbstractC1672gE.A1O(str2, A04(466, 2, 105));
            AbstractC1589es.A08(A1O2.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(A1O2[0]), Integer.parseInt(A1O2[1]), Integer.parseInt(A1O2[2])));
        }
        return arrayList;
    }

    private void A0A() throws C1097Sa {
        synchronized (this.A02) {
            if (this.A00) {
                return;
            }
            try {
                SQLiteDatabase readableDatabase = this.A01.getReadableDatabase();
                int A00 = AbstractC1100Sd.A00(readableDatabase, 0, this.A03);
                if (A00 != 3) {
                    SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        AbstractC1100Sd.A04(writableDatabase, 0, this.A03, 3);
                        List<C1278Zk> A082 = A00 == 2 ? A08(writableDatabase) : new ArrayList<>();
                        writableDatabase.execSQL(A04(427, 21, 32) + this.A04);
                        writableDatabase.execSQL(A04(414, 13, 43) + this.A04 + A04(0, 1, 24) + A04(11, j3.a.b.f17897b, 8));
                        for (C1278Zk c1278Zk : A082) {
                            A0C(c1278Zk, writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                this.A00 = true;
            } catch (SQLException e8) {
                throw new C1097Sa(e8);
            }
        }
    }

    private void A0C(C1278Zk c1278Zk, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = c1278Zk.A07.A06 == null ? AbstractC1672gE.A07 : c1278Zk.A07.A06;
        ContentValues contentValues = new ContentValues();
        contentValues.put(A04(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, 2, 106), c1278Zk.A07.A02);
        contentValues.put(A04(LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 9, 102), c1278Zk.A07.A03);
        contentValues.put(A04(739, 3, 117), c1278Zk.A07.A00.toString());
        contentValues.put(A04(709, 11, 8), A06(c1278Zk.A07.A04));
        contentValues.put(A04(566, 16, 6), c1278Zk.A07.A01);
        contentValues.put(A04(586, 4, 106), c1278Zk.A07.A05);
        contentValues.put(A04(684, 5, 48), Integer.valueOf(c1278Zk.A02));
        contentValues.put(A04(654, 13, 71), Long.valueOf(c1278Zk.A05));
        contentValues.put(A04(725, 14, 11), Long.valueOf(c1278Zk.A06));
        contentValues.put(A04(552, 14, 9), Long.valueOf(c1278Zk.A04));
        contentValues.put(A04(698, 11, 105), Integer.valueOf(c1278Zk.A03));
        contentValues.put(A04(590, 14, 74), Integer.valueOf(c1278Zk.A01));
        contentValues.put(A04(634, 18, 86), Float.valueOf(c1278Zk.A00()));
        contentValues.put(A04(536, 16, 58), Long.valueOf(c1278Zk.A01()));
        contentValues.put(A04(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 10, 106), bArr);
        sQLiteDatabase.replaceOrThrow(this.A04, null, contentValues);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1291Zx
    public final C1278Zk A7g(String str) throws C1097Sa {
        A0A();
        try {
            Cursor A00 = A00(A04(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 6, 53), new String[]{str});
            if (A00.getCount() == 0) {
                if (A00 != null) {
                    A00.close();
                    return null;
                }
                return null;
            }
            A00.moveToNext();
            C1278Zk A01 = A01(A00);
            if (A00 != null) {
                A00.close();
            }
            return A01;
        } catch (SQLiteException e8) {
            throw new C1097Sa(e8);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1291Zx
    public final RO A7h(int... iArr) throws C1097Sa {
        A0A();
        return new RO(A00(A07(iArr), null));
    }

    @Override // com.facebook.ads.redexgen.X.RD
    public final void AGN(C1278Zk c1278Zk) throws C1097Sa {
        A0A();
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            A0C(c1278Zk, writableDatabase);
        } catch (SQLiteException e8) {
            throw new C1097Sa(e8);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RD
    public final void AHX(String str) throws C1097Sa {
        A0A();
        try {
            this.A01.getWritableDatabase().delete(this.A04, A04(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 6, 53), new String[]{str});
        } catch (SQLiteException e8) {
            throw new C1097Sa(e8);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RD
    public final void AIU() throws C1097Sa {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(684, 5, 48), (Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, A04(689, 9, 40), null);
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RD
    public final void AIv() throws C1097Sa {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(684, 5, 48), (Integer) 5);
            contentValues.put(A04(590, 14, 74), (Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, null, null);
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RD
    public final void AIw(int i10) throws C1097Sa {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(698, 11, 105), Integer.valueOf(i10));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07, null);
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RD
    public final void AIx(String str, int i10) throws C1097Sa {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(698, 11, 105), Integer.valueOf(i10));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07 + A04(1, 5, 117) + A04(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 6, 53), new String[]{str});
        } catch (SQLException e8) {
            throw new C1097Sa(e8);
        }
    }
}
