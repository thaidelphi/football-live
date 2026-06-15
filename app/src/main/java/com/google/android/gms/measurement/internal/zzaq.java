package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaq extends y0 {

    /* renamed from: c  reason: collision with root package name */
    private long f13300c;

    /* renamed from: d  reason: collision with root package name */
    private String f13301d;

    /* renamed from: e  reason: collision with root package name */
    private AccountManager f13302e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f13303f;

    /* renamed from: g  reason: collision with root package name */
    private long f13304g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(zzfy zzfyVar) {
        super(zzfyVar);
    }

    @Override // com.google.android.gms.measurement.internal.y0
    protected final boolean e() {
        Calendar calendar = Calendar.getInstance();
        this.f13300c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f13301d = lowerCase + "-" + lowerCase2;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long j() {
        c();
        return this.f13304g;
    }

    public final long k() {
        f();
        return this.f13300c;
    }

    public final String l() {
        f();
        return this.f13301d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        c();
        this.f13303f = null;
        this.f13304g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n() {
        Account[] result;
        c();
        long a10 = this.f13220a.zzav().a();
        if (a10 - this.f13304g > 86400000) {
            this.f13303f = null;
        }
        Boolean bool = this.f13303f;
        if (bool == null) {
            if (androidx.core.content.a.a(this.f13220a.zzau(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f13220a.zzay().t().a("Permission error checking for dasher/unicorn accounts");
                this.f13304g = a10;
                this.f13303f = Boolean.FALSE;
                return false;
            }
            if (this.f13302e == null) {
                this.f13302e = AccountManager.get(this.f13220a.zzau());
            }
            try {
                result = this.f13302e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException | OperationCanceledException | IOException e8) {
                this.f13220a.zzay().o().b("Exception checking account types", e8);
            }
            if (result != null && result.length > 0) {
                this.f13303f = Boolean.TRUE;
                this.f13304g = a10;
                return true;
            }
            Account[] result2 = this.f13302e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f13303f = Boolean.TRUE;
                this.f13304g = a10;
                return true;
            }
            this.f13304g = a10;
            this.f13303f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
