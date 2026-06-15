package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdgj implements zzaxl {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdgm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdgj(zzdgm zzdgmVar, String str) {
        this.zza = str;
        this.zzb = zzdgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zzdn(zzaxk zzaxkVar) {
        zzdip zzdipVar;
        Map map;
        zzdip zzdipVar2;
        zzdip zzdipVar3;
        zzdip zzdipVar4;
        zzdip zzdipVar5;
        zzdip zzdipVar6;
        Map map2;
        zzdip zzdipVar7;
        zzdip zzdipVar8;
        zzdip zzdipVar9;
        zzdip zzdipVar10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbR)).booleanValue()) {
            synchronized (this) {
                if (zzaxkVar.zzj) {
                    zzdgm zzdgmVar = this.zzb;
                    zzdipVar6 = zzdgmVar.zzo;
                    if (zzdipVar6 != null) {
                        map2 = zzdgmVar.zzy;
                        map2.put(this.zza, Boolean.TRUE);
                        zzdgm zzdgmVar2 = this.zzb;
                        zzdipVar7 = zzdgmVar2.zzo;
                        if (zzdipVar7 == null) {
                            return;
                        }
                        zzdipVar8 = zzdgmVar2.zzo;
                        View zzf = zzdipVar8.zzf();
                        zzdipVar9 = this.zzb.zzo;
                        Map zzl = zzdipVar9.zzl();
                        zzdipVar10 = this.zzb.zzo;
                        zzdgmVar2.zzB(zzf, zzl, zzdipVar10.zzm(), true);
                    }
                }
            }
        } else if (zzaxkVar.zzj) {
            zzdgm zzdgmVar3 = this.zzb;
            zzdipVar = zzdgmVar3.zzo;
            if (zzdipVar != null) {
                map = zzdgmVar3.zzy;
                map.put(this.zza, Boolean.TRUE);
                zzdgm zzdgmVar4 = this.zzb;
                zzdipVar2 = zzdgmVar4.zzo;
                if (zzdipVar2 == null) {
                    return;
                }
                zzdipVar3 = zzdgmVar4.zzo;
                View zzf2 = zzdipVar3.zzf();
                zzdipVar4 = this.zzb.zzo;
                Map zzl2 = zzdipVar4.zzl();
                zzdipVar5 = this.zzb.zzo;
                zzdgmVar4.zzB(zzf2, zzl2, zzdipVar5.zzm(), true);
            }
        }
    }
}
