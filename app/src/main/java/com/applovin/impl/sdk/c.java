package com.applovin.impl.sdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.a2;
import com.applovin.impl.e7;
import com.applovin.impl.g4;
import com.applovin.impl.k6;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdType;
import com.ironsource.ug;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final File f8797b = new File(j.m().getFilesDir(), "al/persisted-ads");

    /* renamed from: a  reason: collision with root package name */
    private final j f8798a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements g4 {

        /* renamed from: a  reason: collision with root package name */
        private final String f8799a;

        /* renamed from: b  reason: collision with root package name */
        private final AppLovinAdType f8800b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f8801c;

        /* renamed from: d  reason: collision with root package name */
        private final long f8802d;

        /* renamed from: e  reason: collision with root package name */
        private final long f8803e;

        public a(String str, AppLovinAdType appLovinAdType, boolean z10, long j10, long j11) {
            this.f8799a = str;
            this.f8800b = appLovinAdType;
            this.f8801c = z10;
            this.f8802d = j10;
            this.f8803e = j11;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f8803e;
        }

        public long c() {
            return this.f8802d;
        }

        public String d() {
            return this.f8799a + "_" + this.f8800b;
        }

        public String e() {
            return this.f8799a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (aVar.a(this)) {
                    String e8 = e();
                    String e10 = aVar.e();
                    if (e8 != null ? e8.equals(e10) : e10 == null) {
                        AppLovinAdType f10 = f();
                        AppLovinAdType f11 = aVar.f();
                        return f10 != null ? f10.equals(f11) : f11 == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public AppLovinAdType f() {
            return this.f8800b;
        }

        public boolean g() {
            return this.f8801c;
        }

        public int hashCode() {
            String e8 = e();
            int hashCode = e8 == null ? 43 : e8.hashCode();
            AppLovinAdType f10 = f();
            return ((hashCode + 59) * 59) + (f10 != null ? f10.hashCode() : 43);
        }

        public String toString() {
            return "AdPersistenceFileService.PersistedAdFilePath(id=" + e() + ", type=" + f() + ", isAdServerAd=" + g() + ", expiryTimeMillis=" + c() + ", appLaunchTimestamp=" + b() + ")";
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar) {
            return a(bVar, 0L, 0L);
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar, long j10, long j11) {
            if (bVar == null) {
                return null;
            }
            return new a(StringUtils.isValidString(bVar.I()) ? bVar.I() : UUID.randomUUID().toString(), bVar.getType(), bVar instanceof com.applovin.impl.sdk.ad.a, SystemClock.elapsedRealtime() + j10, j11);
        }

        public static a a(JSONObject jSONObject, j jVar) {
            String string = JsonUtils.getString(jSONObject, ug.f21009x, "");
            String string2 = JsonUtils.getString(jSONObject, "type", "");
            Boolean bool = JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j10 = JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            long j11 = JsonUtils.getLong(jSONObject, "app_launch_timestamp", 0L);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new a(string, AppLovinAdType.fromString(string2), bool.booleanValue(), j10, j11);
        }

        @Override // com.applovin.impl.g4
        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, ug.f21009x, this.f8799a);
            JsonUtils.putString(jSONObject, "type", this.f8800b.toString());
            JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.f8801c);
            JsonUtils.putLong(jSONObject, "expiry_time_millis", this.f8802d);
            JsonUtils.putLong(jSONObject, "app_launch_timestamp", this.f8803e);
            return jSONObject;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(a aVar);
    }

    /* renamed from: com.applovin.impl.sdk.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0136c {
        void a(com.applovin.impl.sdk.ad.b bVar, String str);
    }

    public c(j jVar) {
        this.f8798a = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        a a10 = a.a(bVar, ((Long) this.f8798a.a(o4.Z0)).longValue(), j.l());
        File a11 = a(a10);
        if (a11 == null) {
            a("Could not persist incompatible ad", bVar, bVar2);
            return;
        }
        try {
            JSONObject a12 = bVar.a();
            if (a12 == null) {
                a("Could not serialize ad for persistence", bVar, bVar2);
                return;
            }
            if (this.f8798a.A().b((InputStream) new ByteArrayInputStream(a12.toString().getBytes("UTF-8")), a11, true)) {
                a(a10, bVar, bVar2);
            } else {
                a("Failed to write persisted ad to disk", bVar, bVar2);
            }
        } catch (Throwable th) {
            a("Ad could not be persisted", bVar, bVar2);
            this.f8798a.D().a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    public void b(final com.applovin.impl.sdk.ad.b bVar, final b bVar2) {
        if (!b()) {
            a("Ad Persistence directory could not be created", bVar, bVar2);
        } else {
            this.f8798a.i0().a((z4) new k6(this.f8798a, "persistAd", new Runnable() { // from class: com.applovin.impl.sdk.b0
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(bVar, bVar2);
                }
            }), u5.b.CACHING);
        }
    }

    private boolean b() {
        File file = f8797b;
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    public void b(a aVar) {
        File a10 = a(aVar);
        if (a10 != null) {
            a10.delete();
        }
    }

    public void a(final a aVar, final InterfaceC0136c interfaceC0136c) {
        final File a10 = a(aVar);
        if (a10 != null && a10.exists()) {
            this.f8798a.i0().a((z4) new k6(this.f8798a, "retrievePersistedAd", new Runnable() { // from class: com.applovin.impl.sdk.c0
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(a10, interfaceC0136c, aVar);
                }
            }), u5.b.OTHER);
        } else {
            interfaceC0136c.a(null, "Persisted ad could not be retrieved: Retrieval failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, InterfaceC0136c interfaceC0136c, a aVar) {
        com.applovin.impl.sdk.ad.b a10;
        String e8 = this.f8798a.A().e(file);
        if (e8 == null) {
            interfaceC0136c.a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(e8, new JSONObject());
            JsonUtils.putBoolean(JsonUtils.getJSONObject(jsonObjectFromJsonString, "full_response", new JSONObject()), "is_persisted_ad", true);
            if (aVar.g()) {
                a10 = com.applovin.impl.sdk.ad.a.a(jsonObjectFromJsonString, this.f8798a);
            } else {
                a10 = e7.a(jsonObjectFromJsonString, this.f8798a);
            }
            if (a10 == null) {
                interfaceC0136c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                interfaceC0136c.a(a10, null);
            }
        } catch (Throwable th) {
            interfaceC0136c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.f8798a.D().a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    private File a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new File(f8797b.getAbsolutePath() + "/" + aVar.d());
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f8798a.I();
        if (n.a()) {
            this.f8798a.I().a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar2.a(aVar);
        this.f8798a.D().a(y1.C, bVar);
    }

    private void a(String str, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f8798a.I();
        if (n.a()) {
            this.f8798a.I().a("AdPersistenceFileService", str);
        }
        bVar2.a(null);
        Map b10 = a2.b(bVar);
        CollectionUtils.putStringIfValid("error_message", str, b10);
        this.f8798a.D().d(y1.D, b10);
    }

    public void a(List list) {
        File[] listFiles = f8797b.listFiles();
        if (listFiles == null) {
            return;
        }
        boolean z10 = false;
        for (File file : listFiles) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a) it.next()).d().equals(file.getName())) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z10) {
                file.delete();
            }
        }
    }

    public void a() {
        File[] listFiles;
        File file = f8797b;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }
}
