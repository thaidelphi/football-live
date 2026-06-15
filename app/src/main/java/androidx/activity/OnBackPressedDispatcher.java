package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import i8.w;
import java.util.Collection;
import java.util.ListIterator;
/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f728a;

    /* renamed from: b  reason: collision with root package name */
    private final j8.h<j> f729b = new j8.h<>();

    /* renamed from: c  reason: collision with root package name */
    private t8.a<w> f730c;

    /* renamed from: d  reason: collision with root package name */
    private OnBackInvokedCallback f731d;

    /* renamed from: e  reason: collision with root package name */
    private OnBackInvokedDispatcher f732e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f733f;

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.m, androidx.activity.a {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.lifecycle.i f734a;

        /* renamed from: b  reason: collision with root package name */
        private final j f735b;

        /* renamed from: c  reason: collision with root package name */
        private androidx.activity.a f736c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f737d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, androidx.lifecycle.i lifecycle, j onBackPressedCallback) {
            kotlin.jvm.internal.n.f(lifecycle, "lifecycle");
            kotlin.jvm.internal.n.f(onBackPressedCallback, "onBackPressedCallback");
            this.f737d = onBackPressedDispatcher;
            this.f734a = lifecycle;
            this.f735b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f734a.d(this);
            this.f735b.e(this);
            androidx.activity.a aVar = this.f736c;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f736c = null;
        }

        @Override // androidx.lifecycle.m
        public void onStateChanged(p source, i.a event) {
            kotlin.jvm.internal.n.f(source, "source");
            kotlin.jvm.internal.n.f(event, "event");
            if (event == i.a.ON_START) {
                this.f736c = this.f737d.c(this.f735b);
            } else if (event == i.a.ON_STOP) {
                androidx.activity.a aVar = this.f736c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (event == i.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.a<w> {
        a() {
            super(0);
        }

        @Override // t8.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f26638a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.g();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends kotlin.jvm.internal.o implements t8.a<w> {
        b() {
            super(0);
        }

        @Override // t8.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f26638a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.e();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f740a = new c();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(t8.a onBackInvoked) {
            kotlin.jvm.internal.n.f(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback b(final t8.a<w> onBackInvoked) {
            kotlin.jvm.internal.n.f(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.k
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.c.c(t8.a.this);
                }
            };
        }

        public final void d(Object dispatcher, int i10, Object callback) {
            kotlin.jvm.internal.n.f(dispatcher, "dispatcher");
            kotlin.jvm.internal.n.f(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            kotlin.jvm.internal.n.f(dispatcher, "dispatcher");
            kotlin.jvm.internal.n.f(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class d implements androidx.activity.a {

        /* renamed from: a  reason: collision with root package name */
        private final j f741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f742b;

        public d(OnBackPressedDispatcher onBackPressedDispatcher, j onBackPressedCallback) {
            kotlin.jvm.internal.n.f(onBackPressedCallback, "onBackPressedCallback");
            this.f742b = onBackPressedDispatcher;
            this.f741a = onBackPressedCallback;
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f742b.f729b.remove(this.f741a);
            this.f741a.e(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f741a.g(null);
                this.f742b.g();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f728a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f730c = new a();
            this.f731d = c.f740a.b(new b());
        }
    }

    public final void b(p owner, j onBackPressedCallback) {
        kotlin.jvm.internal.n.f(owner, "owner");
        kotlin.jvm.internal.n.f(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.i lifecycle = owner.getLifecycle();
        if (lifecycle.b() == i.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            onBackPressedCallback.g(this.f730c);
        }
    }

    public final androidx.activity.a c(j onBackPressedCallback) {
        kotlin.jvm.internal.n.f(onBackPressedCallback, "onBackPressedCallback");
        this.f729b.add(onBackPressedCallback);
        d dVar = new d(this, onBackPressedCallback);
        onBackPressedCallback.a(dVar);
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            onBackPressedCallback.g(this.f730c);
        }
        return dVar;
    }

    public final boolean d() {
        j8.h<j> hVar = this.f729b;
        if ((hVar instanceof Collection) && hVar.isEmpty()) {
            return false;
        }
        for (j jVar : hVar) {
            if (jVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        j jVar;
        j8.h<j> hVar = this.f729b;
        ListIterator<j> listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                jVar = null;
                break;
            }
            jVar = listIterator.previous();
            if (jVar.c()) {
                break;
            }
        }
        j jVar2 = jVar;
        if (jVar2 != null) {
            jVar2.b();
            return;
        }
        Runnable runnable = this.f728a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.n.f(invoker, "invoker");
        this.f732e = invoker;
        g();
    }

    public final void g() {
        boolean d10 = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f732e;
        OnBackInvokedCallback onBackInvokedCallback = this.f731d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (d10 && !this.f733f) {
            c.f740a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f733f = true;
        } else if (d10 || !this.f733f) {
        } else {
            c.f740a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f733f = false;
        }
    }
}
