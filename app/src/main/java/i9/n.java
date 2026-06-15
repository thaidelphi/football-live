package i9;

import i8.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ExceptionsConstructor.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int f26673a = e(Throwable.class, -1);

    /* renamed from: b  reason: collision with root package name */
    private static final i f26674b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionsConstructor.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.jvm.internal.o implements t8.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor<?> f26675a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Constructor<?> constructor) {
            super(1);
            this.f26675a = constructor;
        }

        @Override // t8.l
        /* renamed from: b */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f26675a.newInstance(th.getMessage(), th);
            kotlin.jvm.internal.n.d(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            return (Throwable) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionsConstructor.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b extends kotlin.jvm.internal.o implements t8.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor<?> f26676a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Constructor<?> constructor) {
            super(1);
            this.f26676a = constructor;
        }

        @Override // t8.l
        /* renamed from: b */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f26676a.newInstance(th.getMessage());
            kotlin.jvm.internal.n.d(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) newInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionsConstructor.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c extends kotlin.jvm.internal.o implements t8.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor<?> f26677a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Constructor<?> constructor) {
            super(1);
            this.f26677a = constructor;
        }

        @Override // t8.l
        /* renamed from: b */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f26677a.newInstance(th);
            kotlin.jvm.internal.n.d(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            return (Throwable) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionsConstructor.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class d extends kotlin.jvm.internal.o implements t8.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor<?> f26678a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Constructor<?> constructor) {
            super(1);
            this.f26678a = constructor;
        }

        @Override // t8.l
        /* renamed from: b */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f26678a.newInstance(new Object[0]);
            kotlin.jvm.internal.n.d(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) newInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionsConstructor.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class e extends kotlin.jvm.internal.o implements t8.l {

        /* renamed from: a  reason: collision with root package name */
        public static final e f26679a = new e();

        e() {
            super(1);
        }

        @Override // t8.l
        /* renamed from: b */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionsConstructor.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class f extends kotlin.jvm.internal.o implements t8.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t8.l<Throwable, Throwable> f26680a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(t8.l<? super Throwable, ? extends Throwable> lVar) {
            super(1);
            this.f26680a = lVar;
        }

        @Override // t8.l
        /* renamed from: b */
        public final Throwable invoke(Throwable th) {
            Object b10;
            t8.l<Throwable, Throwable> lVar = this.f26680a;
            try {
                o.a aVar = i8.o.f26626b;
                Throwable invoke = lVar.invoke(th);
                if (!kotlin.jvm.internal.n.a(th.getMessage(), invoke.getMessage()) && !kotlin.jvm.internal.n.a(invoke.getMessage(), th.toString())) {
                    invoke = null;
                }
                b10 = i8.o.b(invoke);
            } catch (Throwable th2) {
                o.a aVar2 = i8.o.f26626b;
                b10 = i8.o.b(i8.p.a(th2));
            }
            return i8.o.f(b10) ? null : b10;
        }
    }

    static {
        i iVar;
        try {
            iVar = p.a() ? u0.f26705a : i9.c.f26646a;
        } catch (Throwable unused) {
            iVar = u0.f26705a;
        }
        f26674b = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> t8.l<Throwable, Throwable> b(Class<E> cls) {
        Object obj;
        t8.l<Throwable, Throwable> lVar;
        i8.n a10;
        e eVar = e.f26679a;
        if (f26673a != e(cls, 0)) {
            return eVar;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i10 = 0;
        while (true) {
            obj = null;
            if (i10 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i10];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                a10 = i8.s.a(f(new d(constructor)), 0);
            } else if (length2 == 1) {
                Class<?> cls2 = parameterTypes[0];
                if (kotlin.jvm.internal.n.a(cls2, String.class)) {
                    a10 = i8.s.a(f(new b(constructor)), 2);
                } else if (kotlin.jvm.internal.n.a(cls2, Throwable.class)) {
                    a10 = i8.s.a(f(new c(constructor)), 1);
                } else {
                    a10 = i8.s.a(null, -1);
                }
            } else if (length2 == 2) {
                if (kotlin.jvm.internal.n.a(parameterTypes[0], String.class) && kotlin.jvm.internal.n.a(parameterTypes[1], Throwable.class)) {
                    a10 = i8.s.a(f(new a(constructor)), 3);
                } else {
                    a10 = i8.s.a(null, -1);
                }
            } else {
                a10 = i8.s.a(null, -1);
            }
            arrayList.add(a10);
            i10++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((i8.n) obj).d()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((i8.n) next).d()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        i8.n nVar = (i8.n) obj;
        return (nVar == null || (lVar = (t8.l) nVar.c()) == null) ? eVar : lVar;
    }

    private static final int c(Class<?> cls, int i10) {
        Field[] declaredFields;
        do {
            int length = cls.getDeclaredFields().length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (!Modifier.isStatic(declaredFields[i12].getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    static /* synthetic */ int d(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return c(cls, i10);
    }

    private static final int e(Class<?> cls, int i10) {
        Integer b10;
        s8.a.c(cls);
        try {
            o.a aVar = i8.o.f26626b;
            b10 = i8.o.b(Integer.valueOf(d(cls, 0, 1, null)));
        } catch (Throwable th) {
            o.a aVar2 = i8.o.f26626b;
            b10 = i8.o.b(i8.p.a(th));
        }
        Integer valueOf = Integer.valueOf(i10);
        if (i8.o.f(b10)) {
            b10 = valueOf;
        }
        return ((Number) b10).intValue();
    }

    private static final t8.l<Throwable, Throwable> f(t8.l<? super Throwable, ? extends Throwable> lVar) {
        return new f(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E g(E e8) {
        Object b10;
        if (e8 instanceof d9.h0) {
            try {
                o.a aVar = i8.o.f26626b;
                b10 = i8.o.b(((d9.h0) e8).a());
            } catch (Throwable th) {
                o.a aVar2 = i8.o.f26626b;
                b10 = i8.o.b(i8.p.a(th));
            }
            if (i8.o.f(b10)) {
                b10 = null;
            }
            return (E) b10;
        }
        return (E) f26674b.a(e8.getClass()).invoke(e8);
    }
}
