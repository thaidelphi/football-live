package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class FormError {

    /* renamed from: a  reason: collision with root package name */
    private final int f14776a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14777b;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i10, @RecentlyNonNull String str) {
        this.f14776a = i10;
        this.f14777b = str;
    }

    public int getErrorCode() {
        return this.f14776a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f14777b;
    }
}
