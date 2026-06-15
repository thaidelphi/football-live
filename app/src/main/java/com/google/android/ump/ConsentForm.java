package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface ConsentForm {

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(FormError formError);
    }

    void show(@RecentlyNonNull Activity activity, @RecentlyNonNull OnConsentFormDismissedListener onConsentFormDismissedListener);
}
