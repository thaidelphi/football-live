package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Feature[] f12160a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12161b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12162c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Builder<A extends Api.AnyClient, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        private RemoteCall<A, TaskCompletionSource<ResultT>> f12163a;

        /* renamed from: c  reason: collision with root package name */
        private Feature[] f12165c;

        /* renamed from: b  reason: collision with root package name */
        private boolean f12164b = true;

        /* renamed from: d  reason: collision with root package name */
        private int f12166d = 0;

        private Builder() {
        }

        /* synthetic */ Builder(zacw zacwVar) {
        }

        @KeepForSdk
        public TaskApiCall<A, ResultT> a() {
            Preconditions.b(this.f12163a != null, "execute parameter required");
            return new f0(this, this.f12165c, this.f12164b, this.f12166d);
        }

        @KeepForSdk
        public Builder<A, ResultT> b(RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.f12163a = remoteCall;
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> c(boolean z10) {
            this.f12164b = z10;
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> d(Feature... featureArr) {
            this.f12165c = featureArr;
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> e(int i10) {
            this.f12166d = i10;
            return this;
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.f12160a = null;
        this.f12161b = false;
        this.f12162c = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public TaskApiCall(Feature[] featureArr, boolean z10, int i10) {
        this.f12160a = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.f12161b = z11;
        this.f12162c = i10;
    }

    @KeepForSdk
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> a() {
        return new Builder<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public abstract void b(A a10, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    public boolean c() {
        return this.f12161b;
    }

    public final int d() {
        return this.f12162c;
    }

    public final Feature[] e() {
        return this.f12160a;
    }
}
