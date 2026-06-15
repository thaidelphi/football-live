package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {
    protected final GoogleApiManager zaa;
    private final Context zab;
    private final String zac;
    private final Api<O> zad;
    private final O zae;
    private final ApiKey<O> zaf;
    private final Looper zag;
    private final int zah;
    private final GoogleApiClient zai;
    private final StatusExceptionMapper zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Settings {
        @KeepForSdk

        /* renamed from: c  reason: collision with root package name */
        public static final Settings f12053c = new Builder().a();

        /* renamed from: a  reason: collision with root package name */
        public final StatusExceptionMapper f12054a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f12055b;

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        @KeepForSdk
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class Builder {

            /* renamed from: a  reason: collision with root package name */
            private StatusExceptionMapper f12056a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f12057b;

            @KeepForSdk
            public Settings a() {
                if (this.f12056a == null) {
                    this.f12056a = new ApiExceptionMapper();
                }
                if (this.f12057b == null) {
                    this.f12057b = Looper.getMainLooper();
                }
                return new Settings(this.f12056a, this.f12057b);
            }

            @KeepForSdk
            public Builder b(Looper looper) {
                Preconditions.n(looper, "Looper must not be null.");
                this.f12057b = looper;
                return this;
            }

            @KeepForSdk
            public Builder c(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.n(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.f12056a = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.f12054a = statusExceptionMapper;
            this.f12055b = looper;
        }
    }

    @KeepForSdk
    public GoogleApi(Activity activity, Api<O> api, O o10, Settings settings) {
        this(activity, activity, api, o10, settings);
    }

    private final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zad(int i10, T t10) {
        t10.l();
        this.zaa.G(this, i10, t10);
        return t10;
    }

    private final <TResult, A extends Api.AnyClient> Task<TResult> zae(int i10, TaskApiCall<A, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.H(this, i10, taskApiCall, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    @KeepForSdk
    protected ClientSettings.Builder createClientSettingsBuilder() {
        Account z10;
        Set<Scope> emptySet;
        GoogleSignInAccount w10;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o10 = this.zae;
        if ((o10 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) && (w10 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o10).w()) != null) {
            z10 = w10.z();
        } else {
            O o11 = this.zae;
            z10 = o11 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) o11).z() : null;
        }
        builder.d(z10);
        O o12 = this.zae;
        if (o12 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) {
            GoogleSignInAccount w11 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o12).w();
            if (w11 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = w11.G0();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        builder.c(emptySet);
        builder.e(this.zab.getClass().getName());
        builder.b(this.zab.getPackageName());
        return builder;
    }

    @KeepForSdk
    protected Task<Boolean> disconnectService() {
        return this.zaa.z(this);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(T t10) {
        zad(2, t10);
        return t10;
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(T t10) {
        zad(0, t10);
        return t10;
    }

    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(T t10, U u10) {
        Preconditions.m(t10);
        Preconditions.m(u10);
        Preconditions.n(t10.b(), "Listener has already been released.");
        Preconditions.n(u10.a(), "Listener has already been released.");
        Preconditions.b(Objects.a(t10.b(), u10.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.A(this, t10, u10, new Runnable() { // from class: com.google.android.gms.common.api.zad
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(T t10) {
        zad(1, t10);
        return t10;
    }

    public final ApiKey<O> getApiKey() {
        return this.zaf;
    }

    @KeepForSdk
    public O getApiOptions() {
        return this.zae;
    }

    @KeepForSdk
    public Context getApplicationContext() {
        return this.zab;
    }

    @KeepForSdk
    protected String getContextAttributionTag() {
        return this.zac;
    }

    @KeepForSdk
    @Deprecated
    protected String getContextFeatureId() {
        return this.zac;
    }

    @KeepForSdk
    public Looper getLooper() {
        return this.zag;
    }

    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(L l10, String str) {
        return ListenerHolders.a(l10, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    public final Api.Client zab(Looper looper, zabq<O> zabqVar) {
        Api.Client buildClient = ((Api.AbstractClientBuilder) Preconditions.m(this.zad.a())).buildClient(this.zab, looper, createClientSettingsBuilder().a(), (ClientSettings) this.zae, (GoogleApiClient.ConnectionCallbacks) zabqVar, (GoogleApiClient.OnConnectionFailedListener) zabqVar);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) buildClient).f(contextAttributionTag);
        }
        return buildClient;
    }

    public final zact zac(Context context, Handler handler) {
        return new zact(context, handler, createClientSettingsBuilder().a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(android.app.Activity r2, com.google.android.gms.common.api.Api<O> r3, O r4, com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.b(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.app.Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey, int i10) {
        Preconditions.n(listenerKey, "Listener key cannot be null.");
        return this.zaa.B(this, listenerKey, i10);
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    private GoogleApi(Context context, Activity activity, Api<O> api, O o10, Settings settings) {
        Preconditions.n(context, "Null context is not permitted.");
        Preconditions.n(api, "Api must not be null.");
        Preconditions.n(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (PlatformVersion.l()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = api;
        this.zae = o10;
        this.zag = settings.f12055b;
        ApiKey<O> a10 = ApiKey.a(api, o10, str);
        this.zaf = a10;
        this.zai = new zabv(this);
        GoogleApiManager x10 = GoogleApiManager.x(this.zab);
        this.zaa = x10;
        this.zah = x10.m();
        this.zaj = settings.f12054a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.j(activity, x10, a10);
        }
        x10.b(this);
    }

    @KeepForSdk
    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.m(registrationMethods);
        Preconditions.n(registrationMethods.f12154a.b(), "Listener has already been released.");
        Preconditions.n(registrationMethods.f12155b.a(), "Listener has already been released.");
        return this.zaa.A(this, registrationMethods.f12154a, registrationMethods.f12155b, registrationMethods.f12156c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, android.os.Looper r5, com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.b(r5)
            r0.c(r6)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, android.os.Looper, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @KeepForSdk
    public GoogleApi(Context context, Api<O> api, O o10, Settings settings) {
        this(context, (Activity) null, api, o10, settings);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.c(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }
}
