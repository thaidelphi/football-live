package com.google.android.gms.common.api;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class BatchResult implements Result {

    /* renamed from: a  reason: collision with root package name */
    private final Status f12049a;

    /* renamed from: b  reason: collision with root package name */
    private final PendingResult<?>[] f12050b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.f12049a = status;
        this.f12050b = pendingResultArr;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status a() {
        return this.f12049a;
    }
}
