package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.jvm.internal.o;
/* compiled from: WebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class WebViewAdPlayer$sendActivityDestroyed$2 extends o implements t8.a<WebViewEvent> {
    public static final WebViewAdPlayer$sendActivityDestroyed$2 INSTANCE = new WebViewAdPlayer$sendActivityDestroyed$2();

    WebViewAdPlayer$sendActivityDestroyed$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final WebViewEvent invoke() {
        return new OnActivityDestroyedEvent();
    }
}
