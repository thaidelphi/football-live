package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdgm extends zzcpl {
    public static final /* synthetic */ int zzc = 0;
    private final Executor zzd;
    private final zzdgr zze;
    private final zzdgz zzf;
    private final zzdhr zzg;
    private final zzdgw zzh;
    private final zzdhc zzi;
    private final zzhde zzj;
    private final zzhde zzk;
    private final zzhde zzl;
    private final zzhde zzm;
    private final zzhde zzn;
    private zzdip zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbwx zzs;
    private final zzauc zzt;
    private final VersionInfoParcel zzu;
    private final Context zzv;
    private final zzdgo zzw;
    private final zzeiv zzx;
    private final Map zzy;
    private final List zzz;

    static {
        zzfvv.zzs("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public zzdgm(zzcpk zzcpkVar, Executor executor, zzdgr zzdgrVar, zzdgz zzdgzVar, zzdhr zzdhrVar, zzdgw zzdgwVar, zzdhc zzdhcVar, zzhde zzhdeVar, zzhde zzhdeVar2, zzhde zzhdeVar3, zzhde zzhdeVar4, zzhde zzhdeVar5, zzbwx zzbwxVar, zzauc zzaucVar, VersionInfoParcel versionInfoParcel, Context context, zzdgo zzdgoVar, zzeiv zzeivVar, zzaxn zzaxnVar) {
        super(zzcpkVar);
        this.zzd = executor;
        this.zze = zzdgrVar;
        this.zzf = zzdgzVar;
        this.zzg = zzdhrVar;
        this.zzh = zzdgwVar;
        this.zzi = zzdhcVar;
        this.zzj = zzhdeVar;
        this.zzk = zzhdeVar2;
        this.zzl = zzhdeVar3;
        this.zzm = zzhdeVar4;
        this.zzn = zzhdeVar5;
        this.zzs = zzbwxVar;
        this.zzt = zzaucVar;
        this.zzu = versionInfoParcel;
        this.zzv = context;
        this.zzw = zzdgoVar;
        this.zzx = zzeivVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
    }

    public static boolean zzY(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkz)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        long zzx = com.google.android.gms.ads.internal.util.zzs.zzx(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (zzx >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkA)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized ImageView.ScaleType zzaa() {
        zzdip zzdipVar = this.zzo;
        if (zzdipVar == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj = zzdipVar.zzj();
        if (zzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.t0(zzj);
        }
        return zzdhr.zza;
    }

    private final void zzab(String str, boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfn)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        b6.a zzw = this.zze.zzw();
        if (zzw == null) {
            return;
        }
        zzgap.zzr(zzw, new zzdgk(this, "Google", true), this.zzd);
    }

    private final synchronized void zzac(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzr(view, map, map2, zzaa());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad(View view, zzebb zzebbVar) {
        zzcdq zzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzebbVar == null || zzr == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzebbVar.zza(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzae(zzdip zzdipVar) {
        Iterator<String> keys;
        View view;
        zzatx zzc2;
        if (!this.zzp) {
            this.zzo = zzdipVar;
            this.zzg.zze(zzdipVar);
            this.zzf.zzz(zzdipVar.zzf(), zzdipVar.zzm(), zzdipVar.zzn(), zzdipVar, zzdipVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcK)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
                zzc2.zzo(zzdipVar.zzf());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbS)).booleanValue()) {
                zzezu zzezuVar = this.zzb;
                if (zzezuVar.zzak && (keys = zzezuVar.zzaj.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        zzdip zzdipVar2 = this.zzo;
                        WeakReference weakReference = zzdipVar2 == null ? null : (WeakReference) zzdipVar2.zzl().get(next);
                        this.zzy.put(next, Boolean.FALSE);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzaxm zzaxmVar = new zzaxm(this.zzv, view);
                            this.zzz.add(zzaxmVar);
                            zzaxmVar.zzd(new zzdgj(this, next));
                        }
                    }
                }
            }
            if (zzdipVar.zzi() != null) {
                zzdipVar.zzi().zzd(this.zzs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(zzdip zzdipVar) {
        this.zzf.zzA(zzdipVar.zzf(), zzdipVar.zzl());
        if (zzdipVar.zzh() != null) {
            zzdipVar.zzh().setClickable(false);
            zzdipVar.zzh().removeAllViews();
        }
        if (zzdipVar.zzi() != null) {
            zzdipVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzs(zzdgm zzdgmVar, boolean z10) {
        zzdip zzdipVar = zzdgmVar.zzo;
        if (zzdipVar == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        zzdgmVar.zzf.zzp(null, zzdipVar.zzf(), zzdgmVar.zzo.zzl(), zzdgmVar.zzo.zzm(), z10, zzdgmVar.zzaa(), 0);
    }

    public static /* synthetic */ void zzt(zzdgm zzdgmVar) {
        try {
            zzdgr zzdgrVar = zzdgmVar.zze;
            int zzc2 = zzdgrVar.zzc();
            if (zzc2 == 1) {
                zzbfz zzb = zzdgmVar.zzi.zzb();
                if (zzb != null) {
                    zzdgmVar.zzab("Google", true);
                    zzb.zze((zzbfp) zzdgmVar.zzj.zzb());
                }
            } else if (zzc2 == 2) {
                zzbfw zza = zzdgmVar.zzi.zza();
                if (zza != null) {
                    zzdgmVar.zzab("Google", true);
                    zza.zze((zzbfn) zzdgmVar.zzk.zzb());
                }
            } else if (zzc2 == 3) {
                zzbgf zzd = zzdgmVar.zzi.zzd(zzdgrVar.zzA());
                if (zzd != null) {
                    if (zzdgmVar.zze.zzs() != null) {
                        zzdgmVar.zzf("Google", true);
                    }
                    zzd.zze((zzbfs) zzdgmVar.zzn.zzb());
                }
            } else if (zzc2 == 6) {
                zzbgm zzf = zzdgmVar.zzi.zzf();
                if (zzf != null) {
                    zzdgmVar.zzab("Google", true);
                    zzf.zze((zzbgs) zzdgmVar.zzl.zzb());
                }
            } else if (zzc2 != 7) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Wrong native template id!");
            } else {
                zzblh zzg = zzdgmVar.zzi.zzg();
                if (zzg != null) {
                    zzg.zzg((zzblb) zzdgmVar.zzm.zzb());
                }
            }
        } catch (RemoteException e8) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("RemoteException when notifyAdLoad is called", e8);
        }
    }

    public static /* synthetic */ void zzu(zzdgm zzdgmVar, View view, boolean z10, int i10) {
        zzdip zzdipVar = zzdgmVar.zzo;
        if (zzdipVar == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            return;
        }
        zzdgmVar.zzf.zzp(view, zzdipVar.zzf(), zzdgmVar.zzo.zzl(), zzdgmVar.zzo.zzm(), z10, zzdgmVar.zzaa(), i10);
    }

    public static /* synthetic */ void zzv(zzdgm zzdgmVar) {
        zzdgmVar.zzf.zzj();
        zzdgmVar.zze.zzI();
    }

    public final synchronized void zzA() {
        this.zzf.zzi();
    }

    public final synchronized void zzB(View view, Map map, Map map2, boolean z10) {
        if (!this.zzq) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbS)).booleanValue() && this.zzb.zzak) {
                for (String str : this.zzy.keySet()) {
                    if (!((Boolean) this.zzy.get(str)).booleanValue()) {
                        break;
                    }
                }
            }
            if (!z10) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdY)).booleanValue() && map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        View view2 = (View) ((WeakReference) entry.getValue()).get();
                        if (view2 != null && zzY(view2)) {
                            zzac(view, map, map2);
                            return;
                        }
                    }
                }
            } else {
                zzac(view, map, map2);
            }
        }
    }

    public final synchronized void zzC(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzf.zzk(zzdgVar);
    }

    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z10) {
        zzcdq zzs;
        this.zzg.zzc(this.zzo);
        this.zzf.zzl(view, view2, map, map2, z10, zzaa());
        if (this.zzr) {
            zzdgr zzdgrVar = this.zze;
            if (zzdgrVar.zzs() != null && (zzs = zzdgrVar.zzs()) != null) {
                zzs.zzd("onSdkAdUserInteractionClick", new androidx.collection.a());
            }
        }
    }

    public final synchronized void zzE(final View view, final int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlv)).booleanValue()) {
            zzdip zzdipVar = this.zzo;
            if (zzdipVar == null) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                return;
            }
            final boolean z10 = zzdipVar instanceof zzdhl;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgg
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgm.zzu(zzdgm.this, view, z10, i10);
                }
            });
        }
    }

    public final synchronized void zzF(String str) {
        this.zzf.zzm(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.zzf.zzn(bundle);
    }

    public final synchronized void zzH() {
        zzdip zzdipVar = this.zzo;
        if (zzdipVar == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z10 = zzdipVar instanceof zzdhl;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgi
            @Override // java.lang.Runnable
            public final void run() {
                zzdgm.zzs(zzdgm.this, z10);
            }
        });
    }

    public final void zzI(Bundle bundle) {
        final zzcdq zzs = this.zze.zzs();
        if (zzs == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgf
                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = zzdgm.zzc;
                    zzcdq.this.zze("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e8) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error reading event signals", e8);
        }
    }

    public final synchronized void zzJ() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzs();
    }

    public final void zzK(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfn)).booleanValue()) {
            zzdgr zzdgrVar = this.zze;
            if (zzdgrVar.zzc() != 3) {
                zzbyu zzp = zzdgrVar.zzp();
                if (zzp == null) {
                    return;
                }
                zzgap.zzr(zzp, new zzdgl(this, view), this.zzd);
                return;
            }
        }
        zzad(view, this.zze.zzu());
    }

    public final synchronized void zzL(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzt(view, motionEvent, view2);
    }

    public final synchronized void zzM(Bundle bundle) {
        this.zzf.zzu(bundle);
    }

    public final synchronized void zzN(View view) {
        this.zzf.zzv(view);
    }

    public final synchronized void zzO() {
        this.zzf.zzw();
    }

    public final synchronized void zzP(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.zzf.zzx(zzdcVar);
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzx.zza(zzdqVar);
    }

    public final synchronized void zzR(zzbgp zzbgpVar) {
        this.zzf.zzy(zzbgpVar);
    }

    public final synchronized void zzS(final zzdip zzdipVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbQ)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgb
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgm.this.zzae(zzdipVar);
                }
            });
        } else {
            zzae(zzdipVar);
        }
    }

    public final synchronized void zzT(final zzdip zzdipVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbQ)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgc
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgm.this.zzaf(zzdipVar);
                }
            });
        } else {
            zzaf(zzdipVar);
        }
    }

    public final boolean zzU() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzV() {
        return this.zzf.zzB();
    }

    public final synchronized boolean zzW() {
        return this.zzf.zzC();
    }

    public final boolean zzX() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzZ(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzD = this.zzf.zzD(bundle);
        this.zzq = zzD;
        return zzD;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcpl
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgh
            @Override // java.lang.Runnable
            public final void run() {
                zzdgm.zzv(zzdgm.this);
            }
        });
        super.zzb();
    }

    public final zzdgo zzc() {
        return this.zzw;
    }

    public final zzebb zzf(String str, boolean z10) {
        boolean z11;
        String str2;
        zzeay zzeayVar;
        zzeay zzeayVar2;
        zzeax zzeaxVar;
        if (this.zzh.zzd() && !TextUtils.isEmpty(str)) {
            zzdgr zzdgrVar = this.zze;
            zzcdq zzr = zzdgrVar.zzr();
            zzcdq zzs = zzdgrVar.zzs();
            if (zzr == null && zzs == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            this.zzh.zza();
            int zzc2 = this.zzh.zza().zzc();
            int i11 = zzc2 - 1;
            boolean z12 = false;
            if (i11 != 0) {
                if (i11 != 1) {
                    String str3 = "Unknown omid media type: " + (zzc2 != 1 ? zzc2 != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.";
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj(str3);
                    return null;
                } else if (zzr == null) {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid media type was display but there was no display webview.");
                    return null;
                } else {
                    z11 = false;
                    z12 = true;
                }
            } else if (zzs != null) {
                z11 = true;
            } else {
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid media type was video but there was no video webview.");
            }
            if (z12) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzr = zzs;
            }
            if (zzr != null) {
                if (!com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zzv)) {
                    int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                VersionInfoParcel versionInfoParcel = this.zzu;
                String str4 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                if (z11) {
                    zzeaxVar = zzeax.VIDEO;
                    zzeayVar2 = zzeay.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzdgr zzdgrVar2 = this.zze;
                    zzeax zzeaxVar2 = zzeax.NATIVE_DISPLAY;
                    if (zzdgrVar2.zzc() == 3) {
                        zzeayVar = zzeay.UNSPECIFIED;
                    } else {
                        zzeayVar = zzeay.ONE_PIXEL;
                    }
                    zzeayVar2 = zzeayVar;
                    zzeaxVar = zzeaxVar2;
                }
                zzebb zzb = com.google.android.gms.ads.internal.zzv.zzB().zzb(str4, zzr.zzG(), "", "javascript", str2, str, zzeayVar2, zzeaxVar, this.zzb.zzal);
                if (zzb == null) {
                    int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                this.zze.zzW(zzb);
                zzr.zzat(zzb);
                if (z11) {
                    zzfiv zza = zzb.zza();
                    if (zzs != null) {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zza, zzs.zzF());
                    }
                    this.zzr = true;
                }
                if (z10) {
                    com.google.android.gms.ads.internal.zzv.zzB().zzk(zzb.zza());
                    zzr.zzd("onSdkLoaded", new androidx.collection.a());
                }
                return zzb;
            }
            int i17 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Webview is null in InternalNativeAd");
            return null;
        }
        return null;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzaa());
    }

    public final synchronized JSONObject zzj(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzaa());
    }

    @Override // com.google.android.gms.internal.ads.zzcpl
    public final void zzk() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgd
            @Override // java.lang.Runnable
            public final void run() {
                zzdgm.zzt(zzdgm.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdgz zzdgzVar = this.zzf;
            Objects.requireNonNull(zzdgzVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdge
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgz.this.zzq();
                }
            });
        }
        super.zzk();
    }

    public final void zzz(View view) {
        zzebb zzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzg(zzu.zza(), view);
    }
}
