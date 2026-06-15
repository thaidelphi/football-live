package com.appnext.core.crashes;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.c;
import androidx.work.e;
import androidx.work.h;
import androidx.work.q;
import androidx.work.r;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CrashesReportWorkManagerService extends Worker {
    public CrashesReportWorkManagerService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static void a(Context context, String str, String str2) {
        try {
            e a10 = new e.a().f("methodName", str).f("exception", str2).a();
            c.a aVar = new c.a();
            aVar.b(q.CONNECTED);
            c a11 = aVar.a();
            String simpleName = CrashesReportWorkManagerService.class.getSimpleName();
            a0.j(context).h(simpleName, h.APPEND, new r.a(CrashesReportWorkManagerService.class).g(a10).g(a10).a(simpleName).e(a11).b());
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        e inputData;
        try {
            inputData = getInputData();
        } catch (Throwable th) {
            th.getMessage();
        }
        if (inputData == null) {
            return ListenableWorker.a.c();
        }
        new a(getApplicationContext(), inputData.j("methodName"), inputData.j("exception")).ah();
        return ListenableWorker.a.c();
    }
}
