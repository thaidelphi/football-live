package j1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.p;
/* compiled from: StorageNotLowTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    private static final String f26782i = p.f("StorageNotLowTracker");

    public f(Context context, n1.a aVar) {
        super(context, aVar);
    }

    @Override // j1.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // j1.c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        p.c().a(f26782i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            d(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            d(Boolean.TRUE);
        }
    }

    @Override // j1.d
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.f26770b.registerReceiver(null, g());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return Boolean.FALSE;
            }
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return Boolean.TRUE;
            }
            return null;
        }
        return Boolean.TRUE;
    }
}
