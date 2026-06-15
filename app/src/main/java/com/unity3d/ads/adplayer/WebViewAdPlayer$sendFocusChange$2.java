package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.jvm.internal.o;
/* compiled from: WebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class WebViewAdPlayer$sendFocusChange$2 extends o implements t8.a<WebViewEvent> {
    final /* synthetic */ boolean $isFocused;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendFocusChange$2(boolean z10) {
        super(0);
        this.$isFocused = z10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final WebViewEvent invoke() {
        return new OnFocusChangeEvent(this.$isFocused);
    }
}
