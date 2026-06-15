package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: TypefaceCompatApi24Impl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class g extends k {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f2655b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor<?> f2656c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f2657d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f2658e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi24Impl", e8.getClass().getName(), e8);
            cls = null;
            method = null;
            method2 = null;
        }
        f2656c = constructor;
        f2655b = cls;
        f2657d = method2;
        f2658e = method;
    }

    private static boolean l(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f2657d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface m(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2655b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2658e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean n() {
        Method method = f2657d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object o() {
        try {
            return f2656c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.k
    public Typeface b(Context context, e.c cVar, Resources resources, int i10) {
        e.d[] a10;
        Object o10 = o();
        if (o10 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            ByteBuffer b10 = l.b(context, resources, dVar.b());
            if (b10 == null || !l(o10, b10, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return m(o10);
    }

    @Override // androidx.core.graphics.k
    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        Object o10 = o();
        if (o10 == null) {
            return null;
        }
        androidx.collection.h hVar = new androidx.collection.h();
        for (g.b bVar : bVarArr) {
            Uri d10 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(d10);
            if (byteBuffer == null) {
                byteBuffer = l.f(context, cancellationSignal, d10);
                hVar.put(d10, byteBuffer);
            }
            if (byteBuffer == null || !l(o10, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface m7 = m(o10);
        if (m7 == null) {
            return null;
        }
        return Typeface.create(m7, i10);
    }
}
