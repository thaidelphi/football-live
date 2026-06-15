package j3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b3.i;
import com.ironsource.b9;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import e3.a;
import e3.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k3.b;
/* compiled from: SQLiteEventStore.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m0 implements j3.d, k3.b, j3.c {

    /* renamed from: f  reason: collision with root package name */
    private static final z2.b f26881f = z2.b.b("proto");

    /* renamed from: a  reason: collision with root package name */
    private final t0 f26882a;

    /* renamed from: b  reason: collision with root package name */
    private final l3.a f26883b;

    /* renamed from: c  reason: collision with root package name */
    private final l3.a f26884c;

    /* renamed from: d  reason: collision with root package name */
    private final e f26885d;

    /* renamed from: e  reason: collision with root package name */
    private final h8.a<String> f26886e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SQLiteEventStore.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b<T, U> {
        U apply(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SQLiteEventStore.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f26887a;

        /* renamed from: b  reason: collision with root package name */
        final String f26888b;

        private c(String str, String str2) {
            this.f26887a = str;
            this.f26888b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SQLiteEventStore.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(l3.a aVar, l3.a aVar2, e eVar, t0 t0Var, h8.a<String> aVar3) {
        this.f26882a = t0Var;
        this.f26883b = aVar;
        this.f26884c = aVar2;
        this.f26885d = eVar;
        this.f26886e = aVar3;
    }

    private void A1(a.C0271a c0271a, Map<String, List<e3.c>> map) {
        for (Map.Entry<String, List<e3.c>> entry : map.entrySet()) {
            c0271a.a(e3.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] B1(long j10) {
        return (byte[]) F1(P0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: j3.s
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                byte[] q12;
                q12 = m0.q1((Cursor) obj);
                return q12;
            }
        });
    }

    private <T> T C1(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f26884c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e8) {
                if (this.f26884c.a() >= this.f26885d.b() + a10) {
                    return bVar.apply(e8);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static z2.b D1(String str) {
        if (str == null) {
            return f26881f;
        }
        return z2.b.b(str);
    }

    private static String E1(Iterable<k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static <T> T F1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private c.b L0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        f3.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void M0(final SQLiteDatabase sQLiteDatabase) {
        C1(new d() { // from class: j3.c0
            @Override // j3.m0.d
            public final Object a() {
                Object a12;
                a12 = m0.a1(sQLiteDatabase);
                return a12;
            }
        }, new b() { // from class: j3.b0
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Object b12;
                b12 = m0.b1((Throwable) obj);
                return b12;
            }
        });
    }

    private long N0(SQLiteDatabase sQLiteDatabase, b3.o oVar) {
        Long U0 = U0(sQLiteDatabase, oVar);
        if (U0 != null) {
            return U0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(m3.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private e3.b Q0() {
        return e3.b.b().b(e3.e.c().b(O0()).c(e.f26858a.f()).a()).a();
    }

    private long R0() {
        return P0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long S0() {
        return P0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private e3.f T0() {
        final long a10 = this.f26883b.a();
        return (e3.f) V0(new b() { // from class: j3.w
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                e3.f f12;
                f12 = m0.f1(a10, (SQLiteDatabase) obj);
                return f12;
            }
        });
    }

    private Long U0(SQLiteDatabase sQLiteDatabase, b3.o oVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(m3.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) F1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: j3.v
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Long g12;
                g12 = m0.g1((Cursor) obj);
                return g12;
            }
        });
    }

    private boolean W0() {
        return R0() * S0() >= this.f26885d.f();
    }

    private List<k> X0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a l10 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l10.c(cVar.f26887a, cVar.f26888b);
                }
                listIterator.set(k.a(next.c(), next.d(), l10.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object Y0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            b(i10, c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer Z0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        F1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: j3.f0
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Object Y0;
                Y0 = m0.this.Y0((Cursor) obj);
                return Y0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object a1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b1(Throwable th) {
        throw new k3.a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase c1(Throwable th) {
        throw new k3.a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long d1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e3.f e1(long j10, Cursor cursor) {
        cursor.moveToNext();
        return e3.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e3.f f1(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (e3.f) F1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: j3.l
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                e3.f e12;
                e12 = m0.e1(j10, (Cursor) obj);
                return e12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long g1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean h1(b3.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long U0 = U0(sQLiteDatabase, oVar);
        if (U0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) F1(P0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{U0.toString()}), new b() { // from class: j3.y
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List i1(SQLiteDatabase sQLiteDatabase) {
        return (List) F1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: j3.t
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                List j12;
                j12 = m0.j1((Cursor) obj);
                return j12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List j1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(b3.o.a().b(cursor.getString(1)).d(m3.a.b(cursor.getInt(2))).c(z1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List k1(b3.o oVar, SQLiteDatabase sQLiteDatabase) {
        z2.d[] values;
        List<k> x12 = x1(sQLiteDatabase, oVar, this.f26885d.d());
        for (z2.d dVar : z2.d.values()) {
            if (dVar != oVar.d()) {
                int d10 = this.f26885d.d() - x12.size();
                if (d10 <= 0) {
                    break;
                }
                x12.addAll(x1(sQLiteDatabase, oVar.f(dVar), d10));
            }
        }
        return X0(x12, y1(sQLiteDatabase, x12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ e3.a l1(Map map, a.C0271a c0271a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b L0 = L0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(e3.c.c().c(L0).b(j10).a());
        }
        A1(c0271a, map);
        c0271a.e(T0());
        c0271a.d(Q0());
        c0271a.c(this.f26886e.get());
        return c0271a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ e3.a m1(String str, final Map map, final a.C0271a c0271a, SQLiteDatabase sQLiteDatabase) {
        return (e3.a) F1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: j3.p
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                e3.a l12;
                l12 = m0.this.l1(map, c0271a, (Cursor) obj);
                return l12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n1(List list, b3.o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a k10 = b3.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                k10.h(new b3.h(D1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k10.h(new b3.h(D1(cursor.getString(4)), B1(j10)));
            }
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, oVar, k10.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object o1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long p1(b3.i iVar, b3.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (W0()) {
            b(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long N0 = N0(sQLiteDatabase, oVar);
        int e8 = this.f26885d.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e8;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(N0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(a10.length / e8);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e8, Math.min(i10 * e8, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put(b9.h.X, entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] q1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            b(i10, c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        F1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: j3.g0
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Object r12;
                r12 = m0.this.r1((Cursor) obj);
                return r12;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean t1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object u1(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) F1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: j3.x
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Boolean t12;
                t12 = m0.t1((Cursor) obj);
                return t12;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object v1(long j10, b3.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(m3.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(m3.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object w1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f26883b.a()).execute();
        return null;
    }

    private List<k> x1(SQLiteDatabase sQLiteDatabase, final b3.o oVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long U0 = U0(sQLiteDatabase, oVar);
        if (U0 == null) {
            return arrayList;
        }
        F1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{U0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: j3.o
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Object n12;
                n12 = m0.this.n1(arrayList, oVar, (Cursor) obj);
                return n12;
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> y1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        F1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", b9.h.X}, sb.toString(), null, null, null, null), new b() { // from class: j3.r
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Object o12;
                o12 = m0.o1(hashMap, (Cursor) obj);
                return o12;
            }
        });
        return hashMap;
    }

    private static byte[] z1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Override // j3.d
    public k C(final b3.o oVar, final b3.i iVar) {
        f3.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) V0(new b() { // from class: j3.j0
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Long p12;
                p12 = m0.this.p1(iVar, oVar, (SQLiteDatabase) obj);
                return p12;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, oVar, iVar);
    }

    long O0() {
        return R0() * S0();
    }

    SQLiteDatabase P0() {
        final t0 t0Var = this.f26882a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) C1(new d() { // from class: j3.d0
            @Override // j3.m0.d
            public final Object a() {
                return t0.this.getWritableDatabase();
            }
        }, new b() { // from class: j3.a0
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                SQLiteDatabase c12;
                c12 = m0.c1((Throwable) obj);
                return c12;
            }
        });
    }

    @Override // j3.d
    public Iterable<k> Q(final b3.o oVar) {
        return (Iterable) V0(new b() { // from class: j3.k0
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                List k12;
                k12 = m0.this.k1(oVar, (SQLiteDatabase) obj);
                return k12;
            }
        });
    }

    @Override // j3.d
    public boolean U(final b3.o oVar) {
        return ((Boolean) V0(new b() { // from class: j3.l0
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Boolean h12;
                h12 = m0.this.h1(oVar, (SQLiteDatabase) obj);
                return h12;
            }
        })).booleanValue();
    }

    @Override // j3.d
    public void V(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + E1(iterable);
            V0(new b() { // from class: j3.m
                @Override // j3.m0.b
                public final Object apply(Object obj) {
                    Object s12;
                    s12 = m0.this.s1(str, r3, (SQLiteDatabase) obj);
                    return s12;
                }
            });
        }
    }

    <T> T V0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase P0 = P0();
        P0.beginTransaction();
        try {
            T apply = bVar.apply(P0);
            P0.setTransactionSuccessful();
            return apply;
        } finally {
            P0.endTransaction();
        }
    }

    @Override // j3.c
    public void a() {
        V0(new b() { // from class: j3.h0
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Object w12;
                w12 = m0.this.w1((SQLiteDatabase) obj);
                return w12;
            }
        });
    }

    @Override // j3.c
    public void b(final long j10, final c.b bVar, final String str) {
        V0(new b() { // from class: j3.q
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Object u12;
                u12 = m0.u1(str, bVar, j10, (SQLiteDatabase) obj);
                return u12;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26882a.close();
    }

    @Override // j3.c
    public e3.a f() {
        final a.C0271a e8 = e3.a.e();
        final HashMap hashMap = new HashMap();
        return (e3.a) V0(new b() { // from class: j3.n
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                e3.a m12;
                m12 = m0.this.m1(r2, hashMap, e8, (SQLiteDatabase) obj);
                return m12;
            }
        });
    }

    @Override // j3.d
    public long g0(b3.o oVar) {
        return ((Long) F1(P0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(m3.a.a(oVar.d()))}), new b() { // from class: j3.u
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Long d12;
                d12 = m0.d1((Cursor) obj);
                return d12;
            }
        })).longValue();
    }

    @Override // j3.d
    public int h() {
        final long a10 = this.f26883b.a() - this.f26885d.c();
        return ((Integer) V0(new b() { // from class: j3.i0
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Integer Z0;
                Z0 = m0.this.Z0(a10, (SQLiteDatabase) obj);
                return Z0;
            }
        })).intValue();
    }

    @Override // j3.d
    public void i(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            P0().compileStatement("DELETE FROM events WHERE _id in " + E1(iterable)).execute();
        }
    }

    @Override // k3.b
    public <T> T j(b.a<T> aVar) {
        SQLiteDatabase P0 = P0();
        M0(P0);
        try {
            T b10 = aVar.b();
            P0.setTransactionSuccessful();
            return b10;
        } finally {
            P0.endTransaction();
        }
    }

    @Override // j3.d
    public void k0(final b3.o oVar, final long j10) {
        V0(new b() { // from class: j3.e0
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                Object v12;
                v12 = m0.v1(j10, oVar, (SQLiteDatabase) obj);
                return v12;
            }
        });
    }

    @Override // j3.d
    public Iterable<b3.o> r() {
        return (Iterable) V0(new b() { // from class: j3.z
            @Override // j3.m0.b
            public final Object apply(Object obj) {
                List i12;
                i12 = m0.i1((SQLiteDatabase) obj);
                return i12;
            }
        });
    }
}
