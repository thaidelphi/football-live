package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.p;
import e1.i;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4686a = p.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        p.c().a(f4686a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                i.s(context).B(goAsync());
                return;
            } catch (IllegalStateException e8) {
                p.c().b(f4686a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e8);
                return;
            }
        }
        context.startService(b.d(context));
    }
}
