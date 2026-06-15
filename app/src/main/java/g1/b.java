package g1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.p;
import androidx.work.t;
import androidx.work.z;
import e1.e;
import e1.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l1.g;
import l1.q;
import m1.c;
/* compiled from: SystemJobScheduler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements e {

    /* renamed from: e  reason: collision with root package name */
    private static final String f25700e = p.f("SystemJobScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f25701a;

    /* renamed from: b  reason: collision with root package name */
    private final JobScheduler f25702b;

    /* renamed from: c  reason: collision with root package name */
    private final i f25703c;

    /* renamed from: d  reason: collision with root package name */
    private final a f25704d;

    public b(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void b(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g10 = g(context, jobScheduler)) == null || g10.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : g10) {
            e(jobScheduler, jobInfo.getId());
        }
    }

    private static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            p.c().b(f25700e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            p.c().b(f25700e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return extras.getString("EXTRA_WORK_SPEC_ID");
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> c10 = iVar.w().i().c();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                String h10 = h(jobInfo);
                if (!TextUtils.isEmpty(h10)) {
                    hashSet.add(h10);
                } else {
                    e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = c10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    p.c().a(f25700e, "Reconciling jobs", new Throwable[0]);
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            WorkDatabase w10 = iVar.w();
            w10.beginTransaction();
            try {
                q l10 = w10.l();
                for (String str : c10) {
                    l10.l(str, -1L);
                }
                w10.setTransactionSuccessful();
            } finally {
                w10.endTransaction();
            }
        }
        return z10;
    }

    @Override // e1.e
    public void a(l1.p... pVarArr) {
        int d10;
        List<Integer> f10;
        int d11;
        WorkDatabase w10 = this.f25703c.w();
        c cVar = new c(w10);
        for (l1.p pVar : pVarArr) {
            w10.beginTransaction();
            try {
                l1.p g10 = w10.l().g(pVar.f27432a);
                if (g10 == null) {
                    p.c().h(f25700e, "Skipping scheduling " + pVar.f27432a + " because it's no longer in the DB", new Throwable[0]);
                    w10.setTransactionSuccessful();
                } else if (g10.f27433b != z.a.ENQUEUED) {
                    p.c().h(f25700e, "Skipping scheduling " + pVar.f27432a + " because it is no longer enqueued", new Throwable[0]);
                    w10.setTransactionSuccessful();
                } else {
                    g a10 = w10.i().a(pVar.f27432a);
                    if (a10 != null) {
                        d10 = a10.f27410b;
                    } else {
                        d10 = cVar.d(this.f25703c.q().i(), this.f25703c.q().g());
                    }
                    if (a10 == null) {
                        this.f25703c.w().i().b(new g(pVar.f27432a, d10));
                    }
                    j(pVar, d10);
                    if (Build.VERSION.SDK_INT == 23 && (f10 = f(this.f25701a, this.f25702b, pVar.f27432a)) != null) {
                        int indexOf = f10.indexOf(Integer.valueOf(d10));
                        if (indexOf >= 0) {
                            f10.remove(indexOf);
                        }
                        if (!f10.isEmpty()) {
                            d11 = f10.get(0).intValue();
                        } else {
                            d11 = cVar.d(this.f25703c.q().i(), this.f25703c.q().g());
                        }
                        j(pVar, d11);
                    }
                    w10.setTransactionSuccessful();
                }
                w10.endTransaction();
            } catch (Throwable th) {
                w10.endTransaction();
                throw th;
            }
        }
    }

    @Override // e1.e
    public void c(String str) {
        List<Integer> f10 = f(this.f25701a, this.f25702b, str);
        if (f10 == null || f10.isEmpty()) {
            return;
        }
        for (Integer num : f10) {
            e(this.f25702b, num.intValue());
        }
        this.f25703c.w().i().d(str);
    }

    @Override // e1.e
    public boolean d() {
        return true;
    }

    public void j(l1.p pVar, int i10) {
        JobInfo a10 = this.f25704d.a(pVar, i10);
        p c10 = p.c();
        String str = f25700e;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f27432a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f25702b.schedule(a10) == 0) {
                p.c().h(str, String.format("Unable to schedule work ID %s", pVar.f27432a), new Throwable[0]);
                if (pVar.f27448q && pVar.f27449r == t.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f27448q = false;
                    p.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f27432a), new Throwable[0]);
                    j(pVar, i10);
                }
            }
        } catch (IllegalStateException e8) {
            List<JobInfo> g10 = g(this.f25701a, this.f25702b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g10 != null ? g10.size() : 0), Integer.valueOf(this.f25703c.w().l().d().size()), Integer.valueOf(this.f25703c.q().h()));
            p.c().b(f25700e, format, new Throwable[0]);
            throw new IllegalStateException(format, e8);
        } catch (Throwable th) {
            p.c().b(f25700e, String.format("Unable to schedule %s", pVar), th);
        }
    }

    public b(Context context, i iVar, JobScheduler jobScheduler, a aVar) {
        this.f25701a = context;
        this.f25703c = iVar;
        this.f25702b = jobScheduler;
        this.f25704d = aVar;
    }
}
