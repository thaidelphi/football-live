package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.h;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.b9;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdgr {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzea zzb;
    private zzber zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzew zzg;
    private Bundle zzh;
    private zzcdq zzi;
    private zzcdq zzj;
    private zzcdq zzk;
    private zzebb zzl;
    private b6.a zzm;
    private zzbyu zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbey zzs;
    private zzbey zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final h zzv = new h();
    private final h zzw = new h();
    private List zzf = Collections.emptyList();

    public static zzdgr zzag(zzboo zzbooVar) {
        try {
            zzdgq zzak = zzak(zzbooVar.zzg(), null);
            zzber zzh = zzbooVar.zzh();
            String zzo = zzbooVar.zzo();
            List zzr = zzbooVar.zzr();
            String zzm = zzbooVar.zzm();
            Bundle zzf = zzbooVar.zzf();
            String zzn = zzbooVar.zzn();
            IObjectWrapper zzl = zzbooVar.zzl();
            String zzq = zzbooVar.zzq();
            String zzp = zzbooVar.zzp();
            double zze = zzbooVar.zze();
            zzbey zzi = zzbooVar.zzi();
            zzdgr zzdgrVar = new zzdgr();
            zzdgrVar.zza = 2;
            zzdgrVar.zzb = zzak;
            zzdgrVar.zzc = zzh;
            zzdgrVar.zzd = (View) zzam(zzbooVar.zzj());
            zzdgrVar.zzZ("headline", zzo);
            zzdgrVar.zze = zzr;
            zzdgrVar.zzZ(b9.h.E0, zzm);
            zzdgrVar.zzh = zzf;
            zzdgrVar.zzZ("call_to_action", zzn);
            zzdgrVar.zzo = (View) zzam(zzbooVar.zzk());
            zzdgrVar.zzq = zzl;
            zzdgrVar.zzZ(b9.h.U, zzq);
            zzdgrVar.zzZ("price", zzp);
            zzdgrVar.zzr = zze;
            zzdgrVar.zzs = zzi;
            return zzdgrVar;
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad from app install ad mapper", e8);
            return null;
        }
    }

    public static zzdgr zzah(zzbop zzbopVar) {
        try {
            zzdgq zzak = zzak(zzbopVar.zzf(), null);
            zzber zzg = zzbopVar.zzg();
            String zzo = zzbopVar.zzo();
            List zzp = zzbopVar.zzp();
            String zzm = zzbopVar.zzm();
            Bundle zze = zzbopVar.zze();
            String zzn = zzbopVar.zzn();
            IObjectWrapper zzk = zzbopVar.zzk();
            String zzl = zzbopVar.zzl();
            zzbey zzh = zzbopVar.zzh();
            zzdgr zzdgrVar = new zzdgr();
            zzdgrVar.zza = 1;
            zzdgrVar.zzb = zzak;
            zzdgrVar.zzc = zzg;
            zzdgrVar.zzd = (View) zzam(zzbopVar.zzi());
            zzdgrVar.zzZ("headline", zzo);
            zzdgrVar.zze = zzp;
            zzdgrVar.zzZ(b9.h.E0, zzm);
            zzdgrVar.zzh = zze;
            zzdgrVar.zzZ("call_to_action", zzn);
            zzdgrVar.zzo = (View) zzam(zzbopVar.zzj());
            zzdgrVar.zzq = zzk;
            zzdgrVar.zzZ(b9.h.F0, zzl);
            zzdgrVar.zzt = zzh;
            return zzdgrVar;
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad from content ad mapper", e8);
            return null;
        }
    }

    public static zzdgr zzai(zzboo zzbooVar) {
        try {
            return zzal(zzak(zzbooVar.zzg(), null), zzbooVar.zzh(), (View) zzam(zzbooVar.zzj()), zzbooVar.zzo(), zzbooVar.zzr(), zzbooVar.zzm(), zzbooVar.zzf(), zzbooVar.zzn(), (View) zzam(zzbooVar.zzk()), zzbooVar.zzl(), zzbooVar.zzq(), zzbooVar.zzp(), zzbooVar.zze(), zzbooVar.zzi(), null, 0.0f);
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from app install ad mapper", e8);
            return null;
        }
    }

    public static zzdgr zzaj(zzbop zzbopVar) {
        try {
            return zzal(zzak(zzbopVar.zzf(), null), zzbopVar.zzg(), (View) zzam(zzbopVar.zzi()), zzbopVar.zzo(), zzbopVar.zzp(), zzbopVar.zzm(), zzbopVar.zze(), zzbopVar.zzn(), (View) zzam(zzbopVar.zzj()), zzbopVar.zzk(), null, null, -1.0d, zzbopVar.zzh(), zzbopVar.zzl(), 0.0f);
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from content ad mapper", e8);
            return null;
        }
    }

    private static zzdgq zzak(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbos zzbosVar) {
        if (zzeaVar == null) {
            return null;
        }
        return new zzdgq(zzeaVar, zzbosVar);
    }

    private static zzdgr zzal(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzber zzberVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d10, zzbey zzbeyVar, String str6, float f10) {
        zzdgr zzdgrVar = new zzdgr();
        zzdgrVar.zza = 6;
        zzdgrVar.zzb = zzeaVar;
        zzdgrVar.zzc = zzberVar;
        zzdgrVar.zzd = view;
        zzdgrVar.zzZ("headline", str);
        zzdgrVar.zze = list;
        zzdgrVar.zzZ(b9.h.E0, str2);
        zzdgrVar.zzh = bundle;
        zzdgrVar.zzZ("call_to_action", str3);
        zzdgrVar.zzo = view2;
        zzdgrVar.zzq = iObjectWrapper;
        zzdgrVar.zzZ(b9.h.U, str4);
        zzdgrVar.zzZ("price", str5);
        zzdgrVar.zzr = d10;
        zzdgrVar.zzs = zzbeyVar;
        zzdgrVar.zzZ(b9.h.F0, str6);
        zzdgrVar.zzR(f10);
        return zzdgrVar;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.t0(iObjectWrapper);
    }

    public static zzdgr zzt(zzbos zzbosVar) {
        try {
            return zzal(zzak(zzbosVar.zzj(), zzbosVar), zzbosVar.zzk(), (View) zzam(zzbosVar.zzm()), zzbosVar.zzs(), zzbosVar.zzv(), zzbosVar.zzq(), zzbosVar.zzi(), zzbosVar.zzr(), (View) zzam(zzbosVar.zzn()), zzbosVar.zzo(), zzbosVar.zzu(), zzbosVar.zzt(), zzbosVar.zze(), zzbosVar.zzl(), zzbosVar.zzp(), zzbosVar.zzf());
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from unified ad mapper", e8);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF(b9.h.U);
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcdq zzcdqVar = this.zzi;
        if (zzcdqVar != null) {
            zzcdqVar.destroy();
            this.zzi = null;
        }
        zzcdq zzcdqVar2 = this.zzj;
        if (zzcdqVar2 != null) {
            zzcdqVar2.destroy();
            this.zzj = null;
        }
        zzcdq zzcdqVar3 = this.zzk;
        if (zzcdqVar3 != null) {
            zzcdqVar3.destroy();
            this.zzk = null;
        }
        b6.a aVar = this.zzm;
        if (aVar != null) {
            aVar.cancel(false);
            this.zzm = null;
        }
        zzbyu zzbyuVar = this.zzn;
        if (zzbyuVar != null) {
            zzbyuVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzber zzberVar) {
        this.zzc = zzberVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zzew zzewVar) {
        this.zzg = zzewVar;
    }

    public final synchronized void zzM(zzbey zzbeyVar) {
        this.zzs = zzbeyVar;
    }

    public final synchronized void zzN(String str, zzbel zzbelVar) {
        if (zzbelVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbelVar);
        }
    }

    public final synchronized void zzO(zzcdq zzcdqVar) {
        this.zzj = zzcdqVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbey zzbeyVar) {
        this.zzt = zzbeyVar;
    }

    public final synchronized void zzR(float f10) {
        this.zzx = f10;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcdq zzcdqVar) {
        this.zzk = zzcdqVar;
    }

    public final synchronized void zzU(b6.a aVar) {
        this.zzm = aVar;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzebb zzebbVar) {
        this.zzl = zzebbVar;
    }

    public final synchronized void zzX(zzbyu zzbyuVar) {
        this.zzn = zzbyuVar;
    }

    public final synchronized void zzY(double d10) {
        this.zzr = d10;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i10) {
        this.zza = i10;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zzb = zzeaVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcdq zzcdqVar) {
        this.zzi = zzcdqVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized h zzh() {
        return this.zzv;
    }

    public final synchronized h zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzea zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzew zzk() {
        return this.zzg;
    }

    public final synchronized zzber zzl() {
        return this.zzc;
    }

    public final zzbey zzm() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbex.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized zzbey zzn() {
        return this.zzs;
    }

    public final synchronized zzbey zzo() {
        return this.zzt;
    }

    public final synchronized zzbyu zzp() {
        return this.zzn;
    }

    public final synchronized zzcdq zzq() {
        return this.zzj;
    }

    public final synchronized zzcdq zzr() {
        return this.zzk;
    }

    public final synchronized zzcdq zzs() {
        return this.zzi;
    }

    public final synchronized zzebb zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized b6.a zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF(b9.h.F0);
    }

    public final synchronized String zzy() {
        return zzF(b9.h.E0);
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
