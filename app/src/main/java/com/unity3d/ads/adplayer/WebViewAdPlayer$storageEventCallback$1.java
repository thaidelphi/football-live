package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnStorageEvent;
import com.unity3d.services.core.device.StorageEventInfo;
import d9.k;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import m8.d;
import t8.l;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class WebViewAdPlayer$storageEventCallback$1 extends o implements l<StorageEventInfo, w> {
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebViewAdPlayer.kt */
    @f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", f = "WebViewAdPlayer.kt", l = {75}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<o0, d<? super w>, Object> {
        final /* synthetic */ StorageEventInfo $it;
        int label;
        final /* synthetic */ WebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = webViewAdPlayer;
            this.$it = storageEventInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$it, dVar);
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            WebViewBridge webViewBridge;
            c10 = n8.d.c();
            int i10 = this.label;
            if (i10 == 0) {
                i8.p.b(obj);
                webViewBridge = this.this$0.bridge;
                OnStorageEvent onStorageEvent = new OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue());
                this.label = 1;
                if (webViewBridge.sendEvent(onStorageEvent, this) == c10) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$storageEventCallback$1(WebViewAdPlayer webViewAdPlayer) {
        super(1);
        this.this$0 = webViewAdPlayer;
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ w invoke(StorageEventInfo storageEventInfo) {
        invoke2(storageEventInfo);
        return w.f26638a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(StorageEventInfo it) {
        n.f(it, "it");
        k.d(this.this$0.getScope(), null, null, new AnonymousClass1(this.this$0, it, null), 3, null);
    }
}
