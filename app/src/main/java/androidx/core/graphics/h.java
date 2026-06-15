package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h extends f {

    /* renamed from: g  reason: collision with root package name */
    protected final Class<?> f2659g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor<?> f2660h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f2661i;

    /* renamed from: j  reason: collision with root package name */
    protected final Method f2662j;

    /* renamed from: k  reason: collision with root package name */
    protected final Method f2663k;

    /* renamed from: l  reason: collision with root package name */
    protected final Method f2664l;

    /* renamed from: m  reason: collision with root package name */
    protected final Method f2665m;

    public h() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> z10 = z();
            constructor = A(z10);
            method2 = w(z10);
            method3 = x(z10);
            method4 = B(z10);
            method5 = v(z10);
            method = y(z10);
            cls = z10;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e8.getClass().getName(), e8);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2659g = cls;
        this.f2660h = constructor;
        this.f2661i = method2;
        this.f2662j = method3;
        this.f2663k = method4;
        this.f2664l = method5;
        this.f2665m = method;
    }

    private Object p() {
        try {
            return this.f2660h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void q(Object obj) {
        try {
            this.f2664l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean r(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2661i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f2662j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t(Object obj) {
        try {
            return ((Boolean) this.f2663k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean u() {
        if (this.f2661i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2661i != null;
    }

    protected Constructor<?> A(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    protected Method B(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // androidx.core.graphics.f, androidx.core.graphics.k
    public Typeface b(Context context, e.c cVar, Resources resources, int i10) {
        e.d[] a10;
        if (!u()) {
            return super.b(context, cVar, resources, i10);
        }
        Object p10 = p();
        if (p10 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!r(context, p10, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                q(p10);
                return null;
            }
        }
        if (t(p10)) {
            return m(p10);
        }
        return null;
    }

    @Override // androidx.core.graphics.f, androidx.core.graphics.k
    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        Typeface m7;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!u()) {
            g.b i11 = i(bVarArr, i10);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(i11.d(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(i11.e()).setItalic(i11.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h10 = l.h(context, bVarArr, cancellationSignal);
        Object p10 = p();
        if (p10 == null) {
            return null;
        }
        boolean z10 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = h10.get(bVar.d());
            if (byteBuffer != null) {
                if (!s(p10, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    q(p10);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            q(p10);
            return null;
        } else if (t(p10) && (m7 = m(p10)) != null) {
            return Typeface.create(m7, i10);
        } else {
            return null;
        }
    }

    @Override // androidx.core.graphics.k
    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        if (!u()) {
            return super.e(context, resources, i10, str, i11);
        }
        Object p10 = p();
        if (p10 == null) {
            return null;
        }
        if (!r(context, p10, str, 0, -1, -1, null)) {
            q(p10);
            return null;
        } else if (t(p10)) {
            return m(p10);
        } else {
            return null;
        }
    }

    protected Typeface m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2659g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2665m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method v(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method w(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method x(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method y(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> z() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }
}
