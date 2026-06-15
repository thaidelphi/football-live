package androidx.lifecycle;

import k0.a;
/* compiled from: ViewModelProvider.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n0 {
    public static final k0.a a(p0 owner) {
        kotlin.jvm.internal.n.f(owner, "owner");
        if (owner instanceof h) {
            return ((h) owner).getDefaultViewModelCreationExtras();
        }
        return a.C0305a.f27116b;
    }
}
