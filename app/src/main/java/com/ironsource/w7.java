package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class w7 implements Callable<a8> {

    /* renamed from: a  reason: collision with root package name */
    private final int f21259a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21260b;

    /* renamed from: c  reason: collision with root package name */
    private final AdData f21261c;

    /* renamed from: d  reason: collision with root package name */
    private final y7 f21262d;

    /* renamed from: e  reason: collision with root package name */
    private final x7 f21263e;

    /* renamed from: f  reason: collision with root package name */
    private final NetworkSettings f21264f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements BiddingDataCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ib f21265a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BlockingQueue f21266b;

        a(ib ibVar, BlockingQueue blockingQueue) {
            this.f21265a = ibVar;
            this.f21266b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.f21266b.add(new a8(w7.this.d(), w7.this.c(), null, ib.a(this.f21265a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.f21266b.add(new a8(w7.this.d(), w7.this.c(), map, ib.a(this.f21265a), null));
        }
    }

    public w7(int i10, String str, AdData adData, y7 y7Var, x7 x7Var, NetworkSettings networkSettings) {
        this.f21259a = i10;
        this.f21260b = str;
        this.f21261c = adData;
        this.f21262d = y7Var;
        this.f21263e = x7Var;
        this.f21264f = networkSettings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
        if (r2 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
        r2.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        if (r2 == null) goto L4;
     */
    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ironsource.a8 call() throws java.lang.Exception {
        /*
            r4 = this;
            com.ironsource.ib r0 = new com.ironsource.ib
            r0.<init>()
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.c()
            r2.append(r3)
            java.lang.String r3 = " fetching bidding data"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.verbose(r2)
            java.util.concurrent.ArrayBlockingQueue r1 = new java.util.concurrent.ArrayBlockingQueue
            r2 = 1
            r1.<init>(r2)
            com.ironsource.w7$a r2 = new com.ironsource.w7$a
            r2.<init>(r0, r1)
            com.ironsource.y7 r0 = r4.b()     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L5b
            com.ironsource.mediationsdk.adunit.adapter.utility.AdData r3 = r4.f21261c     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L5b
            r0.a(r3, r2)     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L5b
            goto L84
        L34:
            r0 = move-exception
            com.ironsource.o9 r2 = com.ironsource.o9.d()
            r2.a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error while calling collectBiddingData - "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r2.error(r0)
            com.ironsource.x7 r2 = r4.f21263e
            if (r2 == 0) goto L84
            goto L81
        L5b:
            r0 = move-exception
            com.ironsource.o9 r2 = com.ironsource.o9.d()
            r2.a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception while calling collectBiddingData - "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r2.error(r0)
            com.ironsource.x7 r2 = r4.f21263e
            if (r2 == 0) goto L84
        L81:
            r2.a(r0)
        L84:
            com.ironsource.x7 r0 = r4.f21263e
            if (r0 == 0) goto L8d
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r4.f21264f
            r0.a(r2)
        L8d:
            java.lang.Object r0 = r1.take()
            com.ironsource.a8 r0 = (com.ironsource.a8) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.w7.call():com.ironsource.a8");
    }

    public y7 b() {
        return this.f21262d;
    }

    public String c() {
        return this.f21260b;
    }

    public int d() {
        return this.f21259a;
    }
}
