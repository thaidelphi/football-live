package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidScarManager.kt */
@f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidScarManager$loadAd$2 extends l implements p<g9.f<? super GmaEventData>, d<? super w>, Object> {
    final /* synthetic */ String $adString;
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ boolean $canSkip;
    final /* synthetic */ String $placementId;
    final /* synthetic */ String $queryId;
    final /* synthetic */ int $videoLength;
    int label;
    final /* synthetic */ AndroidScarManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$loadAd$2(AndroidScarManager androidScarManager, boolean z10, String str, String str2, String str3, String str4, int i10, d<? super AndroidScarManager$loadAd$2> dVar) {
        super(2, dVar);
        this.this$0 = androidScarManager;
        this.$canSkip = z10;
        this.$placementId = str;
        this.$queryId = str2;
        this.$adString = str3;
        this.$adUnitId = str4;
        this.$videoLength = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidScarManager$loadAd$2(this.this$0, this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, dVar);
    }

    @Override // t8.p
    public final Object invoke(g9.f<? super GmaEventData> fVar, d<? super w> dVar) {
        return ((AndroidScarManager$loadAd$2) create(fVar, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GMAScarAdapterBridge gMAScarAdapterBridge;
        ScarTimeHackFixer scarTimeHackFixer;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            gMAScarAdapterBridge = this.this$0.gmaBridge;
            boolean z10 = this.$canSkip;
            String str = this.$placementId;
            String str2 = this.$queryId;
            String str3 = this.$adString;
            String str4 = this.$adUnitId;
            scarTimeHackFixer = this.this$0.scarTimeHackFixer;
            gMAScarAdapterBridge.load(z10, str, str2, str3, str4, scarTimeHackFixer.invoke(this.$videoLength));
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
