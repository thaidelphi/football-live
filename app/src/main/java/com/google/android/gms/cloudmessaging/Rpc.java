package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.h;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.xn;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Rpc {

    /* renamed from: h  reason: collision with root package name */
    private static int f11943h;

    /* renamed from: i  reason: collision with root package name */
    private static PendingIntent f11944i;

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f11945j = new Executor() { // from class: com.google.android.gms.cloudmessaging.zzz
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f11946k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b  reason: collision with root package name */
    private final Context f11948b;

    /* renamed from: c  reason: collision with root package name */
    private final zzt f11949c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f11950d;

    /* renamed from: f  reason: collision with root package name */
    private Messenger f11952f;

    /* renamed from: g  reason: collision with root package name */
    private zzd f11953g;

    /* renamed from: a  reason: collision with root package name */
    private final h<String, TaskCompletionSource<Bundle>> f11947a = new h<>();

    /* renamed from: e  reason: collision with root package name */
    private Messenger f11951e = new Messenger(new a(this, Looper.getMainLooper()));

    public Rpc(Context context) {
        this.f11948b = context;
        this.f11949c = new zzt(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11950d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Task b(Bundle bundle) throws Exception {
        if (j(bundle)) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(Rpc rpc, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzc());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        rpc.f11953g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        rpc.f11952f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("Rpc", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra(xn.a.f21422g);
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        Log.w("Rpc", sb.toString());
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            rpc.i(str, intent2.putExtra(xn.a.f21422g, str2).getExtras());
                            return;
                        }
                        Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                        return;
                    }
                    synchronized (rpc.f11947a) {
                        for (int i10 = 0; i10 < rpc.f11947a.size(); i10++) {
                            rpc.i(rpc.f11947a.i(i10), intent2.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher = f11946k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    rpc.i(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final Task<Bundle> f(Bundle bundle) {
        final String g10 = g();
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f11947a) {
            this.f11947a.put(g10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f11949c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        h(this.f11948b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g10).length() + 5);
        sb.append("|ID|");
        sb.append(g10);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f11951e);
        if (this.f11952f != null || this.f11953g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f11952f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f11953g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f11950d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzy
                @Override // java.lang.Runnable
                public final void run() {
                    if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(f11945j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzw
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Rpc.this.e(g10, schedule, task);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.f11949c.b() == 2) {
            this.f11948b.sendBroadcast(intent);
        } else {
            this.f11948b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f11950d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzy
            @Override // java.lang.Runnable
            public final void run() {
                if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(f11945j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzw
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                Rpc.this.e(g10, schedule2, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static synchronized String g() {
        String num;
        synchronized (Rpc.class) {
            int i10 = f11943h;
            f11943h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    private static synchronized void h(Context context, Intent intent) {
        synchronized (Rpc.class) {
            if (f11944i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f11944i = com.google.android.gms.internal.cloudmessaging.zza.zza(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
            }
            intent.putExtra("app", f11944i);
        }
    }

    private final void i(String str, Bundle bundle) {
        synchronized (this.f11947a) {
            TaskCompletionSource<Bundle> remove = this.f11947a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.setResult(bundle);
        }
    }

    private static boolean j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task<Bundle> a(final Bundle bundle) {
        if (this.f11949c.a() < 12000000) {
            if (this.f11949c.b() != 0) {
                return f(bundle).continueWithTask(f11945j, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzu
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Rpc.this.c(bundle, task);
                    }
                });
            }
            return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return zzs.b(this.f11948b).d(1, bundle).continueWith(f11945j, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzv
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf = String.valueOf(task.getException());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                    sb.append("Error making request: ");
                    sb.append(valueOf);
                    Log.d("Rpc", sb.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    public final /* synthetic */ Task c(Bundle bundle, Task task) throws Exception {
        return (task.isSuccessful() && j((Bundle) task.getResult())) ? f(bundle).onSuccessTask(f11945j, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Rpc.b((Bundle) obj);
            }
        }) : task;
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f11947a) {
            this.f11947a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
