package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidFetchSignalsAndSendUseCase.kt */
@f(c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", f = "AndroidFetchSignalsAndSendUseCase.kt", l = {31, 49}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidFetchSignalsAndSendUseCase$invoke$2 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ ByteString $tokenId;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidFetchSignalsAndSendUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFetchSignalsAndSendUseCase$invoke$2(AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase, ByteString byteString, d<? super AndroidFetchSignalsAndSendUseCase$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = androidFetchSignalsAndSendUseCase;
        this.$tokenId = byteString;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        AndroidFetchSignalsAndSendUseCase$invoke$2 androidFetchSignalsAndSendUseCase$invoke$2 = new AndroidFetchSignalsAndSendUseCase$invoke$2(this.this$0, this.$tokenId, dVar);
        androidFetchSignalsAndSendUseCase$invoke$2.L$0 = obj;
        return androidFetchSignalsAndSendUseCase$invoke$2;
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((AndroidFetchSignalsAndSendUseCase$invoke$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
