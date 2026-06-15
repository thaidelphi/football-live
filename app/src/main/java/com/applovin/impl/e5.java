package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.b0;
import com.applovin.impl.c5;
import com.applovin.impl.e7;
import com.applovin.impl.m7;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class e5 extends c5 {

    /* renamed from: p  reason: collision with root package name */
    private final e7 f6871p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements b0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m7 f6872a;

        a(m7 m7Var) {
            this.f6872a = m7Var;
        }

        @Override // com.applovin.impl.b0.a
        public void a(Uri uri) {
            if (uri != null) {
                this.f6872a.a(uri);
                e5.this.f6871p.b(true);
                return;
            }
            com.applovin.impl.sdk.n nVar = e5.this.f9829c;
            if (com.applovin.impl.sdk.n.a()) {
                e5 e5Var = e5.this;
                e5Var.f9829c.b(e5Var.f9828b, "Failed to cache static companion ad");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements c5.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m7 f6874a;

        b(m7 m7Var) {
            this.f6874a = m7Var;
        }

        @Override // com.applovin.impl.c5.e
        public void a(String str) {
            this.f6874a.a(str);
            e5.this.f6871p.b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements c5.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m7 f6876a;

        c(m7 m7Var) {
            this.f6876a = m7Var;
        }

        @Override // com.applovin.impl.c5.e
        public void a(String str) {
            this.f6876a.a(str);
            e5.this.f6871p.b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements b0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s7 f6878a;

        d(s7 s7Var) {
            this.f6878a = s7Var;
        }

        @Override // com.applovin.impl.b0.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.n nVar = e5.this.f9829c;
                if (com.applovin.impl.sdk.n.a()) {
                    e5 e5Var = e5.this;
                    com.applovin.impl.sdk.n nVar2 = e5Var.f9829c;
                    String str = e5Var.f9828b;
                    nVar2.a(str, "Video file successfully cached into: " + uri);
                }
                this.f6878a.a(uri);
                return;
            }
            com.applovin.impl.sdk.n nVar3 = e5.this.f9829c;
            if (com.applovin.impl.sdk.n.a()) {
                e5 e5Var2 = e5.this;
                com.applovin.impl.sdk.n nVar4 = e5Var2.f9829c;
                String str2 = e5Var2.f9828b;
                nVar4.b(str2, "Failed to cache video file: " + this.f6878a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements c5.e {
        e() {
        }

        @Override // com.applovin.impl.c5.e
        public void a(String str) {
            if (e5.this.f6871p.isOpenMeasurementEnabled()) {
                str = e5.this.f9827a.V().a(str);
            }
            e5.this.f6871p.b(str);
            com.applovin.impl.sdk.n nVar = e5.this.f9829c;
            if (com.applovin.impl.sdk.n.a()) {
                e5 e5Var = e5.this;
                com.applovin.impl.sdk.n nVar2 = e5Var.f9829c;
                String str2 = e5Var.f9828b;
                nVar2.a(str2, "Finish caching HTML template " + e5.this.f6871p.g1() + " for ad #" + e5.this.f6871p.getAdIdNumber());
            }
        }
    }

    public e5(e7 e7Var, com.applovin.impl.sdk.j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", e7Var, jVar, appLovinAdLoadListener);
        this.f6871p = e7Var;
    }

    private String d(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f9827a.a(o4.P4)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri a10 = a(str2, Collections.emptyList(), false);
                if (a10 != null) {
                    str = str.replace(str2, a10.toString());
                    this.f6740g.a(a10);
                } else if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f9829c;
                    String str3 = this.f9828b;
                    nVar.b(str3, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    private void m() {
        if (l()) {
            return;
        }
        if (this.f6871p.s1()) {
            h7 e12 = this.f6871p.e1();
            if (e12 != null) {
                m7 e8 = e12.e();
                if (e8 != null) {
                    Uri c10 = e8.c();
                    String uri = c10 != null ? c10.toString() : "";
                    String b10 = e8.b();
                    if (!URLUtil.isValidUrl(uri) && !StringUtils.isValidString(b10)) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f9829c.k(this.f9828b, "Companion ad does not have any resources attached. Skipping...");
                        }
                    } else if (e8.d() == m7.a.STATIC) {
                        if (com.applovin.impl.sdk.n.a()) {
                            com.applovin.impl.sdk.n nVar = this.f9829c;
                            String str = this.f9828b;
                            nVar.a(str, "Caching static companion ad at " + uri + "...");
                        }
                        Uri a10 = a(uri, Collections.emptyList(), false);
                        if (a10 != null) {
                            e8.a(a10);
                            this.f6871p.b(true);
                        } else if (com.applovin.impl.sdk.n.a()) {
                            this.f9829c.b(this.f9828b, "Failed to cache static companion ad");
                        }
                    } else if (e8.d() == m7.a.HTML) {
                        if (StringUtils.isValidString(uri)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                com.applovin.impl.sdk.n nVar2 = this.f9829c;
                                String str2 = this.f9828b;
                                nVar2.a(str2, "Begin caching HTML companion ad. Fetching from " + uri + "...");
                            }
                            String c11 = c(uri, null, false);
                            if (StringUtils.isValidString(c11)) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f9829c.a(this.f9828b, "HTML fetched. Caching HTML now...");
                                }
                                e8.a(a(c11, Collections.emptyList(), this.f6871p));
                                this.f6871p.b(true);
                                return;
                            } else if (com.applovin.impl.sdk.n.a()) {
                                com.applovin.impl.sdk.n nVar3 = this.f9829c;
                                String str3 = this.f9828b;
                                nVar3.b(str3, "Unable to load companion ad resources from " + uri);
                                return;
                            } else {
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.n.a()) {
                            com.applovin.impl.sdk.n nVar4 = this.f9829c;
                            String str4 = this.f9828b;
                            nVar4.a(str4, "Caching provided HTML for companion ad. No fetch required. HTML: " + b10);
                        }
                        if (((Boolean) this.f9827a.a(o4.O4)).booleanValue()) {
                            b10 = d(b10);
                        }
                        e8.a(a(b10, Collections.emptyList(), this.f6871p));
                        this.f6871p.b(true);
                    } else if (e8.d() == m7.a.IFRAME && com.applovin.impl.sdk.n.a()) {
                        this.f9829c.a(this.f9828b, "Skip caching of iFrame resource...");
                    }
                } else if (com.applovin.impl.sdk.n.a()) {
                    this.f9829c.b(this.f9828b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                }
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "No companion ad provided. Skipping...");
            }
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "Companion ad caching disabled. Skipping...");
        }
    }

    private void n() {
        if (l() || !q7.a(this.f6871p)) {
            return;
        }
        String g12 = this.f6871p.g1();
        if (StringUtils.isValidString(g12)) {
            String a10 = a(g12, this.f6871p.Y(), this.f6740g);
            if (this.f6871p.isOpenMeasurementEnabled()) {
                a10 = this.f9827a.V().a(a10);
            }
            this.f6871p.b(a10);
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.a(str, "Finish caching HTML template " + this.f6871p.g1() + " for ad #" + this.f6871p.getAdIdNumber());
            }
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "Unable to load HTML template");
        }
    }

    private void o() {
        s7 o12;
        Uri e8;
        if (l()) {
            return;
        }
        if (this.f6871p.t1()) {
            if (this.f6871p.n1() == null || (o12 = this.f6871p.o1()) == null || (e8 = o12.e()) == null) {
                return;
            }
            Uri b10 = b(e8.toString(), Collections.emptyList(), false);
            if (b10 != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f9829c;
                    String str = this.f9828b;
                    nVar.a(str, "Video file successfully cached into: " + b10);
                }
                o12.a(b10);
            } else if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9829c;
                String str2 = this.f9828b;
                nVar2.b(str2, "Failed to cache video file: " + o12);
            }
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "Video caching disabled. Skipping...");
        }
    }

    private z p() {
        if (!this.f6871p.s1()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        h7 e12 = this.f6871p.e1();
        if (e12 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        m7 e8 = e12.e();
        if (e8 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.b(this.f9828b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri c10 = e8.c();
        String uri = c10 != null ? c10.toString() : "";
        String b10 = e8.b();
        if (!URLUtil.isValidUrl(uri) && !StringUtils.isValidString(b10)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.k(this.f9828b, "Companion ad does not have any resources attached. Skipping...");
            }
        } else if (e8.d() == m7.a.STATIC) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.a(str, "Caching static companion ad at " + uri + "...");
            }
            return new b0(uri, this.f6871p, Collections.emptyList(), false, this.f9827a, new a(e8));
        } else if (e8.d() == m7.a.HTML) {
            if (StringUtils.isValidString(uri)) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar2 = this.f9829c;
                    String str2 = this.f9828b;
                    nVar2.a(str2, "Begin caching HTML companion ad. Fetching from " + uri + "...");
                }
                String c11 = c(uri, null, false);
                if (StringUtils.isValidString(c11)) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f9829c.a(this.f9828b, "HTML fetched. Caching HTML now...");
                    }
                    return a(c11, Collections.emptyList(), new b(e8));
                } else if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar3 = this.f9829c;
                    String str3 = this.f9828b;
                    nVar3.b(str3, "Unable to load companion ad resources from " + uri);
                }
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar4 = this.f9829c;
                    String str4 = this.f9828b;
                    nVar4.a(str4, "Caching provided HTML for companion ad. No fetch required. HTML: " + b10);
                }
                return a(b10, Collections.emptyList(), new c(e8));
            }
        } else if (e8.d() == m7.a.IFRAME && com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "Skip caching of iFrame resource...");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.c5
    public void f() {
        this.f6871p.getAdEventTracker().h();
        super.f();
    }

    protected a0 q() {
        if (TextUtils.isEmpty(this.f6871p.g1())) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Unable to load HTML template");
                return null;
            }
            return null;
        }
        return a(this.f6871p.g1(), this.f6871p.Y(), new e());
    }

    protected b0 r() {
        s7 o12;
        Uri e8;
        if (!this.f6871p.t1()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Video caching disabled. Skipping...");
            }
            return null;
        } else if (this.f6871p.n1() == null || (o12 = this.f6871p.o1()) == null || (e8 = o12.e()) == null) {
            return null;
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.a(str, "Caching video file " + o12 + " creative...");
            }
            return a(e8.toString(), Collections.emptyList(), false, new d(o12));
        }
    }

    @Override // com.applovin.impl.c5, java.lang.Runnable
    public void run() {
        super.run();
        boolean G0 = this.f6871p.G0();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            StringBuilder sb = new StringBuilder();
            sb.append("Begin caching for VAST ");
            sb.append(G0 ? "streaming " : "");
            sb.append("ad #");
            sb.append(this.f6740g.getAdIdNumber());
            sb.append("...");
            nVar.a(str, sb.toString());
        }
        if (G0) {
            if (((Boolean) this.f9827a.a(o4.K0)).booleanValue()) {
                if (!l0.f()) {
                    a(e());
                }
                if (this.f6871p.q1()) {
                    f();
                    ArrayList arrayList = new ArrayList();
                    z p10 = p();
                    if (p10 != null) {
                        arrayList.add(p10);
                    }
                    a0 q10 = q();
                    if (q10 != null) {
                        arrayList.add(q10);
                    }
                    b0 r10 = r();
                    if (r10 != null) {
                        arrayList.add(r10);
                    }
                    a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.f6871p.h1() == e7.c.COMPANION_AD) {
                        z p11 = p();
                        if (p11 != null) {
                            arrayList2.add(p11);
                        }
                        a0 q11 = q();
                        if (q11 != null) {
                            arrayList2.add(q11);
                        }
                        a(arrayList2);
                        f();
                        b0 r11 = r();
                        if (r11 != null) {
                            arrayList3.add(r11);
                        }
                        a(arrayList3);
                    } else {
                        b0 r12 = r();
                        if (r12 != null) {
                            arrayList2.add(r12);
                        }
                        a(arrayList2);
                        f();
                        z p12 = p();
                        if (p12 != null) {
                            arrayList3.add(p12);
                        }
                        a0 q12 = q();
                        if (q12 != null) {
                            arrayList3.add(q12);
                        }
                        a(arrayList3);
                    }
                }
            } else {
                j();
                if (this.f6871p.q1()) {
                    f();
                }
                e7.c h12 = this.f6871p.h1();
                e7.c cVar = e7.c.COMPANION_AD;
                if (h12 == cVar) {
                    m();
                    n();
                    a(this.f6871p);
                } else {
                    o();
                }
                if (!this.f6871p.q1()) {
                    f();
                }
                if (this.f6871p.h1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a(this.f6871p);
                }
            }
        } else if (((Boolean) this.f9827a.a(o4.K0)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!l0.f()) {
                arrayList4.addAll(e());
            }
            z p13 = p();
            if (p13 != null) {
                arrayList4.add(p13);
            }
            b0 r13 = r();
            if (r13 != null) {
                arrayList4.add(r13);
            }
            a0 q13 = q();
            if (q13 != null) {
                arrayList4.add(q13);
            }
            a(arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a(this.f6871p);
            f();
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar2 = this.f9829c;
            String str2 = this.f9828b;
            nVar2.a(str2, "Finished caching VAST ad #" + this.f6871p.getAdIdNumber());
        }
        this.f6871p.r1();
        k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.applovin.impl.c5
    public void a(int i10) {
        this.f6871p.getAdEventTracker().f();
        super.a(i10);
    }
}
