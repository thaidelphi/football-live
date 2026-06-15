package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import b6.a;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzauc;
import com.google.android.gms.internal.ads.zzaud;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbcr;
import com.google.android.gms.internal.ads.zzbdf;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxm;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcfq;
import com.google.android.gms.internal.ads.zzctm;
import com.google.android.gms.internal.ads.zzczw;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzdqk;
import com.google.android.gms.internal.ads.zzfan;
import com.google.android.gms.internal.ads.zzfat;
import com.google.android.gms.internal.ads.zzfbo;
import com.google.android.gms.internal.ads.zzffb;
import com.google.android.gms.internal.ads.zzffc;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzffq;
import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzfsk;
import com.google.android.gms.internal.ads.zzftm;
import com.google.android.gms.internal.ads.zzfzv;
import com.google.android.gms.internal.ads.zzfzw;
import com.google.android.gms.internal.ads.zzgag;
import com.google.android.gms.internal.ads.zzgap;
import com.google.android.gms.internal.ads.zzgba;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzau extends zzbxm {
    protected static final List G = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List H = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List I = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List J = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzbcr D;
    private final zzo E;
    private final zzf F;

    /* renamed from: a  reason: collision with root package name */
    private final zzcfq f11701a;

    /* renamed from: b  reason: collision with root package name */
    private Context f11702b;

    /* renamed from: c  reason: collision with root package name */
    private final zzauc f11703c;

    /* renamed from: d  reason: collision with root package name */
    private final zzfat f11704d;

    /* renamed from: e  reason: collision with root package name */
    private final zzfbo f11705e;

    /* renamed from: f  reason: collision with root package name */
    private final zzgba f11706f;

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledExecutorService f11707g;

    /* renamed from: h  reason: collision with root package name */
    private zzbsv f11708h;

    /* renamed from: k  reason: collision with root package name */
    private final zzdqk f11711k;

    /* renamed from: l  reason: collision with root package name */
    private final zzfhp f11712l;

    /* renamed from: t  reason: collision with root package name */
    private final VersionInfoParcel f11720t;

    /* renamed from: u  reason: collision with root package name */
    private String f11721u;

    /* renamed from: w  reason: collision with root package name */
    private final List f11723w;

    /* renamed from: x  reason: collision with root package name */
    private final List f11724x;

    /* renamed from: y  reason: collision with root package name */
    private final List f11725y;

    /* renamed from: z  reason: collision with root package name */
    private final List f11726z;

    /* renamed from: i  reason: collision with root package name */
    private Point f11709i = new Point();

    /* renamed from: j  reason: collision with root package name */
    private Point f11710j = new Point();

    /* renamed from: s  reason: collision with root package name */
    private final AtomicInteger f11719s = new AtomicInteger(0);
    private final AtomicBoolean A = new AtomicBoolean(false);
    private final AtomicBoolean B = new AtomicBoolean(false);
    private final AtomicInteger C = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    private final boolean f11713m = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhd)).booleanValue();

    /* renamed from: n  reason: collision with root package name */
    private final boolean f11714n = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhc)).booleanValue();

    /* renamed from: o  reason: collision with root package name */
    private final boolean f11715o = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhf)).booleanValue();

    /* renamed from: p  reason: collision with root package name */
    private final boolean f11716p = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhh)).booleanValue();

    /* renamed from: q  reason: collision with root package name */
    private final String f11717q = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhg);

    /* renamed from: r  reason: collision with root package name */
    private final String f11718r = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhi);

    /* renamed from: v  reason: collision with root package name */
    private final String f11722v = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(zzcfq zzcfqVar, Context context, zzauc zzaucVar, zzfbo zzfboVar, zzgba zzgbaVar, ScheduledExecutorService scheduledExecutorService, zzdqk zzdqkVar, zzfhp zzfhpVar, VersionInfoParcel versionInfoParcel, zzbcr zzbcrVar, zzfat zzfatVar, zzo zzoVar, zzf zzfVar) {
        List list;
        this.f11701a = zzcfqVar;
        this.f11702b = context;
        this.f11703c = zzaucVar;
        this.f11704d = zzfatVar;
        this.f11705e = zzfboVar;
        this.f11706f = zzgbaVar;
        this.f11707g = scheduledExecutorService;
        this.f11711k = zzdqkVar;
        this.f11712l = zzfhpVar;
        this.f11720t = versionInfoParcel;
        this.D = zzbcrVar;
        this.E = zzoVar;
        this.F = zzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhk)).booleanValue()) {
            this.f11723w = N0((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhl));
            this.f11724x = N0((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhm));
            this.f11725y = N0((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhn));
            list = N0((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzho));
        } else {
            this.f11723w = G;
            this.f11724x = H;
            this.f11725y = I;
            list = J;
        }
        this.f11726z = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzac G0(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, int i10, String str3, Bundle bundle, zzbxr zzbxrVar) {
        com.google.android.gms.ads.internal.client.zzr zzrVar2;
        char c10;
        zzfan zzfanVar = new zzfan();
        if ("REWARDED".equals(str2)) {
            zzfanVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfanVar.zzp().zza(3);
        }
        zzab zzp = this.f11701a.zzp();
        zzctm zzctmVar = new zzctm();
        zzctmVar.zzf(context);
        zzfanVar.zzt(str == null ? "adUnitId" : str);
        zzfanVar.zzH(zzmVar == null ? new com.google.android.gms.ads.internal.client.zzn().zza() : zzmVar);
        if (zzrVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0) {
                zzrVar2 = new com.google.android.gms.ads.internal.client.zzr(context, AdSize.BANNER);
            } else if (c10 == 1 || c10 == 2) {
                zzrVar2 = com.google.android.gms.ads.internal.client.zzr.zzd();
            } else if (c10 == 3) {
                zzrVar2 = com.google.android.gms.ads.internal.client.zzr.zzc();
            } else if (c10 != 4) {
                zzrVar2 = new com.google.android.gms.ads.internal.client.zzr();
            } else {
                zzrVar2 = com.google.android.gms.ads.internal.client.zzr.zzb();
            }
        } else {
            zzrVar2 = zzrVar;
        }
        zzfanVar.zzs(zzrVar2);
        zzfanVar.zzz(true);
        zzfanVar.zzA(bundle);
        zzctmVar.zzk(zzfanVar.zzJ());
        zzctmVar.zzi(i10);
        zzp.zza(zzctmVar.zzl());
        zzax zzaxVar = new zzax();
        zzaxVar.zzb(str2);
        zzaxVar.zzc(str3);
        zzaxVar.zzd(zzbxrVar);
        zzp.zzb(new zzaz(zzaxVar, null));
        new zzczw();
        return zzp.zzc();
    }

    private final a H0(final String str) {
        final zzdlu[] zzdluVarArr = new zzdlu[1];
        a zzn = zzgap.zzn(this.f11705e.zza(), new zzfzw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final a zza(Object obj) {
                return zzau.zzx(zzau.this, zzdluVarArr, str, (zzdlu) obj);
            }
        }, this.f11706f);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
            @Override // java.lang.Runnable
            public final void run() {
                zzau.zzH(zzau.this, zzdluVarArr);
            }
        }, this.f11706f);
        return (zzgag) zzgap.zze((zzgag) zzgap.zzm((zzgag) zzgap.zzo(zzgag.zzu(zzn), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhB)).intValue(), TimeUnit.MILLISECONDS, this.f11707g), new zzfsk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                int i10 = zzau.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f11706f), Exception.class, new zzfsk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                int i10 = zzau.zze;
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", (Exception) obj);
                return null;
            }
        }, this.f11706f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0() {
        a zzb;
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            this.E.zze();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkY)).booleanValue()) {
            zzb = zzgap.zzk(new zzfzv() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
                @Override // com.google.android.gms.internal.ads.zzfzv
                public final a zza() {
                    a zzb2;
                    zzb2 = r0.G0(zzau.this.f11702b, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zzb();
                    return zzb2;
                }
            }, zzbyp.zza);
        } else {
            zzb = G0(this.f11702b, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zzb();
        }
        zzgap.zzr(zzb, new zzat(this), this.f11701a.zzC());
    }

    private final void J0() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjx)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjA)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjE)).booleanValue() && this.A.getAndSet(true)) {
                return;
            }
            I0();
        }
    }

    private final void K0(List list, final IObjectWrapper iObjectWrapper, zzbss zzbssVar, boolean z10) {
        a zzb;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhA)).booleanValue()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The updating URL feature is not enabled.");
            try {
                zzbssVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
                return;
            }
        }
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (E0((Uri) it.next())) {
                i11++;
            }
        }
        if (i11 > 1) {
            String valueOf = String.valueOf(list);
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Multiple google urls found: ".concat(valueOf));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!E0(uri)) {
                String valueOf2 = String.valueOf(uri);
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(valueOf2));
                zzb = zzgap.zzh(uri);
            } else {
                zzb = this.f11706f.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzau.zzn(zzau.this, uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    zzb = zzgap.zzn(zzb, new zzfzw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                        @Override // com.google.android.gms.internal.ads.zzfzw
                        public final a zza(Object obj) {
                            a zzm;
                            zzm = zzgap.zzm(r0.H0("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfsk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
                                @Override // com.google.android.gms.internal.ads.zzfsk
                                public final Object apply(Object obj2) {
                                    return zzau.zzd(zzau.this, r2, (String) obj2);
                                }
                            }, zzau.this.f11706f);
                            return zzm;
                        }
                    }, this.f11706f);
                } else {
                    int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
                }
            }
            arrayList.add(zzb);
        }
        zzgap.zzr(zzgap.zzd(arrayList), new zzas(this, zzbssVar, z10), this.f11701a.zzC());
    }

    private final void L0(final List list, final IObjectWrapper iObjectWrapper, zzbss zzbssVar, boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhA)).booleanValue()) {
            try {
                zzbssVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
                return;
            }
        }
        a zzb = this.f11706f.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzau.zzD(zzau.this, list, iObjectWrapper);
            }
        });
        if (zzY()) {
            zzb = zzgap.zzn(zzb, new zzfzw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // com.google.android.gms.internal.ads.zzfzw
                public final a zza(Object obj) {
                    a zzm;
                    zzm = zzgap.zzm(r0.H0("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfsk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
                        @Override // com.google.android.gms.internal.ads.zzfsk
                        public final Object apply(Object obj2) {
                            return zzau.zzC(zzau.this, r2, (String) obj2);
                        }
                    }, zzau.this.f11706f);
                    return zzm;
                }
            }, this.f11706f);
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
        }
        zzgap.zzr(zzb, new zzar(this, zzbssVar, z10), this.f11701a.zzC());
    }

    private static boolean M0(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private static final List N0(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzftm.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri O0(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            return Uri.parse(uri2.substring(0, i10) + str + b9.i.f16692b + str2 + b9.i.f16694c + uri2.substring(i10));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzffn T0(a aVar, zzbxr zzbxrVar) {
        if (zzffq.zza() && ((Boolean) zzbdf.zze.zze()).booleanValue()) {
            try {
                zzffn zza = ((zzac) zzgap.zzp(aVar)).zza();
                zza.zzd(new ArrayList(Collections.singletonList(zzbxrVar.zzb)));
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzbxrVar.zzd;
                zza.zzb(zzmVar == null ? "" : zzmVar.zzp);
                zza.zzf(zzbxrVar.zzd.zzm);
                return zza;
            } catch (ExecutionException e8) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void y0(zzau zzauVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzauVar.E0((Uri) it.next())) {
                zzauVar.f11719s.getAndIncrement();
                return;
            }
        }
    }

    public static /* synthetic */ ArrayList zzC(zzau zzauVar, List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzauVar.F0(uri) && !TextUtils.isEmpty(str)) {
                arrayList.add(O0(uri, "nas", str));
            } else {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ ArrayList zzD(zzau zzauVar, List list, IObjectWrapper iObjectWrapper) {
        String zzh = zzauVar.f11703c.zzc() != null ? zzauVar.f11703c.zzc().zzh(zzauVar.f11702b, (View) ObjectWrapper.t0(iObjectWrapper), null) : "";
        if (!TextUtils.isEmpty(zzh)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzauVar.F0(uri)) {
                    String valueOf = String.valueOf(uri);
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(valueOf));
                    arrayList.add(uri);
                } else {
                    arrayList.add(O0(uri, "ms", zzh));
                }
            }
            if (arrayList.isEmpty()) {
                throw new Exception("Empty impression URLs result.");
            }
            return arrayList;
        }
        throw new Exception("Failed to get view signals.");
    }

    public static /* synthetic */ void zzH(zzau zzauVar, zzdlu[] zzdluVarArr) {
        zzdlu zzdluVar = zzdluVarArr[0];
        if (zzdluVar != null) {
            zzauVar.f11705e.zzb(zzgap.zzh(zzdluVar));
        }
    }

    private final boolean zzY() {
        Map map;
        zzbsv zzbsvVar = this.f11708h;
        return (zzbsvVar == null || (map = zzbsvVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    public static /* synthetic */ Uri zzd(zzau zzauVar, Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? O0(uri, "nas", str) : uri;
    }

    public static /* synthetic */ Uri zzn(zzau zzauVar, Uri uri, IObjectWrapper iObjectWrapper) {
        zzfat zzfatVar;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlT)).booleanValue() && (zzfatVar = zzauVar.f11704d) != null) {
                uri = zzfatVar.zza(uri, zzauVar.f11702b, (View) ObjectWrapper.t0(iObjectWrapper), null);
            } else {
                uri = zzauVar.f11703c.zza(uri, zzauVar.f11702b, (View) ObjectWrapper.t0(iObjectWrapper), null);
            }
        } catch (zzaud e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e8);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public static /* synthetic */ a zzx(zzau zzauVar, zzdlu[] zzdluVarArr, String str, zzdlu zzdluVar) {
        zzdluVarArr[0] = zzdluVar;
        Context context = zzauVar.f11702b;
        zzbsv zzbsvVar = zzauVar.f11708h;
        Map map = zzbsvVar.zzb;
        JSONObject zzd = zzbv.zzd(context, map, map, zzbsvVar.zza, null);
        JSONObject zzg = zzbv.zzg(zzauVar.f11702b, zzauVar.f11708h.zza);
        JSONObject zzf = zzbv.zzf(zzauVar.f11708h.zza);
        JSONObject zze2 = zzbv.zze(zzauVar.f11702b, zzauVar.f11708h.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbv.zzc(null, zzauVar.f11702b, zzauVar.f11710j, zzauVar.f11709i));
        }
        return zzdluVar.zzg(str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean E0(Uri uri) {
        return M0(uri, this.f11723w, this.f11724x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F0(Uri uri) {
        return M0(uri, this.f11725y, this.f11726z);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjK)).booleanValue()) {
            return ObjectWrapper.u0(null);
        }
        this.D.zzg((Context) ObjectWrapper.t0(iObjectWrapper), (c) ObjectWrapper.t0(iObjectWrapper2), str, (b) ObjectWrapper.t0(iObjectWrapper3));
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            this.E.zze();
        }
        if (((Boolean) zzbdr.zza.zze()).booleanValue()) {
            this.F.zzb();
        }
        return ObjectWrapper.u0(this.D.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzf(IObjectWrapper iObjectWrapper, final zzbxr zzbxrVar, zzbxk zzbxkVar) {
        final int i10;
        a zzh;
        a zzb;
        a aVar;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue()) {
            bundle.putLong(zzdpn.PUBLIC_API_CALL.zza(), zzbxrVar.zzd.zzz);
            bundle.putLong(zzdpn.DYNAMITE_ENTER.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        this.f11702b = context;
        zzffc zza = zzffb.zza(context, 22);
        zza.zzi();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzht)).booleanValue() && zzbxrVar.zzd.zzc.getBoolean("optimize_for_app_start", false) && Objects.equals(zzaa.zzc(zzbxrVar.zzd), "requester_type_8")) {
            i10 = zzbxrVar.zze == 2 ? 2 : 1;
        } else {
            i10 = 0;
        }
        if ("UNKNOWN".equals(zzbxrVar.zzb)) {
            List arrayList = new ArrayList();
            zzbbd zzbbdVar = zzbbm.zzhs;
            if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).split(","));
            }
            if (arrayList.contains(zzaa.zzc(zzbxrVar.zzd))) {
                aVar = zzgap.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                zzb = zzgap.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                zzgap.zzr(zzb, new zzaq(this, aVar, zzbxrVar, zzbxkVar, zza), this.f11701a.zzC());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkY)).booleanValue()) {
            zzgba zzgbaVar = zzbyp.zza;
            zzh = zzgbaVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzac G0;
                    G0 = r0.G0(zzau.this.f11702b, r1.zza, r1.zzb, r1.zzc, r1.zzd, i10, r1.zzf, bundle, zzbxrVar);
                    return G0;
                }
            });
            zzb = zzgap.zzn(zzh, new zzfzw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                @Override // com.google.android.gms.internal.ads.zzfzw
                public final a zza(Object obj) {
                    return ((zzac) obj).zzb();
                }
            }, zzgbaVar);
        } else {
            zzac G0 = G0(this.f11702b, zzbxrVar.zza, zzbxrVar.zzb, zzbxrVar.zzc, zzbxrVar.zzd, i10, zzbxrVar.zzf, bundle, zzbxrVar);
            zzh = zzgap.zzh(G0);
            zzb = G0.zzb();
        }
        aVar = zzh;
        zzgap.zzr(zzb, new zzaq(this, aVar, zzbxrVar, zzbxkVar, zza), this.f11701a.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzg(zzbsv zzbsvVar) {
        this.f11708h = zzbsvVar;
        this.f11705e.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbss zzbssVar) {
        K0(list, iObjectWrapper, zzbssVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbss zzbssVar) {
        L0(list, iObjectWrapper, zzbssVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjw)).booleanValue()) {
            zzbbd zzbbdVar = zzbbm.zzhr;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
                J0();
            }
            WebView webView = (WebView) ObjectWrapper.t0(iObjectWrapper);
            if (webView == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("The webView cannot be null.");
                return;
            }
            final zzj zzjVar = new zzj(webView, this.F, zzbyp.zzf);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.f11703c, this.f11711k, this.f11712l, this.f11704d, this.E, this.F, zzjVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjG)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzs();
            }
            if (((Boolean) zzbdr.zza.zze()).booleanValue()) {
                this.F.zzb();
                if (((Boolean) zzbdr.zzb.zze()).booleanValue()) {
                    zzbyp.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzj.this.zzb();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjH)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
                J0();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzk(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhA)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.t0(iObjectWrapper);
            zzbsv zzbsvVar = this.f11708h;
            this.f11709i = zzbv.zza(motionEvent, zzbsvVar == null ? null : zzbsvVar.zza);
            if (motionEvent.getAction() == 0) {
                this.f11710j = this.f11709i;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f11709i;
            obtain.setLocation(point.x, point.y);
            this.f11703c.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbss zzbssVar) {
        K0(list, iObjectWrapper, zzbssVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbss zzbssVar) {
        L0(list, iObjectWrapper, zzbssVar, false);
    }
}
