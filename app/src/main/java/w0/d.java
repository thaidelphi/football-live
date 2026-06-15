package w0;

import android.database.sqlite.SQLiteProgram;
import v0.i;
/* compiled from: FrameworkSQLiteProgram.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class d implements i {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteProgram f31947a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(SQLiteProgram sQLiteProgram) {
        this.f31947a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31947a.close();
    }

    @Override // v0.i
    public void d0(int i10, String str) {
        this.f31947a.bindString(i10, str);
    }

    @Override // v0.i
    public void m0(int i10, long j10) {
        this.f31947a.bindLong(i10, j10);
    }

    @Override // v0.i
    public void p(int i10, double d10) {
        this.f31947a.bindDouble(i10, d10);
    }

    @Override // v0.i
    public void p0(int i10, byte[] bArr) {
        this.f31947a.bindBlob(i10, bArr);
    }

    @Override // v0.i
    public void v0(int i10) {
        this.f31947a.bindNull(i10);
    }
}
