package com.startapp;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.b9;
import com.ironsource.fe;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.u1;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class u0 {

    /* renamed from: i0  reason: collision with root package name */
    public static final Collection<Integer> f23387i0;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public final String K;
    public int L;
    public int M;
    public float N;
    public Boolean O;
    public final int P;
    public String Q;
    public String R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public String X;
    public String Y;
    public final int Z;

    /* renamed from: a  reason: collision with root package name */
    public String f23388a;

    /* renamed from: a0  reason: collision with root package name */
    public Long f23389a0;

    /* renamed from: b  reason: collision with root package name */
    public String f23390b;

    /* renamed from: b0  reason: collision with root package name */
    public Integer f23391b0;

    /* renamed from: c  reason: collision with root package name */
    public String f23392c;

    /* renamed from: c0  reason: collision with root package name */
    public Boolean f23393c0;

    /* renamed from: d  reason: collision with root package name */
    public final TreeMap f23394d;

    /* renamed from: d0  reason: collision with root package name */
    public Boolean f23395d0;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, ?> f23396e;

    /* renamed from: e0  reason: collision with root package name */
    public Boolean f23397e0;

    /* renamed from: f  reason: collision with root package name */
    public String f23398f;

    /* renamed from: f0  reason: collision with root package name */
    public Boolean f23399f0;

    /* renamed from: g  reason: collision with root package name */
    public s f23400g;

    /* renamed from: g0  reason: collision with root package name */
    public c0 f23401g0;

    /* renamed from: h  reason: collision with root package name */
    public String f23402h;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f23403h0;

    /* renamed from: i  reason: collision with root package name */
    public String f23404i;

    /* renamed from: j  reason: collision with root package name */
    public String f23405j;

    /* renamed from: k  reason: collision with root package name */
    public String f23406k;

    /* renamed from: l  reason: collision with root package name */
    public String f23407l;

    /* renamed from: m  reason: collision with root package name */
    public String f23408m;

    /* renamed from: n  reason: collision with root package name */
    public String f23409n;

    /* renamed from: o  reason: collision with root package name */
    public String f23410o;

    /* renamed from: p  reason: collision with root package name */
    public String f23411p;

    /* renamed from: q  reason: collision with root package name */
    public Boolean f23412q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f23413r;

    /* renamed from: s  reason: collision with root package name */
    public String f23414s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f23415t;

    /* renamed from: u  reason: collision with root package name */
    public int f23416u;

    /* renamed from: v  reason: collision with root package name */
    public String f23417v;

    /* renamed from: w  reason: collision with root package name */
    public String f23418w;

    /* renamed from: x  reason: collision with root package name */
    public String f23419x;

    /* renamed from: y  reason: collision with root package name */
    public String f23420y;

    /* renamed from: z  reason: collision with root package name */
    public String f23421z;

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            arrayList.add(23);
        }
        if (i10 >= 26) {
            arrayList.add(22);
        }
        if (i10 >= 23) {
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(7);
            arrayList.add(8);
        }
        f23387i0 = Collections.unmodifiableCollection(arrayList);
    }

    public u0(int i10) {
        new HashMap();
        this.f23392c = "4.11.5";
        this.f23394d = new TreeMap();
        this.K = "android";
        this.P = 3;
        this.Z = i10;
    }

    public Set<String> a() {
        return Collections.emptySet();
    }

    public final void b(String str) {
        this.Y = str;
    }

    public boolean b() {
        return false;
    }

    public final void c(Context context) {
        s8 b10 = com.startapp.sdk.components.a.a(context).f23229e.a().b();
        Object opt = b10.f22520a.opt(String.valueOf(7));
        if ((opt instanceof Number ? ((Number) opt).intValue() : 0) == 5) {
            this.f23418w = b10.a(8);
            this.f23419x = b10.a(9);
            this.f23420y = b10.a(15);
            this.f23421z = b10.a(16);
        }
        Object opt2 = b10.f22520a.opt(String.valueOf(10));
        int intValue = opt2 instanceof Number ? ((Number) opt2).intValue() : 0;
        if (intValue != 0 && intValue != 2) {
            this.A = b10.a(11);
            this.B = b10.a(12);
        }
        this.C = b10.a(4);
        this.D = b10.a(3);
        this.E = b10.a(5);
        this.F = b10.a(1);
        this.G = b10.a(2);
        this.I = b10.a(13);
        Object opt3 = b10.f22520a.opt(String.valueOf(14));
        this.f23415t = (opt3 instanceof Number ? ((Number) opt3).intValue() : 0) == 1;
    }

    public final void a(Context context, AdPreferences adPreferences) {
        try {
            this.f23401g0 = com.startapp.sdk.components.a.a(context).N.a();
        } catch (Throwable th) {
            l3.a(th);
        }
        b(context);
        try {
            b(context, adPreferences);
        } catch (Throwable unused) {
        }
        try {
            this.f23414s = h6.a(context);
            String str = com.startapp.sdk.components.a.a(context).f23230f.a().f23627h;
            this.H = str;
            this.f23417v = str;
            u1.b bVar = com.startapp.sdk.components.a.a(context).f23243s.a().f23427e;
            this.f23416u = bVar != null ? bVar.a() : -1;
        } catch (Throwable th2) {
            l3.a(th2);
        }
        try {
            c(context);
        } catch (Throwable th3) {
            l3.a(th3);
        }
        try {
            this.J = com.startapp.sdk.components.a.a(context).f23232h.a().a(this);
        } catch (Throwable th4) {
            l3.a(th4);
        }
        try {
            if (!MetaData.f23158k.p()) {
                this.f23400g = com.startapp.sdk.components.a.a(context).f23231g.a().a();
                this.f23405j = com.startapp.sdk.components.a.a(context).f23234j.a().a();
                this.f23396e = com.startapp.sdk.components.a.a(context).G.a().getAll();
            }
        } catch (Throwable th5) {
            l3.a(th5);
        }
        try {
            a(context);
        } catch (Throwable th6) {
            l3.a(th6);
        }
    }

    public final void b(Context context) {
        if (!(this.f23390b != null)) {
            z a10 = com.startapp.sdk.components.a.a(context).f23236l.a();
            String str = a10.f23648c;
            if (str == null) {
                synchronized (a10.f23646a) {
                    str = a10.f23648c;
                    if (str == null) {
                        str = a10.f23647b.getString("c88d4eab540fab77", null);
                    }
                }
            }
            this.f23388a = str;
            this.f23390b = a10.a();
        }
        this.f23402h = context.getPackageName();
    }

    public void b(Context context, AdPreferences adPreferences) {
        String str;
        int i10;
        DisplayMetrics displayMetrics;
        NetworkInfo activeNetworkInfo;
        this.Q = c8.f21846d.f21847a;
        this.f23407l = Build.MANUFACTURER;
        this.f23406k = Build.MODEL;
        this.f23408m = Integer.toString(Build.VERSION.SDK_INT);
        if (adPreferences != null) {
            this.f23398f = adPreferences.getAge(context);
        }
        this.f23404i = com.startapp.sdk.components.a.a(context).f23238n.a().b().f22177a;
        int i11 = y.f23556a;
        boolean z10 = false;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        this.R = str;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused2) {
            i10 = 0;
        }
        this.S = i10;
        this.f23412q = Boolean.valueOf(y.b(context));
        this.T = y.c(context);
        try {
            z10 = a7.a(context);
        } catch (Throwable unused3) {
        }
        this.U = z10;
        this.V = y.e(context);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f23413r = (connectivityManager == null || !y.a(context, "android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? null : Boolean.valueOf(activeNetworkInfo.isRoaming());
        this.W = o9.f(context);
        this.f23403h0 = o9.g(context);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.L = displayMetrics.widthPixels;
            this.M = displayMetrics.heightPixels;
            this.N = displayMetrics.density;
        }
        com.startapp.sdk.components.a a10 = com.startapp.sdk.components.a.a(context);
        d5 b10 = a10.f23227c.a().b();
        this.f23409n = b10.f21875a;
        this.f23410o = b10.f21876b;
        this.f23411p = a10.f23228d.a().b().f21793a;
        com.startapp.sdk.adsbase.e a11 = a10.E.a();
        this.X = a11.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap = this.f23394d;
        String string = a11.getString("sharedPrefsWrappers", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    treeMap.put(next, (String) jSONObject.get(next));
                }
            } catch (JSONException unused4) {
            }
        }
        this.O = Boolean.valueOf(o9.e(context));
    }

    public final String a(String str) throws SDKException {
        z5 z5Var = new z5(a());
        a(z5Var);
        String z5Var2 = z5Var.toString();
        if (str.contains("?") && z5Var2.startsWith("?")) {
            return str + b9.i.f16694c + z5Var2.substring(1);
        }
        return str + z5Var2;
    }

    public final void a(Context context) {
        boolean z10;
        try {
            this.f23389a0 = null;
            if (Build.VERSION.SDK_INT >= 18) {
                this.f23389a0 = Long.valueOf(new StatFs(Environment.getRootDirectory().getAbsolutePath()).getFreeBytes());
            }
        } catch (Throwable th) {
            l3.a(th);
        }
        boolean z11 = true;
        try {
            this.f23393c0 = null;
            this.f23391b0 = null;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                if (registerReceiver.hasExtra("status")) {
                    int intExtra = registerReceiver.getIntExtra("status", -1);
                    if (intExtra != 2 && intExtra != 5) {
                        z10 = false;
                        this.f23393c0 = Boolean.valueOf(z10);
                    }
                    z10 = true;
                    this.f23393c0 = Boolean.valueOf(z10);
                }
                if (registerReceiver.hasExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL) && registerReceiver.hasExtra("scale")) {
                    int intExtra2 = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        this.f23391b0 = Integer.valueOf((intExtra2 * 100) / intExtra3);
                    }
                }
            }
        } catch (Throwable th2) {
            l3.a(th2);
        }
        try {
            this.f23395d0 = null;
            Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (systemService instanceof AudioManager) {
                AudioManager audioManager = (AudioManager) systemService;
                if (Build.VERSION.SDK_INT >= 23) {
                    AudioDeviceInfo[] devices = audioManager.getDevices(2);
                    if (devices != null) {
                        for (AudioDeviceInfo audioDeviceInfo : devices) {
                            if (audioDeviceInfo != null && f23387i0.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                                break;
                            }
                        }
                    }
                    z11 = false;
                    this.f23395d0 = Boolean.valueOf(z11);
                }
            }
        } catch (Throwable th3) {
            l3.a(th3);
        }
        try {
            this.f23397e0 = null;
            Object systemService2 = context.getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                PowerManager powerManager = (PowerManager) systemService2;
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f23397e0 = Boolean.valueOf(powerManager.isPowerSaveMode());
                }
            }
        } catch (Throwable th4) {
            l3.a(th4);
        }
        try {
            this.f23399f0 = null;
            int i10 = context.getResources().getConfiguration().uiMode & 48;
            if (i10 == 32) {
                this.f23399f0 = Boolean.TRUE;
            } else if (i10 == 16) {
                this.f23399f0 = Boolean.FALSE;
            }
        } catch (Throwable th5) {
            l3.a(th5);
        }
    }

    public void a(w6 w6Var) throws SDKException {
        Map<String, ?> map = this.f23396e;
        if (map != null) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                w6Var.a(entry.getKey(), entry.getValue(), false, true);
            }
        }
        w6Var.a("publisherId", this.f23388a, false, true);
        w6Var.a(InAppPurchaseMetaData.KEY_PRODUCT_ID, this.f23390b, b(), true);
        w6Var.a(fe.E, this.K, true, true);
        w6Var.a("sdkVersion", this.f23392c, false, true);
        w6Var.a("flavor", 1023, false, true);
        TreeMap treeMap = this.f23394d;
        if (treeMap != null && !treeMap.isEmpty()) {
            String str = "";
            for (String str2 : this.f23394d.keySet()) {
                str = str + str2 + ":" + ((String) this.f23394d.get(str2)) + ";";
            }
            w6Var.a("frameworksData", str.substring(0, str.length() - 1), false, false);
        }
        w6Var.a("packageId", this.f23402h, false, true);
        w6Var.a("installerPkg", this.f23404i, false, true);
        w6Var.a(IronSourceSegment.AGE, this.f23398f, false, true);
        s sVar = this.f23400g;
        if (sVar != null) {
            w6Var.a("userAdvertisingId", sVar.f22479a, false, true);
            boolean z10 = this.f23400g.f22481c;
            if (z10) {
                w6Var.a("limat", Boolean.valueOf(z10), false, true);
            }
            w6Var.a("advertisingIdSource", this.f23400g.f22480b, false, true);
        }
        String str3 = this.f23405j;
        if (str3 != null) {
            w6Var.a("duid", str3, false, true);
        }
        w6Var.a(fe.B, this.f23406k, false, true);
        w6Var.a("manufacturer", this.f23407l, false, true);
        w6Var.a("deviceVersion", this.f23408m, false, true);
        w6Var.a("locale", this.f23409n, false, true);
        w6Var.a("localeList", this.f23410o, false, true);
        w6Var.a("inputLangs", this.f23411p, false, true);
        w6Var.a("isp", this.f23418w, false, true);
        w6Var.a("ispName", this.f23419x, false, true);
        w6Var.a("ispCarrId", this.f23420y, false, true);
        w6Var.a("ispCarrIdName", this.f23421z, false, true);
        w6Var.a("netOper", this.A, false, true);
        w6Var.a("networkOperName", this.B, false, true);
        w6Var.a("cid", this.C, false, true);
        w6Var.a("lac", this.D, false, true);
        w6Var.a("tac", this.E, false, true);
        w6Var.a("blat", this.F, false, true);
        w6Var.a("blon", this.G, false, true);
        w6Var.a("subPublisherId", null, false, true);
        w6Var.a("subProductId", null, false, true);
        w6Var.a("retryCount", null, false, true);
        w6Var.a("roaming", this.f23413r, false, true);
        w6Var.a("grid", this.f23414s, false, true);
        if (this.f23415t) {
            w6Var.a("c5g", "1", false, false);
        }
        int i10 = this.f23416u;
        if (i10 >= 0) {
            w6Var.a("transport", String.valueOf(i10), false, false);
        }
        if (this.f23403h0) {
            w6Var.a("tv", Boolean.TRUE, false, false);
        }
        w6Var.a("silev", this.f23417v, false, true);
        w6Var.a("cellSignalLevel", this.H, false, true);
        w6Var.a("cellTimingAdv", this.I, false, true);
        w6Var.a("outsource", this.f23412q, false, true);
        w6Var.a("width", String.valueOf(this.L), false, true);
        w6Var.a("height", String.valueOf(this.M), false, true);
        w6Var.a("density", String.valueOf(this.N), false, true);
        w6Var.a("fgApp", this.O, false, true);
        w6Var.a("sdkId", String.valueOf(this.P), true, true);
        w6Var.a("clientSessionId", this.Q, false, true);
        w6Var.a(b9.i.W, this.R, false, true);
        w6Var.a("appCode", Integer.valueOf(this.S), false, true);
        w6Var.a("timeSinceBoot", Long.valueOf(SystemClock.elapsedRealtime()), false, true);
        w6Var.a("udbg", Boolean.valueOf(this.T), false, true);
        w6Var.a("root", Boolean.valueOf(this.U), false, true);
        w6Var.a("smltr", Boolean.valueOf(this.V), false, true);
        w6Var.a("isddbg", Boolean.valueOf(this.W), false, true);
        w6Var.a("pas", this.X, false, true);
        w6Var.a("prm", this.Y, false, false);
        w6Var.a("free", this.f23389a0, false, false);
        w6Var.a("chr", this.f23393c0, false, false);
        w6Var.a("blp", this.f23391b0, false, false);
        w6Var.a("hs", this.f23395d0, false, false);
        w6Var.a(fe.U0, this.f23397e0, false, false);
        w6Var.a("dm", this.f23399f0, false, false);
        c0 c0Var = this.f23401g0;
        if (c0Var != null) {
            long j10 = 0;
            if (c0Var.f21809d > 0) {
                ((com.startapp.sdk.components.f0) c0Var.f21806a).getClass();
                j10 = SystemClock.elapsedRealtime() - c0Var.f21809d;
            }
            w6Var.a("appSessionDuration", Long.valueOf(j10 / 1000), false, false);
        }
        w6Var.a("rsc", this.J, false, true);
    }
}
