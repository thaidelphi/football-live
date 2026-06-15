package com.unity3d.services.core.domain.task;

import d9.o0;
import i8.o;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeSDK.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", l = {48, 53, 58, 60, 65, 67, 71, 74, 89, 92, 100, 103, 106}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeSDK$doWork$2 extends l implements p<o0, d<? super o<? extends w>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2(InitializeSDK initializeSDK, d<? super InitializeSDK$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, dVar);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<? super o<w>> dVar) {
        return ((InitializeSDK$doWork$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super o<? extends w>> dVar) {
        return invoke2(o0Var, (d<? super o<w>>) dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x011d, code lost:
        if (r5 == null) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c8 A[Catch: all -> 0x035d, CancellationException -> 0x038a, TryCatch #2 {CancellationException -> 0x038a, all -> 0x035d, blocks: (B:6:0x0013, B:128:0x0347, B:9:0x0024, B:125:0x032a, B:12:0x002f, B:120:0x0311, B:122:0x0317, B:15:0x0042, B:113:0x02dd, B:116:0x02ee, B:18:0x004d, B:108:0x02c2, B:110:0x02c8, B:22:0x005d, B:94:0x025c, B:96:0x0262, B:97:0x026d, B:25:0x0075, B:88:0x023c, B:90:0x0242, B:98:0x026e, B:100:0x0279, B:102:0x0283, B:104:0x0289, B:105:0x02a0, B:114:0x02e8, B:129:0x0351, B:130:0x035c, B:28:0x008e, B:85:0x021b, B:31:0x009f, B:80:0x01ff, B:82:0x0205, B:34:0x00b0, B:73:0x01d4, B:75:0x01da, B:76:0x01e5, B:37:0x00c6, B:67:0x01b7, B:69:0x01bd, B:77:0x01e6, B:40:0x00d9, B:58:0x0171, B:60:0x0177, B:61:0x018f, B:64:0x019b, B:44:0x00ee, B:54:0x0153, B:55:0x0155, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0317 A[Catch: all -> 0x035d, CancellationException -> 0x038a, TryCatch #2 {CancellationException -> 0x038a, all -> 0x035d, blocks: (B:6:0x0013, B:128:0x0347, B:9:0x0024, B:125:0x032a, B:12:0x002f, B:120:0x0311, B:122:0x0317, B:15:0x0042, B:113:0x02dd, B:116:0x02ee, B:18:0x004d, B:108:0x02c2, B:110:0x02c8, B:22:0x005d, B:94:0x025c, B:96:0x0262, B:97:0x026d, B:25:0x0075, B:88:0x023c, B:90:0x0242, B:98:0x026e, B:100:0x0279, B:102:0x0283, B:104:0x0289, B:105:0x02a0, B:114:0x02e8, B:129:0x0351, B:130:0x035c, B:28:0x008e, B:85:0x021b, B:31:0x009f, B:80:0x01ff, B:82:0x0205, B:34:0x00b0, B:73:0x01d4, B:75:0x01da, B:76:0x01e5, B:37:0x00c6, B:67:0x01b7, B:69:0x01bd, B:77:0x01e6, B:40:0x00d9, B:58:0x0171, B:60:0x0177, B:61:0x018f, B:64:0x019b, B:44:0x00ee, B:54:0x0153, B:55:0x0155, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0346 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177 A[Catch: all -> 0x035d, CancellationException -> 0x038a, TryCatch #2 {CancellationException -> 0x038a, all -> 0x035d, blocks: (B:6:0x0013, B:128:0x0347, B:9:0x0024, B:125:0x032a, B:12:0x002f, B:120:0x0311, B:122:0x0317, B:15:0x0042, B:113:0x02dd, B:116:0x02ee, B:18:0x004d, B:108:0x02c2, B:110:0x02c8, B:22:0x005d, B:94:0x025c, B:96:0x0262, B:97:0x026d, B:25:0x0075, B:88:0x023c, B:90:0x0242, B:98:0x026e, B:100:0x0279, B:102:0x0283, B:104:0x0289, B:105:0x02a0, B:114:0x02e8, B:129:0x0351, B:130:0x035c, B:28:0x008e, B:85:0x021b, B:31:0x009f, B:80:0x01ff, B:82:0x0205, B:34:0x00b0, B:73:0x01d4, B:75:0x01da, B:76:0x01e5, B:37:0x00c6, B:67:0x01b7, B:69:0x01bd, B:77:0x01e6, B:40:0x00d9, B:58:0x0171, B:60:0x0177, B:61:0x018f, B:64:0x019b, B:44:0x00ee, B:54:0x0153, B:55:0x0155, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bd A[Catch: all -> 0x035d, CancellationException -> 0x038a, TryCatch #2 {CancellationException -> 0x038a, all -> 0x035d, blocks: (B:6:0x0013, B:128:0x0347, B:9:0x0024, B:125:0x032a, B:12:0x002f, B:120:0x0311, B:122:0x0317, B:15:0x0042, B:113:0x02dd, B:116:0x02ee, B:18:0x004d, B:108:0x02c2, B:110:0x02c8, B:22:0x005d, B:94:0x025c, B:96:0x0262, B:97:0x026d, B:25:0x0075, B:88:0x023c, B:90:0x0242, B:98:0x026e, B:100:0x0279, B:102:0x0283, B:104:0x0289, B:105:0x02a0, B:114:0x02e8, B:129:0x0351, B:130:0x035c, B:28:0x008e, B:85:0x021b, B:31:0x009f, B:80:0x01ff, B:82:0x0205, B:34:0x00b0, B:73:0x01d4, B:75:0x01da, B:76:0x01e5, B:37:0x00c6, B:67:0x01b7, B:69:0x01bd, B:77:0x01e6, B:40:0x00d9, B:58:0x0171, B:60:0x0177, B:61:0x018f, B:64:0x019b, B:44:0x00ee, B:54:0x0153, B:55:0x0155, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da A[Catch: all -> 0x035d, CancellationException -> 0x038a, TryCatch #2 {CancellationException -> 0x038a, all -> 0x035d, blocks: (B:6:0x0013, B:128:0x0347, B:9:0x0024, B:125:0x032a, B:12:0x002f, B:120:0x0311, B:122:0x0317, B:15:0x0042, B:113:0x02dd, B:116:0x02ee, B:18:0x004d, B:108:0x02c2, B:110:0x02c8, B:22:0x005d, B:94:0x025c, B:96:0x0262, B:97:0x026d, B:25:0x0075, B:88:0x023c, B:90:0x0242, B:98:0x026e, B:100:0x0279, B:102:0x0283, B:104:0x0289, B:105:0x02a0, B:114:0x02e8, B:129:0x0351, B:130:0x035c, B:28:0x008e, B:85:0x021b, B:31:0x009f, B:80:0x01ff, B:82:0x0205, B:34:0x00b0, B:73:0x01d4, B:75:0x01da, B:76:0x01e5, B:37:0x00c6, B:67:0x01b7, B:69:0x01bd, B:77:0x01e6, B:40:0x00d9, B:58:0x0171, B:60:0x0177, B:61:0x018f, B:64:0x019b, B:44:0x00ee, B:54:0x0153, B:55:0x0155, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6 A[Catch: all -> 0x035d, CancellationException -> 0x038a, TryCatch #2 {CancellationException -> 0x038a, all -> 0x035d, blocks: (B:6:0x0013, B:128:0x0347, B:9:0x0024, B:125:0x032a, B:12:0x002f, B:120:0x0311, B:122:0x0317, B:15:0x0042, B:113:0x02dd, B:116:0x02ee, B:18:0x004d, B:108:0x02c2, B:110:0x02c8, B:22:0x005d, B:94:0x025c, B:96:0x0262, B:97:0x026d, B:25:0x0075, B:88:0x023c, B:90:0x0242, B:98:0x026e, B:100:0x0279, B:102:0x0283, B:104:0x0289, B:105:0x02a0, B:114:0x02e8, B:129:0x0351, B:130:0x035c, B:28:0x008e, B:85:0x021b, B:31:0x009f, B:80:0x01ff, B:82:0x0205, B:34:0x00b0, B:73:0x01d4, B:75:0x01da, B:76:0x01e5, B:37:0x00c6, B:67:0x01b7, B:69:0x01bd, B:77:0x01e6, B:40:0x00d9, B:58:0x0171, B:60:0x0177, B:61:0x018f, B:64:0x019b, B:44:0x00ee, B:54:0x0153, B:55:0x0155, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0205 A[Catch: all -> 0x035d, CancellationException -> 0x038a, TryCatch #2 {CancellationException -> 0x038a, all -> 0x035d, blocks: (B:6:0x0013, B:128:0x0347, B:9:0x0024, B:125:0x032a, B:12:0x002f, B:120:0x0311, B:122:0x0317, B:15:0x0042, B:113:0x02dd, B:116:0x02ee, B:18:0x004d, B:108:0x02c2, B:110:0x02c8, B:22:0x005d, B:94:0x025c, B:96:0x0262, B:97:0x026d, B:25:0x0075, B:88:0x023c, B:90:0x0242, B:98:0x026e, B:100:0x0279, B:102:0x0283, B:104:0x0289, B:105:0x02a0, B:114:0x02e8, B:129:0x0351, B:130:0x035c, B:28:0x008e, B:85:0x021b, B:31:0x009f, B:80:0x01ff, B:82:0x0205, B:34:0x00b0, B:73:0x01d4, B:75:0x01da, B:76:0x01e5, B:37:0x00c6, B:67:0x01b7, B:69:0x01bd, B:77:0x01e6, B:40:0x00d9, B:58:0x0171, B:60:0x0177, B:61:0x018f, B:64:0x019b, B:44:0x00ee, B:54:0x0153, B:55:0x0155, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0242 A[Catch: all -> 0x035d, CancellationException -> 0x038a, TryCatch #2 {CancellationException -> 0x038a, all -> 0x035d, blocks: (B:6:0x0013, B:128:0x0347, B:9:0x0024, B:125:0x032a, B:12:0x002f, B:120:0x0311, B:122:0x0317, B:15:0x0042, B:113:0x02dd, B:116:0x02ee, B:18:0x004d, B:108:0x02c2, B:110:0x02c8, B:22:0x005d, B:94:0x025c, B:96:0x0262, B:97:0x026d, B:25:0x0075, B:88:0x023c, B:90:0x0242, B:98:0x026e, B:100:0x0279, B:102:0x0283, B:104:0x0289, B:105:0x02a0, B:114:0x02e8, B:129:0x0351, B:130:0x035c, B:28:0x008e, B:85:0x021b, B:31:0x009f, B:80:0x01ff, B:82:0x0205, B:34:0x00b0, B:73:0x01d4, B:75:0x01da, B:76:0x01e5, B:37:0x00c6, B:67:0x01b7, B:69:0x01bd, B:77:0x01e6, B:40:0x00d9, B:58:0x0171, B:60:0x0177, B:61:0x018f, B:64:0x019b, B:44:0x00ee, B:54:0x0153, B:55:0x0155, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0262 A[Catch: all -> 0x035d, CancellationException -> 0x038a, TryCatch #2 {CancellationException -> 0x038a, all -> 0x035d, blocks: (B:6:0x0013, B:128:0x0347, B:9:0x0024, B:125:0x032a, B:12:0x002f, B:120:0x0311, B:122:0x0317, B:15:0x0042, B:113:0x02dd, B:116:0x02ee, B:18:0x004d, B:108:0x02c2, B:110:0x02c8, B:22:0x005d, B:94:0x025c, B:96:0x0262, B:97:0x026d, B:25:0x0075, B:88:0x023c, B:90:0x0242, B:98:0x026e, B:100:0x0279, B:102:0x0283, B:104:0x0289, B:105:0x02a0, B:114:0x02e8, B:129:0x0351, B:130:0x035c, B:28:0x008e, B:85:0x021b, B:31:0x009f, B:80:0x01ff, B:82:0x0205, B:34:0x00b0, B:73:0x01d4, B:75:0x01da, B:76:0x01e5, B:37:0x00c6, B:67:0x01b7, B:69:0x01bd, B:77:0x01e6, B:40:0x00d9, B:58:0x0171, B:60:0x0177, B:61:0x018f, B:64:0x019b, B:44:0x00ee, B:54:0x0153, B:55:0x0155, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026e A[Catch: all -> 0x035d, CancellationException -> 0x038a, TryCatch #2 {CancellationException -> 0x038a, all -> 0x035d, blocks: (B:6:0x0013, B:128:0x0347, B:9:0x0024, B:125:0x032a, B:12:0x002f, B:120:0x0311, B:122:0x0317, B:15:0x0042, B:113:0x02dd, B:116:0x02ee, B:18:0x004d, B:108:0x02c2, B:110:0x02c8, B:22:0x005d, B:94:0x025c, B:96:0x0262, B:97:0x026d, B:25:0x0075, B:88:0x023c, B:90:0x0242, B:98:0x026e, B:100:0x0279, B:102:0x0283, B:104:0x0289, B:105:0x02a0, B:114:0x02e8, B:129:0x0351, B:130:0x035c, B:28:0x008e, B:85:0x021b, B:31:0x009f, B:80:0x01ff, B:82:0x0205, B:34:0x00b0, B:73:0x01d4, B:75:0x01da, B:76:0x01e5, B:37:0x00c6, B:67:0x01b7, B:69:0x01bd, B:77:0x01e6, B:40:0x00d9, B:58:0x0171, B:60:0x0177, B:61:0x018f, B:64:0x019b, B:44:0x00ee, B:54:0x0153, B:55:0x0155, B:47:0x00fc, B:49:0x0119, B:51:0x011f), top: B:143:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
