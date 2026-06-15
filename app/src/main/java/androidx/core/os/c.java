package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
/* compiled from: Bundle.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f2670a = new c();

    private c() {
    }

    public static final void a(Bundle bundle, String key, Size size) {
        kotlin.jvm.internal.n.f(bundle, "bundle");
        kotlin.jvm.internal.n.f(key, "key");
        bundle.putSize(key, size);
    }

    public static final void b(Bundle bundle, String key, SizeF sizeF) {
        kotlin.jvm.internal.n.f(bundle, "bundle");
        kotlin.jvm.internal.n.f(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
