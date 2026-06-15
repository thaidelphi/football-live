package com.ironsource.sdk.controller;

import com.ironsource.fh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.nh;
import com.ironsource.o9;
import com.ironsource.po;
import com.ironsource.rk;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sk;
import com.ironsource.tk;
import com.ironsource.uc;
import com.ironsource.wc;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f20375a;

    /* renamed from: b  reason: collision with root package name */
    private final wc f20376b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements po {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ tk f20377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ sk f20378b;

        a(tk tkVar, sk skVar) {
            this.f20377a = tkVar;
            this.f20378b = skVar;
        }

        @Override // com.ironsource.po
        public void a(nh nhVar) {
            try {
                tk tkVar = this.f20377a;
                sk skVar = this.f20378b;
                tkVar.b(skVar, j.this.a(skVar, nhVar.a()));
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }

        @Override // com.ironsource.po
        public void a(nh nhVar, fh fhVar) {
            try {
                tk tkVar = this.f20377a;
                sk skVar = this.f20378b;
                tkVar.a(skVar, j.this.a(skVar, fhVar.b()));
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, wc wcVar) {
        this.f20375a = str;
        this.f20376b = wcVar;
    }

    private nh a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(uc.c.f20973d)) {
            return new nh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(uc.c.f20973d)));
        }
        throw new Exception(uc.a.f20957b);
    }

    private po a(sk skVar, tk tkVar) {
        return new a(tkVar, skVar);
    }

    private JSONObject a(sk skVar, long j10) {
        try {
            return skVar.e().put("result", j10);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(sk skVar, String str) {
        try {
            return skVar.e().put("errMsg", str);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(sk skVar, JSONObject jSONObject) {
        try {
            return skVar.e().put("result", jSONObject);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return new JSONObject();
        }
    }

    private nh b(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(uc.c.f20972c) && jSONObject.has(uc.c.f20971b)) {
            String string = jSONObject.getString(uc.c.f20972c);
            return new nh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(uc.c.f20971b));
        }
        throw new Exception(uc.a.f20956a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject, rk rkVar) {
        JSONObject a10;
        JSONObject jSONObject2;
        sk skVar = new sk(jSONObject);
        tk tkVar = new tk(rkVar);
        try {
            String b10 = skVar.b();
            JSONObject c10 = skVar.c();
            nh b11 = b(c10, this.f20375a);
            IronSourceStorageUtils.ensurePathSafety(b11, this.f20375a);
            char c11 = 65535;
            switch (b10.hashCode()) {
                case -2073025383:
                    if (b10.equals(uc.b.f20964a)) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1137024519:
                    if (b10.equals(uc.b.f20966c)) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -318115535:
                    if (b10.equals(uc.b.f20968e)) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 537556755:
                    if (b10.equals(uc.b.f20969f)) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 1764172231:
                    if (b10.equals(uc.b.f20965b)) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 1953259713:
                    if (b10.equals(uc.b.f20967d)) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            if (c11 == 0) {
                this.f20376b.a(b11, c10.optString(uc.c.f20970a), c10.optInt("connectionTimeout"), c10.optInt("readTimeout"), a(skVar, tkVar));
                return;
            }
            if (c11 == 1) {
                this.f20376b.a(b11);
                a10 = b11.a();
            } else if (c11 == 2) {
                this.f20376b.b(b11);
                a10 = b11.a();
            } else if (c11 == 3) {
                a10 = this.f20376b.c(b11);
            } else if (c11 == 4) {
                jSONObject2 = a(skVar, this.f20376b.d(b11));
                tkVar.b(skVar, jSONObject2);
            } else if (c11 != 5) {
                return;
            } else {
                this.f20376b.a(b11, c10.optJSONObject(uc.c.f20976g));
                a10 = b11.a();
            }
            jSONObject2 = a(skVar, a10);
            tkVar.b(skVar, jSONObject2);
        } catch (Exception e8) {
            o9.d().a(e8);
            tkVar.a(skVar, a(skVar, e8.getMessage()));
        }
    }
}
