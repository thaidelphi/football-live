package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.fe;
import com.ironsource.in;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzu {
    private final Application zza;
    private final Handler zzb;
    private final Executor zzc;
    private final zzam zzd;
    private final zzbk zze;
    private final zzl zzf;
    private final zzx zzg;
    private final zze zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(Application application, zzab zzabVar, Handler handler, Executor executor, zzam zzamVar, zzbk zzbkVar, zzl zzlVar, zzx zzxVar, zze zzeVar) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzamVar;
        this.zze = zzbkVar;
        this.zzf = zzlVar;
        this.zzg = zzxVar;
        this.zzh = zzeVar;
    }

    private final zzch zzd(zzcf zzcfVar) throws zzg {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(in.f17849b);
            httpURLConnection.setRequestProperty("Content-Type", cc.L);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
            jsonWriter.beginObject();
            String str = zzcfVar.zza;
            if (str != null) {
                jsonWriter.name("admob_app_id");
                jsonWriter.value(str);
            }
            zzcb zzcbVar = zzcfVar.zzb;
            if (zzcbVar != null) {
                jsonWriter.name("device_info");
                jsonWriter.beginObject();
                int i10 = zzcbVar.zzc;
                if (i10 != 1) {
                    jsonWriter.name("os_type");
                    int i11 = i10 - 1;
                    if (i11 == 0) {
                        jsonWriter.value("UNKNOWN");
                    } else if (i11 == 1) {
                        jsonWriter.value("ANDROID");
                    }
                }
                String str2 = zzcbVar.zza;
                if (str2 != null) {
                    jsonWriter.name(fe.B);
                    jsonWriter.value(str2);
                }
                Integer num = zzcbVar.zzb;
                if (num != null) {
                    jsonWriter.name("android_api_level");
                    jsonWriter.value(num);
                }
                jsonWriter.endObject();
            }
            String str3 = zzcfVar.zzc;
            if (str3 != null) {
                jsonWriter.name("language_code");
                jsonWriter.value(str3);
            }
            Boolean bool = zzcfVar.zzd;
            if (bool != null) {
                jsonWriter.name("tag_for_under_age_of_consent");
                jsonWriter.value(bool.booleanValue());
            }
            Map map = zzcfVar.zze;
            if (!map.isEmpty()) {
                jsonWriter.name("stored_infos_map");
                jsonWriter.beginObject();
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    jsonWriter.value((String) entry.getValue());
                }
                jsonWriter.endObject();
            }
            zzcd zzcdVar = zzcfVar.zzf;
            if (zzcdVar != null) {
                jsonWriter.name("screen_info");
                jsonWriter.beginObject();
                Integer num2 = zzcdVar.zza;
                if (num2 != null) {
                    jsonWriter.name("width");
                    jsonWriter.value(num2);
                }
                Integer num3 = zzcdVar.zzb;
                if (num3 != null) {
                    jsonWriter.name("height");
                    jsonWriter.value(num3);
                }
                Double d10 = zzcdVar.zzc;
                if (d10 != null) {
                    jsonWriter.name("density");
                    jsonWriter.value(d10);
                }
                List<zzcc> list = zzcdVar.zzd;
                if (!list.isEmpty()) {
                    jsonWriter.name("screen_insets");
                    jsonWriter.beginArray();
                    for (zzcc zzccVar : list) {
                        jsonWriter.beginObject();
                        Integer num4 = zzccVar.zza;
                        if (num4 != null) {
                            jsonWriter.name("top");
                            jsonWriter.value(num4);
                        }
                        Integer num5 = zzccVar.zzb;
                        if (num5 != null) {
                            jsonWriter.name("left");
                            jsonWriter.value(num5);
                        }
                        Integer num6 = zzccVar.zzc;
                        if (num6 != null) {
                            jsonWriter.name("right");
                            jsonWriter.value(num6);
                        }
                        Integer num7 = zzccVar.zzd;
                        if (num7 != null) {
                            jsonWriter.name("bottom");
                            jsonWriter.value(num7);
                        }
                        jsonWriter.endObject();
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            zzbz zzbzVar = zzcfVar.zzg;
            if (zzbzVar != null) {
                jsonWriter.name("app_info");
                jsonWriter.beginObject();
                String str4 = zzbzVar.zza;
                if (str4 != null) {
                    jsonWriter.name(b9.h.V);
                    jsonWriter.value(str4);
                }
                String str5 = zzbzVar.zzb;
                if (str5 != null) {
                    jsonWriter.name("publisher_display_name");
                    jsonWriter.value(str5);
                }
                String str6 = zzbzVar.zzc;
                if (str6 != null) {
                    jsonWriter.name("version");
                    jsonWriter.value(str6);
                }
                jsonWriter.endObject();
            }
            zzce zzceVar = zzcfVar.zzh;
            if (zzceVar != null) {
                jsonWriter.name("sdk_info");
                jsonWriter.beginObject();
                String str7 = zzceVar.zza;
                if (str7 != null) {
                    jsonWriter.name("version");
                    jsonWriter.value(str7);
                }
                jsonWriter.endObject();
            }
            List<zzca> list2 = zzcfVar.zzi;
            if (!list2.isEmpty()) {
                jsonWriter.name("debug_params");
                jsonWriter.beginArray();
                for (zzca zzcaVar : list2) {
                    switch (zzcaVar.ordinal()) {
                        case 0:
                            jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                            break;
                        case 1:
                            jsonWriter.value("ALWAYS_SHOW");
                            break;
                        case 2:
                            jsonWriter.value("GEO_OVERRIDE_EEA");
                            break;
                        case 3:
                            jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                            break;
                        case 4:
                            jsonWriter.value("GEO_OVERRIDE_OTHER");
                            break;
                        case 5:
                            jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                            break;
                        case 6:
                            jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                            break;
                    }
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
            jsonWriter.close();
            outputStreamWriter.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                if (headerField != null) {
                    zzch zza = zzch.zza(new JsonReader(new StringReader(headerField)));
                    zza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                    return zza;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                bufferedReader.readLine();
                JsonReader jsonReader = new JsonReader(bufferedReader);
                zzch zza2 = zzch.zza(jsonReader);
                jsonReader.close();
                bufferedReader.close();
                return zza2;
            }
            throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
        } catch (SocketTimeoutException e8) {
            throw new zzg(4, "The server timed out.", e8);
        } catch (IOException e10) {
            throw new zzg(2, "Error making request.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, zzz zzzVar) {
        Objects.requireNonNull(onConsentInfoUpdateSuccessListener);
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
            @Override // java.lang.Runnable
            public final void run() {
                ConsentInformation.OnConsentInfoUpdateSuccessListener.this.onConsentInfoUpdateSuccess();
            }
        });
        if (zzzVar.zzb != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            this.zze.zzc();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Activity activity, ConsentRequestParameters consentRequestParameters, final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        try {
            ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
            if (consentDebugSettings == null || !consentDebugSettings.isTestDevice()) {
                String zza = zzci.zza(this.zza);
                Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zza + "\") to set this as a debug device.");
            }
            final zzz zza2 = new zzw(this.zzg, zzd(this.zzf.zzc(activity, consentRequestParameters))).zza();
            this.zzd.zzg(zza2.zza);
            this.zzd.zzi(zza2.zzb);
            this.zze.zzd(zza2.zzc);
            this.zzh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    zzu.this.zza(onConsentInfoUpdateSuccessListener, zza2);
                }
            });
        } catch (zzg e8) {
            this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzp
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentInformation.OnConsentInfoUpdateFailureListener.this.onConsentInfoUpdateFailure(e8.zza());
                }
            });
        } catch (RuntimeException e10) {
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e10))));
            this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzq
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentInformation.OnConsentInfoUpdateFailureListener.this.onConsentInfoUpdateFailure(zzgVar.zza());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(final Activity activity, final ConsentRequestParameters consentRequestParameters, final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                zzu.this.zzb(activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener);
            }
        });
    }
}
