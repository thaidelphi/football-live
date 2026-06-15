package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import i8.o;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateLoadCache.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache", f = "InitializeStateLoadCache.kt", l = {32}, m = "doWork-gIAlu-s")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateLoadCache$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadCache$doWork$1(InitializeStateLoadCache initializeStateLoadCache, m8.d<? super InitializeStateLoadCache$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateLoadCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object m65doWorkgIAlus = this.this$0.m65doWorkgIAlus((InitializeStateLoadCache.Params) null, (m8.d<? super o<InitializeStateLoadCache.LoadCacheResult>>) this);
        c10 = n8.d.c();
        return m65doWorkgIAlus == c10 ? m65doWorkgIAlus : o.a(m65doWorkgIAlus);
    }
}
