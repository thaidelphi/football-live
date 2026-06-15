package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int MAX_CONTENT_URL_LENGTH = 512;

    /* renamed from: a  reason: collision with root package name */
    protected final zzeh f11069a;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Builder extends AbstractAdRequestBuilder<Builder> {
        public AdRequest build() {
            return new AdRequest(this);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public Builder self() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AdRequest(AbstractAdRequestBuilder abstractAdRequestBuilder) {
        this.f11069a = new zzeh(abstractAdRequestBuilder.f11056a, null);
    }

    public String getAdString() {
        return this.f11069a.zzh();
    }

    public String getContentUrl() {
        return this.f11069a.zzi();
    }

    @Deprecated
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f11069a.zzd(cls);
    }

    public Bundle getCustomTargeting() {
        return this.f11069a.zze();
    }

    public Set<String> getKeywords() {
        return this.f11069a.zzn();
    }

    public List<String> getNeighboringContentUrls() {
        return this.f11069a.zzl();
    }

    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f11069a.zzf(cls);
    }

    public String getRequestAgent() {
        return this.f11069a.zzk();
    }

    public boolean isTestDevice(Context context) {
        return this.f11069a.zzq(context);
    }

    public final zzeh zza() {
        return this.f11069a;
    }
}
