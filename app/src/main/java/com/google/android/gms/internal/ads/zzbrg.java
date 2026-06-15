package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbrg extends zzbrh implements zzbio {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcdq zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbau zzk;
    private float zzl;
    private int zzm;

    public zzbrg(zzcdq zzcdqVar, Context context, zzbau zzbauVar) {
        super(zzcdqVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcdqVar;
        this.zzi = context;
        this.zzk = zzbauVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        JSONObject jSONObject;
        zzcdq zzcdqVar = (zzcdq) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi = this.zzh.zzi();
        if (zzi != null && zzi.getWindow() != null) {
            com.google.android.gms.ads.internal.zzv.zzq();
            int[] zzQ = com.google.android.gms.ads.internal.util.zzs.zzQ(zzi);
            com.google.android.gms.ads.internal.client.zzbb.zzb();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zza, zzQ[0]);
            com.google.android.gms.ads.internal.client.zzbb.zzb();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zza, zzQ[1]);
        } else {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbrf zzbrfVar = new zzbrf();
        zzbau zzbauVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbrfVar.zze(zzbauVar.zza(intent));
        zzbau zzbauVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbrfVar.zzc(zzbauVar2.zza(intent2));
        zzbrfVar.zza(this.zzk.zzb());
        zzbrfVar.zzd(this.zzk.zzc());
        zzbrfVar.zzb(true);
        z10 = zzbrfVar.zza;
        z11 = zzbrfVar.zzb;
        z12 = zzbrfVar.zzc;
        z13 = zzbrfVar.zzd;
        z14 = zzbrfVar.zze;
        zzcdq zzcdqVar2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z10).put("tel", z11).put("calendar", z12).put("storePicture", z13).put("inlineVideo", z14);
        } catch (JSONException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while obtaining the MRAID capabilities.", e8);
            jSONObject = null;
        }
        zzcdqVar2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Dispatching Ready Event.");
        }
        zzi(this.zzh.zzm().afmaVersion);
    }

    public final void zzb(int i10, int i11) {
        int i12;
        Context context = this.zzi;
        int i13 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzv.zzq();
            i12 = com.google.android.gms.ads.internal.util.zzs.zzR((Activity) context)[0];
        } else {
            i12 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzcdq zzcdqVar = this.zzh;
            int width = zzcdqVar.getWidth();
            int height = zzcdqVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzad)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i13 = this.zzh.zzO().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(this.zzi, i13);
                }
            }
            i13 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(this.zzi, i13);
        }
        zzg(i10, i11 - i12, this.zzf, this.zzg);
        this.zzh.zzN().zzD(i10, i11);
    }
}
