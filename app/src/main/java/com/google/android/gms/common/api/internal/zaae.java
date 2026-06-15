package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaae extends zap {

    /* renamed from: e  reason: collision with root package name */
    private final androidx.collection.b<ApiKey<?>> f12263e;

    /* renamed from: f  reason: collision with root package name */
    private final GoogleApiManager f12264f;

    @VisibleForTesting
    zaae(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.f12263e = new androidx.collection.b<>();
        this.f12264f = googleApiManager;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    public static void j(Activity activity, GoogleApiManager googleApiManager, ApiKey<?> apiKey) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zaae zaaeVar = (zaae) fragment.b("ConnectionlessLifecycleHelper", zaae.class);
        if (zaaeVar == null) {
            zaaeVar = new zaae(fragment, googleApiManager, GoogleApiAvailability.q());
        }
        Preconditions.n(apiKey, "ApiKey cannot be null");
        zaaeVar.f12263e.add(apiKey);
        googleApiManager.c(zaaeVar);
    }

    private final void k() {
        if (this.f12263e.isEmpty()) {
            return;
        }
        this.f12264f.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void b(ConnectionResult connectionResult, int i10) {
        this.f12264f.J(connectionResult, i10);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void c() {
        this.f12264f.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final androidx.collection.b<ApiKey<?>> i() {
        return this.f12263e;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.f12264f.d(this);
    }
}
