package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.i;
/* compiled from: ServiceLifecycleDispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final r f3643a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3644b;

    /* renamed from: c  reason: collision with root package name */
    private a f3645c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final r f3646a;

        /* renamed from: b  reason: collision with root package name */
        private final i.a f3647b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3648c;

        public a(r registry, i.a event) {
            kotlin.jvm.internal.n.f(registry, "registry");
            kotlin.jvm.internal.n.f(event, "event");
            this.f3646a = registry;
            this.f3647b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3648c) {
                return;
            }
            this.f3646a.i(this.f3647b);
            this.f3648c = true;
        }
    }

    public j0(p provider) {
        kotlin.jvm.internal.n.f(provider, "provider");
        this.f3643a = new r(provider);
        this.f3644b = new Handler();
    }

    private final void f(i.a aVar) {
        a aVar2 = this.f3645c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f3643a, aVar);
        this.f3645c = aVar3;
        Handler handler = this.f3644b;
        kotlin.jvm.internal.n.c(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public i a() {
        return this.f3643a;
    }

    public void b() {
        f(i.a.ON_START);
    }

    public void c() {
        f(i.a.ON_CREATE);
    }

    public void d() {
        f(i.a.ON_STOP);
        f(i.a.ON_DESTROY);
    }

    public void e() {
        f(i.a.ON_START);
    }
}
