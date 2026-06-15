package com.unity3d.ads.core.data.repository;

import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.iab.omid.library.unity3d.adsession.Partner;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import d9.o0;
import i8.w;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidOpenMeasurementRepository.kt */
@f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidOpenMeasurementRepository$startSession$2 extends l implements p<o0, d<? super OMResult>, Object> {
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ OmidOptions $options;
    final /* synthetic */ WebView $webView;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* compiled from: AndroidOpenMeasurementRepository.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreativeType.values().length];
            try {
                iArr[CreativeType.HTML_DISPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreativeType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$startSession$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, OmidOptions omidOptions, WebView webView, d<? super AndroidOpenMeasurementRepository$startSession$2> dVar) {
        super(2, dVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
        this.$options = omidOptions;
        this.$webView = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidOpenMeasurementRepository$startSession$2(this.this$0, this.$opportunityId, this.$options, this.$webView, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super OMResult> dVar) {
        return ((AndroidOpenMeasurementRepository$startSession$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        g9.w wVar;
        OmidManager omidManager;
        OmidManager omidManager2;
        Partner partner;
        AdSessionContext createHtmlAdSessionContext;
        OmidManager omidManager3;
        OmidManager omidManager4;
        Partner partner2;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            try {
                if (this.this$0.isOMActive()) {
                    wVar = this.this$0.activeSessions;
                    if (((Map) wVar.getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                        return new OMResult.Failure("om_session_already_exists", null, 2, null);
                    }
                    CreativeType creativeType = this.$options.getCreativeType();
                    if (creativeType == null) {
                        return new OMResult.Failure("om_creative_type_null", null, 2, null);
                    }
                    omidManager = this.this$0.omidManager;
                    ImpressionType impressionType = this.$options.getImpressionType();
                    if (impressionType == null) {
                        impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
                    }
                    ImpressionType impressionType2 = impressionType;
                    Owner impressionOwner = this.$options.getImpressionOwner();
                    if (impressionOwner == null) {
                        impressionOwner = Owner.JAVASCRIPT;
                    }
                    Owner owner = impressionOwner;
                    Owner videoEventsOwner = this.$options.getVideoEventsOwner();
                    if (videoEventsOwner == null) {
                        videoEventsOwner = Owner.JAVASCRIPT;
                    }
                    AdSessionConfiguration createAdSessionConfiguration = omidManager.createAdSessionConfiguration(creativeType, impressionType2, owner, videoEventsOwner, this.$options.getIsolateVerificationScripts());
                    int i10 = WhenMappings.$EnumSwitchMapping$0[creativeType.ordinal()];
                    if (i10 == 1) {
                        omidManager2 = this.this$0.omidManager;
                        partner = this.this$0.partner;
                        createHtmlAdSessionContext = omidManager2.createHtmlAdSessionContext(partner, this.$webView, null, this.$options.getCustomReferenceData());
                    } else if (i10 == 2) {
                        omidManager4 = this.this$0.omidManager;
                        partner2 = this.this$0.partner;
                        createHtmlAdSessionContext = omidManager4.createJavaScriptAdSessionContext(partner2, this.$webView, null, this.$options.getCustomReferenceData());
                    } else {
                        return new OMResult.Failure("om_creative_type_invalid", null, 2, null);
                    }
                    omidManager3 = this.this$0.omidManager;
                    AdSession createAdSession = omidManager3.createAdSession(createAdSessionConfiguration, createHtmlAdSessionContext);
                    createAdSession.registerAdView(this.$webView);
                    createAdSession.start();
                    this.this$0.addSession(this.$opportunityId, createAdSession);
                    return OMResult.Success.INSTANCE;
                }
                return new OMResult.Failure("om_not_active", null, 2, null);
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
