package j6;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FieldDescriptor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f27072a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Object> f27073b;

    /* compiled from: FieldDescriptor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f27074a;

        /* renamed from: b  reason: collision with root package name */
        private Map<Class<?>, Object> f27075b = null;

        b(String str) {
            this.f27074a = str;
        }

        public c a() {
            Map unmodifiableMap;
            String str = this.f27074a;
            if (this.f27075b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f27075b));
            }
            return new c(str, unmodifiableMap);
        }

        public <T extends Annotation> b b(T t10) {
            if (this.f27075b == null) {
                this.f27075b = new HashMap();
            }
            this.f27075b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f27072a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f27073b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f27072a.equals(cVar.f27072a) && this.f27073b.equals(cVar.f27073b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f27072a.hashCode() * 31) + this.f27073b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f27072a + ", properties=" + this.f27073b.values() + "}";
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f27072a = str;
        this.f27073b = map;
    }
}
