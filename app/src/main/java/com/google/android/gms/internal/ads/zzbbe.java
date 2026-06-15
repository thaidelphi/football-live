package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbbe {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbbd zzbbdVar : this.zzb) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbbn.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        for (zzbbd zzbbdVar : this.zzc) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar);
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbbn.zzb());
        return zza;
    }

    public final void zzc(zzbbd zzbbdVar) {
        this.zzb.add(zzbbdVar);
    }

    public final void zzd(zzbbd zzbbdVar) {
        this.zza.add(zzbbdVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (zzbbd zzbbdVar : this.zza) {
            if (zzbbdVar.zze() == 1) {
                zzbbdVar.zzd(editor, zzbbdVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Flag Json is null.");
        }
    }
}
