package e1;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.p;
import java.util.List;
import l1.q;
/* compiled from: Schedulers.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24855a = p.f("Schedulers");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e a(Context context, i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            g1.b bVar = new g1.b(context, iVar);
            m1.d.a(context, SystemJobService.class, true);
            p.c().a(f24855a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        e c10 = c(context);
        if (c10 == null) {
            androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
            m1.d.a(context, SystemAlarmService.class, true);
            p.c().a(f24855a, "Created SystemAlarmScheduler", new Throwable[0]);
            return fVar;
        }
        return c10;
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q l10 = workDatabase.l();
        workDatabase.beginTransaction();
        try {
            List<l1.p> n10 = l10.n(bVar.h());
            List<l1.p> j10 = l10.j(200);
            if (n10 != null && n10.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (l1.p pVar : n10) {
                    l10.l(pVar.f27432a, currentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            if (n10 != null && n10.size() > 0) {
                l1.p[] pVarArr = (l1.p[]) n10.toArray(new l1.p[n10.size()]);
                for (e eVar : list) {
                    if (eVar.d()) {
                        eVar.a(pVarArr);
                    }
                }
            }
            if (j10 == null || j10.size() <= 0) {
                return;
            }
            l1.p[] pVarArr2 = (l1.p[]) j10.toArray(new l1.p[j10.size()]);
            for (e eVar2 : list) {
                if (!eVar2.d()) {
                    eVar2.a(pVarArr2);
                }
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    private static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            p.c().a(f24855a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            p.c().a(f24855a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
