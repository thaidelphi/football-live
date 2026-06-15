package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzecr implements zzebm {
    private final Context zza;
    private final zzcoi zzb;
    private View zzc;
    private zzbom zzd;

    public zzecr(Context context, zzcoi zzcoiVar) {
        this.zza = context;
        this.zzb = zzcoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, final zzezu zzezuVar, final zzebj zzebjVar) throws zzfaw, zzeez {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhM)).booleanValue() && zzezuVar.zzag) {
            try {
                view = (View) ObjectWrapper.t0(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfaw(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzgap.zzn(zzgap.zzh(null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzeco
                            @Override // com.google.android.gms.internal.ads.zzfzw
                            public final b6.a zza(Object obj) {
                                b6.a zzh;
                                zzh = zzgap.zzh(zzcox.zza(zzecr.this.zza, view, zzezuVar));
                                return zzh;
                            }
                        }, zzbyp.zzf).get();
                    } catch (InterruptedException | ExecutionException e8) {
                        throw new zzfaw(e8);
                    }
                }
            } catch (RemoteException e10) {
                throw new zzfaw(e10);
            }
        } else {
            view = this.zzc;
        }
        zzcnf zza = this.zzb.zza(new zzcqb(zzfagVar, zzezuVar, zzebjVar.zza), new zzcnl(view, null, new zzcpj() { // from class: com.google.android.gms.internal.ads.zzecn
            @Override // com.google.android.gms.internal.ads.zzcpj
            public final com.google.android.gms.ads.internal.client.zzea zza() {
                try {
                    return ((zzbqc) zzebj.this.zzb).zze();
                } catch (RemoteException e11) {
                    throw new zzfaw(e11);
                }
            }
        }, (zzezv) zzezuVar.zzu.get(0)));
        zza.zzg().zza(view);
        ((zzecx) zzebjVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final void zzb(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw {
        try {
            ((zzbqc) zzebjVar.zzb).zzq(zzezuVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhM)).booleanValue() && zzezuVar.zzag) {
                ((zzbqc) zzebjVar.zzb).zzk(zzezuVar.zzU, zzezuVar.zzv.toString(), zzfagVar.zza.zza.zzd, ObjectWrapper.u0(this.zza), new zzecp(this, zzebjVar, null), (zzboj) zzebjVar.zzc, zzfagVar.zza.zza.zze);
            } else {
                ((zzbqc) zzebjVar.zzb).zzj(zzezuVar.zzU, zzezuVar.zzv.toString(), zzfagVar.zza.zza.zzd, ObjectWrapper.u0(this.zza), new zzecp(this, zzebjVar, null), (zzboj) zzebjVar.zzc, zzfagVar.zza.zza.zze);
            }
        } catch (RemoteException e8) {
            throw new zzfaw(e8);
        }
    }
}
