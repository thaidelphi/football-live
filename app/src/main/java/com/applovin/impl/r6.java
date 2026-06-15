package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f8546a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f8547b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f8548c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f8549d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f8550e;

    /* renamed from: f  reason: collision with root package name */
    private String f8551f;

    /* renamed from: g  reason: collision with root package name */
    private String f8552g;

    /* renamed from: h  reason: collision with root package name */
    private String f8553h;

    /* renamed from: i  reason: collision with root package name */
    private String f8554i;

    /* renamed from: j  reason: collision with root package name */
    private String f8555j;

    /* renamed from: k  reason: collision with root package name */
    private final List f8556k;

    public r6(com.applovin.impl.sdk.j jVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.j.m());
        this.f8547b = defaultSharedPreferences;
        this.f8556k = new ArrayList();
        this.f8546a = jVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f8548c = a(q4.f8453p.a());
        this.f8549d = a(q4.f8454q.a());
        this.f8550e = h();
        this.f8551f = (String) r4.a(q4.f8456s, (Object) null, defaultSharedPreferences, false);
        this.f8552g = (String) r4.a(q4.f8457t, (Object) null, defaultSharedPreferences, false);
        this.f8553h = (String) r4.a(q4.f8458u, (Object) null, defaultSharedPreferences, false);
        this.f8554i = (String) r4.a(q4.f8460w, (Object) null, defaultSharedPreferences, false);
        this.f8555j = (String) r4.a(q4.f8462y, (Object) null, defaultSharedPreferences, false);
        c(this.f8552g);
    }

    private Integer h() {
        String a10 = q4.f8455r.a();
        if (this.f8547b.contains(a10)) {
            Integer num = (Integer) r4.a(a10, null, Integer.class, this.f8547b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f8546a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I = this.f8546a.I();
                    I.b("TcfManager", "Integer value (" + num + ") for " + a10 + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l10 = (Long) r4.a(a10, null, Long.class, this.f8547b, false);
            if (l10 != null) {
                if (l10.longValue() != 1 && l10.longValue() != 0) {
                    this.f8546a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n I2 = this.f8546a.I();
                        I2.b("TcfManager", "Long value (" + l10 + ") for " + a10 + " is invalid - setting GDPR Applies to null");
                    }
                    return null;
                }
                return Integer.valueOf(l10.intValue());
            }
            Boolean bool = (Boolean) r4.a(a10, null, Boolean.class, this.f8547b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) r4.a(a10, null, String.class, this.f8547b, false);
            if (str != null) {
                if (!"1".equals(str) && !com.ironsource.mediationsdk.metadata.a.f18924g.equals(str)) {
                    if (!"0".equals(str) && !"false".equals(str)) {
                        this.f8546a.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            com.applovin.impl.sdk.n I3 = this.f8546a.I();
                            I3.b("TcfManager", "String value (" + str + ") for " + a10 + " is invalid - setting GDPR Applies to null");
                        }
                        return null;
                    }
                    return 0;
                }
                return 1;
            }
        }
        return null;
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f8556k.add(((y2) it.next()).t());
        }
        d(this.f8553h);
        b(this.f8552g);
    }

    public boolean b() {
        return u6.a(this.f8552g);
    }

    public String c() {
        return this.f8552g;
    }

    public String d() {
        return p6.a(this.f8548c);
    }

    public Integer e() {
        return this.f8548c;
    }

    public Integer f() {
        return this.f8549d;
    }

    public Integer g() {
        return this.f8550e;
    }

    public List i() {
        return this.f8556k;
    }

    public String j() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f8548c) + a("CMP SDK Version", this.f8549d) + a(q4.f8455r.a(), this.f8550e) + a(q4.f8456s.a(), this.f8551f) + a(q4.f8457t.a(), this.f8552g);
    }

    public String k() {
        return this.f8551f;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f8546a.I().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
        } else if (str.equals(q4.f8453p.a())) {
            this.f8548c = a(str);
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = this.f8546a.I();
                I.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8548c);
            }
            this.f8546a.L0();
        } else if (str.equals(q4.f8454q.a())) {
            this.f8549d = a(str);
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I2 = this.f8546a.I();
                I2.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8549d);
            }
        } else if (str.equals(q4.f8455r.a())) {
            this.f8550e = h();
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I3 = this.f8546a.I();
                I3.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8550e);
            }
        } else if (str.equals(q4.f8456s.a())) {
            this.f8551f = (String) r4.a(str, (Object) null, String.class, sharedPreferences);
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I4 = this.f8546a.I();
                I4.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8551f);
            }
            this.f8546a.L0();
        } else if (str.equals(q4.f8457t.a())) {
            this.f8552g = (String) r4.a(str, (Object) null, String.class, sharedPreferences);
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I5 = this.f8546a.I();
                I5.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8552g);
            }
            c(this.f8552g);
            b(this.f8552g);
        } else if (str.equals(q4.f8458u.a())) {
            this.f8553h = (String) r4.a(str, (Object) null, String.class, sharedPreferences);
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I6 = this.f8546a.I();
                I6.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8553h);
            }
            d(this.f8553h);
        } else if (str.equals(q4.f8459v.a())) {
            String str2 = (String) r4.a(str, (Object) null, String.class, sharedPreferences);
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I7 = this.f8546a.I();
                I7.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
            }
        } else if (str.equals(q4.f8460w.a())) {
            this.f8554i = (String) r4.a(str, (Object) null, String.class, sharedPreferences);
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I8 = this.f8546a.I();
                I8.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8554i);
            }
        } else if (str.equals(q4.f8461x.a())) {
            String str3 = (String) r4.a(str, (Object) null, String.class, sharedPreferences);
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I9 = this.f8546a.I();
                I9.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
            }
        } else if (str.equals(q4.f8462y.a())) {
            this.f8555j = (String) r4.a(str, (Object) null, String.class, sharedPreferences);
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I10 = this.f8546a.I();
                I10.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f8555j);
            }
        } else if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) r4.a(str, (Object) null, String.class, sharedPreferences);
            this.f8546a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I11 = this.f8546a.I();
                I11.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }

    public Boolean b(int i10) {
        String str = this.f8554i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(u6.a(str, i10 - 1));
    }

    public Boolean c(int i10) {
        String str = this.f8555j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(u6.a(str, i10 - 1));
    }

    public Boolean d(int i10) {
        String str = this.f8553h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(u6.a(str, i10 - 1));
    }

    private void b(String str) {
        for (s6 s6Var : this.f8556k) {
            if (s6Var.f() == s6.a.ATP_NETWORK && s6Var.d() != null) {
                s6Var.a(u6.a(s6Var.d().intValue(), str));
            }
        }
    }

    private void c(String str) {
        this.f8546a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f8546a.I();
            I.a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean a10 = u6.a(1301, str);
        if (a10 != null) {
            if (a10.booleanValue()) {
                this.f8546a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f8546a.I().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                m0.b(true, com.applovin.impl.sdk.j.m());
            } else {
                this.f8546a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f8546a.I().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                m0.b(false, com.applovin.impl.sdk.j.m());
            }
            this.f8546a.L0();
            return;
        }
        this.f8546a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f8546a.I().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void d(String str) {
        if (str != null) {
            for (s6 s6Var : this.f8556k) {
                if (s6Var.f() == s6.a.TCF_VENDOR && s6Var.d() != null) {
                    s6Var.a(Boolean.valueOf(u6.a(str, s6Var.d().intValue() - 1)));
                }
            }
            return;
        }
        for (s6 s6Var2 : this.f8556k) {
            s6Var2.a(null);
        }
    }

    public Boolean a(int i10) {
        return u6.a(i10, this.f8552g);
    }

    private Integer a(String str) {
        if (this.f8547b.contains(str)) {
            Integer num = (Integer) r4.a(str, null, Integer.class, this.f8547b, false);
            if (num != null) {
                return num;
            }
            Long l10 = (Long) r4.a(str, null, Long.class, this.f8547b, false);
            if (l10 != null && l10.longValue() >= -2147483648L && l10.longValue() <= 2147483647L) {
                return Integer.valueOf(l10.intValue());
            }
            String str2 = (String) r4.a(str, null, String.class, this.f8547b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f8546a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I = this.f8546a.I();
                    I.b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    private void a() {
        this.f8548c = null;
        this.f8550e = null;
        this.f8551f = null;
        this.f8552g = null;
        this.f8553h = null;
        for (s6 s6Var : this.f8556k) {
            s6Var.a(null);
        }
    }

    private String a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(str);
        sb.append(" - ");
        sb.append(obj != null ? obj.toString() : "No value set");
        return sb.toString();
    }
}
