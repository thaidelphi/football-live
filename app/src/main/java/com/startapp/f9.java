package com.startapp;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.os.Build;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.TopicsClientMetadata;
import com.startapp.sdk.common.utils.Pair;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f9 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f21951a;

    /* renamed from: b  reason: collision with root package name */
    public final t4<Executor> f21952b;

    /* renamed from: c  reason: collision with root package name */
    public final j2<TopicsClientMetadata> f21953c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<String> f21954d = new AtomicReference<>();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements OutcomeReceiver<GetTopicsResponse, Exception> {
        public a() {
        }

        @Override // android.os.OutcomeReceiver
        public final void onError(Exception exc) {
            Exception exc2 = exc;
            TopicsClientMetadata call = f9.this.f21953c.call();
            ComponentInfoEventConfig b10 = call != null ? call.b() : null;
            if (b10 != null && b10.a((long) 8)) {
                l3.a(exc2);
            }
        }

        @Override // android.os.OutcomeReceiver
        public final void onResult(GetTopicsResponse getTopicsResponse) {
            GetTopicsResponse getTopicsResponse2 = getTopicsResponse;
            try {
                HashMap hashMap = new HashMap();
                for (Topic topic : getTopicsResponse2.getTopics()) {
                    long modelVersion = topic.getModelVersion();
                    long taxonomyVersion = topic.getTaxonomyVersion();
                    int topicId = topic.getTopicId();
                    Pair pair = new Pair(Long.valueOf(modelVersion), Long.valueOf(taxonomyVersion));
                    Set set = (Set) hashMap.get(pair);
                    if (set == null) {
                        set = new LinkedHashSet();
                        hashMap.put(pair, set);
                    }
                    set.add(Integer.valueOf(topicId));
                }
                f9.this.f21954d.set(f9.a(hashMap));
                if (f9.a(f9.this, 1)) {
                    new l3(m3.f22274d).b().a(f9.this.a()).a();
                }
            } catch (Throwable th) {
                if (f9.a(f9.this, 4)) {
                    l3.a(th);
                }
            }
        }
    }

    public f9(Context context, t4 t4Var, com.startapp.sdk.components.h0 h0Var) {
        this.f21951a = context;
        this.f21952b = t4Var;
        this.f21953c = h0Var;
    }

    public final void b() {
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 33 && SdkExtensions.getExtensionVersion(30) >= 4 && SdkExtensions.getExtensionVersion(1000000) >= 5) {
            try {
                TopicsClientMetadata call = this.f21953c.call();
                if (call != null && o9.a(call.a())) {
                    ((TopicsManager) this.f21951a.getSystemService(TopicsManager.class)).getTopics(new GetTopicsRequest.Builder().setAdsSdkName(this.f21951a.getPackageName()).setShouldRecordObservation(true).build(), this.f21952b.a(), new a());
                }
            } catch (Throwable th) {
                TopicsClientMetadata call2 = this.f21953c.call();
                ComponentInfoEventConfig b10 = call2 != null ? call2.b() : null;
                if (b10 != null && b10.a(2)) {
                    z10 = true;
                }
                if (z10) {
                    l3.a(th);
                }
            }
        }
    }

    public static boolean a(f9 f9Var, int i10) {
        TopicsClientMetadata call = f9Var.f21953c.call();
        ComponentInfoEventConfig b10 = call != null ? call.b() : null;
        return b10 != null && b10.a((long) i10);
    }

    public static String a(HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(str);
            sb.append('M');
            sb.append(((Pair) entry.getKey()).first);
            sb.append('T');
            sb.append(((Pair) entry.getKey()).second);
            String str2 = ":";
            for (Integer num : (Set) entry.getValue()) {
                sb.append(str2);
                sb.append(num);
                str2 = ",";
            }
            str = ";";
        }
        return sb.length() > 0 ? sb.toString() : "NONE";
    }

    public final String a() {
        return this.f21954d.get();
    }
}
