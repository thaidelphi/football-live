package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbvu;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzaa extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11141b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f11142c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzbod f11143d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(zzaz zzazVar, Context context, String str, zzbod zzbodVar) {
        this.f11141b = context;
        this.f11142c = str;
        this.f11143d = zzbodVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11141b, "rewarded");
        return new zzfn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzp(ObjectWrapper.u0(this.f11141b), this.f11142c, this.f11143d, 250505300);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return zzbvu.zza(this.f11141b, this.f11142c, this.f11143d);
    }
}
