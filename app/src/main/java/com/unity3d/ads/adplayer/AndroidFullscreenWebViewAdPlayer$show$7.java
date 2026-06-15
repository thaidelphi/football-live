package com.unity3d.ads.adplayer;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.scar.adapter.common.c;
import d9.o0;
import g9.a0;
import g9.e;
import g9.g;
import g9.v;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {105, 109}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class AndroidFullscreenWebViewAdPlayer$show$7 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ a0<GmaEventData> $scarEvents;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class AnonymousClass1 extends l implements p<g9.f<? super ScarEvent>, d<? super w>, Object> {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$showOptions, dVar);
        }

        @Override // t8.p
        public final Object invoke(g9.f<? super ScarEvent> fVar, d<? super w> dVar) {
            return ((AnonymousClass1) create(fVar, dVar)).invokeSuspend(w.f26638a);
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
                DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(str, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                this.label = 1;
                if (displayMessages.emit(displayReady, this) == c10) {
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
    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$2  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class AnonymousClass2 extends l implements p<ScarEvent, d<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<w> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // t8.p
        public final Object invoke(ScarEvent scarEvent, d<? super Boolean> dVar) {
            return ((AnonymousClass2) create(scarEvent, dVar)).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            n8.d.c();
            if (this.label == 0) {
                i8.p.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(n.a((ScarEvent) this.L$0, ScarEvent.Show.INSTANCE));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$4  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class AnonymousClass4 implements g9.f, i {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        public final Object emit(c cVar, d<? super w> dVar) {
            Object c10;
            Object sendGmaEvent = this.$tmp0.sendGmaEvent(cVar, dVar);
            c10 = n8.d.c();
            return sendGmaEvent == c10 ? sendGmaEvent : w.f26638a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof g9.f) && (obj instanceof i)) {
                return n.a(getFunctionDelegate(), ((i) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.i
        public final i8.c<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.l(2, this.$tmp0, WebViewAdPlayer.class, "sendGmaEvent", "sendGmaEvent(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g9.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((c) obj, (d<? super w>) dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$7(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, a0<GmaEventData> a0Var, ShowOptions showOptions, d<? super AndroidFullscreenWebViewAdPlayer$show$7> dVar) {
        super(2, dVar);
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$scarEvents = a0Var;
        this.$showOptions = showOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$7(this.this$0, this.$scarEvents, this.$showOptions, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$7) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        WebViewAdPlayer webViewAdPlayer;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            e A = g.A(this.this$0.getOnScarEvent(), new AnonymousClass1(this.this$0, this.$showOptions, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 1;
            if (g.s(A, anonymousClass2, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                i8.p.b(obj);
                return w.f26638a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        final a0<GmaEventData> a0Var = this.$scarEvents;
        e<c> eVar = new e<c>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements g9.f {
                final /* synthetic */ g9.f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {225}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(g9.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, m8.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        i8.p.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        i8.p.b(r6)
                        g9.f r6 = r4.$this_unsafeFlow
                        com.unity3d.ads.core.domain.scar.GmaEventData r5 = (com.unity3d.ads.core.domain.scar.GmaEventData) r5
                        com.unity3d.scar.adapter.common.c r5 = r5.getGmaEvent()
                        if (r5 == 0) goto L47
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        i8.w r5 = i8.w.f26638a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(g9.f<? super c> fVar, d dVar) {
                Object c11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c11 = n8.d.c();
                return collect == c11 ? collect : w.f26638a;
            }
        };
        webViewAdPlayer = this.this$0.webViewAdPlayer;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(webViewAdPlayer);
        this.label = 2;
        if (eVar.collect(anonymousClass4, this) == c10) {
            return c10;
        }
        return w.f26638a;
    }
}
