package com.unity3d.ads.core.domain.events;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EventObservers.kt */
@f(c = "com.unity3d.ads.core.domain.events.EventObservers", f = "EventObservers.kt", l = {16, 17, 18}, m = "invoke")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class EventObservers$invoke$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventObservers this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventObservers$invoke$1(EventObservers eventObservers, m8.d<? super EventObservers$invoke$1> dVar) {
        super(dVar);
        this.this$0 = eventObservers;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(this);
    }
}
