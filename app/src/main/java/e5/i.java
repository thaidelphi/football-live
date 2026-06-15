package e5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* compiled from: MotionTiming.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f25184a;

    /* renamed from: b  reason: collision with root package name */
    private long f25185b;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f25186c;

    /* renamed from: d  reason: collision with root package name */
    private int f25187d;

    /* renamed from: e  reason: collision with root package name */
    private int f25188e;

    public i(long j10, long j11) {
        this.f25184a = 0L;
        this.f25185b = 300L;
        this.f25186c = null;
        this.f25187d = 0;
        this.f25188e = 1;
        this.f25184a = j10;
        this.f25185b = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f25187d = valueAnimator.getRepeatCount();
        iVar.f25188e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return a.f25171c;
            }
            return interpolator instanceof DecelerateInterpolator ? a.f25172d : interpolator;
        }
        return a.f25170b;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f25184a;
    }

    public long d() {
        return this.f25185b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f25186c;
        return timeInterpolator != null ? timeInterpolator : a.f25170b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
                return e().getClass().equals(iVar.e().getClass());
            }
            return false;
        }
        return false;
    }

    public int g() {
        return this.f25187d;
    }

    public int h() {
        return this.f25188e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f25184a = 0L;
        this.f25185b = 300L;
        this.f25186c = null;
        this.f25187d = 0;
        this.f25188e = 1;
        this.f25184a = j10;
        this.f25185b = j11;
        this.f25186c = timeInterpolator;
    }
}
