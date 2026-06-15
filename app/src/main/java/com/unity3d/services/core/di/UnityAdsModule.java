package com.unity3d.services.core.di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b0.d;
import b0.f;
import b0.g;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import d9.e2;
import d9.f1;
import d9.j0;
import d9.k0;
import d9.n0;
import d9.o0;
import d9.p0;
import d9.u2;
import d9.z;
import d9.z1;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import j8.p;
import java.util.List;
import kotlin.jvm.internal.n;
/* compiled from: UnityAdsModule.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UnityAdsModule {
    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        n.e(newBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setLoadTimeoutMs(30000);
        _create.setShowTimeoutMs(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        _create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        n.e(newBuilder, "newBuilder()");
        RequestPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setRetryPolicy(getDefaultRequestRetryPolicy());
        _create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        n.e(newBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setMaxDuration(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        _create.setRetryWaitBase(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        _create.setRetryJitterPct(0.1f);
        _create.setShouldStoreLocally(false);
        _create.setRetryMaxInterval(2500);
        _create.setRetryScalingFactor(2.0f);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        n.e(newBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setConnectTimeoutMs(30000);
        _create.setReadTimeoutMs(30000);
        _create.setWriteTimeoutMs(30000);
        _create.setOverallTimeoutMs(30000);
        return _create._build();
    }

    private final ByteStringDataSource provideByteStringDataSource(f<ByteStringStoreOuterClass.ByteStringStore> fVar) {
        return new AndroidByteStringDataSource(fVar);
    }

    private final f<ByteStringStoreOuterClass.ByteStringStore> provideByteStringDataStore(Context context, j0 j0Var, String str) {
        return g.b(g.f4865a, new ByteStringSerializer(), null, null, p0.a(j0Var.plus(u2.b(null, 1, null))), new UnityAdsModule$provideByteStringDataStore$1(context, str), 4, null);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (StorageManager.init(ClientProperties.getApplicationContext())) {
            Storage storage = StorageManager.getStorage(storageType);
            n.e(storage, "getStorage(storageType)");
            return storage;
        }
        throw new IllegalStateException("StorageManager failed to initialize".toString());
    }

    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        n.e(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    public final AsyncTokenStorage asyncTokenStorage(TokenStorage tokenStorage, SDKMetricsSender sdkMetricsSender) {
        n.f(tokenStorage, "tokenStorage");
        n.f(sdkMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sdkMetricsSender, tokenStorage);
    }

    public final ByteStringDataSource auidDataStore(f<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        n.f(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final j0 defaultDispatcher() {
        return f1.a();
    }

    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        n.e(newBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setAdOperations(getDefaultAdOperations());
        _create.setInitPolicy(getDefaultRequestPolicy());
        _create.setAdPolicy(getDefaultRequestPolicy());
        _create.setOtherPolicy(getDefaultRequestPolicy());
        _create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        n.e(newBuilder2, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setEnabled(true);
        _create2.setMaxBatchSize(10);
        _create2.setMaxBatchIntervalMs(30000);
        _create2.setTtmEnabled(false);
        _create.setDiagnosticEvents(_create2._build());
        return _create._build();
    }

    public final ByteStringDataSource gatewayCacheDataStore(f<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        n.f(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final f<ByteStringStoreOuterClass.ByteStringStore> gatewayDataStore(Context context, j0 dispatcher) {
        n.f(context, "context");
        n.f(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    public final o0 getTokenCoroutineScope(ISDKDispatchers dispatchers, k0 errorHandler, z1 parentJob) {
        n.f(dispatchers, "dispatchers");
        n.f(errorHandler, "errorHandler");
        n.f(parentJob, "parentJob");
        return p0.a(parentJob.plus(dispatchers.getDefault()).plus(new n0(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(errorHandler));
    }

    public final f<ByteStringStoreOuterClass.ByteStringStore> glInfoDataStore(Context context, j0 dispatcher, d<ByteStringStoreOuterClass.ByteStringStore> fetchGLInfo) {
        List b10;
        n.f(context, "context");
        n.f(dispatcher, "dispatcher");
        n.f(fetchGLInfo, "fetchGLInfo");
        g gVar = g.f4865a;
        ByteStringSerializer byteStringSerializer = new ByteStringSerializer();
        b10 = p.b(fetchGLInfo);
        return g.b(gVar, byteStringSerializer, null, b10, p0.a(dispatcher.plus(u2.b(null, 1, null))), new UnityAdsModule$glInfoDataStore$1(context), 2, null);
    }

    public final f<ByteStringStoreOuterClass.ByteStringStore> iapTransactionDataStore(Context context, j0 dispatcher) {
        n.f(context, "context");
        n.f(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    public final ByteStringDataSource idfiDataStore(f<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        n.f(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final o0 initCoroutineScope(ISDKDispatchers dispatchers, k0 errorHandler, z1 parentJob) {
        n.f(dispatchers, "dispatchers");
        n.f(errorHandler, "errorHandler");
        n.f(parentJob, "parentJob");
        return p0.a(parentJob.plus(dispatchers.getDefault()).plus(new n0(ServiceProvider.NAMED_INIT_SCOPE)).plus(errorHandler));
    }

    public final j0 ioDispatcher() {
        return f1.b();
    }

    public final o0 loadCoroutineScope(ISDKDispatchers dispatchers, k0 errorHandler, z1 parentJob) {
        n.f(dispatchers, "dispatchers");
        n.f(errorHandler, "errorHandler");
        n.f(parentJob, "parentJob");
        return p0.a(parentJob.plus(dispatchers.getDefault()).plus(new n0(ServiceProvider.NAMED_LOAD_SCOPE)).plus(errorHandler));
    }

    public final j0 mainDispatcher() {
        return f1.c();
    }

    public final MeasurementsService measurementService(Context context, ISDKDispatchers dispatchers) {
        n.f(context, "context");
        n.f(dispatchers, "dispatchers");
        return new MeasurementsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final f<ByteStringStoreOuterClass.ByteStringStore> nativeConfigurationDataStore(Context context, j0 dispatcher) {
        n.f(context, "context");
        n.f(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    public final o0 omidCoroutineScope(ISDKDispatchers dispatchers, k0 errorHandler, z1 parentJob) {
        n.f(dispatchers, "dispatchers");
        n.f(errorHandler, "errorHandler");
        n.f(parentJob, "parentJob");
        return p0.a(parentJob.plus(dispatchers.getDefault()).plus(new n0(ServiceProvider.NAMED_OMID_SCOPE)).plus(errorHandler));
    }

    public final f<ByteStringStoreOuterClass.ByteStringStore> privacyDataStore(Context context, j0 dispatcher) {
        n.f(context, "context");
        n.f(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY);
    }

    public final f<ByteStringStoreOuterClass.ByteStringStore> privacyFsmDataStore(Context context, j0 dispatcher) {
        n.f(context, "context");
        n.f(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    public final z1 publicApiJob(DiagnosticEventRepository diagnosticEventRepository) {
        z b10;
        n.f(diagnosticEventRepository, "diagnosticEventRepository");
        b10 = e2.b(null, 1, null);
        b10.K(new UnityAdsModule$publicApiJob$1$1(diagnosticEventRepository));
        return b10;
    }

    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    public final o0 scarSignalsCoroutineScope(ISDKDispatchers dispatchers, k0 errorHandler, z1 parentJob) {
        n.f(dispatchers, "dispatchers");
        n.f(errorHandler, "errorHandler");
        n.f(parentJob, "parentJob");
        return p0.a(parentJob.plus(dispatchers.getDefault()).plus(new n0(ServiceProvider.NAMED_SCAR_SCOPE)).plus(errorHandler));
    }

    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        n.e(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    public final o0 showCoroutineScope(ISDKDispatchers dispatchers, k0 errorHandler, z1 parentJob) {
        n.f(dispatchers, "dispatchers");
        n.f(errorHandler, "errorHandler");
        n.f(parentJob, "parentJob");
        return p0.a(parentJob.plus(dispatchers.getDefault()).plus(new n0(ServiceProvider.NAMED_SHOW_SCOPE)).plus(errorHandler));
    }

    public final TopicsService topicsService(Context context, ISDKDispatchers dispatchers) {
        n.f(context, "context");
        n.f(dispatchers, "dispatchers");
        return new TopicsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final o0 transactionCoroutineScope(ISDKDispatchers dispatchers, k0 errorHandler, z1 parentJob) {
        n.f(dispatchers, "dispatchers");
        n.f(errorHandler, "errorHandler");
        n.f(parentJob, "parentJob");
        return p0.a(parentJob.plus(dispatchers.getDefault()).plus(new n0(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(errorHandler));
    }

    public final f<UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestDataStore(Context context, j0 dispatcher) {
        n.f(context, "context");
        n.f(dispatcher, "dispatcher");
        return g.b(g.f4865a, new UniversalRequestStoreSerializer(), null, null, p0.a(dispatcher.plus(u2.b(null, 1, null))), new UnityAdsModule$universalRequestDataStore$1(context), 4, null);
    }

    public final VolumeChangeMonitor volumeChangeMonitor(VolumeChange volumeChange) {
        n.f(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    public final f<WebviewConfigurationStore.WebViewConfigurationStore> webViewConfigurationDataStore(Context context, j0 dispatcher) {
        n.f(context, "context");
        n.f(dispatcher, "dispatcher");
        return g.b(g.f4865a, new WebViewConfigurationStoreSerializer(), null, null, p0.a(dispatcher.plus(u2.b(null, 1, null))), new UnityAdsModule$webViewConfigurationDataStore$1(context), 4, null);
    }

    public final ByteStringDataSource iapTransactionDataStore(f<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        n.f(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource nativeConfigurationDataStore(f<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        n.f(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyDataStore(f<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        n.f(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyFsmDataStore(f<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        n.f(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource glInfoDataStore(f<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        n.f(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }
}
