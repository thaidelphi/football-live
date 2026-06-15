package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdiu implements zzdgz {
    private final zzbos zza;
    private final zzcux zzb;
    private final zzcud zzc;
    private final zzdcc zzd;
    private final Context zze;
    private final zzezu zzf;
    private final VersionInfoParcel zzg;
    private final zzfap zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzboo zzl;
    private final zzbop zzm;

    public zzdiu(zzboo zzbooVar, zzbop zzbopVar, zzbos zzbosVar, zzcux zzcuxVar, zzcud zzcudVar, zzdcc zzdccVar, Context context, zzezu zzezuVar, VersionInfoParcel versionInfoParcel, zzfap zzfapVar) {
        this.zzl = zzbooVar;
        this.zzm = zzbopVar;
        this.zza = zzbosVar;
        this.zzb = zzcuxVar;
        this.zzc = zzcudVar;
        this.zzd = zzdccVar;
        this.zze = context;
        this.zzf = zzezuVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzfapVar;
    }

    private final void zzb(View view) {
        try {
            zzbos zzbosVar = this.zza;
            if (zzbosVar != null && !zzbosVar.zzA()) {
                this.zza.zzw(ObjectWrapper.u0(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkH)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            zzboo zzbooVar = this.zzl;
            if (zzbooVar != null && !zzbooVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.u0(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkH)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            zzbop zzbopVar = this.zzm;
            if (zzbopVar == null || zzbopVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.u0(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkH)).booleanValue()) {
                this.zzd.zzdd();
            }
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call handleClick", e8);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzA(View view, Map map) {
        try {
            IObjectWrapper u02 = ObjectWrapper.u0(view);
            zzbos zzbosVar = this.zza;
            if (zzbosVar != null) {
                zzbosVar.zzz(u02);
                return;
            }
            zzboo zzbooVar = this.zzl;
            if (zzbooVar != null) {
                zzbooVar.zzw(u02);
                return;
            }
            zzbop zzbopVar = this.zzm;
            if (zzbopVar != null) {
                zzbopVar.zzu(u02);
            }
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call untrackView", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final boolean zzB() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final boolean zzC() {
        return this.zzf.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final boolean zzD(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzh() {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzk(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzl(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzL) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzm(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzn(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzp(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        if (!this.zzj) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzL) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzb(view2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzv.zzt().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbos zzbosVar = this.zza;
                if (zzbosVar != null && !zzbosVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzboo zzbooVar = this.zzl;
                if (zzbooVar != null && !zzbooVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbop zzbopVar = this.zzm;
                if (zzbopVar == null || zzbopVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call recordImpression", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzt(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzu(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzv(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzw() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzx(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzy(zzbgp zzbgpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgz
    public final void zzz(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper u02 = ObjectWrapper.u0(view);
            JSONObject jSONObject = this.zzf.zzaj;
            boolean z10 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbF)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbG)).booleanValue() && next.equals("3010")) {
                                zzbos zzbosVar = this.zza;
                                Object obj2 = null;
                                if (zzbosVar != null) {
                                    try {
                                        zzn = zzbosVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzboo zzbooVar = this.zzl;
                                    if (zzbooVar != null) {
                                        zzn = zzbooVar.zzk();
                                    } else {
                                        zzbop zzbopVar = this.zzm;
                                        zzn = zzbopVar != null ? zzbopVar.zzj() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.t0(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList<String> arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbs.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzv.zzq();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                for (String str : arrayList) {
                                    if (Class.forName(str, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z10 = false;
                        break;
                    }
                }
            }
            this.zzk = z10;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbos zzbosVar2 = this.zza;
            if (zzbosVar2 != null) {
                zzbosVar2.zzy(u02, ObjectWrapper.u0(zzc), ObjectWrapper.u0(zzc2));
                return;
            }
            zzboo zzbooVar2 = this.zzl;
            if (zzbooVar2 != null) {
                zzbooVar2.zzv(u02, ObjectWrapper.u0(zzc), ObjectWrapper.u0(zzc2));
                this.zzl.zzu(u02);
                return;
            }
            zzbop zzbopVar2 = this.zzm;
            if (zzbopVar2 != null) {
                zzbopVar2.zzt(u02, ObjectWrapper.u0(zzc), ObjectWrapper.u0(zzc2));
                this.zzm.zzs(u02);
            }
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call trackView", e8);
        }
    }
}
