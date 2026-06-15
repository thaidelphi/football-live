package w0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import v0.g;
import v0.h;
/* compiled from: FrameworkSQLiteOpenHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f31935a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31936b;

    /* renamed from: c  reason: collision with root package name */
    private final h.a f31937c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f31938d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f31939e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private a f31940f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f31941g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameworkSQLiteOpenHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        final w0.a[] f31942a;

        /* renamed from: b  reason: collision with root package name */
        final h.a f31943b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f31944c;

        /* compiled from: FrameworkSQLiteOpenHelper.java */
        /* renamed from: w0.b$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0371a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.a f31945a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ w0.a[] f31946b;

            C0371a(h.a aVar, w0.a[] aVarArr) {
                this.f31945a = aVar;
                this.f31946b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f31945a.c(a.b(this.f31946b, sQLiteDatabase));
            }
        }

        a(Context context, String str, w0.a[] aVarArr, h.a aVar) {
            super(context, str, null, aVar.f31678a, new C0371a(aVar, aVarArr));
            this.f31943b = aVar;
            this.f31942a = aVarArr;
        }

        static w0.a b(w0.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            w0.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new w0.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        w0.a a(SQLiteDatabase sQLiteDatabase) {
            return b(this.f31942a, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f31942a[0] = null;
        }

        synchronized g f() {
            this.f31944c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f31944c) {
                close();
                return f();
            }
            return a(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f31943b.b(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f31943b.d(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f31944c = true;
            this.f31943b.e(a(sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f31944c) {
                return;
            }
            this.f31943b.f(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f31944c = true;
            this.f31943b.g(a(sQLiteDatabase), i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, String str, h.a aVar, boolean z10) {
        this.f31935a = context;
        this.f31936b = str;
        this.f31937c = aVar;
        this.f31938d = z10;
    }

    private a a() {
        a aVar;
        synchronized (this.f31939e) {
            if (this.f31940f == null) {
                w0.a[] aVarArr = new w0.a[1];
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23 && this.f31936b != null && this.f31938d) {
                    this.f31940f = new a(this.f31935a, new File(v0.d.a(this.f31935a), this.f31936b).getAbsolutePath(), aVarArr, this.f31937c);
                } else {
                    this.f31940f = new a(this.f31935a, this.f31936b, aVarArr, this.f31937c);
                }
                if (i10 >= 16) {
                    v0.b.d(this.f31940f, this.f31941g);
                }
            }
            aVar = this.f31940f;
        }
        return aVar;
    }

    @Override // v0.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // v0.h
    public String getDatabaseName() {
        return this.f31936b;
    }

    @Override // v0.h
    public g q0() {
        return a().f();
    }

    @Override // v0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f31939e) {
            a aVar = this.f31940f;
            if (aVar != null) {
                v0.b.d(aVar, z10);
            }
            this.f31941g = z10;
        }
    }
}
