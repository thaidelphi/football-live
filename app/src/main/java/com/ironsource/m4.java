package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class m4 implements bf {

    /* renamed from: a  reason: collision with root package name */
    private final uf f18410a;

    /* renamed from: b  reason: collision with root package name */
    private n4 f18411b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        public final n4 a(k4 k4Var, uf featureAvailabilityService) {
            kotlin.jvm.internal.n.f(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            StringBuilder sb = new StringBuilder();
            sb.append("isAndroidxApplicationLifecycleEnabled: ");
            sb.append(k4Var != null ? Boolean.valueOf(k4Var.k()) : null);
            ironLog.verbose(sb.toString());
            boolean z10 = false;
            if (featureAvailabilityService.a()) {
                ar.i().a(new zb(IronSourceConstants.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.getMediationAdditionalData(false)));
            }
            if ((k4Var != null ? k4Var.k() : false) && featureAvailabilityService.a()) {
                z10 = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z10);
            return z10 ? new v3() : new jg();
        }
    }

    public m4(uf featureAvailabilityService) {
        kotlin.jvm.internal.n.f(featureAvailabilityService, "featureAvailabilityService");
        this.f18410a = featureAvailabilityService;
    }

    @Override // com.ironsource.bf
    public void a(k4 k4Var) {
        if (this.f18411b == null) {
            this.f18411b = new a().a(k4Var, this.f18410a);
        }
    }

    @Override // com.ironsource.n4
    public void a(nk observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        n4 n4Var = this.f18411b;
        if (n4Var != null) {
            n4Var.a(observer);
        }
    }

    @Override // com.ironsource.n4
    public void b(nk observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        n4 n4Var = this.f18411b;
        if (n4Var != null) {
            n4Var.b(observer);
        }
    }
}
