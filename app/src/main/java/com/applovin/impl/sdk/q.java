package com.applovin.impl.sdk;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import android.view.InputEvent;
import com.applovin.impl.h4;
import com.applovin.impl.k6;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u5;
import com.ironsource.fe;
import com.ironsource.ug;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final j f9135a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f9136b;

    /* renamed from: e  reason: collision with root package name */
    private final MeasurementManager f9139e;

    /* renamed from: h  reason: collision with root package name */
    private final TopicsManager f9142h;

    /* renamed from: c  reason: collision with root package name */
    private final Set f9137c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private final Object f9138d = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference f9140f = new AtomicReference(new JSONArray());

    /* renamed from: g  reason: collision with root package name */
    private final d f9141g = new d(this, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements OutcomeReceiver {
        a() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(Exception exc) {
            q.this.f9135a.I();
            if (n.a()) {
                q.this.f9135a.I().a("PrivacySandboxService", "Failed to register impression", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            q.this.f9135a.I();
            if (n.a()) {
                q.this.f9135a.I().a("PrivacySandboxService", "Successfully registered impression");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements OutcomeReceiver {
        b() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(Exception exc) {
            q.this.f9135a.I();
            if (n.a()) {
                q.this.f9135a.I().a("PrivacySandboxService", "Failed to register click", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            q.this.f9135a.I();
            if (n.a()) {
                q.this.f9135a.I().a("PrivacySandboxService", "Successfully registered click");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements OutcomeReceiver {
        c() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(Exception exc) {
            q.this.f9135a.I();
            if (n.a()) {
                q.this.f9135a.I().a("PrivacySandboxService", "Failed to register conversion", exc);
            }
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            q.this.f9135a.I();
            if (n.a()) {
                q.this.f9135a.I().a("PrivacySandboxService", "Successfully registered conversion");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements OutcomeReceiver {
        private d() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onResult(GetTopicsResponse getTopicsResponse) {
            List<Topic> topics = getTopicsResponse.getTopics();
            int size = topics.size();
            q.this.f9135a.I();
            if (n.a()) {
                n I = q.this.f9135a.I();
                I.d("PrivacySandboxService", size + " topic(s) received");
            }
            JSONArray jSONArray = new JSONArray();
            for (Topic topic : topics) {
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, ug.f21009x, topic.getTopicId());
                JsonUtils.putLong(jSONObject, fe.B, topic.getModelVersion());
                JsonUtils.putLong(jSONObject, "taxonomy", topic.getTaxonomyVersion());
                jSONArray.put(jSONObject);
            }
            q.this.f9140f.set(jSONArray);
            q.this.b(((Boolean) q.this.f9135a.a(o4.f8249w6)).booleanValue(), ((Long) q.this.f9135a.a(o4.f8233u6)).longValue());
        }

        /* synthetic */ d(q qVar, a aVar) {
            this();
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(Exception exc) {
            String str;
            Long l10 = (Long) q.this.f9135a.a(o4.f8241v6);
            boolean z10 = l10.longValue() == -1;
            q.this.f9135a.I();
            if (n.a()) {
                n I = q.this.f9135a.I();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to retrieve topics");
                if (z10) {
                    str = "";
                } else {
                    str = ", retrying in " + l10 + " ms";
                }
                sb.append(str);
                I.a("PrivacySandboxService", sb.toString(), exc);
            }
            if (z10) {
                return;
            }
            q.this.b(((Boolean) q.this.f9135a.a(o4.f8257x6)).booleanValue(), l10.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(j jVar) {
        this.f9135a = jVar;
        this.f9136b = jVar.i0().a();
        Context m7 = j.m();
        this.f9139e = (MeasurementManager) m7.getSystemService(MeasurementManager.class);
        this.f9142h = (TopicsManager) m7.getSystemService(TopicsManager.class);
        if (((Boolean) jVar.a(o4.f8225t6)).booleanValue()) {
            b(((Boolean) jVar.a(o4.f8249w6)).booleanValue(), 0L);
        }
    }

    private boolean c(String str) {
        synchronized (this.f9138d) {
            if (this.f9137c.contains(str)) {
                return false;
            }
            this.f9137c.add(str);
            return true;
        }
    }

    public void b(final List list) {
        a("register impression", new Runnable() { // from class: com.applovin.impl.sdk.h1
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (list == null || list.isEmpty() || this.f9139e == null || !h4.e(j.f8885v0)) {
            return;
        }
        this.f9135a.I();
        if (n.a()) {
            this.f9135a.I().a("PrivacySandboxService", "Registering impression...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f9139e.registerSource(Uri.parse((String) it.next()), (InputEvent) null, this.f9136b, new a());
        }
    }

    public void b(final List list, final InputEvent inputEvent) {
        a("register click", new Runnable() { // from class: com.applovin.impl.sdk.i1
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a(list, inputEvent);
            }
        });
    }

    public void b(final String str) {
        a("register conversion trigger event", new Runnable() { // from class: com.applovin.impl.sdk.g1
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z10, final long j10) {
        a("retrieve topics", new Runnable() { // from class: com.applovin.impl.sdk.j1
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a(z10, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, InputEvent inputEvent) {
        if (list == null || list.isEmpty() || this.f9139e == null || !h4.e(j.f8885v0)) {
            return;
        }
        this.f9135a.I();
        if (n.a()) {
            this.f9135a.I().a("PrivacySandboxService", "Registering click...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f9139e.registerSource(Uri.parse((String) it.next()), inputEvent, this.f9136b, new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str) || this.f9139e == null || !h4.e(j.f8885v0)) {
            return;
        }
        this.f9135a.I();
        if (n.a()) {
            n I = this.f9135a.I();
            I.a("PrivacySandboxService", "Registering conversion: " + str);
        }
        this.f9139e.registerTrigger(Uri.parse(str), this.f9136b, new c());
    }

    public JSONArray a() {
        return (JSONArray) this.f9140f.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, long j10) {
        if (this.f9142h == null) {
            return;
        }
        final GetTopicsRequest build = new GetTopicsRequest.Builder().setShouldRecordObservation(z10).setAdsSdkName("AppLovin").build();
        if (j10 > 0) {
            this.f9135a.i0().a(new k6(this.f9135a, true, "getTopics", new Runnable() { // from class: com.applovin.impl.sdk.f1
                @Override // java.lang.Runnable
                public final void run() {
                    q.this.a(build);
                }
            }), u5.b.OTHER, j10);
            return;
        }
        this.f9142h.getTopics(build, this.f9136b, this.f9141g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(GetTopicsRequest getTopicsRequest) {
        this.f9142h.getTopics(getTopicsRequest, this.f9136b, this.f9141g);
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f9135a.I();
            if (n.a()) {
                n I = this.f9135a.I();
                I.a("PrivacySandboxService", "Running operation: " + str);
            }
            runnable.run();
        } catch (Throwable th) {
            this.f9135a.I();
            if (n.a()) {
                n I2 = this.f9135a.I();
                I2.a("PrivacySandboxService", "Failed to run operation: " + str, th);
            }
            if (c(str)) {
                this.f9135a.D().a("PrivacySandboxService", str, th);
            }
        }
    }
}
