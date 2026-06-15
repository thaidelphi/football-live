package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.i;
import androidx.savedstate.a;
/* compiled from: LegacySavedStateHandleController.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a  reason: collision with root package name */
    public static final LegacySavedStateHandleController f3535a = new LegacySavedStateHandleController();

    /* compiled from: LegacySavedStateHandleController.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements a.InterfaceC0077a {
        @Override // androidx.savedstate.a.InterfaceC0077a
        public void a(u0.d owner) {
            kotlin.jvm.internal.n.f(owner, "owner");
            if (owner instanceof p0) {
                o0 viewModelStore = ((p0) owner).getViewModelStore();
                androidx.savedstate.a savedStateRegistry = owner.getSavedStateRegistry();
                for (String str : viewModelStore.c()) {
                    k0 b10 = viewModelStore.b(str);
                    kotlin.jvm.internal.n.c(b10);
                    LegacySavedStateHandleController.a(b10, savedStateRegistry, owner.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.i(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(k0 viewModel, androidx.savedstate.a registry, i lifecycle) {
        kotlin.jvm.internal.n.f(viewModel, "viewModel");
        kotlin.jvm.internal.n.f(registry, "registry");
        kotlin.jvm.internal.n.f(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.i()) {
            return;
        }
        savedStateHandleController.g(registry, lifecycle);
        f3535a.c(registry, lifecycle);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a registry, i lifecycle, String str, Bundle bundle) {
        kotlin.jvm.internal.n.f(registry, "registry");
        kotlin.jvm.internal.n.f(lifecycle, "lifecycle");
        kotlin.jvm.internal.n.c(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, d0.f3610f.a(registry.b(str), bundle));
        savedStateHandleController.g(registry, lifecycle);
        f3535a.c(registry, lifecycle);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a aVar, final i iVar) {
        i.b b10 = iVar.b();
        if (b10 != i.b.INITIALIZED && !b10.b(i.b.STARTED)) {
            iVar.a(new m() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.m
                public void onStateChanged(p source, i.a event) {
                    kotlin.jvm.internal.n.f(source, "source");
                    kotlin.jvm.internal.n.f(event, "event");
                    if (event == i.a.ON_START) {
                        i.this.d(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        } else {
            aVar.i(a.class);
        }
    }
}
