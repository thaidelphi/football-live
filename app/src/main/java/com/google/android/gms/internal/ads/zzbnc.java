package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbnc {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzbmz zza = new zzbnb();
    public static final zzbmx zzb = new zzbmx() { // from class: com.google.android.gms.internal.ads.zzbna
        @Override // com.google.android.gms.internal.ads.zzbmx
        public final Object zza(JSONObject jSONObject) {
            return zzbnc.zza(jSONObject);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
