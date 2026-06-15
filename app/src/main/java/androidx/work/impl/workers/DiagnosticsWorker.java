package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import e1.i;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l1.g;
import l1.h;
import l1.k;
import l1.q;
import l1.t;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4805a = p.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String a(l1.p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f27432a, pVar.f27434c, num, pVar.f27433b.name(), str, str2);
    }

    private static String c(k kVar, t tVar, h hVar, List<l1.p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (l1.p pVar : list) {
            Integer num = null;
            g a10 = hVar.a(pVar.f27432a);
            if (a10 != null) {
                num = Integer.valueOf(a10.f27410b);
            }
            sb.append(a(pVar, TextUtils.join(",", kVar.a(pVar.f27432a)), num, TextUtils.join(",", tVar.a(pVar.f27432a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase w10 = i.s(getApplicationContext()).w();
        q l10 = w10.l();
        k j10 = w10.j();
        t m7 = w10.m();
        h i10 = w10.i();
        List<l1.p> c10 = l10.c(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<l1.p> p10 = l10.p();
        List<l1.p> j11 = l10.j(200);
        if (c10 != null && !c10.isEmpty()) {
            p c11 = p.c();
            String str = f4805a;
            c11.d(str, "Recently completed work:\n\n", new Throwable[0]);
            p.c().d(str, c(j10, m7, i10, c10), new Throwable[0]);
        }
        if (p10 != null && !p10.isEmpty()) {
            p c12 = p.c();
            String str2 = f4805a;
            c12.d(str2, "Running work:\n\n", new Throwable[0]);
            p.c().d(str2, c(j10, m7, i10, p10), new Throwable[0]);
        }
        if (j11 != null && !j11.isEmpty()) {
            p c13 = p.c();
            String str3 = f4805a;
            c13.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            p.c().d(str3, c(j10, m7, i10, j11), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
