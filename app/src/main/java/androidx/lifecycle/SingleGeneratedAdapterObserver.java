package androidx.lifecycle;

import androidx.lifecycle.i;
/* compiled from: SingleGeneratedAdapterObserver.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SingleGeneratedAdapterObserver implements m {

    /* renamed from: a  reason: collision with root package name */
    private final f f3583a;

    public SingleGeneratedAdapterObserver(f generatedAdapter) {
        kotlin.jvm.internal.n.f(generatedAdapter, "generatedAdapter");
        this.f3583a = generatedAdapter;
    }

    @Override // androidx.lifecycle.m
    public void onStateChanged(p source, i.a event) {
        kotlin.jvm.internal.n.f(source, "source");
        kotlin.jvm.internal.n.f(event, "event");
        this.f3583a.a(source, event, false, null);
        this.f3583a.a(source, event, true, null);
    }
}
