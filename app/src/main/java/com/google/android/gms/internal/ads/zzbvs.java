package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbvs implements RewardItem {
    private final zzbvf zza;

    public zzbvs(zzbvf zzbvfVar) {
        this.zza = zzbvfVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbvf zzbvfVar = this.zza;
        if (zzbvfVar != null) {
            try {
                return zzbvfVar.zze();
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not forward getAmount to RewardItem", e8);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzbvf zzbvfVar = this.zza;
        if (zzbvfVar != null) {
            try {
                return zzbvfVar.zzf();
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not forward getType to RewardItem", e8);
            }
        }
        return null;
    }
}
