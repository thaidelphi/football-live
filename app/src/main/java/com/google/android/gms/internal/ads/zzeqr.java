package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeqr implements zzerv {
    private zzfpi zza;
    private zzfpi zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzeqr(zzfpi zzfpiVar, zzfpi zzfpiVar2, boolean z10, boolean z11, boolean z12) {
        this.zza = zzfpiVar;
        this.zzb = zzfpiVar2;
        this.zzc = z10;
        this.zzd = z11;
        this.zzf = z12;
    }

    public zzeqr(boolean z10) {
        this.zzf = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzdh)).booleanValue() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r5.zza.zzc() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        r1.putString("paidv1_id_android", r5.zza.zzb());
        r1.putLong("paidv1_creation_time_android", r5.zza.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzdg)).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzdi)).booleanValue() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        if (r5.zzb.zzc() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
        r1.putString("paidv2_id_android", r5.zzb.zzb());
        r1.putLong("paidv2_creation_time_android", r5.zzb.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r1.putBoolean("paidv2_pub_option_android", r5.zzc);
        r1.putBoolean("paidv2_user_option_android", r5.zzd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzdf)).booleanValue() == false) goto L28;
     */
    @Override // com.google.android.gms.internal.ads.zzerv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzcth r6 = (com.google.android.gms.internal.ads.zzcth) r6
            android.os.Bundle r6 = r6.zza
            boolean r0 = r5.zze
            if (r0 == 0) goto La
            goto Lbb
        La:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfbd.zza(r6, r0)
            boolean r2 = r5.zzf
            if (r2 != 0) goto L26
            com.google.android.gms.internal.ads.zzbbd r2 = com.google.android.gms.internal.ads.zzbbm.zzdf
            com.google.android.gms.internal.ads.zzbbk r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L3c
        L26:
            boolean r2 = r5.zzf
            if (r2 == 0) goto L5a
            com.google.android.gms.internal.ads.zzbbd r2 = com.google.android.gms.internal.ads.zzbbm.zzdh
            com.google.android.gms.internal.ads.zzbbk r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5a
        L3c:
            com.google.android.gms.internal.ads.zzfpi r2 = r5.zza
            boolean r2 = r2.zzc()
            if (r2 == 0) goto L5a
            com.google.android.gms.internal.ads.zzfpi r2 = r5.zza
            java.lang.String r2 = r2.zzb()
            java.lang.String r3 = "paidv1_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.zzfpi r2 = r5.zza
            long r2 = r2.zza()
            java.lang.String r4 = "paidv1_creation_time_android"
            r1.putLong(r4, r2)
        L5a:
            boolean r2 = r5.zzf
            if (r2 != 0) goto L70
            com.google.android.gms.internal.ads.zzbbd r2 = com.google.android.gms.internal.ads.zzbbm.zzdg
            com.google.android.gms.internal.ads.zzbbk r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L86
        L70:
            boolean r2 = r5.zzf
            if (r2 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzbbd r2 = com.google.android.gms.internal.ads.zzbbm.zzdi
            com.google.android.gms.internal.ads.zzbbk r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lb2
        L86:
            com.google.android.gms.internal.ads.zzfpi r2 = r5.zzb
            boolean r2 = r2.zzc()
            if (r2 == 0) goto La4
            com.google.android.gms.internal.ads.zzfpi r2 = r5.zzb
            java.lang.String r2 = r2.zzb()
            java.lang.String r3 = "paidv2_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.zzfpi r2 = r5.zzb
            long r2 = r2.zza()
            java.lang.String r4 = "paidv2_creation_time_android"
            r1.putLong(r4, r2)
        La4:
            boolean r2 = r5.zzc
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r5.zzd
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        Lb2:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lbb
            r6.putBundle(r0, r1)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeqr.zzb(java.lang.Object):void");
    }
}
