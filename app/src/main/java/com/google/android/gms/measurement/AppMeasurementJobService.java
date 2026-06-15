package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzjz;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
@TargetApi(24)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AppMeasurementJobService extends JobService implements zzjy {

    /* renamed from: a  reason: collision with root package name */
    private zzjz f12822a;

    private final zzjz c() {
        if (this.f12822a == null) {
            this.f12822a = new zzjz(this);
        }
        return this.f12822a;
    }

    @Override // com.google.android.gms.measurement.internal.zzjy
    public final void a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzjy
    @TargetApi(24)
    public final void b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        c().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        c().g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        c().i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c().j(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzjy
    public final boolean zzc(int i10) {
        throw new UnsupportedOperationException();
    }
}
