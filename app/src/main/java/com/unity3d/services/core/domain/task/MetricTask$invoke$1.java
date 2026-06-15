package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import i8.o;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MetricTask.kt */
@f(c = "com.unity3d.services.core.domain.task.MetricTask", f = "MetricTask.kt", l = {24}, m = "invoke-gIAlu-s$suspendImpl")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class MetricTask$invoke$1 extends d {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask<P, R> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MetricTask$invoke$1(MetricTask<? super P, R> metricTask, m8.d<? super MetricTask$invoke$1> dVar) {
        super(dVar);
        this.this$0 = metricTask;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object m70invokegIAlus$suspendImpl = MetricTask.m70invokegIAlus$suspendImpl(this.this$0, null, this);
        c10 = n8.d.c();
        return m70invokegIAlus$suspendImpl == c10 ? m70invokegIAlus$suspendImpl : o.a(m70invokegIAlus$suspendImpl);
    }
}
