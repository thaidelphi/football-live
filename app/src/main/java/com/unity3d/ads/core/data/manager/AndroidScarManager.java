package com.unity3d.ads.core.data.manager;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.ServiceProvider;
import d9.z2;
import g9.e;
import g9.f;
import g9.g;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import i8.w;
import java.util.List;
import kotlin.jvm.internal.n;
import m8.d;
import u7.c;
/* compiled from: AndroidScarManager.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidScarManager implements ScarManager {
    private final GMAScarAdapterBridge gmaBridge;
    private final CommonScarEventReceiver scarEventReceiver;
    private final ScarTimeHackFixer scarTimeHackFixer;

    public AndroidScarManager(CommonScarEventReceiver scarEventReceiver, GMAScarAdapterBridge gmaBridge, ScarTimeHackFixer scarTimeHackFixer) {
        n.f(scarEventReceiver, "scarEventReceiver");
        n.f(gmaBridge, "gmaBridge");
        n.f(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = scarEventReceiver;
        this.gmaBridge = gmaBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getSignals(List<? extends InitializationResponseOuterClass.AdFormat> list, d<? super BiddingSignals> dVar) {
        return z2.d(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new AndroidScarManager$getSignals$2(list, this, null), dVar);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getVersion(d<? super String> dVar) {
        return z2.d(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT, new AndroidScarManager$getVersion$2(this, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadAd(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, m8.d<? super i8.w> r23) {
        /*
            r16 = this;
            r9 = r16
            r0 = r23
            boolean r1 = r0 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            if (r1 == 0) goto L17
            r1 = r0
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r1 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
            goto L1c
        L17:
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            r1.<init>(r9, r0)
        L1c:
            r10 = r1
            java.lang.Object r0 = r10.result
            java.lang.Object r11 = n8.b.c()
            int r1 = r10.label
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L37
            if (r1 != r13) goto L2f
            i8.p.b(r0)
            goto L73
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            i8.p.b(r0)
            u7.d r0 = u7.d.INTERSTITIAL
            java.lang.String r0 = r0.toString()
            r1 = r17
            boolean r2 = b9.f.l(r1, r0, r13)
            com.unity3d.ads.core.domain.scar.CommonScarEventReceiver r0 = r9.scarEventReceiver
            g9.a0 r14 = r0.getGmaEventFlow()
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2 r15 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2
            r8 = 0
            r0 = r15
            r1 = r16
            r3 = r18
            r4 = r21
            r5 = r19
            r6 = r20
            r7 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            g9.a0 r0 = g9.g.B(r14, r15)
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 r1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3
            r2 = r18
            r1.<init>(r2, r12)
            r10.label = r13
            java.lang.Object r0 = g9.g.s(r0, r1, r10)
            if (r0 != r11) goto L73
            return r11
        L73:
            r1 = r0
            com.unity3d.ads.core.domain.scar.GmaEventData r1 = (com.unity3d.ads.core.domain.scar.GmaEventData) r1
            com.unity3d.scar.adapter.common.c r1 = r1.getGmaEvent()
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.c.AD_LOADED
            r3 = 0
            if (r1 == r2) goto L80
            goto L81
        L80:
            r13 = r3
        L81:
            if (r13 == 0) goto L84
            r12 = r0
        L84:
            com.unity3d.ads.core.domain.scar.GmaEventData r12 = (com.unity3d.ads.core.domain.scar.GmaEventData) r12
            if (r12 == 0) goto La9
            com.unity3d.ads.core.data.model.exception.LoadException r0 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error loading SCAR ad: "
            r1.append(r2)
            java.lang.String r2 = r12.getErrorMessage()
            if (r2 != 0) goto L9e
            com.unity3d.scar.adapter.common.c r2 = r12.getGmaEvent()
        L9e:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            throw r0
        La9:
            i8.w r0 = i8.w.f26638a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, m8.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public e<GmaEventData> loadBannerAd(Context context, BannerView bannerView, c scarAdMetadata, UnityBannerSize bannerSize, final String opportunityId) {
        n.f(context, "context");
        n.f(bannerView, "bannerView");
        n.f(scarAdMetadata, "scarAdMetadata");
        n.f(bannerSize, "bannerSize");
        n.f(opportunityId, "opportunityId");
        final e A = g.A(this.scarEventReceiver.getGmaEventFlow(), new AndroidScarManager$loadBannerAd$1(this, context, bannerView, opportunityId, scarAdMetadata, bannerSize, null));
        return new e<GmaEventData>() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ String $opportunityId$inlined;
                final /* synthetic */ f $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", f = "AndroidScarManager.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
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

                public AnonymousClass2(f fVar, String str) {
                    this.$this_unsafeFlow = fVar;
                    this.$opportunityId$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, m8.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        i8.p.b(r8)
                        goto L5b
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        i8.p.b(r8)
                        g9.f r8 = r6.$this_unsafeFlow
                        r2 = r7
                        com.unity3d.ads.core.domain.scar.GmaEventData r2 = (com.unity3d.ads.core.domain.scar.GmaEventData) r2
                        com.unity3d.scar.adapter.common.c r4 = r2.getGmaEvent()
                        com.unity3d.scar.adapter.common.c r5 = com.unity3d.scar.adapter.common.c.BANNER
                        if (r4 != r5) goto L4f
                        java.lang.String r2 = r2.getOpportunityId()
                        java.lang.String r4 = r6.$opportunityId$inlined
                        boolean r2 = kotlin.jvm.internal.n.a(r2, r4)
                        if (r2 == 0) goto L4f
                        r2 = r3
                        goto L50
                    L4f:
                        r2 = 0
                    L50:
                        if (r2 == 0) goto L5b
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L5b
                        return r1
                    L5b:
                        i8.w r7 = i8.w.f26638a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super GmaEventData> fVar, d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar, opportunityId), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : w.f26638a;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public e<GmaEventData> show(String placementId, String queryId) {
        n.f(placementId, "placementId");
        n.f(queryId, "queryId");
        return g.G(g.B(this.scarEventReceiver.getGmaEventFlow(), new AndroidScarManager$show$1(this, placementId, queryId, null)), new AndroidScarManager$show$2(null));
    }
}
