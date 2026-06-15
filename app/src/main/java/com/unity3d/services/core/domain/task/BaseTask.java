package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import i8.o;
import m8.d;
/* compiled from: BaseTask.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    /* compiled from: BaseTask.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class DefaultImpls {
        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* renamed from: invoke-gIAlu-s  reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static <P extends com.unity3d.services.core.domain.task.BaseParams, R> java.lang.Object m54invokegIAlus(com.unity3d.services.core.domain.task.BaseTask<? super P, R> r4, P r5, m8.d<? super i8.o<? extends R>> r6) {
            /*
                boolean r0 = r6 instanceof com.unity3d.services.core.domain.task.BaseTask$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.BaseTask$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.BaseTask$invoke$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = n8.b.c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                i8.p.b(r6)
                i8.o r6 = (i8.o) r6
                java.lang.Object r4 = r6.i()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                i8.p.b(r6)
                r0.label = r3
                java.lang.Object r4 = r4.mo52doWorkgIAlus(r5, r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m54invokegIAlus(com.unity3d.services.core.domain.task.BaseTask, com.unity3d.services.core.domain.task.BaseParams, m8.d):java.lang.Object");
        }
    }

    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    Object mo52doWorkgIAlus(P p10, d<? super o<? extends R>> dVar);

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    Object mo53invokegIAlus(P p10, d<? super o<? extends R>> dVar);
}
