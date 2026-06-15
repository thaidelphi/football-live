package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.p;
import e1.i;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static final String f4681a = p.f("ConstrntProxyUpdtRecvr");

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f4682a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f4683b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f4684c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f4682a = intent;
            this.f4683b = context;
            this.f4684c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f4682a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f4682a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f4682a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f4682a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                p.c().a(ConstraintProxyUpdateReceiver.f4681a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                m1.d.a(this.f4683b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                m1.d.a(this.f4683b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                m1.d.a(this.f4683b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                m1.d.a(this.f4683b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f4684c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            p.c().a(f4681a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        } else {
            i.s(context).x().b(new a(intent, context, goAsync()));
        }
    }
}
