package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
abstract class f extends zzc {

    /* renamed from: d  reason: collision with root package name */
    public final int f12545d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f12546e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ BaseGmsClient f12547f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BaseGmsClient baseGmsClient, int i10, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.f12547f = baseGmsClient;
        this.f12545d = i10;
        this.f12546e = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f12545d != 0) {
            this.f12547f.zzp(1, null);
            Bundle bundle = this.f12546e;
            f(new ConnectionResult(this.f12545d, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null));
        } else if (g()) {
        } else {
            this.f12547f.zzp(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.zzc
    public final void b() {
    }

    protected abstract void f(ConnectionResult connectionResult);

    protected abstract boolean g();
}
