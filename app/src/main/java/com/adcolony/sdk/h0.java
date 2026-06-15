package com.adcolony.sdk;

import com.adcolony.sdk.e0;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    private String f6026a;

    /* renamed from: b  reason: collision with root package name */
    private f1 f6027b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(f1 f1Var) {
        if (f1Var == null) {
            try {
                f1Var = new f1();
            } catch (JSONException e8) {
                new e0.a().a("JSON Error in ADCMessage constructor: ").a(e8.toString()).a(e0.f5981i);
                return;
            }
        }
        this.f6027b = f1Var;
        this.f6026a = f1Var.e("m_type");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0 a(f1 f1Var) {
        try {
            h0 h0Var = new h0("reply", this.f6027b.b("m_origin"), f1Var);
            h0Var.f6027b.b("m_id", this.f6027b.b("m_id"));
            return h0Var;
        } catch (JSONException e8) {
            new e0.a().a("JSON error in ADCMessage's createReply(): ").a(e8.toString()).a(e0.f5981i);
            return new h0("JSONException", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(f1 f1Var) {
        if (f1Var == null) {
            f1Var = new f1();
        }
        this.f6027b = f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        a.a(this.f6026a, this.f6027b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f6026a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 a() {
        return this.f6027b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(String str, int i10) {
        try {
            this.f6026a = str;
            f1 f1Var = new f1();
            this.f6027b = f1Var;
            f1Var.b("m_target", i10);
        } catch (JSONException e8) {
            new e0.a().a("JSON Error in ADCMessage constructor: ").a(e8.toString()).a(e0.f5981i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(String str, int i10, f1 f1Var) {
        try {
            this.f6026a = str;
            f1Var = f1Var == null ? new f1() : f1Var;
            this.f6027b = f1Var;
            f1Var.b("m_target", i10);
        } catch (JSONException e8) {
            new e0.a().a("JSON Error in ADCMessage constructor: ").a(e8.toString()).a(e0.f5981i);
        }
    }
}
