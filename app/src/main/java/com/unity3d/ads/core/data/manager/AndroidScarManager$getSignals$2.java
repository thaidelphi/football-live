package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.extensions.AdFormatExtensionsKt;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import d9.n;
import d9.o;
import d9.o0;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import i8.o;
import i8.w;
import j8.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import n8.c;
import t8.p;
/* compiled from: AndroidScarManager.kt */
@f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", f = "AndroidScarManager.kt", l = {130}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidScarManager$getSignals$2 extends l implements p<o0, d<? super BiddingSignals>, Object> {
    final /* synthetic */ List<InitializationResponseOuterClass.AdFormat> $adFormat;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AndroidScarManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidScarManager$getSignals$2(List<? extends InitializationResponseOuterClass.AdFormat> list, AndroidScarManager androidScarManager, d<? super AndroidScarManager$getSignals$2> dVar) {
        super(2, dVar);
        this.$adFormat = list;
        this.this$0 = androidScarManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidScarManager$getSignals$2(this.$adFormat, this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super BiddingSignals> dVar) {
        return ((AndroidScarManager$getSignals$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        d b10;
        ArrayList arrayList;
        GMAScarAdapterBridge gMAScarAdapterBridge;
        Object c11;
        int k10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            List<InitializationResponseOuterClass.AdFormat> list = this.$adFormat;
            AndroidScarManager androidScarManager = this.this$0;
            this.L$0 = list;
            this.L$1 = androidScarManager;
            this.label = 1;
            b10 = c.b(this);
            final o oVar = new o(b10, 1);
            oVar.C();
            if (list != null) {
                k10 = r.k(list, 10);
                arrayList = new ArrayList(k10);
                for (InitializationResponseOuterClass.AdFormat adFormat : list) {
                    arrayList.add(AdFormatExtensionsKt.toUnityAdFormat(adFormat));
                }
            } else {
                arrayList = null;
            }
            gMAScarAdapterBridge = androidScarManager.gmaBridge;
            gMAScarAdapterBridge.getSCARBiddingSignals(arrayList, new BiddingSignalsHandler(true, new IBiddingSignalsListener() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2$1$1
                @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                public void onSignalsFailure(String str) {
                    n<BiddingSignals> nVar = oVar;
                    o.a aVar = i8.o.f26626b;
                    nVar.resumeWith(i8.o.b(i8.p.a(new Exception(str))));
                }

                @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                public void onSignalsReady(BiddingSignals biddingSignals) {
                    n<BiddingSignals> nVar = oVar;
                    o.a aVar = i8.o.f26626b;
                    nVar.resumeWith(i8.o.b(biddingSignals));
                }
            }));
            obj = oVar.z();
            c11 = n8.d.c();
            if (obj == c11) {
                h.c(this);
            }
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            AndroidScarManager androidScarManager2 = (AndroidScarManager) this.L$1;
            List list2 = (List) this.L$0;
            i8.p.b(obj);
        }
        return obj;
    }
}
