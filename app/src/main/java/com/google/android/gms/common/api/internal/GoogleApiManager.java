package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GoogleApiManager implements Handler.Callback {

    /* renamed from: r  reason: collision with root package name */
    public static final Status f12108r = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: s  reason: collision with root package name */
    private static final Status f12109s = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: t  reason: collision with root package name */
    private static final Object f12110t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static GoogleApiManager f12111u;

    /* renamed from: e  reason: collision with root package name */
    private TelemetryData f12116e;

    /* renamed from: f  reason: collision with root package name */
    private TelemetryLoggingClient f12117f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f12118g;

    /* renamed from: h  reason: collision with root package name */
    private final GoogleApiAvailability f12119h;

    /* renamed from: i  reason: collision with root package name */
    private final com.google.android.gms.common.internal.zal f12120i;

    /* renamed from: p  reason: collision with root package name */
    private final Handler f12127p;

    /* renamed from: q  reason: collision with root package name */
    private volatile boolean f12128q;

    /* renamed from: a  reason: collision with root package name */
    private long f12112a = ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;

    /* renamed from: b  reason: collision with root package name */
    private long f12113b = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;

    /* renamed from: c  reason: collision with root package name */
    private long f12114c = 10000;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12115d = false;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicInteger f12121j = new AtomicInteger(1);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f12122k = new AtomicInteger(0);

    /* renamed from: l  reason: collision with root package name */
    private final Map<ApiKey<?>, zabq<?>> f12123l = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: m  reason: collision with root package name */
    private zaae f12124m = null;

    /* renamed from: n  reason: collision with root package name */
    private final Set<ApiKey<?>> f12125n = new androidx.collection.b();

    /* renamed from: o  reason: collision with root package name */
    private final Set<ApiKey<?>> f12126o = new androidx.collection.b();

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f12128q = true;
        this.f12118g = context;
        zaq zaqVar = new zaq(looper, this);
        this.f12127p = zaqVar;
        this.f12119h = googleApiAvailability;
        this.f12120i = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.a(context)) {
            this.f12128q = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status h(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        String b10 = apiKey.b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(b10).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b10);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    private final zabq<?> i(GoogleApi<?> googleApi) {
        ApiKey<?> apiKey = googleApi.getApiKey();
        zabq<?> zabqVar = this.f12123l.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq<>(this, googleApi);
            this.f12123l.put(apiKey, zabqVar);
        }
        if (zabqVar.M()) {
            this.f12126o.add(apiKey);
        }
        zabqVar.B();
        return zabqVar;
    }

    private final TelemetryLoggingClient j() {
        if (this.f12117f == null) {
            this.f12117f = TelemetryLogging.a(this.f12118g);
        }
        return this.f12117f;
    }

    private final void k() {
        TelemetryData telemetryData = this.f12116e;
        if (telemetryData != null) {
            if (telemetryData.X() > 0 || f()) {
                j().a(telemetryData);
            }
            this.f12116e = null;
        }
    }

    private final <T> void l(TaskCompletionSource<T> taskCompletionSource, int i10, GoogleApi googleApi) {
        b0 a10;
        if (i10 == 0 || (a10 = b0.a(this, i10, googleApi.getApiKey())) == null) {
            return;
        }
        Task<T> task = taskCompletionSource.getTask();
        final Handler handler = this.f12127p;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, a10);
    }

    public static GoogleApiManager x(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (f12110t) {
            if (f12111u == null) {
                f12111u = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.c().getLooper(), GoogleApiAvailability.q());
            }
            googleApiManager = f12111u;
        }
        return googleApiManager;
    }

    public final <O extends Api.ApiOptions> Task<Void> A(GoogleApi<O> googleApi, RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        l(taskCompletionSource, registerListenerMethod.e(), googleApi);
        zaf zafVar = new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        Handler handler = this.f12127p;
        handler.sendMessage(handler.obtainMessage(8, new zach(zafVar, this.f12122k.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> Task<Boolean> B(GoogleApi<O> googleApi, ListenerHolder.ListenerKey listenerKey, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        l(taskCompletionSource, i10, googleApi);
        zah zahVar = new zah(listenerKey, taskCompletionSource);
        Handler handler = this.f12127p;
        handler.sendMessage(handler.obtainMessage(13, new zach(zahVar, this.f12122k.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> void G(GoogleApi<O> googleApi, int i10, BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zae zaeVar = new zae(i10, apiMethodImpl);
        Handler handler = this.f12127p;
        handler.sendMessage(handler.obtainMessage(4, new zach(zaeVar, this.f12122k.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void H(GoogleApi<O> googleApi, int i10, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        l(taskCompletionSource, taskApiCall.d(), googleApi);
        zag zagVar = new zag(i10, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler = this.f12127p;
        handler.sendMessage(handler.obtainMessage(4, new zach(zagVar, this.f12122k.get(), googleApi)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        Handler handler = this.f12127p;
        handler.sendMessage(handler.obtainMessage(18, new c0(methodInvocation, i10, j10, i11)));
    }

    public final void J(ConnectionResult connectionResult, int i10) {
        if (g(connectionResult, i10)) {
            return;
        }
        Handler handler = this.f12127p;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
    }

    public final void a() {
        Handler handler = this.f12127p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(GoogleApi<?> googleApi) {
        Handler handler = this.f12127p;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final void c(zaae zaaeVar) {
        synchronized (f12110t) {
            if (this.f12124m != zaaeVar) {
                this.f12124m = zaaeVar;
                this.f12125n.clear();
            }
            this.f12125n.addAll(zaaeVar.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(zaae zaaeVar) {
        synchronized (f12110t) {
            if (this.f12124m == zaaeVar) {
                this.f12124m = null;
                this.f12125n.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        if (this.f12115d) {
            return false;
        }
        RootTelemetryConfiguration a10 = RootTelemetryConfigManager.b().a();
        if (a10 == null || a10.o0()) {
            int a11 = this.f12120i.a(this.f12118g, 203400000);
            return a11 == -1 || a11 == 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(ConnectionResult connectionResult, int i10) {
        return this.f12119h.A(this.f12118g, connectionResult, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zabq<?> zabqVar;
        ApiKey apiKey;
        ApiKey apiKey2;
        ApiKey apiKey3;
        ApiKey apiKey4;
        int i10 = message.what;
        switch (i10) {
            case 1:
                this.f12114c = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f12127p.removeMessages(12);
                for (ApiKey<?> apiKey5 : this.f12123l.keySet()) {
                    Handler handler = this.f12127p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey5), this.f12114c);
                }
                break;
            case 2:
                zal zalVar = (zal) message.obj;
                Iterator<ApiKey<?>> it = zalVar.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ApiKey<?> next = it.next();
                        zabq<?> zabqVar2 = this.f12123l.get(next);
                        if (zabqVar2 == null) {
                            zalVar.b(next, new ConnectionResult(13), null);
                            break;
                        } else if (zabqVar2.L()) {
                            zalVar.b(next, ConnectionResult.f12002e, zabqVar2.s().getEndpointPackageName());
                        } else {
                            ConnectionResult q10 = zabqVar2.q();
                            if (q10 != null) {
                                zalVar.b(next, q10, null);
                            } else {
                                zabqVar2.G(zalVar);
                                zabqVar2.B();
                            }
                        }
                    }
                }
            case 3:
                for (zabq<?> zabqVar3 : this.f12123l.values()) {
                    zabqVar3.A();
                    zabqVar3.B();
                }
                break;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq<?> zabqVar4 = this.f12123l.get(zachVar.f12351c.getApiKey());
                if (zabqVar4 == null) {
                    zabqVar4 = i(zachVar.f12351c);
                }
                if (zabqVar4.M() && this.f12122k.get() != zachVar.f12350b) {
                    zachVar.f12349a.a(f12108r);
                    zabqVar4.I();
                    break;
                } else {
                    zabqVar4.C(zachVar.f12349a);
                    break;
                }
                break;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zabq<?>> it2 = this.f12123l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabq<?> next2 = it2.next();
                        zabqVar = next2.o() == i11 ? next2 : null;
                    }
                }
                if (zabqVar != null) {
                    if (connectionResult.X() == 13) {
                        String g10 = this.f12119h.g(connectionResult.X());
                        String n02 = connectionResult.n0();
                        StringBuilder sb = new StringBuilder(String.valueOf(g10).length() + 69 + String.valueOf(n02).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(g10);
                        sb.append(": ");
                        sb.append(n02);
                        zabq.v(zabqVar, new Status(17, sb.toString()));
                        break;
                    } else {
                        zabq.v(zabqVar, h(zabq.t(zabqVar), connectionResult));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i11);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f12118g.getApplicationContext() instanceof Application) {
                    BackgroundDetector.c((Application) this.f12118g.getApplicationContext());
                    BackgroundDetector.b().a(new t(this));
                    if (!BackgroundDetector.b().e(true)) {
                        this.f12114c = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                i((GoogleApi) message.obj);
                break;
            case 9:
                if (this.f12123l.containsKey(message.obj)) {
                    this.f12123l.get(message.obj).H();
                    break;
                }
                break;
            case 10:
                for (ApiKey<?> apiKey6 : this.f12126o) {
                    zabq<?> remove = this.f12123l.remove(apiKey6);
                    if (remove != null) {
                        remove.I();
                    }
                }
                this.f12126o.clear();
                break;
            case 11:
                if (this.f12123l.containsKey(message.obj)) {
                    this.f12123l.get(message.obj).J();
                    break;
                }
                break;
            case 12:
                if (this.f12123l.containsKey(message.obj)) {
                    this.f12123l.get(message.obj).a();
                    break;
                }
                break;
            case 14:
                d dVar = (d) message.obj;
                ApiKey<?> a10 = dVar.a();
                if (!this.f12123l.containsKey(a10)) {
                    dVar.b().setResult(Boolean.FALSE);
                    break;
                } else {
                    dVar.b().setResult(Boolean.valueOf(zabq.K(this.f12123l.get(a10), false)));
                    break;
                }
            case 15:
                y yVar = (y) message.obj;
                Map<ApiKey<?>, zabq<?>> map = this.f12123l;
                apiKey = yVar.f12257a;
                if (map.containsKey(apiKey)) {
                    Map<ApiKey<?>, zabq<?>> map2 = this.f12123l;
                    apiKey2 = yVar.f12257a;
                    zabq.y(map2.get(apiKey2), yVar);
                    break;
                }
                break;
            case 16:
                y yVar2 = (y) message.obj;
                Map<ApiKey<?>, zabq<?>> map3 = this.f12123l;
                apiKey3 = yVar2.f12257a;
                if (map3.containsKey(apiKey3)) {
                    Map<ApiKey<?>, zabq<?>> map4 = this.f12123l;
                    apiKey4 = yVar2.f12257a;
                    zabq.z(map4.get(apiKey4), yVar2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                c0 c0Var = (c0) message.obj;
                if (c0Var.f12199c == 0) {
                    j().a(new TelemetryData(c0Var.f12198b, Arrays.asList(c0Var.f12197a)));
                    break;
                } else {
                    TelemetryData telemetryData = this.f12116e;
                    if (telemetryData != null) {
                        List<MethodInvocation> n03 = telemetryData.n0();
                        if (telemetryData.X() == c0Var.f12198b && (n03 == null || n03.size() < c0Var.f12200d)) {
                            this.f12116e.o0(c0Var.f12197a);
                        } else {
                            this.f12127p.removeMessages(17);
                            k();
                        }
                    }
                    if (this.f12116e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c0Var.f12197a);
                        this.f12116e = new TelemetryData(c0Var.f12198b, arrayList);
                        Handler handler2 = this.f12127p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c0Var.f12199c);
                        break;
                    }
                }
                break;
            case 19:
                this.f12115d = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i10);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    public final int m() {
        return this.f12121j.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zabq w(ApiKey<?> apiKey) {
        return this.f12123l.get(apiKey);
    }

    public final Task<Boolean> z(GoogleApi<?> googleApi) {
        d dVar = new d(googleApi.getApiKey());
        Handler handler = this.f12127p;
        handler.sendMessage(handler.obtainMessage(14, dVar));
        return dVar.b().getTask();
    }
}
