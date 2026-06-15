package com.startapp;

import android.content.Context;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f22188a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22189b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f22190c;

    /* renamed from: d  reason: collision with root package name */
    public final Class[] f22191d;

    /* renamed from: e  reason: collision with root package name */
    public final Object[] f22192e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f22193f;

    /* renamed from: g  reason: collision with root package name */
    public transient SoftReference<n1> f22194g;

    /* renamed from: h  reason: collision with root package name */
    public final transient ConcurrentHashMap f22195h = new ConcurrentHashMap();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements Iterator<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f22196a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22197b;

        /* renamed from: c  reason: collision with root package name */
        public int f22198c;

        public a(int i10, Object obj) {
            this.f22196a = obj;
            this.f22197b = i10;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f22198c < this.f22197b;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Object obj = this.f22196a;
            int i10 = this.f22198c;
            this.f22198c = i10 + 1;
            return Array.get(obj, i10);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements Iterator<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f22199a = new b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            return null;
        }
    }

    public l1(String str, String str2, String[] strArr, Class[] clsArr, Object[] objArr, String[] strArr2) {
        this.f22188a = str;
        this.f22189b = str2;
        this.f22190c = strArr;
        this.f22191d = clsArr;
        this.f22192e = objArr;
        this.f22193f = strArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public final JSONArray a(Context context, int[] iArr, Integer num) {
        Iterator it;
        t1 t1Var;
        try {
            n1 a10 = a(context);
            Object invoke = a10.f22313b.invoke(a10.f22312a, this.f22192e);
            if (invoke == null) {
                it = b.f22199a;
            } else if (invoke instanceof Collection) {
                it = ((Collection) invoke).iterator();
            } else if (invoke.getClass().isArray()) {
                it = new a(Array.getLength(invoke), invoke);
            } else {
                it = Collections.singleton(invoke).iterator();
            }
            ?? arrayList = new ArrayList();
            while (true) {
                t1Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    JSONObject jSONObject = new JSONObject();
                    Class<?> cls = next.getClass();
                    SoftReference softReference = (SoftReference) this.f22195h.get(cls.getName());
                    Map map = softReference != null ? (Map) softReference.get() : null;
                    if (map == null) {
                        map = a(cls, this.f22193f);
                        this.f22195h.put(cls.getName(), new SoftReference(map));
                    }
                    if (map.isEmpty()) {
                        try {
                            jSONObject.put("", next.toString());
                        } catch (Throwable unused) {
                        }
                    } else {
                        for (Map.Entry entry : map.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            try {
                                if (value instanceof Field) {
                                    jSONObject.put(str, a(((Field) value).get(next)));
                                } else if (value instanceof Method) {
                                    jSONObject.put(str, a(((Method) value).invoke(next, new Object[0])));
                                } else {
                                    boolean z10 = value instanceof Throwable;
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    arrayList.add(jSONObject);
                }
            }
            if (iArr != null && iArr.length > 0) {
                int length = this.f22193f.length;
                for (int i10 : iArr) {
                    if (i10 != 0 && Math.abs(i10) <= length) {
                        Comparator l4Var = new l4(this.f22193f[Math.abs(i10) - 1]);
                        if (i10 < 0) {
                            l4Var = Collections.reverseOrder(l4Var);
                        }
                        t1Var = t1Var == null ? l4Var : new t1(t1Var, l4Var);
                    }
                }
                if (t1Var != null) {
                    Collections.sort(arrayList, t1Var);
                }
            }
            if (num != null && num.intValue() > 0) {
                arrayList = arrayList.subList(0, Math.min(num.intValue(), arrayList.size()));
            }
            JSONArray jSONArray = new JSONArray();
            for (JSONObject jSONObject2 : arrayList) {
                jSONArray.put(jSONObject2);
            }
            return jSONArray;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(String.valueOf(5), e8);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(String.valueOf(5), e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l1.class != obj.getClass()) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return o9.a(this.f22188a, l1Var.f22188a) && o9.a(this.f22189b, l1Var.f22189b) && Arrays.equals(this.f22190c, l1Var.f22190c) && Arrays.equals(this.f22192e, l1Var.f22192e) && Arrays.equals(this.f22193f, l1Var.f22193f);
    }

    public final int hashCode() {
        Object[] objArr = {this.f22188a, this.f22189b, this.f22190c, this.f22192e, this.f22193f};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final String toString() {
        return super.toString();
    }

    public static Object a(Object obj) {
        if (obj instanceof Short) {
            return Integer.valueOf(((Short) obj).intValue());
        }
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public final n1 a(Context context) {
        Object obj;
        SoftReference<n1> softReference = this.f22194g;
        NoSuchMethodException noSuchMethodException = null;
        n1 n1Var = softReference != null ? softReference.get() : null;
        if (n1Var == null) {
            Object systemService = context.getSystemService(this.f22188a);
            if (systemService == null) {
                try {
                    Object obj2 = a(Context.class, new String[]{this.f22188a}).get(this.f22188a);
                    if (obj2 instanceof Method) {
                        obj = ((Method) obj2).invoke(context, new Object[0]);
                    } else if (obj2 instanceof Field) {
                        obj = ((Field) obj2).get(context);
                    } else {
                        boolean z10 = obj2 instanceof Throwable;
                    }
                    systemService = obj;
                } catch (Throwable unused) {
                }
            }
            if (systemService != null) {
                try {
                    String str = this.f22189b;
                    Class<?>[] clsArr = this.f22191d;
                    for (Class<?> cls = systemService.getClass(); cls != null; cls = cls.getSuperclass()) {
                        try {
                            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                            if (!declaredMethod.isAccessible()) {
                                try {
                                    declaredMethod.setAccessible(true);
                                } catch (SecurityException e8) {
                                    throw new RuntimeException(String.valueOf(4), e8);
                                }
                            }
                            n1 n1Var2 = new n1(systemService, declaredMethod);
                            this.f22194g = new SoftReference<>(n1Var2);
                            return n1Var2;
                        } catch (NoSuchMethodException e10) {
                            if (noSuchMethodException == null) {
                                noSuchMethodException = e10;
                            }
                        }
                    }
                    throw noSuchMethodException;
                } catch (NoSuchMethodException e11) {
                    throw new RuntimeException(String.valueOf(3), e11);
                }
            }
            throw new RuntimeException(String.valueOf(1));
        }
        return n1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r6.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0.put(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r6.isAccessible() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedHashMap a(java.lang.Class r14, java.lang.String[] r15) {
        /*
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            int r1 = r15.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto Lb6
            r4 = r15[r3]
            r5 = 0
            r6 = r14
            r7 = r5
        Lf:
            r8 = 1
            if (r6 == 0) goto L2d
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L24 java.lang.SecurityException -> L2e
            boolean r7 = r6.isAccessible()     // Catch: java.lang.SecurityException -> L2e java.lang.NoSuchFieldException -> L30
            if (r7 != 0) goto L1f
            r6.setAccessible(r8)     // Catch: java.lang.SecurityException -> L2e java.lang.NoSuchFieldException -> L30
        L1f:
            r0.put(r4, r6)     // Catch: java.lang.SecurityException -> L2e java.lang.NoSuchFieldException -> L30
            goto Lb2
        L24:
            r9 = move-exception
            if (r7 != 0) goto L28
            r7 = r9
        L28:
            java.lang.Class r6 = r6.getSuperclass()     // Catch: java.lang.SecurityException -> L2e java.lang.NoSuchFieldException -> L30
            goto Lf
        L2d:
            throw r7     // Catch: java.lang.SecurityException -> L2e java.lang.NoSuchFieldException -> L30
        L2e:
            r6 = move-exception
            goto L31
        L30:
            r6 = move-exception
        L31:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            char r9 = r4.charAt(r2)
            char r9 = java.lang.Character.toUpperCase(r9)
            r7.append(r9)
            java.lang.String r9 = r4.substring(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L7e java.lang.Throwable -> Laf
            r9.<init>()     // Catch: java.lang.NoSuchMethodException -> L7e java.lang.Throwable -> Laf
            java.lang.String r10 = "get"
            r9.append(r10)     // Catch: java.lang.NoSuchMethodException -> L7e java.lang.Throwable -> Laf
            r9.append(r7)     // Catch: java.lang.NoSuchMethodException -> L7e java.lang.Throwable -> Laf
            java.lang.String r9 = r9.toString()     // Catch: java.lang.NoSuchMethodException -> L7e java.lang.Throwable -> Laf
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L7e java.lang.Throwable -> Laf
            r11 = r14
            r12 = r5
        L61:
            if (r11 == 0) goto L7d
            java.lang.reflect.Method r9 = r11.getDeclaredMethod(r9, r10)     // Catch: java.lang.NoSuchMethodException -> L74 java.lang.Throwable -> Laf
            boolean r10 = r9.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L7e java.lang.Throwable -> Laf
            if (r10 != 0) goto L70
            r9.setAccessible(r8)     // Catch: java.lang.NoSuchMethodException -> L7e java.lang.Throwable -> Laf
        L70:
            r0.put(r4, r9)     // Catch: java.lang.NoSuchMethodException -> L7e java.lang.Throwable -> Laf
            goto Lb2
        L74:
            r13 = move-exception
            if (r12 != 0) goto L78
            r12 = r13
        L78:
            java.lang.Class r11 = r11.getSuperclass()     // Catch: java.lang.NoSuchMethodException -> L7e java.lang.Throwable -> Laf
            goto L61
        L7d:
            throw r12     // Catch: java.lang.NoSuchMethodException -> L7e java.lang.Throwable -> Laf
        L7e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r9.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r10 = "is"
            r9.append(r10)     // Catch: java.lang.Throwable -> Laf
            r9.append(r7)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> Laf
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Laf
            r10 = r14
        L92:
            if (r10 == 0) goto Lae
            java.lang.reflect.Method r5 = r10.getDeclaredMethod(r7, r9)     // Catch: java.lang.NoSuchMethodException -> La5
            boolean r7 = r5.isAccessible()     // Catch: java.lang.Throwable -> Laf
            if (r7 != 0) goto La1
            r5.setAccessible(r8)     // Catch: java.lang.Throwable -> Laf
        La1:
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> Laf
            goto Lb2
        La5:
            r11 = move-exception
            if (r5 != 0) goto La9
            r5 = r11
        La9:
            java.lang.Class r10 = r10.getSuperclass()     // Catch: java.lang.Throwable -> Laf
            goto L92
        Lae:
            throw r5     // Catch: java.lang.Throwable -> Laf
        Laf:
            r0.put(r4, r6)
        Lb2:
            int r3 = r3 + 1
            goto L8
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.l1.a(java.lang.Class, java.lang.String[]):java.util.LinkedHashMap");
    }
}
