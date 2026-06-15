package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.n0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u5;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.b9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i3 implements n0.e {

    /* renamed from: l  reason: collision with root package name */
    private static WeakReference f7210l;

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicBoolean f7211m = new AtomicBoolean();

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7212a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f7213b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7214c;

    /* renamed from: d  reason: collision with root package name */
    private final h3 f7215d;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7218g;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7220i;

    /* renamed from: j  reason: collision with root package name */
    private Map f7221j;

    /* renamed from: k  reason: collision with root package name */
    private final y f7222k;

    /* renamed from: e  reason: collision with root package name */
    private final Map f7216e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f7217f = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private int f7219h = 2;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Started mediation debugger");
                if (!i3.this.c() || i3.f7210l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = i3.f7210l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(i3.this.f7215d, i3.this.f7212a.e());
                }
                i3.f7211m.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = i3.f7210l = null;
            }
        }
    }

    public i3(com.applovin.impl.sdk.j jVar) {
        this.f7212a = jVar;
        this.f7213b = jVar.I();
        Context m7 = com.applovin.impl.sdk.j.m();
        this.f7214c = m7;
        h3 h3Var = new h3(m7);
        this.f7215d = h3Var;
        this.f7222k = new y(jVar, h3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity m02 = this.f7212a.m0();
        if (m02 != null && !m02.isFinishing()) {
            new AlertDialog.Builder(m02).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.za
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    i3.this.a(dialogInterface, i10);
                }
            }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        } else {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        }
    }

    private void f() {
        this.f7212a.e().a(new a());
    }

    public void e() {
        if (this.f7217f.compareAndSet(false, true)) {
            this.f7212a.i0().a((z4) new n5(this, this.f7212a), u5.b.OTHER);
        }
    }

    public boolean g() {
        return this.f7218g;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f7215d + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f7210l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void a(boolean z10, int i10) {
        this.f7218g = z10;
        this.f7219h = i10;
    }

    public void a(Map map) {
        this.f7221j = map;
        e();
        if (!c() && f7211m.compareAndSet(false, true)) {
            if (!this.f7220i) {
                f();
                this.f7220i = true;
            }
            Intent intent = new Intent(this.f7214c, MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.n.g("AppLovinSdk", "Starting mediation debugger...");
            this.f7214c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.f7221j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f7221j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y2 y2Var = (y2) it.next();
            if (y2Var.A() && y2Var.q() == y2.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.bb
                    @Override // java.lang.Runnable
                    public final void run() {
                        i3.this.d();
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        h();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                y2 y2Var = new y2(jSONObject2, jVar);
                arrayList.add(y2Var);
                this.f7216e.put(y2Var.b(), y2Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.j jVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new j(jSONObject2, this.f7216e, jVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(List list, com.applovin.impl.sdk.j jVar) {
        List<String> adUnitIds;
        if (jVar.x0().get()) {
            adUnitIds = jVar.f0().getInitializationAdUnitIds();
        } else {
            adUnitIds = jVar.G() != null ? jVar.G().getAdUnitIds() : null;
        }
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j jVar2 = (j) it.next();
                if (adUnitIds.contains(jVar2.c())) {
                    arrayList.add(jVar2);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            x xVar = new x(str);
            if (xVar.h()) {
                arrayList.add(xVar);
            } else if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f7213b;
                nVar.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.n0.e
    public void a(String str, JSONObject jSONObject, int i10) {
        List a10 = a(jSONObject, this.f7212a);
        List a11 = a(jSONObject, a10, this.f7212a);
        List a12 = a(a11, this.f7212a);
        List a13 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f7215d.a(a10, a11, a12, a13, JsonUtils.getString(jSONObject2, b9.h.D0, null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "complies_with_google_families_policy", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f7212a);
        if (!a13.isEmpty()) {
            this.f7222k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.ab
                @Override // java.lang.Runnable
                public final void run() {
                    i3.this.h();
                }
            }, TimeUnit.SECONDS.toMillis(this.f7219h));
        } else {
            a(a10);
        }
    }

    @Override // com.applovin.impl.n0.e
    public void a(String str, int i10, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f7213b;
            nVar.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        }
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f7215d.a(null, null, null, null, null, null, null, null, false, this.f7212a);
        this.f7217f.set(false);
    }
}
