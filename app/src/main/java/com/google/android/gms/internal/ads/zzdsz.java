package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdsz {
    private final zzdsj zza;
    private final zzdns zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsz(zzdsj zzdsjVar, zzdns zzdnsVar) {
        this.zza = zzdsjVar;
        this.zzb = zzdnsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z10;
        zzdnr zza;
        zzbqr zzbqrVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbkm zzbkmVar = (zzbkm) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjm)).booleanValue()) {
                    zzdnr zza2 = this.zzb.zza(zzbkmVar.zza);
                    if (zza2 != null && (zzbqrVar = zza2.zzc) != null) {
                        str = zzbqrVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjn)).booleanValue() && (zza = this.zzb.zza(zzbkmVar.zza)) != null && zza.zzd) {
                    z10 = true;
                    List list2 = this.zzd;
                    String str3 = zzbkmVar.zza;
                    list2.add(new zzdsy(str3, str2, this.zzb.zzb(str3), zzbkmVar.zzb ? 1 : 0, zzbkmVar.zzd, zzbkmVar.zzc, z10));
                }
                z10 = false;
                List list22 = this.zzd;
                String str32 = zzbkmVar.zza;
                list22.add(new zzdsy(str32, str2, this.zzb.zzb(str32), zzbkmVar.zzb ? 1 : 0, zzbkmVar.zzd, zzbkmVar.zzc, z10));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                }
            }
            for (zzdsy zzdsyVar : this.zzd) {
                jSONArray.put(zzdsyVar.zza());
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdsx(this));
    }
}
