package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RegistrationMethods<A extends Api.AnyClient, L> {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    public final RegisterListenerMethod<A, L> f12154a;

    /* renamed from: b  reason: collision with root package name */
    public final UnregisterListenerMethod<A, L> f12155b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f12156c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Builder<A extends Api.AnyClient, L> {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f12157a = new Runnable() { // from class: com.google.android.gms.common.api.internal.zacj
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: b  reason: collision with root package name */
        private boolean f12158b = true;

        private Builder() {
        }
    }
}
