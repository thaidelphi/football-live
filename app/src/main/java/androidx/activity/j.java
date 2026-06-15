package androidx.activity;

import i8.w;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: OnBackPressedCallback.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private boolean f757a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f758b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private t8.a<w> f759c;

    public j(boolean z10) {
        this.f757a = z10;
    }

    public final void a(a cancellable) {
        kotlin.jvm.internal.n.f(cancellable, "cancellable");
        this.f758b.add(cancellable);
    }

    public abstract void b();

    public final boolean c() {
        return this.f757a;
    }

    public final void d() {
        for (a aVar : this.f758b) {
            aVar.cancel();
        }
    }

    public final void e(a cancellable) {
        kotlin.jvm.internal.n.f(cancellable, "cancellable");
        this.f758b.remove(cancellable);
    }

    public final void f(boolean z10) {
        this.f757a = z10;
        t8.a<w> aVar = this.f759c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void g(t8.a<w> aVar) {
        this.f759c = aVar;
    }
}
