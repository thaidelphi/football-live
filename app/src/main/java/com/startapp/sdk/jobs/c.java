package com.startapp.sdk.jobs;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.startapp.sdk.jobs.JobRequest;
import com.startapp.t7;
import com.startapp.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements t7 {

    /* renamed from: a  reason: collision with root package name */
    public final JobScheduler f23343a;

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f23344b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23345c;

    public c(Context context, Class<? extends JobService> cls) throws IllegalStateException {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            this.f23343a = jobScheduler;
            this.f23344b = new ComponentName(context, cls);
            this.f23345c = y.a(context, "android.permission.RECEIVE_BOOT_COMPLETED");
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.startapp.t7
    public final boolean a(JobRequest jobRequest, long j10) {
        List<JobInfo> list;
        int i10;
        JobInfo.Builder builder = new JobInfo.Builder(JobRequest.a(jobRequest.f23328a), this.f23344b);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("extraKeyUuid", jobRequest.f23329b.toString());
        persistableBundle.putStringArray("extraKeyTags", jobRequest.f23328a);
        builder.setExtras(persistableBundle);
        JobRequest.Network network = jobRequest.f23330c;
        if (network != null) {
            if (network == JobRequest.Network.UNMETERED) {
                i10 = 2;
            } else {
                i10 = network == JobRequest.Network.ANY ? 1 : 0;
            }
            builder.setRequiredNetworkType(i10);
        }
        if (this.f23345c) {
            builder.setPersisted(true);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return a(builder.setPeriodic(j10, JobInfo.getMinFlexMillis()).build());
        }
        ArrayList arrayList = null;
        try {
            list = this.f23343a.getAllPendingJobs();
        } catch (Throwable unused) {
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (JobInfo jobInfo : list) {
                if (this.f23344b.equals(jobInfo.getService())) {
                    arrayList.add(jobInfo);
                }
            }
        }
        if (arrayList == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo2 = (JobInfo) it.next();
            if (jobInfo2.getId() == JobRequest.a(jobRequest.f23328a) && jobInfo2.getIntervalMillis() == j10) {
                return false;
            }
        }
        return a(builder.setPeriodic(j10).build());
    }

    public final boolean a(JobInfo jobInfo) {
        try {
            if (this.f23343a.schedule(jobInfo) == 1) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.startapp.t7
    public final boolean a(int i10) {
        List<JobInfo> list;
        ArrayList arrayList = null;
        try {
            list = this.f23343a.getAllPendingJobs();
        } catch (Throwable unused) {
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (JobInfo jobInfo : list) {
                if (this.f23344b.equals(jobInfo.getService())) {
                    arrayList.add(jobInfo);
                }
            }
        }
        if (arrayList == null) {
            return false;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((JobInfo) it.next()).getId() == i10) {
                    this.f23343a.cancel(i10);
                    return true;
                }
            }
        } catch (Throwable unused2) {
        }
        return false;
    }
}
