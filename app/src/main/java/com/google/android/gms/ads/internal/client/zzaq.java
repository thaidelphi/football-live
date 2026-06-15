package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbtc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzaq extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11174b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f11175c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzbod f11176d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzaz f11177e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(zzaz zzazVar, Context context, String str, zzbod zzbodVar) {
        this.f11174b = context;
        this.f11175c = str;
        this.f11176d = zzbodVar;
        this.f11177e = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11174b, "native_ad");
        return new zzff();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzb(ObjectWrapper.u0(this.f11174b), this.f11175c, this.f11176d, 250505300);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbtc zzbtcVar;
        zzi zziVar;
        zzbbm.zza(this.f11174b);
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkD)).booleanValue()) {
            try {
                IBinder zze = ((zzbu) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.f11174b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzap
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbu(iBinder);
                    }
                })).zze(ObjectWrapper.u0(this.f11174b), this.f11175c, this.f11176d, 250505300);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbr(zze);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e8) {
                this.f11177e.f11197g = zzbta.zza(this.f11174b);
                zzbtcVar = this.f11177e.f11197g;
                zzbtcVar.zzh(e8, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zzaz zzazVar = this.f11177e;
        Context context = this.f11174b;
        String str = this.f11175c;
        zzbod zzbodVar = this.f11176d;
        zziVar = zzazVar.f11192b;
        return zziVar.zza(context, str, zzbodVar);
    }
}
