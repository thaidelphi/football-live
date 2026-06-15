package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzetp implements zzerw {
    private final JSONObject zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzetp(Context context) {
        this.zza = zzbtz.zzc(context, VersionInfoParcel.forPackage());
    }

    public static /* synthetic */ void zzc(zzetp zzetpVar, JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", zzetpVar.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlR)).booleanValue()) {
            return zzgap.zzh(new zzerv() { // from class: com.google.android.gms.internal.ads.zzetn
                @Override // com.google.android.gms.internal.ads.zzerv
                public final /* synthetic */ void zza(Object obj) {
                }

                @Override // com.google.android.gms.internal.ads.zzerv
                public final void zzb(Object obj) {
                    JSONObject jSONObject = (JSONObject) obj;
                }
            });
        }
        return zzgap.zzh(new zzerv() { // from class: com.google.android.gms.internal.ads.zzeto
            @Override // com.google.android.gms.internal.ads.zzerv
            public final /* synthetic */ void zza(Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.zzerv
            public final void zzb(Object obj) {
                zzetp.zzc(zzetp.this, (JSONObject) obj);
            }
        });
    }
}
