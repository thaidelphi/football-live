package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.SessionChange;
import i8.w;
import kotlin.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
/* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$6 extends l implements p<SessionChange, d<? super w>, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidFullscreenWebViewAdPlayer$show$6(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // t8.p
    public final Object invoke(SessionChange sessionChange, d<? super w> dVar) {
        Object handleSessionChange;
        handleSessionChange = ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, dVar);
        return handleSessionChange;
    }
}
