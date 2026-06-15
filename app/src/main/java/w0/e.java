package w0;

import android.database.sqlite.SQLiteStatement;
import v0.k;
/* compiled from: FrameworkSQLiteStatement.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class e extends d implements k {

    /* renamed from: b  reason: collision with root package name */
    private final SQLiteStatement f31948b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f31948b = sQLiteStatement;
    }

    @Override // v0.k
    public long a0() {
        return this.f31948b.executeInsert();
    }

    @Override // v0.k
    public int n() {
        return this.f31948b.executeUpdateDelete();
    }
}
