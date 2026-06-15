package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ViewModelStore.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, k0> f3668a = new LinkedHashMap();

    public final void a() {
        for (k0 k0Var : this.f3668a.values()) {
            k0Var.a();
        }
        this.f3668a.clear();
    }

    public final k0 b(String key) {
        kotlin.jvm.internal.n.f(key, "key");
        return this.f3668a.get(key);
    }

    public final Set<String> c() {
        return new HashSet(this.f3668a.keySet());
    }

    public final void d(String key, k0 viewModel) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(viewModel, "viewModel");
        k0 put = this.f3668a.put(key, viewModel);
        if (put != null) {
            put.d();
        }
    }
}
