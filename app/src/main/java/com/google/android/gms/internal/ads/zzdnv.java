package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdnv {
    private final zzfbl zza;
    private final zzdns zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdnv(zzfbl zzfblVar, zzdns zzdnsVar) {
        this.zza = zzfblVar;
        this.zzb = zzdnsVar;
    }

    final zzbod zza() throws RemoteException {
        zzbod zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbqc zzb(String str) throws RemoteException {
        zzbqc zzc = zza().zzc(str);
        this.zzb.zzd(str, zzc);
        return zzc;
    }

    public final zzfbn zzc(String str, JSONObject jSONObject) throws zzfaw {
        zzbog zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbpe(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbpe(new zzbqv());
            } else {
                zzbod zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zza.zze(string)) {
                            zzb = zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (zza.zzd(string)) {
                            zzb = zza.zzb(string);
                        } else {
                            zzb = zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e8) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Invalid custom event.", e8);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfbn zzfbnVar = new zzfbn(zzb);
            this.zzb.zzc(str, zzfbnVar);
            return zzfbnVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjn)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzfaw(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
