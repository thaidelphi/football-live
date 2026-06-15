package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import i8.o;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeSDK.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {120}, m = "executeErrorState-BWLJW6A")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeSDK$executeErrorState$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$executeErrorState$1(InitializeSDK initializeSDK, m8.d<? super InitializeSDK$executeErrorState$1> dVar) {
        super(dVar);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object m57executeErrorStateBWLJW6A;
        Object c10;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        m57executeErrorStateBWLJW6A = this.this$0.m57executeErrorStateBWLJW6A(null, null, null, this);
        c10 = n8.d.c();
        return m57executeErrorStateBWLJW6A == c10 ? m57executeErrorStateBWLJW6A : o.a(m57executeErrorStateBWLJW6A);
    }
}
