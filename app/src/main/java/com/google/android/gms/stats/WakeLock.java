package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class WakeLock {

    /* renamed from: r  reason: collision with root package name */
    private static final long f13790r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s  reason: collision with root package name */
    private static volatile ScheduledExecutorService f13791s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final Object f13792t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static volatile zzd f13793u = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Object f13794a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f13795b;

    /* renamed from: c  reason: collision with root package name */
    private int f13796c;

    /* renamed from: d  reason: collision with root package name */
    private Future<?> f13797d;

    /* renamed from: e  reason: collision with root package name */
    private long f13798e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<zze> f13799f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13800g;

    /* renamed from: h  reason: collision with root package name */
    private int f13801h;

    /* renamed from: i  reason: collision with root package name */
    zzb f13802i;

    /* renamed from: j  reason: collision with root package name */
    private Clock f13803j;

    /* renamed from: k  reason: collision with root package name */
    private WorkSource f13804k;

    /* renamed from: l  reason: collision with root package name */
    private final String f13805l;

    /* renamed from: m  reason: collision with root package name */
    private final String f13806m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f13807n;

    /* renamed from: o  reason: collision with root package name */
    private final Map<String, b> f13808o;

    /* renamed from: p  reason: collision with root package name */
    private AtomicInteger f13809p;

    /* renamed from: q  reason: collision with root package name */
    private final ScheduledExecutorService f13810q;

    @KeepForSdk
    public WakeLock(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f13794a = new Object();
        this.f13796c = 0;
        this.f13799f = new HashSet();
        this.f13800g = true;
        this.f13803j = DefaultClock.d();
        this.f13808o = new HashMap();
        this.f13809p = new AtomicInteger(0);
        Preconditions.n(context, "WakeLock: context must not be null");
        Preconditions.h(str, "WakeLock: wakeLockName must not be empty");
        this.f13807n = context.getApplicationContext();
        this.f13806m = str;
        this.f13802i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f13805l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f13805l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
            this.f13795b = newWakeLock;
            if (WorkSourceUtil.c(context)) {
                WorkSource b10 = WorkSourceUtil.b(context, Strings.a(packageName) ? context.getPackageName() : packageName);
                this.f13804k = b10;
                if (b10 != null) {
                    i(newWakeLock, b10);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f13791s;
            if (scheduledExecutorService == null) {
                synchronized (f13792t) {
                    scheduledExecutorService = f13791s;
                    if (scheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f13791s = scheduledExecutorService;
                    }
                }
            }
            this.f13810q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    public static /* synthetic */ void e(WakeLock wakeLock) {
        synchronized (wakeLock.f13794a) {
            if (wakeLock.b()) {
                Log.e("WakeLock", String.valueOf(wakeLock.f13805l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                wakeLock.g();
                if (wakeLock.b()) {
                    wakeLock.f13796c = 1;
                    wakeLock.h(0);
                }
            }
        }
    }

    private final String f(String str) {
        if (this.f13800g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f13799f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f13799f);
        this.f13799f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        zze zzeVar = (zze) arrayList.get(0);
        throw null;
    }

    private final void h(int i10) {
        synchronized (this.f13794a) {
            if (b()) {
                if (this.f13800g) {
                    int i11 = this.f13796c - 1;
                    this.f13796c = i11;
                    if (i11 > 0) {
                        return;
                    }
                } else {
                    this.f13796c = 0;
                }
                g();
                for (b bVar : this.f13808o.values()) {
                    bVar.f13811a = 0;
                }
                this.f13808o.clear();
                Future<?> future = this.f13797d;
                if (future != null) {
                    future.cancel(false);
                    this.f13797d = null;
                    this.f13798e = 0L;
                }
                this.f13801h = 0;
                if (this.f13795b.isHeld()) {
                    try {
                        this.f13795b.release();
                        if (this.f13802i != null) {
                            this.f13802i = null;
                        }
                    } catch (RuntimeException e8) {
                        if (e8.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f13805l).concat(" failed to release!"), e8);
                            if (this.f13802i != null) {
                                this.f13802i = null;
                            }
                        } else {
                            throw e8;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f13805l).concat(" should be held!"));
                }
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e8) {
            Log.wtf("WakeLock", e8.toString());
        }
    }

    @KeepForSdk
    public void a(long j10) {
        this.f13809p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f13790r), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f13794a) {
            if (!b()) {
                this.f13802i = zzb.zza(false, null);
                this.f13795b.acquire();
                this.f13803j.b();
            }
            this.f13796c++;
            this.f13801h++;
            f(null);
            b bVar = this.f13808o.get(null);
            if (bVar == null) {
                bVar = new b(null);
                this.f13808o.put(null, bVar);
            }
            bVar.f13811a++;
            long b10 = this.f13803j.b();
            long j11 = Long.MAX_VALUE - b10 > max ? b10 + max : Long.MAX_VALUE;
            if (j11 > this.f13798e) {
                this.f13798e = j11;
                Future<?> future = this.f13797d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f13797d = this.f13810q.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        WakeLock.e(WakeLock.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @KeepForSdk
    public boolean b() {
        boolean z10;
        synchronized (this.f13794a) {
            z10 = this.f13796c > 0;
        }
        return z10;
    }

    @KeepForSdk
    public void c() {
        if (this.f13809p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f13805l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f13794a) {
            f(null);
            if (this.f13808o.containsKey(null)) {
                b bVar = this.f13808o.get(null);
                if (bVar != null) {
                    int i10 = bVar.f13811a - 1;
                    bVar.f13811a = i10;
                    if (i10 == 0) {
                        this.f13808o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f13805l).concat(" counter does not exist"));
            }
            h(0);
        }
    }

    @KeepForSdk
    public void d(boolean z10) {
        synchronized (this.f13794a) {
            this.f13800g = z10;
        }
    }
}
