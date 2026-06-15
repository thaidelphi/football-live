package com.unity3d.services.core.extensions;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskExtensions.kt */
@f(c = "com.unity3d.services.core.extensions.TaskExtensionsKt", f = "TaskExtensions.kt", l = {17, 30}, m = "withRetry")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TaskExtensionsKt$withRetry$1<T> extends d {
    double D$0;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskExtensionsKt$withRetry$1(m8.d<? super TaskExtensionsKt$withRetry$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return TaskExtensionsKt.withRetry(0L, 0, 0.0d, null, null, this);
    }
}
