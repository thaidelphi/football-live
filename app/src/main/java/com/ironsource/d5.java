package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d5 implements xo {

    /* renamed from: a  reason: collision with root package name */
    private final w2 f16947a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ironsource.mediationsdk.e f16948b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16949c;

    public d5(w2 adTools, com.ironsource.mediationsdk.e auctionHandler) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(auctionHandler, "auctionHandler");
        this.f16947a = adTools;
        this.f16948b = auctionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(d5 this$0, ImpressionDataListener listener, ImpressionData impressionData) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(listener, "$listener");
        IronLog ironLog = IronLog.CALLBACK;
        w2 w2Var = this$0.f16947a;
        ironLog.verbose(o1.a(w2Var, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }

    private final void a(qk qkVar, m5 m5Var, String str) {
        if (m5Var == null) {
            IronLog.INTERNAL.error(o1.a(this.f16947a, "reportImpressionDataToPublisher - no auctionResponseItem or listener", (String) null, 2, (Object) null));
            this.f16947a.e().h().g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
            return;
        }
        final ImpressionData a10 = m5Var.a(str);
        if (a10 != null) {
            for (final ImpressionDataListener impressionDataListener : new HashSet(qkVar.a())) {
                this.f16947a.e(new Runnable() { // from class: com.ironsource.bx
                    @Override // java.lang.Runnable
                    public final void run() {
                        d5.a(d5.this, impressionDataListener, a10);
                    }
                });
            }
        }
    }

    @Override // com.ironsource.xo
    public void a(a0 instance, String str, qk publisherDataHolder) {
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
        this.f16948b.a(instance.h(), instance.q(), instance.l(), str);
        a(publisherDataHolder, instance.h(), str);
    }

    @Override // com.ironsource.xo
    public void a(List<? extends a0> waterfallInstances, a0 winnerInstance) {
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.n.f(winnerInstance, "winnerInstance");
        if (this.f16949c) {
            return;
        }
        this.f16949c = true;
        m5 h10 = winnerInstance.h();
        this.f16948b.a(h10, winnerInstance.q(), winnerInstance.l());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, m5> concurrentHashMap = new ConcurrentHashMap<>();
        for (a0 a0Var : waterfallInstances) {
            arrayList.add(a0Var.o());
            concurrentHashMap.put(a0Var.o(), a0Var.h());
        }
        this.f16948b.a(arrayList, concurrentHashMap, winnerInstance.q(), winnerInstance.l(), h10);
    }
}
