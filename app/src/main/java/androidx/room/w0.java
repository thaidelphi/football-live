package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SharedSQLiteStatement.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class w0 {
    private final q0 mDatabase;
    private final AtomicBoolean mLock = new AtomicBoolean(false);
    private volatile v0.k mStmt;

    public w0(q0 q0Var) {
        this.mDatabase = q0Var;
    }

    private v0.k createNewStatement() {
        return this.mDatabase.compileStatement(createQuery());
    }

    private v0.k getStmt(boolean z10) {
        if (z10) {
            if (this.mStmt == null) {
                this.mStmt = createNewStatement();
            }
            return this.mStmt;
        }
        return createNewStatement();
    }

    public v0.k acquire() {
        assertNotMainThread();
        return getStmt(this.mLock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.mDatabase.assertNotMainThread();
    }

    protected abstract String createQuery();

    public void release(v0.k kVar) {
        if (kVar == this.mStmt) {
            this.mLock.set(false);
        }
    }
}
