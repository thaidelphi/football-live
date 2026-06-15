package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.applovin.impl.z4;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final b f9082g;

    /* renamed from: h  reason: collision with root package name */
    private final n f9083h;

    /* renamed from: i  reason: collision with root package name */
    private AtomicBoolean f9084i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9085j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar, j jVar) {
        super("PersistentPostbackQueueSaveTask", jVar);
        this.f9084i = new AtomicBoolean();
        this.f9085j = false;
        this.f9082g = bVar;
        this.f9083h = jVar.I();
    }

    public List a(int i10) {
        ArrayList arrayList = new ArrayList();
        l A = this.f9827a.A();
        if (!A.b("persistent_postback_cache.json", j.m())) {
            n.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File a10 = A.a("persistent_postback_cache.json", j.m());
        String e8 = A.e(a10);
        if (TextUtils.isEmpty(e8)) {
            n.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z10 = false;
        try {
            JSONArray jSONArray = new JSONObject(e8).getJSONArray("pb");
            if (n.a()) {
                this.f9083h.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f9827a.a(o4.K2);
            for (int i11 = 0; i11 < jSONArray.length() && arrayList.size() < i10; i11++) {
                d dVar = new d(jSONArray.getJSONObject(i11), this.f9827a);
                if (dVar.c() < num.intValue()) {
                    arrayList.add(dVar);
                } else {
                    n.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                }
            }
            if (n.a()) {
                this.f9083h.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th) {
            try {
                n.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f9827a.D().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th);
                if (((Boolean) this.f9827a.a(o4.O0)).booleanValue()) {
                    A.a(a10, "removeAfterDeserializationFail");
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = true;
                if (z10 && ((Boolean) this.f9827a.a(o4.O0)).booleanValue()) {
                    A.a(a10, "removeAfterDeserializationFail");
                }
                throw th;
            }
        }
        this.f9085j = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f9082g.d());
    }

    private void a(List list) {
        if (!(this.f9085j && list.isEmpty()) && this.f9084i.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th) {
                    n.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th);
                    this.f9827a.D().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                l A = this.f9827a.A();
                if (A.b((InputStream) byteArrayInputStream, A.a("persistent_postback_cache.json", j.m()), true)) {
                    if (n.a()) {
                        this.f9083h.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (n.a()) {
                    this.f9083h.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                n.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f9827a.D().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.f9084i.set(false);
        }
    }
}
