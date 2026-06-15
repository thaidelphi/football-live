package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class y2 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final Map D;
    private final boolean E;
    private final boolean F;
    private final s6 G;
    private final boolean H;
    private final String I;
    private final Map J;

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9708a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9709b;

    /* renamed from: c  reason: collision with root package name */
    private int f9710c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9711d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f9712e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f9713f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f9714g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9715h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f9716i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f9717j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f9718k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f9719l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f9720m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f9721n;

    /* renamed from: o  reason: collision with root package name */
    private final String f9722o;

    /* renamed from: p  reason: collision with root package name */
    private final String f9723p;

    /* renamed from: q  reason: collision with root package name */
    private String f9724q;

    /* renamed from: r  reason: collision with root package name */
    private String f9725r;

    /* renamed from: s  reason: collision with root package name */
    private final String f9726s;

    /* renamed from: t  reason: collision with root package name */
    private final String f9727t;

    /* renamed from: u  reason: collision with root package name */
    private final String f9728u;

    /* renamed from: v  reason: collision with root package name */
    private final String f9729v;

    /* renamed from: w  reason: collision with root package name */
    private final int f9730w;

    /* renamed from: x  reason: collision with root package name */
    private final List f9731x;

    /* renamed from: y  reason: collision with root package name */
    private final List f9732y;

    /* renamed from: z  reason: collision with root package name */
    private final List f9733z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f9739a;

        a(String str) {
            this.f9739a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f9739a;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f9746a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9747b;

        /* renamed from: c  reason: collision with root package name */
        private final String f9748c;

        b(String str, int i10, String str2) {
            this.f9746a = str;
            this.f9747b = i10;
            this.f9748c = str2;
        }

        public String b() {
            return this.f9748c;
        }

        public String c() {
            return this.f9746a;
        }

        public int d() {
            return this.f9747b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|(4:28|29|30|31)|(6:33|34|(5:36|(2:38|(3:40|41|42))|100|41|42)(1:101)|44|45|46)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0202, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0203, code lost:
        r23.I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x020a, code lost:
        if (com.applovin.impl.sdk.n.a() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020c, code lost:
        r23.I().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0215, code lost:
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0251 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y2(org.json.JSONObject r22, com.applovin.impl.sdk.j r23) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.y2.<init>(org.json.JSONObject, com.applovin.impl.sdk.j):void");
    }

    private a a() {
        a aVar;
        if (this.f9711d) {
            if (this.f9712e) {
                aVar = a.COMPLETE;
            } else if (this.f9714g) {
                aVar = a.MISSING;
            } else {
                aVar = a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.f9712e) {
            aVar = a.INCOMPLETE_INTEGRATION;
        } else {
            aVar = a.MISSING;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        for (f4 f4Var : this.f9732y) {
            if (!f4Var.c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        for (e1 e1Var : this.f9733z) {
            if (!e1Var.c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f9721n || com.applovin.impl.sdk.j.w0()) ? aVar : a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f9712e;
    }

    public boolean B() {
        return this.f9713f;
    }

    public boolean C() {
        return this.f9715h;
    }

    public boolean D() {
        return this.H;
    }

    public boolean E() {
        return this.f9721n;
    }

    public boolean F() {
        return this.f9711d;
    }

    public boolean G() {
        return this.f9709b == a.MISSING && this.f9718k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.f9719l;
    }

    public boolean J() {
        return this.f9720m;
    }

    public String b() {
        return this.f9724q;
    }

    public String c() {
        return this.f9726s;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.f9733z;
    }

    public String g() {
        return this.f9723p;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f9730w;
    }

    public int i() {
        return this.f9710c;
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ");
        sb.append(this.f9722o);
        sb.append(" ----------");
        sb.append("\nStatus  - ");
        sb.append(this.f9709b.b());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f9711d || TextUtils.isEmpty(this.f9725r)) ? "UNAVAILABLE" : this.f9725r);
        sb.append("\nAdapter - ");
        if (this.f9712e && !TextUtils.isEmpty(this.f9726s)) {
            str = this.f9726s;
        }
        sb.append(str);
        for (f4 f4Var : n()) {
            if (!f4Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(f4Var.b());
                sb.append(": ");
                sb.append(f4Var.a());
            }
        }
        for (e1 e1Var : f()) {
            if (!e1Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(e1Var.b());
                sb.append(": ");
                sb.append(e1Var.a());
            }
        }
        return sb.toString();
    }

    public String k() {
        return this.f9727t;
    }

    public List l() {
        return this.B;
    }

    public String m() {
        return this.f9722o;
    }

    public List n() {
        return this.f9732y;
    }

    public final com.applovin.impl.sdk.j o() {
        return this.f9708a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f9724q.equals(string)) {
            this.f9710c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter a10 = o3.a(string, this.f9708a);
            if (a10 != null) {
                String a11 = o3.a(a10);
                if (this.f9725r.equals(a11)) {
                    return;
                }
                this.f9725r = a11;
                this.f9708a.q().a(this.f9725r, string);
            }
        }
    }

    public String p() {
        return this.f9725r;
    }

    public a q() {
        return this.f9709b;
    }

    public List r() {
        return this.f9731x;
    }

    public List s() {
        return this.A;
    }

    public s6 t() {
        return this.G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f9722o + ", displayName=" + this.f9723p + ", sdkAvailable=" + this.f9711d + ", sdkVersion=" + this.f9725r + ", adapterAvailable=" + this.f9712e + ", adapterVersion=" + this.f9726s + "}";
    }

    public List u() {
        return this.C;
    }

    public String v() {
        return this.f9728u;
    }

    public String w() {
        return this.f9729v;
    }

    public Map x() {
        return this.D;
    }

    public b y() {
        if (!this.f9716i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f9709b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !F() || !A())) {
            return b.INVALID_INTEGRATION;
        }
        if (!this.f9708a.k0().c()) {
            return b.DISABLED;
        }
        if (this.f9717j && (this.f9710c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f9710c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) {
            return b.NOT_INITIALIZED;
        }
        return b.READY;
    }

    public boolean z() {
        return this.E;
    }

    private List a(MaxAdapter maxAdapter, boolean z10) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z10) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f9724q.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            f4 f4Var = new f4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.j.m());
            if (f4Var.c()) {
                arrayList.add(f4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new f4(next, jSONObject2.getString(next), com.applovin.impl.sdk.j.m()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.j jVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new e1(jSONObject2, jVar));
            }
        }
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && e1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new e1(jSONObject3, jVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(y2 y2Var) {
        return this.f9723p.compareToIgnoreCase(y2Var.f9723p);
    }
}
