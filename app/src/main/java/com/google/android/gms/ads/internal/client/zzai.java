package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzbrz;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzai extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11150b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbod f11151c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(zzaz zzazVar, Context context, zzbod zzbodVar) {
        this.f11150b = context;
        this.f11151c = zzbodVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzm(ObjectWrapper.u0(this.f11150b), this.f11151c, 250505300);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbrz) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.f11150b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzah
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    return zzbry.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.u0(this.f11150b), this.f11151c, 250505300);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
