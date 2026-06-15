package z1;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: LruArrayPool.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j implements z1.b {

    /* renamed from: a  reason: collision with root package name */
    private final h<a, Object> f33431a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    private final b f33432b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f33433c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, z1.a<?>> f33434d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final int f33435e;

    /* renamed from: f  reason: collision with root package name */
    private int f33436f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LruArrayPool.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final b f33437a;

        /* renamed from: b  reason: collision with root package name */
        int f33438b;

        /* renamed from: c  reason: collision with root package name */
        private Class<?> f33439c;

        a(b bVar) {
            this.f33437a = bVar;
        }

        @Override // z1.m
        public void a() {
            this.f33437a.c(this);
        }

        void b(int i10, Class<?> cls) {
            this.f33438b = i10;
            this.f33439c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f33438b == aVar.f33438b && this.f33439c == aVar.f33439c;
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f33438b * 31;
            Class<?> cls = this.f33439c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f33438b + "array=" + this.f33439c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // z1.d
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class<?> cls) {
            a b10 = b();
            b10.b(i10, cls);
            return b10;
        }
    }

    public j(int i10) {
        this.f33435e = i10;
    }

    private void e(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> l10 = l(cls);
        Integer num = (Integer) l10.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                l10.remove(Integer.valueOf(i10));
                return;
            } else {
                l10.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void f() {
        g(this.f33435e);
    }

    private void g(int i10) {
        while (this.f33436f > i10) {
            Object f10 = this.f33431a.f();
            s2.j.d(f10);
            z1.a h10 = h(f10);
            this.f33436f -= h10.c(f10) * h10.b();
            e(h10.c(f10), f10.getClass());
            if (Log.isLoggable(h10.a(), 2)) {
                Log.v(h10.a(), "evicted: " + h10.c(f10));
            }
        }
    }

    private <T> z1.a<T> h(T t10) {
        return i(t10.getClass());
    }

    private <T> z1.a<T> i(Class<T> cls) {
        i iVar = (z1.a<T>) this.f33434d.get(cls);
        if (iVar == null) {
            if (cls.equals(int[].class)) {
                iVar = new i();
            } else if (cls.equals(byte[].class)) {
                iVar = new g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f33434d.put(cls, iVar);
        }
        return iVar;
    }

    private <T> T j(a aVar) {
        return (T) this.f33431a.a(aVar);
    }

    private <T> T k(a aVar, Class<T> cls) {
        z1.a<T> i10 = i(cls);
        T t10 = (T) j(aVar);
        if (t10 != null) {
            this.f33436f -= i10.c(t10) * i10.b();
            e(i10.c(t10), cls);
        }
        if (t10 == null) {
            if (Log.isLoggable(i10.a(), 2)) {
                Log.v(i10.a(), "Allocated " + aVar.f33438b + " bytes");
            }
            return i10.newArray(aVar.f33438b);
        }
        return t10;
    }

    private NavigableMap<Integer, Integer> l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f33433c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f33433c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    private boolean m() {
        int i10 = this.f33436f;
        return i10 == 0 || this.f33435e / i10 >= 2;
    }

    private boolean n(int i10) {
        return i10 <= this.f33435e / 2;
    }

    private boolean o(int i10, Integer num) {
        return num != null && (m() || num.intValue() <= i10 * 8);
    }

    @Override // z1.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                g(this.f33435e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // z1.b
    public synchronized void b() {
        g(0);
    }

    @Override // z1.b
    public synchronized <T> T c(int i10, Class<T> cls) {
        a e8;
        Integer ceilingKey = l(cls).ceilingKey(Integer.valueOf(i10));
        if (o(i10, ceilingKey)) {
            e8 = this.f33432b.e(ceilingKey.intValue(), cls);
        } else {
            e8 = this.f33432b.e(i10, cls);
        }
        return (T) k(e8, cls);
    }

    @Override // z1.b
    public synchronized <T> T d(int i10, Class<T> cls) {
        return (T) k(this.f33432b.e(i10, cls), cls);
    }

    @Override // z1.b
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        z1.a<T> i10 = i(cls);
        int c10 = i10.c(t10);
        int b10 = i10.b() * c10;
        if (n(b10)) {
            a e8 = this.f33432b.e(c10, cls);
            this.f33431a.d(e8, t10);
            NavigableMap<Integer, Integer> l10 = l(cls);
            Integer num = (Integer) l10.get(Integer.valueOf(e8.f33438b));
            Integer valueOf = Integer.valueOf(e8.f33438b);
            int i11 = 1;
            if (num != null) {
                i11 = 1 + num.intValue();
            }
            l10.put(valueOf, Integer.valueOf(i11));
            this.f33436f += b10;
            f();
        }
    }
}
