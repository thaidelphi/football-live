package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f12060a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12061b;

    @Override // com.google.android.gms.common.api.ResultCallbacks
    @KeepForSdk
    public final void b(Status status) {
        if (status.y0()) {
            try {
                status.C0(this.f12060a, this.f12061b);
                return;
            } catch (IntentSender.SendIntentException e8) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", e8);
                d(new Status(8));
                return;
            }
        }
        d(status);
    }

    public abstract void d(Status status);
}
