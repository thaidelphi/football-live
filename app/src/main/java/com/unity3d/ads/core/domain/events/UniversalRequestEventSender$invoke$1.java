package com.unity3d.ads.core.domain.events;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UniversalRequestEventSender.kt */
@f(c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", f = "UniversalRequestEventSender.kt", l = {21, 35}, m = "invoke")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UniversalRequestEventSender$invoke$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UniversalRequestEventSender this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestEventSender$invoke$1(UniversalRequestEventSender universalRequestEventSender, m8.d<? super UniversalRequestEventSender$invoke$1> dVar) {
        super(dVar);
        this.this$0 = universalRequestEventSender;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(null, null, this);
    }
}
