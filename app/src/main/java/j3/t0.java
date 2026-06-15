package j3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SchemaManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t0 extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    private static final String f26915c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d  reason: collision with root package name */
    static int f26916d = 5;

    /* renamed from: e  reason: collision with root package name */
    private static final a f26917e;

    /* renamed from: f  reason: collision with root package name */
    private static final a f26918f;

    /* renamed from: g  reason: collision with root package name */
    private static final a f26919g;

    /* renamed from: h  reason: collision with root package name */
    private static final a f26920h;

    /* renamed from: i  reason: collision with root package name */
    private static final a f26921i;

    /* renamed from: j  reason: collision with root package name */
    private static final List<a> f26922j;

    /* renamed from: a  reason: collision with root package name */
    private final int f26923a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f26924b;

    /* compiled from: SchemaManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        r0 r0Var = new a() { // from class: j3.r0
            @Override // j3.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.w(sQLiteDatabase);
            }
        };
        f26917e = r0Var;
        o0 o0Var = new a() { // from class: j3.o0
            @Override // j3.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.z(sQLiteDatabase);
            }
        };
        f26918f = o0Var;
        p0 p0Var = new a() { // from class: j3.p0
            @Override // j3.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f26919g = p0Var;
        q0 q0Var = new a() { // from class: j3.q0
            @Override // j3.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.F(sQLiteDatabase);
            }
        };
        f26920h = q0Var;
        s0 s0Var = new a() { // from class: j3.s0
            @Override // j3.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.G(sQLiteDatabase);
            }
        };
        f26921i = s0Var;
        f26922j = Arrays.asList(r0Var, o0Var, p0Var, q0Var, s0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f26924b = false;
        this.f26923a = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f26915c);
    }

    private void J(SQLiteDatabase sQLiteDatabase, int i10) {
        t(sQLiteDatabase);
        K(sQLiteDatabase, 0, i10);
    }

    private void K(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f26922j;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f26922j.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void t(SQLiteDatabase sQLiteDatabase) {
        if (this.f26924b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f26924b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        J(sQLiteDatabase, this.f26923a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        J(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        t(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        t(sQLiteDatabase);
        K(sQLiteDatabase, i10, i11);
    }
}
