package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f12228a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectionResult f12229b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(ConnectionResult connectionResult, int i10) {
        Preconditions.m(connectionResult);
        this.f12229b = connectionResult;
        this.f12228a = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.f12228a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ConnectionResult b() {
        return this.f12229b;
    }
}
