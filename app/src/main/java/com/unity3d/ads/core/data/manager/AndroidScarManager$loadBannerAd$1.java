package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
import u7.c;
/* compiled from: AndroidScarManager.kt */
@f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidScarManager$loadBannerAd$1 extends l implements p<g9.f<? super GmaEventData>, d<? super w>, Object> {
    final /* synthetic */ UnityBannerSize $bannerSize;
    final /* synthetic */ BannerView $bannerView;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $opportunityId;
    final /* synthetic */ c $scarAdMetadata;
    int label;
    final /* synthetic */ AndroidScarManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$loadBannerAd$1(AndroidScarManager androidScarManager, Context context, BannerView bannerView, String str, c cVar, UnityBannerSize unityBannerSize, d<? super AndroidScarManager$loadBannerAd$1> dVar) {
        super(2, dVar);
        this.this$0 = androidScarManager;
        this.$context = context;
        this.$bannerView = bannerView;
        this.$opportunityId = str;
        this.$scarAdMetadata = cVar;
        this.$bannerSize = unityBannerSize;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidScarManager$loadBannerAd$1(this.this$0, this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, dVar);
    }

    @Override // t8.p
    public final Object invoke(g9.f<? super GmaEventData> fVar, d<? super w> dVar) {
        return ((AndroidScarManager$loadBannerAd$1) create(fVar, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GMAScarAdapterBridge gMAScarAdapterBridge;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            gMAScarAdapterBridge = this.this$0.gmaBridge;
            gMAScarAdapterBridge.loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
