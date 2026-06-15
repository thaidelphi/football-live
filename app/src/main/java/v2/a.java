package v2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import x2.f;
/* compiled from: AnimationUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {
    public static boolean a(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public static boolean b(f... fVarArr) {
        for (f fVar : fVarArr) {
            if (fVar.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public static void d(Animator animator) {
        if (animator == null || animator.isStarted()) {
            return;
        }
        animator.start();
    }

    public static void e(f... fVarArr) {
        for (f fVar : fVarArr) {
            fVar.start();
        }
    }

    public static void f(f... fVarArr) {
        for (f fVar : fVarArr) {
            fVar.stop();
        }
    }
}
