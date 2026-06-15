package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ApiKey<O extends Api.ApiOptions> {

    /* renamed from: a  reason: collision with root package name */
    private final int f12078a;

    /* renamed from: b  reason: collision with root package name */
    private final Api<O> f12079b;

    /* renamed from: c  reason: collision with root package name */
    private final O f12080c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12081d;

    private ApiKey(Api<O> api, O o10, String str) {
        this.f12079b = api;
        this.f12080c = o10;
        this.f12081d = str;
        this.f12078a = Objects.b(api, o10, str);
    }

    public static <O extends Api.ApiOptions> ApiKey<O> a(Api<O> api, O o10, String str) {
        return new ApiKey<>(api, o10, str);
    }

    public final String b() {
        return this.f12079b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof ApiKey) {
            ApiKey apiKey = (ApiKey) obj;
            return Objects.a(this.f12079b, apiKey.f12079b) && Objects.a(this.f12080c, apiKey.f12080c) && Objects.a(this.f12081d, apiKey.f12081d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12078a;
    }
}
