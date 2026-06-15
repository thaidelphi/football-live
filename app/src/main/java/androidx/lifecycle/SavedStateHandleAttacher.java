package androidx.lifecycle;

import androidx.lifecycle.i;
/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SavedStateHandleAttacher implements m {

    /* renamed from: a  reason: collision with root package name */
    private final f0 f3579a;

    public SavedStateHandleAttacher(f0 provider) {
        kotlin.jvm.internal.n.f(provider, "provider");
        this.f3579a = provider;
    }

    @Override // androidx.lifecycle.m
    public void onStateChanged(p source, i.a event) {
        kotlin.jvm.internal.n.f(source, "source");
        kotlin.jvm.internal.n.f(event, "event");
        if (event == i.a.ON_CREATE) {
            source.getLifecycle().d(this);
            this.f3579a.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}
