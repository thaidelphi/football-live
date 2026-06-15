package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzffe implements zzffc {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzffs zzj = zzffs.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public zzffe(Context context, int i10) {
        this.zza = context;
        this.zzp = i10;
    }

    public final synchronized zzffe zzA() {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzC().b();
        return this;
    }

    public final synchronized zzffe zzK(int i10) {
        this.zzq = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final /* bridge */ /* synthetic */ zzffc zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzr(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final /* bridge */ /* synthetic */ zzffc zzb(zzfaf zzfafVar) {
        zzs(zzfafVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final /* bridge */ /* synthetic */ zzffc zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final /* bridge */ /* synthetic */ zzffc zzd(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final /* bridge */ /* synthetic */ zzffc zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final /* bridge */ /* synthetic */ zzffc zzf(zzffs zzffsVar) {
        zzw(zzffsVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final /* bridge */ /* synthetic */ zzffc zzg(boolean z10) {
        zzx(z10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final /* bridge */ /* synthetic */ zzffc zzh(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final /* bridge */ /* synthetic */ zzffc zzi() {
        zzz();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final /* bridge */ /* synthetic */ zzffc zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final synchronized boolean zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final synchronized zzffg zzm() {
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzz();
        }
        if (this.zzc < 0) {
            zzA();
        }
        return new zzffg(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzffc
    public final /* bridge */ /* synthetic */ zzffc zzn(int i10) {
        zzK(i10);
        return this;
    }

    public final synchronized zzffe zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            zzcty zzctyVar = (zzcty) iBinder;
            String zzk = zzctyVar.zzk();
            if (!TextUtils.isEmpty(zzk)) {
                this.zzf = zzk;
            }
            String zzi = zzctyVar.zzi();
            if (!TextUtils.isEmpty(zzi)) {
                this.zzg = zzi;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
        r2.zzg = r0.zzab;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzffe zzs(com.google.android.gms.internal.ads.zzfaf r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzezx r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzezx r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            r2.zzf = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzezu r0 = (com.google.android.gms.internal.ads.zzezu) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zzab     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.zzab     // Catch: java.lang.Throwable -> L31
            r2.zzg = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffe.zzs(com.google.android.gms.internal.ads.zzfaf):com.google.android.gms.internal.ads.zzffe");
    }

    public final synchronized zzffe zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziL)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized zzffe zzu(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzffe zzv(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzffe zzw(zzffs zzffsVar) {
        this.zzj = zzffsVar;
        return this;
    }

    public final synchronized zzffe zzx(boolean z10) {
        this.zzd = z10;
        return this;
    }

    public final synchronized zzffe zzy(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziL)).booleanValue()) {
            this.zzl = zzbta.zzf(th);
            this.zzk = (String) zzftk.zzb(zzfsg.zzc('\n')).zzd(zzbta.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzffe zzz() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzv.zzr().zzm(this.zza);
        Resources resources = this.zza.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i10;
        this.zzb = com.google.android.gms.ads.internal.zzv.zzC().b();
        this.zzo = true;
        return this;
    }
}
