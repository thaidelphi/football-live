package com.unity3d.ads.adplayer;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEventInfo;
import d9.j0;
import d9.k0;
import d9.n0;
import d9.o0;
import d9.p0;
import g9.a0;
import g9.e;
import g9.f;
import g9.g;
import g9.g0;
import g9.l0;
import g9.v;
import g9.w;
import i8.n;
import m8.d;
import t8.l;
import t8.p;
/* compiled from: WebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class WebViewAdPlayer implements AdPlayer {
    private final WebViewBridge bridge;
    private final DeviceInfoRepository deviceInfoRepository;
    private final j0 dispatcher;
    private final ExecuteAdViewerRequest executeAdViewerRequest;
    private final w<Boolean> isCompletedManually;
    private final e<String> onBroadcastEvents;
    private final e<LoadEvent> onLoadEvent;
    private final e<i8.w> onRequestEvents;
    private final e<ScarEvent.Show> onScarEvent;
    private final e<ShowEvent> onShowEvent;
    private final o0 scope;
    private final k0 scopeCancellationHandler;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final l<StorageEventInfo, i8.w> storageEventCallback;
    private final e<n<byte[], Integer>> updateCampaignState;
    private final WebViewContainer webViewContainer;

    /* compiled from: WebViewAdPlayer.kt */
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.l implements p<String, d<? super i8.w>, Object> {
        AnonymousClass1(Object obj) {
            super(2, obj, v.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // t8.p
        public final Object invoke(String str, d<? super i8.w> dVar) {
            return ((v) this.receiver).emit(str, dVar);
        }
    }

    /* compiled from: WebViewAdPlayer.kt */
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.l implements p<String, d<? super i8.w>, Object> {
        AnonymousClass2(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // t8.p
        public final Object invoke(String str, d<? super i8.w> dVar) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, dVar);
        }
    }

    public WebViewAdPlayer(WebViewBridge bridge, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, ExecuteAdViewerRequest executeAdViewerRequest, j0 dispatcher, SendDiagnosticEvent sendDiagnosticEvent, WebViewContainer webViewContainer, o0 adPlayerScope) {
        kotlin.jvm.internal.n.f(bridge, "bridge");
        kotlin.jvm.internal.n.f(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.n.f(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.n.f(executeAdViewerRequest, "executeAdViewerRequest");
        kotlin.jvm.internal.n.f(dispatcher, "dispatcher");
        kotlin.jvm.internal.n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.n.f(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.n.f(adPlayerScope, "adPlayerScope");
        this.bridge = bridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.executeAdViewerRequest = executeAdViewerRequest;
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        w<Boolean> a10 = l0.a(Boolean.FALSE);
        this.isCompletedManually = a10;
        WebViewAdPlayer$storageEventCallback$1 webViewAdPlayer$storageEventCallback$1 = new WebViewAdPlayer$storageEventCallback$1(this);
        this.storageEventCallback = webViewAdPlayer$storageEventCallback$1;
        WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 = new WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(k0.f24473s0, this);
        this.scopeCancellationHandler = webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = p0.h(p0.h(p0.h(adPlayerScope, dispatcher), new n0("WebViewAdPlayer")), webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1);
        final a0<Invocation> onInvocation = bridge.getOnInvocation();
        final e<Invocation> eVar = new e<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, m8.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        i8.p.b(r7)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        i8.p.b(r7)
                        g9.f r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        java.lang.String[] r4 = new java.lang.String[]{r4}
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = j8.i.j(r4, r2)
                        if (r2 == 0) goto L52
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        i8.w r6 = i8.w.f26638a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super Invocation> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        };
        this.onScarEvent = new e<ScarEvent.Show>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, m8.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        i8.p.b(r8)
                        goto L70
                    L2d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L35:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        g9.f r2 = (g9.f) r2
                        i8.p.b(r8)
                        goto L55
                    L41:
                        i8.p.b(r8)
                        g9.f r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L55
                        return r1
                    L55:
                        java.lang.String r8 = r7.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        boolean r8 = kotlin.jvm.internal.n.a(r8, r4)
                        if (r8 == 0) goto L73
                        com.unity3d.ads.core.data.model.ScarEvent$Show r7 = com.unity3d.ads.core.data.model.ScarEvent.Show.INSTANCE
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L70
                        return r1
                    L70:
                        i8.w r7 = i8.w.f26638a
                        return r7
                    L73:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Unexpected location: "
                        r0.append(r1)
                        java.lang.String r7 = r7.getLocation()
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        java.lang.String r7 = r7.toString()
                        r8.<init>(r7)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super ScarEvent.Show> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        };
        final a0<Invocation> onInvocation2 = bridge.getOnInvocation();
        final e<Invocation> eVar2 = new e<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, m8.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        i8.p.b(r7)
                        goto L50
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        i8.p.b(r7)
                        g9.f r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getSHOW_EVENTS$p()
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = j8.i.j(r4, r2)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        i8.w r6 = i8.w.f26638a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super Invocation> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        };
        this.onShowEvent = g.u(new e<ShowEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", l = {244, 223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00f5 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0103 A[RETURN] */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, m8.d r11) {
                    /*
                        Method dump skipped, instructions count: 316
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super ShowEvent> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        }, a10, new WebViewAdPlayer$onShowEvent$3(null));
        final a0<Invocation> onInvocation3 = bridge.getOnInvocation();
        final e<Invocation> eVar3 = new e<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, m8.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        i8.p.b(r7)
                        goto L50
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        i8.p.b(r7)
                        g9.f r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getLOAD_EVENTS$p()
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = j8.i.j(r4, r2)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        i8.w r6 = i8.w.f26638a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super Invocation> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        };
        this.onLoadEvent = g.E(g.C(new e<LoadEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0095 A[RETURN] */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, m8.d r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        i8.p.b(r9)
                        goto L96
                    L2d:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L35:
                        java.lang.Object r8 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                        java.lang.Object r2 = r0.L$0
                        g9.f r2 = (g9.f) r2
                        i8.p.b(r9)
                        goto L55
                    L41:
                        i8.p.b(r9)
                        g9.f r2 = r7.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                        r0.L$0 = r2
                        r0.L$1 = r8
                        r0.label = r4
                        java.lang.Object r9 = com.unity3d.ads.adplayer.Invocation.handle$default(r8, r5, r0, r4, r5)
                        if (r9 != r1) goto L55
                        return r1
                    L55:
                        java.lang.String r9 = r8.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.loadError"
                        boolean r9 = kotlin.jvm.internal.n.a(r9, r4)
                        if (r9 == 0) goto L87
                        java.lang.Object[] r8 = r8.getParameters()
                        java.lang.Object r8 = j8.i.m(r8)
                        java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                        kotlin.jvm.internal.n.d(r8, r9)
                        org.json.JSONObject r8 = (org.json.JSONObject) r8
                        java.lang.String r9 = "code"
                        int r9 = r8.optInt(r9)
                        java.lang.String r4 = "message"
                        java.lang.String r8 = r8.optString(r4)
                        com.unity3d.ads.adplayer.model.LoadEvent$Error r4 = new com.unity3d.ads.adplayer.model.LoadEvent$Error
                        java.lang.String r6 = "errorMessage"
                        kotlin.jvm.internal.n.e(r8, r6)
                        r4.<init>(r8, r9)
                        goto L89
                    L87:
                        com.unity3d.ads.adplayer.model.LoadEvent$Completed r4 = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE
                    L89:
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r8 = r2.emit(r4, r0)
                        if (r8 != r1) goto L96
                        return r1
                    L96:
                        i8.w r8 = i8.w.f26638a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super LoadEvent> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        }, getScope(), g0.f25891a.a(), 1), 1);
        final a0<Invocation> onInvocation4 = bridge.getOnInvocation();
        final e<Invocation> eVar4 = new e<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, m8.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        i8.p.b(r7)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        i8.p.b(r7)
                        g9.f r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r2 = r2.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.updateCampaignState"
                        boolean r2 = kotlin.jvm.internal.n.a(r2, r4)
                        if (r2 == 0) goto L4e
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4e
                        return r1
                    L4e:
                        i8.w r6 = i8.w.f26638a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super Invocation> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        };
        this.updateCampaignState = new e<n<? extends byte[], ? extends Integer>>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0092 A[RETURN] */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, m8.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        i8.p.b(r8)
                        goto L93
                    L2d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L35:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        g9.f r2 = (g9.f) r2
                        i8.p.b(r8)
                        goto L55
                    L41:
                        i8.p.b(r8)
                        g9.f r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L55
                        return r1
                    L55:
                        java.lang.Object[] r7 = r7.getParameters()
                        java.lang.Object r7 = j8.i.m(r7)
                        java.lang.String r8 = "null cannot be cast to non-null type org.json.JSONObject"
                        kotlin.jvm.internal.n.d(r7, r8)
                        org.json.JSONObject r7 = (org.json.JSONObject) r7
                        java.lang.String r8 = "data"
                        java.lang.String r4 = r7.optString(r8)
                        kotlin.jvm.internal.n.e(r4, r8)
                        java.nio.charset.Charset r8 = b9.c.f5283b
                        byte[] r8 = r4.getBytes(r8)
                        java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
                        kotlin.jvm.internal.n.e(r8, r4)
                        java.lang.String r4 = "dataVersion"
                        int r7 = r7.optInt(r4)
                        java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.c(r7)
                        i8.n r7 = i8.s.a(r8, r7)
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L93
                        return r1
                    L93:
                        i8.w r7 = i8.w.f26638a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super n<? extends byte[], ? extends Integer>> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        };
        final a0<Invocation> onInvocation5 = bridge.getOnInvocation();
        final e<Invocation> eVar5 = new e<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, m8.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        i8.p.b(r7)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        i8.p.b(r7)
                        g9.f r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r2 = r2.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.broadcastEvent"
                        boolean r2 = kotlin.jvm.internal.n.a(r2, r4)
                        if (r2 == 0) goto L4e
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4e
                        return r1
                    L4e:
                        i8.w r6 = i8.w.f26638a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super Invocation> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        };
        e<String> eVar6 = new e<String>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2", f = "WebViewAdPlayer.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, m8.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        i8.p.b(r8)
                        goto L6e
                    L2d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L35:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        g9.f r2 = (g9.f) r2
                        i8.p.b(r8)
                        goto L55
                    L41:
                        i8.p.b(r8)
                        g9.f r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L55
                        return r1
                    L55:
                        java.lang.Object[] r7 = r7.getParameters()
                        java.lang.Object r7 = j8.i.m(r7)
                        java.lang.String r7 = r7.toString()
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L6e
                        return r1
                    L6e:
                        i8.w r7 = i8.w.f26638a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super String> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        };
        this.onBroadcastEvents = eVar6;
        final a0<Invocation> onInvocation6 = bridge.getOnInvocation();
        final e<Invocation> eVar7 = new e<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, m8.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        i8.p.b(r7)
                        goto L50
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        i8.p.b(r7)
                        g9.f r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getREQUEST_EVENTS$p()
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = j8.i.j(r4, r2)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        i8.w r6 = i8.w.f26638a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super Invocation> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        };
        e<i8.w> eVar8 = new e<i8.w>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$6

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$6$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ WebViewAdPlayer this$0;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$6$2", f = "WebViewAdPlayer.kt", l = {224, 237, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 253, 223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$6$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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

                public AnonymousClass2(f fVar, WebViewAdPlayer webViewAdPlayer) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = webViewAdPlayer;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(15:5|6|7|(1:(1:(1:(1:(1:(3:14|15|16)(2:18|19))(6:20|21|22|(1:24)|15|16))(7:25|26|27|22|(0)|15|16))(11:28|29|30|(1:32)(2:36|(1:38)(1:39))|33|(1:35)|27|22|(0)|15|16))(1:40))(2:73|(1:75)(1:76))|41|(2:43|(4:45|(4:49|50|51|(1:53)(1:54))|65|66)(4:67|(4:69|50|51|(0)(0))|65|66))(4:70|(4:72|50|51|(0)(0))|65|66)|30|(0)(0)|33|(0)|27|22|(0)|15|16))|78|6|7|(0)(0)|41|(0)(0)|30|(0)(0)|33|(0)|27|22|(0)|15|16) */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
                    r0 = e;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0111 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x011f A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:20:0x005e, B:23:0x0073, B:51:0x0115, B:53:0x011f, B:58:0x0132, B:54:0x0122, B:56:0x0126), top: B:79:0x002b }] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0122 A[Catch: Exception -> 0x0078, TryCatch #0 {Exception -> 0x0078, blocks: (B:20:0x005e, B:23:0x0073, B:51:0x0115, B:53:0x011f, B:58:0x0132, B:54:0x0122, B:56:0x0126), top: B:79:0x002b }] */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0172 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:74:0x01bf A[RETURN] */
                /* JADX WARN: Type inference failed for: r4v0, types: [int] */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v9 */
                /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object[], java.lang.String[]] */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r17, m8.d r18) {
                    /*
                        Method dump skipped, instructions count: 478
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$6.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super i8.w> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        };
        this.onRequestEvents = eVar8;
        Storage.Companion.addStorageEventCallback(webViewAdPlayer$storageEventCallback$1);
        AdPlayer.Companion companion = AdPlayer.Companion;
        g.w(g.z(eVar6, new AnonymousClass1(companion.getBroadcastEventChannel())), getScope());
        g.w(eVar8, getScope());
        g.w(g.z(companion.getBroadcastEventChannel(), new AnonymousClass2(this)), getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendEvent(t8.a<? extends com.unity3d.ads.adplayer.model.WebViewEvent> r18, m8.d<? super i8.w> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = (com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = new com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = n8.b.c()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L45
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            i8.p.b(r1)
            goto Lb9
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            java.lang.Object r4 = r2.L$1
            t8.a r4 = (t8.a) r4
            java.lang.Object r7 = r2.L$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r7 = (com.unity3d.ads.adplayer.WebViewAdPlayer) r7
            i8.p.b(r1)
            goto L5c
        L45:
            i8.p.b(r1)
            g9.e r1 = r17.getOnLoadEvent()
            r2.L$0 = r0
            r4 = r18
            r2.L$1 = r4
            r2.label = r6
            java.lang.Object r1 = g9.g.D(r1, r2)
            if (r1 != r3) goto L5b
            return r3
        L5b:
            r7 = r0
        L5c:
            com.unity3d.ads.adplayer.model.LoadEvent r1 = (com.unity3d.ads.adplayer.model.LoadEvent) r1
            boolean r8 = r1 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
            if (r8 == 0) goto La3
            com.unity3d.ads.core.domain.SendDiagnosticEvent r9 = r7.sendDiagnosticEvent
            r11 = 0
            r2 = 3
            i8.n[] r2 = new i8.n[r2]
            r3 = 0
            java.lang.String r4 = "reason"
            java.lang.String r7 = "adviewer"
            i8.n r4 = i8.s.a(r4, r7)
            r2[r3] = r4
            com.unity3d.ads.adplayer.model.LoadEvent$Error r1 = (com.unity3d.ads.adplayer.model.LoadEvent.Error) r1
            java.lang.String r3 = r1.getMessage()
            java.lang.String r4 = "reason_debug"
            i8.n r3 = i8.s.a(r4, r3)
            r2[r6] = r3
            int r1 = r1.getErrorCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "reason_code"
            i8.n r1 = i8.s.a(r3, r1)
            r2[r5] = r1
            java.util.Map r12 = j8.g0.g(r2)
            r13 = 0
            r14 = 0
            r15 = 26
            r16 = 0
            java.lang.String r10 = "bridge_send_event_failed"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r9, r10, r11, r12, r13, r14, r15, r16)
            i8.w r1 = i8.w.f26638a
            return r1
        La3:
            java.lang.Object r1 = r4.invoke()
            com.unity3d.ads.adplayer.model.WebViewEvent r1 = (com.unity3d.ads.adplayer.model.WebViewEvent) r1
            com.unity3d.ads.adplayer.WebViewBridge r4 = r7.bridge
            r6 = 0
            r2.L$0 = r6
            r2.L$1 = r6
            r2.label = r5
            java.lang.Object r1 = r4.sendEvent(r1, r2)
            if (r1 != r3) goto Lb9
            return r3
        Lb9:
            i8.w r1 = i8.w.f26638a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent(t8.a, m8.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object destroy(d<? super i8.w> dVar) {
        return AdPlayer.DefaultImpls.destroy(this, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.isCompletedManually.setValue(Boolean.TRUE);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<LoadEvent> getOnLoadEvent() {
        return this.onLoadEvent;
    }

    public final e<i8.w> getOnRequestEvents() {
        return this.onRequestEvents;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<ScarEvent.Show> getOnScarEvent() {
        return this.onScarEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<ShowEvent> getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o0 getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<n<byte[], Integer>> getUpdateCampaignState() {
        return this.updateCampaignState;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, d<? super i8.w> dVar) {
        Object c10;
        Object sendEvent = sendEvent(new WebViewAdPlayer$onAllowedPiiChange$2(bArr), dVar);
        c10 = n8.d.c();
        return sendEvent == c10 ? sendEvent : i8.w.f26638a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, d<? super i8.w> dVar) {
        Object c10;
        Object sendEvent = sendEvent(new WebViewAdPlayer$onBroadcastEvent$2(str), dVar);
        c10 = n8.d.c();
        return sendEvent == c10 ? sendEvent : i8.w.f26638a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0189 A[RETURN] */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object requestShow(java.util.Map<java.lang.String, ? extends java.lang.Object> r14, m8.d<? super i8.w> r15) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow(java.util.Map, m8.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(d<? super i8.w> dVar) {
        Object c10;
        Object sendEvent = sendEvent(WebViewAdPlayer$sendActivityDestroyed$2.INSTANCE, dVar);
        c10 = n8.d.c();
        return sendEvent == c10 ? sendEvent : i8.w.f26638a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z10, d<? super i8.w> dVar) {
        Object c10;
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendFocusChange$2(z10), dVar);
        c10 = n8.d.c();
        return sendEvent == c10 ? sendEvent : i8.w.f26638a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(c cVar, d<? super i8.w> dVar) {
        Object c10;
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendGmaEvent$2(cVar), dVar);
        c10 = n8.d.c();
        return sendEvent == c10 ? sendEvent : i8.w.f26638a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z10, d<? super i8.w> dVar) {
        Object c10;
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendMuteChange$2(z10), dVar);
        c10 = n8.d.c();
        return sendEvent == c10 ? sendEvent : i8.w.f26638a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, d<? super i8.w> dVar) {
        Object c10;
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendPrivacyFsmChange$2(bArr), dVar);
        c10 = n8.d.c();
        return sendEvent == c10 ? sendEvent : i8.w.f26638a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, d<? super i8.w> dVar) {
        Object c10;
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendScarBannerEvent$2(bannerEvent), dVar);
        c10 = n8.d.c();
        return sendEvent == c10 ? sendEvent : i8.w.f26638a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, d<? super i8.w> dVar) {
        Object c10;
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendUserConsentChange$2(bArr), dVar);
        c10 = n8.d.c();
        return sendEvent == c10 ? sendEvent : i8.w.f26638a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z10, d<? super i8.w> dVar) {
        Object c10;
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendVisibilityChange$2(z10), dVar);
        c10 = n8.d.c();
        return sendEvent == c10 ? sendEvent : i8.w.f26638a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d10, d<? super i8.w> dVar) {
        Object c10;
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendVolumeChange$2(d10), dVar);
        c10 = n8.d.c();
        return sendEvent == c10 ? sendEvent : i8.w.f26638a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }
}
