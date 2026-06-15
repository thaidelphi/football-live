package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.b9;
import com.ironsource.da;
import com.ironsource.dc;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.events.ISErrorListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.s7;
import com.ironsource.sf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class s7 implements rf {
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    String H;
    String I;
    Set<Integer> J;
    private bc K;
    private IronSourceSegment L;
    private ms M;
    private ISErrorListener N;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20104l;

    /* renamed from: p  reason: collision with root package name */
    private da f20108p;

    /* renamed from: q  reason: collision with root package name */
    private com.ironsource.e f20109q;

    /* renamed from: r  reason: collision with root package name */
    private ArrayList<zb> f20110r;

    /* renamed from: t  reason: collision with root package name */
    private int f20112t;

    /* renamed from: u  reason: collision with root package name */
    private xh f20113u;

    /* renamed from: v  reason: collision with root package name */
    private Context f20114v;

    /* renamed from: z  reason: collision with root package name */
    private int[] f20118z;

    /* renamed from: a  reason: collision with root package name */
    final int f20093a = 1;

    /* renamed from: b  reason: collision with root package name */
    final int f20094b = 100;

    /* renamed from: c  reason: collision with root package name */
    final int f20095c = 5000;

    /* renamed from: d  reason: collision with root package name */
    final int f20096d = 90000;

    /* renamed from: e  reason: collision with root package name */
    final int f20097e = 1024;

    /* renamed from: f  reason: collision with root package name */
    final int f20098f = 5;

    /* renamed from: g  reason: collision with root package name */
    final String f20099g = "supersonic_sdk.db";

    /* renamed from: h  reason: collision with root package name */
    final String f20100h = IronSourceConstants.EVENTS_PROVIDER;

    /* renamed from: i  reason: collision with root package name */
    final String f20101i = "placement";

    /* renamed from: j  reason: collision with root package name */
    private final String f20102j = fe.K0;

    /* renamed from: k  reason: collision with root package name */
    private final String f20103k = fe.V0;

    /* renamed from: m  reason: collision with root package name */
    private boolean f20105m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f20106n = false;

    /* renamed from: o  reason: collision with root package name */
    private int f20107o = -1;

    /* renamed from: s  reason: collision with root package name */
    private boolean f20111s = true;

    /* renamed from: w  reason: collision with root package name */
    private int f20115w = 100;

    /* renamed from: x  reason: collision with root package name */
    private int f20116x = 5000;

    /* renamed from: y  reason: collision with root package name */
    private int f20117y = 1;
    private Map<String, String> D = new HashMap();
    private Map<String, String> E = new HashMap();
    private String F = "";
    private final Object O = new Object();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s7.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ zb f20120a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IronSource.AD_UNIT f20121b;

        b(zb zbVar, IronSource.AD_UNIT ad_unit) {
            this.f20120a = zbVar;
            this.f20121b = ad_unit;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20120a.a("eventSessionId", s7.this.f20113u.b());
            this.f20120a.a("essn", Integer.valueOf(s7.this.f20113u.c()));
            String connectionType = IronSourceUtils.getConnectionType(s7.this.f20114v);
            if (s7.this.g(this.f20120a)) {
                this.f20120a.a(b9.i.f16727t, connectionType);
            }
            if (s7.this.a(connectionType, this.f20120a)) {
                zb zbVar = this.f20120a;
                zbVar.a(s7.this.b(zbVar));
            }
            String d10 = y8.d(s7.this.f20114v);
            if (d10 != null) {
                this.f20120a.a(b9.i.f16728u, d10);
            }
            int a10 = s7.this.a(this.f20120a.c(), this.f20121b);
            if (a10 != e.NOT_SUPPORTED.a()) {
                this.f20120a.a("adUnit", Integer.valueOf(a10));
            }
            s7.this.a(this.f20120a, "reason");
            s7.this.a(this.f20120a, IronSourceConstants.EVENTS_EXT1);
            if (!s7.this.E.isEmpty()) {
                for (Map.Entry entry : s7.this.E.entrySet()) {
                    if (!this.f20120a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != da.a.f16995d) {
                        this.f20120a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (s7.this.i(this.f20120a)) {
                if (s7.this.h(this.f20120a) && !s7.this.e(this.f20120a)) {
                    this.f20120a.a("sessionDepth", Integer.valueOf(s7.this.c(this.f20120a)));
                }
                if (s7.this.j(this.f20120a)) {
                    s7.this.f(this.f20120a);
                }
                long a11 = s7.this.f20113u.a();
                if (a11 > 0) {
                    this.f20120a.a("firstSessionTimestamp", Long.valueOf(a11));
                }
                IronLog.EVENT.verbose(this.f20120a.toString());
                s7.this.f20110r.add(this.f20120a);
                s7.d(s7.this);
            }
            s7 s7Var = s7.this;
            boolean a12 = s7Var.a(s7Var.B) ? s7.this.a(this.f20120a.c(), s7.this.B) : s7.this.d(this.f20120a);
            if (!s7.this.f20105m && a12) {
                s7.this.f20105m = true;
            }
            if (s7.this.f20108p != null) {
                if (s7.this.g()) {
                    s7.this.f();
                    return;
                }
                s7 s7Var2 = s7.this;
                if (s7Var2.b(s7Var2.f20110r) || a12) {
                    s7.this.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c implements sf {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(sf.a aVar) {
            try {
                if (aVar.c()) {
                    ArrayList<zb> a10 = s7.this.f20108p.a(s7.this.I);
                    s7.this.f20112t = a10.size() + s7.this.f20110r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    s7.this.a(s7.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                if (s7.this.N != null) {
                    s7.this.N.onError(new IllegalStateException("Error on sending data ", e8));
                }
            }
            a(aVar.b());
        }

        @Override // com.ironsource.sf
        public synchronized void a(final sf.a aVar) {
            s7.this.K.a(new Runnable() { // from class: com.ironsource.z00
                @Override // java.lang.Runnable
                public final void run() {
                    s7.c.this.b(aVar);
                }
            });
        }

        public void a(ArrayList<zb> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e8) {
                    o9.d().a(e8);
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("clearData exception: " + e8.getMessage());
                }
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s7.this.f();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);
        

        /* renamed from: a  reason: collision with root package name */
        private int f20131a;

        e(int i10) {
            this.f20131a = i10;
        }

        public int a() {
            return this.f20131a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, IronSource.AD_UNIT ad_unit) {
        e eVar;
        int a10 = e.NOT_SUPPORTED.a();
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO || ((i10 >= 1000 && i10 < 2000) || (i10 >= 91000 && i10 < 92000))) {
            eVar = e.REWARDED_VIDEO;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL || ((i10 >= 2000 && i10 < 3000) || (i10 >= 92000 && i10 < 93000))) {
            eVar = e.INTERSTITIAL;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER || ((i10 >= 3000 && i10 < 4000) || (i10 >= 93000 && i10 < 94000))) {
            eVar = e.BANNER;
        } else if (ad_unit != IronSource.AD_UNIT.NATIVE_AD && ((i10 < 4000 || i10 >= 5000) && (i10 < 94000 || i10 >= 95000))) {
            return a10;
        } else {
            eVar = e.NATIVE_AD;
        }
        return eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<zb> a(ArrayList<zb> arrayList, String str) {
        String a10 = a(str, 1024);
        Iterator<zb> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(a10);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.O) {
            this.f20108p.a(this.f20110r, this.I);
            this.f20110r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(zb zbVar, String str) {
        a(zbVar, str, 1024);
    }

    private void a(zb zbVar, String str, int i10) {
        JSONObject b10 = zbVar.b();
        if (b10 == null || !b10.has(str)) {
            return;
        }
        try {
            zbVar.a(str, a(b10.optString(str, null), i10));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private void a(JSONObject jSONObject) {
        try {
            IronSourceSegment ironSourceSegment = this.L;
            if (ironSourceSegment != null) {
                if (ironSourceSegment.getAge() > 0) {
                    jSONObject.put(IronSourceSegment.AGE, this.L.getAge());
                }
                if (!TextUtils.isEmpty(this.L.getGender())) {
                    jSONObject.put(IronSourceSegment.GENDER, this.L.getGender());
                }
                if (this.L.getLevel() > 0) {
                    jSONObject.put(IronSourceSegment.LEVEL, this.L.getLevel());
                }
                if (this.L.getIsPaying() != null) {
                    jSONObject.put(IronSourceSegment.PAYING, this.L.getIsPaying().get());
                }
                if (this.L.getIapt() > 0.0d) {
                    jSONObject.put(IronSourceSegment.IAPT, this.L.getIapt());
                }
                if (this.L.getUcd() > 0) {
                    jSONObject.put(IronSourceSegment.USER_CREATION_DATE, this.L.getUcd());
                }
            }
            ms msVar = this.M;
            if (msVar != null) {
                String b10 = msVar.b();
                if (!TextUtils.isEmpty(b10)) {
                    jSONObject.put("segmentId", b10);
                }
                JSONObject a10 = this.M.a();
                Iterator<String> keys = a10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, a10.get(next));
                }
            }
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10, int[] iArr) {
        if (a(iArr)) {
            for (int i11 : iArr) {
                if (i10 == i11) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(String str, zb zbVar) {
        if (str.equalsIgnoreCase("none")) {
            return a(this.C) ? a(zbVar.c(), this.C) : this.J.contains(Integer.valueOf(zbVar.c()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(zb zbVar) {
        return zbVar.c() + 90000;
    }

    private void b(String str) {
        com.ironsource.e eVar = this.f20109q;
        if (eVar == null || !eVar.c().equals(str)) {
            this.f20109q = gc.a(str, this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<zb> arrayList) {
        return arrayList != null && arrayList.size() >= this.f20117y;
    }

    static /* synthetic */ int d(s7 s7Var) {
        int i10 = s7Var.f20112t;
        s7Var.f20112t = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(zb zbVar) {
        JSONObject b10 = zbVar.b();
        if (b10 == null) {
            return false;
        }
        return b10.has("sessionDepth");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ArrayList<zb> a10;
        try {
            this.f20105m = false;
            ArrayList<zb> arrayList = new ArrayList<>();
            synchronized (this.O) {
                a10 = this.f20108p.a(this.I);
                this.f20108p.b(this.I);
            }
            dc.c cVar = new dc.c(new dc.a(a10, this.f20110r), this.f20116x);
            this.f20108p.a(cVar.a(), this.I);
            arrayList.addAll(cVar.b());
            if (arrayList.size() > 0) {
                this.f20110r.clear();
                this.f20112t = 0;
                JSONObject b10 = ce.a().b();
                a(b10);
                String b11 = b();
                if (!TextUtils.isEmpty(b11)) {
                    b10.put(fe.K0, b11);
                }
                String q10 = com.ironsource.mediationsdk.p.m().q();
                if (!TextUtils.isEmpty(q10)) {
                    b10.put(fe.V0, q10);
                }
                Map<String, String> c10 = c();
                if (!c10.isEmpty()) {
                    for (Map.Entry<String, String> entry : c10.entrySet()) {
                        if (!b10.has(entry.getKey())) {
                            b10.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                JSONObject a11 = new ic().a();
                Iterator<String> keys = a11.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    b10.put(next, a11.get(next));
                }
                String a12 = this.f20109q.a(arrayList, b10);
                if (TextUtils.isEmpty(a12)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    ISErrorListener iSErrorListener = this.N;
                    if (iSErrorListener != null) {
                        iSErrorListener.onError(new IllegalStateException("Event parse failed"));
                        return;
                    }
                    return;
                }
                if (this.f20106n) {
                    try {
                        a12 = Base64.encodeToString(xj.a(a12, this.f20107o), 0);
                    } catch (Exception e8) {
                        o9.d().a(e8);
                        ISErrorListener iSErrorListener2 = this.N;
                        if (iSErrorListener2 != null) {
                            iSErrorListener2.onError(new IllegalStateException("Error on compression: ", e8));
                        }
                    }
                }
                wt.f21318a.a(new jc(new c(), a12, this.f20109q.b(), arrayList));
            }
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Send event exception: " + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.f20112t >= this.f20115w || this.f20105m) && this.f20104l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(zb zbVar) {
        if (zbVar != null) {
            if (a(this.f20118z)) {
                return true ^ a(zbVar.c(), this.f20118z);
            }
            if (a(this.A)) {
                return a(zbVar.c(), this.A);
            }
            return true;
        }
        return false;
    }

    String a(String str, int i10) {
        return (TextUtils.isEmpty(str) || str.length() <= i10) ? str : str.substring(0, i10);
    }

    @Override // com.ironsource.rf
    public void a(int i10) {
        if (i10 > 0) {
            this.f20116x = i10;
        }
    }

    public synchronized void a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.I, this.H);
        this.H = defaultEventsFormatterType;
        b(defaultEventsFormatterType);
        this.f20109q.a(IronSourceUtils.getDefaultEventsURL(context, this.I, null));
        this.f20108p = da.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.f20118z = IronSourceUtils.getDefaultOptOutEvents(context, this.I);
        this.A = IronSourceUtils.getDefaultOptInEvents(context, this.I);
        this.B = IronSourceUtils.getDefaultTriggerEvents(context, this.I);
        this.C = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.I);
        this.L = ironSourceSegment;
        this.f20114v = context;
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.L = ironSourceSegment;
    }

    public void a(ISErrorListener iSErrorListener) {
        this.N = iSErrorListener;
    }

    public synchronized void a(ms msVar) {
        this.M = msVar;
    }

    @Override // com.ironsource.rf
    public synchronized void a(zb zbVar) {
        a(zbVar, (IronSource.AD_UNIT) null);
    }

    public synchronized void a(zb zbVar, IronSource.AD_UNIT ad_unit) {
        if (zbVar != null) {
            if (this.f20111s) {
                this.K.a(new b(zbVar, ad_unit));
            }
        }
    }

    void a(Runnable runnable) {
        this.K.a(runnable);
    }

    public void a(String str) {
        this.F = str;
    }

    @Override // com.ironsource.rf
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.I, str);
        b(str);
    }

    protected void a(ArrayList<zb> arrayList) {
        if (arrayList != null) {
            synchronized (this.O) {
                this.f20108p.a(arrayList, this.I);
                this.f20112t = this.f20108p.a(this.I).size() + this.f20110r.size();
            }
        }
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i10, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i10));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    @Override // com.ironsource.rf
    public void a(boolean z10) {
        this.f20106n = z10;
    }

    @Override // com.ironsource.rf
    public void a(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.I, iArr);
    }

    public String b() {
        return this.F;
    }

    @Override // com.ironsource.rf
    public void b(int i10) {
        if (i10 > 0) {
            this.f20115w = i10;
        }
    }

    @Override // com.ironsource.rf
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.ironsource.e eVar = this.f20109q;
        if (eVar != null) {
            eVar.a(str);
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.I, str);
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    @Override // com.ironsource.rf
    public void b(boolean z10) {
        this.f20111s = z10;
    }

    @Override // com.ironsource.rf
    public void b(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.I, iArr);
    }

    protected abstract int c(zb zbVar);

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.ironsource.rf
    public void c(int i10) {
        if (i10 > 0) {
            this.f20117y = i10;
        }
    }

    public void c(boolean z10) {
        this.f20104l = z10;
    }

    @Override // com.ironsource.rf
    public void c(int[] iArr, Context context) {
        this.f20118z = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.I, iArr);
    }

    abstract void d();

    @Override // com.ironsource.rf
    public void d(int i10) {
        this.f20107o = i10;
    }

    @Override // com.ironsource.rf
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.I, iArr);
    }

    protected abstract boolean d(zb zbVar);

    protected abstract String e(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f20110r = new ArrayList<>();
        this.f20112t = 0;
        this.f20109q = gc.a(this.H, this.G);
        bc bcVar = new bc(this.I + "EventThread");
        this.K = bcVar;
        bcVar.start();
        this.K.a();
        this.f20113u = mm.S().h();
        this.J = new HashSet();
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f(int i10) {
        return a(i10, (IronSource.AD_UNIT) null);
    }

    protected abstract void f(zb zbVar);

    protected boolean g(zb zbVar) {
        return (zbVar.c() == 40 || zbVar.c() == 41 || zbVar.c() == 50 || zbVar.c() == 51 || zbVar.c() == 52) ? false : true;
    }

    public void h() {
        this.K.a(new d());
    }

    protected boolean h(zb zbVar) {
        return (zbVar.c() == 14 || zbVar.c() == 114 || zbVar.c() == 514 || zbVar.c() == 515 || zbVar.c() == 516 || zbVar.c() == 140 || zbVar.c() == 40 || zbVar.c() == 41 || zbVar.c() == 50 || zbVar.c() == 51 || zbVar.c() == 52) ? false : true;
    }

    protected abstract boolean j(zb zbVar);
}
