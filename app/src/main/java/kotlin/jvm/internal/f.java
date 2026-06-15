package kotlin.jvm.internal;

import j8.i0;
import j8.j0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ClassReference.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f implements z8.c<Object>, e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f27371b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends i8.c<?>>, Integer> f27372c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, String> f27373d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<String, String> f27374e;

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap<String, String> f27375f;

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, String> f27376g;

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f27377a;

    /* compiled from: ClassReference.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final String a(Class<?> jClass) {
            String str;
            Method enclosingMethod;
            Constructor<?> enclosingConstructor;
            String k02;
            String l02;
            String l03;
            n.f(jClass, "jClass");
            String str2 = null;
            if (!jClass.isAnonymousClass()) {
                if (jClass.isLocalClass()) {
                    String name = jClass.getSimpleName();
                    if (jClass.getEnclosingMethod() != null) {
                        n.e(name, "name");
                        l03 = b9.p.l0(name, enclosingMethod.getName() + '$', null, 2, null);
                        if (l03 != null) {
                            return l03;
                        }
                    }
                    if (jClass.getEnclosingConstructor() == null) {
                        n.e(name, "name");
                        k02 = b9.p.k0(name, '$', null, 2, null);
                        return k02;
                    }
                    n.e(name, "name");
                    l02 = b9.p.l0(name, enclosingConstructor.getName() + '$', null, 2, null);
                    return l02;
                } else if (!jClass.isArray()) {
                    String str3 = (String) f.f27376g.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                } else {
                    Class<?> componentType = jClass.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) f.f27376g.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List f10;
        int k10;
        Map<Class<? extends i8.c<?>>, Integer> r10;
        int c10;
        String o02;
        String o03;
        int i10 = 0;
        f10 = j8.q.f(t8.a.class, t8.l.class, t8.p.class, t8.q.class, t8.r.class, t8.s.class, t8.t.class, t8.u.class, t8.v.class, t8.w.class, t8.b.class, t8.c.class, t8.d.class, t8.e.class, t8.f.class, t8.g.class, t8.h.class, t8.i.class, t8.j.class, t8.k.class, t8.m.class, t8.n.class, t8.o.class);
        k10 = j8.r.k(f10, 10);
        ArrayList arrayList = new ArrayList(k10);
        for (Object obj : f10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                j8.q.j();
            }
            arrayList.add(i8.s.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        r10 = j0.r(arrayList);
        f27372c = r10;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f27373d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f27374e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        n.e(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            n.e(kotlinName, "kotlinName");
            o03 = b9.p.o0(kotlinName, '.', null, 2, null);
            sb.append(o03);
            sb.append("CompanionObject");
            i8.n a10 = i8.s.a(sb.toString(), kotlinName + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry<Class<? extends i8.c<?>>, Integer> entry : f27372c.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f27375f = hashMap3;
        c10 = i0.c(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(c10);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            o02 = b9.p.o0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, o02);
        }
        f27376g = linkedHashMap;
    }

    public f(Class<?> jClass) {
        n.f(jClass, "jClass");
        this.f27377a = jClass;
    }

    @Override // kotlin.jvm.internal.e
    public Class<?> a() {
        return this.f27377a;
    }

    @Override // z8.c
    public String b() {
        return f27371b.a(a());
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && n.a(s8.a.b(this), s8.a.b((z8.c) obj));
    }

    public int hashCode() {
        return s8.a.b(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
