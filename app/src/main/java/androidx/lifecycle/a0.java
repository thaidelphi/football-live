package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.b0;
import androidx.lifecycle.i;
/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a0 implements p {

    /* renamed from: i  reason: collision with root package name */
    public static final b f3588i = new b(null);

    /* renamed from: j  reason: collision with root package name */
    private static final a0 f3589j = new a0();

    /* renamed from: a  reason: collision with root package name */
    private int f3590a;

    /* renamed from: b  reason: collision with root package name */
    private int f3591b;

    /* renamed from: e  reason: collision with root package name */
    private Handler f3594e;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3592c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3593d = true;

    /* renamed from: f  reason: collision with root package name */
    private final r f3595f = new r(this);

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f3596g = new Runnable() { // from class: androidx.lifecycle.z
        @Override // java.lang.Runnable
        public final void run() {
            a0.i(a0.this);
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private final b0.a f3597h = new d();

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3598a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.n.f(activity, "activity");
            kotlin.jvm.internal.n.f(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final p a() {
            return a0.f3589j;
        }

        public final void b(Context context) {
            kotlin.jvm.internal.n.f(context, "context");
            a0.f3589j.h(context);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c extends e {

        /* compiled from: ProcessLifecycleOwner.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a extends e {
            final /* synthetic */ a0 this$0;

            a(a0 a0Var) {
                this.this$0 = a0Var;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                kotlin.jvm.internal.n.f(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                kotlin.jvm.internal.n.f(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.n.f(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                b0.f3607b.b(activity).f(a0.this.f3597h);
            }
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.n.f(activity, "activity");
            a0.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.n.f(activity, "activity");
            a.a(activity, new a(a0.this));
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.n.f(activity, "activity");
            a0.this.g();
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d implements b0.a {
        d() {
        }

        @Override // androidx.lifecycle.b0.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.b0.a
        public void onResume() {
            a0.this.e();
        }

        @Override // androidx.lifecycle.b0.a
        public void onStart() {
            a0.this.f();
        }
    }

    private a0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(a0 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    public static final p l() {
        return f3588i.a();
    }

    public final void d() {
        int i10 = this.f3591b - 1;
        this.f3591b = i10;
        if (i10 == 0) {
            Handler handler = this.f3594e;
            kotlin.jvm.internal.n.c(handler);
            handler.postDelayed(this.f3596g, 700L);
        }
    }

    public final void e() {
        int i10 = this.f3591b + 1;
        this.f3591b = i10;
        if (i10 == 1) {
            if (this.f3592c) {
                this.f3595f.i(i.a.ON_RESUME);
                this.f3592c = false;
                return;
            }
            Handler handler = this.f3594e;
            kotlin.jvm.internal.n.c(handler);
            handler.removeCallbacks(this.f3596g);
        }
    }

    public final void f() {
        int i10 = this.f3590a + 1;
        this.f3590a = i10;
        if (i10 == 1 && this.f3593d) {
            this.f3595f.i(i.a.ON_START);
            this.f3593d = false;
        }
    }

    public final void g() {
        this.f3590a--;
        k();
    }

    @Override // androidx.lifecycle.p
    public i getLifecycle() {
        return this.f3595f;
    }

    public final void h(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        this.f3594e = new Handler();
        this.f3595f.i(i.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f3591b == 0) {
            this.f3592c = true;
            this.f3595f.i(i.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f3590a == 0 && this.f3592c) {
            this.f3595f.i(i.a.ON_STOP);
            this.f3593d = true;
        }
    }
}
