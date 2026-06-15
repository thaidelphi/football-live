package com.ironsource;

import android.content.Context;
import com.ironsource.b9;
import com.ironsource.eh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class iw {

    /* renamed from: a  reason: collision with root package name */
    private final String f17861a;

    /* renamed from: b  reason: collision with root package name */
    private Context f17862b;

    /* renamed from: c  reason: collision with root package name */
    private e9 f17863c;

    /* renamed from: d  reason: collision with root package name */
    private wa f17864d;

    /* renamed from: e  reason: collision with root package name */
    private int f17865e;

    /* renamed from: f  reason: collision with root package name */
    private gb f17866f;

    /* renamed from: g  reason: collision with root package name */
    private int f17867g;

    /* renamed from: h  reason: collision with root package name */
    private int f17868h;

    /* renamed from: i  reason: collision with root package name */
    private final String f17869i = iw.class.getSimpleName();

    /* renamed from: j  reason: collision with root package name */
    private a f17870j;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public iw(Context context, e9 e9Var, wa waVar, int i10, gb gbVar, String str) {
        a h10 = h();
        this.f17870j = h10;
        if (h10 != a.NOT_ALLOWED) {
            this.f17862b = context;
            this.f17863c = e9Var;
            this.f17864d = waVar;
            this.f17865e = i10;
            this.f17866f = gbVar;
            this.f17867g = 0;
        }
        this.f17861a = str;
    }

    private a h() {
        this.f17868h = FeaturesManager.getInstance().getInitRecoverTrials();
        String str = this.f17869i;
        Logger.i(str, "getInitialState mMaxAllowedTrials: " + this.f17868h);
        if (this.f17868h <= 0) {
            Logger.i(this.f17869i, "recovery is not allowed by config");
            return a.NOT_ALLOWED;
        }
        return a.NOT_RECOVERED;
    }

    private void j() {
        if (this.f17867g != this.f17868h) {
            this.f17870j = a.NOT_RECOVERED;
            return;
        }
        Logger.i(this.f17869i, "handleRecoveringEndedFailed | Reached max trials");
        this.f17870j = a.NOT_ALLOWED;
        a();
    }

    private void k() {
        a();
        this.f17870j = a.RECOVERED;
    }

    public void a() {
        this.f17862b = null;
        this.f17863c = null;
        this.f17864d = null;
        this.f17866f = null;
    }

    public void a(boolean z10) {
        if (this.f17870j != a.IN_RECOVERING) {
            return;
        }
        if (z10) {
            k();
        } else {
            j();
        }
    }

    public boolean a(eh.c cVar, eh.b bVar) {
        Logger.i(this.f17869i, "shouldRecoverWebController: ");
        a aVar = this.f17870j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.i(this.f17869i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        } else if (cVar != eh.c.Native) {
            String str = this.f17869i;
            Logger.i(str, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        } else if (bVar == eh.b.Loading || bVar == eh.b.None) {
            Logger.i(this.f17869i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        } else if (aVar == a.RECOVERED) {
            Logger.i(this.f17869i, "shouldRecoverWebController: false | already recovered");
            return false;
        } else if (aVar == a.IN_RECOVERING) {
            Logger.i(this.f17869i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        } else if (this.f17862b == null || this.f17863c == null || this.f17864d == null) {
            Logger.i(this.f17869i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        } else {
            Logger.i(this.f17869i, "shouldRecoverWebController: true | allow recovering ");
            return true;
        }
    }

    public Context b() {
        return this.f17862b;
    }

    public String c() {
        return this.f17861a;
    }

    public e9 d() {
        return this.f17863c;
    }

    public int e() {
        return this.f17865e;
    }

    public wa f() {
        return this.f17864d;
    }

    public gb g() {
        return this.f17866f;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(b9.h.A0, m());
            jSONObject.put(b9.h.B0, this.f17867g);
            jSONObject.put(b9.h.C0, this.f17868h);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return jSONObject;
    }

    public boolean l() {
        return this.f17870j == a.IN_RECOVERING;
    }

    public boolean m() {
        return this.f17870j == a.RECOVERED;
    }

    public void n() {
        a aVar = this.f17870j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.f17867g++;
            Logger.i(this.f17869i, "recoveringStarted - trial number " + this.f17867g);
            this.f17870j = aVar2;
        }
    }
}
