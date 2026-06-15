package androidx.lifecycle;

import androidx.lifecycle.i;
import i8.o;
/* compiled from: WithLifecycleState.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i.b f3584a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f3585b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d9.n<Object> f3586c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ t8.a<Object> f3587d;

    @Override // androidx.lifecycle.m
    public void onStateChanged(p source, i.a event) {
        Object b10;
        kotlin.jvm.internal.n.f(source, "source");
        kotlin.jvm.internal.n.f(event, "event");
        if (event == i.a.Companion.c(this.f3584a)) {
            this.f3585b.d(this);
            d9.n<Object> nVar = this.f3586c;
            t8.a<Object> aVar = this.f3587d;
            try {
                o.a aVar2 = i8.o.f26626b;
                b10 = i8.o.b(aVar.invoke());
            } catch (Throwable th) {
                o.a aVar3 = i8.o.f26626b;
                b10 = i8.o.b(i8.p.a(th));
            }
            nVar.resumeWith(b10);
        } else if (event == i.a.ON_DESTROY) {
            this.f3585b.d(this);
            d9.n<Object> nVar2 = this.f3586c;
            o.a aVar4 = i8.o.f26626b;
            nVar2.resumeWith(i8.o.b(i8.p.a(new k())));
        }
    }
}
