package com.unity3d.ads.core.data.repository;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.j3;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidSessionRepository.kt */
@f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {j3.c.b.f17911b, j3.c.b.f17912c}, m = "setPrivacyFsm")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidSessionRepository$setPrivacyFsm$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$setPrivacyFsm$1(AndroidSessionRepository androidSessionRepository, m8.d<? super AndroidSessionRepository$setPrivacyFsm$1> dVar) {
        super(dVar);
        this.this$0 = androidSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.setPrivacyFsm(null, this);
    }
}
