package f7;

import b7.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
/* compiled from: UnsafeReflectionAccessor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private static Class f25487d;

    /* renamed from: b  reason: collision with root package name */
    private final Object f25488b = d();

    /* renamed from: c  reason: collision with root package name */
    private final Field f25489c = c();

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f25487d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // f7.b
    public void b(AccessibleObject accessibleObject) {
        if (e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e8) {
            throw new k("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e8);
        }
    }

    boolean e(AccessibleObject accessibleObject) {
        if (this.f25488b != null && this.f25489c != null) {
            try {
                f25487d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f25488b, accessibleObject, Long.valueOf(((Long) f25487d.getMethod("objectFieldOffset", Field.class).invoke(this.f25488b, this.f25489c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
