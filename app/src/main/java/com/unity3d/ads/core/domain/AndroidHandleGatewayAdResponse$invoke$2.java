package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import t8.p;
/* compiled from: AndroidHandleGatewayAdResponse.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", l = {123}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidHandleGatewayAdResponse$invoke$2 extends l implements p<AllowedPiiOuterClass.AllowedPii, m8.d<? super w>, Object> {
    final /* synthetic */ a0<AdPlayer> $adPlayer;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$2(a0<AdPlayer> a0Var, m8.d<? super AndroidHandleGatewayAdResponse$invoke$2> dVar) {
        super(2, dVar);
        this.$adPlayer = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        AndroidHandleGatewayAdResponse$invoke$2 androidHandleGatewayAdResponse$invoke$2 = new AndroidHandleGatewayAdResponse$invoke$2(this.$adPlayer, dVar);
        androidHandleGatewayAdResponse$invoke$2.L$0 = obj;
        return androidHandleGatewayAdResponse$invoke$2;
    }

    @Override // t8.p
    public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, m8.d<? super w> dVar) {
        return ((AndroidHandleGatewayAdResponse$invoke$2) create(allowedPii, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            byte[] byteArray = ((AllowedPiiOuterClass.AllowedPii) this.L$0).toByteArray();
            n.e(byteArray, "it.toByteArray()");
            this.label = 1;
            if (this.$adPlayer.f27364a.onAllowedPiiChange(byteArray, this) == c10) {
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
