package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RequestConfiguration {
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;

    /* renamed from: a  reason: collision with root package name */
    private final int f11086a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11087b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11088c;

    /* renamed from: d  reason: collision with root package name */
    private final List f11089d;

    /* renamed from: e  reason: collision with root package name */
    private final PublisherPrivacyPersonalizationState f11090e;
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private int f11091a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f11092b = -1;

        /* renamed from: c  reason: collision with root package name */
        private String f11093c = null;

        /* renamed from: d  reason: collision with root package name */
        private final List f11094d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private PublisherPrivacyPersonalizationState f11095e = PublisherPrivacyPersonalizationState.DEFAULT;

        public RequestConfiguration build() {
            return new RequestConfiguration(this.f11091a, this.f11092b, this.f11093c, this.f11094d, this.f11095e, null);
        }

        public Builder setMaxAdContentRating(String str) {
            if (str != null && !"".equals(str)) {
                if (!RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                    zzo.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
                } else {
                    this.f11093c = str;
                }
            } else {
                this.f11093c = null;
            }
            return this;
        }

        public Builder setPublisherPrivacyPersonalizationState(PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.f11095e = publisherPrivacyPersonalizationState;
            return this;
        }

        public Builder setTagForChildDirectedTreatment(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f11091a = i10;
            } else {
                zzo.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i10);
            }
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f11092b = i10;
            } else {
                zzo.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i10);
            }
            return this;
        }

        public Builder setTestDeviceIds(List<String> list) {
            this.f11094d.clear();
            if (list != null) {
                this.f11094d.addAll(list);
            }
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface MaxAdContentRating {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f11097a;

        PublisherPrivacyPersonalizationState(int i10) {
            this.f11097a = i10;
        }

        public int getValue() {
            return this.f11097a;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface TagForUnderAgeOfConsent {
    }

    /* synthetic */ RequestConfiguration(int i10, int i11, String str, List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, zzi zziVar) {
        this.f11086a = i10;
        this.f11087b = i11;
        this.f11088c = str;
        this.f11089d = list;
        this.f11090e = publisherPrivacyPersonalizationState;
    }

    public String getMaxAdContentRating() {
        String str = this.f11088c;
        return str == null ? "" : str;
    }

    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.f11090e;
    }

    public int getTagForChildDirectedTreatment() {
        return this.f11086a;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.f11087b;
    }

    public List<String> getTestDeviceIds() {
        return new ArrayList(this.f11089d);
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setTagForChildDirectedTreatment(this.f11086a);
        builder.setTagForUnderAgeOfConsent(this.f11087b);
        builder.setMaxAdContentRating(this.f11088c);
        builder.setTestDeviceIds(this.f11089d);
        return builder;
    }
}
