package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
/* compiled from: ResourcesFlusher.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class j {

    /* renamed from: a  reason: collision with root package name */
    private static Field f974a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f975b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f976c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f977d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f978e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f979f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f980g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f981h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            d(resources);
        } else if (i10 >= 23) {
            c(resources);
        } else if (i10 >= 21) {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        if (!f975b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f974a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e8);
            }
            f975b = true;
        }
        Field field = f974a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e10);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void c(Resources resources) {
        if (!f975b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f974a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e8);
            }
            f975b = true;
        }
        Object obj = null;
        Field field = f974a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e10);
            }
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f981h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f980g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e8);
            }
            f981h = true;
        }
        Field field = f980g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e10) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f975b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f974a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
            }
            f975b = true;
        }
        Field field2 = f974a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    private static void e(Object obj) {
        if (!f977d) {
            try {
                f976c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e8) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e8);
            }
            f977d = true;
        }
        Class<?> cls = f976c;
        if (cls == null) {
            return;
        }
        if (!f979f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f978e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
            }
            f979f = true;
        }
        Field field = f978e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
