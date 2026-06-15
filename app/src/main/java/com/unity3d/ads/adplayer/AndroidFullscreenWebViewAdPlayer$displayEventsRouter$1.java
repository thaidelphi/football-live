package com.unity3d.ads.adplayer;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.adplayer.DisplayMessage;
import d9.o0;
import g9.v;
import i8.w;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {148, 149, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 151, 152, 154}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ DisplayMessage $displayMessage;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, d<? super AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1> dVar) {
        super(2, dVar);
        this.$displayMessage = displayMessage;
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(this.$displayMessage, this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        WebViewAdPlayer webViewAdPlayer;
        WebViewAdPlayer webViewAdPlayer2;
        WebViewAdPlayer webViewAdPlayer3;
        WebViewAdPlayer webViewAdPlayer4;
        c10 = n8.d.c();
        switch (this.label) {
            case 0:
                i8.p.b(obj);
                DisplayMessage displayMessage = this.$displayMessage;
                if (displayMessage instanceof DisplayMessage.DisplayReady) {
                    webViewAdPlayer4 = this.this$0.webViewAdPlayer;
                    Map<String, Object> showOptions = ((DisplayMessage.DisplayReady) this.$displayMessage).getShowOptions();
                    this.label = 1;
                    if (webViewAdPlayer4.requestShow(showOptions, this) == c10) {
                        return c10;
                    }
                } else if (displayMessage instanceof DisplayMessage.WebViewInstanceRequest) {
                    v<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.WebViewInstanceResponse webViewInstanceResponse = new DisplayMessage.WebViewInstanceResponse(this.$displayMessage.getOpportunityId(), this.this$0.getWebViewContainer().getWebView());
                    this.label = 2;
                    if (displayMessages.emit(webViewInstanceResponse, this) == c10) {
                        return c10;
                    }
                } else if (displayMessage instanceof DisplayMessage.VisibilityChanged) {
                    webViewAdPlayer3 = this.this$0.webViewAdPlayer;
                    boolean isVisible = ((DisplayMessage.VisibilityChanged) this.$displayMessage).isVisible();
                    this.label = 3;
                    if (webViewAdPlayer3.sendVisibilityChange(isVisible, this) == c10) {
                        return c10;
                    }
                } else if (displayMessage instanceof DisplayMessage.FocusChanged) {
                    webViewAdPlayer2 = this.this$0.webViewAdPlayer;
                    boolean isFocused = ((DisplayMessage.FocusChanged) this.$displayMessage).isFocused();
                    this.label = 4;
                    if (webViewAdPlayer2.sendFocusChange(isFocused, this) == c10) {
                        return c10;
                    }
                } else if (displayMessage instanceof DisplayMessage.DisplayDestroyed) {
                    webViewAdPlayer = this.this$0.webViewAdPlayer;
                    this.label = 5;
                    if (webViewAdPlayer.sendActivityDestroyed(this) == c10) {
                        return c10;
                    }
                } else if (displayMessage instanceof DisplayMessage.DisplayError) {
                    AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
                    this.label = 6;
                    if (androidFullscreenWebViewAdPlayer.destroy(this) == c10) {
                        return c10;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i8.p.b(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f26638a;
    }
}
