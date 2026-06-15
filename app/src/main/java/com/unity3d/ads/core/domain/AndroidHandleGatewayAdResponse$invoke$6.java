package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import d9.o0;
import gatewayprotocol.v1.AdResponseOuterClass;
import i8.w;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.a0;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidHandleGatewayAdResponse.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$6", f = "AndroidHandleGatewayAdResponse.kt", l = {183}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidHandleGatewayAdResponse$invoke$6 extends l implements p<o0, m8.d<? super w>, Object> {
    final /* synthetic */ a0<AdPlayer> $adPlayer;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ AdResponseOuterClass.AdResponse $response;
    final /* synthetic */ CancellationException $t;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$6(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, a0<AdPlayer> a0Var, m8.d<? super AndroidHandleGatewayAdResponse$invoke$6> dVar) {
        super(2, dVar);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$t = cancellationException;
        this.$opportunityId = byteString;
        this.$response = adResponse;
        this.$adPlayer = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new AndroidHandleGatewayAdResponse$invoke$6(this.this$0, this.$t, this.$opportunityId, this.$response, this.$adPlayer, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
        return ((AndroidHandleGatewayAdResponse$invoke$6) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object cleanup;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            this.label = 1;
            cleanup = this.this$0.cleanup(this.$t, this.$opportunityId, this.$response, this.$adPlayer.f27364a, this);
            if (cleanup == c10) {
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
