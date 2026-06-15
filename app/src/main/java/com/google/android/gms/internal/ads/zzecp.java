package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzecp extends zzbpp {
    final /* synthetic */ zzecr zza;
    private final zzebj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzecp(zzecr zzecrVar, zzebj zzebjVar, zzecq zzecqVar) {
        this.zza = zzecrVar;
        this.zzb = zzebjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zze(String str) throws RemoteException {
        ((zzecx) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzecx) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzecr.zze(this.zza, (View) ObjectWrapper.t0(iObjectWrapper));
        ((zzecx) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzh(zzbom zzbomVar) throws RemoteException {
        zzecr.zzd(this.zza, zzbomVar);
        ((zzecx) this.zzb.zzc).zzo();
    }
}
