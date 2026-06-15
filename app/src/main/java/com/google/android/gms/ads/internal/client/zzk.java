package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbtc;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzk extends RemoteCreator {

    /* renamed from: a  reason: collision with root package name */
    private zzbtc f11298a;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzby(iBinder);
    }

    public final zzbx zza(Context context, zzr zzrVar, String str, zzbod zzbodVar, int i10) {
        zzbbm.zza(context);
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkD)).booleanValue()) {
            try {
                IBinder zze = ((zzby) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzj
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        return queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzby(iBinder);
                    }
                })).zze(ObjectWrapper.u0(context), zzrVar, str, zzbodVar, 250505300, i10);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(zze);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e8) {
                zzbtc zza = zzbta.zza(context);
                this.f11298a = zza;
                zza.zzh(e8, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzby) getRemoteCreatorInstance(context)).zze(ObjectWrapper.u0(context), zzrVar, str, zzbodVar, 250505300, i10);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof zzbx ? (zzbx) queryLocalInterface2 : new zzbv(zze2);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Could not create remote AdManager.", e10);
            return null;
        }
    }
}
