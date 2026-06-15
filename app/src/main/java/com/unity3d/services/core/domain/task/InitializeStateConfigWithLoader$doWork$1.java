package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import i8.o;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateConfigWithLoader.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader", f = "InitializeStateConfigWithLoader.kt", l = {33}, m = "doWork-gIAlu-s")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateConfigWithLoader$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, m8.d<? super InitializeStateConfigWithLoader$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateConfigWithLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object mo52doWorkgIAlus = this.this$0.mo52doWorkgIAlus((InitializeStateConfigWithLoader.Params) null, (m8.d<? super o<? extends Configuration>>) this);
        c10 = n8.d.c();
        return mo52doWorkgIAlus == c10 ? mo52doWorkgIAlus : o.a(mo52doWorkgIAlus);
    }
}
