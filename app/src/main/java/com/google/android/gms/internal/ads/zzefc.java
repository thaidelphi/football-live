package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzefc implements zzfzw {
    private final zzfet zza;
    private final zzcuh zzb;
    private final zzfhk zzc;
    private final zzfhp zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcpo zzg;
    private final zzeev zzh;
    private final zzebl zzi;
    private final Context zzj;
    private final zzffn zzk;
    private final zzeef zzl;
    private final zzdpz zzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefc(Context context, zzfet zzfetVar, zzeev zzeevVar, zzcuh zzcuhVar, zzfhk zzfhkVar, zzfhp zzfhpVar, zzcpo zzcpoVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzebl zzeblVar, zzffn zzffnVar, zzeef zzeefVar, zzdpz zzdpzVar) {
        this.zzj = context;
        this.zza = zzfetVar;
        this.zzh = zzeevVar;
        this.zzb = zzcuhVar;
        this.zzc = zzfhkVar;
        this.zzd = zzfhpVar;
        this.zzg = zzcpoVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeblVar;
        this.zzk = zzffnVar;
        this.zzl = zzeefVar;
        this.zzm = zzdpzVar;
    }

    public static /* synthetic */ b6.a zzb(zzefc zzefcVar, zzezu zzezuVar, zzfag zzfagVar, zzebg zzebgVar, Throwable th) {
        zzffc zza = zzffb.zza(zzefcVar.zzj, 12);
        zza.zzd(zzezuVar.zzE);
        zza.zzi();
        b6.a zzo = zzgap.zzo(zzebgVar.zza(zzfagVar, zzezuVar), zzezuVar.zzR, TimeUnit.MILLISECONDS, zzefcVar.zzf);
        zzefcVar.zzh.zzf(zzfagVar, zzezuVar, zzo, zzefcVar.zzc);
        zzffm.zza(zzo, zzefcVar.zzk, zza);
        return zzo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzfw)).booleanValue() == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String zzc(com.google.android.gms.internal.ads.zzfag r5) {
        /*
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzfx
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.zzfaf r2 = r5.zzb
            com.google.android.gms.internal.ads.zzezx r2 = r2.zzb
            int r2 = r2.zzf
            if (r2 == 0) goto L57
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbbd r2 = com.google.android.gms.internal.ads.zzbbm.zzfw
            com.google.android.gms.internal.ads.zzbbk r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L57
            goto L58
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L58
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L58
        L57:
            r1 = r0
        L58:
            com.google.android.gms.internal.ads.zzfaf r5 = r5.zzb
            com.google.android.gms.internal.ads.zzezx r5 = r5.zzb
            com.google.android.gms.internal.ads.zzezw r5 = r5.zzj
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.zza()
            return r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefc.zzc(com.google.android.gms.internal.ads.zzfag):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    @Override // com.google.android.gms.internal.ads.zzfzw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ b6.a zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefc.zza(java.lang.Object):b6.a");
    }
}
