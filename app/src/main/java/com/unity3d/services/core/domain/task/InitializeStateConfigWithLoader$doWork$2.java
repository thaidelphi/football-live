package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import d9.o0;
import i8.o;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateConfigWithLoader.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", l = {58, 101, 109}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateConfigWithLoader$doWork$2 extends l implements p<o0, d<? super o<? extends Configuration>>, Object> {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, d<? super InitializeStateConfigWithLoader$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, dVar);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super o<? extends Configuration>> dVar) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0162 A[Catch: all -> 0x0215, CancellationException -> 0x0242, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0242, all -> 0x0215, blocks: (B:8:0x001f, B:57:0x01d9, B:63:0x020a, B:51:0x01a3, B:53:0x01ab, B:58:0x01e3, B:59:0x01f5, B:50:0x0199, B:38:0x0159, B:40:0x0162, B:60:0x01f6, B:61:0x0203, B:62:0x0204, B:37:0x014f, B:23:0x0080), top: B:87:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ab A[Catch: all -> 0x0215, CancellationException -> 0x0242, TryCatch #7 {CancellationException -> 0x0242, all -> 0x0215, blocks: (B:8:0x001f, B:57:0x01d9, B:63:0x020a, B:51:0x01a3, B:53:0x01ab, B:58:0x01e3, B:59:0x01f5, B:50:0x0199, B:38:0x0159, B:40:0x0162, B:60:0x01f6, B:61:0x0203, B:62:0x0204, B:37:0x014f, B:23:0x0080), top: B:87:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e3 A[Catch: all -> 0x0215, CancellationException -> 0x0242, TryCatch #7 {CancellationException -> 0x0242, all -> 0x0215, blocks: (B:8:0x001f, B:57:0x01d9, B:63:0x020a, B:51:0x01a3, B:53:0x01ab, B:58:0x01e3, B:59:0x01f5, B:50:0x0199, B:38:0x0159, B:40:0x0162, B:60:0x01f6, B:61:0x0203, B:62:0x0204, B:37:0x014f, B:23:0x0080), top: B:87:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0204 A[Catch: all -> 0x0215, CancellationException -> 0x0242, TryCatch #7 {CancellationException -> 0x0242, all -> 0x0215, blocks: (B:8:0x001f, B:57:0x01d9, B:63:0x020a, B:51:0x01a3, B:53:0x01ab, B:58:0x01e3, B:59:0x01f5, B:50:0x0199, B:38:0x0159, B:40:0x0162, B:60:0x01f6, B:61:0x0203, B:62:0x0204, B:37:0x014f, B:23:0x0080), top: B:87:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022d  */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, com.unity3d.services.core.configuration.Configuration] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, com.unity3d.services.core.configuration.PrivacyConfigurationLoader] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.unity3d.services.core.configuration.ConfigurationLoader] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
