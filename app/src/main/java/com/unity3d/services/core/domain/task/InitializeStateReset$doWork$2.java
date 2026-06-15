package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import d9.o0;
import i8.o;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateReset.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", l = {41}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateReset$doWork$2 extends l implements p<o0, d<? super o<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateReset.Params $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, d<? super InitializeStateReset$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super o<? extends Configuration>> dVar) {
        return ((InitializeStateReset$doWork$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: all -> 0x00c6, CancellationException -> 0x00f3, TryCatch #2 {CancellationException -> 0x00f3, all -> 0x00c6, blocks: (B:6:0x0014, B:22:0x005d, B:27:0x006b, B:29:0x007a, B:31:0x0080, B:33:0x008e, B:34:0x0090, B:36:0x0093, B:38:0x009f, B:39:0x00aa, B:40:0x00ad, B:41:0x00b6, B:42:0x00bd, B:43:0x00be, B:44:0x00c5, B:25:0x0063, B:26:0x006a, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[Catch: all -> 0x00c6, CancellationException -> 0x00f3, TryCatch #2 {CancellationException -> 0x00f3, all -> 0x00c6, blocks: (B:6:0x0014, B:22:0x005d, B:27:0x006b, B:29:0x007a, B:31:0x0080, B:33:0x008e, B:34:0x0090, B:36:0x0093, B:38:0x009f, B:39:0x00aa, B:40:0x00ad, B:41:0x00b6, B:42:0x00bd, B:43:0x00be, B:44:0x00c5, B:25:0x0063, B:26:0x006a, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
