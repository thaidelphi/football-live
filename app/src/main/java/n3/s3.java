package n3;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.ironsource.x8;
/* compiled from: WifiLockManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class s3 {

    /* renamed from: a  reason: collision with root package name */
    private final WifiManager f28347a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f28348b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28349c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28350d;

    public s3(Context context) {
        this.f28347a = (WifiManager) context.getApplicationContext().getSystemService(x8.f21379b);
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f28348b;
        if (wifiLock == null) {
            return;
        }
        if (this.f28349c && this.f28350d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f28348b == null) {
            WifiManager wifiManager = this.f28347a;
            if (wifiManager == null) {
                a5.t.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f28348b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f28349c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f28350d = z10;
        c();
    }
}
