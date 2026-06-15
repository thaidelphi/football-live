package com.unity3d.services.ads.measurements;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.n;
/* compiled from: MeasurementsReceiver.kt */
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class MeasurementsReceiver implements OutcomeReceiver<Object, Exception> {
    private final MeasurementsEvents errorEvent;
    private final IEventSender eventSender;
    private final MeasurementsEvents successEvent;

    public MeasurementsReceiver(IEventSender eventSender, MeasurementsEvents successEvent, MeasurementsEvents errorEvent) {
        n.f(eventSender, "eventSender");
        n.f(successEvent, "successEvent");
        n.f(errorEvent, "errorEvent");
        this.eventSender = eventSender;
        this.successEvent = successEvent;
        this.errorEvent = errorEvent;
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(Object p02) {
        n.f(p02, "p0");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.successEvent, new Object[0]);
    }

    @Override // android.os.OutcomeReceiver
    public void onError(Exception error) {
        n.f(error, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.errorEvent, error.toString());
    }
}
