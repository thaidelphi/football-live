package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Result f12210a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zada f12211b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(zada zadaVar, Result result) {
        this.f12211b = zadaVar;
        this.f12210a = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        ResultTransform resultTransform;
        h0 unused;
        h0 unused2;
        h0 unused3;
        h0 unused4;
        try {
            try {
                BasePendingResult.f12089o.set(Boolean.TRUE);
                resultTransform = this.f12211b.f12366a;
                ((ResultTransform) Preconditions.m(resultTransform)).b(this.f12210a);
                zada zadaVar = this.f12211b;
                unused = zadaVar.f12372g;
                unused2 = zadaVar.f12372g;
                throw null;
            } catch (RuntimeException unused5) {
                zada zadaVar2 = this.f12211b;
                unused3 = zadaVar2.f12372g;
                unused4 = zadaVar2.f12372g;
                throw null;
            }
        } catch (Throwable th) {
            BasePendingResult.f12089o.set(Boolean.FALSE);
            zada zadaVar3 = this.f12211b;
            zada.j(this.f12210a);
            weakReference = this.f12211b.f12371f;
            GoogleApiClient googleApiClient = (GoogleApiClient) weakReference.get();
            if (googleApiClient != null) {
                googleApiClient.j(this.f12211b);
            }
            throw th;
        }
    }
}
