package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class f extends k {

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f2650b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor<?> f2651c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2652d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f2653e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f2654f = false;

    private static boolean l(Object obj, String str, int i10, boolean z10) {
        o();
        try {
            return ((Boolean) f2652d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static Typeface m(Object obj) {
        o();
        try {
            Object newInstance = Array.newInstance(f2650b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2653e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    private File n(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void o() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2654f) {
            return;
        }
        f2654f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi21Impl", e8.getClass().getName(), e8);
            method = null;
            cls = null;
            method2 = null;
        }
        f2651c = constructor;
        f2650b = cls;
        f2652d = method2;
        f2653e = method;
    }

    private static Object p() {
        o();
        try {
            return f2651c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // androidx.core.graphics.k
    public Typeface b(Context context, e.c cVar, Resources resources, int i10) {
        e.d[] a10;
        Object p10 = p();
        for (e.d dVar : cVar.a()) {
            File e8 = l.e(context);
            if (e8 == null) {
                return null;
            }
            try {
                if (!l.c(e8, resources, dVar.b())) {
                    return null;
                }
                if (!l(p10, e8.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                e8.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e8.delete();
            }
        }
        return m(p10);
    }

    @Override // androidx.core.graphics.k
    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
        g.b i11 = i(bVarArr, i10);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(i11.d(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File n10 = n(openFileDescriptor);
            if (n10 != null && n10.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(n10);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface d10 = super.d(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return d10;
        } catch (IOException unused) {
            return null;
        }
    }
}
