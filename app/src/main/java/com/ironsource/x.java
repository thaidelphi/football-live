package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class x implements ft<JSONObject>, dt<v> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, h2> f21343a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f21344b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21345a;

        static {
            int[] iArr = new int[ct.values().length];
            try {
                iArr[ct.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ct.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ct.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ct.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ct.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f21345a = iArr;
        }
    }

    private final void b(v vVar) {
        int i10;
        int i11;
        int i12 = a.f21345a[vVar.f().ordinal()];
        if (i12 == 2) {
            i10 = this.f21344b + 1;
        } else if ((i12 != 3 && i12 != 4 && i12 != 5) || (i11 = this.f21344b) <= 0) {
            return;
        } else {
            i10 = i11 - 1;
        }
        this.f21344b = i10;
    }

    public final int a() {
        return this.f21344b;
    }

    @Override // com.ironsource.dt
    public void a(v record) {
        kotlin.jvm.internal.n.f(record, "record");
        String c10 = record.c();
        Map<String, h2> map = this.f21343a;
        h2 h2Var = map.get(c10);
        if (h2Var == null) {
            h2Var = new h2();
            map.put(c10, h2Var);
        }
        h2Var.a(record.a(new w()));
        b(record);
    }

    @Override // com.ironsource.we
    /* renamed from: b */
    public JSONObject a(et mode) {
        kotlin.jvm.internal.n.f(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, h2> entry : this.f21343a.entrySet()) {
            String key = entry.getKey();
            JSONObject a10 = entry.getValue().a(mode);
            if (a10.length() > 0) {
                jSONObject.put(key, a10);
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        return !this.f21343a.isEmpty();
    }
}
