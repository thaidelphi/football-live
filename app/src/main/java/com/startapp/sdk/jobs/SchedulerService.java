package com.startapp.sdk.jobs;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.startapp.s1;
import com.startapp.sdk.jobs.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public ExecutorService f23338a;

    /* renamed from: b  reason: collision with root package name */
    public final a f23339b = new a();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends com.startapp.sdk.jobs.a {
        public a() {
        }

        @Override // com.startapp.sdk.jobs.a
        public final void a(com.startapp.sdk.jobs.b bVar) {
            ExecutorService executorService = SchedulerService.this.f23338a;
            if (executorService != null) {
                executorService.execute(bVar);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JobParameters f23341a;

        public b(JobParameters jobParameters) {
            this.f23341a = jobParameters;
        }

        @Override // com.startapp.sdk.jobs.b.a
        public final void a(boolean z10) {
            SchedulerService.this.jobFinished(this.f23341a, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f23338a = Executors.newSingleThreadExecutor(new s1("scheduler"));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.f23338a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Bundle bundle;
        if (this.f23338a == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras.containsKey("extraKeyDuplicate")) {
            return false;
        }
        PersistableBundle persistableBundle = extras.getPersistableBundle("extraKeyBundle");
        if (persistableBundle != null) {
            bundle = new Bundle();
            bundle.putAll(persistableBundle);
        } else {
            bundle = null;
        }
        return this.f23339b.a(this, extras.getStringArray("extraKeyTags"), new b(jobParameters), bundle);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
