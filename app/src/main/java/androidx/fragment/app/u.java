package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u implements androidx.lifecycle.h, u0.d, p0 {

    /* renamed from: a  reason: collision with root package name */
    private final Fragment f3496a;

    /* renamed from: b  reason: collision with root package name */
    private final o0 f3497b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.lifecycle.r f3498c = null;

    /* renamed from: d  reason: collision with root package name */
    private u0.c f3499d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Fragment fragment, o0 o0Var) {
        this.f3496a = fragment;
        this.f3497b = o0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(i.a aVar) {
        this.f3498c.i(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f3498c == null) {
            this.f3498c = new androidx.lifecycle.r(this);
            this.f3499d = u0.c.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f3498c != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f3499d.d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f3499d.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(i.b bVar) {
        this.f3498c.o(bVar);
    }

    @Override // androidx.lifecycle.h
    public /* synthetic */ k0.a getDefaultViewModelCreationExtras() {
        return androidx.lifecycle.g.a(this);
    }

    @Override // androidx.lifecycle.p
    public androidx.lifecycle.i getLifecycle() {
        b();
        return this.f3498c;
    }

    @Override // u0.d
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f3499d.b();
    }

    @Override // androidx.lifecycle.p0
    public o0 getViewModelStore() {
        b();
        return this.f3497b;
    }
}
