package v0;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
/* compiled from: SupportSQLiteOpenHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface h extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f31678a;

        public a(int i10) {
            this.f31678a = i10;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    v0.b.a(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e8) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e8);
                    }
                }
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(g gVar) {
        }

        public void c(g gVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + gVar.M());
            if (!gVar.isOpen()) {
                a(gVar.M());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = gVar.l();
                } catch (SQLiteException unused) {
                }
                try {
                    gVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    for (Pair<String, String> next : list) {
                        a((String) next.second);
                    }
                } else {
                    a(gVar.M());
                }
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i10, int i11);

        public void f(g gVar) {
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f31679a;

        /* renamed from: b  reason: collision with root package name */
        public final String f31680b;

        /* renamed from: c  reason: collision with root package name */
        public final a f31681c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f31682d;

        /* compiled from: SupportSQLiteOpenHelper.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            Context f31683a;

            /* renamed from: b  reason: collision with root package name */
            String f31684b;

            /* renamed from: c  reason: collision with root package name */
            a f31685c;

            /* renamed from: d  reason: collision with root package name */
            boolean f31686d;

            a(Context context) {
                this.f31683a = context;
            }

            public b a() {
                if (this.f31685c != null) {
                    if (this.f31683a != null) {
                        if (this.f31686d && TextUtils.isEmpty(this.f31684b)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new b(this.f31683a, this.f31684b, this.f31685c, this.f31686d);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.f31685c = aVar;
                return this;
            }

            public a c(String str) {
                this.f31684b = str;
                return this;
            }

            public a d(boolean z10) {
                this.f31686d = z10;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z10) {
            this.f31679a = context;
            this.f31680b = str;
            this.f31681c = aVar;
            this.f31682d = z10;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        h a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    g q0();

    void setWriteAheadLoggingEnabled(boolean z10);
}
