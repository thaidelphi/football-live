package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.cc;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzey {

    /* renamed from: a  reason: collision with root package name */
    private final String f13502a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f13503b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f13504c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ y f13505d;

    public zzey(y yVar, String str, Bundle bundle) {
        this.f13505d = yVar;
        Preconditions.g("default_event_parameters");
        this.f13502a = "default_event_parameters";
        this.f13503b = new Bundle();
    }

    public final Bundle a() {
        char c10;
        if (this.f13504c == null) {
            String string = this.f13505d.j().getString(this.f13502a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString(cc.f16875q);
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c10 = 1;
                                }
                                c10 = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c10 = 0;
                                }
                                c10 = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c10 = 2;
                                }
                                c10 = 65535;
                            }
                            if (c10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c10 != 2) {
                                this.f13505d.f13220a.zzay().m().b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f13505d.f13220a.zzay().m().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f13504c = bundle;
                } catch (JSONException unused2) {
                    this.f13505d.f13220a.zzay().m().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f13504c == null) {
                this.f13504c = this.f13503b;
            }
        }
        return this.f13504c;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f13505d.j().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f13502a);
        } else {
            String str = this.f13502a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(cc.f16875q, str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f13505d.f13220a.zzay().m().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e8) {
                        this.f13505d.f13220a.zzay().m().b("Cannot serialize bundle value to SharedPreferences", e8);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f13504c = bundle;
    }
}
