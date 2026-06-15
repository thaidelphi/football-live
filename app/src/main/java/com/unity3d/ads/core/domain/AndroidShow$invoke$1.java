package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import g9.e;
import g9.g;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
import t8.q;
/* compiled from: AndroidShow.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {28, 53}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidShow$invoke$1 extends l implements p<g9.f<? super ShowEvent>, m8.d<? super w>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AndroidShow this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidShow.kt */
    @f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$2  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass2 extends l implements p<g9.f<? super ShowEvent>, m8.d<? super w>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ AdObject $ad;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdObject adObject, AndroidShow androidShow, Activity activity, UnityAdsShowOptions unityAdsShowOptions, m8.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$ad = adObject;
            this.this$0 = androidShow;
            this.$activity = activity;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<w> create(Object obj, m8.d<?> dVar) {
            return new AnonymousClass2(this.$ad, this.this$0, this.$activity, this.$showOptions, dVar);
        }

        @Override // t8.p
        public final Object invoke(g9.f<? super ShowEvent> fVar, m8.d<? super w> dVar) {
            return ((AnonymousClass2) create(fVar, dVar)).invokeSuspend(w.f26638a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
            if (r1 == null) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                n8.b.c()
                int r0 = r12.label
                if (r0 != 0) goto L94
                i8.p.b(r13)
                com.unity3d.ads.core.data.model.AdObject r13 = r12.$ad
                com.unity3d.ads.core.domain.AndroidShow r0 = r12.this$0
                com.unity3d.ads.core.configuration.GameServerIdReader r0 = com.unity3d.ads.core.domain.AndroidShow.access$getGameServerIdReader$p(r0)
                com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
                java.lang.String r2 = r0.getKey()
                java.lang.Object r1 = r1.get(r2)
                java.lang.String r2 = "get(key)"
                r3 = 0
                if (r1 == 0) goto L2e
                kotlin.jvm.internal.n.e(r1, r2)
                boolean r4 = r1 instanceof java.lang.String
                if (r4 == 0) goto L2b
                goto L2c
            L2b:
                r1 = r3
            L2c:
                if (r1 != 0) goto L2f
            L2e:
                r1 = r3
            L2f:
                com.unity3d.services.core.misc.JsonStorage r4 = r0.getJsonStorage()
                java.lang.String r5 = r0.getKey()
                java.lang.Object r4 = r4.get(r5)
                if (r4 == 0) goto L4b
                kotlin.jvm.internal.n.e(r4, r2)
                com.unity3d.services.core.misc.JsonStorage r2 = r0.getJsonStorage()
                java.lang.String r0 = r0.getKey()
                r2.delete(r0)
            L4b:
                java.lang.String r1 = (java.lang.String) r1
                r13.setPlayerServerId(r1)
                com.unity3d.ads.core.data.model.AdObject r13 = r12.$ad
                com.unity3d.ads.adplayer.AdPlayer r13 = r13.getAdPlayer()
                java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
                android.app.Activity r0 = r12.$activity
                r5.<init>(r0)
                com.unity3d.ads.UnityAdsShowOptions r0 = r12.$showOptions
                org.json.JSONObject r0 = r0.getData()
                if (r0 == 0) goto L69
                java.util.Map r3 = com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(r0)
            L69:
                r6 = r3
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                boolean r8 = r0.isScarAd()
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                java.lang.String r10 = r0.getScarAdString()
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                java.lang.String r9 = r0.getScarQueryId()
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                java.lang.String r11 = r0.getScarAdUnitId()
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                java.lang.String r7 = r0.getPlacementId()
                com.unity3d.ads.adplayer.AndroidShowOptions r0 = new com.unity3d.ads.adplayer.AndroidShowOptions
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                r13.show(r0)
                i8.w r13 = i8.w.f26638a
                return r13
            L94:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidShow.kt */
    @f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", f = "AndroidShow.kt", l = {48}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass3 extends l implements q<g9.f<? super ShowEvent>, Throwable, m8.d<? super w>, Object> {
        final /* synthetic */ ByteString $opportunityId;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AndroidShow androidShow, ByteString byteString, m8.d<? super AnonymousClass3> dVar) {
            super(3, dVar);
            this.this$0 = androidShow;
            this.$opportunityId = byteString;
        }

        @Override // t8.q
        public final Object invoke(g9.f<? super ShowEvent> fVar, Throwable th, m8.d<? super w> dVar) {
            return new AnonymousClass3(this.this$0, this.$opportunityId, dVar).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            AdRepository adRepository;
            c10 = n8.d.c();
            int i10 = this.label;
            if (i10 == 0) {
                i8.p.b(obj);
                adRepository = this.this$0.adRepository;
                ByteString byteString = this.$opportunityId;
                this.label = 1;
                if (adRepository.removeAd(byteString, this) == c10) {
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
    /* compiled from: AndroidShow.kt */
    @f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass4 extends l implements q<g9.f<? super ShowEvent>, ShowEvent, m8.d<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass4(m8.d<? super AnonymousClass4> dVar) {
            super(3, dVar);
        }

        @Override // t8.q
        public final Object invoke(g9.f<? super ShowEvent> fVar, ShowEvent showEvent, m8.d<? super Boolean> dVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(dVar);
            anonymousClass4.L$0 = fVar;
            anonymousClass4.L$1 = showEvent;
            return anonymousClass4.invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            ShowEvent showEvent;
            c10 = n8.d.c();
            int i10 = this.label;
            boolean z10 = true;
            if (i10 == 0) {
                i8.p.b(obj);
                ShowEvent showEvent2 = (ShowEvent) this.L$1;
                this.L$0 = showEvent2;
                this.label = 1;
                if (((g9.f) this.L$0).emit(showEvent2, this) == c10) {
                    return c10;
                }
                showEvent = showEvent2;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                showEvent = (ShowEvent) this.L$0;
                i8.p.b(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidShow$invoke$1(AdObject adObject, AndroidShow androidShow, Activity activity, UnityAdsShowOptions unityAdsShowOptions, m8.d<? super AndroidShow$invoke$1> dVar) {
        super(2, dVar);
        this.$adObject = adObject;
        this.this$0 = androidShow;
        this.$activity = activity;
        this.$showOptions = unityAdsShowOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        AndroidShow$invoke$1 androidShow$invoke$1 = new AndroidShow$invoke$1(this.$adObject, this.this$0, this.$activity, this.$showOptions, dVar);
        androidShow$invoke$1.L$0 = obj;
        return androidShow$invoke$1;
    }

    @Override // t8.p
    public final Object invoke(g9.f<? super ShowEvent> fVar, m8.d<? super w> dVar) {
        return ((AndroidShow$invoke$1) create(fVar, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        AdRepository adRepository;
        Object ad;
        final g9.f fVar;
        ByteString byteString;
        SendDiagnosticEvent sendDiagnosticEvent;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            g9.f fVar2 = (g9.f) this.L$0;
            if (!this.$adObject.getOpportunityId().isEmpty()) {
                ByteString opportunityId = this.$adObject.getOpportunityId();
                adRepository = this.this$0.adRepository;
                this.L$0 = fVar2;
                this.L$1 = opportunityId;
                this.label = 1;
                ad = adRepository.getAd(opportunityId, this);
                if (ad == c10) {
                    return c10;
                }
                fVar = fVar2;
                byteString = opportunityId;
            } else {
                throw new IllegalArgumentException("No opportunityId".toString());
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                i8.p.b(obj);
                return w.f26638a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            byteString = (ByteString) this.L$1;
            i8.p.b(obj);
            fVar = (g9.f) this.L$0;
            ad = obj;
        }
        AdObject adObject = (AdObject) ad;
        if (adObject != null) {
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, 14, null);
            AdPlayer adPlayer = adObject.getAdPlayer();
            if (adPlayer != null) {
                e G = g.G(g.y(g.A(adPlayer.getOnShowEvent(), new AnonymousClass2(adObject, this.this$0, this.$activity, this.$showOptions, null)), new AnonymousClass3(this.this$0, byteString, null)), new AnonymousClass4(null));
                g9.f fVar3 = new g9.f() { // from class: com.unity3d.ads.core.domain.AndroidShow$invoke$1.5
                    public final Object emit(ShowEvent showEvent, m8.d<? super w> dVar) {
                        Object c11;
                        Object emit = fVar.emit(showEvent, dVar);
                        c11 = n8.d.c();
                        return emit == c11 ? emit : w.f26638a;
                    }

                    @Override // g9.f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, m8.d dVar) {
                        return emit((ShowEvent) obj2, (m8.d<? super w>) dVar);
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (G.collect(fVar3, this) == c10) {
                    return c10;
                }
                return w.f26638a;
            }
            throw new IllegalStateException("No adPlayer associated with ad");
        }
        throw new IllegalStateException("No ad associated with opportunityId");
    }
}
