package com.ironsource.environment.workerthread;

import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class WorkerManager<T> {

    /* renamed from: a  reason: collision with root package name */
    List<Callable<T>> f17284a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f17285b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j10);

        void onWorkFailed(String str);
    }

    public WorkerManager(ExecutorService executorService) {
        this.f17285b = executorService;
    }

    public void addCallable(Callable<T> callable) {
        this.f17284a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j10, TimeUnit timeUnit) {
        WorkerResult.Canceled canceled;
        if (this.f17285b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
        } else if (this.f17284a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            try {
                List<Future<T>> invokeAll = this.f17285b.invokeAll(this.f17284a, j10, timeUnit);
                for (int i10 = 0; i10 < invokeAll.size(); i10++) {
                    Future<T> future = invokeAll.get(i10);
                    if (!future.isDone() || future.isCancelled()) {
                        canceled = new WorkerResult.Canceled(this.f17284a.get(i10));
                    } else {
                        try {
                            arrayList.add(new WorkerResult.Completed(future.get()));
                        } catch (InterruptedException e8) {
                            e = e8;
                            o9.d().a(e);
                            arrayList.add(new WorkerResult.Failed(this.f17284a.get(i10), e));
                        } catch (CancellationException e10) {
                            o9.d().a(e10);
                            canceled = new WorkerResult.Canceled(this.f17284a.get(i10));
                        } catch (ExecutionException e11) {
                            e = e11;
                            o9.d().a(e);
                            arrayList.add(new WorkerResult.Failed(this.f17284a.get(i10), e));
                        }
                    }
                    arrayList.add(canceled);
                }
                workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - currentTimeMillis);
                this.f17285b.shutdownNow();
            } catch (Exception e12) {
                o9.d().a(e12);
                IronLog.INTERNAL.error(e12.toString());
                workEndedListener.onWorkFailed("failed to invoke callables, error= " + e12.getMessage());
                this.f17285b.shutdownNow();
            }
        }
    }
}
