package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.ShowEvent;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$5", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {74}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class AndroidFullscreenWebViewAdPlayer$show$5 extends l implements p<ShowEvent, d<? super w>, Object> {
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$5(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, d<? super AndroidFullscreenWebViewAdPlayer$show$5> dVar) {
        super(2, dVar);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$5(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(ShowEvent showEvent, d<? super w> dVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$5) create(showEvent, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
            this.label = 1;
            if (androidFullscreenWebViewAdPlayer.destroy(this) == c10) {
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
