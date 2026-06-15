package l2;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
/* compiled from: FirstFrameAndAfterTrimMemoryWaiter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class i implements k, ComponentCallbacks2 {
    @Override // l2.k
    public void a(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
    }
}
