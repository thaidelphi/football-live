package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.xn;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class FirebaseMessagingService extends h {

    /* renamed from: f  reason: collision with root package name */
    private static final Queue<String> f14901f = new ArrayDeque(10);

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f14901f;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + str);
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (f0.t(extras)) {
            f0 f0Var = new f0(extras);
            ExecutorService e8 = m.e();
            try {
                if (new e(this, f0Var, e8).a()) {
                    return;
                }
                e8.shutdown();
                if (d0.A(intent)) {
                    d0.t(intent);
                }
            } finally {
                e8.shutdown();
            }
        }
        q(new RemoteMessage(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void o(Intent intent) {
        if (l(intent.getStringExtra("google.message_id"))) {
            return;
        }
        u(intent);
    }

    private void u(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c10 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c10 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c10 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c10 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                p();
                return;
            case 1:
                d0.v(intent);
                m(intent);
                return;
            case 2:
                t(n(intent), new n0(intent.getStringExtra(xn.a.f21422g)));
                return;
            case 3:
                r(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    @Override // com.google.firebase.messaging.h
    protected Intent e(Intent intent) {
        return o0.b().c();
    }

    @Override // com.google.firebase.messaging.h
    public void f(Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                s(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        o(intent);
    }

    public void p() {
    }

    public void q(RemoteMessage remoteMessage) {
    }

    public void r(String str) {
    }

    public void s(String str) {
    }

    public void t(String str, Exception exc) {
    }
}
