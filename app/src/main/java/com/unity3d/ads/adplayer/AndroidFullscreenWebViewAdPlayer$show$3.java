package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import i8.w;
import kotlin.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
/* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$3 extends l implements p<VolumeSettingsChange, d<? super w>, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidFullscreenWebViewAdPlayer$show$3(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // t8.p
    public final Object invoke(VolumeSettingsChange volumeSettingsChange, d<? super w> dVar) {
        Object handleVolumeSettingsChange;
        handleVolumeSettingsChange = ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, dVar);
        return handleVolumeSettingsChange;
    }
}
