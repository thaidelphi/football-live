package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class nc {

    /* renamed from: e  reason: collision with root package name */
    public static final int f19396e = -1;

    /* renamed from: a  reason: collision with root package name */
    private Runnable f19397a = new a();

    /* renamed from: b  reason: collision with root package name */
    private int f19398b;

    /* renamed from: c  reason: collision with root package name */
    private p f19399c;

    /* renamed from: d  reason: collision with root package name */
    private xl f19400d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            if (nc.this.f19399c != null) {
                nc.this.f19399c.a();
            }
        }
    }

    public nc(int i10, p pVar) {
        this.f19399c = pVar;
        this.f19398b = i10;
    }

    public void a() {
        if (!b() || this.f19400d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f19400d.e();
        this.f19400d = null;
    }

    public void a(long j10) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f19398b) - Math.max(j10, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f19399c.a();
                return;
            }
            a();
            this.f19400d = new xl(millis, this.f19397a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public boolean b() {
        return this.f19398b > 0;
    }
}
