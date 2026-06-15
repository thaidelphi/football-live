package com.unity3d.services.core.di;

import android.content.Context;
import b0.d;
import b0.f;
import com.ironsource.j3;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.CommonGetWebViewCacheAssetLoader;
import com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.ClearCache;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonClearCache;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import d9.i;
import d9.j0;
import d9.k0;
import d9.o0;
import d9.z1;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import i8.h;
import i8.w;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import t8.a;
import t8.l;
import t8.p;
/* compiled from: ServiceProvider.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class ServiceProvider$initialize$1 extends o implements l<ServicesRegistry, w> {
    public static final ServiceProvider$initialize$1 INSTANCE = new ServiceProvider$initialize$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass1 extends o implements a<Context> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final Context invoke() {
            return ClientProperties.getApplicationContext();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$10  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass10 extends o implements a<o0> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final o0 invoke() {
            return this.$moduleInstance.transactionCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (k0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, b0.b(k0.class))), (z1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, b0.b(z1.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$100  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass100 extends o implements a<GetHbTokenEventRequest> {
        public static final AnonymousClass100 INSTANCE = new AnonymousClass100();

        AnonymousClass100() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetHbTokenEventRequest invoke() {
            return new GetAndroidTokenEventRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$101  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass101 extends o implements a<CommonScarEventReceiver> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass101(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final CommonScarEventReceiver invoke() {
            return new CommonScarEventReceiver((o0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, b0.b(o0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$102  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass102 extends o implements a<GMAScarAdapterBridge> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass102(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GMAScarAdapterBridge invoke() {
            GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", b0.b(CommonScarEventReceiver.class))))).getBridge();
            n.e(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
            return bridge;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$103  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass103 extends o implements a<ScarTimeHackFixer> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass103(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ScarTimeHackFixer invoke() {
            return new ScarTimeHackFixer((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$104  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass104 extends o implements a<ScarManager> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass104(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ScarManager invoke() {
            return new AndroidScarManager((CommonScarEventReceiver) this.$this_registry.resolveService(new ServiceKey("", b0.b(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) this.$this_registry.resolveService(new ServiceKey("", b0.b(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) this.$this_registry.resolveService(new ServiceKey("", b0.b(ScarTimeHackFixer.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$105  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass105 extends o implements a<FetchSignalsAndSendUseCase> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass105(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final FetchSignalsAndSendUseCase invoke() {
            return new AndroidFetchSignalsAndSendUseCase((o0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, b0.b(o0.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(ScarManager.class))), (HandleGetTokenRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(HandleGetTokenRequest.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$106  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass106 extends o implements a<LoadScarAd> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass106(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final LoadScarAd invoke() {
            return new LoadScarAd((ScarManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(ScarManager.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$107  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass107 extends o implements a<HandleGetTokenRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass107(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final HandleGetTokenRequest invoke() {
            return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetHbTokenEventRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, b0.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(GatewayClient.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$108  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass108 extends o implements a<GetClientInfo> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass108(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetClientInfo invoke() {
            return new AndroidGetClientInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(MediationRepository.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(OmidManager.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(ScarManager.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$109  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass109 extends o implements a<GetInitializationCompletedRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass109(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetInitializationCompletedRequest invoke() {
            return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$11  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass11 extends o implements a<o0> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass11(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final o0 invoke() {
            return this.$moduleInstance.getTokenCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (k0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, b0.b(k0.class))), (z1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, b0.b(z1.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$110  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass110 extends o implements a<GetInitializationRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass110(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetInitializationRequest invoke() {
            return new AndroidGetInitializationRequest((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestForPayLoad.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$111  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass111 extends o implements a<GetLimitedSessionToken> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass111(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetLimitedSessionToken invoke() {
            return new AndroidGetLimitedSessionToken((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(MediationRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$112  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass112 extends o implements a<GetOpenGLRendererInfo> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass112(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetOpenGLRendererInfo invoke() {
            return new AndroidGetOpenGLRendererInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$113  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass113 extends o implements a<GetSharedDataTimestamps> {
        public static final AnonymousClass113 INSTANCE = new AnonymousClass113();

        AnonymousClass113() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetSharedDataTimestamps invoke() {
            return new AndroidGetSharedDataTimestamps();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$114  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass114 extends o implements a<GetUniversalRequestForPayLoad> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass114(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetUniversalRequestForPayLoad invoke() {
            return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestSharedData.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$115  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass115 extends o implements a<GetUniversalRequestSharedData> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass115(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetUniversalRequestSharedData invoke() {
            return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetSharedDataTimestamps.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetLimitedSessionToken.class))), (DeveloperConsentRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeveloperConsentRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$116  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass116 extends o implements a<GetCachedAsset> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass116(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetCachedAsset invoke() {
            return new GetCachedAsset((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(CacheRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$117  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass117 extends o implements a<GetWebViewBridgeUseCase> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass117(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetWebViewBridgeUseCase invoke() {
            return new CommonGetWebViewBridgeUseCase((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$118  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass118 extends o implements a<GetRequestPolicy> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass118(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetRequestPolicy invoke() {
            return new GetInitRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$119  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass119 extends o implements a<GetLatestWebViewConfiguration> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass119(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetLatestWebViewConfiguration invoke() {
            return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(WebviewConfigurationDataSource.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$12  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass12 extends o implements a<o0> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass12(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final o0 invoke() {
            return this.$moduleInstance.scarSignalsCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (k0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, b0.b(k0.class))), (z1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, b0.b(z1.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$120  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass120 extends o implements a<GetRequestPolicy> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass120(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetRequestPolicy invoke() {
            return new GetOperativeEventRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$121  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass121 extends o implements a<GetRequestPolicy> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass121(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetRequestPolicy invoke() {
            return new GetOtherRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$122  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass122 extends o implements a<GetPrivacyUpdateRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass122(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetPrivacyUpdateRequest invoke() {
            return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestForPayLoad.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$123  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass123 extends o implements a<HandleGatewayInitializationResponse> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass123(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final HandleGatewayInitializationResponse invoke() {
            return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(TriggerInitializationCompletedRequest.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (o0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, b0.b(o0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$124  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass124 extends o implements a<HandleGatewayUniversalResponse> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass124(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final HandleGatewayUniversalResponse invoke() {
            return new AndroidHandleGatewayUniversalResponse((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$125  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass125 extends o implements a<InitializeBoldSDK> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass125(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeBoldSDK invoke() {
            return new AndroidInitializeBoldSDK((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))), (InitializeOMSDK) this.$this_registry.resolveService(new ServiceKey("", b0.b(InitializeOMSDK.class))), (GetInitializationRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetInitializationRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, b0.b(GetRequestPolicy.class))), (ClearCache) this.$this_registry.resolveService(new ServiceKey("", b0.b(ClearCache.class))), (HandleGatewayInitializationResponse) this.$this_registry.resolveService(new ServiceKey("", b0.b(HandleGatewayInitializationResponse.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(GatewayClient.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (EventObservers) this.$this_registry.resolveService(new ServiceKey("", b0.b(EventObservers.class))), (TriggerInitializeListener) this.$this_registry.resolveService(new ServiceKey("", b0.b(TriggerInitializeListener.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DiagnosticEventRepository.class))), (StorageManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(StorageManager.class))), (ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", b0.b(ConfigurationReader.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(SDKPropertiesManager.class))), (GetGameId) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetGameId.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$126  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass126 extends o implements a<LegacyShowUseCase> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass126(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final LegacyShowUseCase invoke() {
            return new LegacyShowUseCase((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, b0.b(j0.class))), (Show) this.$this_registry.resolveService(new ServiceKey("", b0.b(Show.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetOperativeEventApi.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetInitializationState.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$127  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass127 extends o implements a<SendPrivacyUpdateRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass127(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final SendPrivacyUpdateRequest invoke() {
            return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, b0.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(GatewayClient.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$128  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass128 extends o implements a<TriggerInitializationCompletedRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass128(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final TriggerInitializationCompletedRequest invoke() {
            return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetInitializationCompletedRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, b0.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(GatewayClient.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$129  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass129 extends o implements a<TriggerInitializeListener> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass129(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final TriggerInitializeListener invoke() {
            return new TriggerInitializeListener((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, b0.b(j0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$13  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass13 extends o implements a<o0> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass13(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final o0 invoke() {
            return this.$moduleInstance.omidCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (k0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, b0.b(k0.class))), (z1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, b0.b(z1.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$130  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass130 extends o implements a<DiagnosticEventObserver> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass130(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final DiagnosticEventObserver invoke() {
            return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetDiagnosticEventBatchRequest.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DiagnosticEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", b0.b(BackgroundWorker.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$131  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass131 extends o implements a<EventObservers> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass131(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final EventObservers invoke() {
            return new EventObservers((OperativeEventObserver) this.$this_registry.resolveService(new ServiceKey("", b0.b(OperativeEventObserver.class))), (DiagnosticEventObserver) this.$this_registry.resolveService(new ServiceKey("", b0.b(DiagnosticEventObserver.class))), (TransactionEventObserver) this.$this_registry.resolveService(new ServiceKey("", b0.b(TransactionEventObserver.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$132  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass132 extends o implements a<GetTransactionData> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass132(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetTransactionData invoke() {
            return new AndroidGetTransactionData((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetByteStringId.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$133  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass133 extends o implements a<GetTransactionRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass133(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetTransactionRequest invoke() {
            return new CommonGetTransactionRequest((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$134  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass134 extends o implements a<GetDiagnosticEventBatchRequest> {
        public static final AnonymousClass134 INSTANCE = new AnonymousClass134();

        AnonymousClass134() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetDiagnosticEventBatchRequest invoke() {
            return new GetDiagnosticEventBatchRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$135  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass135 extends o implements a<GetDiagnosticEventRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass135(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetDiagnosticEventRequest invoke() {
            return new GetDiagnosticEventRequest((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetSharedDataTimestamps.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$136  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass136 extends o implements a<GetOperativeEventApi> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass136(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetOperativeEventApi invoke() {
            return new GetOperativeEventApi((OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(OperativeEventRepository.class))), (GetOperativeEventRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetOperativeEventRequest.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$137  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass137 extends o implements a<GetOperativeEventRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass137(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetOperativeEventRequest invoke() {
            return new GetOperativeEventRequest((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetByteStringId.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(CampaignRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$138  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass138 extends o implements a<HandleGatewayEventResponse> {
        public static final AnonymousClass138 INSTANCE = new AnonymousClass138();

        AnonymousClass138() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final HandleGatewayEventResponse invoke() {
            return new AndroidHandleGatewayEventResponse();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$139  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass139 extends o implements a<OperativeEventObserver> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass139(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final OperativeEventObserver invoke() {
            return new OperativeEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestForPayLoad.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))), (OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(OperativeEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", b0.b(BackgroundWorker.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$14  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass14 extends o implements a<z1> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass14(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final z1 invoke() {
            return this.$moduleInstance.publicApiJob((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DiagnosticEventRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$140  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass140 extends o implements a<TransactionEventObserver> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass140(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final TransactionEventObserver invoke() {
            return new TransactionEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestForPayLoad.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(TransactionEventRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, b0.b(GetRequestPolicy.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, b0.b(ByteStringDataSource.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$141  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass141 extends o implements a<UniversalRequestTtlValidator> {
        public static final AnonymousClass141 INSTANCE = new AnonymousClass141();

        AnonymousClass141() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final UniversalRequestTtlValidator invoke() {
            return new CommonUniversalRequestTtlValidator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$142  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass142 extends o implements a<UniversalRequestEventSender> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass142(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final UniversalRequestEventSender invoke() {
            return new UniversalRequestEventSender((GatewayClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", b0.b(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey("", b0.b(UniversalRequestTtlValidator.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$143  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass143 extends o implements a<OmFinishSession> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass143(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final OmFinishSession invoke() {
            return new AndroidOmFinishSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$144  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass144 extends o implements a<OmImpressionOccurred> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass144(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final OmImpressionOccurred invoke() {
            return new AndroidOmImpressionOccurred((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$145  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass145 extends o implements a<AndroidOmInteraction> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass145(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AndroidOmInteraction invoke() {
            return new AndroidOmStartSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$146  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass146 extends o implements a<GetOmData> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass146(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetOmData invoke() {
            return new CommonGetOmData((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(OpenMeasurementRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$147  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass147 extends o implements a<IsOMActivated> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass147(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final IsOMActivated invoke() {
            return new CommonIsOMActivated((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(OpenMeasurementRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$148  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass148 extends o implements a<InitializeOMSDK> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass148(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeOMSDK invoke() {
            return new AndroidInitializeOMSDK((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(OpenMeasurementRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$149  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass149 extends o implements a<FlattenerRulesUseCase> {
        public static final AnonymousClass149 INSTANCE = new AnonymousClass149();

        AnonymousClass149() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final FlattenerRulesUseCase invoke() {
            return new DeveloperConsentFlattenerRulesUseCase();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$15  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass15 extends o implements a<ByteStringDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass15(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ByteStringDataSource invoke() {
            return new AndroidLegacyConfigStoreDataSource((StorageManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(StorageManager.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$150  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass150 extends o implements a<FlattenerRulesUseCase> {
        public static final AnonymousClass150 INSTANCE = new AnonymousClass150();

        AnonymousClass150() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final FlattenerRulesUseCase invoke() {
            return new LegacyUserConsentFlattenerRulesUseCase();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$151  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass151 extends o implements a<BackgroundWorker> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass151(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final BackgroundWorker invoke() {
            return new BackgroundWorker((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$152  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass152 extends o implements a<DiagnosticEventRequestWorkModifier> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass152(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final DiagnosticEventRequestWorkModifier invoke() {
            return new DiagnosticEventRequestWorkModifier((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(LifecycleDataSource.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$153  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass153 extends o implements a<GatewayClient> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass153(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GatewayClient invoke() {
            return new CommonGatewayClient((HttpClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(HttpClient.class))), (HandleGatewayUniversalResponse) this.$this_registry.resolveService(new ServiceKey("", b0.b(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$154  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass154 extends o implements a<k0> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass154(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final k0 invoke() {
            return new SDKErrorHandler((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", b0.b(AlternativeFlowReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", b0.b(SDKMetricsSender.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$155  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass155 extends o implements a<TokenStorage> {
        public static final AnonymousClass155 INSTANCE = new AnonymousClass155();

        AnonymousClass155() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final TokenStorage invoke() {
            return new InMemoryTokenStorage();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$156  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass156 extends o implements a<VolumeChange> {
        public static final AnonymousClass156 INSTANCE = new AnonymousClass156();

        AnonymousClass156() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final VolumeChange invoke() {
            return new VolumeChangeContentObserver();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$157  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass157 extends o implements a<ConfigFileFromLocalStorage> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass157(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ConfigFileFromLocalStorage invoke() {
            return new ConfigFileFromLocalStorage((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$158  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass158 extends o implements a<InitializeSDK> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass158(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeSDK invoke() {
            return new InitializeSDK((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", b0.b(ConfigFileFromLocalStorage.class))), (InitializeStateReset) this.$this_registry.resolveService(new ServiceKey("", b0.b(InitializeStateReset.class))), (InitializeStateError) this.$this_registry.resolveService(new ServiceKey("", b0.b(InitializeStateError.class))), (InitializeStateConfig) this.$this_registry.resolveService(new ServiceKey("", b0.b(InitializeStateConfig.class))), (InitializeStateCreate) this.$this_registry.resolveService(new ServiceKey("", b0.b(InitializeStateCreate.class))), (InitializeStateLoadCache) this.$this_registry.resolveService(new ServiceKey("", b0.b(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) this.$this_registry.resolveService(new ServiceKey("", b0.b(InitializeStateLoadWeb.class))), (InitializeStateComplete) this.$this_registry.resolveService(new ServiceKey("", b0.b(InitializeStateComplete.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$159  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass159 extends o implements a<InitializeStateComplete> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass159(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeStateComplete invoke() {
            return new InitializeStateComplete((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$16  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass16 extends o implements a<f<ByteStringStoreOuterClass.ByteStringStore>> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass16(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final f<ByteStringStoreOuterClass.ByteStringStore> invoke() {
            return this.$moduleInstance.privacyDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$160  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass160 extends o implements a<InitializeStateConfig> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass160(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeStateConfig invoke() {
            return new InitializeStateConfig((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) this.$this_registry.resolveService(new ServiceKey("", b0.b(InitializeStateConfigWithLoader.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$161  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass161 extends o implements a<InitializeStateConfigWithLoader> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass161(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeStateConfigWithLoader invoke() {
            return new InitializeStateConfigWithLoader((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", b0.b(InitializeStateNetworkError.class))), (TokenStorage) this.$this_registry.resolveService(new ServiceKey("", b0.b(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", b0.b(SDKMetricsSender.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$162  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass162 extends o implements a<InitializeStateCreate> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass162(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeStateCreate invoke() {
            return new InitializeStateCreate((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$163  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass163 extends o implements a<InitializeStateError> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass163(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeStateError invoke() {
            return new InitializeStateError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$164  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass164 extends o implements a<InitializeStateLoadCache> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass164(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeStateLoadCache invoke() {
            return new InitializeStateLoadCache((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$165  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass165 extends o implements a<InitializeStateLoadWeb> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass165(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeStateLoadWeb invoke() {
            return new InitializeStateLoadWeb((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", b0.b(InitializeStateNetworkError.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(HttpClient.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$166  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass166 extends o implements a<InitializeStateReset> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass166(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeStateReset invoke() {
            return new InitializeStateReset((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$167  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass167 extends o implements a<StoreMonitor> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass167(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final StoreMonitor invoke() {
            return new StoreMonitor((StoreExceptionHandler) this.$this_registry.resolveService(new ServiceKey("", b0.b(StoreExceptionHandler.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$168  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass168 extends o implements a<StoreWebViewEventSender> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass168(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final StoreWebViewEventSender invoke() {
            return new StoreWebViewEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", b0.b(IEventSender.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$169  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass169 extends o implements a<StoreExceptionHandler> {
        public static final AnonymousClass169 INSTANCE = new AnonymousClass169();

        AnonymousClass169() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final StoreExceptionHandler invoke() {
            return new GatewayStoreExceptionHandler();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$17  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass17 extends o implements a<ByteStringDataSource> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass17(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ByteStringDataSource invoke() {
            return this.$moduleInstance.privacyDataStore((f) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, b0.b(f.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$170  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass170 extends o implements a<StoreEventListenerFactory> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass170(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final StoreEventListenerFactory invoke() {
            return new StoreEventListenerFactory((StoreWebViewEventSender) this.$this_registry.resolveService(new ServiceKey("", b0.b(StoreWebViewEventSender.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$171  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass171 extends o implements a<ConfigurationReader> {
        public static final AnonymousClass171 INSTANCE = new AnonymousClass171();

        AnonymousClass171() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ConfigurationReader invoke() {
            return new ConfigurationReader();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$172  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass172 extends o implements a<AndroidAttribution> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass172(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AndroidAttribution invoke() {
            return new AndroidAttribution((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$173  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass173 extends o implements a<AdPlayerScope> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass173(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AdPlayerScope invoke() {
            return new AdPlayerScope((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$174  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass174 extends o implements a<AndroidWebViewClient> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass174(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AndroidWebViewClient invoke() {
            return new AndroidWebViewClient((GetWebViewCacheAssetLoader) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetWebViewCacheAssetLoader.class))), (GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetCachedAsset.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetLatestWebViewConfiguration.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$175  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass175 extends o implements a<AndroidGetWebViewContainerUseCase> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass175(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AndroidGetWebViewContainerUseCase invoke() {
            return new AndroidGetWebViewContainerUseCase((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (AndroidWebViewClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendWebViewClientErrorDiagnostics.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, b0.b(j0.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$176  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass176 extends o implements a<Load> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass176(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final Load invoke() {
            return new AndroidLoad((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))), (GetAdRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetAdRequest.class))), (GetAdPlayerConfigRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, b0.b(GetRequestPolicy.class))), (HandleGatewayAdResponse) this.$this_registry.resolveService(new ServiceKey("", b0.b(HandleGatewayAdResponse.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(GatewayClient.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(AdRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$177  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass177 extends o implements a<AwaitInitialization> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass177(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AwaitInitialization invoke() {
            return new CommonAwaitInitialization((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$178  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass178 extends o implements a<GetAsyncHeaderBiddingToken> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass178(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetAsyncHeaderBiddingToken invoke() {
            return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", b0.b(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$179  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass179 extends o implements a<GetAdPlayer> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass179(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetAdPlayer invoke() {
            return new CommonGetAdPlayer((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (ExecuteAdViewerRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(ExecuteAdViewerRequest.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))), (o0) this.$this_registry.resolveService(new ServiceKey("", b0.b(AdPlayerScope.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(OpenMeasurementRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(ScarManager.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$18  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass18 extends o implements a<f<ByteStringStoreOuterClass.ByteStringStore>> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass18(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final f<ByteStringStoreOuterClass.ByteStringStore> invoke() {
            return this.$moduleInstance.privacyFsmDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$180  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass180 extends o implements a<HandleGatewayAdResponse> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass180(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final HandleGatewayAdResponse invoke() {
            return new AndroidHandleGatewayAdResponse((AdRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(AdRepository.class))), (AndroidGetWebViewContainerUseCase) this.$this_registry.resolveService(new ServiceKey("", b0.b(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) this.$this_registry.resolveService(new ServiceKey("", b0.b(HandleInvocationsFromAdViewer.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(CampaignRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetLatestWebViewConfiguration.class))), (AdPlayerScope) this.$this_registry.resolveService(new ServiceKey("", b0.b(AdPlayerScope.class))), (GetAdPlayer) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetAdPlayer.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$181  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass181 extends o implements a<HandleInvocationsFromAdViewer> {
        public static final AnonymousClass181 INSTANCE = new AnonymousClass181();

        AnonymousClass181() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final HandleInvocationsFromAdViewer invoke() {
            return new HandleInvocationsFromAdViewer();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$182  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass182 extends o implements a<LegacyLoadUseCase> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass182(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final LegacyLoadUseCase invoke() {
            return new LegacyLoadUseCase((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, b0.b(j0.class))), (Load) this.$this_registry.resolveService(new ServiceKey("", b0.b(Load.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", b0.b(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(AdRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$183  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass183 extends o implements a<InitializeStateNetworkError> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass183(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final InitializeStateNetworkError invoke() {
            return new InitializeStateNetworkError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$184  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass184 extends o implements a<CoroutineTimer> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass184(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final CoroutineTimer invoke() {
            return new CommonCoroutineTimer((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$185  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass185 extends o implements a<IEventSender> {
        public static final AnonymousClass185 INSTANCE = new AnonymousClass185();

        AnonymousClass185() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final IEventSender invoke() {
            return SharedInstances.INSTANCE.getWebViewEventSender();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$186  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass186 extends o implements a<SetGameId> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass186(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final SetGameId invoke() {
            return new CommonSetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$187  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass187 extends o implements a<GetGameId> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass187(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetGameId invoke() {
            return new CommonGetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$188  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass188 extends o implements a<ValidateGameId> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass188(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ValidateGameId invoke() {
            return new CommonValidateGameId((GetGameId) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetGameId.class))), (SetGameId) this.$this_registry.resolveService(new ServiceKey("", b0.b(SetGameId.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$189  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass189 extends o implements a<GetWebViewCacheAssetLoader> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass189(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetWebViewCacheAssetLoader invoke() {
            return new CommonGetWebViewCacheAssetLoader((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetLatestWebViewConfiguration.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$19  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass19 extends o implements a<ByteStringDataSource> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass19(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ByteStringDataSource invoke() {
            return this.$moduleInstance.privacyFsmDataStore((f) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, b0.b(f.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$190  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass190 extends o implements a<ShouldAllowInitialization> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass190(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ShouldAllowInitialization invoke() {
            return new CommonShouldAllowInitialization((AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", b0.b(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) this.$this_registry.resolveService(new ServiceKey("", b0.b(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetInitializationState.class))), (SetInitializationState) this.$this_registry.resolveService(new ServiceKey("", b0.b(SetInitializationState.class))), (ValidateGameId) this.$this_registry.resolveService(new ServiceKey("", b0.b(ValidateGameId.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$191  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass191 extends o implements a<CheckForGameIdAndTestModeChanges> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass191(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final CheckForGameIdAndTestModeChanges invoke() {
            return new CommonCheckForGameIdAndTestModeChanges((GetGameId) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetGameId.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$192  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass192 extends o implements a<DownloadPriorityQueue> {
        public static final AnonymousClass192 INSTANCE = new AnonymousClass192();

        AnonymousClass192() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final DownloadPriorityQueue invoke() {
            return new DownloadPriorityQueue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$193  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass193 extends o implements a<CleanupDirectory> {
        public static final AnonymousClass193 INSTANCE = new AnonymousClass193();

        AnonymousClass193() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final CleanupDirectory invoke() {
            return new CleanupDirectory();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$2  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass2 extends o implements a<j0> {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final j0 invoke() {
            return this.$moduleInstance.mainDispatcher();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$20  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass20 extends o implements a<f<ByteStringStoreOuterClass.ByteStringStore>> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass20(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final f<ByteStringStoreOuterClass.ByteStringStore> invoke() {
            return this.$moduleInstance.nativeConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$21  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass21 extends o implements a<ByteStringDataSource> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass21(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ByteStringDataSource invoke() {
            return this.$moduleInstance.nativeConfigurationDataStore((f) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, b0.b(f.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$22  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass22 extends o implements a<f<ByteStringStoreOuterClass.ByteStringStore>> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass22(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final f<ByteStringStoreOuterClass.ByteStringStore> invoke() {
            return this.$moduleInstance.glInfoDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))), (d) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, b0.b(d.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$23  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass23 extends o implements a<ByteStringDataSource> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass23(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ByteStringDataSource invoke() {
            return this.$moduleInstance.glInfoDataStore((f) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, b0.b(f.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$24  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass24 extends o implements a<f<UniversalRequestStoreOuterClass.UniversalRequestStore>> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass24(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final f<UniversalRequestStoreOuterClass.UniversalRequestStore> invoke() {
            return this.$moduleInstance.universalRequestDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$25  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass25 extends o implements a<f<ByteStringStoreOuterClass.ByteStringStore>> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass25(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final f<ByteStringStoreOuterClass.ByteStringStore> invoke() {
            return this.$moduleInstance.iapTransactionDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$26  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass26 extends o implements a<ByteStringDataSource> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass26(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ByteStringDataSource invoke() {
            return this.$moduleInstance.iapTransactionDataStore((f) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, b0.b(f.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$27  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass27 extends o implements a<f<WebviewConfigurationStore.WebViewConfigurationStore>> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass27(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final f<WebviewConfigurationStore.WebViewConfigurationStore> invoke() {
            return this.$moduleInstance.webViewConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$28  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass28 extends o implements a<AsyncTokenStorage> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass28(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AsyncTokenStorage invoke() {
            return this.$moduleInstance.asyncTokenStorage((TokenStorage) this.$this_registry.resolveService(new ServiceKey("", b0.b(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", b0.b(SDKMetricsSender.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$29  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass29 extends o implements a<VolumeChangeMonitor> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass29(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final VolumeChangeMonitor invoke() {
            return this.$moduleInstance.volumeChangeMonitor((VolumeChange) this.$this_registry.resolveService(new ServiceKey("", b0.b(VolumeChange.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$3  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass3 extends o implements a<j0> {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final j0 invoke() {
            return this.$moduleInstance.defaultDispatcher();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$30  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass30 extends o implements a<JsonStorage> {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass30(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final JsonStorage invoke() {
            return this.$moduleInstance.publicJsonStorage();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$31  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass31 extends o implements a<JsonStorage> {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass31(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final JsonStorage invoke() {
            return this.$moduleInstance.privateJsonStorage();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$32  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass32 extends o implements a<NativeConfigurationOuterClass.NativeConfiguration> {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass32(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final NativeConfigurationOuterClass.NativeConfiguration invoke() {
            return this.$moduleInstance.defaultNativeConfiguration();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$33  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass33 extends o implements a<MeasurementsService> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass33(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final MeasurementsService invoke() {
            return this.$moduleInstance.measurementService((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$34  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass34 extends o implements a<TopicsService> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass34(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final TopicsService invoke() {
            return this.$moduleInstance.topicsService((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$35  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass35 extends o implements a<CronetEngineBuilderFactory> {
        public static final AnonymousClass35 INSTANCE = new AnonymousClass35();

        AnonymousClass35() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final CronetEngineBuilderFactory invoke() {
            return new CronetEngineBuilderFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$36  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass36 extends o implements a<HttpClientProvider> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass36(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final HttpClientProvider invoke() {
            return new AndroidHttpClientProvider((ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", b0.b(ConfigFileFromLocalStorage.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", b0.b(AlternativeFlowReader.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (CronetEngineBuilderFactory) this.$this_registry.resolveService(new ServiceKey("", b0.b(CronetEngineBuilderFactory.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (CleanupDirectory) this.$this_registry.resolveService(new ServiceKey("", b0.b(CleanupDirectory.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$37  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass37 extends o implements a<HttpClient> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ServiceProvider.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$37$1", f = "ServiceProvider.kt", l = {j3.a.b.f17903h}, m = "invokeSuspend")
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$37$1  reason: invalid class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<o0, m8.d<? super HttpClient>, Object> {
            final /* synthetic */ ServicesRegistry $this_registry;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ServicesRegistry servicesRegistry, m8.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$this_registry = servicesRegistry;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<w> create(Object obj, m8.d<?> dVar) {
                return new AnonymousClass1(this.$this_registry, dVar);
            }

            @Override // t8.p
            public final Object invoke(o0 o0Var, m8.d<? super HttpClient> dVar) {
                return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.label;
                if (i10 == 0) {
                    i8.p.b(obj);
                    this.label = 1;
                    obj = ((HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", b0.b(HttpClientProvider.class)))).invoke(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass37(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final HttpClient invoke() {
            return (HttpClient) i.f(null, new AnonymousClass1(this.$this_registry, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$38  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass38 extends o implements a<AlternativeFlowReader> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass38(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AlternativeFlowReader invoke() {
            return new AlternativeFlowReader((ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", b0.b(ConfigurationReader.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass39 extends o implements a<TcfDataSource> {
        public static final AnonymousClass39 INSTANCE = new AnonymousClass39();

        AnonymousClass39() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final TcfDataSource invoke() {
            return new AndroidTcfDataSource();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$4  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass4 extends o implements a<j0> {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final j0 invoke() {
            return this.$moduleInstance.ioDispatcher();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$40  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass40 extends o implements a<TcfRepository> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass40(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final TcfRepository invoke() {
            return new AndroidTcfRepository((TcfDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(TcfDataSource.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$41  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass41 extends o implements a<AndroidManifestIntPropertyReader> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass41(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AndroidManifestIntPropertyReader invoke() {
            return new AndroidManifestIntPropertyReader((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$42  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass42 extends o implements a<AndroidTestDataInfo> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass42(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AndroidTestDataInfo invoke() {
            return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) this.$this_registry.resolveService(new ServiceKey("", b0.b(AndroidManifestIntPropertyReader.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$43  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass43 extends o implements a<GameServerIdReader> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass43(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GameServerIdReader invoke() {
            return new GameServerIdReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", b0.b(JsonStorage.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$44  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass44 extends o implements a<StoreDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass44(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final StoreDataSource invoke() {
            return new AndroidStoreDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$45  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass45 extends o implements a<AnalyticsDataSource> {
        public static final AnonymousClass45 INSTANCE = new AnonymousClass45();

        AnonymousClass45() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AnalyticsDataSource invoke() {
            return new AndroidAnalyticsDataSource();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$46  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass46 extends o implements a<DeveloperConsentDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass46(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final DeveloperConsentDataSource invoke() {
            return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, b0.b(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", b0.b(JsonStorage.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$47  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass47 extends o implements a<DynamicDeviceInfoDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass47(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final DynamicDeviceInfoDataSource invoke() {
            return new AndroidDynamicDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(LifecycleDataSource.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$48  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass48 extends o implements a<LegacyUserConsentDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass48(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final LegacyUserConsentDataSource invoke() {
            return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, b0.b(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PRIVATE", b0.b(JsonStorage.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$49  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass49 extends o implements a<LifecycleDataSource> {
        public static final AnonymousClass49 INSTANCE = new AnonymousClass49();

        AnonymousClass49() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final LifecycleDataSource invoke() {
            return new AndroidLifecycleDataSource();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$5  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass5 extends o implements a<ISDKDispatchers> {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ISDKDispatchers invoke() {
            return this.$moduleInstance.sdkDispatchers();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$50  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass50 extends o implements a<CacheDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass50(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final CacheDataSource invoke() {
            return new AndroidLocalCacheDataSource((CreateFile) this.$this_registry.resolveService(new ServiceKey("", b0.b(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetFileExtensionFromUrl.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$51  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass51 extends o implements a<CreateFile> {
        public static final AnonymousClass51 INSTANCE = new AnonymousClass51();

        AnonymousClass51() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final CreateFile invoke() {
            return new CommonCreateFile();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$52  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass52 extends o implements a<GetFileExtensionFromUrl> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass52(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetFileExtensionFromUrl invoke() {
            return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) this.$this_registry.resolveService(new ServiceKey("", b0.b(RemoveUrlQuery.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$53  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass53 extends o implements a<RemoveUrlQuery> {
        public static final AnonymousClass53 INSTANCE = new AnonymousClass53();

        AnonymousClass53() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final RemoveUrlQuery invoke() {
            return new AndroidRemoveUrlQuery();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$54  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass54 extends o implements a<MediationDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass54(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final MediationDataSource invoke() {
            return new AndroidMediationDataSource((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", b0.b(JsonStorage.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$55  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass55 extends o implements a<PrivacyDeviceInfoDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass55(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final PrivacyDeviceInfoDataSource invoke() {
            return new AndroidPrivacyDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$56  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass56 extends o implements a<CacheDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass56(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final CacheDataSource invoke() {
            return new AndroidRemoteCacheDataSource((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", b0.b(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetFileExtensionFromUrl.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(HttpClient.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$57  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass57 extends o implements a<StaticDeviceInfoDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass57(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final StaticDeviceInfoDataSource invoke() {
            return new AndroidStaticDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, b0.b(ByteStringDataSource.class))), (AnalyticsDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(AnalyticsDataSource.class))), (StoreDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(StoreDataSource.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$58  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass58 extends o implements a<d<ByteStringStoreOuterClass.ByteStringStore>> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass58(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final d<ByteStringStoreOuterClass.ByteStringStore> invoke() {
            return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetOpenGLRendererInfo.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$59  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass59 extends o implements a<UniversalRequestDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass59(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final UniversalRequestDataSource invoke() {
            return new UniversalRequestDataSource((f) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, b0.b(f.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$6  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass6 extends o implements a<SDKMetricsSender> {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final SDKMetricsSender invoke() {
            return this.$moduleInstance.sdkMetrics();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$60  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass60 extends o implements a<WebviewConfigurationDataSource> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass60(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final WebviewConfigurationDataSource invoke() {
            return new WebviewConfigurationDataSource((f) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, b0.b(f.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$61  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass61 extends o implements a<OmidManager> {
        public static final AnonymousClass61 INSTANCE = new AnonymousClass61();

        AnonymousClass61() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final OmidManager invoke() {
            return new AndroidOmidManager();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$62  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass62 extends o implements a<SDKPropertiesManager> {
        public static final AnonymousClass62 INSTANCE = new AnonymousClass62();

        AnonymousClass62() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final SDKPropertiesManager invoke() {
            return new AndroidSDKPropertiesManager();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$63  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass63 extends o implements a<StorageManager> {
        public static final AnonymousClass63 INSTANCE = new AnonymousClass63();

        AnonymousClass63() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final StorageManager invoke() {
            return new AndroidStorageManager();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$64  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass64 extends o implements a<TransactionEventManager> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass64(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final TransactionEventManager invoke() {
            return new TransactionEventManager((o0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, b0.b(o0.class))), (StoreMonitor) this.$this_registry.resolveService(new ServiceKey("", b0.b(StoreMonitor.class))), (GetTransactionData) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetTransactionData.class))), (GetTransactionRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetTransactionRequest.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(TransactionEventRepository.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, b0.b(ByteStringDataSource.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$65  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass65 extends o implements a<AdRepository> {
        public static final AnonymousClass65 INSTANCE = new AnonymousClass65();

        AnonymousClass65() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AdRepository invoke() {
            return new AndroidAdRepository();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$66  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass66 extends o implements a<CacheRepository> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass66(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final CacheRepository invoke() {
            return new AndroidCacheRepository((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))), (GetCacheDirectory) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetCacheDirectory.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_LOCAL, b0.b(CacheDataSource.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, b0.b(CacheDataSource.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (CleanupDirectory) this.$this_registry.resolveService(new ServiceKey("", b0.b(CleanupDirectory.class))), (DownloadPriorityQueue) this.$this_registry.resolveService(new ServiceKey("", b0.b(DownloadPriorityQueue.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$67  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass67 extends o implements a<GetCacheDirectory> {
        public static final AnonymousClass67 INSTANCE = new AnonymousClass67();

        AnonymousClass67() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetCacheDirectory invoke() {
            return new CommonGetCacheDirectory();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$68  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass68 extends o implements a<CampaignRepository> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass68(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final CampaignRepository invoke() {
            return new AndroidCampaignRepository((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetSharedDataTimestamps.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$69  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass69 extends o implements a<DeveloperConsentRepository> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass69(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final DeveloperConsentRepository invoke() {
            return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeveloperConsentDataSource.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$7  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass7 extends o implements a<o0> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final o0 invoke() {
            return this.$moduleInstance.initCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (k0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, b0.b(k0.class))), (z1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, b0.b(z1.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$70  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass70 extends o implements a<DeviceInfoRepository> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass70(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final DeviceInfoRepository invoke() {
            return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(PrivacyDeviceInfoDataSource.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$71  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass71 extends o implements a<DiagnosticEventRepository> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass71(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final DiagnosticEventRepository invoke() {
            return new AndroidDiagnosticEventRepository((CoroutineTimer) this.$this_registry.resolveService(new ServiceKey("", b0.b(CoroutineTimer.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetDiagnosticEventRequest.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$72  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass72 extends o implements a<LegacyUserConsentRepository> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass72(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final LegacyUserConsentRepository invoke() {
            return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(LegacyUserConsentDataSource.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$73  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass73 extends o implements a<MediationRepository> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass73(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final MediationRepository invoke() {
            return new AndroidMediationRepository((MediationDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(MediationDataSource.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$74  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass74 extends o implements a<OpenMeasurementRepository> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass74(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final OpenMeasurementRepository invoke() {
            return new AndroidOpenMeasurementRepository((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, b0.b(j0.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(OmidManager.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$75  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass75 extends o implements a<SessionRepository> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass75(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final SessionRepository invoke() {
            return new AndroidSessionRepository((ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, b0.b(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, b0.b(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, b0.b(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, b0.b(ByteStringDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) this.$this_registry.resolveService(new ServiceKey("", b0.b(NativeConfigurationOuterClass.NativeConfiguration.class))), (j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$76  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass76 extends o implements a<TransactionEventRepository> {
        public static final AnonymousClass76 INSTANCE = new AnonymousClass76();

        AnonymousClass76() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final TransactionEventRepository invoke() {
            return new AndroidTransactionEventRepository();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$77  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass77 extends o implements a<OperativeEventRepository> {
        public static final AnonymousClass77 INSTANCE = new AnonymousClass77();

        AnonymousClass77() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final OperativeEventRepository invoke() {
            return new OperativeEventRepository();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$78  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass78 extends o implements a<ExecuteAdViewerRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass78(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ExecuteAdViewerRequest invoke() {
            return new AndroidExecuteAdViewerRequest((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(HttpClient.class))), (GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetCachedAsset.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$79  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass79 extends o implements a<GetByteStringId> {
        public static final AnonymousClass79 INSTANCE = new AnonymousClass79();

        AnonymousClass79() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetByteStringId invoke() {
            return new AndroidGenerateByteStringId();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$8  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass8 extends o implements a<o0> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final o0 invoke() {
            return this.$moduleInstance.loadCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (k0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, b0.b(k0.class))), (z1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, b0.b(z1.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$80  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass80 extends o implements a<HandleOpenUrl> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass80(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final HandleOpenUrl invoke() {
            return new AndroidHandleOpenUrl((Context) this.$this_registry.resolveService(new ServiceKey("", b0.b(Context.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$81  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass81 extends o implements a<Refresh> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass81(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final Refresh invoke() {
            return new AndroidRefresh((j0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class))), (GetAdDataRefreshRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetAdDataRefreshRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, b0.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", b0.b(GatewayClient.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$82  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass82 extends o implements a<SendDiagnosticEvent> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass82(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final SendDiagnosticEvent invoke() {
            return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetDiagnosticEventRequest.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$83  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass83 extends o implements a<SendWebViewClientErrorDiagnostics> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass83(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final SendWebViewClientErrorDiagnostics invoke() {
            return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$84  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass84 extends o implements a<Show> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass84(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final Show invoke() {
            return new AndroidShow((AdRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(AdRepository.class))), (GameServerIdReader) this.$this_registry.resolveService(new ServiceKey("", b0.b(GameServerIdReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$85  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass85 extends o implements a<CacheFile> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass85(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final CacheFile invoke() {
            return new CommonCacheFile((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$86  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass86 extends o implements a<ClearCache> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass86(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final ClearCache invoke() {
            return new CommonClearCache((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$87  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass87 extends o implements a<GetAdObject> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass87(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetAdObject invoke() {
            return new CommonGetAdObject((AdRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(AdRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$88  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass88 extends o implements a<GetHeaderBiddingToken> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass88(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetHeaderBiddingToken invoke() {
            return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey("", b0.b(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) this.$this_registry.resolveService(new ServiceKey("", b0.b(FetchSignalsAndSendUseCase.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$89  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass89 extends o implements a<BuildHeaderBiddingToken> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass89(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final BuildHeaderBiddingToken invoke() {
            return new AndroidBuildHeaderBiddingToken((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetByteStringId.class))), (GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetClientInfo.class))), (GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetLimitedSessionToken.class))), (GetInitializationData) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetInitializationData.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(CampaignRepository.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(TcfRepository.class))), (AndroidTestDataInfo) this.$this_registry.resolveService(new ServiceKey("", b0.b(AndroidTestDataInfo.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$9  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass9 extends o implements a<o0> {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final o0 invoke() {
            return this.$moduleInstance.showCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", b0.b(ISDKDispatchers.class))), (k0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, b0.b(k0.class))), (z1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, b0.b(z1.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$90  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass90 extends o implements a<GetInitializationData> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass90(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetInitializationData invoke() {
            return new AndroidGetInitializationData((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestSharedData.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$91  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass91 extends o implements a<GetInitializationRequestPayload> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass91(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetInitializationRequestPayload invoke() {
            return new AndroidGetInitializationRequestPayload((GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetClientInfo.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))), (LegacyUserConsentRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(LegacyUserConsentRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$92  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass92 extends o implements a<GetInitializationState> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass92(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetInitializationState invoke() {
            return new CommonGetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(SDKPropertiesManager.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$93  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass93 extends o implements a<GetIsFileCache> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass93(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetIsFileCache invoke() {
            return new CommonGetIsFileCache((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", b0.b(SendDiagnosticEvent.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$94  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass94 extends o implements a<SetInitializationState> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass94(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final SetInitializationState invoke() {
            return new CommonSetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", b0.b(SDKPropertiesManager.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$95  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass95 extends o implements a<GetRequestPolicy> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass95(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetRequestPolicy invoke() {
            return new AndroidGetAdRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$96  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass96 extends o implements a<GetAdDataRefreshRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass96(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetAdDataRefreshRequest invoke() {
            return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(CampaignRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$97  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass97 extends o implements a<GetAdPlayerConfigRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass97(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetAdPlayerConfigRequest invoke() {
            return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestForPayLoad.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$98  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass98 extends o implements a<AndroidGetAdPlayerContext> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass98(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final AndroidGetAdPlayerContext invoke() {
            return new AndroidGetAdPlayerContext((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ServiceProvider.kt */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$99  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass99 extends o implements a<GetAdRequest> {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass99(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final GetAdRequest invoke() {
            return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", b0.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(CampaignRepository.class))), (WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", b0.b(WebviewConfigurationDataSource.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", b0.b(TcfRepository.class))));
        }
    }

    ServiceProvider$initialize$1() {
        super(1);
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ w invoke(ServicesRegistry servicesRegistry) {
        invoke2(servicesRegistry);
        return w.f26638a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ServicesRegistry registry) {
        n.f(registry, "$this$registry");
        UnityAdsModule unityAdsModule = new UnityAdsModule();
        registry.updateService(new ServiceKey("", b0.b(Context.class)), h.b(AnonymousClass1.INSTANCE));
        registry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, b0.b(j0.class)), h.b(new AnonymousClass2(unityAdsModule)));
        registry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, b0.b(j0.class)), h.b(new AnonymousClass3(unityAdsModule)));
        registry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, b0.b(j0.class)), h.b(new AnonymousClass4(unityAdsModule)));
        registry.updateService(new ServiceKey("", b0.b(ISDKDispatchers.class)), h.b(new AnonymousClass5(unityAdsModule)));
        registry.updateService(new ServiceKey("", b0.b(SDKMetricsSender.class)), h.b(new AnonymousClass6(unityAdsModule)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, b0.b(o0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass7(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, b0.b(o0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass8(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, b0.b(o0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass9(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, b0.b(o0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass10(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, b0.b(o0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass11(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, b0.b(o0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass12(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, b0.b(o0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass13(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, b0.b(z1.class)), ServiceFactoryKt.factoryOf(new AnonymousClass14(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, b0.b(ByteStringDataSource.class)), h.b(new AnonymousClass15(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, b0.b(f.class)), h.b(new AnonymousClass16(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, b0.b(ByteStringDataSource.class)), h.b(new AnonymousClass17(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, b0.b(f.class)), h.b(new AnonymousClass18(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, b0.b(ByteStringDataSource.class)), h.b(new AnonymousClass19(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, b0.b(f.class)), h.b(new AnonymousClass20(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, b0.b(ByteStringDataSource.class)), h.b(new AnonymousClass21(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, b0.b(f.class)), h.b(new AnonymousClass22(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, b0.b(ByteStringDataSource.class)), h.b(new AnonymousClass23(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, b0.b(f.class)), h.b(new AnonymousClass24(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, b0.b(f.class)), h.b(new AnonymousClass25(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, b0.b(ByteStringDataSource.class)), h.b(new AnonymousClass26(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, b0.b(f.class)), h.b(new AnonymousClass27(unityAdsModule, registry)));
        registry.updateService(new ServiceKey("", b0.b(AsyncTokenStorage.class)), h.b(new AnonymousClass28(unityAdsModule, registry)));
        registry.updateService(new ServiceKey("", b0.b(VolumeChangeMonitor.class)), h.b(new AnonymousClass29(unityAdsModule, registry)));
        registry.updateService(new ServiceKey("PUBLIC", b0.b(JsonStorage.class)), h.b(new AnonymousClass30(unityAdsModule)));
        registry.updateService(new ServiceKey("PRIVATE", b0.b(JsonStorage.class)), h.b(new AnonymousClass31(unityAdsModule)));
        registry.updateService(new ServiceKey("", b0.b(NativeConfigurationOuterClass.NativeConfiguration.class)), h.b(new AnonymousClass32(unityAdsModule)));
        registry.updateService(new ServiceKey("", b0.b(MeasurementsService.class)), h.b(new AnonymousClass33(unityAdsModule, registry)));
        registry.updateService(new ServiceKey("", b0.b(TopicsService.class)), h.b(new AnonymousClass34(unityAdsModule, registry)));
        registry.updateService(new ServiceKey("", b0.b(CronetEngineBuilderFactory.class)), h.b(AnonymousClass35.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(HttpClientProvider.class)), h.b(new AnonymousClass36(registry)));
        registry.updateService(new ServiceKey("", b0.b(HttpClient.class)), h.b(new AnonymousClass37(registry)));
        registry.updateService(new ServiceKey("", b0.b(AlternativeFlowReader.class)), h.b(new AnonymousClass38(registry)));
        registry.updateService(new ServiceKey("", b0.b(TcfDataSource.class)), h.b(AnonymousClass39.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(TcfRepository.class)), h.b(new AnonymousClass40(registry)));
        registry.updateService(new ServiceKey("", b0.b(AndroidManifestIntPropertyReader.class)), h.b(new AnonymousClass41(registry)));
        registry.updateService(new ServiceKey("", b0.b(AndroidTestDataInfo.class)), h.b(new AnonymousClass42(registry)));
        registry.updateService(new ServiceKey("", b0.b(GameServerIdReader.class)), h.b(new AnonymousClass43(registry)));
        registry.updateService(new ServiceKey("", b0.b(StoreDataSource.class)), h.b(new AnonymousClass44(registry)));
        registry.updateService(new ServiceKey("", b0.b(AnalyticsDataSource.class)), h.b(AnonymousClass45.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(DeveloperConsentDataSource.class)), h.b(new AnonymousClass46(registry)));
        registry.updateService(new ServiceKey("", b0.b(DynamicDeviceInfoDataSource.class)), h.b(new AnonymousClass47(registry)));
        registry.updateService(new ServiceKey("", b0.b(LegacyUserConsentDataSource.class)), h.b(new AnonymousClass48(registry)));
        registry.updateService(new ServiceKey("", b0.b(LifecycleDataSource.class)), h.b(AnonymousClass49.INSTANCE));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOCAL, b0.b(CacheDataSource.class)), h.b(new AnonymousClass50(registry)));
        registry.updateService(new ServiceKey("", b0.b(CreateFile.class)), h.b(AnonymousClass51.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(GetFileExtensionFromUrl.class)), h.b(new AnonymousClass52(registry)));
        registry.updateService(new ServiceKey("", b0.b(RemoveUrlQuery.class)), h.b(AnonymousClass53.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(MediationDataSource.class)), h.b(new AnonymousClass54(registry)));
        registry.updateService(new ServiceKey("", b0.b(PrivacyDeviceInfoDataSource.class)), h.b(new AnonymousClass55(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, b0.b(CacheDataSource.class)), h.b(new AnonymousClass56(registry)));
        registry.updateService(new ServiceKey("", b0.b(StaticDeviceInfoDataSource.class)), h.b(new AnonymousClass57(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, b0.b(d.class)), h.b(new AnonymousClass58(registry)));
        registry.updateService(new ServiceKey("", b0.b(UniversalRequestDataSource.class)), h.b(new AnonymousClass59(registry)));
        registry.updateService(new ServiceKey("", b0.b(WebviewConfigurationDataSource.class)), h.b(new AnonymousClass60(registry)));
        registry.updateService(new ServiceKey("", b0.b(OmidManager.class)), h.b(AnonymousClass61.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(SDKPropertiesManager.class)), h.b(AnonymousClass62.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(StorageManager.class)), h.b(AnonymousClass63.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(TransactionEventManager.class)), h.b(new AnonymousClass64(registry)));
        registry.updateService(new ServiceKey("", b0.b(AdRepository.class)), h.b(AnonymousClass65.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(CacheRepository.class)), h.b(new AnonymousClass66(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetCacheDirectory.class)), h.b(AnonymousClass67.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(CampaignRepository.class)), h.b(new AnonymousClass68(registry)));
        registry.updateService(new ServiceKey("", b0.b(DeveloperConsentRepository.class)), h.b(new AnonymousClass69(registry)));
        registry.updateService(new ServiceKey("", b0.b(DeviceInfoRepository.class)), h.b(new AnonymousClass70(registry)));
        registry.updateService(new ServiceKey("", b0.b(DiagnosticEventRepository.class)), h.b(new AnonymousClass71(registry)));
        registry.updateService(new ServiceKey("", b0.b(LegacyUserConsentRepository.class)), h.b(new AnonymousClass72(registry)));
        registry.updateService(new ServiceKey("", b0.b(MediationRepository.class)), h.b(new AnonymousClass73(registry)));
        registry.updateService(new ServiceKey("", b0.b(OpenMeasurementRepository.class)), h.b(new AnonymousClass74(registry)));
        registry.updateService(new ServiceKey("", b0.b(SessionRepository.class)), h.b(new AnonymousClass75(registry)));
        registry.updateService(new ServiceKey("", b0.b(TransactionEventRepository.class)), h.b(AnonymousClass76.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(OperativeEventRepository.class)), h.b(AnonymousClass77.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(ExecuteAdViewerRequest.class)), h.b(new AnonymousClass78(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetByteStringId.class)), h.b(AnonymousClass79.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(HandleOpenUrl.class)), h.b(new AnonymousClass80(registry)));
        registry.updateService(new ServiceKey("", b0.b(Refresh.class)), h.b(new AnonymousClass81(registry)));
        registry.updateService(new ServiceKey("", b0.b(SendDiagnosticEvent.class)), h.b(new AnonymousClass82(registry)));
        registry.updateService(new ServiceKey("", b0.b(SendWebViewClientErrorDiagnostics.class)), h.b(new AnonymousClass83(registry)));
        registry.updateService(new ServiceKey("", b0.b(Show.class)), h.b(new AnonymousClass84(registry)));
        registry.updateService(new ServiceKey("", b0.b(CacheFile.class)), h.b(new AnonymousClass85(registry)));
        registry.updateService(new ServiceKey("", b0.b(ClearCache.class)), h.b(new AnonymousClass86(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetAdObject.class)), h.b(new AnonymousClass87(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass88(registry)));
        registry.updateService(new ServiceKey("", b0.b(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass89(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetInitializationData.class)), h.b(new AnonymousClass90(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetInitializationRequestPayload.class)), h.b(new AnonymousClass91(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetInitializationState.class)), h.b(new AnonymousClass92(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetIsFileCache.class)), h.b(new AnonymousClass93(registry)));
        registry.updateService(new ServiceKey("", b0.b(SetInitializationState.class)), h.b(new AnonymousClass94(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, b0.b(GetRequestPolicy.class)), h.b(new AnonymousClass95(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetAdDataRefreshRequest.class)), h.b(new AnonymousClass96(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetAdPlayerConfigRequest.class)), h.b(new AnonymousClass97(registry)));
        registry.updateService(new ServiceKey("", b0.b(AndroidGetAdPlayerContext.class)), h.b(new AnonymousClass98(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetAdRequest.class)), h.b(new AnonymousClass99(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetHbTokenEventRequest.class)), h.b(AnonymousClass100.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(CommonScarEventReceiver.class)), h.b(new AnonymousClass101(registry)));
        registry.updateService(new ServiceKey("", b0.b(GMAScarAdapterBridge.class)), h.b(new AnonymousClass102(registry)));
        registry.updateService(new ServiceKey("", b0.b(ScarTimeHackFixer.class)), h.b(new AnonymousClass103(registry)));
        registry.updateService(new ServiceKey("", b0.b(ScarManager.class)), h.b(new AnonymousClass104(registry)));
        registry.updateService(new ServiceKey("", b0.b(FetchSignalsAndSendUseCase.class)), h.b(new AnonymousClass105(registry)));
        registry.updateService(new ServiceKey("", b0.b(LoadScarAd.class)), h.b(new AnonymousClass106(registry)));
        registry.updateService(new ServiceKey("", b0.b(HandleGetTokenRequest.class)), h.b(new AnonymousClass107(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetClientInfo.class)), h.b(new AnonymousClass108(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetInitializationCompletedRequest.class)), h.b(new AnonymousClass109(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetInitializationRequest.class)), h.b(new AnonymousClass110(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetLimitedSessionToken.class)), h.b(new AnonymousClass111(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetOpenGLRendererInfo.class)), h.b(new AnonymousClass112(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetSharedDataTimestamps.class)), h.b(AnonymousClass113.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(GetUniversalRequestForPayLoad.class)), h.b(new AnonymousClass114(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetUniversalRequestSharedData.class)), h.b(new AnonymousClass115(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetCachedAsset.class)), h.b(new AnonymousClass116(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetWebViewBridgeUseCase.class)), h.b(new AnonymousClass117(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, b0.b(GetRequestPolicy.class)), h.b(new AnonymousClass118(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetLatestWebViewConfiguration.class)), h.b(new AnonymousClass119(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, b0.b(GetRequestPolicy.class)), h.b(new AnonymousClass120(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, b0.b(GetRequestPolicy.class)), h.b(new AnonymousClass121(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetPrivacyUpdateRequest.class)), h.b(new AnonymousClass122(registry)));
        registry.updateService(new ServiceKey("", b0.b(HandleGatewayInitializationResponse.class)), h.b(new AnonymousClass123(registry)));
        registry.updateService(new ServiceKey("", b0.b(HandleGatewayUniversalResponse.class)), h.b(new AnonymousClass124(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeBoldSDK.class)), h.b(new AnonymousClass125(registry)));
        registry.updateService(new ServiceKey("", b0.b(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass126(registry)));
        registry.updateService(new ServiceKey("", b0.b(SendPrivacyUpdateRequest.class)), h.b(new AnonymousClass127(registry)));
        registry.updateService(new ServiceKey("", b0.b(TriggerInitializationCompletedRequest.class)), h.b(new AnonymousClass128(registry)));
        registry.updateService(new ServiceKey("", b0.b(TriggerInitializeListener.class)), h.b(new AnonymousClass129(registry)));
        registry.updateService(new ServiceKey("", b0.b(DiagnosticEventObserver.class)), h.b(new AnonymousClass130(registry)));
        registry.updateService(new ServiceKey("", b0.b(EventObservers.class)), h.b(new AnonymousClass131(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetTransactionData.class)), h.b(new AnonymousClass132(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetTransactionRequest.class)), h.b(new AnonymousClass133(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetDiagnosticEventBatchRequest.class)), h.b(AnonymousClass134.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(GetDiagnosticEventRequest.class)), h.b(new AnonymousClass135(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetOperativeEventApi.class)), h.b(new AnonymousClass136(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetOperativeEventRequest.class)), h.b(new AnonymousClass137(registry)));
        registry.updateService(new ServiceKey("", b0.b(HandleGatewayEventResponse.class)), h.b(AnonymousClass138.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(OperativeEventObserver.class)), h.b(new AnonymousClass139(registry)));
        registry.updateService(new ServiceKey("", b0.b(TransactionEventObserver.class)), h.b(new AnonymousClass140(registry)));
        registry.updateService(new ServiceKey("", b0.b(UniversalRequestTtlValidator.class)), h.b(AnonymousClass141.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(UniversalRequestEventSender.class)), h.b(new AnonymousClass142(registry)));
        registry.updateService(new ServiceKey("", b0.b(OmFinishSession.class)), h.b(new AnonymousClass143(registry)));
        registry.updateService(new ServiceKey("", b0.b(OmImpressionOccurred.class)), h.b(new AnonymousClass144(registry)));
        registry.updateService(new ServiceKey("", b0.b(AndroidOmInteraction.class)), h.b(new AnonymousClass145(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetOmData.class)), h.b(new AnonymousClass146(registry)));
        registry.updateService(new ServiceKey("", b0.b(IsOMActivated.class)), h.b(new AnonymousClass147(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeOMSDK.class)), h.b(new AnonymousClass148(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, b0.b(FlattenerRulesUseCase.class)), h.b(AnonymousClass149.INSTANCE));
        registry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, b0.b(FlattenerRulesUseCase.class)), h.b(AnonymousClass150.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(BackgroundWorker.class)), h.b(new AnonymousClass151(registry)));
        registry.updateService(new ServiceKey("", b0.b(DiagnosticEventRequestWorkModifier.class)), h.b(new AnonymousClass152(registry)));
        registry.updateService(new ServiceKey("", b0.b(GatewayClient.class)), h.b(new AnonymousClass153(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, b0.b(k0.class)), h.b(new AnonymousClass154(registry)));
        registry.updateService(new ServiceKey("", b0.b(TokenStorage.class)), h.b(AnonymousClass155.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(VolumeChange.class)), h.b(AnonymousClass156.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(ConfigFileFromLocalStorage.class)), h.b(new AnonymousClass157(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeSDK.class)), h.b(new AnonymousClass158(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeStateComplete.class)), h.b(new AnonymousClass159(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeStateConfig.class)), h.b(new AnonymousClass160(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeStateConfigWithLoader.class)), h.b(new AnonymousClass161(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeStateCreate.class)), h.b(new AnonymousClass162(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeStateError.class)), h.b(new AnonymousClass163(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeStateLoadCache.class)), h.b(new AnonymousClass164(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeStateLoadWeb.class)), h.b(new AnonymousClass165(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeStateReset.class)), h.b(new AnonymousClass166(registry)));
        registry.updateService(new ServiceKey("", b0.b(StoreMonitor.class)), h.b(new AnonymousClass167(registry)));
        registry.updateService(new ServiceKey("", b0.b(StoreWebViewEventSender.class)), h.b(new AnonymousClass168(registry)));
        registry.updateService(new ServiceKey("", b0.b(StoreExceptionHandler.class)), h.b(AnonymousClass169.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(StoreEventListenerFactory.class)), h.b(new AnonymousClass170(registry)));
        registry.updateService(new ServiceKey("", b0.b(ConfigurationReader.class)), h.b(AnonymousClass171.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(AndroidAttribution.class)), h.b(new AnonymousClass172(registry)));
        registry.updateService(new ServiceKey("", b0.b(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass173(registry)));
        registry.updateService(new ServiceKey("", b0.b(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new AnonymousClass174(registry)));
        registry.updateService(new ServiceKey("", b0.b(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass175(registry)));
        registry.updateService(new ServiceKey("", b0.b(Load.class)), ServiceFactoryKt.factoryOf(new AnonymousClass176(registry)));
        registry.updateService(new ServiceKey("", b0.b(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new AnonymousClass177(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass178(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass179(registry)));
        registry.updateService(new ServiceKey("", b0.b(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new AnonymousClass180(registry)));
        registry.updateService(new ServiceKey("", b0.b(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(AnonymousClass181.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass182(registry)));
        registry.updateService(new ServiceKey("", b0.b(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new AnonymousClass183(registry)));
        registry.updateService(new ServiceKey("", b0.b(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass184(registry)));
        registry.updateService(new ServiceKey("", b0.b(IEventSender.class)), h.b(AnonymousClass185.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(SetGameId.class)), h.b(new AnonymousClass186(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetGameId.class)), h.b(new AnonymousClass187(registry)));
        registry.updateService(new ServiceKey("", b0.b(ValidateGameId.class)), h.b(new AnonymousClass188(registry)));
        registry.updateService(new ServiceKey("", b0.b(GetWebViewCacheAssetLoader.class)), h.b(new AnonymousClass189(registry)));
        registry.updateService(new ServiceKey("", b0.b(ShouldAllowInitialization.class)), h.b(new AnonymousClass190(registry)));
        registry.updateService(new ServiceKey("", b0.b(CheckForGameIdAndTestModeChanges.class)), h.b(new AnonymousClass191(registry)));
        registry.updateService(new ServiceKey("", b0.b(DownloadPriorityQueue.class)), h.b(AnonymousClass192.INSTANCE));
        registry.updateService(new ServiceKey("", b0.b(CleanupDirectory.class)), h.b(AnonymousClass193.INSTANCE));
    }
}
