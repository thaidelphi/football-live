package a5;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
/* compiled from: SystemClock.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i0 implements d {
    @Override // a5.d
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // a5.d
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // a5.d
    public p d(Looper looper, Handler.Callback callback) {
        return new j0(new Handler(looper, callback));
    }

    @Override // a5.d
    public void e() {
    }
}
