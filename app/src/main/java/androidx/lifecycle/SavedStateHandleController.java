package androidx.lifecycle;

import androidx.lifecycle.i;
/* compiled from: SavedStateHandleController.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SavedStateHandleController implements m {

    /* renamed from: a  reason: collision with root package name */
    private final String f3580a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f3581b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3582c;

    public SavedStateHandleController(String key, d0 handle) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(handle, "handle");
        this.f3580a = key;
        this.f3581b = handle;
    }

    public final void g(androidx.savedstate.a registry, i lifecycle) {
        kotlin.jvm.internal.n.f(registry, "registry");
        kotlin.jvm.internal.n.f(lifecycle, "lifecycle");
        if (!this.f3582c) {
            this.f3582c = true;
            lifecycle.a(this);
            registry.h(this.f3580a, this.f3581b.c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final d0 h() {
        return this.f3581b;
    }

    public final boolean i() {
        return this.f3582c;
    }

    @Override // androidx.lifecycle.m
    public void onStateChanged(p source, i.a event) {
        kotlin.jvm.internal.n.f(source, "source");
        kotlin.jvm.internal.n.f(event, "event");
        if (event == i.a.ON_DESTROY) {
            this.f3582c = false;
            source.getLifecycle().d(this);
        }
    }
}
