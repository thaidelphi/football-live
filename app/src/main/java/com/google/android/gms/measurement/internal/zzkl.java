package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzkl extends r3 {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f13677d;

    /* renamed from: e  reason: collision with root package name */
    private h f13678e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f13679f;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzkl(zzkz zzkzVar) {
        super(zzkzVar);
        this.f13677d = (AlarmManager) this.f13220a.zzau().getSystemService("alarm");
    }

    private final int j() {
        if (this.f13679f == null) {
            this.f13679f = Integer.valueOf("measurement".concat(String.valueOf(this.f13220a.zzau().getPackageName())).hashCode());
        }
        return this.f13679f.intValue();
    }

    private final PendingIntent k() {
        Context zzau = this.f13220a.zzau();
        return PendingIntent.getBroadcast(zzau, 0, new Intent().setClassName(zzau, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    private final h l() {
        if (this.f13678e == null) {
            this.f13678e = new p3(this, this.f13125b.X());
        }
        return this.f13678e;
    }

    @TargetApi(24)
    private final void m() {
        JobScheduler jobScheduler = (JobScheduler) this.f13220a.zzau().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(j());
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    protected final boolean g() {
        AlarmManager alarmManager = this.f13677d;
        if (alarmManager != null) {
            alarmManager.cancel(k());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            m();
            return false;
        }
        return false;
    }

    public final void h() {
        d();
        this.f13220a.zzay().q().a("Unscheduling upload");
        AlarmManager alarmManager = this.f13677d;
        if (alarmManager != null) {
            alarmManager.cancel(k());
        }
        l().b();
        if (Build.VERSION.SDK_INT >= 24) {
            m();
        }
    }

    public final void i(long j10) {
        d();
        this.f13220a.zzaw();
        Context zzau = this.f13220a.zzau();
        if (!zzlh.T(zzau)) {
            this.f13220a.zzay().l().a("Receiver not registered/enabled");
        }
        if (!zzlh.U(zzau, false)) {
            this.f13220a.zzay().l().a("Service not registered/enabled");
        }
        h();
        this.f13220a.zzay().q().b("Scheduling upload, millis", Long.valueOf(j10));
        long b10 = this.f13220a.zzav().b() + j10;
        this.f13220a.u();
        if (j10 < Math.max(0L, ((Long) zzeb.f13452y.a(null)).longValue()) && !l().e()) {
            l().d(j10);
        }
        this.f13220a.zzaw();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f13677d;
            if (alarmManager != null) {
                this.f13220a.u();
                alarmManager.setInexactRepeating(2, b10, Math.max(((Long) zzeb.f13442t.a(null)).longValue(), j10), k());
                return;
            }
            return;
        }
        Context zzau2 = this.f13220a.zzau();
        ComponentName componentName = new ComponentName(zzau2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int j11 = j();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzbt.zza(zzau2, new JobInfo.Builder(j11, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
