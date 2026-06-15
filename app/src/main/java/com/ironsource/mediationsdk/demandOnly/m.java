package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.c3;
import com.ironsource.fk;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    protected AbstractAdapter f18765a;

    /* renamed from: b  reason: collision with root package name */
    protected c3 f18766b;

    /* renamed from: c  reason: collision with root package name */
    protected JSONObject f18767c;

    /* renamed from: d  reason: collision with root package name */
    private a f18768d;

    /* renamed from: e  reason: collision with root package name */
    private Timer f18769e;

    /* renamed from: f  reason: collision with root package name */
    long f18770f;

    /* renamed from: g  reason: collision with root package name */
    protected String f18771g;

    /* renamed from: h  reason: collision with root package name */
    protected JSONObject f18772h;

    /* renamed from: i  reason: collision with root package name */
    protected List<String> f18773i;

    /* renamed from: j  reason: collision with root package name */
    protected String f18774j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f18775k = new Object();

    /* renamed from: l  reason: collision with root package name */
    private final Object f18776l = new Object();

    /* renamed from: m  reason: collision with root package name */
    protected final IronSource.AD_UNIT f18777m;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public m(c3 c3Var, AbstractAdapter abstractAdapter) {
        this.f18766b = c3Var;
        this.f18777m = c3Var.b();
        this.f18765a = abstractAdapter;
        JSONObject c10 = c3Var.c();
        this.f18767c = c10;
        try {
            c10.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException e8) {
            o9.d().a(e8);
        }
        this.f18768d = a.NOT_LOADED;
        this.f18769e = null;
        this.f18771g = "";
        this.f18772h = null;
        this.f18773i = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.f18775k) {
            aVar2 = this.f18768d;
            if (Arrays.asList(aVarArr).contains(this.f18768d)) {
                b(aVar);
            }
        }
        return aVar2;
    }

    public void a(String str) {
        this.f18771g = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(List<String> list, String str, int i10, String str2, String str3) {
        for (String str4 : (List) fk.a((ArrayList) list, new ArrayList())) {
            com.ironsource.mediationsdk.d.b().a(str3, str, com.ironsource.mediationsdk.d.b().a(str4, str, i10, str2, "", "", "", ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(TimerTask timerTask) {
        synchronized (this.f18776l) {
            p();
            Timer timer = new Timer();
            this.f18769e = timer;
            timer.schedule(timerTask, this.f18770f);
        }
    }

    public void a(JSONObject jSONObject) {
        this.f18772h = jSONObject;
    }

    public void a(boolean z10) {
        try {
            this.f18767c.put("isOneFlow", z10);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("Can't set isOneFlow = " + z10 + ". Error: " + e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(a aVar) {
        boolean z10;
        synchronized (this.f18775k) {
            z10 = this.f18768d == aVar;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(a aVar, a aVar2) {
        synchronized (this.f18775k) {
            if (this.f18768d == aVar) {
                b(aVar2);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f18766b.f() + ": current state=" + this.f18768d + ", new state=" + aVar);
        synchronized (this.f18775k) {
            this.f18768d = aVar;
        }
    }

    public void b(String str) {
        this.f18774j = com.ironsource.mediationsdk.d.b().c(str);
    }

    public c3 f() {
        return this.f18766b;
    }

    public String g() {
        return this.f18771g;
    }

    public String h() {
        return this.f18766b.f();
    }

    public int i() {
        return this.f18766b.d();
    }

    public Map<String, Object> j() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f18765a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f18765a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.f18766b.i());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f18766b.a());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            hashMap.put("instanceType", Integer.valueOf(this.f18766b.d()));
            if (!TextUtils.isEmpty(this.f18771g)) {
                hashMap.put("auctionId", this.f18771g);
            }
            JSONObject jSONObject = this.f18772h;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put("genericParams", this.f18772h);
            }
            if (!TextUtils.isEmpty(this.f18774j)) {
                hashMap.put("dynamicDemandSource", this.f18774j);
            }
            if (o()) {
                hashMap.put("isOneFlow", 1);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + h() + ")", e8);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        a aVar = this.f18768d;
        return aVar == null ? "null" : aVar.toString();
    }

    public String l() {
        return this.f18766b.i();
    }

    public List<String> m() {
        return this.f18773i;
    }

    public boolean n() {
        return this.f18766b.j();
    }

    public boolean o() {
        return this.f18767c.optBoolean("isOneFlow", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f18776l) {
            Timer timer = this.f18769e;
            if (timer != null) {
                timer.cancel();
                this.f18769e = null;
            }
        }
    }
}
