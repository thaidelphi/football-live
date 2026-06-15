package a5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: CopyOnWriteMultiset.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i<E> implements Iterable<E> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f439a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<E, Integer> f440b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Set<E> f441c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private List<E> f442d = Collections.emptyList();

    public void a(E e8) {
        synchronized (this.f439a) {
            ArrayList arrayList = new ArrayList(this.f442d);
            arrayList.add(e8);
            this.f442d = Collections.unmodifiableList(arrayList);
            Integer num = this.f440b.get(e8);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f441c);
                hashSet.add(e8);
                this.f441c = Collections.unmodifiableSet(hashSet);
            }
            this.f440b.put(e8, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public int b(E e8) {
        int intValue;
        synchronized (this.f439a) {
            intValue = this.f440b.containsKey(e8) ? this.f440b.get(e8).intValue() : 0;
        }
        return intValue;
    }

    public void c(E e8) {
        synchronized (this.f439a) {
            Integer num = this.f440b.get(e8);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f442d);
            arrayList.remove(e8);
            this.f442d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f440b.remove(e8);
                HashSet hashSet = new HashSet(this.f441c);
                hashSet.remove(e8);
                this.f441c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f440b.put(e8, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f439a) {
            it = this.f442d.iterator();
        }
        return it;
    }

    public Set<E> t() {
        Set<E> set;
        synchronized (this.f439a) {
            set = this.f441c;
        }
        return set;
    }
}
