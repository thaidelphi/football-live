package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BaseImplementation {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        @KeepForSdk

        /* renamed from: q  reason: collision with root package name */
        private final Api.AnyClientKey<A> f12087q;
        @KeepForSdk

        /* renamed from: r  reason: collision with root package name */
        private final Api<?> f12088r;

        @KeepForSdk
        private void u(RemoteException remoteException) {
            v(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public /* bridge */ /* synthetic */ void a(Object obj) {
            super.h((Result) obj);
        }

        @KeepForSdk
        protected abstract void p(A a10) throws RemoteException;

        @KeepForSdk
        public final Api<?> q() {
            return this.f12088r;
        }

        @KeepForSdk
        public final Api.AnyClientKey<A> r() {
            return this.f12087q;
        }

        @KeepForSdk
        protected void s(R r10) {
        }

        @KeepForSdk
        public final void t(A a10) throws DeadObjectException {
            try {
                p(a10);
            } catch (DeadObjectException e8) {
                u(e8);
                throw e8;
            } catch (RemoteException e10) {
                u(e10);
            }
        }

        @KeepForSdk
        public final void v(Status status) {
            Preconditions.b(!status.z0(), "Failed result must not be success");
            R d10 = d(status);
            h(d10);
            s(d10);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface ResultHolder<R> {
        @KeepForSdk
        void a(R r10);
    }
}
