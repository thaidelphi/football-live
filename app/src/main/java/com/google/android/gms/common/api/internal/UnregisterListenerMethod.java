package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {

    /* renamed from: a  reason: collision with root package name */
    private final ListenerHolder.ListenerKey<L> f12167a;

    @KeepForSdk
    public ListenerHolder.ListenerKey<L> a() {
        return this.f12167a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public abstract void b(A a10, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
