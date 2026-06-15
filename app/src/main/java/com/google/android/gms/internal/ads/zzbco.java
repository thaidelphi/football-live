package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.browser.customtabs.b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbco extends b {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjO)).split(","));
    private final zzbcr zzc;
    private final b zzd;
    private final zzdqk zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbco(zzbcr zzbcrVar, b bVar, zzdqk zzdqkVar) {
        this.zzd = bVar;
        this.zzc = zzbcrVar;
        this.zze = zzdqkVar;
    }

    private final void zzb(String str) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zze, null, "pact_action", new Pair("pe", str));
    }

    @Override // androidx.browser.customtabs.b
    public final void extraCallback(String str, Bundle bundle) {
        b bVar = this.zzd;
        if (bVar != null) {
            bVar.extraCallback(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        b bVar = this.zzd;
        if (bVar != null) {
            return bVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.b
    public final void onActivityResized(int i10, int i11, Bundle bundle) {
        b bVar = this.zzd;
        if (bVar != null) {
            bVar.onActivityResized(i10, i11, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        b bVar = this.zzd;
        if (bVar != null) {
            bVar.onMessageChannelReady(bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onNavigationEvent(int i10, Bundle bundle) {
        List list;
        this.zza.set(false);
        b bVar = this.zzd;
        if (bVar != null) {
            bVar.onNavigationEvent(i10, bundle);
        }
        this.zzc.zzi(com.google.android.gms.ads.internal.zzv.zzC().a());
        if (this.zzc == null || (list = this.zzb) == null || !list.contains(String.valueOf(i10))) {
            return;
        }
        this.zzc.zzf();
        zzb("pact_reqpmc");
    }

    @Override // androidx.browser.customtabs.b
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzh(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e8);
        }
        b bVar = this.zzd;
        if (bVar != null) {
            bVar.onPostMessage(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
        b bVar = this.zzd;
        if (bVar != null) {
            bVar.onRelationshipValidationResult(i10, uri, z10, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
