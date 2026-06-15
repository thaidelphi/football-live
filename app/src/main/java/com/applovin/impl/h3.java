package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.j2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y;
import com.applovin.impl.y2;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h3 extends k2 implements AppLovinCommunicatorSubscriber, y.a {
    private List A;
    private List B;
    private List C;
    private List D;
    private List E;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.sdk.j f7097e;

    /* renamed from: f  reason: collision with root package name */
    private List f7098f;

    /* renamed from: g  reason: collision with root package name */
    private List f7099g;

    /* renamed from: h  reason: collision with root package name */
    private List f7100h;

    /* renamed from: i  reason: collision with root package name */
    private String f7101i;

    /* renamed from: j  reason: collision with root package name */
    private String f7102j;

    /* renamed from: k  reason: collision with root package name */
    private String f7103k;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f7104l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7105m;

    /* renamed from: n  reason: collision with root package name */
    private final StringBuilder f7106n;

    /* renamed from: o  reason: collision with root package name */
    private final AtomicBoolean f7107o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7108p;

    /* renamed from: q  reason: collision with root package name */
    private List f7109q;

    /* renamed from: r  reason: collision with root package name */
    private List f7110r;

    /* renamed from: s  reason: collision with root package name */
    private List f7111s;

    /* renamed from: t  reason: collision with root package name */
    private List f7112t;

    /* renamed from: u  reason: collision with root package name */
    private List f7113u;

    /* renamed from: v  reason: collision with root package name */
    private List f7114v;

    /* renamed from: w  reason: collision with root package name */
    private List f7115w;

    /* renamed from: x  reason: collision with root package name */
    private List f7116x;

    /* renamed from: y  reason: collision with root package name */
    private List f7117y;

    /* renamed from: z  reason: collision with root package name */
    private List f7118z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7119a;

        static {
            int[] iArr = new int[y.b.values().length];
            f7119a = iArr;
            try {
                iArr[y.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7119a[y.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7119a[y.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7119a[y.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7119a[y.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        MICRO_SDK_PARTNER_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public h3(Context context) {
        super(context);
        this.f7106n = new StringBuilder("");
        this.f7107o = new AtomicBoolean();
        this.f7108p = false;
        this.f7109q = new ArrayList();
        this.f7110r = new ArrayList();
        this.f7111s = new ArrayList();
        this.f7112t = new ArrayList();
        this.f7113u = new ArrayList();
        this.f7114v = new ArrayList();
        this.f7115w = new ArrayList();
        this.f7116x = new ArrayList();
        this.f7117y = new ArrayList();
        this.f7118z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
    }

    private List f() {
        boolean c10 = this.f7097e.k0().c();
        List b10 = this.f7097e.k0().b();
        if (c10) {
            return a((String) null, a(b10, false));
        }
        return a(a(b10, true), (String) null);
    }

    private List i() {
        String str;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = this.f7386a.getPackageManager().getPackageInfo(this.f7386a.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(j2.a().d("Package Name").c(this.f7386a.getPackageName()).a());
        j2.b d10 = j2.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(d10.c(str).a());
        arrayList.add(j2.a().d("OS").c(d7.d()).a());
        arrayList.add(j2.a().d("Account").c(StringUtils.isValidString(this.f7103k) ? this.f7103k : "None").a());
        arrayList.add(j2.a().d("Mediation Provider").c(StringUtils.isValidString(this.f7097e.N()) ? this.f7097e.N() : "None").a());
        arrayList.add(j2.a().d("OM SDK Version").c(this.f7097e.V().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.j.w0()));
        if (this.f7104l != null) {
            arrayList.add(j2.a().d("Google Families Policy").c(String.valueOf(this.f7104l)).a());
        }
        return arrayList;
    }

    private j2 k() {
        String d10 = this.f7097e.j0().d();
        boolean isValidString = StringUtils.isValidString(d10);
        boolean isValidString2 = StringUtils.isValidString(this.f7097e.j0().k());
        j2.b d11 = j2.a(j2.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!isValidString) {
            d10 = isValidString2 ? "Unknown" : "None";
        }
        j2.b c10 = d11.c(d10);
        if (this.f7105m) {
            c10.a(true);
            if (isValidString2) {
                c10.a(this.f7386a);
            } else {
                c10.b("TC Data Not Found");
                c10.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z10 = this.f7097e.s().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                c10.a(z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                c10.b(j0.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f7386a));
            }
        }
        return c10.a();
    }

    private j2 l() {
        return j2.a().d("MAX Terms and Privacy Policy Flow").a(this.f7386a).a(true).a();
    }

    private j2 m() {
        boolean hasSupportedCmp = this.f7097e.p().hasSupportedCmp();
        return j2.a().d("Google UMP SDK").a(hasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(j0.a(hasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f7386a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(!hasSupportedCmp).a();
    }

    private List p() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(j2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f7097e.a(o4.J3);
        j2.b d10 = j2.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(d10.c(str).a());
        j2.b d11 = j2.a().d("Ad Review Version");
        String b10 = f.b();
        if (StringUtils.isValidString(b10)) {
            String a10 = f.a();
            if (StringUtils.isValidString(a10)) {
                if (a10.equals(this.f7097e.a0())) {
                    d11.c(b10);
                } else {
                    StringBuilder sb = new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                    sb.append(this.f7097e.z0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated");
                    sb.append(" from the correct account.");
                    a(d11, sb.toString());
                }
            } else {
                d11.c(b10);
            }
        } else {
            a(d11, "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.");
        }
        arrayList.add(d11.a());
        if (this.f7097e.z0()) {
            String a11 = d7.a(this.f7097e.f0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(a11) ? a11 : "None"));
        }
        if (this.f7097e.u().j()) {
            arrayList.add(l());
            arrayList.add(m());
        } else if (this.f7097e.u().l()) {
            arrayList.add(t());
        }
        return arrayList;
    }

    private j2 q() {
        return j2.a().d("Network Consent Statuses").a(this.f7386a).a(true).a();
    }

    private List r() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(k());
        if (StringUtils.isValidString(this.f7097e.j0().k())) {
            arrayList.add(q());
        } else {
            arrayList.add(new i4(m0.b(), false, this.f7386a));
        }
        arrayList.add(new i4(m0.a(), true, this.f7386a));
        return arrayList;
    }

    private j2 t() {
        return j2.a().d("Terms Flow").a(R.drawable.applovin_ic_x_mark).b(j0.a(R.color.applovin_sdk_xmarkColor, this.f7386a)).b("Terms Flow has been replaced").a(this.f7097e.u().g()).a(true).a();
    }

    private void x() {
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + d7.c(this.f7097e));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nTest Mode - ");
        sb2.append(this.f7097e.k0().c() ? "enabled" : "disabled");
        sb.append(sb2.toString());
        sb.append("\nTarget SDK - " + this.f7097e.x().B().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f7097e.a(o4.J3);
        String b10 = f.b();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb3.append(str2);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(b10)) {
            b10 = "Disabled";
        }
        sb4.append(b10);
        sb.append(sb4.toString());
        if (this.f7097e.z0()) {
            String a10 = d7.a(this.f7097e.f0());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("\nUnity Version - ");
            sb5.append(StringUtils.isValidString(a10) ? a10 : "None");
            sb.append(sb5.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(m0.a(this.f7386a));
        sb.append(this.f7097e.u().e());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.f7097e.j0().j());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        for (s6 s6Var : this.f7097e.j0().i()) {
            sb.append(s6Var.e());
        }
        sb.append("\n========== NETWORKS ==========");
        for (y2 y2Var : this.f7110r) {
            a(sb, y2Var.j());
        }
        for (y2 y2Var2 : this.f7111s) {
            a(sb, y2Var2.j());
        }
        for (y2 y2Var3 : this.f7109q) {
            a(sb, y2Var3.j());
        }
        sb.append("\n========== AD UNITS ==========");
        for (j jVar : this.f7098f) {
            a(sb, jVar.e());
        }
        sb.append("\n========== END ==========");
        com.applovin.impl.sdk.n.g("MediationDebuggerListAdapter", sb.toString());
        this.f7106n.append(sb.toString());
    }

    public boolean a(j2 j2Var) {
        if (j2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(j2Var.k().toString());
    }

    public void b(boolean z10) {
        this.f7108p = z10;
    }

    @Override // com.applovin.impl.k2
    protected List c(int i10) {
        if (i10 == e.APP_INFO.ordinal()) {
            return this.f7116x;
        }
        if (i10 == e.MAX.ordinal()) {
            return this.f7117y;
        }
        if (i10 == e.PRIVACY.ordinal()) {
            return this.f7118z;
        }
        if (i10 == e.ADS.ordinal()) {
            return this.A;
        }
        if (i10 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B;
        }
        if (i10 == e.MICRO_SDK_PARTNER_NETWORKS.ordinal()) {
            return this.C;
        }
        if (i10 == e.COMPLETED_NETWORKS.ordinal()) {
            return this.D;
        }
        return this.E;
    }

    public boolean d() {
        return this.f7108p;
    }

    public List e() {
        return this.f7098f;
    }

    public String g() {
        return this.f7102j;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f7101i;
    }

    public List j() {
        return this.f7113u;
    }

    public List n() {
        return this.f7099g;
    }

    public String o() {
        return this.f7106n.toString();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f7118z = r();
            c();
        } else if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a(this.f7109q);
            this.C = a(this.f7110r);
            this.D = a(this.f7111s);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public com.applovin.impl.sdk.j s() {
        return this.f7097e;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f7107o.get() + "}";
    }

    public List u() {
        return this.f7115w;
    }

    public List v() {
        return this.f7114v;
    }

    public boolean w() {
        return this.f7107o.get();
    }

    @Override // com.applovin.impl.k2
    protected int b() {
        return e.COUNT.ordinal();
    }

    @Override // com.applovin.impl.k2
    protected int d(int i10) {
        if (i10 == e.APP_INFO.ordinal()) {
            return this.f7116x.size();
        }
        if (i10 == e.MAX.ordinal()) {
            return this.f7117y.size();
        }
        if (i10 == e.PRIVACY.ordinal()) {
            return this.f7118z.size();
        }
        if (i10 == e.ADS.ordinal()) {
            return this.A.size();
        }
        if (i10 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B.size();
        }
        if (i10 == e.MICRO_SDK_PARTNER_NETWORKS.ordinal()) {
            return this.C.size();
        }
        if (i10 == e.COMPLETED_NETWORKS.ordinal()) {
            return this.D.size();
        }
        return this.E.size();
    }

    @Override // com.applovin.impl.k2
    protected j2 e(int i10) {
        if (i10 == e.APP_INFO.ordinal()) {
            return new m4("APP INFO");
        }
        if (i10 == e.MAX.ordinal()) {
            return new m4("MAX");
        }
        if (i10 == e.PRIVACY.ordinal()) {
            return new m4("PRIVACY");
        }
        if (i10 == e.ADS.ordinal()) {
            return new m4("ADS");
        }
        if (i10 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return new m4("INCOMPLETE SDK INTEGRATIONS");
        }
        if (i10 == e.MICRO_SDK_PARTNER_NETWORKS.ordinal()) {
            return new m4("APPLOVIN MICRO SDK PARTNERS");
        }
        if (i10 == e.COMPLETED_NETWORKS.ordinal()) {
            return new m4("COMPLETED SDK INTEGRATIONS");
        }
        return new m4("MISSING SDK INTEGRATIONS");
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k f10 = ((j) it.next()).f();
            for (y7 y7Var : f10.a()) {
                hashSet.add(y7Var.b());
            }
            for (y7 y7Var2 : f10.e()) {
                hashSet2.add(y7Var2.b());
            }
        }
        this.f7113u = new ArrayList(hashSet);
        this.f7114v = new ArrayList(hashSet2);
        Collections.sort(this.f7113u);
        Collections.sort(this.f7114v);
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, Boolean bool, boolean z10, com.applovin.impl.sdk.j jVar) {
        this.f7097e = jVar;
        this.f7098f = list2;
        this.f7099g = list3;
        this.f7100h = list4;
        this.f7101i = str;
        this.f7102j = str2;
        this.f7103k = str3;
        this.f7104l = bool;
        this.f7105m = z10;
        if (list != null && this.f7107o.compareAndSet(false, true)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            jVar.j0().a(list);
            c(list);
            b(list2);
            d(this.f7111s);
            this.f7116x.addAll(i());
            this.f7117y.addAll(p());
            this.f7118z.addAll(r());
            this.A.addAll(f());
            this.B = a(this.f7109q);
            this.C = a(this.f7110r);
            this.D = a(this.f7111s);
            this.E = a(this.f7112t);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f7386a).subscribe(this, arrayList);
            x();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.xa
            @Override // java.lang.Runnable
            public final void run() {
                h3.this.notifyDataSetChanged();
            }
        });
    }

    private j2 b(String str, String str2) {
        j2.b d10 = j2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            d10.c(str2);
        } else {
            d10.a(R.drawable.applovin_ic_x_mark);
            d10.b(j0.a(R.color.applovin_sdk_xmarkColor, this.f7386a));
        }
        return d10.a();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y2 y2Var = (y2) it.next();
            if (!y2Var.G()) {
                if (y2Var.q() != y2.a.INCOMPLETE_INTEGRATION && y2Var.q() != y2.a.INVALID_INTEGRATION) {
                    if (y2Var.q() == y2.a.COMPLETE) {
                        if (y2Var.z()) {
                            this.f7110r.add(y2Var);
                        } else {
                            this.f7111s.add(y2Var);
                        }
                    } else if (y2Var.q() == y2.a.MISSING) {
                        this.f7112t.add(y2Var);
                    }
                } else if (y2Var.z()) {
                    this.f7110r.add(y2Var);
                } else {
                    this.f7109q.add(y2Var);
                }
            }
        }
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y2 y2Var = (y2) it.next();
            if (y2Var.y() == y2.b.READY) {
                this.f7115w.add(y2Var);
            }
        }
    }

    private j2 b(String str) {
        j2.b a10 = j2.a();
        if (this.f7097e.k0().c()) {
            a10.a(this.f7386a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Test Mode Network");
        j2.b d10 = a10.d(sb.toString());
        if (!this.f7097e.k0().c()) {
            str = "Enable";
        }
        return d10.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    @Override // com.applovin.impl.y.a
    public void a(w wVar, String str) {
        x xVar;
        String a10;
        c a11;
        c cVar;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (x xVar2 : this.f7100h) {
            List list = (List) wVar.a().get(xVar2.b());
            if (list == null || !list.contains(xVar2)) {
                this.f7097e.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f7097e.I().b("MediationDebuggerListAdapter", str + " is missing a required entry: " + xVar2.d());
                }
                arrayList.add(xVar2);
            }
        }
        if (arrayList.isEmpty()) {
            str2 = "All required entries found at " + str + ".";
            cVar = c.SUCCESS;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    xVar = null;
                    break;
                }
                xVar = (x) it.next();
                if (xVar.g()) {
                    break;
                }
            }
            if (xVar != null) {
                y.b bVar = y.b.MISSING_APPLOVIN_ENTRIES;
                a10 = a(bVar, str, xVar.d());
                a11 = a(bVar);
            } else {
                y.b bVar2 = y.b.MISSING_NON_APPLOVIN_ENTRIES;
                a10 = a(bVar2, str, null);
                a11 = a(bVar2);
            }
            String str3 = a10;
            cVar = a11;
            str2 = str3;
        }
        this.f7117y.add(a(str2, cVar));
        c();
    }

    @Override // com.applovin.impl.y.a
    public void a(y.b bVar, String str) {
        if (bVar == y.b.APP_DETAILS_NOT_FOUND) {
            this.f7097e.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f7097e.I().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.f7117y.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (sb2.length() + str.length() >= ((Integer) this.f7097e.a(o4.f8210s)).intValue()) {
            com.applovin.impl.sdk.n.g("MediationDebuggerListAdapter", sb2);
            this.f7106n.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        j2.b a10 = j2.a();
        arrayList.add(a10.d("View Ad Units (" + this.f7098f.size() + ")").a(this.f7386a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f7099g.isEmpty()) {
            j2.b a11 = j2.a();
            arrayList.add(a11.d("Selective Init Ad Units (" + this.f7099g.size() + ")").a(this.f7386a).a(true).a());
        }
        arrayList.add(j2.a().d("Test Mode Enabled").c(String.valueOf(this.f7097e.k0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new r3((y2) it.next(), this.f7386a));
        }
        return arrayList;
    }

    private void a(j2.b bVar, String str) {
        bVar.b("MAX Ad Review").a(str).a(R.drawable.applovin_ic_x_mark).b(j0.a(R.color.applovin_sdk_xmarkColor, this.f7386a)).a(true);
    }

    private j2 a(String str) {
        j2.b a10 = j2.a();
        if (!this.f7097e.k0().c()) {
            a10.a(this.f7386a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Live Network");
        j2.b d10 = a10.d(sb.toString());
        if (this.f7097e.k0().c()) {
            str = "Enable";
        }
        return d10.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private j2 a(boolean z10) {
        return j2.a().d("Java 8").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(j0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f7386a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://developers.applovin.com/en/android/overview/integration").a(!z10).a();
    }

    private j2 a(String str, c cVar) {
        int i10;
        int a10;
        if (cVar == c.SUCCESS) {
            i10 = R.drawable.applovin_ic_check_mark_bordered;
            a10 = j0.a(R.color.applovin_sdk_checkmarkColor, this.f7386a);
        } else if (cVar == c.WARNING) {
            i10 = R.drawable.applovin_ic_warning;
            a10 = j0.a(R.color.applovin_sdk_warningColor, this.f7386a);
        } else {
            i10 = R.drawable.applovin_ic_x_mark;
            a10 = j0.a(R.color.applovin_sdk_xmarkColor, this.f7386a);
        }
        return j2.a().d("app-ads.txt").a(i10).b(a10).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(y.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i10 = a.f7119a[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        return "";
                    }
                    return "Text file at " + str + " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
                } else {
                    return "Text file at " + str + " is missing the required AppLovin line:\n\n" + str2 + "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
                }
            }
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
    }

    private c a(y.b bVar) {
        int i10 = a.f7119a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return c.ERROR;
        }
        if (i10 != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z10) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z10) {
            for (m2 m2Var : this.f7113u) {
                if (list.equals(m2Var.b())) {
                    return m2Var.a();
                }
            }
            for (m2 m2Var2 : this.f7114v) {
                if (list.equals(m2Var2.b())) {
                    return m2Var2.a();
                }
            }
        } else {
            for (y2 y2Var : this.f7115w) {
                if (list.equals(y2Var.u())) {
                    return y2Var.g();
                }
            }
        }
        return wa.a(",", list);
    }
}
