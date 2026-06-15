package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@VisibleForTesting
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ClientSettings {

    /* renamed from: a  reason: collision with root package name */
    private final Account f12461a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Scope> f12462b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Scope> f12463c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Api<?>, zab> f12464d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12465e;

    /* renamed from: f  reason: collision with root package name */
    private final View f12466f;

    /* renamed from: g  reason: collision with root package name */
    private final String f12467g;

    /* renamed from: h  reason: collision with root package name */
    private final String f12468h;

    /* renamed from: i  reason: collision with root package name */
    private final SignInOptions f12469i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f12470j;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private Account f12471a;

        /* renamed from: b  reason: collision with root package name */
        private androidx.collection.b<Scope> f12472b;

        /* renamed from: c  reason: collision with root package name */
        private String f12473c;

        /* renamed from: d  reason: collision with root package name */
        private String f12474d;

        /* renamed from: e  reason: collision with root package name */
        private SignInOptions f12475e = SignInOptions.f13757j;

        @KeepForSdk
        public ClientSettings a() {
            return new ClientSettings(this.f12471a, this.f12472b, null, 0, null, this.f12473c, this.f12474d, this.f12475e, false);
        }

        @KeepForSdk
        public Builder b(String str) {
            this.f12473c = str;
            return this;
        }

        public final Builder c(Collection<Scope> collection) {
            if (this.f12472b == null) {
                this.f12472b = new androidx.collection.b<>();
            }
            this.f12472b.addAll(collection);
            return this;
        }

        public final Builder d(Account account) {
            this.f12471a = account;
            return this;
        }

        public final Builder e(String str) {
            this.f12474d = str;
            return this;
        }
    }

    public ClientSettings(Account account, Set<Scope> set, Map<Api<?>, zab> map, int i10, View view, String str, String str2, SignInOptions signInOptions, boolean z10) {
        this.f12461a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f12462b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f12464d = map;
        this.f12466f = view;
        this.f12465e = i10;
        this.f12467g = str;
        this.f12468h = str2;
        this.f12469i = signInOptions == null ? SignInOptions.f13757j : signInOptions;
        HashSet hashSet = new HashSet(emptySet);
        for (zab zabVar : map.values()) {
            hashSet.addAll(zabVar.f12576a);
        }
        this.f12463c = Collections.unmodifiableSet(hashSet);
    }

    @KeepForSdk
    public Account a() {
        return this.f12461a;
    }

    @KeepForSdk
    public Account b() {
        Account account = this.f12461a;
        return account != null ? account : new Account(BaseGmsClient.DEFAULT_ACCOUNT, "com.google");
    }

    @KeepForSdk
    public Set<Scope> c() {
        return this.f12463c;
    }

    @KeepForSdk
    public String d() {
        return this.f12467g;
    }

    @KeepForSdk
    public Set<Scope> e() {
        return this.f12462b;
    }

    public final SignInOptions f() {
        return this.f12469i;
    }

    public final Integer g() {
        return this.f12470j;
    }

    public final String h() {
        return this.f12468h;
    }

    public final Map<Api<?>, zab> i() {
        return this.f12464d;
    }

    public final void j(Integer num) {
        this.f12470j = num;
    }
}
