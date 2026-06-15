package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import android.provider.BaseColumns;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class da extends SQLiteOpenHelper implements tf {

    /* renamed from: f  reason: collision with root package name */
    private static da f16983f = null;

    /* renamed from: g  reason: collision with root package name */
    private static final String f16984g = " TEXT";

    /* renamed from: h  reason: collision with root package name */
    private static final String f16985h = " INTEGER";

    /* renamed from: i  reason: collision with root package name */
    private static final String f16986i = ",";

    /* renamed from: a  reason: collision with root package name */
    private final ea f16987a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16988b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16989c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16990d;

    /* renamed from: e  reason: collision with root package name */
    private final String f16991e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static abstract class a implements BaseColumns {

        /* renamed from: a  reason: collision with root package name */
        public static final String f16992a = "events";

        /* renamed from: b  reason: collision with root package name */
        public static final int f16993b = 4;

        /* renamed from: c  reason: collision with root package name */
        public static final String f16994c = "eventid";

        /* renamed from: d  reason: collision with root package name */
        public static final String f16995d = "timestamp";

        /* renamed from: e  reason: collision with root package name */
        public static final String f16996e = "type";

        /* renamed from: f  reason: collision with root package name */
        public static final String f16997f = "data";

        a() {
        }
    }

    public da(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f16987a = new ea();
        this.f16988b = 4;
        this.f16989c = CommonGatewayClient.CODE_400;
        this.f16990d = "DROP TABLE IF EXISTS events";
        this.f16991e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    private ContentValues a(zb zbVar, String str) {
        if (zbVar != null) {
            ContentValues contentValues = new ContentValues(4);
            contentValues.put("eventid", Integer.valueOf(zbVar.c()));
            contentValues.put(a.f16995d, Long.valueOf(zbVar.d()));
            contentValues.put("type", str);
            contentValues.put("data", zbVar.a());
            return contentValues;
        }
        return null;
    }

    private synchronized SQLiteDatabase a(boolean z10) throws Throwable {
        int i10 = 0;
        while (true) {
            try {
                if (z10) {
                    return this.f16987a.a(true, this);
                }
                return this.f16987a.a(false, this);
            } catch (Throwable th) {
                o9.d().a(th);
                i10++;
                if (i10 >= 4) {
                    throw th;
                }
                SystemClock.sleep(i10 * CommonGatewayClient.CODE_400);
            }
        }
    }

    public static synchronized da a(Context context, String str, int i10) {
        da daVar;
        synchronized (da.class) {
            if (f16983f == null) {
                f16983f = new da(context, str, i10);
            }
            daVar = f16983f;
        }
        return daVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r11.isOpen() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (r11.isOpen() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
        r11.close();
     */
    @Override // com.ironsource.tf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.ArrayList<com.ironsource.zb> a(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb6
            r0.<init>()     // Catch: java.lang.Throwable -> Lb6
            r1 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r11 = r12.a(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r6 = "type = ?"
            r3 = 1
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L74
            r7[r1] = r13     // Catch: java.lang.Throwable -> L74
            java.lang.String r10 = "timestamp ASC"
            java.lang.String r4 = "events"
            r5 = 0
            r8 = 0
            r9 = 0
            r3 = r11
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L74
            int r13 = r2.getCount()     // Catch: java.lang.Throwable -> L74
            if (r13 <= 0) goto L64
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L74
        L28:
            boolean r13 = r2.isAfterLast()     // Catch: java.lang.Throwable -> L74
            if (r13 != 0) goto L61
            java.lang.String r13 = "eventid"
            int r13 = r2.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L74
            if (r13 >= 0) goto L37
            goto L28
        L37:
            int r13 = r2.getInt(r13)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "timestamp"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L74
            if (r1 >= 0) goto L44
            goto L28
        L44:
            long r3 = r2.getLong(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "data"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L74
            if (r1 >= 0) goto L51
            goto L28
        L51:
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L74
            com.ironsource.zb r5 = new com.ironsource.zb     // Catch: java.lang.Throwable -> L74
            r5.<init>(r13, r3, r1)     // Catch: java.lang.Throwable -> L74
            r0.add(r5)     // Catch: java.lang.Throwable -> L74
            r2.moveToNext()     // Catch: java.lang.Throwable -> L74
            goto L28
        L61:
            r2.close()     // Catch: java.lang.Throwable -> L74
        L64:
            boolean r13 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb6
            if (r13 != 0) goto L6d
            r2.close()     // Catch: java.lang.Throwable -> Lb6
        L6d:
            boolean r13 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb6
            if (r13 == 0) goto L9c
            goto L99
        L74:
            r13 = move-exception
            goto L78
        L76:
            r13 = move-exception
            r11 = r2
        L78:
            com.ironsource.o9 r1 = com.ironsource.o9.d()     // Catch: java.lang.Throwable -> L9e
            r1.a(r13)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "IronSource"
            java.lang.String r3 = "Exception while loading events: "
            android.util.Log.e(r1, r3, r13)     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L91
            boolean r13 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb6
            if (r13 != 0) goto L91
            r2.close()     // Catch: java.lang.Throwable -> Lb6
        L91:
            if (r11 == 0) goto L9c
            boolean r13 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb6
            if (r13 == 0) goto L9c
        L99:
            r11.close()     // Catch: java.lang.Throwable -> Lb6
        L9c:
            monitor-exit(r12)
            return r0
        L9e:
            r13 = move-exception
            if (r2 == 0) goto Laa
            boolean r0 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb6
            if (r0 != 0) goto Laa
            r2.close()     // Catch: java.lang.Throwable -> Lb6
        Laa:
            if (r11 == 0) goto Lb5
            boolean r0 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lb5
            r11.close()     // Catch: java.lang.Throwable -> Lb6
        Lb5:
            throw r13     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.da.a(java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r0.isOpen() != false) goto L30;
     */
    @Override // com.ironsource.tf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(java.util.List<com.ironsource.zb> r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L67
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto La
            goto L67
        La:
            r0 = 1
            r1 = 0
            android.database.sqlite.SQLiteDatabase r0 = r4.a(r0)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L37
        L14:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L37
            com.ironsource.zb r2 = (com.ironsource.zb) r2     // Catch: java.lang.Throwable -> L37
            android.content.ContentValues r2 = r4.a(r2, r6)     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L14
            if (r2 == 0) goto L14
            java.lang.String r3 = "events"
            r0.insert(r3, r1, r2)     // Catch: java.lang.Throwable -> L37
            goto L14
        L2e:
            if (r0 == 0) goto L55
            boolean r5 = r0.isOpen()     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L55
            goto L52
        L37:
            r5 = move-exception
            r1 = r0
            goto L3b
        L3a:
            r5 = move-exception
        L3b:
            com.ironsource.o9 r6 = com.ironsource.o9.d()     // Catch: java.lang.Throwable -> L57
            r6.a(r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = "IronSource"
            java.lang.String r0 = "Exception while saving events: "
            android.util.Log.e(r6, r0, r5)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L55
            boolean r5 = r1.isOpen()     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L55
            r0 = r1
        L52:
            r0.close()     // Catch: java.lang.Throwable -> L64
        L55:
            monitor-exit(r4)
            return
        L57:
            r5 = move-exception
            if (r1 == 0) goto L63
            boolean r6 = r1.isOpen()     // Catch: java.lang.Throwable -> L64
            if (r6 == 0) goto L63
            r1.close()     // Catch: java.lang.Throwable -> L64
        L63:
            throw r5     // Catch: java.lang.Throwable -> L64
        L64:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L67:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.da.a(java.util.List, java.lang.String):void");
    }

    @Override // com.ironsource.tf
    public synchronized void b(String str) {
        String[] strArr = {str};
        SQLiteDatabase a10 = a(true);
        a10.delete("events", "type = ?", strArr);
        if (a10.isOpen()) {
            a10.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }
}
