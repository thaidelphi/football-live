package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import i8.o;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateCreate.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateCreate", f = "InitializeStateCreate.kt", l = {28}, m = "doWork-gIAlu-s")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateCreate$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateCreate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateCreate$doWork$1(InitializeStateCreate initializeStateCreate, m8.d<? super InitializeStateCreate$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateCreate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object m63doWorkgIAlus = this.this$0.m63doWorkgIAlus((InitializeStateCreate.Params) null, (m8.d<? super o<? extends Configuration>>) this);
        c10 = n8.d.c();
        return m63doWorkgIAlus == c10 ? m63doWorkgIAlus : o.a(m63doWorkgIAlus);
    }
}
