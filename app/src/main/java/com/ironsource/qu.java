package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class qu {

    /* renamed from: a  reason: collision with root package name */
    public static final qu f19902a = new qu();

    /* renamed from: b  reason: collision with root package name */
    private static final String f19903b = ",";

    /* renamed from: c  reason: collision with root package name */
    private static final String f19904c = "[";

    /* renamed from: d  reason: collision with root package name */
    private static final String f19905d = "]";

    private qu() {
    }

    private final String a(Object obj) {
        if (obj instanceof String) {
            StringBuilder sb = new StringBuilder();
            sb.append('\'');
            sb.append(obj);
            sb.append('\'');
            return sb.toString();
        }
        return String.valueOf(obj);
    }

    private final String a(List<?> list) {
        String Y;
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = str + f19902a.a(it.next()) + ',';
        }
        Y = b9.p.Y(str, f19903b);
        return Y + ']';
    }

    public final AdInfo a(LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.n.f(levelPlayAdInfo, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auctionId", levelPlayAdInfo.getAuctionId());
        jSONObject.put("adUnit", levelPlayAdInfo.getAdFormat());
        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, levelPlayAdInfo.getCountry());
        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ABTEST, levelPlayAdInfo.getAb());
        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_SEGMENT_NAME, levelPlayAdInfo.getSegmentName());
        jSONObject.put("placement", levelPlayAdInfo.getPlacementName());
        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK, levelPlayAdInfo.getAdNetwork());
        jSONObject.put("instanceName", levelPlayAdInfo.getInstanceName());
        jSONObject.put("instanceId", levelPlayAdInfo.getInstanceId());
        jSONObject.put("precision", levelPlayAdInfo.getPrecision());
        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_ENCRYPTED_CPM, levelPlayAdInfo.getEncryptedCPM());
        jSONObject.put("revenue", levelPlayAdInfo.getRevenue());
        return new AdInfo(new ImpressionData(jSONObject), null);
    }

    public final IronSourceError a(LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.n.f(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    public final List<Object> a(Object... items) {
        List<Object> f10;
        kotlin.jvm.internal.n.f(items, "items");
        f10 = j8.q.f(Arrays.copyOf(items, items.length));
        return f10;
    }

    public final String b(List<? extends Object> methodArgs) {
        String Y;
        kotlin.jvm.internal.n.f(methodArgs, "methodArgs");
        String str = new String();
        for (Object obj : methodArgs) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(obj instanceof List ? f19902a.a((List) obj) : f19902a.a(obj));
            str = sb.toString() + ',';
        }
        Y = b9.p.Y(str, f19903b);
        return Y;
    }
}
