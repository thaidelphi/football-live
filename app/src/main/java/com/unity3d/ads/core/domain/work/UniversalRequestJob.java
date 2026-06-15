package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import i8.g;
import i8.i;
import i8.k;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: UniversalRequestJob.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {
    public RequestPolicy requestPolicy;
    private final g universalRequestDataSource$delegate;
    private final g universalRequestEventSender$delegate;
    private final WorkerParameters workerParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        g a10;
        g a11;
        n.f(context, "context");
        n.f(workerParams, "workerParams");
        this.workerParams = workerParams;
        k kVar = k.NONE;
        a10 = i.a(kVar, new UniversalRequestJob$special$$inlined$inject$default$1(this, ""));
        this.universalRequestEventSender$delegate = a10;
        a11 = i.a(kVar, new UniversalRequestJob$special$$inlined$inject$default$2(this, ""));
        this.universalRequestDataSource$delegate = a11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|20|21|(4:23|(1:25)|13|14)(2:26|27)))(1:29))(2:34|(2:36|37)(2:38|(1:40)(1:41)))|30|31|(1:33)|20|21|(0)(0)))|44|6|7|(0)(0)|30|31|(0)|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
        r4 = i8.o.f26626b;
        r9 = i8.o.b(i8.p.a(r9));
        r2 = r2;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob r8, m8.d<? super androidx.work.ListenableWorker.a> r9) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.UniversalRequestJob.doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob, m8.d):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(d<? super ListenableWorker.a> dVar) {
        return doWork$suspendImpl(this, dVar);
    }

    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy = this.requestPolicy;
        if (requestPolicy != null) {
            return requestPolicy;
        }
        n.u("requestPolicy");
        return null;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource) this.universalRequestDataSource$delegate.getValue();
    }

    public final UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    public final void setRequestPolicy(RequestPolicy requestPolicy) {
        n.f(requestPolicy, "<set-?>");
        this.requestPolicy = requestPolicy;
    }
}
