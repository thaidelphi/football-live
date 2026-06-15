package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.e0;
import com.adcolony.sdk.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0 f6153a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SQLiteDatabase f6154b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f6155c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f6156d;

        a(n0 n0Var, SQLiteDatabase sQLiteDatabase, b bVar, CountDownLatch countDownLatch) {
            this.f6153a = n0Var;
            this.f6154b = sQLiteDatabase;
            this.f6155c = bVar;
            this.f6156d = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (n0.a aVar : this.f6153a.a()) {
                for (Map.Entry<String, String> entry : aVar.e().entrySet()) {
                    c a10 = o.a(entry.getValue(), this.f6154b);
                    if (a10 != null) {
                        this.f6155c.a(aVar.d(), entry.getKey(), a10);
                    }
                }
            }
            o0.c().a(this.f6155c);
            this.f6156d.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f6157a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, ArrayList<a>> f6158b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private final String f6159a;

            /* renamed from: b  reason: collision with root package name */
            private final c f6160b;

            /* synthetic */ a(String str, c cVar, a aVar) {
                this(str, cVar);
            }

            String a() {
                return this.f6159a;
            }

            c b() {
                return this.f6160b;
            }

            private a(String str, c cVar) {
                this.f6159a = str;
                this.f6160b = cVar;
            }
        }

        /* synthetic */ b(int i10, a aVar) {
            this(i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f1 b() {
            f1 b10 = c0.b();
            c0.b(b10, "version", a());
            for (Map.Entry<String, ArrayList<a>> entry : this.f6158b.entrySet()) {
                f1 b11 = c0.b();
                Iterator<a> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    e1 a10 = c0.a();
                    for (String str : next.b().a((Character) ',')) {
                        a10.b(str);
                    }
                    c0.a(b11, next.a(), a10);
                }
                c0.a(b10, entry.getKey(), b11);
            }
            return b10;
        }

        private b(int i10) {
            this.f6158b = new ConcurrentHashMap();
            this.f6157a = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2, c cVar) {
            ArrayList<a> arrayList;
            a aVar = new a(str2, cVar, null);
            if (this.f6158b.containsKey(str) && (arrayList = this.f6158b.get(str)) != null) {
                arrayList.add(aVar);
            } else {
                this.f6158b.put(str, new ArrayList<>(Collections.singletonList(aVar)));
            }
        }

        int a() {
            return this.f6157a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final List<a> f6161a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<ContentValues> f6162b = new ArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private final int f6163a;

            /* renamed from: b  reason: collision with root package name */
            private final String f6164b;

            /* renamed from: c  reason: collision with root package name */
            private final int f6165c;

            /* synthetic */ a(int i10, String str, int i11, a aVar) {
                this(i10, str, i11);
            }

            int c() {
                return this.f6165c;
            }

            private a(int i10, String str, int i11) {
                this.f6163a = i10;
                this.f6164b = str;
                this.f6165c = i11;
            }

            int a() {
                return this.f6163a;
            }

            String b() {
                return this.f6164b;
            }
        }

        c() {
        }

        int b(int i10) {
            if (i10 < 0 || i10 >= this.f6161a.size()) {
                return -1;
            }
            return this.f6161a.get(i10).c();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            while (true) {
                String str = "\n";
                if (i10 >= this.f6161a.size()) {
                    break;
                }
                sb.append(this.f6161a.get(i10).f6164b);
                if (i10 != this.f6161a.size() - 1) {
                    str = " | ";
                }
                sb.append(str);
                i10++;
            }
            for (ContentValues contentValues : this.f6162b) {
                int i11 = 0;
                while (i11 < this.f6161a.size()) {
                    sb.append(contentValues.getAsString(a(i11)));
                    sb.append(i11 == this.f6161a.size() + (-1) ? "\n" : " | ");
                    i11++;
                }
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10, String str, int i11) {
            this.f6161a.add(new a(i10, str, i11, null));
        }

        String a(int i10) {
            if (i10 < 0 || i10 >= this.f6161a.size()) {
                return null;
            }
            return this.f6161a.get(i10).b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Cursor cursor) {
            ContentValues contentValues = new ContentValues();
            for (a aVar : this.f6161a) {
                int i10 = aVar.f6165c;
                if (i10 == 1) {
                    contentValues.put(aVar.b(), Long.valueOf(cursor.getLong(aVar.a())));
                } else if (i10 == 2) {
                    contentValues.put(aVar.b(), Double.valueOf(cursor.getDouble(aVar.a())));
                } else if (i10 != 4) {
                    contentValues.put(aVar.b(), cursor.getString(aVar.a()));
                } else {
                    contentValues.put(aVar.b(), cursor.getBlob(aVar.a()));
                }
            }
            this.f6162b.add(contentValues);
        }

        String a(int i10, Character ch) {
            if (i10 < 0 || i10 >= this.f6162b.size()) {
                return null;
            }
            ContentValues contentValues = this.f6162b.get(i10);
            StringBuilder sb = new StringBuilder();
            int i11 = 0;
            while (i11 < this.f6161a.size()) {
                if (b(i11) == 3) {
                    sb.append("\"");
                    sb.append(contentValues.get(a(i11)));
                    sb.append("\"");
                } else {
                    sb.append(contentValues.getAsString(a(i11)));
                }
                sb.append(i11 == this.f6161a.size() + (-1) ? "" : ch);
                i11++;
            }
            return sb.toString();
        }

        List<String> a(Character ch) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f6162b.size(); i10++) {
                arrayList.add(a(i10, ch));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(n0 n0Var, SQLiteDatabase sQLiteDatabase, Executor executor, long j10) {
        b bVar = new b(n0Var.b(), null);
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            executor.execute(new a(n0Var, sQLiteDatabase, bVar, countDownLatch));
            if (j10 > 0) {
                countDownLatch.await(j10, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException | RejectedExecutionException e8) {
            e0.a aVar = new e0.a();
            aVar.a("ADCDbReader.calculateFeatureVectors failed with: " + e8.toString()).a(e0.f5981i);
        }
        return bVar;
    }

    static c a(String str, SQLiteDatabase sQLiteDatabase) {
        c cVar;
        Throwable th;
        c cVar2 = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(str, null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst()) {
                        cVar = new c();
                        for (int i10 = 0; i10 < rawQuery.getColumnCount(); i10++) {
                            try {
                                cVar.a(i10, rawQuery.getColumnName(i10), rawQuery.getType(i10));
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    rawQuery.close();
                                } catch (Throwable th3) {
                                    try {
                                        th.addSuppressed(th3);
                                    } catch (SQLException e8) {
                                        e = e8;
                                        new e0.a().a("SQLException on execute query: ").a(e.toString()).a(e0.f5981i);
                                        return cVar;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        new e0.a().a("Error on execute query: ").a(th.toString()).a(e0.f5981i);
                                        return cVar;
                                    }
                                }
                                throw th;
                            }
                        }
                        do {
                            cVar.a(rawQuery);
                        } while (rawQuery.moveToNext());
                        cVar2 = cVar;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    cVar = null;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
                return cVar2;
            }
            return cVar2;
        } catch (SQLException e10) {
            e = e10;
            cVar = cVar2;
        } catch (Throwable th6) {
            th = th6;
            cVar = cVar2;
        }
    }
}
