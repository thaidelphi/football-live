package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void a(R r10) {
        Status a10 = r10.a();
        if (a10.z0()) {
            c(r10);
            return;
        }
        b(a10);
        if (r10 instanceof Releasable) {
            try {
                ((Releasable) r10).release();
            } catch (RuntimeException e8) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r10)), e8);
            }
        }
    }

    public abstract void b(Status status);

    public abstract void c(R r10);
}
