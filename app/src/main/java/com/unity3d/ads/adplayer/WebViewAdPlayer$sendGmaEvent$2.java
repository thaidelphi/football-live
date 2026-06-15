package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnGmaEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.scar.adapter.common.c;
import kotlin.jvm.internal.o;
/* compiled from: WebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class WebViewAdPlayer$sendGmaEvent$2 extends o implements t8.a<WebViewEvent> {
    final /* synthetic */ c $event;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendGmaEvent$2(c cVar) {
        super(0);
        this.$event = cVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final WebViewEvent invoke() {
        return new OnGmaEvent(this.$event);
    }
}
