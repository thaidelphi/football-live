package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class i0<T> extends zac {

    /* renamed from: b  reason: collision with root package name */
    protected final TaskCompletionSource<T> f12217b;

    public i0(int i10, TaskCompletionSource<T> taskCompletionSource) {
        super(i10);
        this.f12217b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        this.f12217b.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(Exception exc) {
        this.f12217b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq<?> zabqVar) throws DeadObjectException {
        try {
            h(zabqVar);
        } catch (DeadObjectException e8) {
            a(zai.e(e8));
            throw e8;
        } catch (RemoteException e10) {
            a(zai.e(e10));
        } catch (RuntimeException e11) {
            this.f12217b.trySetException(e11);
        }
    }

    protected abstract void h(zabq<?> zabqVar) throws RemoteException;
}
