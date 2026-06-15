package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: LifecycleDispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f3652a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f3653b = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends e {
        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.n.f(activity, "activity");
            b0.f3607b.c(activity);
        }
    }

    private l() {
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        if (f3653b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
