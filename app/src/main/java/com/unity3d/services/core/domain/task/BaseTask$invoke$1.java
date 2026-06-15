package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import i8.o;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseTask.kt */
@f(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class BaseTask$invoke$1<P extends BaseParams, R> extends d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseTask$invoke$1(m8.d<? super BaseTask$invoke$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object m54invokegIAlus = BaseTask.DefaultImpls.m54invokegIAlus(null, null, this);
        c10 = n8.d.c();
        return m54invokegIAlus == c10 ? m54invokegIAlus : o.a(m54invokegIAlus);
    }
}
