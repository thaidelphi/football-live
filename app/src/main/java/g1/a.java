package g1;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.c;
import androidx.work.d;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.p;
import androidx.work.q;
/* compiled from: SystemJobInfoConverter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25697b = p.f("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    private final ComponentName f25698a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemJobInfoConverter.java */
    /* renamed from: g1.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class C0279a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25699a;

        static {
            int[] iArr = new int[q.values().length];
            f25699a = iArr;
            try {
                iArr[q.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25699a[q.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25699a[q.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25699a[q.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25699a[q.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f25698a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    static int c(q qVar) {
        int i10 = C0279a.f25699a[qVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
                            return 4;
                        }
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        return 3;
                    }
                    p.c().a(f25697b, String.format("API version too low. Cannot convert network type value %s", qVar), new Throwable[0]);
                    return 1;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    static void d(JobInfo.Builder builder, q qVar) {
        if (Build.VERSION.SDK_INT >= 30 && qVar == q.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(c(qVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JobInfo a(l1.p pVar, int i10) {
        c cVar = pVar.f27441j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f27432a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f25698a).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        d(extras, cVar.b());
        if (!cVar.h()) {
            extras.setBackoffCriteria(pVar.f27444m, pVar.f27443l == androidx.work.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f27448q) {
            extras.setImportantWhileForeground(true);
        }
        if (i11 >= 24 && cVar.e()) {
            for (d.a aVar : cVar.a().b()) {
                extras.addTriggerContentUri(b(aVar));
            }
            extras.setTriggerContentUpdateDelay(cVar.c());
            extras.setTriggerContentMaxDelay(cVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        boolean z10 = pVar.f27442k > 0;
        boolean z11 = max > 0;
        if (androidx.core.os.a.c() && pVar.f27448q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
