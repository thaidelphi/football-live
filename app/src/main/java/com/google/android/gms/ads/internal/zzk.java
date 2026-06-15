package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzatu;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzatz;
import com.google.android.gms.internal.ads.zzaub;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfnk;
import com.google.android.gms.internal.ads.zzgap;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzk implements Runnable, zzatx {

    /* renamed from: d  reason: collision with root package name */
    protected boolean f11534d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11535e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f11536f;

    /* renamed from: g  reason: collision with root package name */
    private final Executor f11537g;

    /* renamed from: h  reason: collision with root package name */
    private final zzflq f11538h;

    /* renamed from: i  reason: collision with root package name */
    private Context f11539i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f11540j;

    /* renamed from: k  reason: collision with root package name */
    private VersionInfoParcel f11541k;

    /* renamed from: l  reason: collision with root package name */
    private final VersionInfoParcel f11542l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f11543m;

    /* renamed from: o  reason: collision with root package name */
    private int f11545o;

    /* renamed from: a  reason: collision with root package name */
    private final List f11531a = new Vector();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f11532b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference f11533c = new AtomicReference();

    /* renamed from: n  reason: collision with root package name */
    final CountDownLatch f11544n = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.f11539i = context;
        this.f11540j = context;
        this.f11541k = versionInfoParcel;
        this.f11542l = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f11537g = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzbd.zzc().zzb(zzbbm.zzcy)).booleanValue();
        this.f11543m = booleanValue;
        this.f11538h = zzflq.zza(context, newCachedThreadPool, booleanValue);
        this.f11535e = ((Boolean) zzbd.zzc().zzb(zzbbm.zzcv)).booleanValue();
        this.f11536f = ((Boolean) zzbd.zzc().zzb(zzbbm.zzcz)).booleanValue();
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzcx)).booleanValue()) {
            this.f11545o = 2;
        } else {
            this.f11545o = 1;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbbm.zzdB)).booleanValue()) {
            this.f11534d = b();
        }
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzdv)).booleanValue()) {
            zzbyp.zza.execute(this);
            return;
        }
        zzbb.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            zzbyp.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzatx d() {
        return c() == 2 ? (zzatx) this.f11533c.get() : (zzatx) this.f11532b.get();
    }

    private final void e() {
        List list = this.f11531a;
        zzatx d10 = d();
        if (list.isEmpty() || d10 == null) {
            return;
        }
        for (Object[] objArr : this.f11531a) {
            int length = objArr.length;
            if (length == 1) {
                d10.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                d10.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f11531a.clear();
    }

    private final void f(boolean z10) {
        String str = this.f11541k.afmaVersion;
        Context g10 = g(this.f11539i);
        zzaqh zza = zzaqj.zza();
        zza.zza(z10);
        zza.zzb(str);
        int i10 = zzaub.zzw;
        this.f11532b.set(zzaub.zzt(g10, new zzatz((zzaqj) zza.zzbr())));
    }

    private static final Context g(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final zzatu h(Context context, VersionInfoParcel versionInfoParcel, boolean z10, boolean z11) {
        zzaqh zza = zzaqj.zza();
        zza.zza(z10);
        zza.zzb(versionInfoParcel.afmaVersion);
        return zzatu.zza(g(context), (zzaqj) zza.zzbr(), z11);
    }

    public static /* synthetic */ void zzc(zzk zzkVar, boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            h(zzkVar.f11540j, zzkVar.f11542l, z10, zzkVar.f11543m).zzp();
        } catch (NullPointerException e8) {
            zzkVar.f11538h.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e8);
        }
    }

    protected final boolean b() {
        Context context = this.f11539i;
        zzj zzjVar = new zzj(this);
        zzflq zzflqVar = this.f11538h;
        return new zzfnk(this.f11539i, zzfmq.zzb(context, zzflqVar), zzjVar, ((Boolean) zzbd.zzc().zzb(zzbbm.zzcw)).booleanValue()).zzd(1);
    }

    protected final int c() {
        if (!this.f11535e || this.f11534d) {
            return this.f11545o;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.ads.internal.util.client.VersionInfoParcel, android.content.Context] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzdB)).booleanValue()) {
                this.f11534d = b();
            }
            boolean z10 = this.f11541k.isClientJar;
            final boolean z11 = false;
            if (!((Boolean) zzbd.zzc().zzb(zzbbm.zzbf)).booleanValue() && z10) {
                z11 = true;
            }
            if (c() == 1) {
                f(z11);
                if (this.f11545o == 2) {
                    this.f11537g.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzk.zzc(zzk.this, z11);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzatu h10 = h(this.f11539i, this.f11541k, z11, this.f11543m);
                    this.f11533c.set(h10);
                    if (this.f11536f && !h10.zzr()) {
                        this.f11545o = 1;
                        f(z11);
                    }
                } catch (NullPointerException e8) {
                    this.f11545o = 1;
                    f(z11);
                    this.f11538h.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e8);
                }
            }
        } finally {
            this.f11544n.countDown();
            this.f11539i = null;
            this.f11541k = null;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        zzatx d10;
        if (!zzj() || (d10 = d()) == null) {
            return "";
        }
        e();
        return d10.zzf(g(context));
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final String zze(Context context, String str, View view, Activity activity) {
        if (zzj()) {
            zzatx d10 = d();
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkC)).booleanValue()) {
                zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzK(view, 4, null);
            }
            if (d10 != null) {
                e();
                return d10.zze(g(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final String zzf(Context context) {
        return zzb(context, null);
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final String zzg(final Context context) {
        try {
            return (String) zzgap.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.zzh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzk.this.zzb(context, null);
                }
            }, this.f11537g).get(((Integer) zzbd.zzc().zzb(zzbbm.zzcP)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzatq.zza(context, this.f11542l.afmaVersion, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final String zzh(Context context, View view, Activity activity) {
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkB)).booleanValue()) {
            if (zzj()) {
                zzatx d10 = d();
                if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkC)).booleanValue()) {
                    zzv.zzq();
                    com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
                }
                return d10 != null ? d10.zzh(context, view, activity) : "";
            }
            return "";
        }
        zzatx d11 = d();
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkC)).booleanValue()) {
            zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
        }
        return d11 != null ? d11.zzh(context, view, activity) : "";
    }

    public final boolean zzj() {
        try {
            this.f11544n.await();
            return true;
        } catch (InterruptedException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Interrupted during GADSignals creation.", e8);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzk(MotionEvent motionEvent) {
        zzatx d10 = d();
        if (d10 != null) {
            e();
            d10.zzk(motionEvent);
            return;
        }
        this.f11531a.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzl(int i10, int i11, int i12) {
        zzatx d10 = d();
        if (d10 == null) {
            this.f11531a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
            return;
        }
        e();
        d10.zzl(i10, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzatx d10;
        zzatx d11;
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzcV)).booleanValue()) {
            if (this.f11544n.getCount() != 0 || (d11 = d()) == null) {
                return;
            }
            d11.zzn(stackTraceElementArr);
        } else if (!zzj() || (d10 = d()) == null) {
        } else {
            d10.zzn(stackTraceElementArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzo(View view) {
        zzatx d10 = d();
        if (d10 != null) {
            d10.zzo(view);
        }
    }

    public final int zzp() {
        return this.f11545o;
    }
}
