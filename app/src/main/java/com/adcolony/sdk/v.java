package com.adcolony.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.adcolony.sdk.e0;
import com.adcolony.sdk.n0;
import com.adcolony.sdk.o;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v {

    /* renamed from: f  reason: collision with root package name */
    private static v f6317f;

    /* renamed from: b  reason: collision with root package name */
    private SQLiteDatabase f6319b;

    /* renamed from: d  reason: collision with root package name */
    private c f6321d;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f6318a = Executors.newSingleThreadExecutor();

    /* renamed from: c  reason: collision with root package name */
    private boolean f6320c = false;

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f6322e = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f1 f6323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x f6324b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f6325c;

        a(f1 f1Var, x xVar, Context context) {
            this.f6323a = f1Var;
            this.f6324b = xVar;
            this.f6325c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            n0 a10 = n0.a(this.f6323a);
            if (a10 != null) {
                v.this.a(a10, this.f6324b, this.f6325c);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ContentValues f6328b;

        b(String str, ContentValues contentValues) {
            this.f6327a = str;
            this.f6328b = contentValues;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.b(this.f6327a, this.f6328b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void a();
    }

    v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f6322e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, ContentValues contentValues) {
        p.a(str, contentValues, this.f6319b);
    }

    public static v a() {
        if (f6317f == null) {
            synchronized (v.class) {
                if (f6317f == null) {
                    f6317f = new v();
                }
            }
        }
        return f6317f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar) {
        this.f6321d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f1 f1Var, x<n0> xVar) {
        Context applicationContext = com.adcolony.sdk.a.c() ? com.adcolony.sdk.a.a().getApplicationContext() : null;
        if (applicationContext == null || f1Var == null) {
            return;
        }
        try {
            this.f6318a.execute(new a(f1Var, xVar, applicationContext));
        } catch (RejectedExecutionException e8) {
            e0.a aVar = new e0.a();
            aVar.a("ADCEventsRepository.open failed with: " + e8.toString()).a(e0.f5981i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(n0 n0Var, x<n0> xVar, Context context) {
        try {
            SQLiteDatabase sQLiteDatabase = this.f6319b;
            boolean z10 = false;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                this.f6319b = context.openOrCreateDatabase("adc_events_db", 0, null);
            }
            if (this.f6319b.needUpgrade(n0Var.b())) {
                if (a(n0Var) && this.f6321d != null) {
                    z10 = true;
                }
                this.f6320c = z10;
                if (z10) {
                    this.f6321d.a();
                }
            } else {
                this.f6320c = true;
            }
            if (this.f6320c) {
                xVar.a(n0Var);
            }
        } catch (SQLiteException e8) {
            new e0.a().a("Database cannot be opened").a(e8.toString()).a(e0.f5979g);
        }
    }

    private boolean a(n0 n0Var) {
        return new n(this.f6319b, n0Var).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(n0.a aVar, ContentValues contentValues) {
        String str;
        if (aVar == null || this.f6322e.contains(aVar.f())) {
            return;
        }
        this.f6322e.add(aVar.f());
        int c10 = aVar.c();
        long j10 = -1;
        n0.d g10 = aVar.g();
        if (g10 != null) {
            j10 = contentValues.getAsLong(g10.a()).longValue() - g10.b();
            str = g10.a();
        } else {
            str = null;
        }
        p.a(c10, j10, str, aVar.f(), this.f6319b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, ContentValues contentValues) {
        if (this.f6320c) {
            try {
                this.f6318a.execute(new b(str, contentValues));
            } catch (RejectedExecutionException e8) {
                e0.a aVar = new e0.a();
                aVar.a("ADCEventsRepository.saveEvent failed with: " + e8.toString()).a(e0.f5981i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o.b a(n0 n0Var, long j10) {
        if (this.f6320c) {
            return o.a(n0Var, this.f6319b, this.f6318a, j10);
        }
        return null;
    }
}
