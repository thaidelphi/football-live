package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
/* compiled from: CompoundButtonCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static Field f3019a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3020b;

    /* compiled from: CompoundButtonCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* compiled from: CompoundButtonCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b {
        static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static Drawable a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(compoundButton);
        }
        if (!f3020b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3019a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e8);
            }
            f3020b = true;
        }
        Field field = f3019a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e10) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e10);
                f3019a = null;
            }
        }
        return null;
    }

    public static ColorStateList b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.a(compoundButton);
        }
        if (compoundButton instanceof m) {
            return ((m) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.c(compoundButton, colorStateList);
        } else if (compoundButton instanceof m) {
            ((m) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.d(compoundButton, mode);
        } else if (compoundButton instanceof m) {
            ((m) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
