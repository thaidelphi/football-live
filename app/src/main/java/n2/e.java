package n2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w1.j;
/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f27851a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f27852b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceDecoderRegistry.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f27853a;

        /* renamed from: b  reason: collision with root package name */
        final Class<R> f27854b;

        /* renamed from: c  reason: collision with root package name */
        final j<T, R> f27855c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f27853a = cls;
            this.f27854b = cls2;
            this.f27855c = jVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f27853a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f27854b);
        }
    }

    private synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> list;
        if (!this.f27851a.contains(str)) {
            this.f27851a.add(str);
        }
        list = this.f27852b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f27852b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> void a(String str, j<T, R> jVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, jVar));
    }

    public synchronized <T, R> List<j<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f27851a) {
            List<a<?, ?>> list = this.f27852b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f27855c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f27851a) {
            List<a<?, ?>> list = this.f27852b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f27854b)) {
                        arrayList.add(aVar.f27854b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f27851a);
        this.f27851a.clear();
        for (String str : list) {
            this.f27851a.add(str);
        }
        for (String str2 : arrayList) {
            if (!list.contains(str2)) {
                this.f27851a.add(str2);
            }
        }
    }
}
