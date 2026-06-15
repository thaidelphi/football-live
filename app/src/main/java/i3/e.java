package i3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
/* compiled from: JobInfoScheduler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e implements y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26445a;

    /* renamed from: b  reason: collision with root package name */
    private final j3.d f26446b;

    /* renamed from: c  reason: collision with root package name */
    private final g f26447c;

    public e(Context context, j3.d dVar, g gVar) {
        this.f26445a = context;
        this.f26446b = dVar;
        this.f26447c = gVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // i3.y
    public void a(b3.o oVar, int i10) {
        b(oVar, i10, false);
    }

    @Override // i3.y
    public void b(b3.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f26445a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f26445a.getSystemService("jobscheduler");
        int c10 = c(oVar);
        if (!z10 && d(jobScheduler, c10, i10)) {
            f3.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long g02 = this.f26446b.g0(oVar);
        JobInfo.Builder c11 = this.f26447c.c(new JobInfo.Builder(c10, componentName), oVar.d(), g02, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, m3.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        c11.setExtras(persistableBundle);
        f3.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c10), Long.valueOf(this.f26447c.g(oVar.d(), g02, i10)), Long.valueOf(g02), Integer.valueOf(i10));
        jobScheduler.schedule(c11.build());
    }

    int c(b3.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f26445a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(m3.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
