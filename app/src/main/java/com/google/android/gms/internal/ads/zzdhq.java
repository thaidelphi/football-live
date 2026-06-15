package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdhq implements zzbem {
    final /* synthetic */ zzdip zza;
    final /* synthetic */ ViewGroup zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdhq(zzdip zzdipVar, ViewGroup viewGroup) {
        this.zza = zzdipVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final void zzc() {
        zzfvv zzfvvVar = zzdhn.zza;
        Map zzm = this.zza.zzm();
        if (zzm == null) {
            return;
        }
        int size = zzfvvVar.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = zzm.get((String) zzfvvVar.get(i10));
            i10++;
            if (obj != null) {
                this.zza.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
