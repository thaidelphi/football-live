package k0;

import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import kotlin.jvm.internal.n;
/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b implements l0.b {

    /* renamed from: b  reason: collision with root package name */
    private final f<?>[] f27117b;

    public b(f<?>... initializers) {
        n.f(initializers, "initializers");
        this.f27117b = initializers;
    }

    @Override // androidx.lifecycle.l0.b
    public /* synthetic */ k0 a(Class cls) {
        return m0.a(this, cls);
    }

    @Override // androidx.lifecycle.l0.b
    public <T extends k0> T b(Class<T> modelClass, a extras) {
        f<?>[] fVarArr;
        n.f(modelClass, "modelClass");
        n.f(extras, "extras");
        T t10 = null;
        for (f<?> fVar : this.f27117b) {
            if (n.a(fVar.a(), modelClass)) {
                Object invoke = fVar.b().invoke(extras);
                t10 = invoke instanceof k0 ? (T) invoke : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
