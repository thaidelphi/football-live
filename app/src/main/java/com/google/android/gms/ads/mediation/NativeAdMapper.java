package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class NativeAdMapper {

    /* renamed from: a  reason: collision with root package name */
    private String f11604a;

    /* renamed from: b  reason: collision with root package name */
    private List f11605b;

    /* renamed from: c  reason: collision with root package name */
    private String f11606c;

    /* renamed from: d  reason: collision with root package name */
    private NativeAd.Image f11607d;

    /* renamed from: e  reason: collision with root package name */
    private String f11608e;

    /* renamed from: f  reason: collision with root package name */
    private String f11609f;

    /* renamed from: g  reason: collision with root package name */
    private Double f11610g;

    /* renamed from: h  reason: collision with root package name */
    private String f11611h;

    /* renamed from: i  reason: collision with root package name */
    private String f11612i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11613j;

    /* renamed from: k  reason: collision with root package name */
    private View f11614k;

    /* renamed from: l  reason: collision with root package name */
    private View f11615l;

    /* renamed from: m  reason: collision with root package name */
    private Bundle f11616m = new Bundle();

    /* renamed from: n  reason: collision with root package name */
    private boolean f11617n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11618o;

    /* renamed from: p  reason: collision with root package name */
    private float f11619p;

    public View getAdChoicesContent() {
        return this.f11614k;
    }

    public final String getAdvertiser() {
        return this.f11609f;
    }

    public final String getBody() {
        return this.f11606c;
    }

    public final String getCallToAction() {
        return this.f11608e;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final Bundle getExtras() {
        return this.f11616m;
    }

    public final String getHeadline() {
        return this.f11604a;
    }

    public final NativeAd.Image getIcon() {
        return this.f11607d;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f11605b;
    }

    public float getMediaContentAspectRatio() {
        return this.f11619p;
    }

    public final boolean getOverrideClickHandling() {
        return this.f11618o;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f11617n;
    }

    public final String getPrice() {
        return this.f11612i;
    }

    public final Double getStarRating() {
        return this.f11610g;
    }

    public final String getStore() {
        return this.f11611h;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.f11613j;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.f11614k = view;
    }

    public final void setAdvertiser(String str) {
        this.f11609f = str;
    }

    public final void setBody(String str) {
        this.f11606c = str;
    }

    public final void setCallToAction(String str) {
        this.f11608e = str;
    }

    public final void setExtras(Bundle bundle) {
        this.f11616m = bundle;
    }

    public void setHasVideoContent(boolean z10) {
        this.f11613j = z10;
    }

    public final void setHeadline(String str) {
        this.f11604a = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.f11607d = image;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.f11605b = list;
    }

    public void setMediaContentAspectRatio(float f10) {
        this.f11619p = f10;
    }

    public void setMediaView(View view) {
        this.f11615l = view;
    }

    public final void setOverrideClickHandling(boolean z10) {
        this.f11618o = z10;
    }

    public final void setOverrideImpressionRecording(boolean z10) {
        this.f11617n = z10;
    }

    public final void setPrice(String str) {
        this.f11612i = str;
    }

    public final void setStarRating(Double d10) {
        this.f11610g = d10;
    }

    public final void setStore(String str) {
        this.f11611h = str;
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final View zza() {
        return this.f11615l;
    }
}
