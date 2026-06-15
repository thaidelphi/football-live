package androidx.lifecycle;

import androidx.lifecycle.i;
/* compiled from: CompositeGeneratedAdaptersObserver.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class CompositeGeneratedAdaptersObserver implements m {

    /* renamed from: a  reason: collision with root package name */
    private final f[] f3531a;

    public CompositeGeneratedAdaptersObserver(f[] generatedAdapters) {
        kotlin.jvm.internal.n.f(generatedAdapters, "generatedAdapters");
        this.f3531a = generatedAdapters;
    }

    @Override // androidx.lifecycle.m
    public void onStateChanged(p source, i.a event) {
        kotlin.jvm.internal.n.f(source, "source");
        kotlin.jvm.internal.n.f(event, "event");
        v vVar = new v();
        for (f fVar : this.f3531a) {
            fVar.a(source, event, false, vVar);
        }
        for (f fVar2 : this.f3531a) {
            fVar2.a(source, event, true, vVar);
        }
    }
}
