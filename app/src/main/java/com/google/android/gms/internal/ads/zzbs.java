package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzbs {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfvv zzh;
    private final zzfvv zzi;
    private final zzfvv zzj;
    private final int zzk;
    private final int zzl;
    private final zzfvv zzm;
    private final zzbr zzn;
    private zzfvv zzo;
    private int zzp;
    private final HashMap zzq;
    private final HashSet zzr;

    @Deprecated
    public zzbs() {
        this.zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = zzfvv.zzn();
        this.zzi = zzfvv.zzn();
        this.zzj = zzfvv.zzn();
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzl = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzm = zzfvv.zzn();
        this.zzn = zzbr.zza;
        this.zzo = zzfvv.zzn();
        this.zzp = 0;
        this.zzq = new HashMap();
        this.zzr = new HashSet();
    }

    public final zzbs zze(Context context) {
        int i10 = zzeh.zza;
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            this.zzp = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzo = zzfvv.zzo(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final zzbs zzf(int i10, int i11, boolean z10) {
        this.zze = i10;
        this.zzf = i11;
        this.zzg = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbs(zzbt zzbtVar) {
        this.zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = zzbtVar.zzi;
        this.zzf = zzbtVar.zzj;
        this.zzg = zzbtVar.zzk;
        this.zzh = zzbtVar.zzl;
        this.zzi = zzbtVar.zzm;
        this.zzj = zzbtVar.zzo;
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzl = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzm = zzbtVar.zzs;
        this.zzn = zzbtVar.zzt;
        this.zzo = zzbtVar.zzu;
        this.zzp = zzbtVar.zzv;
        this.zzr = new HashSet(zzbtVar.zzC);
        this.zzq = new HashMap(zzbtVar.zzB);
    }
}
