package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
/* compiled from: FragmentHostCallback.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class h<E> extends e {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f3367a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3368b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f3369c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3370d;

    /* renamed from: e  reason: collision with root package name */
    final FragmentManager f3371e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @Override // androidx.fragment.app.e
    public View c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.e
    public boolean d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity e() {
        return this.f3367a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f3368b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler g() {
        return this.f3369c;
    }

    public abstract E h();

    public LayoutInflater i() {
        return LayoutInflater.from(this.f3368b);
    }

    public boolean j(Fragment fragment) {
        return true;
    }

    public void k(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.content.a.j(this.f3368b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void l(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.b.v(this.f3367a, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void m() {
    }

    h(Activity activity, Context context, Handler handler, int i10) {
        this.f3371e = new k();
        this.f3367a = activity;
        this.f3368b = (Context) androidx.core.util.i.g(context, "context == null");
        this.f3369c = (Handler) androidx.core.util.i.g(handler, "handler == null");
        this.f3370d = i10;
    }
}
