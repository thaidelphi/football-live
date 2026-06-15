package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.a0;
import androidx.work.c;
import androidx.work.q;
import androidx.work.r;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.n;
/* compiled from: BackgroundWorker.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class BackgroundWorker {
    private final a0 workManager;

    public BackgroundWorker(Context applicationContext) {
        n.f(applicationContext, "applicationContext");
        a0 j10 = a0.j(applicationContext);
        n.e(j10, "getInstance(applicationContext)");
        this.workManager = j10;
    }

    public final a0 getWorkManager() {
        return this.workManager;
    }

    public final /* synthetic */ <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        n.f(universalRequestWorkerData, "universalRequestWorkerData");
        c a10 = new c.a().b(q.CONNECTED).a();
        n.e(a10, "Builder()\n            .s…TED)\n            .build()");
        n.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        r b10 = new r.a(ListenableWorker.class).e(a10).g(universalRequestWorkerData.invoke()).b();
        n.e(b10, "OneTimeWorkRequestBuilde…a())\n            .build()");
        getWorkManager().e(b10);
    }
}
