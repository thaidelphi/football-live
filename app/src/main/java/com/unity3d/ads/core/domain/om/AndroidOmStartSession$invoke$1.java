package com.unity3d.ads.core.domain.om;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidOmStartSession.kt */
@f(c = "com.unity3d.ads.core.domain.om.AndroidOmStartSession", f = "AndroidOmStartSession.kt", l = {18}, m = "invoke")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidOmStartSession$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidOmStartSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOmStartSession$invoke$1(AndroidOmStartSession androidOmStartSession, m8.d<? super AndroidOmStartSession$invoke$1> dVar) {
        super(dVar);
        this.this$0 = androidOmStartSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(null, null, this);
    }
}
