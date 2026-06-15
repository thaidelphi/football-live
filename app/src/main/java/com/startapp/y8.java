package com.startapp;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import com.ironsource.da;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyDataConfig;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class y8 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23620a;

    /* renamed from: b  reason: collision with root package name */
    public final t4<w2> f23621b;

    /* renamed from: c  reason: collision with root package name */
    public final t4<com.startapp.sdk.adsbase.e> f23622c;

    /* renamed from: d  reason: collision with root package name */
    public final t4<v1> f23623d;

    /* renamed from: e  reason: collision with root package name */
    public final j2<TelephonyMetadata> f23624e;

    /* renamed from: f  reason: collision with root package name */
    public b f23625f;

    /* renamed from: g  reason: collision with root package name */
    public final double f23626g = Math.random();

    /* renamed from: h  reason: collision with root package name */
    public volatile String f23627h = "e106";

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends b {

        /* renamed from: d  reason: collision with root package name */
        public final C0254a f23628d;

        /* compiled from: Sta */
        /* renamed from: com.startapp.y8$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class C0254a extends TelephonyCallback implements TelephonyCallback.ServiceStateListener, TelephonyCallback.SignalStrengthsListener {
            public C0254a() {
            }

            @Override // android.telephony.TelephonyCallback.ServiceStateListener
            public final void onServiceStateChanged(ServiceState serviceState) {
                a.this.a(ServiceState.class, serviceState);
            }

            @Override // android.telephony.TelephonyCallback.SignalStrengthsListener
            public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
                y8.this.a(signalStrength);
                a.this.a(SignalStrength.class, signalStrength);
            }
        }

        public a(TelephonyManager telephonyManager, Class<?> cls) {
            super(telephonyManager, cls);
            this.f23628d = new C0254a();
        }

        @Override // com.startapp.y8.b
        public final void a() {
            this.f23631a.registerTelephonyCallback(y8.this.f23621b.a(), this.f23628d);
        }

        @Override // com.startapp.y8.b
        public final void b() {
            this.f23631a.unregisterTelephonyCallback(this.f23628d);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final TelephonyManager f23631a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f23632b;

        public b(TelephonyManager telephonyManager, Class<?> cls) {
            this.f23631a = telephonyManager;
            this.f23632b = cls;
        }

        public abstract void a();

        public final <T> void a(Class<T> cls, T t10) {
            y8 y8Var = y8.this;
            y8Var.getClass();
            try {
                TelephonyMetadata a10 = y8Var.a();
                if (a10 != null && t10 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String simpleName = cls.getSimpleName();
                    if (a10.a(simpleName).c()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(da.a.f16995d, currentTimeMillis);
                        jSONObject.put("type", simpleName);
                        jSONObject.put("data", t10.toString());
                        y8Var.f23622c.a().edit().putString(simpleName, o9.a(jSONObject.toString())).apply();
                    }
                }
            } catch (Throwable th) {
                if (y8Var.a(2)) {
                    l3.a(th);
                }
            }
            if (cls.equals(this.f23632b)) {
                try {
                    b();
                } catch (Throwable th2) {
                    if (y8.this.a(16)) {
                        l3.a(th2);
                    }
                }
            }
        }

        public abstract void b();
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends b {

        /* renamed from: d  reason: collision with root package name */
        public final a f23634d;

        /* compiled from: Sta */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class a extends PhoneStateListener {
            public a() {
            }

            @Override // android.telephony.PhoneStateListener
            public final void onServiceStateChanged(ServiceState serviceState) {
                c.this.a(ServiceState.class, serviceState);
            }

            @Override // android.telephony.PhoneStateListener
            public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
                y8.this.a(signalStrength);
                c.this.a(SignalStrength.class, signalStrength);
            }
        }

        public c(TelephonyManager telephonyManager, Class<?> cls) {
            super(telephonyManager, cls);
            this.f23634d = new a();
        }

        @Override // com.startapp.y8.b
        public final void a() {
            this.f23631a.listen(this.f23634d, 257);
        }

        @Override // com.startapp.y8.b
        public final void b() {
            this.f23631a.listen(this.f23634d, 0);
        }
    }

    public y8(Context context, t4<w2> t4Var, t4<com.startapp.sdk.adsbase.e> t4Var2, t4<v1> t4Var3, j2<TelephonyMetadata> j2Var) {
        this.f23620a = context;
        this.f23621b = t4Var;
        this.f23622c = t4Var2;
        this.f23623d = t4Var3;
        this.f23624e = j2Var;
    }

    public final b a(Class<?> cls) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f23620a.getSystemService("phone");
        if (telephonyManager != null) {
            if (Build.VERSION.SDK_INT < 31) {
                return new c(telephonyManager, cls);
            }
            return new a(telephonyManager, cls);
        }
        return null;
    }

    public final TelephonyMetadata a() {
        TelephonyMetadata call;
        Boolean b10 = this.f23623d.a().b();
        if ((b10 != null && b10.booleanValue()) && (call = this.f23624e.call()) != null && call.c()) {
            return call;
        }
        return null;
    }

    public final boolean a(int i10) {
        TelephonyMetadata a10 = a();
        return a10 != null && this.f23626g < a10.b() && (a10.a() & i10) == i10;
    }

    public final void a(SignalStrength signalStrength) {
        if (signalStrength == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                this.f23627h = String.valueOf(signalStrength.getLevel());
            } else {
                this.f23627h = String.valueOf(SignalStrength.class.getMethod("getLevel", new Class[0]).invoke(signalStrength, new Object[0]));
            }
        } catch (NoSuchMethodException unused) {
            this.f23627h = "e104";
        } catch (Throwable unused2) {
            this.f23627h = "e105";
        }
    }

    public final Map<String, String> a(m3 m3Var) {
        List<String> a10;
        TelephonyMetadata a11 = a();
        if (a11 == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = null;
        for (Map.Entry<String, ?> entry : this.f23622c.a().getAll().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                String key = entry.getKey();
                TelephonyDataConfig a12 = a11.a(key);
                if (a12.c() && (a10 = a12.a()) != null && a10.contains(m3Var.f22288a)) {
                    String b10 = a12.b();
                    if (b10 != null) {
                        key = b10;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(key, (String) value);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }
}
