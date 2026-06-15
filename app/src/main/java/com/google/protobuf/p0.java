package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.ironsource.b9;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmallSortedMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class p0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f15482a;

    /* renamed from: b  reason: collision with root package name */
    private List<p0<K, V>.e> f15483b;

    /* renamed from: c  reason: collision with root package name */
    private Map<K, V> f15484c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15485d;

    /* renamed from: e  reason: collision with root package name */
    private volatile p0<K, V>.g f15486e;

    /* renamed from: f  reason: collision with root package name */
    private Map<K, V> f15487f;

    /* renamed from: g  reason: collision with root package name */
    private volatile p0<K, V>.c f15488g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a<FieldDescriptorType> extends p0<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.p0
        public void p() {
            if (!o()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> j10 = j(i10);
                    if (((FieldSet.FieldDescriptorLite) j10.getKey()).isRepeated()) {
                        j10.setValue(Collections.unmodifiableList((List) j10.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.p();
        }

        @Override // com.google.protobuf.p0, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class c extends p0<K, V>.g {
        private c() {
            super(p0.this, null);
        }

        @Override // com.google.protobuf.p0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(p0.this, null);
        }

        /* synthetic */ c(p0 p0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private static final Iterator<Object> f15493a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f15494b = new b();

        /* compiled from: SmallSortedMap.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f15493a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f15494b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e implements Map.Entry<K, V>, Comparable<p0<K, V>.e> {

        /* renamed from: a  reason: collision with root package name */
        private final K f15495a;

        /* renamed from: b  reason: collision with root package name */
        private V f15496b;

        e(p0 p0Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(p0<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: c */
        public K getKey() {
            return this.f15495a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return b(this.f15495a, entry.getKey()) && b(this.f15496b, entry.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f15496b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f15495a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f15496b;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            p0.this.g();
            V v11 = this.f15496b;
            this.f15496b = v10;
            return v11;
        }

        public String toString() {
            return this.f15495a + b9.i.f16692b + this.f15496b;
        }

        e(K k10, V v10) {
            this.f15495a = k10;
            this.f15496b = v10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            p0.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            p0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = p0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(p0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                p0.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p0.this.size();
        }

        /* synthetic */ g(p0 p0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ p0(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f15483b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f15483b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f15483b.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f15485d) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f15483b.isEmpty() || (this.f15483b instanceof ArrayList)) {
            return;
        }
        this.f15483b = new ArrayList(this.f15482a);
    }

    private SortedMap<K, V> n() {
        g();
        if (this.f15484c.isEmpty() && !(this.f15484c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15484c = treeMap;
            this.f15487f = treeMap.descendingMap();
        }
        return (SortedMap) this.f15484c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> p0<FieldDescriptorType, Object> q(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V s(int i10) {
        g();
        V value = this.f15483b.remove(i10).getValue();
        if (!this.f15484c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.f15483b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f15483b.isEmpty()) {
            this.f15483b.clear();
        }
        if (this.f15484c.isEmpty()) {
            return;
        }
        this.f15484c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f15484c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f15486e == null) {
            this.f15486e = new g(this, null);
        }
        return this.f15486e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return super.equals(obj);
        }
        p0 p0Var = (p0) obj;
        int size = size();
        if (size != p0Var.size()) {
            return false;
        }
        int k10 = k();
        if (k10 != p0Var.k()) {
            return entrySet().equals(p0Var.entrySet());
        }
        for (int i10 = 0; i10 < k10; i10++) {
            if (!j(i10).equals(p0Var.j(i10))) {
                return false;
            }
        }
        if (k10 != size) {
            return this.f15484c.equals(p0Var.f15484c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return this.f15483b.get(f10).getValue();
        }
        return this.f15484c.get(comparable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> h() {
        if (this.f15488g == null) {
            this.f15488g = new c(this, null);
        }
        return this.f15488g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int k10 = k();
        int i10 = 0;
        for (int i11 = 0; i11 < k10; i11++) {
            i10 += this.f15483b.get(i11).hashCode();
        }
        return l() > 0 ? i10 + this.f15484c.hashCode() : i10;
    }

    public Map.Entry<K, V> j(int i10) {
        return this.f15483b.get(i10);
    }

    public int k() {
        return this.f15483b.size();
    }

    public int l() {
        return this.f15484c.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        if (this.f15484c.isEmpty()) {
            return d.b();
        }
        return this.f15484c.entrySet();
    }

    public boolean o() {
        return this.f15485d;
    }

    public void p() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f15485d) {
            return;
        }
        if (this.f15484c.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f15484c);
        }
        this.f15484c = unmodifiableMap;
        if (this.f15487f.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f15487f);
        }
        this.f15487f = unmodifiableMap2;
        this.f15485d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: r */
    public V put(K k10, V v10) {
        g();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f15483b.get(f10).setValue(v10);
        }
        i();
        int i10 = -(f10 + 1);
        if (i10 >= this.f15482a) {
            return n().put(k10, v10);
        }
        int size = this.f15483b.size();
        int i11 = this.f15482a;
        if (size == i11) {
            p0<K, V>.e remove = this.f15483b.remove(i11 - 1);
            n().put((K) remove.getKey(), remove.getValue());
        }
        this.f15483b.add(i10, new e(k10, v10));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return (V) s(f10);
        }
        if (this.f15484c.isEmpty()) {
            return null;
        }
        return this.f15484c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f15483b.size() + this.f15484c.size();
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f15489a;

        /* renamed from: b  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f15490b;

        private b() {
            this.f15489a = p0.this.f15483b.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f15490b == null) {
                this.f15490b = p0.this.f15487f.entrySet().iterator();
            }
            return this.f15490b;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (!a().hasNext()) {
                List list = p0.this.f15483b;
                int i10 = this.f15489a - 1;
                this.f15489a = i10;
                return (Map.Entry) list.get(i10);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f15489a;
            return (i10 > 0 && i10 <= p0.this.f15483b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(p0 p0Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f15498a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f15499b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f15500c;

        private f() {
            this.f15498a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f15500c == null) {
                this.f15500c = p0.this.f15484c.entrySet().iterator();
            }
            return this.f15500c;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f15499b = true;
            int i10 = this.f15498a + 1;
            this.f15498a = i10;
            if (i10 < p0.this.f15483b.size()) {
                return (Map.Entry) p0.this.f15483b.get(this.f15498a);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f15498a + 1 >= p0.this.f15483b.size()) {
                return !p0.this.f15484c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f15499b) {
                this.f15499b = false;
                p0.this.g();
                if (this.f15498a < p0.this.f15483b.size()) {
                    p0 p0Var = p0.this;
                    int i10 = this.f15498a;
                    this.f15498a = i10 - 1;
                    p0Var.s(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(p0 p0Var, a aVar) {
            this();
        }
    }

    private p0(int i10) {
        this.f15482a = i10;
        this.f15483b = Collections.emptyList();
        this.f15484c = Collections.emptyMap();
        this.f15487f = Collections.emptyMap();
    }
}
