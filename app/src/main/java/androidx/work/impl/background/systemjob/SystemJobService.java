package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.p;
import e1.b;
import e1.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: c  reason: collision with root package name */
    private static final String f4728c = p.f("SystemJobService");

    /* renamed from: a  reason: collision with root package name */
    private i f4729a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, JobParameters> f4730b = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // e1.b
    public void e(String str, boolean z10) {
        JobParameters remove;
        p.c().a(f4728c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f4730b) {
            remove = this.f4730b.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            i s10 = i.s(getApplicationContext());
            this.f4729a = s10;
            s10.u().c(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                p.c().h(f4728c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f4729a;
        if (iVar != null) {
            iVar.u().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f4729a == null) {
            p.c().a(f4728c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a10 = a(jobParameters);
        if (TextUtils.isEmpty(a10)) {
            p.c().b(f4728c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f4730b) {
            if (this.f4730b.containsKey(a10)) {
                p.c().a(f4728c, String.format("Job is already being executed by SystemJobService: %s", a10), new Throwable[0]);
                return false;
            }
            p.c().a(f4728c, String.format("onStartJob for %s", a10), new Throwable[0]);
            this.f4730b.put(a10, jobParameters);
            WorkerParameters.a aVar = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f4584b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.f4583a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i10 >= 28) {
                    aVar.f4585c = jobParameters.getNetwork();
                }
            }
            this.f4729a.D(a10, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f4729a == null) {
            p.c().a(f4728c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a10 = a(jobParameters);
        if (TextUtils.isEmpty(a10)) {
            p.c().b(f4728c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        p.c().a(f4728c, String.format("onStopJob for %s", a10), new Throwable[0]);
        synchronized (this.f4730b) {
            this.f4730b.remove(a10);
        }
        this.f4729a.F(a10);
        return !this.f4729a.u().f(a10);
    }
}
