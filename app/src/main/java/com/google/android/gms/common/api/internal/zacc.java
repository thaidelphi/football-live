package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zacc extends zap {

    /* renamed from: e  reason: collision with root package name */
    private TaskCompletionSource<Void> f12345e;

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void b(ConnectionResult connectionResult, int i10) {
        String n02 = connectionResult.n0();
        if (n02 == null) {
            n02 = "Error connecting to Google Play services";
        }
        this.f12345e.setException(new ApiException(new Status(connectionResult, n02, connectionResult.X())));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void c() {
        Activity c10 = this.mLifecycleFragment.c();
        if (c10 == null) {
            this.f12345e.trySetException(new ApiException(new Status(8)));
            return;
        }
        int i10 = this.f12392d.i(c10);
        if (i10 == 0) {
            this.f12345e.trySetResult(null);
        } else if (this.f12345e.getTask().isComplete()) {
        } else {
            h(new ConnectionResult(i10, null), 0);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        this.f12345e.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }
}
