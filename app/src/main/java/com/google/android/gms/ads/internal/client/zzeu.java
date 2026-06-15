package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbku;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzftm;
import com.ironsource.mediationsdk.metadata.a;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiFunction;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzeu {

    /* renamed from: j */
    private static zzeu f11265j;
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));

    /* renamed from: g */
    private zzcy f11272g;

    /* renamed from: a */
    private final Object f11266a = new Object();

    /* renamed from: b */
    private final Object f11267b = new Object();

    /* renamed from: d */
    private boolean f11269d = false;

    /* renamed from: e */
    private boolean f11270e = false;

    /* renamed from: f */
    private final Object f11271f = new Object();

    /* renamed from: h */
    private OnAdInspectorClosedListener f11273h = null;

    /* renamed from: i */
    private RequestConfiguration f11274i = new RequestConfiguration.Builder().build();

    /* renamed from: c */
    private final ArrayList f11268c = new ArrayList();

    private zzeu() {
    }

    public static InitializationStatus a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbkm zzbkmVar = (zzbkm) it.next();
            hashMap.put(zzbkmVar.zza, new zzbku(zzbkmVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbkmVar.zzd, zzbkmVar.zzc));
        }
        return new zzbkv(hashMap);
    }

    private final void b(Context context, String str) {
        try {
            zzbnv.zza().zzb(context, null);
            this.f11272g.zzk();
            this.f11272g.zzl(null, ObjectWrapper.u0(null));
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("MobileAdsSettingManager initialization failed", e8);
        }
    }

    private final void c(Context context) {
        if (this.f11272g == null) {
            this.f11272g = (zzcy) new zzau(zzbb.zza(), context).zzd(context, false);
        }
    }

    private final void d(RequestConfiguration requestConfiguration) {
        try {
            this.f11272g.zzu(new zzfs(requestConfiguration));
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set request configuration parcel.", e8);
        }
    }

    public static /* bridge */ /* synthetic */ PreloadConfiguration g(zzeu zzeuVar, zzfq zzfqVar) {
        String str = zzfqVar.zza;
        AdFormat adFormat = AdFormat.getAdFormat(zzfqVar.zzb);
        if (adFormat == null) {
            return null;
        }
        zzm zzmVar = zzfqVar.zzc;
        AdRequest.Builder builder = new AdRequest.Builder();
        List<String> list = zzmVar.zze;
        if (list != null) {
            for (String str2 : list) {
                builder.addKeyword(str2);
            }
        }
        builder.zzc(zzmVar.zzm);
        for (String str3 : zzmVar.zzn.keySet()) {
            builder.addCustomTargeting(str3, zzmVar.zzn.getString(str3));
        }
        builder.setAdString(zzmVar.zzx);
        String str4 = zzmVar.zzl;
        if (str4 != null) {
            builder.setContentUrl(str4);
        }
        builder.setNeighboringContentUrls(zzmVar.zzv);
        builder.setRequestAgent(zzmVar.zzp);
        AdRequest build = builder.build();
        PreloadConfiguration.Builder builder2 = new PreloadConfiguration.Builder(str, adFormat);
        builder2.setAdRequest(build);
        builder2.setBufferSize(zzfqVar.zzd);
        return builder2.build();
    }

    public static zzeu zzf() {
        zzeu zzeuVar;
        synchronized (zzeu.class) {
            if (f11265j == null) {
                f11265j = new zzeu();
            }
            zzeuVar = f11265j;
        }
        return zzeuVar;
    }

    public static /* synthetic */ void zzl(zzeu zzeuVar, Context context, String str) {
        synchronized (zzeuVar.f11271f) {
            zzeuVar.b(context, null);
        }
    }

    public static /* synthetic */ void zzm(zzeu zzeuVar, Context context, String str) {
        synchronized (zzeuVar.f11271f) {
            zzeuVar.b(context, null);
        }
    }

    public final float zza() {
        synchronized (this.f11271f) {
            zzcy zzcyVar = this.f11272g;
            float f10 = 1.0f;
            if (zzcyVar == null) {
                return 1.0f;
            }
            try {
                f10 = zzcyVar.zze();
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get app volume.", e8);
            }
            return f10;
        }
    }

    public final RequestConfiguration zzc() {
        return this.f11274i;
    }

    public final InitializationStatus zze() {
        InitializationStatus a10;
        synchronized (this.f11271f) {
            Preconditions.q(this.f11272g != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                a10 = a(this.f11272g.zzg());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzel
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzeq(zzeu.this));
                        return hashMap;
                    }
                };
            }
        }
        return a10;
    }

    public final Status zzh(Context context, List list, PreloadCallback preloadCallback) {
        boolean z10;
        Status status;
        int bufferSize;
        int intValue;
        int intValue2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String str = String.valueOf(preloadConfiguration.getAdFormat()) + "#" + preloadConfiguration.getAdUnitId();
            hashMap.put(str, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zze(hashMap, str, 0)).intValue() + 1));
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                    hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (!zza.contains(preloadConfiguration2.getAdFormat())) {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            } else {
                hashMap2.compute(adFormat, new BiFunction() { // from class: com.google.android.gms.ads.internal.client.zzem
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        AdFormat adFormat2 = (AdFormat) obj;
                        Integer num = (Integer) obj2;
                        Set set = zzeu.zza;
                        return Integer.valueOf(num != null ? 1 + num.intValue() : 1);
                    }
                });
                if (preloadConfiguration2.getBufferSize() > 15) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, adFormat.name()));
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size less than 0 for %s", adFormat.name()));
                }
            }
            z10 = true;
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AdFormat.APP_OPEN_AD, (Integer) zzbd.zzc().zzb(zzbbm.zzeC)), new AbstractMap.SimpleEntry(AdFormat.INTERSTITIAL, (Integer) zzbd.zzc().zzb(zzbbm.zzeA)), new AbstractMap.SimpleEntry(AdFormat.REWARDED, (Integer) zzbd.zzc().zzb(zzbbm.zzeB))};
        HashMap hashMap3 = new HashMap(3);
        for (int i10 = 0; i10 < 3; i10++) {
            Map.Entry entry = entryArr[i10];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (hashMap3.put(key, value) != null) {
                key.toString();
                throw new IllegalArgumentException("duplicate key: ".concat(String.valueOf(key)));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry2.getKey();
            int intValue3 = ((Integer) entry2.getValue()).intValue();
            int intValue4 = ((Integer) com.google.android.gms.ads.internal.util.client.zzf.zze(unmodifiableMap, adFormat2, 0)).intValue();
            if (intValue3 > intValue4) {
                hashSet.add(String.format(Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", Integer.valueOf(intValue4), adFormat2.name()));
                z10 = true;
            }
        }
        if (z10) {
            StringBuilder sb = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                if (it4.hasNext()) {
                    sb.append(", ");
                }
            }
            String sb2 = sb.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzg(sb2);
            status = new Status(13, sb2);
        } else {
            status = Status.f12066f;
        }
        String o02 = status.o0();
        if (o02 == null) {
            o02 = "";
        }
        Preconditions.b(status.z0(), o02);
        zzbbm.zza(context);
        synchronized (this.f11267b) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                PreloadConfiguration preloadConfiguration3 = (PreloadConfiguration) it5.next();
                zzm zza2 = zzq.zza.zza(context, preloadConfiguration3.getAdRequest().zza());
                zza2.zzc.putBoolean("is_sdk_preload", true);
                if (preloadConfiguration3.getBufferSize() <= 0) {
                    int ordinal = preloadConfiguration3.getAdFormat().ordinal();
                    if (ordinal == 1) {
                        bufferSize = ((Integer) zzbd.zzc().zzb(zzbbm.zzF)).intValue();
                    } else if (ordinal != 2) {
                        bufferSize = ordinal != 5 ? 1 : ((Integer) zzbd.zzc().zzb(zzbbm.zzE)).intValue();
                    } else {
                        bufferSize = ((Integer) zzbd.zzc().zzb(zzbbm.zzG)).intValue();
                    }
                } else {
                    bufferSize = preloadConfiguration3.getBufferSize();
                }
                int ordinal2 = preloadConfiguration3.getAdFormat().ordinal();
                if (ordinal2 == 1) {
                    intValue = ((Integer) zzbd.zzc().zzb(zzbbm.zzC)).intValue();
                } else if (ordinal2 != 2) {
                    intValue = ordinal2 != 5 ? 1 : ((Integer) zzbd.zzc().zzb(zzbbm.zzB)).intValue();
                } else {
                    intValue = ((Integer) zzbd.zzc().zzb(zzbbm.zzD)).intValue();
                }
                int max = Math.max(Math.min(intValue, 15), 1);
                int ordinal3 = preloadConfiguration3.getAdFormat().ordinal();
                if (ordinal3 == 1) {
                    intValue2 = ((Integer) zzbd.zzc().zzb(zzbbm.zzI)).intValue();
                } else if (ordinal3 != 2) {
                    intValue2 = ordinal3 != 5 ? 1 : ((Integer) zzbd.zzc().zzb(zzbbm.zzH)).intValue();
                } else {
                    intValue2 = ((Integer) zzbd.zzc().zzb(zzbbm.zzJ)).intValue();
                }
                arrayList.add(new zzfq(preloadConfiguration3.getAdUnitId(), preloadConfiguration3.getAdFormat().getValue(), zza2, Math.max(Math.min(bufferSize, max), Math.min(intValue2, max))));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zzi(arrayList, new zzep(this, preloadCallback));
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to start preload.", e8);
                return Status.f12068h;
            }
        }
        return Status.f12066f;
    }

    public final String zzj() {
        String zzc;
        synchronized (this.f11271f) {
            Preconditions.q(this.f11272g != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzc = zzftm.zzc(this.f11272g.zzf());
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get internal version.", e8);
                return "";
            }
        }
        return zzc;
    }

    public final void zzp(Context context) {
        synchronized (this.f11271f) {
            c(context);
            try {
                this.f11272g.zzi();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzq(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.f11266a) {
            if (this.f11269d) {
                if (onInitializationCompleteListener != null) {
                    this.f11268c.add(onInitializationCompleteListener);
                }
            } else if (this.f11270e) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
            } else {
                this.f11269d = true;
                if (onInitializationCompleteListener != null) {
                    this.f11268c.add(onInitializationCompleteListener);
                }
                if (context != null) {
                    synchronized (this.f11271f) {
                        try {
                            c(context);
                            this.f11272g.zzs(new zzes(this, null));
                            this.f11272g.zzo(new zzbnz());
                            if (this.f11274i.getTagForChildDirectedTreatment() != -1 || this.f11274i.getTagForUnderAgeOfConsent() != -1) {
                                d(this.f11274i);
                            }
                        } catch (RemoteException e8) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzk("MobileAdsSettingManager initialization failed", e8);
                        }
                        zzbbm.zza(context);
                        if (((Boolean) zzbdk.zza.zze()).booleanValue()) {
                            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzlc)).booleanValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on bg thread");
                                com.google.android.gms.ads.internal.util.client.zzb.zza.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzen
                                    public final /* synthetic */ Context zzb;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzeu.zzm(zzeu.this, this.zzb, null);
                                    }
                                });
                            }
                        }
                        if (((Boolean) zzbdk.zzb.zze()).booleanValue()) {
                            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzlc)).booleanValue()) {
                                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzeo
                                    public final /* synthetic */ Context zzb;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzeu.zzl(zzeu.this, this.zzb, null);
                                    }
                                });
                            }
                        }
                        com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on calling thread");
                        b(context, null);
                    }
                    return;
                }
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }

    public final void zzr(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.f11271f) {
            c(context);
            this.f11273h = onAdInspectorClosedListener;
            try {
                this.f11272g.zzm(new zzer(null));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzs(Context context, String str) {
        synchronized (this.f11271f) {
            Preconditions.q(this.f11272g != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f11272g.zzn(ObjectWrapper.u0(context), str);
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to open debug menu.", e8);
            }
        }
    }

    public final void zzt(Class cls) {
        synchronized (this.f11271f) {
            try {
                this.f11272g.zzh(cls.getCanonicalName());
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to register RtbAdapter", e8);
            }
        }
    }

    public final void zzu(boolean z10) {
        synchronized (this.f11271f) {
            Preconditions.q(this.f11272g != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f11272g.zzp(z10);
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set app mute state.", e8);
            }
        }
    }

    public final void zzv(float f10) {
        boolean z10 = true;
        Preconditions.b(f10 >= 0.0f && f10 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f11271f) {
            if (this.f11272g == null) {
                z10 = false;
            }
            Preconditions.q(z10, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f11272g.zzq(f10);
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set app volume.", e8);
            }
        }
    }

    public final void zzw(String str) {
        synchronized (this.f11271f) {
            Preconditions.q(this.f11272g != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f11272g.zzt(str);
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set plugin.", e8);
            }
        }
    }

    public final void zzx(RequestConfiguration requestConfiguration) {
        Preconditions.b(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.f11271f) {
            RequestConfiguration requestConfiguration2 = this.f11274i;
            this.f11274i = requestConfiguration;
            if (this.f11272g == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                d(requestConfiguration);
            }
        }
    }

    public final boolean zzy() {
        synchronized (this.f11271f) {
            zzcy zzcyVar = this.f11272g;
            boolean z10 = false;
            if (zzcyVar == null) {
                return false;
            }
            try {
                z10 = zzcyVar.zzv();
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get app mute state.", e8);
            }
            return z10;
        }
    }

    public final boolean zzz(boolean z10) {
        synchronized (this.f11271f) {
            Preconditions.q(this.f11272g != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            try {
                this.f11272g.zzj(z10);
            } catch (RemoteException e8) {
                String str = z10 ? a.f18927j : "disable";
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to " + str + " the publisher first-party ID.", e8);
                return false;
            }
        }
        return true;
    }
}
