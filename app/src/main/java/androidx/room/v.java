package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
/* compiled from: InvalidationTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v {

    /* renamed from: o  reason: collision with root package name */
    private static final String[] f4301o = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b  reason: collision with root package name */
    final String[] f4303b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Set<String>> f4304c;

    /* renamed from: e  reason: collision with root package name */
    final q0 f4306e;

    /* renamed from: h  reason: collision with root package name */
    volatile v0.k f4309h;

    /* renamed from: i  reason: collision with root package name */
    private final b f4310i;

    /* renamed from: j  reason: collision with root package name */
    private final t f4311j;

    /* renamed from: l  reason: collision with root package name */
    private w f4313l;

    /* renamed from: d  reason: collision with root package name */
    androidx.room.a f4305d = null;

    /* renamed from: f  reason: collision with root package name */
    AtomicBoolean f4307f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f4308g = false;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: k  reason: collision with root package name */
    final l.b<c, d> f4312k = new l.b<>();

    /* renamed from: m  reason: collision with root package name */
    private final Object f4314m = new Object();

    /* renamed from: n  reason: collision with root package name */
    Runnable f4315n = new a();

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, Integer> f4302a = new HashMap<>();

    /* compiled from: InvalidationTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        private Set<Integer> b() {
            HashSet hashSet = new HashSet();
            Cursor query = v.this.f4306e.query(new v0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (query.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(query.getInt(0)));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            if (!hashSet.isEmpty()) {
                v.this.f4309h.n();
            }
            return hashSet;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
            if (r0 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
            r0.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
            if (r0 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
            if (r1 == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
            if (r1.isEmpty() != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
            r0 = r5.f4316a.f4312k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
            r2 = r5.f4316a.f4312k.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
            if (r2.hasNext() == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
            r2.next().getValue().a(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                androidx.room.v r0 = androidx.room.v.this
                androidx.room.q0 r0 = r0.f4306e
                java.util.concurrent.locks.Lock r0 = r0.getCloseLock()
                r0.lock()
                r1 = 0
                androidx.room.v r2 = androidx.room.v.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 != 0) goto L21
                r0.unlock()
                androidx.room.v r0 = androidx.room.v.this
                androidx.room.a r0 = r0.f4305d
                if (r0 == 0) goto L20
                r0.b()
            L20:
                return
            L21:
                androidx.room.v r2 = androidx.room.v.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f4307f     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 != 0) goto L3a
                r0.unlock()
                androidx.room.v r0 = androidx.room.v.this
                androidx.room.a r0 = r0.f4305d
                if (r0 == 0) goto L39
                r0.b()
            L39:
                return
            L3a:
                androidx.room.v r2 = androidx.room.v.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                androidx.room.q0 r2 = r2.f4306e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r2 = r2.inTransaction()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 == 0) goto L51
                r0.unlock()
                androidx.room.v r0 = androidx.room.v.this
                androidx.room.a r0 = r0.f4305d
                if (r0 == 0) goto L50
                r0.b()
            L50:
                return
            L51:
                androidx.room.v r2 = androidx.room.v.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                androidx.room.q0 r2 = r2.f4306e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                v0.h r2 = r2.getOpenHelper()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                v0.g r2 = r2.q0()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r2.y()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.Set r1 = r5.b()     // Catch: java.lang.Throwable -> L77
                r2.v()     // Catch: java.lang.Throwable -> L77
                r2.D()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r0.unlock()
                androidx.room.v r0 = androidx.room.v.this
                androidx.room.a r0 = r0.f4305d
                if (r0 == 0) goto L92
            L73:
                r0.b()
                goto L92
            L77:
                r3 = move-exception
                r2.D()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                throw r3     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
            L7c:
                r1 = move-exception
                goto Lc3
            L7e:
                r2 = move-exception
                goto L81
            L80:
                r2 = move-exception
            L81:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L7c
                r0.unlock()
                androidx.room.v r0 = androidx.room.v.this
                androidx.room.a r0 = r0.f4305d
                if (r0 == 0) goto L92
                goto L73
            L92:
                if (r1 == 0) goto Lc2
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto Lc2
                androidx.room.v r0 = androidx.room.v.this
                l.b<androidx.room.v$c, androidx.room.v$d> r0 = r0.f4312k
                monitor-enter(r0)
                androidx.room.v r2 = androidx.room.v.this     // Catch: java.lang.Throwable -> Lbf
                l.b<androidx.room.v$c, androidx.room.v$d> r2 = r2.f4312k     // Catch: java.lang.Throwable -> Lbf
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lbf
            La7:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lbf
                if (r3 == 0) goto Lbd
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lbf
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lbf
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lbf
                androidx.room.v$d r3 = (androidx.room.v.d) r3     // Catch: java.lang.Throwable -> Lbf
                r3.a(r1)     // Catch: java.lang.Throwable -> Lbf
                goto La7
            Lbd:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                goto Lc2
            Lbf:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                throw r1
            Lc2:
                return
            Lc3:
                r0.unlock()
                androidx.room.v r0 = androidx.room.v.this
                androidx.room.a r0 = r0.f4305d
                if (r0 == 0) goto Lcf
                r0.b()
            Lcf:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.v.a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InvalidationTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final long[] f4317a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f4318b;

        /* renamed from: c  reason: collision with root package name */
        final int[] f4319c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4320d;

        b(int i10) {
            long[] jArr = new long[i10];
            this.f4317a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f4318b = zArr;
            this.f4319c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                if (this.f4320d) {
                    int length = this.f4317a.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        int i11 = 1;
                        boolean z10 = this.f4317a[i10] > 0;
                        boolean[] zArr = this.f4318b;
                        if (z10 != zArr[i10]) {
                            int[] iArr = this.f4319c;
                            if (!z10) {
                                i11 = 2;
                            }
                            iArr[i10] = i11;
                        } else {
                            this.f4319c[i10] = 0;
                        }
                        zArr[i10] = z10;
                    }
                    this.f4320d = false;
                    return (int[]) this.f4319c.clone();
                }
                return null;
            }
        }

        boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f4317a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.f4320d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f4317a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.f4320d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        void d() {
            synchronized (this) {
                Arrays.fill(this.f4318b, false);
                this.f4320d = true;
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String[] f4321a;

        public c(String[] strArr) {
            this.f4321a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InvalidationTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final int[] f4322a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f4323b;

        /* renamed from: c  reason: collision with root package name */
        final c f4324c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<String> f4325d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f4324c = cVar;
            this.f4322a = iArr;
            this.f4323b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f4325d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f4325d = null;
        }

        void a(Set<Integer> set) {
            int length = this.f4322a.length;
            Set<String> set2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f4322a[i10]))) {
                    if (length == 1) {
                        set2 = this.f4325d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f4323b[i10]);
                    }
                }
            }
            if (set2 != null) {
                this.f4324c.b(set2);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f4323b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    } else if (strArr[i10].equalsIgnoreCase(this.f4323b[0])) {
                        set = this.f4325d;
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f4323b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            String str2 = strArr2[i11];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i11++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f4324c.b(set);
            }
        }
    }

    public v(q0 q0Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4306e = q0Var;
        this.f4310i = new b(strArr.length);
        this.f4304c = map2;
        this.f4311j = new t(q0Var);
        int length = strArr.length;
        this.f4303b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4302a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f4303b[i10] = str2.toLowerCase(locale);
            } else {
                this.f4303b[i10] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.f4302a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f4302a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private static void c(v0.g gVar) {
        if (Build.VERSION.SDK_INT >= 16 && gVar.A0()) {
            gVar.y();
        } else {
            gVar.g();
        }
    }

    private String[] j(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4304c.containsKey(lowerCase)) {
                hashSet.addAll(this.f4304c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void m(v0.g gVar, int i10) {
        String[] strArr;
        gVar.m("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f4303b[i10];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4301o) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i10);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            gVar.m(sb.toString());
        }
    }

    private void o(v0.g gVar, int i10) {
        String[] strArr;
        String str = this.f4303b[i10];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4301o) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            gVar.m(sb.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d f10;
        String[] j10 = j(cVar.f4321a);
        int[] iArr = new int[j10.length];
        int length = j10.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = this.f4302a.get(j10[i10].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i10] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name " + j10[i10]);
            }
        }
        d dVar = new d(cVar, iArr, j10);
        synchronized (this.f4312k) {
            f10 = this.f4312k.f(cVar, dVar);
        }
        if (f10 == null && this.f4310i.b(iArr)) {
            p();
        }
    }

    boolean d() {
        if (this.f4306e.isOpen()) {
            if (!this.f4308g) {
                this.f4306e.getOpenHelper().q0();
            }
            if (this.f4308g) {
                return true;
            }
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(v0.g gVar) {
        synchronized (this) {
            if (this.f4308g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.m("PRAGMA temp_store = MEMORY;");
            gVar.m("PRAGMA recursive_triggers='ON';");
            gVar.m("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            q(gVar);
            this.f4309h = gVar.f0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f4308g = true;
        }
    }

    public void f(String... strArr) {
        synchronized (this.f4312k) {
            Iterator<Map.Entry<c, d>> it = this.f4312k.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        synchronized (this) {
            this.f4308g = false;
            this.f4310i.d();
        }
    }

    public void h() {
        if (this.f4307f.compareAndSet(false, true)) {
            androidx.room.a aVar = this.f4305d;
            if (aVar != null) {
                aVar.e();
            }
            this.f4306e.getQueryExecutor().execute(this.f4315n);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void i(c cVar) {
        d g10;
        synchronized (this.f4312k) {
            g10 = this.f4312k.g(cVar);
        }
        if (g10 == null || !this.f4310i.c(g10.f4322a)) {
            return;
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(androidx.room.a aVar) {
        this.f4305d = aVar;
        aVar.h(new Runnable() { // from class: androidx.room.u
            @Override // java.lang.Runnable
            public final void run() {
                v.this.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Context context, String str, Intent intent) {
        this.f4313l = new w(context, str, intent, this, this.f4306e.getQueryExecutor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        w wVar = this.f4313l;
        if (wVar != null) {
            wVar.a();
            this.f4313l = null;
        }
    }

    void p() {
        if (this.f4306e.isOpen()) {
            q(this.f4306e.getOpenHelper().q0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(v0.g gVar) {
        if (gVar.x0()) {
            return;
        }
        try {
            Lock closeLock = this.f4306e.getCloseLock();
            closeLock.lock();
            try {
                synchronized (this.f4314m) {
                    int[] a10 = this.f4310i.a();
                    if (a10 == null) {
                        return;
                    }
                    int length = a10.length;
                    c(gVar);
                    for (int i10 = 0; i10 < length; i10++) {
                        int i11 = a10[i10];
                        if (i11 == 1) {
                            m(gVar, i10);
                        } else if (i11 == 2) {
                            o(gVar, i10);
                        }
                    }
                    gVar.v();
                    gVar.D();
                }
            } finally {
                closeLock.unlock();
            }
        } catch (SQLiteException | IllegalStateException e8) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
        }
    }
}
