package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import d9.o0;
import g9.v;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: FullScreenWebViewDisplay.kt */
@f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$5", f = "FullScreenWebViewDisplay.kt", l = {42}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class FullScreenWebViewDisplay$onCreate$5 extends l implements p<o0, d<? super w>, Object> {
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$onCreate$5(FullScreenWebViewDisplay fullScreenWebViewDisplay, d<? super FullScreenWebViewDisplay$onCreate$5> dVar) {
        super(2, dVar);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new FullScreenWebViewDisplay$onCreate$5(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((FullScreenWebViewDisplay$onCreate$5) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        String str;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            v<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
            str = this.this$0.opportunityId;
            DisplayMessage.WebViewInstanceRequest webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(str);
            this.label = 1;
            if (displayMessages.emit(webViewInstanceRequest, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return w.f26638a;
    }
}
