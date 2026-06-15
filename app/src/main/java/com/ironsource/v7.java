package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.q7;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class v7<Smash extends q7<?>> extends hw<Smash> {

    /* renamed from: h  reason: collision with root package name */
    private boolean f21115h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(int i10, boolean z10, List<? extends Smash> waterfall, boolean z11) {
        super(i10, z10, waterfall);
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        this.f21115h = z11;
    }

    public /* synthetic */ v7(int i10, boolean z10, List list, boolean z11, int i11, kotlin.jvm.internal.h hVar) {
        this(i10, z10, list, (i11 & 8) != 0 ? false : z11);
    }

    @Override // com.ironsource.hw
    public void c(Smash smash) {
        String str;
        kotlin.jvm.internal.n.f(smash, "smash");
        if (!smash.w()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.f21115h = true;
        if (d() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.c() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - " + str);
        IronSourceUtils.sendAutomationLog(str);
    }

    @Override // com.ironsource.hw
    public boolean e() {
        return super.e() || this.f21115h;
    }
}
