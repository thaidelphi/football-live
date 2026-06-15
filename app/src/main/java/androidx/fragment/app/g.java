package androidx.fragment.app;

import androidx.fragment.app.Fragment;
/* compiled from: FragmentFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.collection.h<ClassLoader, androidx.collection.h<String, Class<?>>> f3366a = new androidx.collection.h<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        androidx.collection.h<ClassLoader, androidx.collection.h<String, Class<?>>> hVar = f3366a;
        androidx.collection.h<String, Class<?>> hVar2 = hVar.get(classLoader);
        if (hVar2 == null) {
            hVar2 = new androidx.collection.h<>();
            hVar.put(classLoader, hVar2);
        }
        Class<?> cls = hVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            hVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e8) {
            throw new Fragment.f("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e8);
        } catch (ClassNotFoundException e10) {
            throw new Fragment.f("Unable to instantiate fragment " + str + ": make sure class name exists", e10);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
