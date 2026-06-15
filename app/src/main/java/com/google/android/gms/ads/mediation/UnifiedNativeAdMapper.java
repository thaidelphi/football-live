package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class UnifiedNativeAdMapper {

    /* renamed from: a  reason: collision with root package name */
    private String f11620a;

    /* renamed from: b  reason: collision with root package name */
    private List f11621b;

    /* renamed from: c  reason: collision with root package name */
    private String f11622c;

    /* renamed from: d  reason: collision with root package name */
    private NativeAd.Image f11623d;

    /* renamed from: e  reason: collision with root package name */
    private String f11624e;

    /* renamed from: f  reason: collision with root package name */
    private String f11625f;

    /* renamed from: g  reason: collision with root package name */
    private Double f11626g;

    /* renamed from: h  reason: collision with root package name */
    private String f11627h;

    /* renamed from: i  reason: collision with root package name */
    private String f11628i;

    /* renamed from: j  reason: collision with root package name */
    private VideoController f11629j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11630k;

    /* renamed from: l  reason: collision with root package name */
    private View f11631l;

    /* renamed from: m  reason: collision with root package name */
    private View f11632m;

    /* renamed from: n  reason: collision with root package name */
    private Object f11633n;

    /* renamed from: o  reason: collision with root package name */
    private Bundle f11634o = new Bundle();

    /* renamed from: p  reason: collision with root package name */
    private boolean f11635p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11636q;

    /* renamed from: r  reason: collision with root package name */
    private float f11637r;

    public View getAdChoicesContent() {
        return this.f11631l;
    }

    public final String getAdvertiser() {
        return this.f11625f;
    }

    public final String getBody() {
        return this.f11622c;
    }

    public final String getCallToAction() {
        return this.f11624e;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final Bundle getExtras() {
        return this.f11634o;
    }

    public final String getHeadline() {
        return this.f11620a;
    }

    public final NativeAd.Image getIcon() {
        return this.f11623d;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f11621b;
    }

    public float getMediaContentAspectRatio() {
        return this.f11637r;
    }

    public final boolean getOverrideClickHandling() {
        return this.f11636q;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f11635p;
    }

    public final String getPrice() {
        return this.f11628i;
    }

    public final Double getStarRating() {
        return this.f11626g;
    }

    public final String getStore() {
        return this.f11627h;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.f11630k;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.f11631l = view;
    }

    public final void setAdvertiser(String str) {
        this.f11625f = str;
    }

    public final void setBody(String str) {
        this.f11622c = str;
    }

    public final void setCallToAction(String str) {
        this.f11624e = str;
    }

    public final void setExtras(Bundle bundle) {
        this.f11634o = bundle;
    }

    public void setHasVideoContent(boolean z10) {
        this.f11630k = z10;
    }

    public final void setHeadline(String str) {
        this.f11620a = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.f11623d = image;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.f11621b = list;
    }

    public void setMediaContentAspectRatio(float f10) {
        this.f11637r = f10;
    }

    public void setMediaView(View view) {
        this.f11632m = view;
    }

    public final void setOverrideClickHandling(boolean z10) {
        this.f11636q = z10;
    }

    public final void setOverrideImpressionRecording(boolean z10) {
        this.f11635p = z10;
    }

    public final void setPrice(String str) {
        this.f11628i = str;
    }

    public final void setStarRating(Double d10) {
        this.f11626g = d10;
    }

    public final void setStore(String str) {
        this.f11627h = str;
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final View zza() {
        return this.f11632m;
    }

    public final VideoController zzb() {
        return this.f11629j;
    }

    public final Object zzc() {
        return this.f11633n;
    }

    public final void zzd(Object obj) {
        this.f11633n = obj;
    }

    public final void zze(VideoController videoController) {
        this.f11629j = videoController;
    }
}
