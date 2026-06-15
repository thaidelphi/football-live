package com.google.android.gms.internal.ads;

import androidx.browser.customtabs.f;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbcq extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbcr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcq(zzbcr zzbcrVar, String str) {
        this.zza = str;
        this.zzb = zzbcrVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        f fVar;
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbcr zzbcrVar = this.zzb;
            fVar = zzbcrVar.zzg;
            fVar.h(zzbcrVar.zzc(this.zza, str).toString(), null);
        } catch (JSONException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating PACT Error Response JSON: ", e8);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        f fVar;
        String query = queryInfo.getQuery();
        try {
            zzbcr zzbcrVar = this.zzb;
            fVar = zzbcrVar.zzg;
            fVar.h(zzbcrVar.zzd(this.zza, query).toString(), null);
        } catch (JSONException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating PACT Signal Response JSON: ", e8);
        }
    }
}
