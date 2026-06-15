package com.unity3d.services.ads.topics;

import android.adservices.AdServicesState;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.ext.SdkExtensions;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import d9.r1;
import kotlin.jvm.internal.n;
/* compiled from: TopicsService.kt */
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TopicsService {
    private final ISDKDispatchers dispatchers;
    private final IEventSender eventSender;
    private final TopicsManager topicsManager;

    public TopicsService(Context context, ISDKDispatchers dispatchers, IEventSender eventSender) {
        n.f(context, "context");
        n.f(dispatchers, "dispatchers");
        n.f(eventSender, "eventSender");
        this.dispatchers = dispatchers;
        this.eventSender = eventSender;
        this.topicsManager = getTopicsManager(context);
    }

    private final TopicsManager getTopicsManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (TopicsManager) context.getSystemService(TopicsManager.class);
        }
        return null;
    }

    public final TopicsStatus checkAvailability() {
        if (Device.getApiLevel() < 33) {
            return TopicsStatus.ERROR_API_BELOW_33;
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return TopicsStatus.ERROR_EXTENSION_BELOW_4;
        }
        if (this.topicsManager == null) {
            return TopicsStatus.ERROR_TOPICSMANAGER_NULL;
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return TopicsStatus.ERROR_AD_SERVICES_DISABLED;
        }
        return TopicsStatus.TOPICS_AVAILABLE;
    }

    public final void getTopics(String adsSdkName, boolean z10) {
        n.f(adsSdkName, "adsSdkName");
        TopicsReceiver topicsReceiver = new TopicsReceiver(this.eventSender);
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(adsSdkName).setShouldRecordObservation(z10).build();
        n.e(build, "Builder().setAdsSdkName(…ecordObservation).build()");
        try {
            TopicsManager topicsManager = this.topicsManager;
            if (topicsManager != null) {
                topicsManager.getTopics(build, r1.a(this.dispatchers.getDefault()), topicsReceiver);
            }
        } catch (Exception e8) {
            this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, e8.toString());
            DeviceLog.debug("Failed to get topics with error: " + e8);
        }
    }
}
