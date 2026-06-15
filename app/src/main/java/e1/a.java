package e1;

import android.os.Handler;
import android.os.Looper;
import androidx.work.x;
/* compiled from: DefaultRunnableScheduler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements x {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f24837a = androidx.core.os.h.a(Looper.getMainLooper());

    @Override // androidx.work.x
    public void a(Runnable runnable) {
        this.f24837a.removeCallbacks(runnable);
    }

    @Override // androidx.work.x
    public void b(long j10, Runnable runnable) {
        this.f24837a.postDelayed(runnable, j10);
    }
}
