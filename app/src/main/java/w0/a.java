package w0;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import v0.g;
import v0.j;
import v0.k;
/* compiled from: FrameworkSQLiteDatabase.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class a implements g {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f31928b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f31929c = new String[0];

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f31930a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: w0.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0370a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f31931a;

        C0370a(j jVar) {
            this.f31931a = jVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f31931a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f31933a;

        b(j jVar) {
            this.f31933a = jVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f31933a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(SQLiteDatabase sQLiteDatabase) {
        this.f31930a = sQLiteDatabase;
    }

    @Override // v0.g
    public boolean A0() {
        return v0.b.b(this.f31930a);
    }

    @Override // v0.g
    public void D() {
        this.f31930a.endTransaction();
    }

    @Override // v0.g
    public String M() {
        return this.f31930a.getPath();
    }

    @Override // v0.g
    public Cursor W(j jVar, CancellationSignal cancellationSignal) {
        return v0.b.c(this.f31930a, jVar.a(), f31929c, null, cancellationSignal, new b(jVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f31930a == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31930a.close();
    }

    @Override // v0.g
    public k f0(String str) {
        return new e(this.f31930a.compileStatement(str));
    }

    @Override // v0.g
    public void g() {
        this.f31930a.beginTransaction();
    }

    @Override // v0.g
    public boolean isOpen() {
        return this.f31930a.isOpen();
    }

    @Override // v0.g
    public List<Pair<String, String>> l() {
        return this.f31930a.getAttachedDbs();
    }

    @Override // v0.g
    public void m(String str) throws SQLException {
        this.f31930a.execSQL(str);
    }

    @Override // v0.g
    public Cursor q(j jVar) {
        return this.f31930a.rawQueryWithFactory(new C0370a(jVar), jVar.a(), f31929c, null);
    }

    @Override // v0.g
    public Cursor r0(String str) {
        return q(new v0.a(str));
    }

    @Override // v0.g
    public void v() {
        this.f31930a.setTransactionSuccessful();
    }

    @Override // v0.g
    public void x(String str, Object[] objArr) throws SQLException {
        this.f31930a.execSQL(str, objArr);
    }

    @Override // v0.g
    public boolean x0() {
        return this.f31930a.inTransaction();
    }

    @Override // v0.g
    public void y() {
        this.f31930a.beginTransactionNonExclusive();
    }
}
