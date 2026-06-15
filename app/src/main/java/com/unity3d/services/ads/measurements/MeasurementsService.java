package com.unity3d.services.ads.measurements;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import d9.r1;
import kotlin.jvm.internal.n;
/* compiled from: MeasurementsService.kt */
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class MeasurementsService {
    private final ISDKDispatchers dispatchers;
    private final IEventSender eventSender;
    private final MeasurementManager measurementManager;

    public MeasurementsService(Context context, ISDKDispatchers dispatchers, IEventSender eventSender) {
        n.f(context, "context");
        n.f(dispatchers, "dispatchers");
        n.f(eventSender, "eventSender");
        this.dispatchers = dispatchers;
        this.eventSender = eventSender;
        this.measurementManager = getMeasurementManager(context);
    }

    private final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (MeasurementManager) context.getSystemService(MeasurementManager.class);
        }
        return null;
    }

    public final void checkAvailability() {
        if (Device.getApiLevel() < 33) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_API_BELOW_33);
        } else if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_EXTENSION_BELOW_4);
        } else if (this.measurementManager == null) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_MANAGER_NULL);
        } else if (!AdServicesState.isAdServicesStateEnabled()) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_AD_SERVICES_DISABLED);
        } else {
            this.measurementManager.getMeasurementApiStatus(r1.a(this.dispatchers.getDefault()), new MeasurementsStatusReceiver(this.eventSender));
        }
    }

    public final void registerClick(String url, InputEvent inputEvent) {
        n.f(url, "url");
        n.f(inputEvent, "inputEvent");
        MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            measurementManager.registerSource(Uri.parse(url), inputEvent, r1.a(this.dispatchers.getDefault()), new MeasurementsReceiver(this.eventSender, MeasurementsEvents.CLICK_SUCCESSFUL, MeasurementsEvents.CLICK_ERROR));
        }
    }

    public final void registerTrigger(String url) {
        n.f(url, "url");
        MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            measurementManager.registerTrigger(Uri.parse(url), r1.a(this.dispatchers.getDefault()), new MeasurementsReceiver(this.eventSender, MeasurementsEvents.TRIGGER_SUCCESSFUL, MeasurementsEvents.TRIGGER_ERROR));
        }
    }

    public final void registerView(String url) {
        n.f(url, "url");
        MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            measurementManager.registerSource(Uri.parse(url), (InputEvent) null, r1.a(this.dispatchers.getDefault()), new MeasurementsReceiver(this.eventSender, MeasurementsEvents.VIEW_SUCCESSFUL, MeasurementsEvents.VIEW_ERROR));
        }
    }
}
