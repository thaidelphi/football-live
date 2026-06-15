package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class Batch extends BasePendingResult<BatchResult> {

    /* renamed from: q  reason: collision with root package name */
    private final PendingResult<?>[] f12048q;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Builder {
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void c() {
        super.c();
        for (PendingResult<?> pendingResult : this.f12048q) {
            pendingResult.c();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: p */
    public BatchResult d(Status status) {
        return new BatchResult(status, this.f12048q);
    }
}
