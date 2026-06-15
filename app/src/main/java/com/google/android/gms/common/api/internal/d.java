package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final ApiKey<?> f12201a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<Boolean> f12202b = new TaskCompletionSource<>();

    public d(ApiKey<?> apiKey) {
        this.f12201a = apiKey;
    }

    public final ApiKey<?> a() {
        return this.f12201a;
    }

    public final TaskCompletionSource<Boolean> b() {
        return this.f12202b;
    }
}
