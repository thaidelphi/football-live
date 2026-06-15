package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.l0;
import androidx.savedstate.a;
import k0.a;
/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b<u0.d> f3617a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b<p0> f3618b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<Bundle> f3619c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements a.b<u0.d> {
        b() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c implements a.b<p0> {
        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d extends kotlin.jvm.internal.o implements t8.l<k0.a, g0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f3620a = new d();

        d() {
            super(1);
        }

        @Override // t8.l
        /* renamed from: a */
        public final g0 invoke(k0.a initializer) {
            kotlin.jvm.internal.n.f(initializer, "$this$initializer");
            return new g0();
        }
    }

    public static final d0 a(k0.a aVar) {
        kotlin.jvm.internal.n.f(aVar, "<this>");
        u0.d dVar = (u0.d) aVar.a(f3617a);
        if (dVar != null) {
            p0 p0Var = (p0) aVar.a(f3618b);
            if (p0Var != null) {
                Bundle bundle = (Bundle) aVar.a(f3619c);
                String str = (String) aVar.a(l0.c.f3666d);
                if (str != null) {
                    return b(dVar, p0Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    private static final d0 b(u0.d dVar, p0 p0Var, String str, Bundle bundle) {
        f0 d10 = d(dVar);
        g0 e8 = e(p0Var);
        d0 d0Var = e8.f().get(str);
        if (d0Var == null) {
            d0 a10 = d0.f3610f.a(d10.b(str), bundle);
            e8.f().put(str, a10);
            return a10;
        }
        return d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends u0.d & p0> void c(T t10) {
        kotlin.jvm.internal.n.f(t10, "<this>");
        i.b b10 = t10.getLifecycle().b();
        if (b10 == i.b.INITIALIZED || b10 == i.b.CREATED) {
            if (t10.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
                f0 f0Var = new f0(t10.getSavedStateRegistry(), t10);
                t10.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", f0Var);
                t10.getLifecycle().a(new SavedStateHandleAttacher(f0Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final f0 d(u0.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        a.c c10 = dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        f0 f0Var = c10 instanceof f0 ? (f0) c10 : null;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final g0 e(p0 p0Var) {
        kotlin.jvm.internal.n.f(p0Var, "<this>");
        k0.c cVar = new k0.c();
        cVar.a(kotlin.jvm.internal.b0.b(g0.class), d.f3620a);
        return (g0) new l0(p0Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", g0.class);
    }
}
