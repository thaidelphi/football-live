package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.a0;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.p;
import androidx.work.r;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4731a = p.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        p.c().a(f4731a, "Requesting diagnostics", new Throwable[0]);
        try {
            a0.j(context).e(r.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e8) {
            p.c().b(f4731a, "WorkManager is not initialized", e8);
        }
    }
}
