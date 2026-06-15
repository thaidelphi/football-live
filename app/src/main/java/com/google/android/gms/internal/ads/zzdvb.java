package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdvb implements zzhdk {
    private final zzhdt zza;

    public zzdvb(zzhdt zzhdtVar) {
        this.zza = zzhdtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzhdt r0 = r4.zza
            com.google.android.gms.internal.ads.zzctw r0 = (com.google.android.gms.internal.ads.zzctw) r0
            com.google.android.gms.internal.ads.zzfap r0 = r0.zza()
            com.google.android.gms.internal.ads.zzbbd r1 = com.google.android.gms.internal.ads.zzbbm.zzhe
            com.google.android.gms.internal.ads.zzbbk r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L51
            com.google.android.gms.ads.internal.client.zzm r1 = r0.zzd
            java.lang.String r1 = r1.zzx
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "request_id"
            if (r2 != 0) goto L36
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L36
            r2.<init>(r1)     // Catch: org.json.JSONException -> L36
            java.lang.String r1 = r2.getString(r3)     // Catch: org.json.JSONException -> L36
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L36
            if (r2 != 0) goto L36
            goto L61
        L36:
            com.google.android.gms.ads.internal.client.zzm r1 = r0.zzd
            com.google.android.gms.ads.internal.client.zzc r1 = r1.zzs
            if (r1 == 0) goto L51
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L51
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd     // Catch: org.json.JSONException -> L51
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs     // Catch: org.json.JSONException -> L51
            java.lang.String r0 = r0.zza     // Catch: org.json.JSONException -> L51
            r1.<init>(r0)     // Catch: org.json.JSONException -> L51
            java.lang.String r1 = r1.getString(r3)     // Catch: org.json.JSONException -> L51
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L51
            if (r0 == 0) goto L61
        L51:
            java.util.Random r0 = com.google.android.gms.ads.internal.client.zzbb.zze()
            int r0 = r0.nextInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L61:
            com.google.android.gms.internal.ads.zzhds.zzb(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvb.zzb():java.lang.Object");
    }
}
