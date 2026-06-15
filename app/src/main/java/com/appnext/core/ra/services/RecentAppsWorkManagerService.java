package com.appnext.core.ra.services;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import com.appnext.core.ra.a.c;
import com.appnext.core.ra.services.a;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RecentAppsWorkManagerService extends Worker {
    public RecentAppsWorkManagerService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static Bundle a(e eVar) {
        try {
            int h10 = eVar.h("action", -1);
            String j10 = eVar.j("more_data");
            Bundle bundle = new Bundle();
            bundle.putInt("action", h10);
            if (!TextUtils.isEmpty(j10)) {
                bundle.putString("more_data", j10);
            }
            return bundle;
        } catch (Throwable th) {
            com.appnext.base.a.a("RecentAppsWorkManagerService$createBundleFromData", th);
            return null;
        }
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        e inputData;
        try {
            inputData = getInputData();
        } catch (Throwable th) {
            com.appnext.base.a.a("RecentAppsWorkManagerService$doWork", th);
        }
        if (inputData == null) {
            return ListenableWorker.a.c();
        }
        Bundle a10 = a(inputData);
        int h10 = inputData.h("action", -1);
        if (h10 >= 0 && h10 < a.EnumC0158a.values().length) {
            c.a(getApplicationContext(), a.EnumC0158a.values()[h10], a10).at();
            return ListenableWorker.a.c();
        }
        return ListenableWorker.a.c();
    }
}
