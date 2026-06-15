package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcmy extends zzcpl {
    private final zzcdq zzc;
    private final int zzd;
    private final Context zze;
    private final zzcmm zzf;
    private final zzdeo zzg;
    private final zzdbi zzh;
    private final zzcus zzi;
    private final boolean zzj;
    private final zzbyj zzk;
    private boolean zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmy(zzcpk zzcpkVar, Context context, zzcdq zzcdqVar, int i10, zzcmm zzcmmVar, zzdeo zzdeoVar, zzdbi zzdbiVar, zzcus zzcusVar, zzbyj zzbyjVar) {
        super(zzcpkVar);
        this.zzl = false;
        this.zzc = zzcdqVar;
        this.zze = context;
        this.zzd = i10;
        this.zzf = zzcmmVar;
        this.zzg = zzdeoVar;
        this.zzh = zzdbiVar;
        this.zzi = zzcusVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfr)).booleanValue();
        this.zzk = zzbyjVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcpl
    public final void zzb() {
        super.zzb();
        zzcdq zzcdqVar = this.zzc;
        if (zzcdqVar != null) {
            zzcdqVar.destroy();
        }
    }

    public final void zzc(zzayy zzayyVar) {
        zzcdq zzcdqVar = this.zzc;
        if (zzcdqVar != null) {
            zzcdqVar.zzak(zzayyVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzazl r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            boolean r4 = r2.zzj
            if (r4 == 0) goto Ld
            com.google.android.gms.internal.ads.zzdbi r4 = r2.zzh
            r4.zzb()
        Ld:
            com.google.android.gms.internal.ads.zzbbd r4 = com.google.android.gms.internal.ads.zzbbm.zzaM
            com.google.android.gms.internal.ads.zzbbk r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r0.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L63
            com.google.android.gms.ads.internal.zzv.zzq()
            boolean r4 = com.google.android.gms.ads.internal.util.zzs.zzH(r3)
            if (r4 == 0) goto L63
            int r4 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r4)
            com.google.android.gms.internal.ads.zzcus r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbbd r4 = com.google.android.gms.internal.ads.zzbbm.zzaN
            com.google.android.gms.internal.ads.zzbbk r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Ld8
            com.google.android.gms.internal.ads.zzfmb r4 = new com.google.android.gms.internal.ads.zzfmb
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbt r5 = com.google.android.gms.ads.internal.zzv.zzu()
            android.os.Looper r5 = r5.zzb()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzfag r3 = r2.zza
            com.google.android.gms.internal.ads.zzfaf r3 = r3.zzb
            com.google.android.gms.internal.ads.zzezx r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L63:
            com.google.android.gms.internal.ads.zzbbd r4 = com.google.android.gms.internal.ads.zzbbm.zzlO
            com.google.android.gms.internal.ads.zzbbk r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r0.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto La4
            com.google.android.gms.internal.ads.zzcdq r4 = r2.zzc
            if (r4 == 0) goto La4
            com.google.android.gms.internal.ads.zzezu r4 = r4.zzD()
            if (r4 == 0) goto La4
            boolean r1 = r4.zzar
            if (r1 == 0) goto La4
            int r4 = r4.zzas
            com.google.android.gms.internal.ads.zzbyj r1 = r2.zzk
            int r1 = r1.zzb()
            if (r4 != r1) goto L8f
            goto La4
        L8f:
            int r3 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r3 = "The app open consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r3)
            com.google.android.gms.internal.ads.zzcus r3 = r2.zzi
            r4 = 12
            java.lang.String r5 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfbq.zzd(r4, r5, r0)
            r3.zza(r4)
            return
        La4:
            boolean r4 = r2.zzl
            if (r4 == 0) goto Lba
            int r4 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r4)
            com.google.android.gms.internal.ads.zzcus r4 = r2.zzi
            r1 = 10
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfbq.zzd(r1, r0, r0)
            r4.zza(r0)
        Lba:
            boolean r4 = r2.zzl
            if (r4 != 0) goto Ld8
            com.google.android.gms.internal.ads.zzdeo r4 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzden -> Ld2
            com.google.android.gms.internal.ads.zzcus r0 = r2.zzi     // Catch: com.google.android.gms.internal.ads.zzden -> Ld2
            r4.zza(r5, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzden -> Ld2
            boolean r3 = r2.zzj     // Catch: com.google.android.gms.internal.ads.zzden -> Ld2
            if (r3 == 0) goto Lce
            com.google.android.gms.internal.ads.zzdbi r3 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzden -> Ld2
            r3.zza()     // Catch: com.google.android.gms.internal.ads.zzden -> Ld2
        Lce:
            r3 = 1
            r2.zzl = r3
            return
        Ld2:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcus r4 = r2.zzi
            r4.zzc(r3)
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmy.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzazl, boolean):void");
    }

    public final void zze(long j10, int i10) {
        this.zzf.zza(j10, i10);
    }
}
