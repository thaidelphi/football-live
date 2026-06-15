package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.c3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o9;
import com.ironsource.zh;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class y implements zh.b {

    /* renamed from: a  reason: collision with root package name */
    protected AbstractAdapter f19221a;

    /* renamed from: b  reason: collision with root package name */
    protected c3 f19222b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19223c;

    /* renamed from: d  reason: collision with root package name */
    protected JSONObject f19224d;

    /* renamed from: e  reason: collision with root package name */
    protected String f19225e;

    /* renamed from: f  reason: collision with root package name */
    protected int f19226f;

    /* renamed from: g  reason: collision with root package name */
    protected Long f19227g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(c3 c3Var, AbstractAdapter abstractAdapter) {
        this.f19222b = c3Var;
        this.f19221a = abstractAdapter;
        this.f19224d = c3Var.c();
    }

    private void a(String str, int i10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " " + c() + " : " + str, i10);
    }

    public void a(String str) {
        a(str, 0);
    }

    public void a(boolean z10) {
        this.f19223c = z10;
    }

    @Override // com.ironsource.zh.b
    public int b() {
        return this.f19222b.e();
    }

    public void b(String str) {
        a(str, 3);
    }

    @Override // com.ironsource.zh.b
    public String c() {
        return this.f19222b.f();
    }

    public void c(String str) {
        this.f19225e = d.b().c(str);
    }

    public abstract IronSource.AD_UNIT d();

    public Long e() {
        return this.f19227g;
    }

    public String f() {
        return String.format("%s %s", i(), Integer.valueOf(hashCode()));
    }

    public int g() {
        return this.f19222b.d();
    }

    public boolean h() {
        return this.f19223c;
    }

    public String i() {
        return this.f19222b.h().isMultipleInstances() ? this.f19222b.h().getProviderTypeForReflection() : this.f19222b.h().getProviderName();
    }

    public String j() {
        return this.f19222b.g();
    }

    public abstract String k();

    public int l() {
        return 1;
    }

    public Map<String, Object> m() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f19221a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f19221a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.f19222b.i());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f19222b.a());
            hashMap.put("instanceType", Integer.valueOf(p() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(l()));
            if (!TextUtils.isEmpty(this.f19225e)) {
                hashMap.put("dynamicDemandSource", this.f19225e);
            }
        } catch (Throwable th) {
            o9.d().a(th);
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + c() + ")", th);
        }
        return hashMap;
    }

    public int n() {
        return this.f19226f;
    }

    public boolean o() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() == null && this.f19221a.isUsingActivityBeforeImpression(d())) {
                ironLog.verbose(c() + " - is using activity before impression and activity is null");
                return true;
            }
            return false;
        } catch (Throwable th) {
            o9.d().a(th);
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th.getLocalizedMessage());
            return true;
        }
    }

    public boolean p() {
        return this.f19222b.j();
    }

    public void q() {
        try {
            AbstractAdapter abstractAdapter = this.f19221a;
            if (abstractAdapter != null) {
                abstractAdapter.releaseMemory(this.f19222b.b(), this.f19224d);
            }
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception - " + th.getMessage());
        }
        this.f19221a = null;
    }

    public boolean r() {
        if (o()) {
            return false;
        }
        return p() || s();
    }

    public boolean s() {
        return this.f19222b.k();
    }
}
