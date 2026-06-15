package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbtc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzau extends zzba {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11181b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzaz f11182c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(zzaz zzazVar, Context context) {
        this.f11181b = context;
        this.f11182c = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaz.j(this.f11181b, "mobile_ads_settings");
        return new zzfj();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzh(ObjectWrapper.u0(this.f11181b), 250505300);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbtc zzbtcVar;
        zzfb zzfbVar;
        zzbbm.zza(this.f11181b);
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkD)).booleanValue()) {
            try {
                IBinder zze = ((zzcz) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.f11181b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzat
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                        return queryLocalInterface instanceof zzcz ? (zzcz) queryLocalInterface : new zzcz(iBinder);
                    }
                })).zze(ObjectWrapper.u0(this.f11181b), 250505300);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof zzcy ? (zzcy) queryLocalInterface : new zzcw(zze);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e8) {
                this.f11182c.f11197g = zzbta.zza(this.f11181b);
                zzbtcVar = this.f11182c.f11197g;
                zzbtcVar.zzh(e8, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        }
        zzaz zzazVar = this.f11182c;
        Context context = this.f11181b;
        zzfbVar = zzazVar.f11193c;
        return zzfbVar.zza(context);
    }
}
