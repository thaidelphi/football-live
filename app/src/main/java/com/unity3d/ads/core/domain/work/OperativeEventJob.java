package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.ServiceProvider;
import i8.g;
import i8.i;
import i8.k;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: OperativeEventJob.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class OperativeEventJob extends UniversalRequestJob {
    private final g getOperativeRequestPolicy$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        g a10;
        n.f(context, "context");
        n.f(workerParams, "workerParams");
        a10 = i.a(k.NONE, new OperativeEventJob$special$$inlined$inject$default$1(this, ServiceProvider.NAMED_OPERATIVE_REQ));
        this.getOperativeRequestPolicy$delegate = a10;
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy$delegate.getValue();
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    public Object doWork(d<? super ListenableWorker.a> dVar) {
        setRequestPolicy(getGetOperativeRequestPolicy().invoke());
        return super.doWork(dVar);
    }
}
