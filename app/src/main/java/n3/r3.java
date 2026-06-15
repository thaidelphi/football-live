package n3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
/* compiled from: WakeLockManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class r3 {

    /* renamed from: a  reason: collision with root package name */
    private final PowerManager f28315a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f28316b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28317c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28318d;

    public r3(Context context) {
        this.f28315a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void c() {
        PowerManager.WakeLock wakeLock = this.f28316b;
        if (wakeLock == null) {
            return;
        }
        if (this.f28317c && this.f28318d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f28316b == null) {
            PowerManager powerManager = this.f28315a;
            if (powerManager == null) {
                a5.t.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f28316b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f28317c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f28318d = z10;
        c();
    }
}
