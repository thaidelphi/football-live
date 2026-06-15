package androidx.lifecycle;

import androidx.lifecycle.l0;
/* compiled from: ViewModelProvider.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final /* synthetic */ class m0 {
    static {
        l0.b.a aVar = l0.b.f3662a;
    }

    public static k0 a(l0.b bVar, Class modelClass) {
        kotlin.jvm.internal.n.f(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static k0 b(l0.b bVar, Class modelClass, k0.a extras) {
        kotlin.jvm.internal.n.f(modelClass, "modelClass");
        kotlin.jvm.internal.n.f(extras, "extras");
        return bVar.a(modelClass);
    }
}
