package f6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: CycleDetector.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class q {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final f6.c<?> f25467a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<b> f25468b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<b> f25469c = new HashSet();

        b(f6.c<?> cVar) {
            this.f25467a = cVar;
        }

        void a(b bVar) {
            this.f25468b.add(bVar);
        }

        void b(b bVar) {
            this.f25469c.add(bVar);
        }

        f6.c<?> c() {
            return this.f25467a;
        }

        Set<b> d() {
            return this.f25468b;
        }

        boolean e() {
            return this.f25468b.isEmpty();
        }

        boolean f() {
            return this.f25469c.isEmpty();
        }

        void g(b bVar) {
            this.f25469c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final e0<?> f25470a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f25471b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f25470a.equals(this.f25470a) && cVar.f25471b == this.f25471b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f25470a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f25471b).hashCode();
        }

        private c(e0<?> e0Var, boolean z10) {
            this.f25470a = e0Var;
            this.f25471b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<f6.c<?>> list) {
        Set<b> c10 = c(list);
        Set<b> b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b next = b10.iterator().next();
            b10.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b10.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c10) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new s(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<f6.c<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (f6.c<?> cVar : list) {
            b bVar = new b(cVar);
            for (e0<? super Object> e0Var : cVar.j()) {
                c cVar2 = new c(e0Var, !cVar.p());
                if (!hashMap.containsKey(cVar2)) {
                    hashMap.put(cVar2, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar2);
                if (!set2.isEmpty() && !cVar2.f25471b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", e0Var));
                }
                set2.add(bVar);
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (r rVar : bVar2.c().g()) {
                    if (rVar.d() && (set = (Set) hashMap.get(new c(rVar.b(), rVar.f()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
