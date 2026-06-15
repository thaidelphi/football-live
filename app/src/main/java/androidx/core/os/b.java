package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
/* compiled from: Bundle.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2669a = new b();

    private b() {
    }

    public static final void a(Bundle bundle, String key, IBinder iBinder) {
        kotlin.jvm.internal.n.f(bundle, "bundle");
        kotlin.jvm.internal.n.f(key, "key");
        bundle.putBinder(key, iBinder);
    }
}
