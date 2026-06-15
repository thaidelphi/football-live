package com.unity3d.services.ads.measurements;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.n;
/* compiled from: MeasurementsStatusReceiver.kt */
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class MeasurementsStatusReceiver implements OutcomeReceiver<Integer, Exception> {
    private final IEventSender eventSender;

    public MeasurementsStatusReceiver(IEventSender eventSender) {
        n.f(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    @Override // android.os.OutcomeReceiver
    public /* bridge */ /* synthetic */ void onResult(Integer num) {
        onResult(num.intValue());
    }

    @Override // android.os.OutcomeReceiver
    public void onError(Exception error) {
        n.f(error, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_EXCEPTION, error.toString());
    }

    public void onResult(int i10) {
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.AVAILABLE, Integer.valueOf(i10));
    }
}
