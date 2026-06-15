package androidx.core.view.animation;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
/* compiled from: PathInterpolatorCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* compiled from: PathInterpolatorCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static PathInterpolator a(float f10, float f11) {
            return new PathInterpolator(f10, f11);
        }

        static PathInterpolator b(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.b(f10, f11, f12, f13);
        }
        return new androidx.core.view.animation.a(f10, f11, f12, f13);
    }

    public static Interpolator b(Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.c(path);
        }
        return new androidx.core.view.animation.a(path);
    }
}
