package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzjz;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AppMeasurementService extends Service implements zzjy {

    /* renamed from: a  reason: collision with root package name */
    private zzjz f12824a;

    private final zzjz c() {
        if (this.f12824a == null) {
            this.f12824a = new zzjz(this);
        }
        return this.f12824a;
    }

    @Override // com.google.android.gms.measurement.internal.zzjy
    public final void a(Intent intent) {
        i0.a.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzjy
    public final void b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return c().b(intent);
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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        c().a(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c().j(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzjy
    public final boolean zzc(int i10) {
        return stopSelfResult(i10);
    }
}
