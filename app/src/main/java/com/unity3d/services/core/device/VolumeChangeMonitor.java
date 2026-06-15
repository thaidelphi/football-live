package com.unity3d.services.core.device;

import android.util.SparseArray;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.n;
/* compiled from: VolumeChangeMonitor.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class VolumeChangeMonitor {
    private final IEventSender eventSender;
    private final VolumeChange volumeChange;
    private final SparseArray<VolumeChangeListener> volumeChangeListeners;

    public VolumeChangeMonitor(IEventSender eventSender, VolumeChange volumeChange) {
        n.f(eventSender, "eventSender");
        n.f(volumeChange, "volumeChange");
        this.eventSender = eventSender;
        this.volumeChange = volumeChange;
        this.volumeChangeListeners = new SparseArray<>();
    }

    public final void registerVolumeChangeListener(final int i10) {
        if (this.volumeChangeListeners.get(i10) == null) {
            VolumeChangeListener volumeChangeListener = new VolumeChangeListener() { // from class: com.unity3d.services.core.device.VolumeChangeMonitor$registerVolumeChangeListener$listener$1
                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public int getStreamType() {
                    return i10;
                }

                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public void onVolumeChanged(int i11) {
                    IEventSender iEventSender;
                    iEventSender = VolumeChangeMonitor.this.eventSender;
                    iEventSender.sendEvent(WebViewEventCategory.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(getStreamType()), Integer.valueOf(i11), Integer.valueOf(Device.getStreamMaxVolume(i10)));
                }
            };
            this.volumeChangeListeners.append(i10, volumeChangeListener);
            this.volumeChange.registerListener(volumeChangeListener);
        }
    }

    public final void unregisterVolumeChangeListener(int i10) {
        if (this.volumeChangeListeners.get(i10) != null) {
            VolumeChangeListener listener = this.volumeChangeListeners.get(i10);
            VolumeChange volumeChange = this.volumeChange;
            n.e(listener, "listener");
            volumeChange.unregisterListener(listener);
            this.volumeChangeListeners.remove(i10);
        }
    }
}
