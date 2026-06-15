package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import d9.o0;
import i8.o;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateLoadWeb.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {46, 64, 71}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateLoadWeb$doWork$2 extends l implements p<o0, d<? super o<? extends InitializeStateLoadWeb.LoadWebResult>>, Object> {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, d<? super InitializeStateLoadWeb$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, dVar);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<? super o<InitializeStateLoadWeb.LoadWebResult>> dVar) {
        return ((InitializeStateLoadWeb$doWork$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super o<? extends InitializeStateLoadWeb.LoadWebResult>> dVar) {
        return invoke2(o0Var, (d<? super o<InitializeStateLoadWeb.LoadWebResult>>) dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d5, code lost:
        com.unity3d.services.core.misc.Utilities.writeFile(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012f A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #1 {all -> 0x0044, blocks: (B:13:0x0037, B:43:0x0150, B:40:0x012f), top: B:80:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169 A[Catch: all -> 0x01ef, CancellationException -> 0x021c, TryCatch #6 {CancellationException -> 0x021c, all -> 0x01ef, blocks: (B:8:0x0018, B:51:0x0188, B:55:0x01ab, B:57:0x01b5, B:60:0x01c0, B:61:0x01d2, B:63:0x01d5, B:64:0x01e1, B:46:0x0163, B:48:0x0169, B:52:0x018b, B:53:0x019d, B:45:0x0159, B:38:0x0129, B:54:0x019e, B:37:0x011f, B:23:0x006f), top: B:80:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018b A[Catch: all -> 0x01ef, CancellationException -> 0x021c, TryCatch #6 {CancellationException -> 0x021c, all -> 0x01ef, blocks: (B:8:0x0018, B:51:0x0188, B:55:0x01ab, B:57:0x01b5, B:60:0x01c0, B:61:0x01d2, B:63:0x01d5, B:64:0x01e1, B:46:0x0163, B:48:0x0169, B:52:0x018b, B:53:0x019d, B:45:0x0159, B:38:0x0129, B:54:0x019e, B:37:0x011f, B:23:0x006f), top: B:80:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019e A[Catch: all -> 0x01ef, CancellationException -> 0x021c, TryCatch #6 {CancellationException -> 0x021c, all -> 0x01ef, blocks: (B:8:0x0018, B:51:0x0188, B:55:0x01ab, B:57:0x01b5, B:60:0x01c0, B:61:0x01d2, B:63:0x01d5, B:64:0x01e1, B:46:0x0163, B:48:0x0169, B:52:0x018b, B:53:0x019d, B:45:0x0159, B:38:0x0129, B:54:0x019e, B:37:0x011f, B:23:0x006f), top: B:80:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b5 A[Catch: all -> 0x01ef, CancellationException -> 0x021c, TryCatch #6 {CancellationException -> 0x021c, all -> 0x01ef, blocks: (B:8:0x0018, B:51:0x0188, B:55:0x01ab, B:57:0x01b5, B:60:0x01c0, B:61:0x01d2, B:63:0x01d5, B:64:0x01e1, B:46:0x0163, B:48:0x0169, B:52:0x018b, B:53:0x019d, B:45:0x0159, B:38:0x0129, B:54:0x019e, B:37:0x011f, B:23:0x006f), top: B:80:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0207  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
