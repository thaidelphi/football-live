package c6;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
/* compiled from: FirebaseOptions.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final String f5564a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5565b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5566c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5567d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5568e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5569f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5570g;

    private k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.q(!Strings.a(str), "ApplicationId must be set.");
        this.f5565b = str;
        this.f5564a = str2;
        this.f5566c = str3;
        this.f5567d = str4;
        this.f5568e = str5;
        this.f5569f = str6;
        this.f5570g = str7;
    }

    public static k a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String a10 = stringResourceValueReader.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new k(a10, stringResourceValueReader.a("google_api_key"), stringResourceValueReader.a("firebase_database_url"), stringResourceValueReader.a("ga_trackingId"), stringResourceValueReader.a("gcm_defaultSenderId"), stringResourceValueReader.a("google_storage_bucket"), stringResourceValueReader.a("project_id"));
    }

    public String b() {
        return this.f5564a;
    }

    public String c() {
        return this.f5565b;
    }

    public String d() {
        return this.f5568e;
    }

    public String e() {
        return this.f5570g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            return Objects.a(this.f5565b, kVar.f5565b) && Objects.a(this.f5564a, kVar.f5564a) && Objects.a(this.f5566c, kVar.f5566c) && Objects.a(this.f5567d, kVar.f5567d) && Objects.a(this.f5568e, kVar.f5568e) && Objects.a(this.f5569f, kVar.f5569f) && Objects.a(this.f5570g, kVar.f5570g);
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(this.f5565b, this.f5564a, this.f5566c, this.f5567d, this.f5568e, this.f5569f, this.f5570g);
    }

    public String toString() {
        return Objects.c(this).a("applicationId", this.f5565b).a("apiKey", this.f5564a).a("databaseUrl", this.f5566c).a("gcmSenderId", this.f5568e).a("storageBucket", this.f5569f).a("projectId", this.f5570g).toString();
    }
}
