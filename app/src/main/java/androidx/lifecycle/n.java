package androidx.lifecycle;

import d9.f1;
import d9.u2;
/* compiled from: Lifecycle.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n {
    public static final j a(i iVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        kotlin.jvm.internal.n.f(iVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) iVar.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(iVar, u2.b(null, 1, null).plus(f1.c().K0()));
        } while (!iVar.c().compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.h();
        return lifecycleCoroutineScopeImpl;
    }
}
