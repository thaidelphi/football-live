package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DebugMetadata.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f27357a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final a f27358b = new a(null, null, null);

    /* renamed from: c  reason: collision with root package name */
    private static a f27359c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DebugMetadata.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f27360a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f27361b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f27362c;

        public a(Method method, Method method2, Method method3) {
            this.f27360a = method;
            this.f27361b = method2;
            this.f27362c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f27359c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f27358b;
            f27359c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        n.f(continuation, "continuation");
        a aVar = f27359c;
        if (aVar == null) {
            aVar = a(continuation);
        }
        if (aVar == f27358b) {
            return null;
        }
        Method method = aVar.f27360a;
        Object invoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f27361b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f27362c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
