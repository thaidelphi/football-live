package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaci {

    /* renamed from: a  reason: collision with root package name */
    public final RegisterListenerMethod<Api.AnyClient, ?> f12352a;

    /* renamed from: b  reason: collision with root package name */
    public final UnregisterListenerMethod<Api.AnyClient, ?> f12353b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f12354c;

    public zaci(RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, Runnable runnable) {
        this.f12352a = registerListenerMethod;
        this.f12353b = unregisterListenerMethod;
        this.f12354c = runnable;
    }
}
