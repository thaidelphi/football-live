package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v0.h;
/* compiled from: RoomDatabase.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class q0 {
    private static final String DB_IMPL_SUFFIX = "_Impl";
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;
    private androidx.room.a mAutoCloser;
    @Deprecated
    protected List<b> mCallbacks;
    @Deprecated
    protected volatile v0.g mDatabase;
    private v0.h mOpenHelper;
    private Executor mQueryExecutor;
    private Executor mTransactionExecutor;
    boolean mWriteAheadLoggingEnabled;
    private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    private final Map<String, Object> mBackingFieldMap = Collections.synchronizedMap(new HashMap());
    private final v mInvalidationTracker = createInvalidationTracker();
    private final Map<Class<?>, Object> mTypeConverters = new HashMap();
    protected Map<Class<? extends s0.a>, s0.a> mAutoMigrationSpecs = new HashMap();

    /* compiled from: RoomDatabase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a<T extends q0> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f4240a;

        /* renamed from: b  reason: collision with root package name */
        private final String f4241b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f4242c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<b> f4243d;

        /* renamed from: e  reason: collision with root package name */
        private e f4244e;

        /* renamed from: f  reason: collision with root package name */
        private f f4245f;

        /* renamed from: g  reason: collision with root package name */
        private Executor f4246g;

        /* renamed from: h  reason: collision with root package name */
        private List<Object> f4247h;

        /* renamed from: i  reason: collision with root package name */
        private List<s0.a> f4248i;

        /* renamed from: j  reason: collision with root package name */
        private Executor f4249j;

        /* renamed from: k  reason: collision with root package name */
        private Executor f4250k;

        /* renamed from: l  reason: collision with root package name */
        private h.c f4251l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f4252m;

        /* renamed from: o  reason: collision with root package name */
        private Intent f4254o;

        /* renamed from: q  reason: collision with root package name */
        private boolean f4256q;

        /* renamed from: s  reason: collision with root package name */
        private TimeUnit f4258s;

        /* renamed from: u  reason: collision with root package name */
        private Set<Integer> f4260u;

        /* renamed from: v  reason: collision with root package name */
        private Set<Integer> f4261v;

        /* renamed from: w  reason: collision with root package name */
        private String f4262w;

        /* renamed from: x  reason: collision with root package name */
        private File f4263x;

        /* renamed from: y  reason: collision with root package name */
        private Callable<InputStream> f4264y;

        /* renamed from: r  reason: collision with root package name */
        private long f4257r = -1;

        /* renamed from: n  reason: collision with root package name */
        private c f4253n = c.AUTOMATIC;

        /* renamed from: p  reason: collision with root package name */
        private boolean f4255p = true;

        /* renamed from: t  reason: collision with root package name */
        private final d f4259t = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Context context, Class<T> cls, String str) {
            this.f4242c = context;
            this.f4240a = cls;
            this.f4241b = str;
        }

        public a<T> a(b bVar) {
            if (this.f4243d == null) {
                this.f4243d = new ArrayList<>();
            }
            this.f4243d.add(bVar);
            return this;
        }

        public a<T> b(s0.b... bVarArr) {
            if (this.f4261v == null) {
                this.f4261v = new HashSet();
            }
            for (s0.b bVar : bVarArr) {
                this.f4261v.add(Integer.valueOf(bVar.f30594a));
                this.f4261v.add(Integer.valueOf(bVar.f30595b));
            }
            this.f4259t.b(bVarArr);
            return this;
        }

        public a<T> c() {
            this.f4252m = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public T d() {
            Executor executor;
            if (this.f4242c != null) {
                if (this.f4240a != null) {
                    Executor executor2 = this.f4249j;
                    if (executor2 == null && this.f4250k == null) {
                        Executor f10 = k.c.f();
                        this.f4250k = f10;
                        this.f4249j = f10;
                    } else if (executor2 != null && this.f4250k == null) {
                        this.f4250k = executor2;
                    } else if (executor2 == null && (executor = this.f4250k) != null) {
                        this.f4249j = executor;
                    }
                    Set<Integer> set = this.f4261v;
                    if (set != null && this.f4260u != null) {
                        for (Integer num : set) {
                            if (this.f4260u.contains(num)) {
                                throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                            }
                        }
                    }
                    m mVar = this.f4251l;
                    if (mVar == null) {
                        mVar = new w0.c();
                    }
                    long j10 = this.f4257r;
                    if (j10 > 0) {
                        if (this.f4241b != null) {
                            mVar = new m(mVar, new androidx.room.a(j10, this.f4258s, this.f4250k));
                        } else {
                            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                        }
                    }
                    String str = this.f4262w;
                    if (str != null || this.f4263x != null || this.f4264y != null) {
                        if (this.f4241b != null) {
                            int i10 = str == null ? 0 : 1;
                            File file = this.f4263x;
                            int i11 = i10 + (file == null ? 0 : 1);
                            Callable<InputStream> callable = this.f4264y;
                            if (i11 + (callable != null ? 1 : 0) == 1) {
                                mVar = new v0(str, file, callable, mVar);
                            } else {
                                throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                            }
                        } else {
                            throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                        }
                    }
                    f fVar = this.f4245f;
                    i0 i0Var = fVar != null ? new i0(mVar, fVar, this.f4246g) : mVar;
                    Context context = this.f4242c;
                    n nVar = new n(context, this.f4241b, i0Var, this.f4259t, this.f4243d, this.f4252m, this.f4253n.b(context), this.f4249j, this.f4250k, this.f4254o, this.f4255p, this.f4256q, this.f4260u, this.f4262w, this.f4263x, this.f4264y, this.f4244e, this.f4247h, this.f4248i);
                    T t10 = (T) n0.b(this.f4240a, q0.DB_IMPL_SUFFIX);
                    t10.init(nVar);
                    return t10;
                }
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }

        public a<T> e() {
            this.f4255p = false;
            this.f4256q = true;
            return this;
        }

        public a<T> f(h.c cVar) {
            this.f4251l = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f4249j = executor;
            return this;
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class b {
        public void a(v0.g gVar) {
        }

        public void b(v0.g gVar) {
        }

        public void c(v0.g gVar) {
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return v0.c.b(activityManager);
            }
            return false;
        }

        c b(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT >= 16 && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && !a(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private HashMap<Integer, TreeMap<Integer, s0.b>> f4269a = new HashMap<>();

        private void a(s0.b bVar) {
            int i10 = bVar.f30594a;
            int i11 = bVar.f30595b;
            TreeMap<Integer, s0.b> treeMap = this.f4269a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f4269a.put(Integer.valueOf(i10), treeMap);
            }
            s0.b bVar2 = treeMap.get(Integer.valueOf(i11));
            if (bVar2 != null) {
                Log.w("ROOM", "Overriding migration " + bVar2 + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i11), bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.util.List<s0.b> d(java.util.List<s0.b> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L5a
                goto L7
            L5:
                if (r9 <= r10) goto L5a
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, s0.b>> r0 = r6.f4269a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L56
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = r4
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                s0.b r9 = (s0.b) r9
                r7.add(r9)
                r9 = r3
                goto L57
            L56:
                r4 = r5
            L57:
                if (r4 != 0) goto L0
                return r1
            L5a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.q0.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(s0.b... bVarArr) {
            for (s0.b bVar : bVarArr) {
                a(bVar);
            }
        }

        public List<s0.b> c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }

        public Map<Integer, Map<Integer, s0.b>> e() {
            return Collections.unmodifiableMap(this.f4269a);
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class e {
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        void a(String str, List<Object> list);
    }

    private void internalBeginTransaction() {
        assertNotMainThread();
        v0.g q02 = this.mOpenHelper.q0();
        this.mInvalidationTracker.q(q02);
        if (Build.VERSION.SDK_INT >= 16 && q02.A0()) {
            q02.y();
        } else {
            q02.g();
        }
    }

    private void internalEndTransaction() {
        this.mOpenHelper.q0().D();
        if (inTransaction()) {
            return;
        }
        this.mInvalidationTracker.h();
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$beginTransaction$0(v0.g gVar) {
        internalBeginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$endTransaction$1(v0.g gVar) {
        internalEndTransaction();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T unwrapOpenHelper(Class<T> cls, v0.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof o) {
            return (T) unwrapOpenHelper(cls, ((o) hVar).getDelegate());
        }
        return null;
    }

    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        androidx.room.a aVar = this.mAutoCloser;
        if (aVar == null) {
            internalBeginTransaction();
        } else {
            aVar.c(new m.a() { // from class: androidx.room.o0
                @Override // m.a
                public final Object apply(Object obj) {
                    Object lambda$beginTransaction$0;
                    lambda$beginTransaction$0 = q0.this.lambda$beginTransaction$0((v0.g) obj);
                    return lambda$beginTransaction$0;
                }
            });
        }
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            writeLock.lock();
            try {
                this.mInvalidationTracker.n();
                this.mOpenHelper.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public v0.k compileStatement(String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.q0().f0(str);
    }

    protected abstract v createInvalidationTracker();

    protected abstract v0.h createOpenHelper(n nVar);

    @Deprecated
    public void endTransaction() {
        androidx.room.a aVar = this.mAutoCloser;
        if (aVar == null) {
            internalEndTransaction();
        } else {
            aVar.c(new m.a() { // from class: androidx.room.p0
                @Override // m.a
                public final Object apply(Object obj) {
                    Object lambda$endTransaction$1;
                    lambda$endTransaction$1 = q0.this.lambda$endTransaction$1((v0.g) obj);
                    return lambda$endTransaction$1;
                }
            });
        }
    }

    public List<s0.b> getAutoMigrations(Map<Class<? extends s0.a>, s0.a> map) {
        return Collections.emptyList();
    }

    Map<String, Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    public v getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public v0.h getOpenHelper() {
        return this.mOpenHelper;
    }

    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    public Set<Class<? extends s0.a>> getRequiredAutoMigrationSpecs() {
        return Collections.emptySet();
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return Collections.emptyMap();
    }

    ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        return (T) this.mTypeConverters.get(cls);
    }

    public boolean inTransaction() {
        return this.mOpenHelper.q0().x0();
    }

    public void init(n nVar) {
        boolean z10;
        this.mOpenHelper = createOpenHelper(nVar);
        Set<Class<? extends s0.a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends s0.a>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class<? extends s0.a> next = it.next();
                int size = nVar.f4223h.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (next.isAssignableFrom(nVar.f4223h.get(size).getClass())) {
                        bitSet.set(size);
                        i10 = size;
                        break;
                    } else {
                        size--;
                    }
                }
                if (i10 >= 0) {
                    this.mAutoMigrationSpecs.put(next, nVar.f4223h.get(i10));
                } else {
                    throw new IllegalArgumentException("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.");
                }
            } else {
                for (int size2 = nVar.f4223h.size() - 1; size2 >= 0; size2--) {
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                Iterator<s0.b> it2 = getAutoMigrations(this.mAutoMigrationSpecs).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    s0.b next2 = it2.next();
                    if (!nVar.f4219d.e().containsKey(Integer.valueOf(next2.f30594a))) {
                        nVar.f4219d.b(next2);
                    }
                }
                u0 u0Var = (u0) unwrapOpenHelper(u0.class, this.mOpenHelper);
                if (u0Var != null) {
                    u0Var.f(nVar);
                }
                i iVar = (i) unwrapOpenHelper(i.class, this.mOpenHelper);
                if (iVar != null) {
                    androidx.room.a a10 = iVar.a();
                    this.mAutoCloser = a10;
                    this.mInvalidationTracker.k(a10);
                }
                if (Build.VERSION.SDK_INT >= 16) {
                    z10 = nVar.f4225j == c.WRITE_AHEAD_LOGGING;
                    this.mOpenHelper.setWriteAheadLoggingEnabled(z10);
                }
                this.mCallbacks = nVar.f4220e;
                this.mQueryExecutor = nVar.f4226k;
                this.mTransactionExecutor = new x0(nVar.f4227l);
                this.mAllowMainThreadQueries = nVar.f4224i;
                this.mWriteAheadLoggingEnabled = z10;
                Intent intent = nVar.f4229n;
                if (intent != null) {
                    this.mInvalidationTracker.l(nVar.f4217b, nVar.f4218c, intent);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = nVar.f4222g.size() - 1;
                        while (true) {
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            } else if (cls.isAssignableFrom(nVar.f4222g.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                size3--;
                            }
                        }
                        if (size3 >= 0) {
                            this.mTypeConverters.put(cls, nVar.f4222g.get(size3));
                        } else {
                            throw new IllegalArgumentException("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                        }
                    }
                }
                for (int size4 = nVar.f4222g.size() - 1; size4 >= 0; size4--) {
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + nVar.f4222g.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void internalInitInvalidationTracker(v0.g gVar) {
        this.mInvalidationTracker.e(gVar);
    }

    public boolean isOpen() {
        androidx.room.a aVar = this.mAutoCloser;
        if (aVar != null) {
            return aVar.g();
        }
        v0.g gVar = this.mDatabase;
        return gVar != null && gVar.isOpen();
    }

    public Cursor query(String str, Object[] objArr) {
        return this.mOpenHelper.q0().q(new v0.a(str, objArr));
    }

    public void runInTransaction(Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.q0().v();
    }

    public Cursor query(v0.j jVar) {
        return query(jVar, (CancellationSignal) null);
    }

    public Cursor query(v0.j jVar, CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null && Build.VERSION.SDK_INT >= 16) {
            return this.mOpenHelper.q0().W(jVar, cancellationSignal);
        }
        return this.mOpenHelper.q0().q(jVar);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        beginTransaction();
        try {
            try {
                V call = callable.call();
                setTransactionSuccessful();
                endTransaction();
                return call;
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception e10) {
                t0.e.a(e10);
                endTransaction();
                return null;
            }
        } catch (Throwable th) {
            endTransaction();
            throw th;
        }
    }
}
