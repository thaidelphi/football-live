package k0;

import androidx.lifecycle.k0;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f<T extends k0> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f27120a;

    /* renamed from: b  reason: collision with root package name */
    private final l<a, T> f27121b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Class<T> clazz, l<? super a, ? extends T> initializer) {
        n.f(clazz, "clazz");
        n.f(initializer, "initializer");
        this.f27120a = clazz;
        this.f27121b = initializer;
    }

    public final Class<T> a() {
        return this.f27120a;
    }

    public final l<a, T> b() {
        return this.f27121b;
    }
}
