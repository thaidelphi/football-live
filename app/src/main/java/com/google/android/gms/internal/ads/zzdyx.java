package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdyx implements zzgal {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzdyy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyx(zzdyy zzdyyVar, boolean z10) {
        this.zza = z10;
        this.zzb = zzdyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzgal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzdyy r0 = r7.zzb
            com.google.android.gms.internal.ads.zzcth r8 = (com.google.android.gms.internal.ads.zzcth) r8
            boolean r0 = r0.zzf()
            if (r0 == 0) goto Lb
            return
        Lb:
            android.os.Bundle r8 = r8.zza
            java.lang.String r0 = "ad_types"
            java.lang.Object r0 = r8.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1a
            java.util.List r0 = (java.util.List) r0
            goto L24
        L1a:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L4a
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
        L24:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L31
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L31
        L45:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L4e
        L4a:
            java.util.List r0 = java.util.Collections.emptyList()
        L4e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L57:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb1
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L8c;
                case -1052618729: goto L82;
                case -239580146: goto L78;
                case 604727084: goto L6e;
                default: goto L6d;
            }
        L6d:
            goto L96
        L6e:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            r1 = r6
            goto L97
        L78:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            r1 = r3
            goto L97
        L82:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            r1 = r5
            goto L97
        L8c:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            r1 = 0
            goto L97
        L96:
            r1 = -1
        L97:
            if (r1 == 0) goto Lab
            if (r1 == r6) goto La8
            if (r1 == r5) goto La5
            if (r1 == r3) goto La2
            com.google.android.gms.internal.ads.zzbar$zzd$zza r1 = com.google.android.gms.internal.ads.zzbar.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto Lad
        La2:
            com.google.android.gms.internal.ads.zzbar$zzd$zza r1 = com.google.android.gms.internal.ads.zzbar.zzd.zza.REWARD_BASED_VIDEO_AD
            goto Lad
        La5:
            com.google.android.gms.internal.ads.zzbar$zzd$zza r1 = com.google.android.gms.internal.ads.zzbar.zzd.zza.NATIVE_APP_INSTALL
            goto Lad
        La8:
            com.google.android.gms.internal.ads.zzbar$zzd$zza r1 = com.google.android.gms.internal.ads.zzbar.zzd.zza.INTERSTITIAL
            goto Lad
        Lab:
            com.google.android.gms.internal.ads.zzbar$zzd$zza r1 = com.google.android.gms.internal.ads.zzbar.zzd.zza.BANNER
        Lad:
            r4.add(r1)
            goto L57
        Lb1:
            com.google.android.gms.internal.ads.zzdyy r0 = r7.zzb
            com.google.android.gms.internal.ads.zzbar$zzaf$zzd r6 = com.google.android.gms.internal.ads.zzdyy.zzb(r0, r8)
            com.google.android.gms.internal.ads.zzdyy r0 = r7.zzb
            com.google.android.gms.internal.ads.zzbar$zzab r5 = com.google.android.gms.internal.ads.zzdyy.zza(r0, r8)
            com.google.android.gms.internal.ads.zzdyy r8 = r7.zzb
            boolean r3 = r7.zza
            com.google.android.gms.internal.ads.zzdyw r0 = new com.google.android.gms.internal.ads.zzdyw
            r1 = r0
            r2 = r7
            r1.<init>()
            com.google.android.gms.internal.ads.zzdym r8 = r8.zza
            r8.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyx.zzb(java.lang.Object):void");
    }
}
