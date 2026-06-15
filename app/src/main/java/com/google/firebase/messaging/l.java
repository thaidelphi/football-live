package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.j3;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: FcmBroadcastProcessor.java */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class l {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f15006c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static e1 f15007d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f15008a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f15009b = androidx.privacysandbox.ads.adservices.topics.i.f3728a;

    public l(Context context) {
        this.f15008a = context;
    }

    private static Task<Integer> d(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (o0.b().e(context)) {
            z0.f(context, e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            e(context, "com.google.firebase.MESSAGING_EVENT").c(intent);
        }
        return Tasks.forResult(-1);
    }

    private static e1 e(Context context, String str) {
        e1 e1Var;
        synchronized (f15006c) {
            if (f15007d == null) {
                f15007d = new e1(context, str);
            }
            e1Var = f15007d;
        }
        return e1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer f(Context context, Intent intent) throws Exception {
        return Integer.valueOf(o0.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(Task task) throws Exception {
        return Integer.valueOf((int) j3.a.b.f17898c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task h(Context context, Intent intent, Task task) throws Exception {
        return (PlatformVersion.i() && ((Integer) task.getResult()).intValue() == 402) ? d(context, intent).continueWith(androidx.privacysandbox.ads.adservices.topics.i.f3728a, new Continuation() { // from class: com.google.firebase.messaging.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Integer g10;
                g10 = l.g(task2);
                return g10;
            }
        }) : task;
    }

    @KeepForSdk
    public Task<Integer> i(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return j(this.f15008a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> j(final Context context, final Intent intent) {
        boolean z10 = PlatformVersion.i() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & 268435456) != 0;
        if (z10 && !z11) {
            return d(context, intent);
        }
        return Tasks.call(this.f15009b, new Callable() { // from class: com.google.firebase.messaging.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer f10;
                f10 = l.f(context, intent);
                return f10;
            }
        }).continueWithTask(this.f15009b, new Continuation() { // from class: com.google.firebase.messaging.i
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task h10;
                h10 = l.h(context, intent, task);
                return h10;
            }
        });
    }
}
