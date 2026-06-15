package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a6 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final AppLovinAdLoadListener f6501g;

    /* renamed from: h  reason: collision with root package name */
    private final a f6502h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends i7 {
        a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
            super(jSONObject, jSONObject2, jVar);
        }

        void a(f8 f8Var) {
            if (f8Var != null) {
                this.f7235b.add(f8Var);
                return;
            }
            throw new IllegalArgumentException("No aggregated vast response specified");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b extends a6 {

        /* renamed from: i  reason: collision with root package name */
        private final String f6503i;

        b(String str, i7 i7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
            super(i7Var, appLovinAdLoadListener, jVar);
            this.f6503i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f8 b10 = b(this.f6503i);
            if (b10 != null) {
                a(b10);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.b(str, "Unable to process XML: " + this.f6503i);
            }
            c(this.f6503i);
            a(j7.XML_PARSING);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c extends a6 {

        /* renamed from: i  reason: collision with root package name */
        private final JSONObject f6504i;

        c(i7 i7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
            super(i7Var, appLovinAdLoadListener, jVar);
            this.f6504i = i7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f6504i, "xml", null);
            if (StringUtils.isValidString(string)) {
                if (string.length() < ((Integer) this.f9827a.a(o4.f8255x4)).intValue()) {
                    f8 b10 = b(string);
                    if (b10 != null) {
                        a(b10);
                        return;
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar = this.f9829c;
                        String str = this.f9828b;
                        nVar.b(str, "Unable to process XML: " + string);
                    }
                    c(string);
                    a(j7.XML_PARSING);
                    return;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9829c.b(this.f9828b, "VAST response is over max length");
                }
                a(j7.XML_PARSING);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.b(this.f9828b, "No VAST response received.");
            }
            a(j7.NO_WRAPPER_RESPONSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d extends a6 {

        /* renamed from: i  reason: collision with root package name */
        private final f8 f6505i;

        d(f8 f8Var, i7 i7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
            super(i7Var, appLovinAdLoadListener, jVar);
            if (f8Var == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (i7Var == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener != null) {
                this.f6505i = f8Var;
                return;
            }
            throw new IllegalArgumentException("No callback specified.");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Processing VAST Wrapper response...");
            }
            a(this.f6505i);
        }
    }

    a6(i7 i7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessVastResponse", jVar);
        if (i7Var != null) {
            this.f6501g = appLovinAdLoadListener;
            this.f6502h = (a) i7Var;
            return;
        }
        throw new IllegalArgumentException("No context specified.");
    }

    public static a6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        return new c(new a(jSONObject, jSONObject2, jVar), appLovinAdLoadListener, jVar);
    }

    protected f8 b(String str) {
        try {
            return g8.a(str, this.f9827a);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Failed to process VAST response", th);
            }
            a(j7.XML_PARSING);
            this.f9827a.D().a(this.f9828b, th);
            return null;
        }
    }

    protected void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f9827a.a(o4.Q4)), 1).iterator();
        while (it.hasNext()) {
            f8 b10 = b("<VAST>" + it.next() + "</VAST>");
            if (b10 != null) {
                this.f6502h.a(b10);
            }
        }
    }

    public static a6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        return new b(str, new a(jSONObject, jSONObject2, jVar), appLovinAdLoadListener, jVar);
    }

    public static a6 a(f8 f8Var, i7 i7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        return new d(f8Var, i7Var, appLovinAdLoadListener, jVar);
    }

    void a(f8 f8Var) {
        int d10 = this.f6502h.d();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Finished parsing XML at depth " + d10);
        }
        this.f6502h.a(f8Var);
        if (q7.b(f8Var)) {
            int intValue = ((Integer) this.f9827a.a(o4.f8263y4)).intValue();
            if (d10 < intValue) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9829c.a(this.f9828b, "VAST response is wrapper. Resolving...");
                }
                this.f9827a.i0().a(new i6(this.f6502h, this.f6501g, this.f9827a));
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9829c;
                String str2 = this.f9828b;
                nVar2.b(str2, "Reached beyond max wrapper depth of " + intValue);
            }
            a(j7.WRAPPER_LIMIT_REACHED);
        } else if (q7.a(f8Var)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "VAST response is inline. Rendering ad...");
            }
            this.f9827a.i0().a(new d6(this.f6502h, this.f6501g, this.f9827a));
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.b(this.f9828b, "VAST response is an error");
            }
            a(j7.NO_WRAPPER_RESPONSE);
        }
    }

    void a(j7 j7Var) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.b(str, "Failed to process VAST response due to VAST error code " + j7Var);
        }
        q7.a(this.f6502h, this.f6501g, j7Var, -6, this.f9827a);
    }
}
