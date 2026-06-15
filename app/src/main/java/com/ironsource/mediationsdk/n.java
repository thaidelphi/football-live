package com.ironsource.mediationsdk;

import com.ironsource.dq;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sg;
import com.ironsource.t5;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n {

    /* renamed from: f  reason: collision with root package name */
    private static final n f18958f = new n();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f18959a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Boolean> f18960b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private int f18961c;

    /* renamed from: d  reason: collision with root package name */
    private int f18962d;

    /* renamed from: e  reason: collision with root package name */
    private int f18963e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSource.AD_UNIT f18964a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IronSourceError f18965b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f18966c;

        a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, String str) {
            this.f18964a = ad_unit;
            this.f18965b = ironSourceError;
            this.f18966c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            n.this.a(this.f18964a, this.f18965b);
            n.this.f18960b.put(this.f18966c, Boolean.FALSE);
        }
    }

    private n() {
    }

    private int a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f18962d;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f18961c;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f18963e;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return 0;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            nVar = f18958f;
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.f18959a.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            dq.a().a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            sg.a().a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            t5.a().a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    public void a(IronSource.AD_UNIT ad_unit, int i10) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f18962d = i10;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f18961c = i10;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f18963e = i10;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    public synchronized void b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        if (b(ad_unit)) {
            return;
        }
        String ad_unit2 = ad_unit.toString();
        if (!this.f18959a.containsKey(ad_unit2)) {
            a(ad_unit, ironSourceError);
            return;
        }
        long a10 = a(ad_unit) * 1000;
        long currentTimeMillis = System.currentTimeMillis() - this.f18959a.get(ad_unit2).longValue();
        if (currentTimeMillis > a10) {
            a(ad_unit, ironSourceError);
            return;
        }
        this.f18960b.put(ad_unit2, Boolean.TRUE);
        long j10 = a10 - currentTimeMillis;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("delaying callback by " + j10);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(ad_unit, ironSourceError, ad_unit2), j10);
    }

    public synchronized boolean b(IronSource.AD_UNIT ad_unit) {
        if (this.f18960b.containsKey(ad_unit.toString())) {
            return this.f18960b.get(ad_unit.toString()).booleanValue();
        }
        return false;
    }
}
