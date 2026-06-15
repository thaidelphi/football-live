package com.unity3d.ads.adplayer;

import i8.w;
import m8.d;
import t8.p;
/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
/* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$2 extends kotlin.jvm.internal.a implements p<DisplayMessage, d<? super w>, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidFullscreenWebViewAdPlayer$show$2(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
    }

    @Override // t8.p
    public final Object invoke(DisplayMessage displayMessage, d<? super w> dVar) {
        Object show$displayEventsRouter;
        show$displayEventsRouter = AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, dVar);
        return show$displayEventsRouter;
    }
}
