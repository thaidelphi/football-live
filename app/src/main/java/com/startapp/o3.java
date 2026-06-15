package com.startapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.ironsource.b9;
import com.ironsource.da;
import com.startapp.r3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONTokener;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o3 extends z1 {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f22343d = {"rowid", da.a.f16995d, "sdkVersion", "category", "appActivity", b9.h.X, "details", "detailsJson", "dParam", "service", "tag"};

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList f22344c;

    public o3(Context context) {
        super(context, "StartApp-d6864f2502af7851");
        this.f22344c = new LinkedList();
    }

    public static boolean a(l3 l3Var, p3 p3Var, SQLiteDatabase sQLiteDatabase, HashMap hashMap, long j10) {
        if (p3Var.f22377a.size() <= 0 || p3Var.f22377a.contains(l3Var.f22228d)) {
            if (p3Var.f22378b.size() <= 0 || !p3Var.f22378b.contains(l3Var.f22228d)) {
                if (p3Var.f22379c.size() <= 0 || p3Var.f22379c.contains(l3Var.f22233i)) {
                    if (p3Var.f22380d.size() <= 0 || !p3Var.f22380d.contains(l3Var.f22233i)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (hashMap.containsKey("sdkVersion")) {
                            linkedHashMap.put("sdkVersion", hashMap.get("sdkVersion"));
                        }
                        if (hashMap.containsKey("category")) {
                            linkedHashMap.put("category", hashMap.get("category"));
                        }
                        for (String str : p3Var.f22381e) {
                            if (hashMap.containsKey(str)) {
                                linkedHashMap.put(str, hashMap.get(str));
                            }
                        }
                        int size = linkedHashMap.size();
                        if (size >= 1) {
                            StringBuilder sb = new StringBuilder();
                            ArrayList arrayList = new ArrayList(size);
                            String str2 = "";
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                sb.append(str2);
                                sb.append((String) entry.getKey());
                                if (entry.getValue() == null) {
                                    sb.append(" IS NULL");
                                } else {
                                    sb.append(" = ?");
                                    arrayList.add(entry.getValue());
                                }
                                str2 = " AND ";
                            }
                            Pair pair = new Pair(sb.toString(), arrayList.toArray(new String[0]));
                            Cursor cursor = null;
                            try {
                                cursor = sQLiteDatabase.query("events", new String[]{"sendSuccess"}, (String) pair.first, (String[]) pair.second, null, null, "sendSuccess DESC");
                                if (cursor.moveToFirst()) {
                                    long j11 = cursor.getLong(0);
                                    if (j11 <= 0) {
                                        return true;
                                    }
                                    long j12 = j10 - j11;
                                    long j13 = p3Var.f22382f;
                                    if (j13 > 0 && j12 < j13) {
                                        return true;
                                    }
                                }
                                return false;
                            } finally {
                                a(cursor);
                            }
                        }
                        throw new IllegalArgumentException();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static l3 b(Cursor cursor) {
        long j10 = cursor.getLong(0);
        long j11 = cursor.getLong(1);
        a(j10, j11);
        String string = cursor.getString(2);
        m3 m3Var = (m3) m3.f22273c.get(cursor.getString(3));
        String string2 = cursor.getString(4);
        String string3 = cursor.getString(5);
        String string4 = cursor.getString(6);
        String string5 = cursor.getString(7);
        String string6 = cursor.getString(8);
        boolean z10 = cursor.getInt(9) == 1;
        String string7 = cursor.getString(10);
        if (string == null || string.trim().length() < 1) {
            throw new IllegalArgumentException();
        }
        if (m3Var != null) {
            Object obj = null;
            if (string5 != null) {
                try {
                    obj = new JSONTokener(string5).nextValue();
                } catch (JSONException unused) {
                }
            }
            l3 l3Var = new l3(m3Var, j10);
            l3Var.f22232h = Long.valueOf(j11);
            l3Var.f22227c = string;
            l3Var.f22233i = string2;
            l3Var.f22228d = string3;
            l3Var.f22229e = string4;
            l3Var.f22230f = obj;
            l3Var.f22231g = string6;
            l3Var.f22234j = z10;
            l3Var.f22235k = string7;
            return l3Var;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events ( timestamp INTEGER NOT NULL, validTill INTEGER NOT NULL, sdkVersion TEXT NOT NULL, category TEXT NOT NULL, appActivity TEXT, value TEXT, details TEXT, detailsJson TEXT, dParam TEXT, service INTEGER NOT NULL DEFAULT 0, tag TEXT, priority INTEGER NOT NULL, attempt INTEGER NOT NULL DEFAULT 0, send INTEGER NOT NULL DEFAULT 0, sendFailure INTEGER NOT NULL DEFAULT 0, sendSuccess INTEGER NOT NULL DEFAULT 0, CHECK (attempt >= 0), CHECK (send >= 0), CHECK (sendFailure >= 0), CHECK (sendSuccess >= 0));");
    }

    public final void a(r3.e eVar, int i10, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor cursor = null;
        try {
            cursor = a().query("events", f22343d, "attempt < " + i10 + " AND validTill >= " + currentTimeMillis + " AND sendSuccess = 0  AND send <= sendFailure", null, null, null, "priority DESC, timestamp ASC", String.valueOf(Math.max(1, i11)));
            while (cursor.moveToNext()) {
                eVar.a(b(cursor));
            }
        } finally {
            a(cursor);
        }
    }

    public final boolean a(l3 l3Var, n3 n3Var) {
        long j10;
        SQLiteDatabase a10 = a();
        a10.beginTransaction();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis + n3Var.f22319e;
            Long l10 = l3Var.f22232h;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                l3Var.f22232h = Long.valueOf(currentTimeMillis);
                j10 = currentTimeMillis;
            }
            Object obj = l3Var.f22230f;
            String obj2 = obj != null ? obj.toString() : null;
            String str = l3Var.f22227c;
            if (str == null) {
                str = "4.11.5";
            }
            String str2 = str;
            List<p3> list = n3Var.f22321g;
            if (list.size() > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("sdkVersion", str2);
                hashMap.put("category", l3Var.f22225a.f22288a);
                hashMap.put("appActivity", l3Var.f22233i);
                hashMap.put(b9.h.X, l3Var.f22228d);
                hashMap.put("details", l3Var.f22229e);
                hashMap.put("detailsJson", obj2);
                hashMap.put("dParam", l3Var.f22231g);
                hashMap.put("service", l3Var.f22234j ? "1" : "0");
                for (p3 p3Var : list) {
                    HashMap hashMap2 = hashMap;
                    String str3 = str2;
                    String str4 = obj2;
                    if (a(l3Var, p3Var, a10, hashMap2, currentTimeMillis)) {
                        a10.endTransaction();
                        return false;
                    }
                    str2 = str3;
                    hashMap = hashMap2;
                    obj2 = str4;
                }
            }
            String str5 = str2;
            String str6 = obj2;
            a10.delete("events", "validTill < " + currentTimeMillis, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put(da.a.f16995d, Long.valueOf(j10));
            contentValues.put("validTill", Long.valueOf(j11));
            contentValues.put("sdkVersion", str5);
            contentValues.put("category", l3Var.f22225a.f22288a);
            contentValues.put("appActivity", l3Var.f22233i);
            contentValues.put(b9.h.X, l3Var.f22228d);
            contentValues.put("details", l3Var.f22229e);
            contentValues.put("detailsJson", str6);
            contentValues.put("dParam", l3Var.f22231g);
            contentValues.put("service", Integer.valueOf(l3Var.f22234j ? 1 : 0));
            contentValues.put("tag", l3Var.f22235k);
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(n3Var.f22317c));
            a10.insertOrThrow("events", null, contentValues);
            a10.setTransactionSuccessful();
            synchronized (this) {
                for (j2 j2Var : this.f22344c) {
                    j2Var.call();
                }
            }
            return true;
        } finally {
            a10.endTransaction();
        }
    }

    public static void a(long j10, long j11) {
        if (j10 <= 0) {
            throw new IllegalArgumentException();
        }
        if (j11 <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }
}
