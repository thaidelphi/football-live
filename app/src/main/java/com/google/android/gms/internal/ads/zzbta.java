package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.ironsource.b9;
import com.ironsource.fe;
import com.ironsource.ug;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbta implements zzbtc {
    public static zzbtc zza;
    static zzbtc zzb;
    static zzbtc zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected zzbta(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzfpd.zza()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zzn = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.zzg = r3
            r2.zzj = r4
            com.google.android.gms.internal.ads.zzbbd r4 = com.google.android.gms.internal.ads.zzbbm.zzhJ
            com.google.android.gms.internal.ads.zzbbk r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r0.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L61
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 == 0) goto L61
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L51
            goto L61
        L51:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.f(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            goto L62
        L61:
            r3 = r0
        L62:
            r2.zzk = r3
            com.google.android.gms.internal.ads.zzbbd r3 = com.google.android.gms.internal.ads.zzbbm.zzhH
            com.google.android.gms.internal.ads.zzbbk r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r4.zzb(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L83
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L84
        L83:
            r4 = r1
        L84:
            r2.zzl = r4
            com.google.android.gms.internal.ads.zzbbk r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb3
            android.content.Context r3 = r2.zzg
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 != 0) goto L9d
            goto Lb4
        L9d:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r3 = r3.f(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            if (r3 != 0) goto Lac
            goto Lb4
        Lac:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            goto Lb4
        Lb3:
            r0 = r1
        Lb4:
            r2.zzm = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbta.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public static zzbtc zza(Context context) {
        synchronized (zze) {
            if (zza == null) {
                if (zzl(context)) {
                    zza = new zzbta(context, VersionInfoParcel.forPackage());
                } else {
                    zza = new zzbtb();
                }
            }
        }
        return zza;
    }

    public static zzbtc zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzc == null) {
                boolean z10 = false;
                if (((Boolean) zzbde.zzc.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhC)).booleanValue() || ((Boolean) zzbde.zza.zze()).booleanValue()) {
                        z10 = true;
                    }
                }
                if (zzl(context)) {
                    zzbta zzbtaVar = new zzbta(context, versionInfoParcel);
                    zzbtaVar.zzk();
                    zzbtaVar.zzj();
                    zzc = zzbtaVar;
                } else if (!z10 || context == null) {
                    zzc = new zzbtb();
                } else {
                    zzbta zzbtaVar2 = new zzbta(context, versionInfoParcel, true);
                    zzbtaVar2.zzk();
                    zzbtaVar2.zzj();
                    zzc = zzbtaVar2;
                }
            }
        }
        return zzc;
    }

    public static zzbtc zzc(Context context) {
        synchronized (zze) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhD)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhC)).booleanValue()) {
                        zzb = new zzbta(context, VersionInfoParcel.forPackage());
                    }
                }
                zzb = new zzbtb();
            }
        }
        return zzb;
    }

    public static zzbtc zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhD)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhC)).booleanValue()) {
                        zzb = new zzbta(context, versionInfoParcel);
                    }
                }
                zzb = new zzbtb();
            }
        }
        return zzb;
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzftm.zzc(com.google.android.gms.ads.internal.util.client.zzf.zzh(zze(th)));
    }

    private final void zzj() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbsy(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbsz(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean zzl(Context context) {
        if (context != null) {
            synchronized (zze) {
                if (zzd == null) {
                    zzd = Boolean.valueOf(com.google.android.gms.ads.internal.client.zzbb.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmD)).intValue());
                }
            }
            if (zzd.booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhC)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzg(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z10 = false;
            boolean z11 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z10 |= com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName());
                    z11 |= zzbta.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z10 || z11) {
                return;
            }
            if (!this.zzo) {
                zzh(th, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbde.zzc.zze()).booleanValue()) {
                return;
            }
            zzbaw.zzc(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzi(Throwable th, String str, float f10) {
        Throwable th2;
        Throwable th3;
        String str2;
        PackageInfo f11;
        ActivityManager.MemoryInfo zzc2;
        if (this.zzo) {
            return;
        }
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        boolean z10 = false;
        if (((Boolean) zzbdv.zze.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                linkedList.push(th4);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th5 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th5.getStackTrace();
                boolean z11 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcs)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzp(th5.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z11 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        } else {
                            arrayList.add(stackTraceElement);
                        }
                    }
                }
                if (z11) {
                    if (th2 == null) {
                        th3 = new Throwable(th5.getMessage());
                    } else {
                        th3 = new Throwable(th5.getMessage(), th2);
                    }
                    th2 = th3;
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String zze2 = zze(th);
            String zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziL)).booleanValue() ? zzf(th) : "";
            double d10 = f10;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            double random = Math.random();
            int i11 = i10 > 0 ? (int) (1.0f / f10) : 1;
            if (random < d10) {
                ArrayList<String> arrayList2 = new ArrayList();
                try {
                    z10 = Wrappers.a(this.zzg).g();
                } catch (Throwable th6) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching instant app info", th6);
                }
                try {
                    str2 = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z10)).appendQueryParameter(ug.f21009x, "gmob-apps-report-exception").appendQueryParameter(fe.E, Build.VERSION.RELEASE);
                int i12 = Build.VERSION.SDK_INT;
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i12));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = str3 + " " + str4;
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter(b9.h.G, str4).appendQueryParameter("js", this.zzj.afmaVersion).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbd.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "726272644").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i11)).appendQueryParameter("pb_tm", String.valueOf(zzbdv.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.h().b(this.zzg))).appendQueryParameter("lite", true != this.zzj.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(zzf)) {
                    appendQueryParameter3.appendQueryParameter("hash", zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhI)).booleanValue() && (zzc2 = com.google.android.gms.ads.internal.util.client.zzf.zzc(this.zzg)) != null) {
                    appendQueryParameter3.appendQueryParameter("available_memory", Long.toString(zzc2.availMem));
                    appendQueryParameter3.appendQueryParameter("total_memory", Long.toString(zzc2.totalMem));
                    appendQueryParameter3.appendQueryParameter("is_low_memory", true == zzc2.lowMemory ? "1" : "0");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhH)).booleanValue()) {
                    if (!TextUtils.isEmpty(this.zzl)) {
                        appendQueryParameter3.appendQueryParameter("countrycode", this.zzl);
                    }
                    if (!TextUtils.isEmpty(this.zzm)) {
                        appendQueryParameter3.appendQueryParameter("psv", this.zzm);
                    }
                    Context context = this.zzg;
                    if (i12 >= 26) {
                        f11 = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context != null) {
                            try {
                                f11 = Wrappers.a(context).f("com.android.webview", 128);
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        f11 = null;
                    }
                    if (f11 != null) {
                        appendQueryParameter3.appendQueryParameter("wvvc", Integer.toString(f11.versionCode));
                        appendQueryParameter3.appendQueryParameter("wvvn", f11.versionName);
                        appendQueryParameter3.appendQueryParameter("wvpn", f11.packageName);
                    }
                }
                PackageInfo packageInfo = this.zzk;
                if (packageInfo != null) {
                    appendQueryParameter3.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter3.appendQueryParameter("appvn", this.zzk.versionName);
                }
                arrayList2.add(appendQueryParameter3.toString());
                for (final String str5 : arrayList2) {
                    final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsx
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.gms.ads.internal.util.client.zzu.this.zza(str5);
                        }
                    });
                }
            }
        }
    }

    protected zzbta(Context context, VersionInfoParcel versionInfoParcel, boolean z10) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
