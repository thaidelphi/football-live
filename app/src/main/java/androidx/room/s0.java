package androidx.room;

import android.database.Cursor;
import java.util.List;
import v0.h;
/* compiled from: RoomOpenHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s0 extends h.a {

    /* renamed from: b  reason: collision with root package name */
    private n f4275b;

    /* renamed from: c  reason: collision with root package name */
    private final a f4276c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4277d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4278e;

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a {
        public final int version;

        public a(int i10) {
            this.version = i10;
        }

        protected abstract void createAllTables(v0.g gVar);

        protected abstract void dropAllTables(v0.g gVar);

        protected abstract void onCreate(v0.g gVar);

        protected abstract void onOpen(v0.g gVar);

        protected void onPostMigrate(v0.g gVar) {
        }

        protected void onPreMigrate(v0.g gVar) {
        }

        protected b onValidateSchema(v0.g gVar) {
            validateMigration(gVar);
            return new b(true, null);
        }

        @Deprecated
        protected void validateMigration(v0.g gVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4279a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4280b;

        public b(boolean z10, String str) {
            this.f4279a = z10;
            this.f4280b = str;
        }
    }

    public s0(n nVar, a aVar, String str, String str2) {
        super(aVar.version);
        this.f4275b = nVar;
        this.f4276c = aVar;
        this.f4277d = str;
        this.f4278e = str2;
    }

    private void h(v0.g gVar) {
        if (k(gVar)) {
            Cursor q10 = gVar.q(new v0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                String string = q10.moveToFirst() ? q10.getString(0) : null;
                q10.close();
                if (!this.f4277d.equals(string) && !this.f4278e.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
                return;
            } catch (Throwable th) {
                q10.close();
                throw th;
            }
        }
        b onValidateSchema = this.f4276c.onValidateSchema(gVar);
        if (onValidateSchema.f4279a) {
            this.f4276c.onPostMigrate(gVar);
            l(gVar);
            return;
        }
        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f4280b);
    }

    private void i(v0.g gVar) {
        gVar.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(v0.g gVar) {
        Cursor r02 = gVar.r0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (r02.moveToFirst()) {
                if (r02.getInt(0) == 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            r02.close();
        }
    }

    private static boolean k(v0.g gVar) {
        Cursor r02 = gVar.r0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (r02.moveToFirst()) {
                if (r02.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            r02.close();
        }
    }

    private void l(v0.g gVar) {
        i(gVar);
        gVar.m(r0.a(this.f4277d));
    }

    @Override // v0.h.a
    public void b(v0.g gVar) {
        super.b(gVar);
    }

    @Override // v0.h.a
    public void d(v0.g gVar) {
        boolean j10 = j(gVar);
        this.f4276c.createAllTables(gVar);
        if (!j10) {
            b onValidateSchema = this.f4276c.onValidateSchema(gVar);
            if (!onValidateSchema.f4279a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f4280b);
            }
        }
        l(gVar);
        this.f4276c.onCreate(gVar);
    }

    @Override // v0.h.a
    public void e(v0.g gVar, int i10, int i11) {
        g(gVar, i10, i11);
    }

    @Override // v0.h.a
    public void f(v0.g gVar) {
        super.f(gVar);
        h(gVar);
        this.f4276c.onOpen(gVar);
        this.f4275b = null;
    }

    @Override // v0.h.a
    public void g(v0.g gVar, int i10, int i11) {
        boolean z10;
        List<s0.b> c10;
        n nVar = this.f4275b;
        if (nVar == null || (c10 = nVar.f4219d.c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f4276c.onPreMigrate(gVar);
            for (s0.b bVar : c10) {
                bVar.a(gVar);
            }
            b onValidateSchema = this.f4276c.onValidateSchema(gVar);
            if (onValidateSchema.f4279a) {
                this.f4276c.onPostMigrate(gVar);
                l(gVar);
                z10 = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f4280b);
            }
        }
        if (z10) {
            return;
        }
        n nVar2 = this.f4275b;
        if (nVar2 != null && !nVar2.a(i10, i11)) {
            this.f4276c.dropAllTables(gVar);
            this.f4276c.createAllTables(gVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
