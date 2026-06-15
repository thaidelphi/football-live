package com.appnext.actionssdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.ironsource.b9;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdData extends com.appnext.core.g implements Serializable {
    public static final String SPONSORED = "sponsored";
    private String acid;
    private String action;
    private String action_name;
    private String app_package;
    private String bicon;
    private String deep_link;
    private String goal_type;
    private String headline_engagement;
    private String headline_new;
    private String icon;
    private String impression_link;
    private String name;
    private String tracking_link;
    private String view_through_link;
    private String banner_id = "";
    private String type = "organic";
    private String app_dmessage = "";
    private String url_img_wide = "";
    private String categories = "";
    private String store_downloads = "";
    private String store_rating = "";
    private String button_text = "";
    private String revenue_type = "";
    private String revenue_rate = "0";
    private String webview = "0";
    private String cpt_list = "";
    private String gdpr = "";
    private String country = "";

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(String str) {
        this.view_through_link = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String B() {
        return this.tracking_link;
    }

    public final String C() {
        return this.app_package;
    }

    protected final String D() {
        return this.deep_link;
    }

    public final String E() {
        return this.icon;
    }

    protected final String F() {
        return this.bicon;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String G() {
        return this.headline_new;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String H() {
        return this.headline_engagement;
    }

    public final String I() {
        return this.acid;
    }

    public final String J() {
        return this.banner_id;
    }

    public final String K() {
        return this.impression_link;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String L() {
        return this.view_through_link;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String M() {
        return this.goal_type;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String N() {
        return this.app_dmessage;
    }

    protected final String O() {
        return this.url_img_wide;
    }

    public final String a(Context context) {
        Drawable applicationIcon;
        Bitmap createBitmap;
        Bitmap bitmap;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_package", this.app_package);
            jSONObject.put("headline_engagement", this.headline_engagement);
            jSONObject.put("banner_id", this.banner_id);
            jSONObject.put("headline_new", this.headline_new);
            jSONObject.put("tracking_link", this.tracking_link);
            jSONObject.put("name", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(this.app_package, 0)));
            jSONObject.put("type", this.type);
            jSONObject.put("deep_link", this.deep_link);
            jSONObject.put("action_name", this.action_name);
            jSONObject.put("action", this.action);
            jSONObject.put("acid", this.acid);
            jSONObject.put("impression_link", this.impression_link);
            jSONObject.put("view_through_link", this.view_through_link);
            jSONObject.put("goal_type", this.goal_type);
            jSONObject.put("app_dmessage", this.app_dmessage);
            jSONObject.put("isInstalled", com.appnext.core.f.i(context, this.app_package));
            jSONObject.put("url_img_wide", this.url_img_wide);
            jSONObject.put("categories", this.categories);
            jSONObject.put("store_downloads", this.store_downloads);
            jSONObject.put("store_rating", this.store_rating);
            jSONObject.put("button_text", this.button_text);
            jSONObject.put("revenueType", this.revenue_type);
            jSONObject.put(b9.h.K, this.webview);
            jSONObject.put("gdpr", this.gdpr);
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.country);
            jSONObject.put("icon_url", "https://cdn.appnext.com/tools/sdk/actions/assets/apps/" + this.app_package + ".png");
            applicationIcon = context.getPackageManager().getApplicationIcon(this.app_package);
        } catch (JSONException unused) {
        }
        if (applicationIcon instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) applicationIcon;
            if (bitmapDrawable.getBitmap() != null) {
                bitmap = bitmapDrawable.getBitmap();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, byteArrayOutputStream);
                jSONObject.put(b9.h.H0, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                return jSONObject.toString();
            }
        }
        if (applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
            createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            applicationIcon.draw(canvas);
            bitmap = createBitmap;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, byteArrayOutputStream2);
            jSONObject.put(b9.h.H0, Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0));
            return jSONObject.toString();
        }
        createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        applicationIcon.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
        applicationIcon.draw(canvas2);
        bitmap = createBitmap;
        ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.WEBP, 100, byteArrayOutputStream22);
        jSONObject.put(b9.h.H0, Base64.encodeToString(byteArrayOutputStream22.toByteArray(), 0));
        return jSONObject.toString();
    }

    protected final void g(String str) {
        this.action_name = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getAction() {
        return this.action;
    }

    public final String getActionName() {
        return this.action_name;
    }

    protected int getAdID() {
        return super.getAdID();
    }

    protected String getAdJSON() {
        return super.getAdJSON();
    }

    protected final String getButtonText() {
        return this.button_text;
    }

    protected final String getCategories() {
        return this.categories;
    }

    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getCptList() {
        return this.cpt_list;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getPlacementID() {
        return super.getPlacementID();
    }

    public final String getRevenueRate() {
        return this.revenue_rate;
    }

    public final String getRevenueType() {
        return this.revenue_type;
    }

    protected final String getStoreDownloads() {
        return this.store_downloads;
    }

    protected final String getStoreRating() {
        return this.store_rating;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getWebview() {
        return this.webview;
    }

    public final boolean isGdpr() {
        return this.gdpr.equals("1");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(String str) {
        this.tracking_link = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(String str) {
        this.app_package = str;
    }

    protected final void q(String str) {
        this.deep_link = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(String str) {
        this.icon = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(String str) {
        this.action = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAdID(int i10) {
        super.setAdID(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAdJSON(String str) {
        super.setAdJSON(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setButtonText(String str) {
        this.button_text = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setCategories(String str) {
        this.categories = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setCptList(String str) {
        this.cpt_list = str;
    }

    public final void setGdpr(String str) {
        this.gdpr = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPlacementID(String str) {
        super.setPlacementID(str);
    }

    public final void setRevenueRate(String str) {
        this.revenue_rate = str;
    }

    public final void setRevenueType(String str) {
        this.revenue_type = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setStoreDownloads(String str) {
        this.store_downloads = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setStoreRating(String str) {
        this.store_rating = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setWebview(String str) {
        this.webview = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(String str) {
        this.type = str;
    }

    protected final void u(String str) {
        this.bicon = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(String str) {
        this.headline_new = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(String str) {
        this.headline_engagement = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(String str) {
        this.acid = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(String str) {
        this.banner_id = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(String str) {
        this.impression_link = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B(String str) {
        this.goal_type = str;
    }

    protected final void C(String str) {
        this.app_dmessage = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(String str) {
        this.url_img_wide = str;
    }

    public final void E(String str) {
        this.country = str;
    }

    private static Bitmap a(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        } else {
            createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }
}
