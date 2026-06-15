package j1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.p;
/* compiled from: BroadcastReceiverConstraintTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final String f26765h = p.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f26766g;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, n1.a aVar) {
        super(context, aVar);
        this.f26766g = new a();
    }

    @Override // j1.d
    public void e() {
        p.c().a(f26765h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f26770b.registerReceiver(this.f26766g, g());
    }

    @Override // j1.d
    public void f() {
        p.c().a(f26765h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f26770b.unregisterReceiver(this.f26766g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
