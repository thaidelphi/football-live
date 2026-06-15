package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import e1.i;
import l1.g;
import l1.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Alarms.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4690a = p.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h i10 = iVar.w().i();
        g a10 = i10.a(str);
        if (a10 != null) {
            b(context, str, a10.f27410b);
            p.c().a(f4690a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            i10.d(str);
        }
    }

    private static void b(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        p.c().a(f4690a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, i iVar, String str, long j10) {
        WorkDatabase w10 = iVar.w();
        h i10 = w10.i();
        g a10 = i10.a(str);
        if (a10 != null) {
            b(context, str, a10.f27410b);
            d(context, str, a10.f27410b, j10);
            return;
        }
        int b10 = new m1.c(w10).b();
        i10.b(new g(str, b10));
        d(context, str, b10, j10);
    }

    private static void d(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i11 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), i11 >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            if (i11 >= 19) {
                alarmManager.setExact(0, j10, service);
            } else {
                alarmManager.set(0, j10, service);
            }
        }
    }
}
