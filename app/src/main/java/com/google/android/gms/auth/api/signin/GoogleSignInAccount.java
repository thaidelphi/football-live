package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.ug;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    @VisibleForTesting

    /* renamed from: n  reason: collision with root package name */
    public static Clock f11861n = DefaultClock.d();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f11862a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private String f11863b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private String f11864c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private String f11865d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private String f11866e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private Uri f11867f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    private String f11868g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    private long f11869h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    private String f11870i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    List<Scope> f11871j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    private String f11872k;
    @SafeParcelable.Field

    /* renamed from: l  reason: collision with root package name */
    private String f11873l;

    /* renamed from: m  reason: collision with root package name */
    private Set<Scope> f11874m = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param Uri uri, @SafeParcelable.Param String str5, @SafeParcelable.Param long j10, @SafeParcelable.Param String str6, @SafeParcelable.Param List<Scope> list, @SafeParcelable.Param String str7, @SafeParcelable.Param String str8) {
        this.f11862a = i10;
        this.f11863b = str;
        this.f11864c = str2;
        this.f11865d = str3;
        this.f11866e = str4;
        this.f11867f = uri;
        this.f11868g = str5;
        this.f11869h = j10;
        this.f11870i = str6;
        this.f11871j = list;
        this.f11872k = str7;
        this.f11873l = str8;
    }

    public static GoogleSignInAccount I0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), Preconditions.g(str7), new ArrayList((Collection) Preconditions.m(set)), str5, str6);
    }

    public static GoogleSignInAccount J0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount I0 = I0(jSONObject.optString(ug.f21009x), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        I0.f11868g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return I0;
    }

    public String C0() {
        return this.f11864c;
    }

    public Uri D0() {
        return this.f11867f;
    }

    @KeepForSdk
    public Set<Scope> G0() {
        HashSet hashSet = new HashSet(this.f11871j);
        hashSet.addAll(this.f11874m);
        return hashSet;
    }

    public String H0() {
        return this.f11868g;
    }

    public String X() {
        return this.f11866e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.f11870i.equals(this.f11870i) && googleSignInAccount.G0().equals(G0());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11870i.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + G0().hashCode();
    }

    public String n0() {
        return this.f11865d;
    }

    public String o0() {
        return this.f11873l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f11862a);
        SafeParcelWriter.r(parcel, 2, z0(), false);
        SafeParcelWriter.r(parcel, 3, C0(), false);
        SafeParcelWriter.r(parcel, 4, n0(), false);
        SafeParcelWriter.r(parcel, 5, X(), false);
        SafeParcelWriter.q(parcel, 6, D0(), i10, false);
        SafeParcelWriter.r(parcel, 7, H0(), false);
        SafeParcelWriter.n(parcel, 8, this.f11869h);
        SafeParcelWriter.r(parcel, 9, this.f11870i, false);
        SafeParcelWriter.v(parcel, 10, this.f11871j, false);
        SafeParcelWriter.r(parcel, 11, y0(), false);
        SafeParcelWriter.r(parcel, 12, o0(), false);
        SafeParcelWriter.b(parcel, a10);
    }

    public String y0() {
        return this.f11872k;
    }

    public Account z() {
        String str = this.f11865d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String z0() {
        return this.f11863b;
    }
}
