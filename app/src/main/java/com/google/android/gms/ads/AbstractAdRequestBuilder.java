package com.google.android.gms.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {

    /* renamed from: a  reason: collision with root package name */
    protected final zzeg f11056a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractAdRequestBuilder() {
        zzeg zzegVar = new zzeg();
        this.f11056a = zzegVar;
        zzegVar.zzs(AdRequest.DEVICE_ID_EMULATOR);
    }

    @Deprecated
    public T addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
        this.f11056a.zzo(cls, bundle);
        return self();
    }

    public T addCustomTargeting(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            zzo.zzj("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
        }
        this.f11056a.zzp(str, str2);
        return self();
    }

    public T addKeyword(String str) {
        this.f11056a.zzq(str);
        return self();
    }

    public T addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.f11056a.zzr(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.f11056a.zzt(AdRequest.DEVICE_ID_EMULATOR);
        }
        return self();
    }

    protected abstract T self();

    public T setAdString(String str) {
        this.f11056a.zzu(str);
        return self();
    }

    public T setContentUrl(String str) {
        Preconditions.n(str, "Content URL must be non-null.");
        Preconditions.h(str, "Content URL must be non-empty.");
        int length = str.length();
        Preconditions.c(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf((int) AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(str.length()));
        this.f11056a.zzv(str);
        return self();
    }

    public T setHttpTimeoutMillis(int i10) {
        this.f11056a.zzw(i10);
        return self();
    }

    public T setNeighboringContentUrls(List<String> list) {
        if (list == null) {
            zzo.zzj("neighboring content URLs list should not be null");
            return self();
        }
        this.f11056a.zzy(list);
        return self();
    }

    public T setRequestAgent(String str) {
        this.f11056a.zzB(str);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zza(String str) {
        this.f11056a.zzs(str);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zzb(boolean z10) {
        this.f11056a.zzx(z10);
        return self();
    }

    public final AbstractAdRequestBuilder zzc(Bundle bundle) {
        this.f11056a.zzz(bundle);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zzd(boolean z10) {
        this.f11056a.zzC(z10);
        return self();
    }

    public T addCustomTargeting(String str, List<String> list) {
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
                    zzo.zzj("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                }
            }
            this.f11056a.zzp(str, TextUtils.join(",", list));
        }
        return self();
    }
}
