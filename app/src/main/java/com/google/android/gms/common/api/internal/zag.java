package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zag<ResultT> extends zac {

    /* renamed from: b  reason: collision with root package name */
    private final TaskApiCall<Api.AnyClient, ResultT> f12378b;

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource<ResultT> f12379c;

    /* renamed from: d  reason: collision with root package name */
    private final StatusExceptionMapper f12380d;

    public zag(int i10, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i10);
        this.f12379c = taskCompletionSource;
        this.f12378b = taskApiCall;
        this.f12380d = statusExceptionMapper;
        if (i10 == 2 && taskApiCall.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        this.f12379c.trySetException(this.f12380d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(Exception exc) {
        this.f12379c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq<?> zabqVar) throws DeadObjectException {
        try {
            this.f12378b.b(zabqVar.s(), this.f12379c);
        } catch (DeadObjectException e8) {
            throw e8;
        } catch (RemoteException e10) {
            a(zai.e(e10));
        } catch (RuntimeException e11) {
            this.f12379c.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zaad zaadVar, boolean z10) {
        zaadVar.d(this.f12379c, z10);
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean f(zabq<?> zabqVar) {
        return this.f12378b.c();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] g(zabq<?> zabqVar) {
        return this.f12378b.e();
    }
}
