package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: l  reason: collision with root package name */
    public static final GoogleSignInOptions f11875l;

    /* renamed from: m  reason: collision with root package name */
    public static final GoogleSignInOptions f11876m;
    @VisibleForTesting

    /* renamed from: n  reason: collision with root package name */
    public static final Scope f11877n = new Scope("profile");
    @VisibleForTesting

    /* renamed from: o  reason: collision with root package name */
    public static final Scope f11878o = new Scope("email");
    @VisibleForTesting

    /* renamed from: p  reason: collision with root package name */
    public static final Scope f11879p = new Scope("openid");
    @VisibleForTesting

    /* renamed from: q  reason: collision with root package name */
    public static final Scope f11880q;
    @VisibleForTesting

    /* renamed from: r  reason: collision with root package name */
    public static final Scope f11881r;

    /* renamed from: s  reason: collision with root package name */
    private static Comparator<Scope> f11882s;
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f11883a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Scope> f11884b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private Account f11885c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private boolean f11886d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11887e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final boolean f11888f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    private String f11889g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    private String f11890h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<GoogleSignInOptionsExtensionParcelable> f11891i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    private String f11892j;

    /* renamed from: k  reason: collision with root package name */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f11893k;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Builder {

        /* renamed from: b  reason: collision with root package name */
        private boolean f11895b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f11896c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f11897d;

        /* renamed from: e  reason: collision with root package name */
        private String f11898e;

        /* renamed from: f  reason: collision with root package name */
        private Account f11899f;

        /* renamed from: g  reason: collision with root package name */
        private String f11900g;

        /* renamed from: i  reason: collision with root package name */
        private String f11902i;

        /* renamed from: a  reason: collision with root package name */
        private Set<Scope> f11894a = new HashSet();

        /* renamed from: h  reason: collision with root package name */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f11901h = new HashMap();

        public GoogleSignInOptions a() {
            if (this.f11894a.contains(GoogleSignInOptions.f11881r)) {
                Set<Scope> set = this.f11894a;
                Scope scope = GoogleSignInOptions.f11880q;
                if (set.contains(scope)) {
                    this.f11894a.remove(scope);
                }
            }
            if (this.f11897d && (this.f11899f == null || !this.f11894a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f11894a), this.f11899f, this.f11897d, this.f11895b, this.f11896c, this.f11898e, this.f11900g, this.f11901h, this.f11902i);
        }

        public Builder b() {
            this.f11894a.add(GoogleSignInOptions.f11879p);
            return this;
        }

        public Builder c() {
            this.f11894a.add(GoogleSignInOptions.f11877n);
            return this;
        }

        public Builder d(Scope scope, Scope... scopeArr) {
            this.f11894a.add(scope);
            this.f11894a.addAll(Arrays.asList(scopeArr));
            return this;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f11880q = scope;
        f11881r = new Scope("https://www.googleapis.com/auth/games");
        Builder builder = new Builder();
        builder.b();
        builder.c();
        f11875l = builder.a();
        Builder builder2 = new Builder();
        builder2.d(scope, new Scope[0]);
        f11876m = builder2.a();
        CREATOR = new zae();
        f11882s = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GoogleSignInOptions(@SafeParcelable.Param int i10, @SafeParcelable.Param ArrayList<Scope> arrayList, @SafeParcelable.Param Account account, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param boolean z12, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, @SafeParcelable.Param String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, G0(arrayList2), str3);
    }

    private static Map<Integer, GoogleSignInOptionsExtensionParcelable> G0(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.X()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    @KeepForSdk
    public boolean C0() {
        return this.f11886d;
    }

    @KeepForSdk
    public boolean D0() {
        return this.f11887e;
    }

    @KeepForSdk
    public ArrayList<GoogleSignInOptionsExtensionParcelable> X() {
        return this.f11891i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r1.equals(r4.z()) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f11891i     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f11891i     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f11884b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.o0()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f11884b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.o0()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f11885c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f11889g     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.y0()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f11889g     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.y0()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f11888f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.z0()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f11886d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.C0()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f11887e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.D0()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f11892j     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.n0()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f11884b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(arrayList2.get(i10).X());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.a(arrayList);
        hashAccumulator.a(this.f11885c);
        hashAccumulator.a(this.f11889g);
        hashAccumulator.c(this.f11888f);
        hashAccumulator.c(this.f11886d);
        hashAccumulator.c(this.f11887e);
        hashAccumulator.a(this.f11892j);
        return hashAccumulator.b();
    }

    @KeepForSdk
    public String n0() {
        return this.f11892j;
    }

    @KeepForSdk
    public ArrayList<Scope> o0() {
        return new ArrayList<>(this.f11884b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f11883a);
        SafeParcelWriter.v(parcel, 2, o0(), false);
        SafeParcelWriter.q(parcel, 3, z(), i10, false);
        SafeParcelWriter.c(parcel, 4, C0());
        SafeParcelWriter.c(parcel, 5, D0());
        SafeParcelWriter.c(parcel, 6, z0());
        SafeParcelWriter.r(parcel, 7, y0(), false);
        SafeParcelWriter.r(parcel, 8, this.f11890h, false);
        SafeParcelWriter.v(parcel, 9, X(), false);
        SafeParcelWriter.r(parcel, 10, n0(), false);
        SafeParcelWriter.b(parcel, a10);
    }

    @KeepForSdk
    public String y0() {
        return this.f11889g;
    }

    @KeepForSdk
    public Account z() {
        return this.f11885c;
    }

    @KeepForSdk
    public boolean z0() {
        return this.f11888f;
    }

    private GoogleSignInOptions(int i10, ArrayList<Scope> arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.f11883a = i10;
        this.f11884b = arrayList;
        this.f11885c = account;
        this.f11886d = z10;
        this.f11887e = z11;
        this.f11888f = z12;
        this.f11889g = str;
        this.f11890h = str2;
        this.f11891i = new ArrayList<>(map.values());
        this.f11893k = map;
        this.f11892j = str3;
    }
}
