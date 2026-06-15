package com.unity3d.ads.adplayer;

import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEventInfo;
import d9.k0;
import i8.w;
import m8.g;
import t8.l;
/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 extends m8.a implements k0 {
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(k0.b bVar, WebViewAdPlayer webViewAdPlayer) {
        super(bVar);
        this.this$0 = webViewAdPlayer;
    }

    @Override // d9.k0
    public void handleException(g gVar, Throwable th) {
        l<? super StorageEventInfo, w> lVar;
        Storage.Companion companion = Storage.Companion;
        lVar = this.this$0.storageEventCallback;
        companion.removeStorageEventCallback(lVar);
    }
}
