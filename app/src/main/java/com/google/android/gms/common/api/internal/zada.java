package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zada<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {

    /* renamed from: a  reason: collision with root package name */
    private ResultTransform<? super R, ? extends Result> f12366a;

    /* renamed from: b  reason: collision with root package name */
    private zada<? extends Result> f12367b;

    /* renamed from: c  reason: collision with root package name */
    private volatile ResultCallbacks<? super R> f12368c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f12369d;

    /* renamed from: e  reason: collision with root package name */
    private Status f12370e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<GoogleApiClient> f12371f;

    /* renamed from: g  reason: collision with root package name */
    private final h0 f12372g;

    private final void g(Status status) {
        synchronized (this.f12369d) {
            this.f12370e = status;
            h(status);
        }
    }

    private final void h(Status status) {
        synchronized (this.f12369d) {
            ResultTransform<? super R, ? extends Result> resultTransform = this.f12366a;
            if (resultTransform != null) {
                ((zada) Preconditions.m(this.f12367b)).g((Status) Preconditions.n(resultTransform.a(status), "onFailure must not return null"));
            } else if (i()) {
                ((ResultCallbacks) Preconditions.m(this.f12368c)).b(status);
            }
        }
    }

    private final boolean i() {
        return (this.f12368c == null || this.f12371f.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e8) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(result)), e8);
            }
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void a(R r10) {
        synchronized (this.f12369d) {
            if (!r10.a().z0()) {
                g(r10.a());
                j(r10);
            } else if (this.f12366a != null) {
                zaco.a().submit(new g0(this, r10));
            } else if (i()) {
                ((ResultCallbacks) Preconditions.m(this.f12368c)).c(r10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.f12368c = null;
    }
}
