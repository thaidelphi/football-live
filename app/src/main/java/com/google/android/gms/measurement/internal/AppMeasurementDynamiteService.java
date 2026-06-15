package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.1.1 */
@DynamiteApi
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcb {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    zzfy f12829a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Map f12830b = new androidx.collection.a();

    private final void Z(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        zzb();
        this.f12829a.I().E(zzcfVar, str);
    }

    private final void zzb() {
        if (this.f12829a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(String str, long j10) throws RemoteException {
        zzb();
        this.f12829a.t().g(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.f12829a.D().j(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j10) throws RemoteException {
        zzb();
        this.f12829a.D().D(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(String str, long j10) throws RemoteException {
        zzb();
        this.f12829a.t().h(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        long m02 = this.f12829a.I().m0();
        zzb();
        this.f12829a.I().D(zzcfVar, m02);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.f12829a.zzaz().u(new v1(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        Z(zzcfVar, this.f12829a.D().Q());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.f12829a.zzaz().u(new d4(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        Z(zzcfVar, this.f12829a.D().R());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        Z(zzcfVar, this.f12829a.D().S());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        String str;
        zzb();
        zzid D = this.f12829a.D();
        if (D.f13220a.J() != null) {
            str = D.f13220a.J();
        } else {
            try {
                str = zzij.b(D.f13220a.zzau(), "google_app_id", D.f13220a.M());
            } catch (IllegalStateException e8) {
                D.f13220a.zzay().m().b("getGoogleAppId failed with exception", e8);
                str = null;
            }
        }
        Z(zzcfVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.f12829a.D().L(str);
        zzb();
        this.f12829a.I().C(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i10) throws RemoteException {
        zzb();
        if (i10 == 0) {
            this.f12829a.I().E(zzcfVar, this.f12829a.D().T());
        } else if (i10 == 1) {
            this.f12829a.I().D(zzcfVar, this.f12829a.D().P().longValue());
        } else if (i10 != 2) {
            if (i10 == 3) {
                this.f12829a.I().C(zzcfVar, this.f12829a.D().O().intValue());
            } else if (i10 != 4) {
            } else {
                this.f12829a.I().y(zzcfVar, this.f12829a.D().M().booleanValue());
            }
        } else {
            zzlh I = this.f12829a.I();
            double doubleValue = this.f12829a.D().N().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, doubleValue);
            try {
                zzcfVar.zzd(bundle);
            } catch (RemoteException e8) {
                I.f13220a.zzay().r().b("Error returning double value to wrapper", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z10, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.f12829a.zzaz().u(new g3(this, zzcfVar, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcl zzclVar, long j10) throws RemoteException {
        zzfy zzfyVar = this.f12829a;
        if (zzfyVar == null) {
            this.f12829a = zzfy.C((Context) Preconditions.m((Context) ObjectWrapper.t0(iObjectWrapper)), zzclVar, Long.valueOf(j10));
        } else {
            zzfyVar.zzay().r().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        zzb();
        this.f12829a.zzaz().u(new e4(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        zzb();
        this.f12829a.D().n(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) throws RemoteException {
        Bundle bundle2;
        zzb();
        Preconditions.g(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f12829a.zzaz().u(new m2(this, zzcfVar, new zzaw(str2, new zzau(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        zzb();
        this.f12829a.zzay().A(i10, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.t0(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.t0(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.t0(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10) throws RemoteException {
        zzb();
        x1 x1Var = this.f12829a.D().f13613c;
        if (x1Var != null) {
            this.f12829a.D().k();
            x1Var.onActivityCreated((Activity) ObjectWrapper.t0(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        x1 x1Var = this.f12829a.D().f13613c;
        if (x1Var != null) {
            this.f12829a.D().k();
            x1Var.onActivityDestroyed((Activity) ObjectWrapper.t0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        x1 x1Var = this.f12829a.D().f13613c;
        if (x1Var != null) {
            this.f12829a.D().k();
            x1Var.onActivityPaused((Activity) ObjectWrapper.t0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        x1 x1Var = this.f12829a.D().f13613c;
        if (x1Var != null) {
            this.f12829a.D().k();
            x1Var.onActivityResumed((Activity) ObjectWrapper.t0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) throws RemoteException {
        zzb();
        x1 x1Var = this.f12829a.D().f13613c;
        Bundle bundle = new Bundle();
        if (x1Var != null) {
            this.f12829a.D().k();
            x1Var.onActivitySaveInstanceState((Activity) ObjectWrapper.t0(iObjectWrapper), bundle);
        }
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e8) {
            this.f12829a.zzay().r().b("Error returning bundle value to wrapper", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        if (this.f12829a.D().f13613c != null) {
            this.f12829a.D().k();
            Activity activity = (Activity) ObjectWrapper.t0(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        if (this.f12829a.D().f13613c != null) {
            this.f12829a.D().k();
            Activity activity = (Activity) ObjectWrapper.t0(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) throws RemoteException {
        zzb();
        zzcfVar.zzd(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzgz zzgzVar;
        zzb();
        synchronized (this.f12830b) {
            zzgzVar = (zzgz) this.f12830b.get(Integer.valueOf(zzciVar.zzd()));
            if (zzgzVar == null) {
                zzgzVar = new g4(this, zzciVar);
                this.f12830b.put(Integer.valueOf(zzciVar.zzd()), zzgzVar);
            }
        }
        this.f12829a.D().s(zzgzVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j10) throws RemoteException {
        zzb();
        this.f12829a.D().t(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.f12829a.zzay().m().a("Conditional user property must not be null");
        } else {
            this.f12829a.D().z(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(final Bundle bundle, final long j10) throws RemoteException {
        zzb();
        final zzid D = this.f12829a.D();
        D.f13220a.zzaz().v(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhc
            @Override // java.lang.Runnable
            public final void run() {
                zzid zzidVar = zzid.this;
                Bundle bundle2 = bundle;
                long j11 = j10;
                if (TextUtils.isEmpty(zzidVar.f13220a.w().o())) {
                    zzidVar.A(bundle2, 0, j11);
                } else {
                    zzidVar.f13220a.zzay().s().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        zzb();
        this.f12829a.D().A(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10) throws RemoteException {
        zzb();
        this.f12829a.F().y((Activity) ObjectWrapper.t0(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        zzb();
        zzid D = this.f12829a.D();
        D.d();
        D.f13220a.zzaz().u(new u1(D, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final zzid D = this.f12829a.D();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        D.f13220a.zzaz().u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhd
            @Override // java.lang.Runnable
            public final void run() {
                zzid.this.l(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzb();
        f4 f4Var = new f4(this, zzciVar);
        if (this.f12829a.zzaz().x()) {
            this.f12829a.D().C(f4Var);
        } else {
            this.f12829a.zzaz().u(new a4(this, f4Var));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzck zzckVar) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        zzb();
        this.f12829a.D().D(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j10) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j10) throws RemoteException {
        zzb();
        zzid D = this.f12829a.D();
        D.f13220a.zzaz().u(new d1(D, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(final String str, long j10) throws RemoteException {
        zzb();
        final zzid D = this.f12829a.D();
        if (str != null && TextUtils.isEmpty(str)) {
            D.f13220a.zzay().r().a("User ID must be non-empty or null");
            return;
        }
        D.f13220a.zzaz().u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhe
            @Override // java.lang.Runnable
            public final void run() {
                zzid zzidVar = zzid.this;
                if (zzidVar.f13220a.w().r(str)) {
                    zzidVar.f13220a.w().q();
                }
            }
        });
        D.G(null, "_id", str, true, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10) throws RemoteException {
        zzb();
        this.f12829a.D().G(str, str2, ObjectWrapper.t0(iObjectWrapper), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzgz zzgzVar;
        zzb();
        synchronized (this.f12830b) {
            zzgzVar = (zzgz) this.f12830b.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (zzgzVar == null) {
            zzgzVar = new g4(this, zzciVar);
        }
        this.f12829a.D().I(zzgzVar);
    }
}
