package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.k;
import androidx.work.p;
import androidx.work.z;
import e1.f;
import e1.h;
import e1.i;
import g1.b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l1.n;
import l1.q;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f4761d = p.f("ForceStopRunnable");

    /* renamed from: e  reason: collision with root package name */
    private static final long f4762e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a  reason: collision with root package name */
    private final Context f4763a;

    /* renamed from: b  reason: collision with root package name */
    private final i f4764b;

    /* renamed from: c  reason: collision with root package name */
    private int f4765c = 0;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f4766a = p.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            p.c().g(f4766a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.h(context);
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f4763a = context.getApplicationContext();
        this.f4764b = iVar;
    }

    static Intent d(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent e(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, d(context), i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void h(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent e8 = e(context, a.c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f4762e;
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, e8);
            } else {
                alarmManager.set(0, currentTimeMillis, e8);
            }
        }
    }

    public boolean b() {
        boolean i10 = Build.VERSION.SDK_INT >= 23 ? b.i(this.f4763a, this.f4764b) : false;
        WorkDatabase w10 = this.f4764b.w();
        q l10 = w10.l();
        n k10 = w10.k();
        w10.beginTransaction();
        try {
            List<l1.p> p10 = l10.p();
            boolean z10 = (p10 == null || p10.isEmpty()) ? false : true;
            if (z10) {
                for (l1.p pVar : p10) {
                    l10.b(z.a.ENQUEUED, pVar.f27432a);
                    l10.l(pVar.f27432a, -1L);
                }
            }
            k10.b();
            w10.setTransactionSuccessful();
            return z10 || i10;
        } finally {
            w10.endTransaction();
        }
    }

    public void c() {
        boolean b10 = b();
        if (i()) {
            p.c().a(f4761d, "Rescheduling Workers.", new Throwable[0]);
            this.f4764b.A();
            this.f4764b.t().c(false);
        } else if (f()) {
            p.c().a(f4761d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f4764b.A();
        } else if (b10) {
            p.c().a(f4761d, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f4764b.q(), this.f4764b.w(), this.f4764b.v());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean f() {
        try {
            PendingIntent e8 = e(this.f4763a, a.c() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (e8 != null) {
                    e8.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f4763a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i10 = 0; i10 < historicalProcessExitReasons.size(); i10++) {
                        if (historicalProcessExitReasons.get(i10).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (e8 == null) {
                h(this.f4763a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            p.c().h(f4761d, "Ignoring exception", e10);
            return true;
        }
    }

    public boolean g() {
        androidx.work.b q10 = this.f4764b.q();
        if (TextUtils.isEmpty(q10.c())) {
            p.c().a(f4761d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b10 = m1.f.b(this.f4763a, q10);
        p.c().a(f4761d, String.format("Is default app process = %s", Boolean.valueOf(b10)), new Throwable[0]);
        return b10;
    }

    boolean i() {
        return this.f4764b.t().a();
    }

    public void j(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (g()) {
                while (true) {
                    h.e(this.f4763a);
                    p.c().a(f4761d, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        c();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e8) {
                        i10 = this.f4765c + 1;
                        this.f4765c = i10;
                        if (i10 >= 3) {
                            p c10 = p.c();
                            String str = f4761d;
                            c10.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                            k d10 = this.f4764b.q().d();
                            if (d10 != null) {
                                p.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                                d10.a(illegalStateException);
                            } else {
                                throw illegalStateException;
                            }
                        } else {
                            p.c().a(f4761d, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e8);
                            j(this.f4765c * 300);
                        }
                    }
                    p.c().a(f4761d, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e8);
                    j(this.f4765c * 300);
                }
            }
        } finally {
            this.f4764b.z();
        }
    }
}
