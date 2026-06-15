package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FullScreenWebViewDisplay.kt */
@f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2 extends l implements p<DisplayMessage, d<? super w>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2(FullScreenWebViewDisplay fullScreenWebViewDisplay, d<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2> dVar) {
        super(2, dVar);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        FullScreenWebViewDisplay$listenToAdPlayerEvents$2 fullScreenWebViewDisplay$listenToAdPlayerEvents$2 = new FullScreenWebViewDisplay$listenToAdPlayerEvents$2(this.this$0, dVar);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2;
    }

    @Override // t8.p
    public final Object invoke(DisplayMessage displayMessage, d<? super w> dVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2) create(displayMessage, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            DisplayMessage displayMessage = (DisplayMessage) this.L$0;
            if (displayMessage instanceof DisplayMessage.DisplayFinishRequest) {
                this.this$0.finish();
            } else if (displayMessage instanceof DisplayMessage.WebViewInstanceResponse) {
                this.this$0.loadWebView(((DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
            } else if (displayMessage instanceof DisplayMessage.SetOrientation) {
                this.this$0.setRequestedOrientation(((DisplayMessage.SetOrientation) displayMessage).getOrientation());
            }
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
