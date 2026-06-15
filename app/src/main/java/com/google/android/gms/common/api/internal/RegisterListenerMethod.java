package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {

    /* renamed from: a  reason: collision with root package name */
    private final ListenerHolder<L> f12150a;

    /* renamed from: b  reason: collision with root package name */
    private final Feature[] f12151b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12152c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12153d;

    @KeepForSdk
    public void a() {
        this.f12150a.a();
    }

    @KeepForSdk
    public ListenerHolder.ListenerKey<L> b() {
        return this.f12150a.b();
    }

    @KeepForSdk
    public Feature[] c() {
        return this.f12151b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public abstract void d(A a10, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    public final int e() {
        return this.f12153d;
    }

    public final boolean f() {
        return this.f12152c;
    }
}
