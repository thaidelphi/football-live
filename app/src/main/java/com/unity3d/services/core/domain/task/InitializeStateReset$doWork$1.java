package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import i8.o;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateReset.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", l = {33}, m = "doWork-gIAlu-s$suspendImpl")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateReset$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, m8.d<? super InitializeStateReset$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object m68doWorkgIAlus$suspendImpl = InitializeStateReset.m68doWorkgIAlus$suspendImpl(this.this$0, null, this);
        c10 = n8.d.c();
        return m68doWorkgIAlus$suspendImpl == c10 ? m68doWorkgIAlus$suspendImpl : o.a(m68doWorkgIAlus$suspendImpl);
    }
}
