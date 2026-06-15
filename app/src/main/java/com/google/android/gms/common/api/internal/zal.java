package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zal {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.collection.a<ApiKey<?>, ConnectionResult> f12384a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.collection.a<ApiKey<?>, String> f12385b;

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource<Map<ApiKey<?>, String>> f12386c;

    /* renamed from: d  reason: collision with root package name */
    private int f12387d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12388e;

    public final Set<ApiKey<?>> a() {
        return this.f12384a.keySet();
    }

    public final void b(ApiKey<?> apiKey, ConnectionResult connectionResult, String str) {
        this.f12384a.put(apiKey, connectionResult);
        this.f12385b.put(apiKey, str);
        this.f12387d--;
        if (!connectionResult.z0()) {
            this.f12388e = true;
        }
        if (this.f12387d == 0) {
            if (this.f12388e) {
                this.f12386c.setException(new AvailabilityException(this.f12384a));
                return;
            }
            this.f12386c.setResult(this.f12385b);
        }
    }
}
