package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.b0;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a0 extends z {

    /* renamed from: f  reason: collision with root package name */
    private final String f6454f;

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f6455g;

    /* renamed from: h  reason: collision with root package name */
    private final List f6456h;

    /* renamed from: i  reason: collision with root package name */
    private final c f6457i;

    /* renamed from: j  reason: collision with root package name */
    private StringBuffer f6458j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f6459k;

    /* renamed from: l  reason: collision with root package name */
    private final ExecutorService f6460l;

    /* renamed from: m  reason: collision with root package name */
    private List f6461m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements b0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6462a;

        a(String str) {
            this.f6462a = str;
        }

        @Override // com.applovin.impl.b0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) a0.this.f9797a.a(o4.U0)).booleanValue()) {
                    synchronized (a0.this.f6459k) {
                        StringUtils.replaceAll(a0.this.f6458j, this.f6462a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(a0.this.f6458j, this.f6462a, uri.toString());
                }
                a0.this.f6455g.a(uri);
                return;
            }
            com.applovin.impl.sdk.n nVar = a0.this.f9799c;
            if (com.applovin.impl.sdk.n.a()) {
                a0 a0Var = a0.this;
                com.applovin.impl.sdk.n nVar2 = a0Var.f9799c;
                String str = a0Var.f9798b;
                nVar2.a(str, "Failed to cache JavaScript resource " + this.f6462a);
            }
            if (a0.this.f6457i != null) {
                a0.this.f6457i.a(a0.this.f6454f, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements b0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6465b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f6466c;

        b(String str, String str2, String str3) {
            this.f6464a = str;
            this.f6465b = str2;
            this.f6466c = str3;
        }

        @Override // com.applovin.impl.b0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) a0.this.f9797a.a(o4.U0)).booleanValue()) {
                    synchronized (a0.this.f6459k) {
                        StringUtils.replaceAll(a0.this.f6458j, this.f6464a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(a0.this.f6458j, this.f6464a, uri.toString());
                }
                a0.this.f6455g.a(uri);
                return;
            }
            List X = a0.this.f6455g.X();
            if (!X.contains(this.f6465b + this.f6466c) || a0.this.f6457i == null) {
                return;
            }
            a0.this.f6457i.a(a0.this.f6454f, true);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void a(String str, boolean z10);
    }

    public a0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, com.applovin.impl.sdk.j jVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", jVar);
        this.f6454f = str;
        this.f6455g = bVar;
        this.f6456h = list;
        this.f6460l = executorService;
        this.f6457i = cVar;
        this.f6458j = new StringBuffer(str);
        this.f6459k = new Object();
    }

    private void a(String str) {
        c cVar;
        if (this.f9801e.get() || (cVar = this.f6457i) == null) {
            return;
        }
        cVar.a(str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.HashSet c() {
        /*
            r17 = this;
            r0 = r17
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Collection r2 = r17.e()
            java.util.List r3 = r0.f6456h
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lcd
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            r6 = r5
            r7 = r6
        L20:
            java.lang.String r8 = r0.f6454f
            int r8 = r8.length()
            if (r6 >= r8) goto L11
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.f9801e
            boolean r6 = r6.get()
            r8 = 0
            if (r6 == 0) goto L32
            return r8
        L32:
            java.lang.String r6 = r0.f6454f
            int r6 = r6.indexOf(r4, r7)
            r7 = -1
            if (r6 != r7) goto L3c
            goto L11
        L3c:
            java.lang.String r7 = r0.f6454f
            int r7 = r7.length()
            r9 = r6
        L43:
            java.lang.String r10 = r0.f6454f
            char r10 = r10.charAt(r9)
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            boolean r10 = r2.contains(r10)
            if (r10 != 0) goto L58
            if (r9 >= r7) goto L58
            int r9 = r9 + 1
            goto L43
        L58:
            if (r9 <= r6) goto Lbd
            if (r9 == r7) goto Lbd
            java.lang.String r7 = r0.f6454f
            int r8 = r4.length()
            int r8 = r8 + r6
            java.lang.String r7 = r7.substring(r8, r9)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r7)
            if (r8 == 0) goto L9c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r7)
            java.lang.String r11 = r8.toString()
            com.applovin.impl.b0 r8 = new com.applovin.impl.b0
            com.applovin.impl.sdk.ad.b r12 = r0.f6455g
            r10 = 1
            java.lang.String[] r10 = new java.lang.String[r10]
            r10[r5] = r4
            java.util.List r13 = java.util.Arrays.asList(r10)
            com.applovin.impl.sdk.j r15 = r0.f9797a
            com.applovin.impl.a0$b r14 = new com.applovin.impl.a0$b
            r14.<init>(r11, r4, r7)
            r7 = 1
            r10 = r8
            r16 = r14
            r14 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r1.add(r8)
            goto Lba
        L9c:
            boolean r8 = com.applovin.impl.sdk.n.a()
            if (r8 == 0) goto Lba
            com.applovin.impl.sdk.n r8 = r0.f9799c
            java.lang.String r10 = r0.f9798b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Skip caching of non-resource "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            r8.a(r10, r7)
        Lba:
            r7 = r9
            goto L20
        Lbd:
            boolean r1 = com.applovin.impl.sdk.n.a()
            if (r1 == 0) goto Lcc
            com.applovin.impl.sdk.n r1 = r0.f9799c
            java.lang.String r2 = r0.f9798b
            java.lang.String r3 = "Unable to cache resource; ad HTML is invalid."
            r1.b(r2, r3)
        Lcc:
            return r8
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.a0.c():java.util.HashSet");
    }

    private HashSet d() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f6454f, (String) this.f9797a.a(o4.P4)), 1)) {
            if (this.f9801e.get()) {
                return null;
            }
            if (!StringUtils.isValidString(str)) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f9799c;
                    String str2 = this.f9798b;
                    nVar.a(str2, "Skip caching of non-resource " + str);
                }
            } else {
                hashSet.add(new b0(str, this.f6455g, Collections.emptyList(), false, this.f9797a, new a(str)));
            }
        }
        return hashSet;
    }

    private Collection e() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f9797a.a(o4.F0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public Boolean call() {
        HashSet d10;
        if (this.f9801e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f6454f)) {
            a(this.f6454f);
            return Boolean.FALSE;
        } else if (!((Boolean) this.f9797a.a(o4.G0)).booleanValue()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9799c.a(this.f9798b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f6454f);
            return Boolean.FALSE;
        } else {
            HashSet hashSet = new HashSet();
            HashSet c10 = c();
            if (c10 != null) {
                hashSet.addAll(c10);
            }
            if (((Boolean) this.f9797a.a(o4.O4)).booleanValue() && (d10 = d()) != null) {
                hashSet.addAll(d10);
            }
            this.f6461m = new ArrayList(hashSet);
            if (this.f9801e.get()) {
                return Boolean.FALSE;
            }
            List list = this.f6461m;
            if (list != null && !list.isEmpty()) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f9799c;
                    String str = this.f9798b;
                    nVar.a(str, "Executing " + this.f6461m.size() + " caching operations...");
                }
                this.f6460l.invokeAll(this.f6461m);
                if (((Boolean) this.f9797a.a(o4.U0)).booleanValue()) {
                    synchronized (this.f6459k) {
                        a(this.f6458j.toString());
                    }
                } else {
                    a(this.f6458j.toString());
                }
                return Boolean.TRUE;
            }
            a(this.f6454f);
            return Boolean.FALSE;
        }
    }
}
