package com.ironsource.mediationsdk.impressionData;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ImpressionData {
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AD_UNIT = "adUnit";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_LIFETIME_REVENUE = "lifetimeRevenue";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f18844a;

    /* renamed from: b  reason: collision with root package name */
    private String f18845b;

    /* renamed from: c  reason: collision with root package name */
    private String f18846c;

    /* renamed from: d  reason: collision with root package name */
    private String f18847d;

    /* renamed from: e  reason: collision with root package name */
    private String f18848e;

    /* renamed from: f  reason: collision with root package name */
    private String f18849f;

    /* renamed from: g  reason: collision with root package name */
    private String f18850g;

    /* renamed from: h  reason: collision with root package name */
    private String f18851h;

    /* renamed from: i  reason: collision with root package name */
    private String f18852i;

    /* renamed from: j  reason: collision with root package name */
    private String f18853j;

    /* renamed from: k  reason: collision with root package name */
    private String f18854k;

    /* renamed from: l  reason: collision with root package name */
    private String f18855l;

    /* renamed from: m  reason: collision with root package name */
    private String f18856m;

    /* renamed from: n  reason: collision with root package name */
    private Double f18857n;

    /* renamed from: o  reason: collision with root package name */
    private String f18858o;

    /* renamed from: p  reason: collision with root package name */
    private Double f18859p;

    /* renamed from: q  reason: collision with root package name */
    private String f18860q;

    /* renamed from: r  reason: collision with root package name */
    private String f18861r;

    /* renamed from: s  reason: collision with root package name */
    private DecimalFormat f18862s = new DecimalFormat("#.#####");

    public ImpressionData(ImpressionData impressionData) {
        this.f18845b = null;
        this.f18846c = null;
        this.f18847d = null;
        this.f18848e = null;
        this.f18849f = null;
        this.f18850g = null;
        this.f18851h = null;
        this.f18852i = null;
        this.f18853j = null;
        this.f18854k = null;
        this.f18855l = null;
        this.f18856m = null;
        this.f18857n = null;
        this.f18858o = null;
        this.f18859p = null;
        this.f18860q = null;
        this.f18861r = null;
        this.f18844a = impressionData.f18844a;
        this.f18845b = impressionData.f18845b;
        this.f18846c = impressionData.f18846c;
        this.f18847d = impressionData.f18847d;
        this.f18848e = impressionData.f18848e;
        this.f18849f = impressionData.f18849f;
        this.f18850g = impressionData.f18850g;
        this.f18851h = impressionData.f18851h;
        this.f18852i = impressionData.f18852i;
        this.f18853j = impressionData.f18853j;
        this.f18854k = impressionData.f18854k;
        this.f18855l = impressionData.f18855l;
        this.f18856m = impressionData.f18856m;
        this.f18858o = impressionData.f18858o;
        this.f18860q = impressionData.f18860q;
        this.f18859p = impressionData.f18859p;
        this.f18857n = impressionData.f18857n;
        this.f18861r = impressionData.f18861r;
    }

    public ImpressionData(JSONObject jSONObject) {
        Double d10 = null;
        this.f18845b = null;
        this.f18846c = null;
        this.f18847d = null;
        this.f18848e = null;
        this.f18849f = null;
        this.f18850g = null;
        this.f18851h = null;
        this.f18852i = null;
        this.f18853j = null;
        this.f18854k = null;
        this.f18855l = null;
        this.f18856m = null;
        this.f18857n = null;
        this.f18858o = null;
        this.f18859p = null;
        this.f18860q = null;
        this.f18861r = null;
        if (jSONObject != null) {
            try {
                this.f18844a = jSONObject;
                this.f18845b = jSONObject.optString("auctionId", null);
                this.f18846c = jSONObject.optString("adUnit", null);
                this.f18847d = jSONObject.optString(IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME, null);
                this.f18848e = jSONObject.optString("mediationAdUnitId", null);
                this.f18849f = jSONObject.optString(IMPRESSION_DATA_KEY_AD_FORMAT, null);
                this.f18850g = jSONObject.optString(IMPRESSION_DATA_KEY_COUNTRY, null);
                this.f18851h = jSONObject.optString(IMPRESSION_DATA_KEY_ABTEST, null);
                this.f18852i = jSONObject.optString(IMPRESSION_DATA_KEY_SEGMENT_NAME, null);
                this.f18853j = jSONObject.optString("placement", null);
                this.f18854k = jSONObject.optString(IMPRESSION_DATA_KEY_AD_NETWORK, null);
                this.f18855l = jSONObject.optString("instanceName", null);
                this.f18856m = jSONObject.optString("instanceId", null);
                this.f18858o = jSONObject.optString("precision", null);
                this.f18860q = jSONObject.optString(IMPRESSION_DATA_KEY_ENCRYPTED_CPM, null);
                this.f18861r = jSONObject.optString(IMPRESSION_DATA_KEY_CREATIVE_ID, null);
                double optDouble = jSONObject.optDouble(IMPRESSION_DATA_KEY_LIFETIME_REVENUE);
                this.f18859p = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject.optDouble("revenue");
                if (!Double.isNaN(optDouble2)) {
                    d10 = Double.valueOf(optDouble2);
                }
                this.f18857n = d10;
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("error parsing impression " + e8.getMessage());
            }
        }
    }

    public String getAb() {
        return this.f18851h;
    }

    public String getAdFormat() {
        return this.f18849f;
    }

    public String getAdNetwork() {
        return this.f18854k;
    }

    @Deprecated
    public String getAdUnit() {
        return this.f18846c;
    }

    public JSONObject getAllData() {
        return this.f18844a;
    }

    public String getAuctionId() {
        return this.f18845b;
    }

    public String getCountry() {
        return this.f18850g;
    }

    public String getCreativeId() {
        return this.f18861r;
    }

    public String getEncryptedCPM() {
        return this.f18860q;
    }

    public String getInstanceId() {
        return this.f18856m;
    }

    public String getInstanceName() {
        return this.f18855l;
    }

    @Deprecated
    public Double getLifetimeRevenue() {
        return this.f18859p;
    }

    public String getMediationAdUnitId() {
        return this.f18848e;
    }

    public String getMediationAdUnitName() {
        return this.f18847d;
    }

    public String getPlacement() {
        return this.f18853j;
    }

    public String getPrecision() {
        return this.f18858o;
    }

    public Double getRevenue() {
        return this.f18857n;
    }

    public String getSegmentName() {
        return this.f18852i;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.f18853j;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.f18853j = replace;
            JSONObject jSONObject = this.f18844a;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", replace);
                } catch (JSONException e8) {
                    o9.d().a(e8);
                    IronLog.INTERNAL.error(e8.toString());
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("auctionId: '");
        sb.append(this.f18845b);
        sb.append('\'');
        sb.append(", adUnit: '");
        sb.append(this.f18846c);
        sb.append('\'');
        sb.append(", mediationAdUnitName: '");
        sb.append(this.f18847d);
        sb.append('\'');
        sb.append(", mediationAdUnitId: '");
        sb.append(this.f18848e);
        sb.append('\'');
        sb.append(", adFormat: '");
        sb.append(this.f18849f);
        sb.append('\'');
        sb.append(", country: '");
        sb.append(this.f18850g);
        sb.append('\'');
        sb.append(", ab: '");
        sb.append(this.f18851h);
        sb.append('\'');
        sb.append(", segmentName: '");
        sb.append(this.f18852i);
        sb.append('\'');
        sb.append(", placement: '");
        sb.append(this.f18853j);
        sb.append('\'');
        sb.append(", adNetwork: '");
        sb.append(this.f18854k);
        sb.append('\'');
        sb.append(", instanceName: '");
        sb.append(this.f18855l);
        sb.append('\'');
        sb.append(", instanceId: '");
        sb.append(this.f18856m);
        sb.append('\'');
        sb.append(", revenue: ");
        Double d10 = this.f18857n;
        sb.append(d10 == null ? null : this.f18862s.format(d10));
        sb.append(", precision: '");
        sb.append(this.f18858o);
        sb.append('\'');
        sb.append(", lifetimeRevenue: ");
        Double d11 = this.f18859p;
        sb.append(d11 != null ? this.f18862s.format(d11) : null);
        sb.append(", encryptedCPM: '");
        sb.append(this.f18860q);
        sb.append('\'');
        sb.append(", creativeId: '");
        sb.append(this.f18861r);
        sb.append('\'');
        return sb.toString();
    }
}
