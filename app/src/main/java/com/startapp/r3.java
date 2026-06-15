package com.startapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r3 {

    /* renamed from: a  reason: collision with root package name */
    public final o3 f22445a;

    /* renamed from: b  reason: collision with root package name */
    public final w2 f22446b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f22447c;

    /* renamed from: d  reason: collision with root package name */
    public final j2<Integer> f22448d;

    /* renamed from: e  reason: collision with root package name */
    public final t4<u1> f22449e;

    /* renamed from: f  reason: collision with root package name */
    public final i2<l3, n3, q3, y3> f22450f;

    /* renamed from: g  reason: collision with root package name */
    public final j2<AnalyticsConfig> f22451g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f22452h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicLong f22453i = new AtomicLong();

    /* renamed from: j  reason: collision with root package name */
    public final a f22454j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final b f22455k = new b();

    /* renamed from: l  reason: collision with root package name */
    public final c f22456l = new c();

    /* renamed from: m  reason: collision with root package name */
    public final d f22457m = new d();

    /* renamed from: n  reason: collision with root package name */
    public final e f22458n = new e();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j2<Void> {
        public a() {
        }

        @Override // com.startapp.j2
        public final Void call() {
            try {
                r3 r3Var = r3.this;
                r3Var.f22446b.execute(new v3(r3Var));
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                r3.this.b();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements j2<Void> {
        public c() {
        }

        @Override // com.startapp.j2
        public final Void call() {
            try {
                r3.this.a(0L);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements q3 {
        public d() {
        }

        @Override // com.startapp.q3
        public final void a(l3 l3Var, int i10) {
            try {
                r3 r3Var = r3.this;
                r3Var.getClass();
                r3Var.f22446b.execute(new s3(r3Var, l3Var, i10, System.currentTimeMillis()));
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements h2<l3, Void> {
        public e() {
        }

        @Override // com.startapp.h2
        public final Void a(l3 l3Var) {
            l3 l3Var2 = l3Var;
            if (l3Var2 != null) {
                try {
                    r3.this.b(l3Var2);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
    }

    public r3(o3 o3Var, w2 w2Var, ThreadPoolExecutor threadPoolExecutor, com.startapp.sdk.components.n nVar, t4 t4Var, z3 z3Var, com.startapp.sdk.components.o oVar) {
        this.f22445a = o3Var;
        this.f22446b = w2Var;
        this.f22447c = threadPoolExecutor;
        this.f22448d = nVar;
        this.f22449e = t4Var;
        this.f22450f = z3Var;
        this.f22451g = oVar;
    }

    public final void a() {
        if (this.f22453i.compareAndSet(0L, SystemClock.uptimeMillis())) {
            o3 o3Var = this.f22445a;
            c cVar = this.f22456l;
            synchronized (o3Var) {
                o3Var.f22344c.add(cVar);
            }
            this.f22449e.a().a(this.f22454j);
            this.f22449e.a().a();
            this.f22446b.execute(new v3(this));
        }
    }

    public final void b(l3 l3Var) {
        n3 a10 = a(l3Var.f22225a);
        long uptimeMillis = (this.f22453i.get() + a10.f22320f) - SystemClock.uptimeMillis();
        if (uptimeMillis > 0) {
            a(uptimeMillis);
            return;
        }
        o3 o3Var = this.f22445a;
        long currentTimeMillis = System.currentTimeMillis();
        o3Var.getClass();
        long j10 = l3Var.f22226b;
        o3.a(j10, currentTimeMillis);
        SQLiteDatabase a11 = o3Var.a();
        a11.beginTransaction();
        Cursor cursor = null;
        try {
            try {
                Cursor query = a11.query("events", new String[]{"attempt"}, "rowid = ?", new String[]{String.valueOf(j10)}, null, null, null);
                try {
                    if (query.moveToFirst()) {
                        int i10 = query.getInt(0);
                        o3.a(query);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("send", Long.valueOf(currentTimeMillis));
                        contentValues.put("attempt", Integer.valueOf(i10 + 1));
                        a11.update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
                        a11.setTransactionSuccessful();
                        a11.endTransaction();
                        d dVar = this.f22457m;
                        y3 a12 = this.f22450f.a(l3Var, a10, dVar);
                        if (a12 != null) {
                            this.f22447c.execute(a12);
                            return;
                        } else if (dVar != null) {
                            dVar.a(l3Var, 0);
                            return;
                        } else {
                            return;
                        }
                    }
                    throw new IllegalStateException();
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    o3.a(cursor);
                    throw th;
                }
            } catch (Throwable th2) {
                a11.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final n3 a(m3 m3Var) {
        n3 n3Var;
        Map<String, AnalyticsCategoryConfig> d10;
        AnalyticsCategoryConfig analyticsCategoryConfig;
        synchronized (this.f22452h) {
            Pair pair = (Pair) this.f22452h.get(m3Var.f22288a);
            n3Var = (pair == null || SystemClock.uptimeMillis() >= ((Long) pair.second).longValue()) ? null : (n3) pair.first;
        }
        if (n3Var != null) {
            return n3Var;
        }
        AnalyticsConfig call = this.f22451g.call();
        if (call != null && (d10 = call.d()) != null && (analyticsCategoryConfig = d10.get(m3Var.f22288a)) != null) {
            n3Var = new n3(m3Var.f22289b, analyticsCategoryConfig);
        }
        if (n3Var == null) {
            n3Var = m3Var.f22289b;
        }
        synchronized (this.f22452h) {
            this.f22452h.put(m3Var.f22288a, new Pair(n3Var, Long.valueOf(SystemClock.uptimeMillis() + 30000)));
        }
        return n3Var;
    }

    public final void a(l3 l3Var) {
        AnalyticsConfig call = this.f22451g.call();
        if (call == null || call.dns) {
            return;
        }
        n3 a10 = a(l3Var.f22225a);
        if (Math.random() >= a10.f22315a) {
            return;
        }
        if (a10.f22318d) {
            this.f22446b.execute(new t3(this, l3Var, a10));
        } else if (this.f22449e.a().b()) {
            long uptimeMillis = (this.f22453i.get() + a10.f22320f) - SystemClock.uptimeMillis();
            if (uptimeMillis > 0) {
                this.f22446b.a(new u3(this, l3Var, a10), uptimeMillis);
                return;
            }
            y3 a11 = this.f22450f.a(l3Var, a10, null);
            if (a11 != null) {
                this.f22447c.execute(a11);
            }
        }
    }

    public final void b() {
        this.f22446b.a(this.f22455k);
        if (!this.f22449e.a().b()) {
            AnalyticsConfig call = this.f22451g.call();
            a(call != null ? Math.max(300000L, o9.c(call.f())) : 300000L);
            return;
        }
        Integer call2 = this.f22448d.call();
        int max = call2 != null ? Math.max(1, call2.intValue()) : 1;
        AnalyticsConfig call3 = this.f22451g.call();
        try {
            this.f22445a.a(this.f22458n, call3 != null ? Math.max(1, call3.g()) : 1, max);
        } catch (Throwable unused) {
        }
    }

    public final void a(long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        this.f22446b.a(this.f22455k, j10);
    }

    public final void a(int i10, long j10, l3 l3Var) {
        Cursor query;
        if (i10 == 1) {
            o3 o3Var = this.f22445a;
            o3Var.getClass();
            long j11 = l3Var.f22226b;
            o3.a(j11, j10);
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendSuccess", Long.valueOf(j10));
            o3Var.a().update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j11)});
            a(0L);
            return;
        }
        AnalyticsConfig call = this.f22451g.call();
        int max = call != null ? Math.max(1, call.g()) : 1;
        o3 o3Var2 = this.f22445a;
        o3Var2.getClass();
        long j12 = l3Var.f22226b;
        o3.a(j12, j10);
        SQLiteDatabase a10 = o3Var2.a();
        a10.beginTransaction();
        Cursor cursor = null;
        try {
            try {
                query = a10.query("events", new String[]{"attempt"}, "rowid = ?", new String[]{String.valueOf(j12)}, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (query.moveToFirst()) {
                    int i11 = query.getInt(0);
                    o3.a(query);
                    if (i11 >= max) {
                        a10.delete("events", "rowid = ?", new String[]{String.valueOf(j12)});
                    } else {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("sendFailure", Long.valueOf(j10));
                        a10.update("events", contentValues2, "rowid = ?", new String[]{String.valueOf(j12)});
                    }
                    a10.setTransactionSuccessful();
                    a10.endTransaction();
                    AnalyticsConfig call2 = this.f22451g.call();
                    a(call2 != null ? Math.max(1000L, call2.h()) : 1000L);
                    return;
                }
                throw new IllegalStateException();
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                o3.a(cursor);
                throw th;
            }
        } catch (Throwable th3) {
            a10.endTransaction();
            throw th3;
        }
    }
}
