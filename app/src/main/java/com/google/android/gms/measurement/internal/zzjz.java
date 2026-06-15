package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzjz {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13671a;

    public zzjz(Context context) {
        Preconditions.m(context);
        this.f13671a = context;
    }

    private final zzeo k() {
        return zzfy.C(this.f13671a, null, null).zzay();
    }

    public final int a(final Intent intent, int i10, final int i11) {
        zzfy C = zzfy.C(this.f13671a, null, null);
        final zzeo zzay = C.zzay();
        if (intent == null) {
            zzay.r().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        C.zzaw();
        zzay.q().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjw
                @Override // java.lang.Runnable
                public final void run() {
                    zzjz.this.c(i11, zzay, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().m().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgq(zzkz.a0(this.f13671a), null);
        }
        k().r().b("onBind received unknown action", action);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(int i10, zzeo zzeoVar, Intent intent) {
        if (((zzjy) this.f13671a).zzc(i10)) {
            zzeoVar.q().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            k().q().a("Completed wakeful intent.");
            ((zzjy) this.f13671a).a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzeo zzeoVar, JobParameters jobParameters) {
        zzeoVar.q().a("AppMeasurementJobService processed last upload request.");
        ((zzjy) this.f13671a).b(jobParameters, false);
    }

    public final void e() {
        zzfy C = zzfy.C(this.f13671a, null, null);
        zzeo zzay = C.zzay();
        C.zzaw();
        zzay.q().a("Local AppMeasurementService is starting up");
    }

    public final void f() {
        zzfy C = zzfy.C(this.f13671a, null, null);
        zzeo zzay = C.zzay();
        C.zzaw();
        zzay.q().a("Local AppMeasurementService is shutting down");
    }

    public final void g(Intent intent) {
        if (intent == null) {
            k().m().a("onRebind called with null intent");
            return;
        }
        k().q().b("onRebind called. action", intent.getAction());
    }

    public final void h(Runnable runnable) {
        zzkz a02 = zzkz.a0(this.f13671a);
        a02.zzaz().u(new f3(this, a02, runnable));
    }

    @TargetApi(24)
    public final boolean i(final JobParameters jobParameters) {
        zzfy C = zzfy.C(this.f13671a, null, null);
        final zzeo zzay = C.zzay();
        String string = jobParameters.getExtras().getString("action");
        C.zzaw();
        zzay.q().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            h(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjv
                @Override // java.lang.Runnable
                public final void run() {
                    zzjz.this.d(zzay, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    public final boolean j(Intent intent) {
        if (intent == null) {
            k().m().a("onUnbind called with null intent");
            return true;
        }
        k().q().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
