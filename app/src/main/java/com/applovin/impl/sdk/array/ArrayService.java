package com.applovin.impl.sdk.array;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback;
import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.b;
import com.applovin.impl.l0;
import com.applovin.impl.o3;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.u2;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ArrayService extends IAppHubDirectDownloadServiceCallback.Stub {
    public static final String DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED = "APP_DETAILS_DISMISSED";
    public static final String DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN = "APP_DETAILS_SHOWN";
    private static final int MAX_RECONNECT_RETRY_COUNT = 3;
    private static final String SERVICE_INTENT_CLASS_NAME = "com.applovin.oem.am.android.external.AppHubService";
    private static final String SERVICE_INTENT_FILTER_ACTION = "com.applovin.am.intent.action.APPHUB_SERVICE";
    private static final String TAG = "ArrayService";
    private String appHubPackageName;
    private IAppHubService appHubService;
    private final Intent appHubServiceIntent;
    private long appHubVersionCode = -1;
    private DirectDownloadState currentDownloadState;
    private int currentRetryCount;
    private final ArrayDataCollector dataCollector;
    private Boolean isDirectDownloadEnabled;
    private final n logger;
    private final int minVersionCodeWithGenericEventsSupport;
    private String randomUserToken;
    private final j sdk;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface DirectDownloadListener {
        void onEvent(String str, Bundle bundle);

        void onFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class DirectDownloadState {
        private final String adToken;
        private final AtomicBoolean errorCallbackInvoked = new AtomicBoolean();
        private final DirectDownloadListener listener;
        private final Bundle parameters;

        public DirectDownloadState(String str, Bundle bundle, DirectDownloadListener directDownloadListener) {
            this.adToken = str;
            this.parameters = bundle;
            this.listener = directDownloadListener;
        }

        protected boolean canEqual(Object obj) {
            return obj instanceof DirectDownloadState;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof DirectDownloadState) {
                DirectDownloadState directDownloadState = (DirectDownloadState) obj;
                if (directDownloadState.canEqual(this)) {
                    AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
                    AtomicBoolean errorCallbackInvoked2 = directDownloadState.getErrorCallbackInvoked();
                    if (errorCallbackInvoked != null ? errorCallbackInvoked.equals(errorCallbackInvoked2) : errorCallbackInvoked2 == null) {
                        String adToken = getAdToken();
                        String adToken2 = directDownloadState.getAdToken();
                        if (adToken != null ? adToken.equals(adToken2) : adToken2 == null) {
                            Bundle parameters = getParameters();
                            Bundle parameters2 = directDownloadState.getParameters();
                            if (parameters != null ? parameters.equals(parameters2) : parameters2 == null) {
                                DirectDownloadListener listener = getListener();
                                DirectDownloadListener listener2 = directDownloadState.getListener();
                                return listener != null ? listener.equals(listener2) : listener2 == null;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public String getAdToken() {
            return this.adToken;
        }

        public AtomicBoolean getErrorCallbackInvoked() {
            return this.errorCallbackInvoked;
        }

        public DirectDownloadListener getListener() {
            return this.listener;
        }

        public Bundle getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
            int hashCode = errorCallbackInvoked == null ? 43 : errorCallbackInvoked.hashCode();
            String adToken = getAdToken();
            int hashCode2 = ((hashCode + 59) * 59) + (adToken == null ? 43 : adToken.hashCode());
            Bundle parameters = getParameters();
            int hashCode3 = (hashCode2 * 59) + (parameters == null ? 43 : parameters.hashCode());
            DirectDownloadListener listener = getListener();
            return (hashCode3 * 59) + (listener != null ? listener.hashCode() : 43);
        }

        public String toString() {
            return "ArrayService.DirectDownloadState(errorCallbackInvoked=" + getErrorCallbackInvoked() + ", adToken=" + getAdToken() + ", parameters=" + getParameters() + ", listener=" + getListener() + ")";
        }
    }

    public ArrayService(j jVar) {
        this.sdk = jVar;
        this.logger = jVar.I();
        this.dataCollector = new ArrayDataCollector(jVar);
        Intent createAppHubServiceIntent = createAppHubServiceIntent();
        this.appHubServiceIntent = createAppHubServiceIntent;
        this.minVersionCodeWithGenericEventsSupport = ((Integer) jVar.a(o4.f8115g0)).intValue();
        if (createAppHubServiceIntent != null) {
            bindAppHubService();
        }
        jVar.e().a(new b() { // from class: com.applovin.impl.sdk.array.ArrayService.1
            @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                DirectDownloadState directDownloadState = ArrayService.this.currentDownloadState;
                if (ArrayService.this.appHubService == null || directDownloadState == null) {
                    return;
                }
                try {
                    n unused = ArrayService.this.logger;
                    if (n.a()) {
                        ArrayService.this.logger.a(ArrayService.TAG, "Dismissing Direct Download Activity");
                    }
                    ArrayService.this.appHubService.dismissDirectDownloadAppDetails(directDownloadState.adToken);
                    directDownloadState.listener.onEvent(ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED, ArrayService.this.createBaseExtras(directDownloadState.adToken));
                    ArrayService.this.currentDownloadState = null;
                } catch (RemoteException e8) {
                    n unused2 = ArrayService.this.logger;
                    if (n.a()) {
                        ArrayService.this.logger.a(ArrayService.TAG, "Failed dismiss Direct Download Activity", e8);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindAppHubService() {
        if (this.currentRetryCount > 3) {
            if (n.a()) {
                this.logger.k(TAG, "Exceeded maximum retry count");
                return;
            }
            return;
        }
        if (n.a()) {
            this.logger.a(TAG, "Attempting connection to App Hub service...");
        }
        this.currentRetryCount++;
        try {
            if (j.m().bindService(this.appHubServiceIntent, new ServiceConnection() { // from class: com.applovin.impl.sdk.array.ArrayService.2
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    n unused = ArrayService.this.logger;
                    if (n.a()) {
                        n nVar = ArrayService.this.logger;
                        nVar.a(ArrayService.TAG, "Connection successful: " + componentName);
                    }
                    ArrayService.this.appHubService = IAppHubService.Stub.asInterface(iBinder);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    n unused = ArrayService.this.logger;
                    if (n.a()) {
                        n nVar = ArrayService.this.logger;
                        nVar.b(ArrayService.TAG, "Service disconnected: " + componentName);
                    }
                    ArrayService.this.appHubService = null;
                    n unused2 = ArrayService.this.logger;
                    if (n.a()) {
                        ArrayService.this.logger.b(ArrayService.TAG, "Retrying...");
                    }
                    ArrayService.this.bindAppHubService();
                }
            }, l0.c() ? 513 : 1) || !n.a()) {
                return;
            }
            this.logger.k(TAG, "App Hub not available");
        } catch (Throwable th) {
            if (n.a()) {
                this.logger.a(TAG, "Failed to bind to service", th);
            }
        }
    }

    private Intent createAppHubServiceIntent() {
        Intent intent = new Intent(SERVICE_INTENT_FILTER_ACTION);
        List<ResolveInfo> queryIntentServices = j.m().getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            String str = queryIntentServices.get(0).serviceInfo.packageName;
            this.appHubPackageName = str;
            intent.setClassName(str, SERVICE_INTENT_CLASS_NAME);
            return intent;
        } else if (n.a()) {
            this.logger.k(TAG, "App Hub not available");
            return null;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle createBaseExtras(String str) {
        Bundle bundle = new Bundle();
        BundleUtils.putString("ad_token", str, bundle);
        return bundle;
    }

    private void handleEvent(String str, Bundle bundle) {
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null) {
            return;
        }
        directDownloadState.listener.onEvent(str, bundle);
        if (DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED.equals(str)) {
            this.currentDownloadState = null;
        }
    }

    private boolean shouldUseGenericDirectDownloadEvent() {
        return this.minVersionCodeWithGenericEventsSupport >= 0 && getAppHubVersionCode() >= ((long) this.minVersionCodeWithGenericEventsSupport);
    }

    public void collectAppHubData() {
        if (isAppHubInstalled()) {
            if (n.a()) {
                this.logger.a(TAG, "Collecting data...");
            }
            if (this.isDirectDownloadEnabled == null && ((Boolean) this.sdk.a(o4.f8091d0)).booleanValue()) {
                this.isDirectDownloadEnabled = this.dataCollector.collectDirectDownloadEnabled(this.appHubService);
            }
            if (this.appHubVersionCode == -1 && ((Boolean) this.sdk.a(o4.f8083c0)).booleanValue()) {
                this.appHubVersionCode = this.dataCollector.collectAppHubVersionCode(this.appHubService);
            }
            if (TextUtils.isEmpty(this.randomUserToken) && ((Boolean) this.sdk.a(o4.f8099e0)).booleanValue()) {
                this.randomUserToken = this.dataCollector.collectRandomUserToken(this.appHubService);
            }
        }
    }

    public String getAppHubPackageName() {
        return this.appHubPackageName;
    }

    public long getAppHubVersionCode() {
        return this.appHubVersionCode;
    }

    public Boolean getIsDirectDownloadEnabled() {
        return this.isDirectDownloadEnabled;
    }

    public String getJavaScript(String str, Bundle bundle) {
        JSONObject jSONObject = BundleUtils.toJSONObject(bundle);
        return "javascript:al_onDirectDownloadEvent('" + str + "'," + jSONObject + ");";
    }

    public String getRandomUserToken() {
        return this.randomUserToken;
    }

    public boolean isAppHubInstalled() {
        return this.appHubService != null;
    }

    public void maybeSendAdEvent(u2 u2Var, String str) {
        IAppHubService iAppHubService;
        if (((Boolean) this.sdk.a(o4.f8107f0)).booleanValue() && (iAppHubService = this.appHubService) != null && o3.b(u2Var)) {
            if (n.a()) {
                n nVar = this.logger;
                nVar.a(TAG, "Sending ad event: " + str + " for ad: " + u2Var);
            }
            Bundle bundle = new Bundle();
            BundleUtils.putString("sdk_version", AppLovinSdk.VERSION, bundle);
            BundleUtils.putString("ad_format", u2Var.getFormat().getLabel(), bundle);
            Bundle B = u2Var.B();
            if (B != null) {
                bundle.putAll(B);
            }
            try {
                iAppHubService.onAdSdkEvent(str, bundle);
            } catch (Throwable th) {
                if (n.a()) {
                    n nVar2 = this.logger;
                    nVar2.a(TAG, "Failed to send ad event: " + str, th);
                }
            }
        }
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsDismissed(String str) {
        if (n.a()) {
            this.logger.a(TAG, "App details dismissed");
        }
        if (shouldUseGenericDirectDownloadEvent()) {
            return;
        }
        handleEvent(DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED, createBaseExtras(str));
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsShown(String str) {
        if (n.a()) {
            this.logger.a(TAG, "App details shown");
        }
        if (shouldUseGenericDirectDownloadEvent()) {
            return;
        }
        handleEvent(DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN, createBaseExtras(str));
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onDownloadStarted(String str) {
        if (n.a()) {
            this.logger.a(TAG, "Download started");
        }
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onError(String str, String str2) {
        if (n.a()) {
            n nVar = this.logger;
            nVar.b(TAG, "Encountered error: " + str2);
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState != null && directDownloadState.errorCallbackInvoked.compareAndSet(false, true)) {
            directDownloadState.listener.onFailure();
            this.currentDownloadState = null;
        }
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onEvent(String str, Bundle bundle) {
        if (n.a()) {
            n nVar = this.logger;
            nVar.a(TAG, "Received event: " + str);
        }
        if (shouldUseGenericDirectDownloadEvent()) {
            handleEvent(str, bundle);
        }
    }

    public void startDirectInstallOrDownloadProcess(ArrayDirectDownloadAd arrayDirectDownloadAd, Bundle bundle, DirectDownloadListener directDownloadListener) {
        if (this.appHubService == null) {
            if (n.a()) {
                this.logger.b(TAG, "Cannot begin Direct Install / Download process - service disconnected");
            }
            directDownloadListener.onFailure();
        } else if (!arrayDirectDownloadAd.isDirectDownloadEnabled()) {
            if (n.a()) {
                this.logger.b(TAG, "Cannot begin Direct Install / Download process - missing token");
            }
            directDownloadListener.onFailure();
        } else {
            try {
                Bundle directDownloadParameters = arrayDirectDownloadAd.getDirectDownloadParameters();
                if (bundle != null) {
                    directDownloadParameters.putAll(bundle);
                }
                this.currentDownloadState = new DirectDownloadState(arrayDirectDownloadAd.getDirectDownloadToken(), directDownloadParameters, directDownloadListener);
                if (n.a()) {
                    this.logger.a(TAG, "Starting Direct Download Activity");
                }
                if (this.appHubVersionCode >= 21) {
                    this.appHubService.showDirectDownloadAppDetailsWithExtra(this.currentDownloadState.adToken, this.currentDownloadState.parameters, this);
                } else {
                    this.appHubService.showDirectDownloadAppDetails(this.currentDownloadState.adToken, this);
                }
                if (n.a()) {
                    this.logger.a(TAG, "Activity started");
                }
            } catch (Throwable th) {
                if (n.a()) {
                    this.logger.a(TAG, "Failed to execute Direct Install / Download process", th);
                }
                this.sdk.D().a(TAG, "directInstallDownload", th);
                this.currentDownloadState = null;
                directDownloadListener.onFailure();
            }
        }
    }
}
