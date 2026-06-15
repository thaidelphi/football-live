package com.unity3d.services.ads.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.List;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: TopicsReceiver.kt */
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TopicsReceiver implements OutcomeReceiver<GetTopicsResponse, Exception> {
    private final IEventSender eventSender;

    public TopicsReceiver(IEventSender eventSender) {
        n.f(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final JSONObject formatTopic(Topic topic) {
        n.f(topic, "topic");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taxonomyVersion", topic.getTaxonomyVersion());
        jSONObject.put("modelVersion", topic.getModelVersion());
        jSONObject.put("topicId", topic.getTopicId());
        return jSONObject;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(Exception error) {
        n.f(error, "error");
        DeviceLog.debug("GetTopics exception: " + error);
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, error.toString());
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(GetTopicsResponse result) {
        n.f(result, "result");
        JSONArray jSONArray = new JSONArray();
        List<Topic> topics = result.getTopics();
        n.e(topics, "result.topics");
        for (Topic it : topics) {
            n.e(it, "it");
            jSONArray.put(formatTopic(it));
        }
        IEventSender iEventSender = this.eventSender;
        WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOPICS;
        TopicsEvents topicsEvents = TopicsEvents.TOPICS_AVAILABLE;
        String jSONArray2 = jSONArray.toString();
        n.e(jSONArray2, "resultArray.toString()");
        iEventSender.sendEvent(webViewEventCategory, topicsEvents, jSONArray2);
    }
}
