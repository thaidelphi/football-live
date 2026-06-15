package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.unity3d.ads.core.data.model.OMResult;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidOpenMeasurementRepository.kt */
@f(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidOpenMeasurementRepository$finishSession$2 extends l implements p<o0, d<? super OMResult>, Object> {
    final /* synthetic */ ByteString $opportunityId;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$finishSession$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, d<? super AndroidOpenMeasurementRepository$finishSession$2> dVar) {
        super(2, dVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidOpenMeasurementRepository$finishSession$2(this.this$0, this.$opportunityId, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super OMResult> dVar) {
        return ((AndroidOpenMeasurementRepository$finishSession$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AdSession session;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            if (this.this$0.isOMActive()) {
                session = this.this$0.getSession(this.$opportunityId);
                if (session == null) {
                    return new OMResult.Failure("om_session_not_found", null, 2, null);
                }
                session.finish();
                this.this$0.sessionFinished(this.$opportunityId);
                return OMResult.Success.INSTANCE;
            }
            return new OMResult.Failure("om_not_active", null, 2, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
