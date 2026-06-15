package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbyp {
    public static final zzgba zza;
    public static final zzgba zzb;
    public static final zzgba zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgbb zze;
    public static final zzgba zzf;
    public static final zzgba zzg;

    static {
        Executor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3;
        if (ClientLibraryUtils.a()) {
            zzfpd.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzbyl("Default")));
        } else {
            zzbbd zzbbdVar = zzbbm.zzli;
            if (com.google.android.gms.ads.internal.client.zzbd.zzc().zzc(zzbbdVar) != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzc(zzbbdVar)).booleanValue()) {
                zzbbd zzbbdVar2 = zzbbm.zzlj;
                if (com.google.android.gms.ads.internal.client.zzbd.zzc().zzc(zzbbdVar2) != null) {
                    zzbbd zzbbdVar3 = zzbbm.zzlk;
                    if (com.google.android.gms.ads.internal.client.zzbd.zzc().zzc(zzbbdVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzc(zzbbdVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzc(zzbbdVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbyl("Default"));
                        threadPoolExecutor4.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzc(zzbbdVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor4;
                    }
                }
            }
            threadPoolExecutor = new ThreadPoolExecutor(2, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbyl("Default"));
        }
        zza = new zzbyn(threadPoolExecutor, null);
        if (ClientLibraryUtils.a()) {
            threadPoolExecutor2 = zzfpd.zza().zzc(5, new zzbyl("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbyl("Loader"));
            threadPoolExecutor5.allowCoreThreadTimeOut(true);
            threadPoolExecutor2 = threadPoolExecutor5;
        }
        zzb = new zzbyn(threadPoolExecutor2, null);
        if (ClientLibraryUtils.a()) {
            threadPoolExecutor3 = zzfpd.zza().zzb(new zzbyl("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor6 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbyl("Activeview"));
            threadPoolExecutor6.allowCoreThreadTimeOut(true);
            threadPoolExecutor3 = threadPoolExecutor6;
        }
        zzc = new zzbyn(threadPoolExecutor3, null);
        zzbyk zzbykVar = new zzbyk(3, new zzbyl("Schedule"));
        zzd = zzbykVar;
        zze = zzgbh.zzb(zzbykVar);
        zzf = new zzbyn(new zzbym(), null);
        zzg = new zzbyn(zzgbh.zzc(), null);
    }
}
