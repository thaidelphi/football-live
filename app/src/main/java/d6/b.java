package d6;

import android.content.Context;
import android.os.Bundle;
import c6.e;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b implements a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f24327c;
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final AppMeasurementSdk f24328a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final Map f24329b;

    b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.m(appMeasurementSdk);
        this.f24328a = appMeasurementSdk;
        this.f24329b = new ConcurrentHashMap();
    }

    @KeepForSdk
    public static a c(e eVar, Context context, n6.d dVar) {
        Preconditions.m(eVar);
        Preconditions.m(context);
        Preconditions.m(dVar);
        Preconditions.m(context.getApplicationContext());
        if (f24327c == null) {
            synchronized (b.class) {
                if (f24327c == null) {
                    Bundle bundle = new Bundle(1);
                    if (eVar.t()) {
                        dVar.b(c6.b.class, new Executor() { // from class: d6.c
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new n6.b() { // from class: d6.d
                            @Override // n6.b
                            public final void a(n6.a aVar) {
                                b.d(aVar);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", eVar.s());
                    }
                    f24327c = new b(zzee.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return f24327c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(n6.a aVar) {
        boolean z10 = ((c6.b) aVar.a()).f5541a;
        synchronized (b.class) {
            ((b) Preconditions.m(f24327c)).f24328a.u(z10);
        }
    }

    @Override // d6.a
    @KeepForSdk
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.d(str) && com.google.firebase.analytics.connector.internal.b.c(str2, bundle) && com.google.firebase.analytics.connector.internal.b.b(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.a(str, str2, bundle);
            this.f24328a.n(str, str2, bundle);
        }
    }

    @Override // d6.a
    @KeepForSdk
    public void b(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.d(str) && com.google.firebase.analytics.connector.internal.b.e(str, str2)) {
            this.f24328a.t(str, str2, obj);
        }
    }
}
