package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class Common {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    public static final Api.ClientKey<zah> f12566a;
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    public static final Api<Api.ApiOptions.NoOptions> f12567b;

    /* renamed from: c  reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zah, Api.ApiOptions.NoOptions> f12568c;

    /* renamed from: d  reason: collision with root package name */
    public static final zae f12569d;

    static {
        Api.ClientKey<zah> clientKey = new Api.ClientKey<>();
        f12566a = clientKey;
        a aVar = new a();
        f12568c = aVar;
        f12567b = new Api<>("Common.API", aVar, clientKey);
        f12569d = new zae();
    }
}
