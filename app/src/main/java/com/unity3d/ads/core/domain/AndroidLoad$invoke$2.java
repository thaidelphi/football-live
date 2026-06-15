package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.LoadResult;
import d9.o0;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* compiled from: AndroidLoad.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {59, 61, 66, 68, 91, 94}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidLoad$invoke$2 extends l implements p<o0, m8.d<? super LoadResult>, Object> {
    final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
    final /* synthetic */ Context $context;
    final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ String $placement;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ AndroidLoad this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLoad$invoke$2(AndroidLoad androidLoad, AdRequestOuterClass.BannerSize bannerSize, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, String str, ByteString byteString, UnityAdsLoadOptions unityAdsLoadOptions, Context context, m8.d<? super AndroidLoad$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = androidLoad;
        this.$bannerSize = bannerSize;
        this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
        this.$placement = str;
        this.$opportunityId = byteString;
        this.$loadOptions = unityAdsLoadOptions;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new AndroidLoad$invoke$2(this.this$0, this.$bannerSize, this.$headerBiddingAdMarkup, this.$placement, this.$opportunityId, this.$loadOptions, this.$context, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super LoadResult> dVar) {
        return ((AndroidLoad$invoke$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b A[Catch: UnityAdsNetworkException -> 0x0023, TryCatch #0 {UnityAdsNetworkException -> 0x0023, blocks: (B:6:0x0015, B:83:0x0232, B:85:0x0236, B:86:0x024c, B:7:0x001c, B:78:0x021a, B:80:0x0220, B:87:0x0253, B:90:0x0258, B:91:0x025d, B:12:0x002c, B:63:0x0153, B:65:0x015b, B:67:0x0178, B:69:0x01e1, B:70:0x01ed, B:71:0x01f3, B:75:0x020b, B:15:0x003a, B:59:0x012a, B:18:0x0049, B:49:0x00ed, B:21:0x0057, B:45:0x00c4, B:24:0x0063, B:26:0x006f, B:28:0x0084, B:33:0x008d, B:35:0x0092, B:37:0x009f, B:41:0x00a6, B:51:0x00fb, B:55:0x0102, B:34:0x0090), top: B:94:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178 A[Catch: UnityAdsNetworkException -> 0x0023, TryCatch #0 {UnityAdsNetworkException -> 0x0023, blocks: (B:6:0x0015, B:83:0x0232, B:85:0x0236, B:86:0x024c, B:7:0x001c, B:78:0x021a, B:80:0x0220, B:87:0x0253, B:90:0x0258, B:91:0x025d, B:12:0x002c, B:63:0x0153, B:65:0x015b, B:67:0x0178, B:69:0x01e1, B:70:0x01ed, B:71:0x01f3, B:75:0x020b, B:15:0x003a, B:59:0x012a, B:18:0x0049, B:49:0x00ed, B:21:0x0057, B:45:0x00c4, B:24:0x0063, B:26:0x006f, B:28:0x0084, B:33:0x008d, B:35:0x0092, B:37:0x009f, B:41:0x00a6, B:51:0x00fb, B:55:0x0102, B:34:0x0090), top: B:94:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0220 A[Catch: UnityAdsNetworkException -> 0x0023, TryCatch #0 {UnityAdsNetworkException -> 0x0023, blocks: (B:6:0x0015, B:83:0x0232, B:85:0x0236, B:86:0x024c, B:7:0x001c, B:78:0x021a, B:80:0x0220, B:87:0x0253, B:90:0x0258, B:91:0x025d, B:12:0x002c, B:63:0x0153, B:65:0x015b, B:67:0x0178, B:69:0x01e1, B:70:0x01ed, B:71:0x01f3, B:75:0x020b, B:15:0x003a, B:59:0x012a, B:18:0x0049, B:49:0x00ed, B:21:0x0057, B:45:0x00c4, B:24:0x0063, B:26:0x006f, B:28:0x0084, B:33:0x008d, B:35:0x0092, B:37:0x009f, B:41:0x00a6, B:51:0x00fb, B:55:0x0102, B:34:0x0090), top: B:94:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0236 A[Catch: UnityAdsNetworkException -> 0x0023, TryCatch #0 {UnityAdsNetworkException -> 0x0023, blocks: (B:6:0x0015, B:83:0x0232, B:85:0x0236, B:86:0x024c, B:7:0x001c, B:78:0x021a, B:80:0x0220, B:87:0x0253, B:90:0x0258, B:91:0x025d, B:12:0x002c, B:63:0x0153, B:65:0x015b, B:67:0x0178, B:69:0x01e1, B:70:0x01ed, B:71:0x01f3, B:75:0x020b, B:15:0x003a, B:59:0x012a, B:18:0x0049, B:49:0x00ed, B:21:0x0057, B:45:0x00c4, B:24:0x0063, B:26:0x006f, B:28:0x0084, B:33:0x008d, B:35:0x0092, B:37:0x009f, B:41:0x00a6, B:51:0x00fb, B:55:0x0102, B:34:0x0090), top: B:94:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024c A[Catch: UnityAdsNetworkException -> 0x0023, TryCatch #0 {UnityAdsNetworkException -> 0x0023, blocks: (B:6:0x0015, B:83:0x0232, B:85:0x0236, B:86:0x024c, B:7:0x001c, B:78:0x021a, B:80:0x0220, B:87:0x0253, B:90:0x0258, B:91:0x025d, B:12:0x002c, B:63:0x0153, B:65:0x015b, B:67:0x0178, B:69:0x01e1, B:70:0x01ed, B:71:0x01f3, B:75:0x020b, B:15:0x003a, B:59:0x012a, B:18:0x0049, B:49:0x00ed, B:21:0x0057, B:45:0x00c4, B:24:0x0063, B:26:0x006f, B:28:0x0084, B:33:0x008d, B:35:0x0092, B:37:0x009f, B:41:0x00a6, B:51:0x00fb, B:55:0x0102, B:34:0x0090), top: B:94:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0253 A[Catch: UnityAdsNetworkException -> 0x0023, TryCatch #0 {UnityAdsNetworkException -> 0x0023, blocks: (B:6:0x0015, B:83:0x0232, B:85:0x0236, B:86:0x024c, B:7:0x001c, B:78:0x021a, B:80:0x0220, B:87:0x0253, B:90:0x0258, B:91:0x025d, B:12:0x002c, B:63:0x0153, B:65:0x015b, B:67:0x0178, B:69:0x01e1, B:70:0x01ed, B:71:0x01f3, B:75:0x020b, B:15:0x003a, B:59:0x012a, B:18:0x0049, B:49:0x00ed, B:21:0x0057, B:45:0x00c4, B:24:0x0063, B:26:0x006f, B:28:0x0084, B:33:0x008d, B:35:0x0092, B:37:0x009f, B:41:0x00a6, B:51:0x00fb, B:55:0x0102, B:34:0x0090), top: B:94:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
