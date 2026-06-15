package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    protected volatile boolean f12389a;

    /* renamed from: b  reason: collision with root package name */
    protected final AtomicReference<l0> f12390b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f12391c;

    /* renamed from: d  reason: collision with root package name */
    protected final GoogleApiAvailability f12392d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.f12390b = new AtomicReference<>(null);
        this.f12391c = new zaq(Looper.getMainLooper());
        this.f12392d = googleApiAvailability;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ConnectionResult connectionResult, int i10) {
        this.f12390b.set(null);
        b(connectionResult, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        this.f12390b.set(null);
        c();
    }

    private static final int e(l0 l0Var) {
        if (l0Var == null) {
            return -1;
        }
        return l0Var.a();
    }

    protected abstract void b(ConnectionResult connectionResult, int i10);

    protected abstract void c();

    public final void h(ConnectionResult connectionResult, int i10) {
        l0 l0Var = new l0(connectionResult, i10);
        if (this.f12390b.compareAndSet(null, l0Var)) {
            this.f12391c.post(new n0(this, l0Var));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i10, int i11, Intent intent) {
        l0 l0Var = this.f12390b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int i12 = this.f12392d.i(getActivity());
                if (i12 == 0) {
                    d();
                    return;
                } else if (l0Var == null) {
                    return;
                } else {
                    if (l0Var.b().X() == 18 && i12 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            d();
            return;
        } else if (i11 == 0) {
            if (l0Var == null) {
                return;
            }
            a(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, l0Var.b().toString()), e(l0Var));
            return;
        }
        if (l0Var != null) {
            a(l0Var.b(), l0Var.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, null), e(this.f12390b.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f12390b.set(bundle.getBoolean("resolving_error", false) ? new l0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        l0 l0Var = this.f12390b.get();
        if (l0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", l0Var.a());
        bundle.putInt("failed_status", l0Var.b().X());
        bundle.putParcelable("failed_resolution", l0Var.b().o0());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f12389a = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.f12389a = false;
    }
}
