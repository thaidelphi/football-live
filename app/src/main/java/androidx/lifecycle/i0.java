package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Class<?>> f3641a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<Class<?>> f3642b;

    static {
        List<Class<?>> f10;
        List<Class<?>> b10;
        f10 = j8.q.f(Application.class, d0.class);
        f3641a = f10;
        b10 = j8.p.b(d0.class);
        f3642b = b10;
    }

    public static final <T> Constructor<T> c(Class<T> modelClass, List<? extends Class<?>> signature) {
        List u10;
        kotlin.jvm.internal.n.f(modelClass, "modelClass");
        kotlin.jvm.internal.n.f(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.n.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            kotlin.jvm.internal.n.e(parameterTypes, "constructor.parameterTypes");
            u10 = j8.m.u(parameterTypes);
            if (kotlin.jvm.internal.n.a(signature, u10)) {
                kotlin.jvm.internal.n.d(constructor2, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor2;
            } else if (signature.size() == u10.size() && u10.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends k0> T d(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        kotlin.jvm.internal.n.f(modelClass, "modelClass");
        kotlin.jvm.internal.n.f(constructor, "constructor");
        kotlin.jvm.internal.n.f(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Failed to access " + modelClass, e8);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e11.getCause());
        }
    }
}
