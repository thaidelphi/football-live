package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class z7 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements WorkerManager.WorkEndedListener<a8> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21631a;

        a(b bVar) {
            this.f21631a = bVar;
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<a8>> list, long j10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<a8> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((a8) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((w7) ((WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    w7 w7Var = (w7) failed.callable;
                    arrayList2.add(new a8(w7Var.d(), w7Var.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            z7.this.a(arrayList2, arrayList, j10);
            this.f21631a.a(arrayList2, j10, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String str2 = "failed to collect bidding data, error= " + str;
            IronLog.INTERNAL.verbose(str2);
            this.f21631a.onFailure(str2);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface b {
        void a(List<a8> list, long j10, List<String> list2);

        void onFailure(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<a8> list, List<String> list2, long j10) {
        IronLog ironLog;
        StringBuilder sb;
        String b10;
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j10 + " millis");
        for (a8 a8Var : list) {
            if (a8Var.a() != null) {
                ironLog = IronLog.INTERNAL;
                sb = new StringBuilder();
                sb.append(a8Var.c());
                sb.append(" - success (");
                sb.append(a8Var.e());
                b10 = " millis)";
            } else {
                ironLog = IronLog.INTERNAL;
                sb = new StringBuilder();
                sb.append(a8Var.c());
                sb.append(" - failed (");
                sb.append(a8Var.e());
                sb.append(" millis) error: ");
                b10 = a8Var.b();
            }
            sb.append(b10);
            ironLog.verbose(sb.toString());
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            IronLog ironLog3 = IronLog.INTERNAL;
            ironLog3.verbose(it.next() + " reached timeout");
        }
    }

    public void a(List<w7> list, b bVar, long j10, TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            for (w7 w7Var : list) {
                workerManager.addCallable(w7Var);
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j10 + " millis");
            workerManager.startWork(new a(bVar), j10, timeUnit);
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "Exception - failed to collect bidding data, error= " + th.getMessage();
            IronLog.INTERNAL.error(str);
            bVar.onFailure(str);
        }
    }
}
