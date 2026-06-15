package w2;

import android.os.Build;
import android.view.animation.Interpolator;
/* compiled from: PathInterpolatorCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {
    public static Interpolator a(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 21) {
            return d.a(f10, f11, f12, f13);
        }
        return e.a(f10, f11, f12, f13);
    }
}
