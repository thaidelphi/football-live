package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.h;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements h.c {
        a() {
        }

        @Override // androidx.profileinstaller.h.c
        public void a(int i10, Object obj) {
            h.f3769b.a(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }

        @Override // androidx.profileinstaller.h.c
        public void b(int i10, Object obj) {
            h.f3769b.b(i10, obj);
        }
    }

    static void a(h.c cVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            Process.sendSignal(Process.myPid(), 10);
            cVar.a(12, null);
            return;
        }
        cVar.a(13, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            h.k(context, androidx.privacysandbox.ads.adservices.topics.i.f3728a, new a(), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    h.l(context, androidx.privacysandbox.ads.adservices.topics.i.f3728a, new a());
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    h.c(context, androidx.privacysandbox.ads.adservices.topics.i.f3728a, new a());
                }
            }
        } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(new a());
        } else if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
        } else {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            a aVar = new a();
            if ("DROP_SHADER_CACHE".equals(string2)) {
                androidx.profileinstaller.a.b(context, aVar);
            } else {
                aVar.a(16, null);
            }
        }
    }
}
