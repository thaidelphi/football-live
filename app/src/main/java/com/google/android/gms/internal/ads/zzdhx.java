package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import com.ironsource.da;
import com.ironsource.ug;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdhx implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdlu zzd;
    private final Clock zze;
    private zzbgp zzf;
    private zzbio zzg;

    public zzdhx(zzdlu zzdluVar, Clock clock) {
        this.zzd = zzdluVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ug.f21009x, this.zza);
            hashMap.put("time_interval", String.valueOf(this.zze.a() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzj("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    public final zzbgp zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzc(final zzbgp zzbgpVar) {
        this.zzf = zzbgpVar;
        zzbio zzbioVar = this.zzg;
        if (zzbioVar != null) {
            this.zzd.zzn("/unconfirmedClick", zzbioVar);
        }
        zzbio zzbioVar2 = new zzbio() { // from class: com.google.android.gms.internal.ads.zzdhw
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                zzdhx zzdhxVar = zzdhx.this;
                try {
                    zzdhxVar.zzb = Long.valueOf(Long.parseLong((String) map.get(da.a.f16995d)));
                } catch (NumberFormatException unused) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbgp zzbgpVar2 = zzbgpVar;
                zzdhxVar.zza = (String) map.get(ug.f21009x);
                String str = (String) map.get("asset_id");
                if (zzbgpVar2 == null) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbgpVar2.zzf(str);
                } catch (RemoteException e8) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                }
            }
        };
        this.zzg = zzbioVar2;
        this.zzd.zzl("/unconfirmedClick", zzbioVar2);
    }
}
