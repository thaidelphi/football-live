package u0;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: SavedStateRegistryController.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f31271d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final d f31272a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.savedstate.a f31273b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f31274c;

    /* compiled from: SavedStateRegistryController.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(d owner) {
            n.f(owner, "owner");
            return new c(owner, null);
        }
    }

    private c(d dVar) {
        this.f31272a = dVar;
        this.f31273b = new androidx.savedstate.a();
    }

    public /* synthetic */ c(d dVar, h hVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f31271d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f31273b;
    }

    public final void c() {
        i lifecycle = this.f31272a.getLifecycle();
        if (lifecycle.b() == i.b.INITIALIZED) {
            lifecycle.a(new Recreator(this.f31272a));
            this.f31273b.e(lifecycle);
            this.f31274c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void d(Bundle bundle) {
        if (!this.f31274c) {
            c();
        }
        i lifecycle = this.f31272a.getLifecycle();
        if (!lifecycle.b().b(i.b.STARTED)) {
            this.f31273b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle outBundle) {
        n.f(outBundle, "outBundle");
        this.f31273b.g(outBundle);
    }
}
