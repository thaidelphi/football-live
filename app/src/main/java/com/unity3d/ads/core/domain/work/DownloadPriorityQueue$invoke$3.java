package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import i8.w;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DownloadPriorityQueue.kt */
@f(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", f = "DownloadPriorityQueue.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DownloadPriorityQueue$invoke$3 extends l implements p<DownloadPriorityQueue.PriorityItem, d<? super Boolean>, Object> {
    final /* synthetic */ DownloadPriorityQueue.PriorityItem $priorityItem;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadPriorityQueue$invoke$3(DownloadPriorityQueue.PriorityItem priorityItem, d<? super DownloadPriorityQueue$invoke$3> dVar) {
        super(2, dVar);
        this.$priorityItem = priorityItem;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        DownloadPriorityQueue$invoke$3 downloadPriorityQueue$invoke$3 = new DownloadPriorityQueue$invoke$3(this.$priorityItem, dVar);
        downloadPriorityQueue$invoke$3.L$0 = obj;
        return downloadPriorityQueue$invoke$3;
    }

    @Override // t8.p
    public final Object invoke(DownloadPriorityQueue.PriorityItem priorityItem, d<? super Boolean> dVar) {
        return ((DownloadPriorityQueue$invoke$3) create(priorityItem, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            return b.a(((DownloadPriorityQueue.PriorityItem) this.L$0) == this.$priorityItem);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
