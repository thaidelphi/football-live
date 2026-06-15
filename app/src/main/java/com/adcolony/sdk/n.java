package com.adcolony.sdk;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.adcolony.sdk.e0;
import com.adcolony.sdk.n0;
import com.ironsource.cc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class n {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f6130a;

    /* renamed from: b  reason: collision with root package name */
    private final n0 f6131b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(SQLiteDatabase sQLiteDatabase, n0 n0Var) {
        this.f6130a = sQLiteDatabase;
        this.f6131b = n0Var;
    }

    private void a(n0.a aVar, List<String> list) {
        a(aVar.f(), "manager_tmp_table");
        c(aVar);
        a("manager_tmp_table", aVar.f(), list);
        b("manager_tmp_table");
    }

    private void c(n0.c cVar, String str) {
        ArrayList<String[]> c10 = c(cVar.b());
        boolean z10 = true;
        if (cVar.a().length == c10.size()) {
            boolean z11 = false;
            for (int i10 = 0; i10 < cVar.a().length; i10++) {
                if (!Objects.equals(cVar.a()[i10], c10.get(i10)[2])) {
                    z11 = true;
                }
            }
            z10 = z11;
        }
        if (z10) {
            a(cVar.b());
            b(cVar, str);
        }
    }

    private void d(n0.a aVar) {
        List<n0.c> b10 = aVar.b();
        ArrayList<String> d10 = d(aVar.f());
        for (n0.c cVar : b10) {
            if (d10.contains(cVar.b())) {
                c(cVar, aVar.f());
            } else {
                b(cVar, aVar.f());
            }
            d10.remove(cVar.b());
        }
        Iterator<String> it = d10.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    private void e(n0.a aVar) {
        boolean z10;
        boolean z11;
        ArrayList<a> g10 = g(aVar.f());
        ArrayList arrayList = new ArrayList();
        boolean z12 = false;
        for (n0.b bVar : aVar.a()) {
            int size = g10.size() - 1;
            while (true) {
                if (size < 0) {
                    z10 = false;
                    z11 = false;
                    break;
                }
                a aVar2 = g10.get(size);
                if (Objects.equals(aVar2.a(), bVar.b())) {
                    arrayList.add(bVar.b());
                    z10 = aVar2.a(bVar);
                    g10.remove(size);
                    z11 = true;
                    break;
                }
                size--;
            }
            if (!z11 || !z10) {
                z12 = true;
            }
        }
        if (g10.size() <= 0 ? z12 : true) {
            a(aVar, arrayList);
            b(aVar);
            return;
        }
        d(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        int version = this.f6130a.getVersion();
        this.f6130a.beginTransaction();
        boolean z10 = false;
        try {
            try {
                List<n0.a> a10 = this.f6131b.a();
                ArrayList<String> a11 = a();
                for (n0.a aVar : a10) {
                    if (a11.contains(aVar.f())) {
                        e(aVar);
                    } else {
                        c(aVar);
                        b(aVar);
                    }
                    a11.remove(aVar.f());
                }
                Iterator<String> it = a11.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
                this.f6130a.setVersion(this.f6131b.b());
                this.f6130a.setTransactionSuccessful();
                z10 = true;
                new e0.a().a("Success upgrading database from ").a(version).a(" to ").a(this.f6131b.b()).a(e0.f5977e);
            } catch (SQLException e8) {
                new e0.a().a("Upgrading database from ").a(version).a(" to ").a(this.f6131b.b()).a("caused: ").a(e8.toString()).a(e0.f5979g);
            }
            return z10;
        } finally {
            this.f6130a.endTransaction();
        }
    }

    ArrayList<String> f(String str) {
        SQLiteDatabase sQLiteDatabase = this.f6130a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master  WHERE type='" + str + "' ORDER BY name", null);
        ArrayList<String> arrayList = new ArrayList<>();
        if (rawQuery != null && rawQuery.moveToFirst()) {
            do {
                arrayList.add(rawQuery.getString(0));
            } while (rawQuery.moveToNext());
            rawQuery.close();
            return arrayList;
        }
        rawQuery.close();
        return arrayList;
    }

    ArrayList<a> g(String str) {
        ArrayList<a> arrayList = new ArrayList<>();
        Iterator<String[]> it = e("PRAGMA table_info(" + str + ")").iterator();
        while (it.hasNext()) {
            a a10 = a.a(it.next());
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f6132a;

        /* renamed from: b  reason: collision with root package name */
        private final String f6133b;

        /* renamed from: c  reason: collision with root package name */
        private final String f6134c;

        private a(String[] strArr) {
            this.f6132a = strArr[1];
            this.f6133b = strArr[2];
            this.f6134c = strArr[4];
        }

        static a a(String[] strArr) {
            if (strArr.length >= 5) {
                return new a(strArr);
            }
            return null;
        }

        boolean a(n0.b bVar) {
            return Objects.equals(this.f6132a, bVar.b()) && Objects.equals(this.f6133b, bVar.c()) && Objects.equals(this.f6134c, bVar.a());
        }

        String a() {
            return this.f6132a;
        }
    }

    private void a(String str) {
        SQLiteDatabase sQLiteDatabase = this.f6130a;
        sQLiteDatabase.execSQL("DROP INDEX " + str);
    }

    private String a(n0.a aVar) {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ");
        sb.append(aVar.f());
        sb.append(" (");
        for (int i10 = 0; i10 < aVar.a().size(); i10++) {
            n0.b bVar = aVar.a().get(i10);
            sb.append(bVar.b());
            sb.append(" ");
            sb.append(bVar.c());
            if (bVar.a() != null) {
                if (bVar.a() instanceof Boolean) {
                    obj = ((Boolean) bVar.a()).booleanValue() ? "1" : "0";
                } else if (bVar.a() instanceof String) {
                    obj = "'" + bVar.a() + "'";
                } else {
                    obj = bVar.a().toString();
                }
                sb.append(" DEFAULT ");
                sb.append(obj);
            }
            if (i10 < aVar.a().size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    private void c(n0.a aVar) {
        this.f6130a.execSQL(a(aVar));
    }

    ArrayList<String[]> c(String str) {
        return e("PRAGMA index_info(" + str + ")");
    }

    ArrayList<String> d(String str) {
        ArrayList<String[]> e8 = e("PRAGMA index_list(" + str + ")");
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String[]> it = e8.iterator();
        while (it.hasNext()) {
            String[] next = it.next();
            if (next.length >= 3) {
                arrayList.add(next[1]);
            }
        }
        return arrayList;
    }

    ArrayList<String[]> e(String str) {
        Cursor rawQuery = this.f6130a.rawQuery(str, null);
        ArrayList<String[]> arrayList = new ArrayList<>();
        if (rawQuery != null && rawQuery.moveToFirst()) {
            do {
                int columnCount = rawQuery.getColumnCount();
                String[] strArr = new String[columnCount];
                for (int i10 = 0; i10 < columnCount; i10++) {
                    strArr[i10] = rawQuery.getString(i10);
                }
                arrayList.add(strArr);
            } while (rawQuery.moveToNext());
            rawQuery.close();
            return arrayList;
        }
        rawQuery.close();
        return arrayList;
    }

    private String a(n0.c cVar, String str) {
        String join = TextUtils.join(", ", cVar.a());
        return "CREATE INDEX " + cVar.b() + " ON " + str + "(" + join + ")";
    }

    private void a(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.f6130a;
        sQLiteDatabase.execSQL("ALTER TABLE " + str + " RENAME TO " + str2);
    }

    private void a(String str, String str2, List<String> list) {
        String join = TextUtils.join(", ", list);
        SQLiteDatabase sQLiteDatabase = this.f6130a;
        sQLiteDatabase.execSQL("INSERT INTO " + str2 + " (" + join + ") SELECT " + join + " FROM " + str);
    }

    ArrayList<String> a() {
        ArrayList<String> f10 = f(cc.Q);
        for (int size = f10.size() - 1; size >= 0; size--) {
            String str = f10.get(size);
            if (str.startsWith("android_") || str.startsWith("sqlite_")) {
                f10.remove(size);
            }
        }
        return f10;
    }

    private void b(n0.a aVar) {
        for (n0.c cVar : aVar.b()) {
            b(cVar, aVar.f());
        }
    }

    private void b(n0.c cVar, String str) {
        this.f6130a.execSQL(a(cVar, str));
    }

    private void b(String str) {
        SQLiteDatabase sQLiteDatabase = this.f6130a;
        sQLiteDatabase.execSQL("DROP TABLE " + str);
    }
}
