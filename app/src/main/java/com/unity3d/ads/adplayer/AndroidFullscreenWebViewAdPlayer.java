package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.banners.bridge.BannerBridge;
import d9.i;
import d9.o0;
import d9.z1;
import g9.c0;
import g9.e;
import g9.f;
import g9.g;
import g9.g0;
import g9.v;
import i8.w;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.d;
import org.json.JSONObject;
/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {
    public static final Companion Companion = new Companion(null);
    private static final v<DisplayMessage> displayMessages = c0.b(0, 0, null, 7, null);
    private final DeviceInfoRepository deviceInfoRepository;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final ScarManager scarManager;
    private final SessionRepository sessionRepository;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final v<DisplayMessage> getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager) {
        n.f(webViewAdPlayer, "webViewAdPlayer");
        n.f(opportunityId, "opportunityId");
        n.f(webViewContainer, "webViewContainer");
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(sessionRepository, "sessionRepository");
        n.f(openMeasurementRepository, "openMeasurementRepository");
        n.f(scarManager, "scarManager");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
    }

    private final z1 displayEventsRouter(DisplayMessage displayMessage) {
        return i.d(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(displayMessage, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, d<? super w> dVar) {
        Object c10;
        Object c11;
        if (sessionChange instanceof SessionChange.UserConsentChange) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            n.e(byteArray, "change.value.toByteArray()");
            Object sendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, dVar);
            c11 = n8.d.c();
            return sendUserConsentChange == c11 ? sendUserConsentChange : w.f26638a;
        } else if (sessionChange instanceof SessionChange.PrivacyFsmChange) {
            WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
            byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
            n.e(byteArray2, "change.value.toByteArray()");
            Object sendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, dVar);
            c10 = n8.d.c();
            return sendPrivacyFsmChange == c10 ? sendPrivacyFsmChange : w.f26638a;
        } else {
            return w.f26638a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, d<? super w> dVar) {
        Object c10;
        Object c11;
        if (volumeSettingsChange instanceof VolumeSettingsChange.MuteChange) {
            Object sendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), dVar);
            c11 = n8.d.c();
            return sendMuteChange == c11 ? sendMuteChange : w.f26638a;
        } else if (volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange) {
            Object sendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), dVar);
            c10 = n8.d.c();
            return sendVolumeChange == c10 ? sendVolumeChange : w.f26638a;
        } else {
            return w.f26638a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, d dVar) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return w.f26638a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[RETURN] */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object destroy(m8.d<? super i8.w> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            i8.p.b(r9)
            goto La0
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            i8.p.b(r9)
            goto L94
        L42:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            i8.p.b(r9)
            goto L85
        L4a:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            i8.p.b(r9)
            goto L6a
        L52:
            i8.p.b(r9)
            g9.v<com.unity3d.ads.adplayer.DisplayMessage> r9 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayMessages
            com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest r2 = new com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest
            java.lang.String r7 = r8.opportunityId
            r2.<init>(r7)
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            r2 = r8
        L6a:
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r2.openMeasurementRepository
            java.lang.String r6 = r2.opportunityId
            com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r6)
            boolean r9 = r9.hasSessionFinished(r6)
            if (r9 == 0) goto L85
            r6 = 1000(0x3e8, double:4.94E-321)
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r9 = d9.z0.a(r6, r0)
            if (r9 != r1) goto L85
            return r1
        L85:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r9 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r1) goto L94
            return r1
        L94:
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r9 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r9 != r1) goto La0
            return r1
        La0:
            i8.w r9 = i8.w.f26638a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy(m8.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<ScarEvent> getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o0 getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<i8.n<byte[], Integer>> getUpdateCampaignState() {
        return this.webViewAdPlayer.getUpdateCampaignState();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, d<? super w> dVar) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, d<? super w> dVar) {
        return this.webViewAdPlayer.onBroadcastEvent(str, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, d<? super w> dVar) {
        return this.webViewAdPlayer.requestShow(map, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(d<? super w> dVar) {
        return this.webViewAdPlayer.sendActivityDestroyed(dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendFocusChange(z10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(c cVar, d<? super w> dVar) {
        return this.webViewAdPlayer.sendGmaEvent(cVar, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendMuteChange(z10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, d<? super w> dVar) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, d<? super w> dVar) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, d<? super w> dVar) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendVisibilityChange(z10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendVolumeChange(d10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        n.f(showOptions, "showOptions");
        if (showOptions instanceof AndroidShowOptions) {
            AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
            Activity activity = androidShowOptions.getActivity().get();
            if (activity != null) {
                boolean isScarAd = androidShowOptions.isScarAd();
                final v<DisplayMessage> vVar = displayMessages;
                g.w(g.z(new e<DisplayMessage>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2  reason: invalid class name */
                    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                    public static final class AnonymousClass2<T> implements f {
                        final /* synthetic */ f $this_unsafeFlow;
                        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                        /* compiled from: Emitters.kt */
                        @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {223}, m = "emit")
                        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1  reason: invalid class name */
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

                        public AnonymousClass2(f fVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                            this.$this_unsafeFlow = fVar;
                            this.this$0 = androidFullscreenWebViewAdPlayer;
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
                                boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r7
                                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1
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
                                com.unity3d.ads.adplayer.DisplayMessage r2 = (com.unity3d.ads.adplayer.DisplayMessage) r2
                                java.lang.String r2 = r2.getOpportunityId()
                                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = r5.this$0
                                java.lang.String r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOpportunityId$p(r4)
                                boolean r2 = kotlin.jvm.internal.n.a(r2, r4)
                                if (r2 == 0) goto L52
                                r0.label = r3
                                java.lang.Object r6 = r7.emit(r6, r0)
                                if (r6 != r1) goto L52
                                return r1
                            L52:
                                i8.w r6 = i8.w.f26638a
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                        }
                    }

                    @Override // g9.e
                    public Object collect(f<? super DisplayMessage> fVar, d dVar) {
                        Object c10;
                        Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                        c10 = n8.d.c();
                        return collect == c10 ? collect : w.f26638a;
                    }
                }, new AndroidFullscreenWebViewAdPlayer$show$2(this)), getScope());
                g.w(g.z(this.deviceInfoRepository.getVolumeSettingsChange(), new AndroidFullscreenWebViewAdPlayer$show$3(this)), getScope());
                final e<ShowEvent> onShowEvent = this.webViewAdPlayer.getOnShowEvent();
                g.w(g.z(new e<ShowEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

                    /* compiled from: Emitters.kt */
                    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2  reason: invalid class name */
                    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                    public static final class AnonymousClass2<T> implements f {
                        final /* synthetic */ f $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {223}, m = "emit")
                        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1  reason: invalid class name */
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
                                boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r7
                                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1
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
                                com.unity3d.ads.core.data.model.ShowEvent r2 = (com.unity3d.ads.core.data.model.ShowEvent) r2
                                boolean r4 = r2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed
                                if (r4 != 0) goto L44
                                boolean r2 = r2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Error
                                if (r2 == 0) goto L42
                                goto L44
                            L42:
                                r2 = 0
                                goto L45
                            L44:
                                r2 = r3
                            L45:
                                if (r2 == 0) goto L50
                                r0.label = r3
                                java.lang.Object r6 = r7.emit(r6, r0)
                                if (r6 != r1) goto L50
                                return r1
                            L50:
                                i8.w r6 = i8.w.f26638a
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                        }
                    }

                    @Override // g9.e
                    public Object collect(f<? super ShowEvent> fVar, d dVar) {
                        Object c10;
                        Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                        c10 = n8.d.c();
                        return collect == c10 ? collect : w.f26638a;
                    }
                }, new AndroidFullscreenWebViewAdPlayer$show$5(this, null)), getScope());
                g.w(g.z(this.sessionRepository.getOnChange(), new AndroidFullscreenWebViewAdPlayer$show$6(this)), getScope());
                if (!isScarAd) {
                    Intent intent = new Intent(activity, FullScreenWebViewDisplay.class);
                    intent.putExtra("opportunityId", this.opportunityId);
                    Map<String, Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
                    if (unityAdsShowOptions != null) {
                        intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
                    }
                    intent.addFlags(268500992);
                    intent.putExtra("orientation", activity.getRequestedOrientation());
                    activity.startActivity(intent);
                    return;
                }
                ScarManager scarManager = this.scarManager;
                String placementId = androidShowOptions.getPlacementId();
                if (placementId == null) {
                    placementId = "";
                }
                String scarQueryId = androidShowOptions.getScarQueryId();
                i.d(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$7(this, g.C(scarManager.show(placementId, scarQueryId != null ? scarQueryId : ""), getScope(), g0.f25891a.a(), 10), showOptions, null), 3, null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
