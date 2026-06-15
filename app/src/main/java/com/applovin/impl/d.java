package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class d {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends com.applovin.impl.b {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference f6783a = new WeakReference(null);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f6784b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f6785c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f6786d;

        a(Class cls, b bVar, c cVar) {
            this.f6784b = cls;
            this.f6785c = bVar;
            this.f6786d = cVar;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f6784b.isInstance(activity) && this.f6783a.get() == null) {
                this.f6783a = new WeakReference(activity);
                this.f6785c.a(activity);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f6784b.isInstance(activity) && !activity.isChangingConfigurations() && this.f6783a.get() == activity) {
                this.f6786d.b(this);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(Activity activity);
    }

    public static void a(Context context, Class cls, c cVar, b bVar) {
        cVar.a(new a(cls, bVar, cVar));
        a(context, cls);
    }

    public static void a(Context context, Class cls) {
        Intent intent = new Intent(context, cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void a(boolean z10, Activity activity) {
        if (z10 && l0.b()) {
            WindowInsetsController insetsController = activity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsBehavior(2);
                insetsController.hide(WindowInsets.Type.systemBars());
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public static boolean a(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || (l0.d() && activity.isDestroyed());
    }

    public static Activity a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
